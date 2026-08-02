package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingInfo;
import xsna.klx0;

/* compiled from: WhiteboardDelegateImpl.kt */
/* loaded from: classes7.dex */
public final class llx0 implements klx0, ffq0 {
    public final xsw0 b;
    public final pvw0 c;
    public final io.reactivex.rxjava3.subjects.d<klx0.a> d = io.reactivex.rxjava3.subjects.d.O0(new klx0.a(null));

    public llx0(z3x0 z3x0Var, xsw0 xsw0Var, pvw0 pvw0Var) {
        this.b = xsw0Var;
        this.c = pvw0Var;
    }

    public final void a() {
        onUrlSharingStopped();
    }

    @Override // xsna.klx0
    public final io.reactivex.rxjava3.internal.operators.observable.z0 b() {
        io.reactivex.rxjava3.subjects.d<klx0.a> dVar = this.d;
        dVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.z0(dVar);
    }

    @Override // xsna.ffq0
    public final void onUrlSharingStarted(UrlSharingInfo urlSharingInfo) {
        String url = urlSharingInfo.getUrl();
        io.reactivex.rxjava3.subjects.d<klx0.a> dVar = this.d;
        klx0.a P0 = dVar.P0();
        if (!epx.f(url, P0 != null ? P0.a : null)) {
            com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
            CallMemberId f0 = cVar.f0();
            pvw0 pvw0Var = this.c;
            if (f0 != null) {
                CallMemberId f02 = cVar.f0();
                ParticipantId initiatorId = urlSharingInfo.getInitiatorId();
                if (epx.f(f02, initiatorId != null ? mnh0.E(initiatorId) : null)) {
                    pvw0Var.t();
                }
            }
            pvw0Var.k0();
        }
        dVar.onNext(new klx0.a(urlSharingInfo.getUrl()));
    }

    @Override // xsna.ffq0
    public final void onUrlSharingStopped() {
        this.d.onNext(new klx0.a(null));
    }
}
