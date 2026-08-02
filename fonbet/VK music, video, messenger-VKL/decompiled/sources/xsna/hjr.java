package xsna;

/* compiled from: FirebasePerfGaugeMetricValidator.java */
/* loaded from: classes13.dex */
public final class hjr extends xv90 {
    public final com.google.firebase.perf.v1.f a;

    public hjr(com.google.firebase.perf.v1.f fVar) {
        this.a = fVar;
    }

    @Override // xsna.xv90
    public final boolean a() {
        com.google.firebase.perf.v1.f fVar = this.a;
        if (!fVar.hasSessionId()) {
            return false;
        }
        if (fVar.m() > 0 || fVar.h() > 0) {
            return true;
        }
        return fVar.p() && fVar.o().h();
    }
}
