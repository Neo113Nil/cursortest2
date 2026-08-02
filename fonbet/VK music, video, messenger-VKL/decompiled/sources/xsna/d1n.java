package xsna;

import android.content.Context;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;
import xsna.g1n;

/* compiled from: DisclaimerRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class d1n {
    public final TextView a;
    public final nf0 b = new nf0(this, 5);
    public g1n c;

    public d1n(TextView textView) {
        this.a = textView;
    }

    public final void a(g1n g1nVar) {
        CharSequence k;
        boolean z = g1nVar.b;
        g1n.a aVar = g1nVar.a;
        g1n g1nVar2 = this.c;
        boolean f = epx.f(g1nVar2 != null ? g1nVar2.a : null, aVar);
        TextView textView = this.a;
        if (!f) {
            Context context = textView.getContext();
            if (aVar instanceof g1n.a.b) {
                k = ((g1n.a.b) aVar).a.a(context);
            } else {
                if (!(aVar instanceof g1n.a.C2909a)) {
                    throw new NoWhenBranchMatchedException();
                }
                k = p4g.k(((g1n.a.C2909a) aVar).a, "", new wzf(context, 10));
            }
            textView.setText(k);
        }
        g1n g1nVar3 = this.c;
        if (g1nVar3 == null || g1nVar3.b != z) {
            nf0 nf0Var = this.b;
            if (z) {
                textView.postDelayed(nf0Var, 1500L);
            } else {
                textView.removeCallbacks(nf0Var);
                textView.setSelected(false);
            }
        }
        this.c = g1nVar;
    }
}
