package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class koj implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ koj(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.setValue(Boolean.valueOf(!com.vk.design.demo.presentation.screens.a.c(r0)));
                return s3q0.a;
            case 1:
                this.c.setValue(1);
                return s3q0.a;
            default:
                return (yrb0) this.c.getValue();
        }
    }
}
