package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.jv60;
import xsna.qz60;

/* compiled from: NewsfeedPatchValidator.kt */
/* loaded from: classes4.dex */
public final class lv60 {
    public final boolean a(qz60 qz60Var, jv60 jv60Var) {
        ur60 ur60Var = qz60Var.b;
        pz60 pz60Var = qz60Var.g;
        qz60.a aVar = qz60Var.h;
        if (jv60Var instanceof kv60) {
            return rr60.a(ur60Var, ((kv60) jv60Var).a);
        }
        if (jv60Var instanceof jv60.a.C3147a) {
            if (aVar.d == ((jv60.a.C3147a) jv60Var).a) {
                return false;
            }
        } else if (jv60Var instanceof jv60.a.e) {
            if (epx.f(aVar.b, ((jv60.a.e) jv60Var).a)) {
                return false;
            }
        } else {
            if (jv60Var instanceof jv60.a.b) {
                return true;
            }
            if (jv60Var instanceof jv60.a.c) {
                if (aVar.a.indexOfKey(((jv60.a.c) jv60Var).a) < 0) {
                    return false;
                }
            } else if (jv60Var instanceof jv60.a.d) {
                jv60.a.d dVar = (jv60.a.d) jv60Var;
                if (epx.f(aVar.a.get(dVar.a), dVar.b)) {
                    return false;
                }
            } else if (jv60Var instanceof jv60.c.a) {
                if (ur60Var.b.a.isEmpty()) {
                    sq60 sq60Var = ur60Var.b;
                    if (!sq60Var.d && !sq60Var.e && !sq60Var.f && ur60Var.d == null && qz60Var.c == ((jv60.c.a) jv60Var).a.b) {
                        return false;
                    }
                }
            } else if (jv60Var instanceof jv60.c.b) {
                if (epx.f(qz60Var.d, ((jv60.c.b) jv60Var).a)) {
                    return false;
                }
            } else if (jv60Var instanceof jv60.d.a) {
                if (!pz60Var.b || epx.f(pz60Var.a, ((jv60.d.a) jv60Var).a)) {
                    return false;
                }
            } else if (jv60Var instanceof jv60.d.b) {
                if (epx.f(pz60Var.a, ((jv60.d.b) jv60Var).a) && !pz60Var.b) {
                    return false;
                }
            } else if (jv60Var.equals(jv60.d.c.a)) {
                if (pz60Var.a == null && pz60Var.b) {
                    return false;
                }
            } else if (jv60Var instanceof jv60.e.a) {
                if (epx.f(qz60Var.f, ((jv60.e.a) jv60Var).a)) {
                    return false;
                }
            } else {
                if (!(jv60Var instanceof jv60.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (qz60Var.i == null) {
                    return false;
                }
            }
        }
        return true;
    }
}
