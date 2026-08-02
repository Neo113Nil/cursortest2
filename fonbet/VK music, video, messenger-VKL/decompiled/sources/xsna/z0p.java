package xsna;

import android.content.DialogInterface;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class z0p implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ z0p(Ref$ObjectRef ref$ObjectRef, int i) {
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
                    dw20Var.hide();
                }
                break;
            default:
                Ref$ObjectRef ref$ObjectRef = this.c;
                DialogInterface dialogInterface = (DialogInterface) ref$ObjectRef.element;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                ref$ObjectRef.element = null;
                break;
        }
        return s3q0.a;
    }
}
