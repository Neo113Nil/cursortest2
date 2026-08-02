package xsna;

import com.vk.core.fragments.FragmentImpl;

/* compiled from: VkUiUpdateMarketItemCommand.kt */
/* loaded from: classes7.dex */
public final class oxv0 extends dvv0 implements w8i {
    public final FragmentImpl e;
    public final bpn0 f = new bpn0(new h8n0(this, 16));

    public oxv0(FragmentImpl fragmentImpl) {
        this.e = fragmentImpl;
    }

    @Override // xsna.dvv0
    public final void a(String str) {
        io.reactivex.rxjava3.disposables.b b;
        if (str == null || (b = b()) == null) {
            return;
        }
        b.b(((m8q0) this.f.getValue()).a(this.e, str).subscribe(new j8w(this, 3), new o060(new m2l0(this, 24), 24)));
    }
}
