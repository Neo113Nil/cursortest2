package xsna;

import com.vk.pushes.bridgeimpl.PushBridgeType;
import kotlin.Pair;

/* compiled from: RustoreDefaultPushBridgeImpl.kt */
/* loaded from: classes5.dex */
public final class esg0 implements rmr0 {
    public final erg0 b;
    public final int c = PushBridgeType.RUSTORE.h();

    public esg0(erg0 erg0Var) {
        this.b = erg0Var;
    }

    @Override // xsna.rmr0
    public final void b() {
        this.b.b();
    }

    @Override // xsna.rmr0
    public final Pair<String, Long> c() {
        return new Pair<>(this.b.c(), Long.valueOf(System.currentTimeMillis()));
    }

    @Override // xsna.rmr0
    public final String d() {
        this.b.getClass();
        return "rustore";
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
