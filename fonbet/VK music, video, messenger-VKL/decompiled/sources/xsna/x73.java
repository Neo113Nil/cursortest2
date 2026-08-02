package xsna;

import android.content.DialogInterface;
import android.view.Window;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class x73 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ c83 b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ x73(c83 c83Var, Ref$ObjectRef ref$ObjectRef) {
        this.b = c83Var;
        this.c = ref$ObjectRef;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        c83 c83Var = this.b;
        Window window = c83Var.getWindow();
        if (window != null) {
            fvr.x(window, dhr0.C().b);
        }
        dhr0.a.getClass();
        dhr0.X(c83Var);
        this.c.element = null;
    }
}
