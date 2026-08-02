package xsna;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class wsq0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wsq0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                ((cwl0) this.c).f.invoke();
                break;
            default:
                ((com.vk.superapp.verification.account.d) this.c).close();
                break;
        }
    }
}
