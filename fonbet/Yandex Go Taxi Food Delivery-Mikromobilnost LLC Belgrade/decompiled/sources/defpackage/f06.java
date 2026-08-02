package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes10.dex */
public class f06 implements vtj0 {
    public static final ce70 b = ce70.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final ce70 c = new ce70("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, ce70.e);
    public final g63 a;

    @Deprecated
    public f06() {
        this.a = null;
    }

    @Override // defpackage.vtj0
    public final EncodeStrategy c(mg70 mg70Var) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    @Override // defpackage.wyn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(Object obj, File file, mg70 mg70Var) {
        boolean z;
        Bitmap bitmap = (Bitmap) ((otj0) obj).get();
        ce70 ce70Var = c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) mg70Var.c(ce70Var);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = vfz.a;
        SystemClock.elapsedRealtimeNanos();
        int intValue = ((Integer) mg70Var.c(b)).intValue();
        OutputStream outputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                g63 g63Var = this.a;
                if (g63Var != null) {
                    try {
                        outputStream = new id4(fileOutputStream, g63Var);
                    } catch (IOException unused) {
                        outputStream = fileOutputStream;
                        Log.isLoggable("BitmapEncoder", 3);
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
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Objects.toString(compressFormat);
                pw21.f(bitmap);
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(mg70Var.c(ce70Var));
                bitmap.hasAlpha();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public f06(g63 g63Var) {
        this.a = g63Var;
    }
}
