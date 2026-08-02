package xsna;

import com.vk.pushes.bridgeimpl.PushBridgeType;
import kotlin.Pair;

/* compiled from: HmsDefaultPushBridgeImpl.kt */
/* loaded from: classes5.dex */
public final class dav implements rmr0 {
    public final bpn0 b = new bpn0(new wv0(20));
    public final int c = PushBridgeType.HUAWEI.h();

    @Override // xsna.rmr0
    public final void b() {
        ((eav) this.b.getValue()).getClass();
    }

    @Override // xsna.rmr0
    public final Pair<String, Long> c() {
        ((eav) this.b.getValue()).getClass();
        return new Pair<>("", Long.valueOf(System.currentTimeMillis()));
    }

    @Override // xsna.rmr0
    public final String d() {
        ((eav) this.b.getValue()).getClass();
        return "huawei";
    }

    @Override // xsna.rmr0
    public final boolean e() {
        return false;
    }

    @Override // xsna.rmr0
    public final int g() {
        return this.c;
    }

    @Override // xsna.rmr0
    public final void a() {
    }

    @Override // xsna.rmr0
    public final void f(String str, String str2, String str3, String str4, int i, String str5, String str6) {
    }
}
