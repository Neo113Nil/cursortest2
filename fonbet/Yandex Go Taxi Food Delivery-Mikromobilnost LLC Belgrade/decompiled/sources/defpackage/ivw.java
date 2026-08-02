package defpackage;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import java.util.Locale;

/* loaded from: classes10.dex */
public class ivw {
    public final LargeJpegImageQuirk a = (LargeJpegImageQuirk) tbj.a.b(LargeJpegImageQuirk.class);

    public final int a(byte[] bArr) {
        int i;
        byte b;
        if (this.a == null || !(("Samsung".equalsIgnoreCase(Build.BRAND) && LargeJpegImageQuirk.a.contains(Build.MODEL.toUpperCase(Locale.US))) || LargeJpegImageQuirk.e() || bArr.length > 10000000)) {
            return bArr.length;
        }
        int i2 = 2;
        while (true) {
            if (i2 + 4 > bArr.length || (b = bArr[i2]) != -1) {
                break;
            }
            int i3 = i2 + 2;
            int i4 = ((bArr[i3] & 255) << 8) | (bArr[i2 + 3] & 255);
            if (b == -1 && bArr[i2 + 1] == -38) {
                while (true) {
                    i = i3 + 2;
                    if (i <= bArr.length) {
                        if (bArr[i3] == -1 && bArr[i3 + 1] == -39) {
                            break;
                        }
                        i3++;
                    } else {
                        break;
                    }
                }
            } else {
                i2 += i4 + 2;
            }
        }
        i = -1;
        return i != -1 ? i : bArr.length;
    }
}
