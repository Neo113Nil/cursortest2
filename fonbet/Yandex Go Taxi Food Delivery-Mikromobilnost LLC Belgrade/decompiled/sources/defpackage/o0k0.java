package defpackage;

import com.yandex.go.inapp_calls.api.navigation.ResumeInAppCallSource;

/* loaded from: classes14.dex */
public final class o0k0 extends h55 {
    public final /* synthetic */ int D;
    public final yvf0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0k0(yvf0 yvf0Var, int i) {
        super(null);
        this.D = i;
        this.E = yvf0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        switch (this.D) {
            case 0:
                A((m950) this.E.get(), (ResumeInAppCallSource) obj, new ikv(this, 1));
                break;
            default:
                A((m950) this.E.get(), (npu0) obj, new yio0(14, this));
                break;
        }
    }
}
