package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class btr0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ fwi b;
    public final /* synthetic */ float c;

    public /* synthetic */ btr0(fwi fwiVar, float f, int i) {
        this.a = i;
        this.b = fwiVar;
        this.c = f;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        float f = this.c;
        fwi fwiVar = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(fwiVar.w0(f));
            case 1:
                return Float.valueOf(fwiVar.w0(f));
            default:
                return Integer.valueOf((int) (fwiVar.w0(f) / (fwiVar.w0(8.0f) + fwiVar.w0(4.0f))));
        }
    }
}
