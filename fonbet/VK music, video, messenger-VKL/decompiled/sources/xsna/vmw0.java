package xsna;

import kotlin.Lazy;

/* compiled from: VoipConfigurationImpl.kt */
/* loaded from: classes7.dex */
public final class vmw0 implements umw0 {
    public final Lazy<String> a;
    public final Lazy b;

    public vmw0(Lazy<String> lazy, Lazy<? extends bfw0> lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    @Override // xsna.umw0
    public final String a() {
        return this.a.getValue();
    }

    @Override // xsna.umw0
    public final bfw0 b() {
        return (bfw0) this.b.getValue();
    }
}
