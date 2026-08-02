package xsna;

import com.vk.voip.api.id.CallId;
import xsna.ij20;

/* compiled from: VoipReportSuspiciousCallActivity.kt */
/* loaded from: classes7.dex */
public final class gww0 extends le6<s3q0> {
    public final /* synthetic */ CallId b;

    public gww0(CallId callId) {
        this.b = callId;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        ij20.a aVar = new ij20.a();
        aVar.c = "calls.deleteCallFromHistory";
        aVar.b("call_id", this.b.b);
        bz2.h(new ij20(aVar));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        return true;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 0;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "";
    }
}
