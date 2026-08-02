package yads;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes10.dex */
public final class p43 implements Runnable {
    public final View b;
    public final gf c;

    public p43(TextView textView, gf gfVar) {
        this.b = textView;
        this.c = gfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.b);
    }
}
