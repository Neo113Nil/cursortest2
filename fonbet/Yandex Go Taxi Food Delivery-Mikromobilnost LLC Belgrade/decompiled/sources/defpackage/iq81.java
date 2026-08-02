package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class iq81 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(String str) {
        List W;
        int i;
        int i2;
        W = evu0.W("8.0.0-beta.1", new String[]{Extension.DOT_CHAR}, (r2 & 4) != 0 ? 0 : 2);
        int i3 = 0;
        String[] strArr = (String[]) W.toArray(new String[0]);
        if (strArr.length > 0) {
            String str2 = strArr[0];
            int i4 = cs71.b;
            if (str2 != null) {
                try {
                    i = Integer.parseInt(str2);
                } catch (NumberFormatException unused) {
                }
                if (strArr.length > 1) {
                    String str3 = strArr[1];
                    int i5 = cs71.b;
                    if (str3 != null) {
                        try {
                            i2 = Integer.parseInt(str3);
                        } catch (NumberFormatException unused2) {
                        }
                        if (strArr.length > 2) {
                            String str4 = strArr[2];
                            int i6 = cs71.b;
                            if (str4 != null) {
                                try {
                                    i3 = Integer.parseInt(str4);
                                } catch (NumberFormatException unused3) {
                                }
                            }
                        }
                        return String.format(Locale.US, str, Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 3));
                    }
                }
                i2 = 0;
                if (strArr.length > 2) {
                }
                return String.format(Locale.US, str, Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 3));
            }
        }
        i = 0;
        if (strArr.length > 1) {
        }
        i2 = 0;
        if (strArr.length > 2) {
        }
        return String.format(Locale.US, str, Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 3));
    }
}
