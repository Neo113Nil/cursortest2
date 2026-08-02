package xsna;

import android.view.View;

/* compiled from: CounterView.java */
/* loaded from: classes16.dex */
public final class xxj implements View.OnClickListener {
    public final /* synthetic */ yxj b;

    public xxj(yxj yxjVar) {
        this.b = yxjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.e.cancel();
    }
}
