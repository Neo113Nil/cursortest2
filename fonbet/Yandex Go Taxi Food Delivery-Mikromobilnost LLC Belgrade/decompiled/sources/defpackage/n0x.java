package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes4.dex */
public final class n0x extends v0x {
    @Override // defpackage.v0x
    public final void b(x0 x0Var, u0x u0xVar) {
        l0x l0xVar = (l0x) u0xVar;
        TextView textView = ((o0x) x0Var).N;
        textView.setText(l0xVar.a.a);
        int i = m0x.a[l0xVar.a.b.ordinal()];
        if (i == 1 || i == 2) {
            textView.setBackgroundResource(qyg0.logger_error_background);
        } else {
            textView.setBackgroundResource(qyg0.logger_warning_background);
        }
    }

    @Override // defpackage.v0x
    public final x0 d(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        int b = m810.b(8.0f * context.getResources().getDisplayMetrics().density);
        TextView textView = new TextView(context);
        textView.setHorizontallyScrolling(true);
        textView.setTextColor(context.getColor(eqg0.logger_white));
        textView.setPadding(b, b, b, b);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(b, b, b, b);
        horizontalScrollView.addView(textView, marginLayoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(horizontalScrollView, -1, -2);
        return new o0x(frameLayout, textView);
    }

    @Override // defpackage.v0x
    public final void h(x0 x0Var) {
        ((o0x) x0Var).N.setText((CharSequence) null);
    }
}
