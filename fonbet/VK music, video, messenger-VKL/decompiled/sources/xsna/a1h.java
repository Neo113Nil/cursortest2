package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class a1h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ c1h c;

    public /* synthetic */ a1h(c1h c1hVar, int i) {
        this.b = i;
        this.c = c1hVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                c1h c1hVar = this.c;
                int w = c1hVar.w();
                return Float.valueOf(((Number) c1hVar.n.getValue()).floatValue() * (-((((q9x) ((zak0) c1hVar.f).getValue()) != null ? (int) (r2.a & 4294967295L) : 0) + w)));
            default:
                return Boolean.valueOf(this.c.k() < 0.4f);
        }
    }
}
