package xsna;

/* compiled from: AutoLockTimePickerView.kt */
/* loaded from: classes15.dex */
public final class qg5 implements izs {
    public static final qg5 c = new qg5(0);
    public static final qg5 d = new qg5(1);
    public static final qg5 e = new qg5(2);
    public final /* synthetic */ int b;

    public /* synthetic */ qg5(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                ((etv0) obj).b(false);
                return s3q0.a;
            default:
                return Boolean.valueOf(obj instanceof fjw0);
        }
    }
}
