package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class fr5 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ qor b;

    public /* synthetic */ fr5(qor qorVar, int i) {
        this.a = i;
        this.b = qorVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        qor qorVar = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(qorVar.getFloatValue());
            case 1:
                return Float.valueOf(qorVar.getFloatValue());
            case 2:
                return Float.valueOf(1.0f - qorVar.getFloatValue());
            default:
                return Float.valueOf(qorVar.getFloatValue());
        }
    }
}
