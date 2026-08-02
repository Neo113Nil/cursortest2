package xsna;

/* compiled from: VhMassMention.kt */
/* loaded from: classes2.dex */
public final class yi10 implements hfz {
    public final xi10 b;

    public yi10(xi10 xi10Var) {
        this.b = xi10Var;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.hashCode());
    }
}
