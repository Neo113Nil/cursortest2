package xsna;

import xsna.hh8;

/* compiled from: BroadcastManagementFeature.kt */
/* loaded from: classes7.dex */
public final class eh8 {
    public final m10 b;
    public final clj0 c;
    public final io.reactivex.rxjava3.subjects.d<hh8> a = io.reactivex.rxjava3.subjects.d.O0(hh8.c.a);
    public final boolean d = true;

    public eh8(com.vk.voip.b bVar, se8 se8Var, bpn0 bpn0Var, r4x0 r4x0Var) {
        int i = 0;
        int i2 = 1;
        this.b = new m10(bVar, r4x0Var, new dh8(i2, this, eh8.class, "publishState", "publishState(Lcom/vk/voip/ui/broadcast/features/management/BroadcastManagementFeatureState;)V", i, 0), new wv2(i2, this, eh8.class, "publishSideEffect", "publishSideEffect(Lcom/vk/voip/ui/broadcast/features/management/BroadcastManagementFeatureSideEffect;)V", i, 1));
        this.c = new clj0(bVar, se8Var, r4x0Var, bpn0Var, new xv2(i2, this, eh8.class, "publishAction", "publishAction(Lcom/vk/voip/ui/broadcast/features/management/BroadcastManagementFeatureAction;)V", i, 3));
    }

    public final synchronized void a(fh8 fh8Var) {
        if (!this.d) {
            throw new IllegalStateException("Instance is destroyed");
        }
        synchronized (this) {
            if (this.d) {
                this.b.a(b(), fh8Var);
            }
        }
    }

    public final synchronized hh8 b() {
        if (!this.d) {
            throw new IllegalStateException("Instance is destroyed");
        }
        return this.a.P0();
    }

    public final synchronized io.reactivex.rxjava3.subjects.d c() {
        if (!this.d) {
            throw new IllegalStateException("Instance is destroyed");
        }
        return this.a;
    }
}
