package xsna;

import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class la9 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ la9(Ref$ObjectRef ref$ObjectRef, int i) {
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
                    dw20Var.dismiss();
                }
                break;
            case 1:
                gzs gzsVar = (gzs) this.c.element;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            default:
                dcn dcnVar = (dcn) this.c.element;
                if (dcnVar != null) {
                    dcnVar.dismiss();
                }
                break;
        }
        return s3q0.a;
    }
}
