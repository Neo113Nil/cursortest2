package xsna;

import com.vk.voip.ui.accessibility.AccessibilityEvents;

/* compiled from: WatchTogetherDelegateImpl.kt */
/* loaded from: classes7.dex */
public final class kcx0 implements jcx0 {
    public final io.reactivex.rxjava3.core.q<fjw0> a;
    public final vqe0 b;
    public final com.vk.voip.b c;
    public final r6x0 d;

    public kcx0(io.reactivex.rxjava3.core.q qVar, vqe0 vqe0Var, com.vk.voip.b bVar, ubx0 ubx0Var, AccessibilityEvents accessibilityEvents) {
        this.a = qVar;
        this.b = vqe0Var;
        this.c = bVar;
        this.d = new r6x0(bVar, vqe0Var, ubx0Var, accessibilityEvents);
    }

    @Override // xsna.jcx0
    public final gzs<Boolean> a() {
        return this.b;
    }

    @Override // xsna.jcx0
    public final r6x0 b() {
        return this.d;
    }
}
