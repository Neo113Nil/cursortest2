package xsna;

import xsna.tfw0;

/* compiled from: VoipCallAuthProviderImplDependencies.kt */
/* loaded from: classes7.dex */
public final class ufw0 implements tfw0.d {
    public final tfw0 a;
    public final bpn0 b = new bpn0(new vqe0(15));
    public final bpn0 c = new bpn0(new ghn0(this, 21));
    public final bpn0 d = new bpn0(new ejf0(this, 25));

    public ufw0(tfw0 tfw0Var) {
        this.a = tfw0Var;
    }

    @Override // xsna.tfw0.d
    public final tfw0.a a() {
        return (tfw0.a) this.b.getValue();
    }

    @Override // xsna.tfw0.d
    public final mui0 b() {
        return (mui0) this.c.getValue();
    }

    @Override // xsna.tfw0.d
    public final com.vk.superapp.multiaccount.api.d c() {
        return (com.vk.superapp.multiaccount.api.d) this.d.getValue();
    }
}
