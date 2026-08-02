package xsna;

import android.content.DialogInterface;

/* compiled from: BroadcastView.java */
/* loaded from: classes16.dex */
public final class gk8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ek8 b;

    public gk8(ek8 ek8Var) {
        this.b = ek8Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.s.close();
    }
}
