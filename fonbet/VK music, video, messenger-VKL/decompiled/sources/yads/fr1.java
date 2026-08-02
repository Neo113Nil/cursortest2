package yads;

import xsna.drm0;

/* loaded from: classes10.dex */
public final class fr1 {
    public final te3 a;

    public fr1(te3 te3Var) {
        this.a = te3Var;
    }

    public final boolean a(String str, String str2) {
        if (str2 == null || drm0.N(str2)) {
            return true;
        }
        this.a.getClass();
        se3 a = te3.a(str);
        if (a == null) {
            return true;
        }
        this.a.getClass();
        se3 a2 = te3.a(str2);
        return a2 == null || a.compareTo(a2) >= 0;
    }
}
