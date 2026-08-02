package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: ImListAutoplayPlayer.kt */
/* loaded from: classes2.dex */
public final class a9w implements f5z {
    public final bpn0 b;

    public a9w(z8w z8wVar) {
        this.b = new bpn0(new x5i(z8wVar, 28));
    }

    @Override // xsna.f5z
    public final Lifecycle getLifecycle() {
        return (Lifecycle) this.b.getValue();
    }
}
