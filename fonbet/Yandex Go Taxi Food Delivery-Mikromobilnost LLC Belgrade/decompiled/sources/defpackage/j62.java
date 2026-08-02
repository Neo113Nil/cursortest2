package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class j62 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ fwi b;

    public /* synthetic */ j62(fwi fwiVar, int i) {
        this.a = i;
        this.b = fwiVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        float w0;
        int i = this.a;
        fwi fwiVar = this.b;
        switch (i) {
            case 0:
                w0 = fwiVar.w0(125.0f);
                break;
            case 1:
                w0 = fwiVar.w0(56.0f);
                break;
            default:
                w0 = fwiVar.w0(125.0f);
                break;
        }
        return Float.valueOf(w0);
    }
}
