package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class bx1 {
    public static cx1 a(String str) {
        for (cx1 cx1Var : cx1.values()) {
            if (epx.f(cx1Var.b, str)) {
                return cx1Var;
            }
        }
        return cx1.d;
    }
}
