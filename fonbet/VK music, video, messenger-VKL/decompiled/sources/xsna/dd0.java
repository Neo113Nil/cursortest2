package xsna;

import android.view.View;
import android.widget.TextView;
import xsna.cd0;

/* compiled from: View.kt */
/* loaded from: classes2.dex */
public final class dd0 implements Runnable {
    public final /* synthetic */ View b;
    public final /* synthetic */ cd0.a c;
    public final /* synthetic */ boolean d;

    public dd0(View view, cd0.a aVar, boolean z) {
        this.b = view;
        this.c = aVar;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cd0.a aVar = this.c;
        TextView textView = aVar.o;
        int i = 1;
        if (!this.d && aVar.n.getLineCount() <= 1) {
            i = 2;
        }
        textView.setMaxLines(i);
    }
}
