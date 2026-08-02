package yads;

import java.util.Arrays;
import java.util.Locale;
import xsna.drm0;

/* loaded from: classes10.dex */
public final class px2 {
    public final dw1 a;

    public /* synthetic */ px2() {
        this(new dw1());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        int i;
        int i2;
        this.a.getClass();
        int i3 = 0;
        String[] strArr = (String[]) drm0.c0("7.18.6", new String[]{"."}, 0, 6).toArray(new String[0]);
        if (strArr.length > 0) {
            String str2 = strArr[0];
            int i4 = tb.b;
            if (str2 != null) {
                try {
                    i = Integer.parseInt(str2);
                } catch (NumberFormatException unused) {
                }
                if (strArr.length > 1) {
                    String str3 = strArr[1];
                    int i5 = tb.b;
                    if (str3 != null) {
                        try {
                            i2 = Integer.parseInt(str3);
                        } catch (NumberFormatException unused2) {
                        }
                        if (strArr.length > 2) {
                            String str4 = strArr[2];
                            int i6 = tb.b;
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

    public px2(dw1 dw1Var) {
        this.a = dw1Var;
    }
}
