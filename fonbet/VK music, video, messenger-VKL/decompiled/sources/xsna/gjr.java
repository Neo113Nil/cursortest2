package xsna;

/* compiled from: FirebasePerfApplicationInfoValidator.java */
/* loaded from: classes13.dex */
public final class gjr extends xv90 {
    public static final ra2 b = ra2.d();
    public final com.google.firebase.perf.v1.c a;

    public gjr(com.google.firebase.perf.v1.c cVar) {
        this.a = cVar;
    }

    @Override // xsna.xv90
    public final boolean a() {
        ra2 ra2Var = b;
        com.google.firebase.perf.v1.c cVar = this.a;
        if (cVar == null) {
            ra2Var.h();
        } else if (!cVar.hasGoogleAppId()) {
            ra2Var.h();
        } else if (!cVar.p()) {
            ra2Var.h();
        } else if (!cVar.q()) {
            ra2Var.h();
        } else {
            if (!cVar.o()) {
                return true;
            }
            if (!cVar.m().h()) {
                ra2Var.h();
            } else {
                if (cVar.m().m()) {
                    return true;
                }
                ra2Var.h();
            }
        }
        ra2Var.h();
        return false;
    }
}
