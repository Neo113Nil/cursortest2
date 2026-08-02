package xsna;

import com.vk.api.sdk.a;

/* compiled from: DialogsPromoLinkReadApiCmd.kt */
/* loaded from: classes2.dex */
public final class gvm extends nx2<s3q0> {
    public final String b;

    public gvm(String str) {
        this.b = str;
    }

    @Override // xsna.nx2
    public final s3q0 f(l7r0 l7r0Var) {
        a.C0374a c0374a = new a.C0374a();
        c0374a.c = "messages.setFeatureOnboardingStatus";
        c0374a.d = l7r0Var.a.g;
        c0374a.f.put("feature_onboarding_id", this.b);
        c0374a.f.put("status", "viewed");
        l7r0Var.f(new com.vk.api.sdk.a(c0374a));
        return s3q0.a;
    }
}
