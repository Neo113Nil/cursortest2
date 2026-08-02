package xsna;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class b6a0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Runnable b;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.run();
        dialogInterface.dismiss();
    }
}
