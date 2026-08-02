package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.vk.core.apps.BuildInfo;
import com.vk.core.files.ExternalDirType;
import com.vk.core.files.a;
import com.vk.log.L;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import xsna.c63;

/* compiled from: ScreenshotMarker.kt */
/* loaded from: classes5.dex */
public final class feh0 {
    public static Context a;
    public static cvk b;
    public static zdh0 c;
    public static kg90 d;
    public static String e;
    public static volatile long f;
    public static volatile long g;
    public static final io.reactivex.rxjava3.disposables.b h = new io.reactivex.rxjava3.disposables.b();
    public static final a i = new a();

    /* compiled from: ScreenshotMarker.kt */
    public static final class a extends c63.b {
        @Override // xsna.c63.b
        public final void u() {
            feh0.c("came to background");
            feh0.g = System.currentTimeMillis();
        }

        @Override // xsna.c63.b
        public final void x(Activity activity) {
            feh0.c("came to foreground");
            feh0.f = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (xsna.anj.a(r0, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Uri uri) {
        String path = uri.getPath();
        boolean z = false;
        if (!gz80.a(30)) {
            Context context = a;
            if (context == null) {
                context = null;
            }
        }
        if (path != null) {
            File file = new File(path);
            if (file.exists()) {
                long lastModified = file.lastModified();
                c("file creation dt = ".concat(f(lastModified)));
                c("background dt = " + f(g) + " foreground dt = " + f(f));
                c("background ts = " + g + " foreground ts = " + f);
                if (g == 0) {
                    if (lastModified > f) {
                        z = true;
                    }
                } else if (g <= f) {
                    long j = g;
                    if (lastModified <= f && j <= lastModified) {
                        z = true;
                    }
                    z = !z;
                }
            } else {
                c("file doesn't exist");
            }
            c("screenshot should be created : " + z);
            return z;
        }
        return false;
    }

    public static void b(Context context, cvk cvkVar, ExecutorService executorService) {
        e = context.getApplicationContext().getPackageName();
        g = System.currentTimeMillis();
        c("initialization; background ts = " + g + " background dt = " + f(g));
        a = context.getApplicationContext();
        b = cvkVar;
        c = new zdh0(executorService, context.getApplicationContext());
        d = new kg90(context.getApplicationContext());
    }

    public static void c(String str) {
        StringBuilder sb = new StringBuilder("ScreenshotMarker in ");
        String str2 = e;
        if (str2 == null) {
            str2 = null;
        }
        L.e(tdj.a(sb, str2, " => ", str));
    }

    public static void d(Uri uri, Paint paint) {
        String path;
        BitmapDrawable bitmapDrawable;
        OutputStream fileOutputStream;
        Bitmap copy;
        if (!a(uri) || (path = uri.getPath()) == null) {
            return;
        }
        Context context = a;
        if (context == null) {
            context = null;
        }
        String uri2 = uri.toString();
        cvk cvkVar = b;
        if (cvkVar == null) {
            cvkVar = null;
        }
        cvkVar.getClass();
        String str = BuildInfo.d;
        String str2 = "Version code " + BuildInfo.e + '(' + str + ')';
        Bitmap decodeFile = BitmapFactory.decodeFile(uri2);
        if (decodeFile == null || (copy = decodeFile.copy(Bitmap.Config.ARGB_8888, true)) == null) {
            bitmapDrawable = null;
        } else {
            new Canvas(copy).drawText(str2, 30.0f, paint.getTextSize(), paint);
            bitmapDrawable = new BitmapDrawable(context.getResources(), copy);
        }
        if (bitmapDrawable == null) {
            return;
        }
        Context context2 = a;
        Context context3 = context2 != null ? context2 : null;
        Bitmap bitmap = bitmapDrawable.getBitmap();
        File file = new File(path);
        try {
            if (gz80.a(30)) {
                String name = file.getName();
                seq seqVar = com.vk.core.files.a.b;
                Context context4 = e43.a;
                ExternalDirType externalDirType = ExternalDirType.IMAGES;
                seqVar.getClass();
                fileOutputStream = a.c.c(context3, seq.c(context4, name, externalDirType));
                if (fileOutputStream == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                fileOutputStream = new FileOutputStream(file);
            }
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                s3q0 s3q0Var = s3q0.a;
                fileOutputStream.close();
            } finally {
            }
        } catch (Exception e2) {
            com.vk.metrics.eventtracking.b.a.q(e2);
        }
    }

    public static void e() {
        zdh0 zdh0Var = c;
        if (zdh0Var == null) {
            zdh0Var = null;
        }
        int i2 = 14;
        h.b(zdh0Var.c().a0(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new hu50(new n1g0(2), i2), new eeh0(new ye40(i2), 0)));
        c63 c63Var = c63.a;
        c63.a(i);
    }

    public static String f(long j) {
        return new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(j));
    }
}
