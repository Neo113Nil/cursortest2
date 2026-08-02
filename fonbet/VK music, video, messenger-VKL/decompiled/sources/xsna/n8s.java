package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class n8s implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ n8s(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return s3q0.a;
            default:
                return (androidx.compose.foundation.lazy.layout.b) ((gzs) this.c.getValue()).invoke();
        }
    }
}
