package xsna;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: TiffUtil.kt */
/* loaded from: classes12.dex */
public final class ato0 {
    public static final ato0 a = new ato0();
    public static final Class<?> b = ato0.class;

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int a(InputStream inputStream, int i) throws IOException {
        boolean z;
        int r;
        int i2;
        int i3;
        int i4;
        int i5;
        a.getClass();
        if (i > 8) {
            int r2 = sdi.r(inputStream, 4, false);
            Class<?> cls = b;
            if (r2 == 1229531648 || r2 == 1296891946) {
                z = r2 == 1229531648;
                r = sdi.r(inputStream, 4, z);
                i2 = i - 8;
                if (r < 8 || r - 8 > i2) {
                    ahq.a(cls, "Invalid offset");
                    i2 = 0;
                }
                i3 = r - 8;
                if (i2 != 0 && i3 <= i2) {
                    inputStream.skip(i3);
                    i4 = i2 - i3;
                    if (i4 >= 14) {
                        int r3 = sdi.r(inputStream, 2, z);
                        int i6 = i4 - 2;
                        while (true) {
                            int i7 = r3 - 1;
                            if (r3 <= 0 || i6 < 12) {
                                break;
                            }
                            i5 = i6 - 2;
                            if (sdi.r(inputStream, 2, z) == 274) {
                                break;
                            }
                            inputStream.skip(10L);
                            i6 -= 12;
                            r3 = i7;
                        }
                    }
                    i5 = 0;
                    if (i5 >= 10 && sdi.r(inputStream, 2, z) == 3 && sdi.r(inputStream, 4, z) == 1) {
                        return sdi.r(inputStream, 2, z);
                    }
                }
                return 0;
            }
            ahq.a(cls, "Invalid TIFF header");
        }
        i2 = 0;
        z = false;
        r = 0;
        i3 = r - 8;
        if (i2 != 0) {
            inputStream.skip(i3);
            i4 = i2 - i3;
            if (i4 >= 14) {
            }
            i5 = 0;
            if (i5 >= 10) {
                return sdi.r(inputStream, 2, z);
            }
        }
        return 0;
    }
}
