package xsna;

import com.vk.dto.Push;

/* compiled from: CommonPushHandlerBridge.kt */
/* loaded from: classes5.dex */
public final class ylg implements xhe0 {
    public static final ylg a = new ylg();
    public static final bpn0 b = new bpn0(new gc(6));
    public static final bpn0 c = new bpn0(new pr0(9));

    /* compiled from: CommonPushHandlerBridge.kt */
    public static final class a implements w8i {
    }

    @Override // xsna.xhe0
    public final void a(String str) {
        ((kke0) c.getValue()).e();
    }

    @Override // xsna.xhe0
    public final void b() {
        ((kke0) c.getValue()).c();
    }

    @Override // xsna.xhe0
    public final void c(Push push) {
        ((qje0) b.getValue()).g(push);
    }

    @Override // xsna.xhe0
    public final void d() {
        ((kke0) c.getValue()).a((r2 & 1) == 0, null);
    }
}
