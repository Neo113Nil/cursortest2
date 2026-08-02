package yads;

import com.yandex.div.core.DivKit;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class nu1 extends xu1 {
    public final boolean a = false;
    public final te3 b;

    public nu1(te3 te3Var) {
        this.b = te3Var;
    }

    public final void a(wu1 wu1Var) {
        try {
            te3 te3Var = this.b;
            String versionName = DivKit.Companion.getVersionName();
            te3Var.getClass();
            se3 a = te3.a(versionName);
            this.b.getClass();
            se3 a2 = te3.a("32.18.1");
            Integer valueOf = a2 != null ? Integer.valueOf(a2.b) : null;
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                if (a == null || !(this.a || a.b == intValue)) {
                    String format = String.format("Unsupported DivKit major version. Expected: %s. Actual: %s", Arrays.copyOf(new Object[]{valueOf, a != null ? Integer.valueOf(a.b) : null}, 2));
                    xb1 xb1Var = new xb1(format, format);
                    wu1Var.getClass();
                    throw xb1Var;
                }
            }
        } catch (NoClassDefFoundError unused) {
            String format2 = String.format("DivKit is unavailable. Please check your buildscripts for exclusion rules for 'com.yandex.div:div'", Arrays.copyOf(new Object[0], 0));
            xb1 xb1Var2 = new xb1(format2, format2);
            wu1Var.getClass();
            throw xb1Var2;
        }
    }
}
