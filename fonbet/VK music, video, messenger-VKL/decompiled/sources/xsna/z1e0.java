package xsna;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class z1e0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ b2e0 b;
    public final /* synthetic */ io.reactivex.rxjava3.disposables.c c;

    public /* synthetic */ z1e0(b2e0 b2e0Var, io.reactivex.rxjava3.disposables.c cVar) {
        this.b = b2e0Var;
        this.c = cVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        gzs<s3q0> gzsVar = this.b.b;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        this.c.dispose();
    }
}
