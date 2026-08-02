package xsna;

import android.content.DialogInterface;
import android.view.KeyEvent;
import java.io.Serializable;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class t14 implements DialogInterface.OnKeyListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ t14(int i, Serializable serializable) {
        this.b = i;
        this.c = serializable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        switch (this.b) {
            case 0:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var == null) {
                    return true;
                }
                dw20Var.dismiss();
                return true;
            default:
                return ((Boolean) ((yte) this.c).invoke(Integer.valueOf(i))).booleanValue();
        }
    }
}
