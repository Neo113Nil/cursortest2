package yads;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes10.dex */
public final class vr2 {
    public final b83 a;
    public final y63 b;

    public /* synthetic */ vr2(b83 b83Var) {
        this(b83Var, new y63());
    }

    public final void a(View view, long j, long j2) {
        view.setVisibility(0);
        this.a.getClass();
        View findViewWithTag = view.findViewWithTag("timer_value");
        TextView textView = findViewWithTag instanceof TextView ? (TextView) findViewWithTag : null;
        if (textView != null) {
            this.b.getClass();
            textView.setText(String.valueOf((int) Math.ceil((j - j2) / y63.a)));
        }
    }

    public vr2(b83 b83Var, y63 y63Var) {
        this.a = b83Var;
        this.b = y63Var;
    }
}
