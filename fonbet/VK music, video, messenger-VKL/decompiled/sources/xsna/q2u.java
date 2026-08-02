package xsna;

import xsna.fcw;

/* compiled from: GlobalUsersSearchRepository.kt */
/* loaded from: classes2.dex */
public final class q2u implements fcw {
    public final a1w a;

    public q2u(a1w a1wVar) {
        this.a = a1wVar;
    }

    @Override // xsna.fcw
    public final io.reactivex.rxjava3.core.x<gcw> a(fcw.a aVar, Object obj) {
        return this.a.C(obj, new tt90(aVar.a, 30, aVar.c, aVar.d)).l(new e40(new p2u(0), 15));
    }
}
