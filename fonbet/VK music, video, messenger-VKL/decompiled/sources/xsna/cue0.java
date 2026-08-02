package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cue0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ cue0(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.setValue(new q9x(((q9x) obj).a));
                break;
            default:
                this.c.setValue(Boolean.valueOf(!((Boolean) r3.getValue()).booleanValue()));
                break;
        }
        return s3q0.a;
    }
}
