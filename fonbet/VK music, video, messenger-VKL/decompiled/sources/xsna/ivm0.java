package xsna;

import android.view.View;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;
import xsna.jvm0;

/* compiled from: SubscribeButtonRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class ivm0 {
    public final TextView a;
    public final View b;
    public final hvm0 c;
    public jvm0 d;
    public jvm0 e;

    public ivm0(TextView textView, View view) {
        this.a = textView;
        this.b = view;
        this.c = new hvm0(textView);
    }

    public final void a(jvm0 jvm0Var) {
        if (jvm0Var.equals(this.e)) {
            return;
        }
        boolean z = jvm0Var instanceof jvm0.c;
        hvm0 hvm0Var = this.c;
        View view = this.b;
        TextView textView = this.a;
        if (z) {
            textView.setVisibility(8);
            view.setVisibility(0);
            if (!epx.f(this.d, (jvm0.c) jvm0Var)) {
                hvm0Var.a(false);
            }
            this.d = jvm0Var;
        } else if (jvm0Var instanceof jvm0.b) {
            jvm0.b bVar = (jvm0.b) jvm0Var;
            textView.setVisibility(0);
            view.setVisibility(8);
            if (!epx.f(this.d, bVar)) {
                hvm0Var.a(bVar.a);
            }
            this.d = jvm0Var;
        } else {
            if (!(jvm0Var instanceof jvm0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            d3m.e(this.a, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
            d3m.e(this.b, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        }
        this.e = jvm0Var;
    }
}
