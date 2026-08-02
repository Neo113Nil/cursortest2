package xsna;

/* compiled from: ExternalNpsPollSnapStrategy.kt */
/* loaded from: classes16.dex */
public final class jfq extends com.vk.core.ui.bottomsheet.internal.b {
    public final kfq a;
    public final int b;

    public jfq(kfq kfqVar, int i) {
        this.a = kfqVar;
        this.b = i;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        return Math.min(i2 - Math.max(this.b, this.a.getMeasuredHeight()), i);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        return 0;
    }
}
