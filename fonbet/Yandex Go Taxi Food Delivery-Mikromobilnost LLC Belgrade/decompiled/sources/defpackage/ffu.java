package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.heifwriter.HeifEncoder;
import androidx.heifwriter.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.util.UUID;
import java.util.concurrent.TimeoutException;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes10.dex */
public final class ffu implements n7s {
    public static void c(Bitmap bitmap, int i, int i2, int i3, String str, int i4) {
        boolean z;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        qgb1.b("src width = " + width);
        qgb1.b("src height = " + height);
        float b = k7b1.b(bitmap, i, i2);
        qgb1.b("scale = " + b);
        float f = width / b;
        float f2 = height / b;
        qgb1.b("dst width = " + f);
        qgb1.b("dst height = " + f2);
        Bitmap h = k7b1.h(Bitmap.createScaledBitmap(bitmap, (int) f, (int) f2, true), i3);
        int width2 = h.getWidth();
        int height2 = h.getHeight();
        if (width2 <= 0 || height2 <= 0) {
            ny61.g(oyr.h(width2, height2, "Invalid image size: ", RemoteBioParameters.X));
            return;
        }
        if (i4 < 0 || i4 > 100) {
            ny61.g(oyr.i(i4, "Invalid quality: "));
            return;
        }
        d dVar = new d(str, width2, height2, i4);
        if (dVar.D) {
            ny61.r("Already started");
            return;
        }
        dVar.D = true;
        dVar.z.start();
        if (!dVar.D) {
            ny61.r("Already started");
            return;
        }
        int i5 = dVar.a;
        if (i5 != 2) {
            ny61.r(oyr.i(i5, "Not valid in input mode "));
            return;
        }
        synchronized (dVar) {
            try {
                HeifEncoder heifEncoder = dVar.z;
                if (heifEncoder != null) {
                    heifEncoder.addBitmap(h);
                }
            } finally {
            }
        }
        if (!dVar.D) {
            ny61.r("Already started");
            return;
        }
        synchronized (dVar) {
            try {
                HeifEncoder heifEncoder2 = dVar.z;
                if (heifEncoder2 != null) {
                    heifEncoder2.stopAsync();
                }
            } finally {
            }
        }
        wvb1 wvb1Var = dVar.x;
        synchronized (wvb1Var) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = 5000;
            while (true) {
                z = wvb1Var.a;
                if (z || j <= 0) {
                    break;
                }
                try {
                    wvb1Var.wait(j);
                } catch (InterruptedException unused) {
                }
                j -= System.currentTimeMillis() - currentTimeMillis;
            }
            if (!z) {
                wvb1Var.a = true;
                wvb1Var.b = new TimeoutException("timed out waiting for result");
            }
            Exception exc = (Exception) wvb1Var.b;
            if (exc != null) {
                throw exc;
            }
        }
        dVar.c();
        dVar.a();
        dVar.close();
    }

    @Override // defpackage.n7s
    public final void a(Context context, byte[] bArr, ByteArrayOutputStream byteArrayOutputStream, int i, int i2, int i3, int i4, boolean z, int i5) {
        File file = new File(context.getCacheDir(), UUID.randomUUID().toString());
        String absolutePath = file.getAbsolutePath();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i5;
        c(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options), i, i2, i4, absolutePath, i3);
        byteArrayOutputStream.write(g3r.c(file));
    }

    @Override // defpackage.n7s
    public final void b(Context context, String str, OutputStream outputStream, int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        File file = new File(context.getCacheDir(), UUID.randomUUID().toString());
        String absolutePath = file.getAbsolutePath();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i5;
        c(BitmapFactory.decodeFile(str, options), i, i2, i4, absolutePath, i3);
        outputStream.write(g3r.c(file));
    }
}
