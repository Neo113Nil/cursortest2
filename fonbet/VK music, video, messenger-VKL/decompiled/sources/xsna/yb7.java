package xsna;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: BitmapEncoder.java */
/* loaded from: classes12.dex */
public final class yb7 implements pag0<Bitmap> {
    public static final ht80<Integer> c = ht80.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final ht80<Bitmap.CompressFormat> d = new ht80<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, ht80.e);

    @Nullable
    public final cl3 b;

    public yb7(@NonNull cl3 cl3Var) {
        this.b = cl3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    @Override // xsna.yip
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(@NonNull Object obj, @NonNull File file, @NonNull au80 au80Var) {
        boolean z;
        Bitmap bitmap = (Bitmap) ((hag0) obj).get();
        ht80<Bitmap.CompressFormat> ht80Var = d;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) au80Var.c(ht80Var);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = w000.a;
        SystemClock.elapsedRealtimeNanos();
        int intValue = ((Integer) au80Var.c(c)).intValue();
        OutputStream outputStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            cl3 cl3Var = this.b;
            if (cl3Var != null) {
                try {
                    outputStream = new zm8(fileOutputStream, cl3Var);
                } catch (IOException unused) {
                    outputStream = fileOutputStream;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    z = false;
                    if (Log.isLoggable("BitmapEncoder", 2)) {
                    }
                    return z;
                } catch (Throwable th) {
                    th = th;
                    outputStream = fileOutputStream;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } else {
                outputStream = fileOutputStream;
            }
            bitmap.compress(compressFormat, intValue, outputStream);
            outputStream.close();
            try {
                outputStream.close();
            } catch (IOException unused4) {
            }
            z = true;
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Objects.toString(compressFormat);
            s2r0.c(bitmap);
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(au80Var.c(ht80Var));
            bitmap.hasAlpha();
        }
        return z;
    }

    @Override // xsna.pag0
    @NonNull
    public final EncodeStrategy j(@NonNull au80 au80Var) {
        return EncodeStrategy.TRANSFORMED;
    }
}
