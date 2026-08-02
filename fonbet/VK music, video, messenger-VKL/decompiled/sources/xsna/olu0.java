package xsna;

/* compiled from: VkClipsExperimentsBridge.kt */
/* loaded from: classes11.dex */
public final class olu0 implements w1e {
    public final bpn0 a;
    public final bpn0 b;
    public final bpn0 c = new bpn0(new lb8(this, 3));

    public olu0(bpn0 bpn0Var, bpn0 bpn0Var2) {
        this.a = bpn0Var;
        this.b = bpn0Var2;
    }

    @Override // xsna.w1e
    public final v1e getExperiments() {
        return (v1e) this.c.getValue();
    }
}
