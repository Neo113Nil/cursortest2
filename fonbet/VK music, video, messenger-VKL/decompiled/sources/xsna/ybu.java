package xsna;

import android.view.View;

/* compiled from: GraffitiConfirmDialog.java */
/* loaded from: classes15.dex */
public final class ybu implements View.OnClickListener {
    public final /* synthetic */ acu b;

    public ybu(acu acuVar) {
        this.b = acuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.dismiss();
    }
}
