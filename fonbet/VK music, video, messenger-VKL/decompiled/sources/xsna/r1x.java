package xsna;

import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class r1x implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ r1x(Ref$ObjectRef ref$ObjectRef, int i) {
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
            default:
                ((dw20) this.c.element).hide();
                break;
        }
        return s3q0.a;
    }
}
