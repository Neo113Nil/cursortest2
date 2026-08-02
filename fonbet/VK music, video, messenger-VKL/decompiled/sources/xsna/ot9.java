package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.WeakHashMap;
import xsna.y5c;
import xsna.yln0;

/* compiled from: CardMethodHolder.kt */
/* loaded from: classes6.dex */
public final class ot9 extends cb6<ht9> implements wgh0 {
    public final View o;
    public final ps8 p;
    public final TextView q;
    public ht9 r;

    public ot9(ViewGroup viewGroup, y5c.a aVar) {
        super((View) new ps8(viewGroup.getContext()), aVar);
        View b = tf3.b(viewGroup, R.layout.vk_pay_checkout_item_pay_method, viewGroup, false);
        this.o = b;
        ps8 ps8Var = (ps8) this.itemView;
        this.p = ps8Var;
        ps8Var.setContentView(b);
        yln0 yln0Var = new yln0(viewGroup.getContext());
        ps8 ps8Var2 = yln0Var.c;
        if (ps8Var2 != ps8Var) {
            yln0.a aVar2 = yln0Var.d;
            if (ps8Var2 != null) {
                ps8Var2.h.remove(aVar2);
            }
            yln0Var.c = ps8Var;
            ps8Var.h.add(aVar2);
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setText(context.getString(R.string.vk_pay_checkout_methods_list_unbind_card));
        textView.setBackgroundColor(-65536);
        textView.setGravity(17);
        textView.setTextColor(-1);
        int a = iah0.a(16);
        textView.setPadding(a, a, a, a);
        textView.setTextSize(16.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        this.q = textView;
        b.setOnClickListener(new nt9(0, this, aVar));
        textView.setOnClickListener(new r4(this, 2));
    }

    @Override // xsna.cb6, xsna.vfz
    /* renamed from: W5 */
    public final void h6(hfz hfzVar) {
        ht9 ht9Var = (ht9) hfzVar;
        super.W5(ht9Var);
        this.r = ht9Var;
        ps8 ps8Var = this.p;
        TextView textView = this.q;
        ps8Var.removeView(textView);
        if (textView != null) {
            ps8Var.setRightViews(Collections.singletonList(textView));
        }
    }

    @Override // xsna.wgh0
    public final void h0() {
        ps8 ps8Var = this.p;
        if (ps8Var.getInitialScrollOffset() - ps8Var.getScrollX() != 0) {
            if (!this.itemView.isAttachedToWindow()) {
                ps8Var.scrollTo(ps8Var.getInitialScrollOffset(), 0);
                return;
            }
            t12 t12Var = new t12(ps8Var, 3);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            ps8Var.postOnAnimation(t12Var);
        }
    }

    @Override // xsna.cb6
    /* renamed from: h6 */
    public final void W5(ht9 ht9Var) {
        ht9 ht9Var2 = ht9Var;
        super.W5(ht9Var2);
        this.r = ht9Var2;
        ps8 ps8Var = this.p;
        TextView textView = this.q;
        ps8Var.removeView(textView);
        if (textView != null) {
            ps8Var.setRightViews(Collections.singletonList(textView));
        }
    }

    @Override // xsna.wgh0
    public final void n2(ns8 ns8Var) {
        this.p.h.add(ns8Var);
    }
}
