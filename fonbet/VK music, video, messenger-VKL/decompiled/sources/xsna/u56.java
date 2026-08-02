package xsna;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class u56 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ u56(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                gzs gzsVar = this.c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            default:
                gzs gzsVar2 = this.c;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                    break;
                }
                break;
        }
    }
}
