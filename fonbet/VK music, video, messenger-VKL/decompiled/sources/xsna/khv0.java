package xsna;

import android.content.Context;

/* compiled from: VkSberVerificationActivityDeps.kt */
/* loaded from: classes4.dex */
public final class khv0 implements ihv0 {
    public final bpn0 a = new bpn0(new fyd0(this, 28));
    public final bpn0 b;

    public khv0(Context context) {
        this.b = new bpn0(new z5f(context, 3));
    }

    @Override // xsna.ihv0
    public final jhv0 a() {
        return (jhv0) this.a.getValue();
    }

    @Override // xsna.ihv0
    public final m2h0 x() {
        return (m2h0) this.b.getValue();
    }

    @Override // xsna.w0m
    public final void onDestroy() {
    }
}
