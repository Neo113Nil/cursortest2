package xsna;

import com.vk.superapp.vkpay.checkout.feature.verification.PayVerificationInfo;

/* compiled from: BasePinPresenter.kt */
/* loaded from: classes6.dex */
public abstract class ek6 implements pla0 {
    public final jrz b;
    public final PayVerificationInfo c;
    public final StringBuilder d = new StringBuilder();

    /* JADX WARN: Multi-variable type inference failed */
    public ek6(rla0 rla0Var, PayVerificationInfo payVerificationInfo) {
        this.b = (jrz) rla0Var;
        this.c = payVerificationInfo;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [xsna.jrz, xsna.rla0] */
    @Override // xsna.pla0
    public final void C(boolean z) {
        if (z) {
            a();
        } else {
            StringBuilder sb = this.d;
            if (drm0.H(sb) >= 0) {
                sb.deleteCharAt(drm0.H(sb));
            }
            this.b.z5();
        }
        if (this.c.b) {
            a();
            e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.jrz, xsna.rla0] */
    public final void a() {
        this.d.setLength(0);
        this.b.Ga();
    }

    public abstract void c();

    public void e() {
        this.c.b = false;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [xsna.jrz, xsna.rla0] */
    @Override // xsna.pla0
    public final void s(String str) {
        StringBuilder sb = this.d;
        if (sb.length() >= 4) {
            return;
        }
        sb.append(str);
        this.b.db();
        if (sb.length() == 4) {
            c();
        }
        if (this.c.b) {
            e();
        }
    }
}
