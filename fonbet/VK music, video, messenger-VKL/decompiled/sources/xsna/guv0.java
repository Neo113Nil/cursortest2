package xsna;

/* compiled from: VkTooltipStateImpl.kt */
/* loaded from: classes17.dex */
public final class guv0 implements fuv0 {
    public final boolean a;
    public final wh50<Boolean> b;

    public guv0(boolean z, boolean z2) {
        this.a = z2;
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    @Override // xsna.fuv0
    public final boolean a() {
        return this.a;
    }

    @Override // xsna.fuv0
    public final void close() {
        ((zak0) this.b).setValue(Boolean.FALSE);
    }

    @Override // xsna.fuv0
    public final void dismiss() {
        if (this.a) {
            return;
        }
        ((zak0) this.b).setValue(Boolean.FALSE);
    }

    @Override // xsna.fuv0
    public final boolean isVisible() {
        return ((Boolean) ((zak0) this.b).getValue()).booleanValue();
    }

    @Override // xsna.fuv0
    public final void show() {
        ((zak0) this.b).setValue(Boolean.TRUE);
    }
}
