package defpackage;

import androidx.compose.runtime.f;

/* loaded from: classes11.dex */
public abstract class hhb1 {
    public static final Object a(mzz mzzVar, xzt xztVar) {
        tc7 tc7Var = (tc7) mzzVar.c(xztVar);
        if (tc7Var != null) {
            if (System.currentTimeMillis() - tc7Var.a < 3600000) {
                return tc7Var.b;
            }
            mzzVar.e(xztVar);
        }
        return null;
    }

    public static final void b(mzz mzzVar, xzt xztVar, iqd iqdVar) {
    }

    public static final m3u0 c(oip0 oip0Var, fid fidVar) {
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (Q == did.a) {
            Q = f.d(new is6(oip0Var, 2));
            btsVar.o0(Q);
        }
        return (m3u0) Q;
    }

    public static String d(String str) {
        if (str.length() == 0) {
            return String.valueOf('/');
        }
        if (gvu0.x0(str) == '/') {
            return str;
        }
        return str + '/';
    }
}
