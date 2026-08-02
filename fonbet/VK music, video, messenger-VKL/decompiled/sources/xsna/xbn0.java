package xsna;

import com.vk.superapp.api.dto.widgets.actions.WebSubscribeExtra;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class xbn0 implements izs {
    public final /* synthetic */ WebSubscribeExtra b;
    public final /* synthetic */ WebSubscribeExtra.MemberStatus c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ acn0 e;
    public final /* synthetic */ ien0 f;

    public /* synthetic */ xbn0(WebSubscribeExtra webSubscribeExtra, WebSubscribeExtra.MemberStatus memberStatus, boolean z, acn0 acn0Var, ien0 ien0Var) {
        this.b = webSubscribeExtra;
        this.c = memberStatus;
        this.d = z;
        this.e = acn0Var;
        this.f = ien0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        WebSubscribeExtra webSubscribeExtra = this.b;
        webSubscribeExtra.e = this.c;
        webSubscribeExtra.d = this.d;
        this.e.g6(this.f.i());
        i0q0.d(500L, new b3m((Throwable) obj, 7));
        return s3q0.a;
    }
}
