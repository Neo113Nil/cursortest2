package xsna;

/* compiled from: VkTooltip.kt */
/* loaded from: classes17.dex */
public final class buv0 implements etv0 {
    public boolean a;
    public final wh50 b;
    public final /* synthetic */ izs<Boolean, s3q0> c;
    public final /* synthetic */ izs<Boolean, s3q0> d;

    public buv0(izs izsVar, izs izsVar2, boolean z) {
        this.c = izsVar;
        this.d = izsVar2;
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    @Override // xsna.etv0
    public final void a() {
        izs<Boolean, s3q0> izsVar = this.d;
        if (izsVar != null) {
            izsVar.invoke(Boolean.valueOf(this.a));
        }
    }

    @Override // xsna.etv0
    public final void b(boolean z) {
        this.a = z;
        setVisible(false);
        izs<Boolean, s3q0> izsVar = this.c;
        if (izsVar != null) {
            izsVar.invoke(Boolean.valueOf(z));
        }
    }

    @Override // xsna.etv0
    public final boolean isVisible() {
        return ((Boolean) ((zak0) this.b).getValue()).booleanValue();
    }

    @Override // xsna.etv0
    public final void setVisible(boolean z) {
        ((zak0) this.b).setValue(Boolean.valueOf(z));
    }
}
