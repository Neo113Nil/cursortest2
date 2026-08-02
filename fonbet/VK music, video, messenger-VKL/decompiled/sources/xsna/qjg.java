package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.p000authapi.zbaq;

/* compiled from: CommonExt.kt */
/* loaded from: classes.dex */
public final class qjg {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static byte[] b(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b = (byte) ((bArr[i] << 1) & 254);
            bArr2[i] = b;
            if (i < 15) {
                bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    @NonNull
    public static zbaq c(@NonNull Context context) {
        exc0.i(context);
        return new zbaq(context, new trz0());
    }

    public static Object d(Object obj, String str) {
        try {
            return Class.forName(str).getDeclaredMethod("getNoop", null).invoke(null, null);
        } catch (Exception unused) {
            return obj;
        }
    }

    public static final boolean e(Boolean bool) {
        return epx.f(bool, Boolean.TRUE);
    }
}
