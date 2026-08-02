package defpackage;

import com.yandex.go.address.address_map_picker.analytics.ClarifyAnalytics$ClarifyCloseReason;

/* loaded from: classes12.dex */
public final class d21 implements sy60 {
    public final /* synthetic */ e21 a;

    public d21(e21 e21Var) {
        this.a = e21Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        e21 e21Var = this.a;
        e21Var.J.b(ClarifyAnalytics$ClarifyCloseReason.Back);
        if (e21Var.H.a() != null && (!r0.equals(f11.a))) {
            e21Var.M.b();
        }
        e21Var.r(new qu(9));
    }
}
