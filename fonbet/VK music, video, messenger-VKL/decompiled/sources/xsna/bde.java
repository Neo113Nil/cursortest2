package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class bde implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ bde(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke();
                return s3q0.a;
            default:
                return Float.valueOf(((Number) this.c.invoke()).floatValue() < 1.0f ? 0.3f : 1.0f);
        }
    }
}
