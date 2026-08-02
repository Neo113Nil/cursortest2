package xsna;

import android.content.DialogInterface;
import xsna.bh6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class zg6 implements DialogInterface.OnCancelListener {
    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        bh6.m.onNext(new bh6.a(dialogInterface));
    }
}
