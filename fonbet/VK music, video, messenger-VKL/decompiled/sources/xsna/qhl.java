package xsna;

import android.view.View;

/* compiled from: DefaultListErrorView.java */
/* loaded from: classes3.dex */
public final class qhl implements View.OnClickListener {
    public final /* synthetic */ rhl b;

    public qhl(rhl rhlVar) {
        this.b = rhlVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        rhl rhlVar = this.b;
        if (currentTimeMillis - rhlVar.d < 400) {
            return;
        }
        rhlVar.a();
        rhlVar.d = System.currentTimeMillis();
    }
}
