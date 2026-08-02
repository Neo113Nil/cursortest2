package xsna;

import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.superapp.SuperAppFeatures;

/* compiled from: SuperAppBridgeImpl.kt */
/* loaded from: classes6.dex */
public final class p7n0 implements o7n0 {
    public final bpn0 b;
    public final bpn0 a = new bpn0(new ufm0(1));
    public final bpn0 c = new bpn0(new jzm0(1));
    public final bpn0 d = new bpn0(new vqe0(4));
    public final bpn0 e = new bpn0(new o6(29));
    public final bpn0 f = new bpn0(new bem0(1));

    public p7n0(ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        this.b = new bpn0(new afl0(profileFragmentProviderComponent, 5));
    }

    @Override // xsna.o7n0
    public final SuperAppFeatures R() {
        return (SuperAppFeatures) this.a.getValue();
    }

    @Override // xsna.o7n0
    public final cbn0 a() {
        return (cbn0) this.b.getValue();
    }

    @Override // xsna.o7n0
    public final ocn0 b() {
        return ffx0.a;
    }

    @Override // xsna.o7n0
    public final m7n0 c() {
        return (m7n0) this.c.getValue();
    }

    @Override // xsna.o7n0
    public final k9n0 d() {
        return (k9n0) this.d.getValue();
    }

    @Override // xsna.o7n0
    public final m9n0 e() {
        return (m9n0) this.e.getValue();
    }

    @Override // xsna.o7n0
    public final aan0 f() {
        return (aan0) this.f.getValue();
    }

    @Override // xsna.o7n0
    public final com.vk.superapp.b getCache() {
        return k720.a;
    }
}
