package xsna;

import android.content.DialogInterface;
import xsna.bh6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ah6 implements DialogInterface.OnDismissListener {
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        bh6.m.onNext(new bh6.b(dialogInterface));
    }
}
