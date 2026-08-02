package xsna;

import android.content.DialogInterface;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class vc00 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ vc00(Ref$ObjectRef ref$ObjectRef, int i) {
        this.b = i;
        this.c = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                dw20 dw20Var = (dw20) this.c.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                break;
            case 1:
                DialogInterface dialogInterface = (DialogInterface) this.c.element;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                break;
            default:
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.c.element;
                if (cVar != null) {
                    cVar.dispose();
                }
                break;
        }
        return s3q0.a;
    }
}
