package xsna;

import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class tkq implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ tkq(Ref$ObjectRef ref$ObjectRef, int i) {
        this.b = i;
        this.c = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                dw20 dw20Var = (dw20) this.c.element;
                if (dw20Var != null) {
                    dw20Var.tn();
                }
                break;
            default:
                gzs gzsVar = (gzs) this.c.element;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
        }
        return s3q0.a;
    }
}
