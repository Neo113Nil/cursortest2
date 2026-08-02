package xsna;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.vkontakte.android.R;

/* compiled from: StoryCreateQuestionColorsAdapter.kt */
/* loaded from: classes16.dex */
public final class u0m0 extends vif0<t0m0> implements View.OnClickListener {
    public final fux<t0m0> n;
    public final View o;
    public final FrameLayout p;
    public final View q;

    /* JADX WARN: Multi-variable type inference failed */
    public u0m0(ViewGroup viewGroup, fux<? super t0m0> fuxVar) {
        super(viewGroup, R.layout.item_opinion_style, 0);
        this.n = fuxVar;
        this.o = this.itemView.findViewById(R.id.preview_dot);
        this.p = (FrameLayout) this.itemView.findViewById(R.id.cv_container);
        this.q = this.itemView.findViewById(R.id.v_selected);
        jjc.f(this, this.itemView);
    }

    public static void q6(View view, boolean z) {
        bwt0.p0(view, !z);
        if (z) {
            ViewPropertyAnimator d = xo2.d(29, 200L, view);
            if (d != null) {
                d.withEndAction(new cs2(view, 16));
                return;
            }
            return;
        }
        ViewPropertyAnimator e = xo2.e(view, 200L, null, 13);
        if (e != null) {
            e.withEndAction(new yh9(view, 8));
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [T, xsna.t0m0] */
    @Override // xsna.vif0
    public final void i6(t0m0 t0m0Var) {
        t0m0 t0m0Var2 = t0m0Var;
        this.m = t0m0Var2;
        View view = this.itemView;
        view.setContentDescription(view.getContext().getString(t0m0Var2.c));
        GradientDrawable gradientDrawable = (GradientDrawable) this.p.getBackground();
        int i = t0m0Var2.e;
        View view2 = this.o;
        view2.setBackgroundResource(i);
        boolean z = t0m0Var2.b;
        if (z) {
            gradientDrawable.setStroke(cn70.b(2), 0);
        } else {
            gradientDrawable.setStroke(cn70.b(2), this.itemView.getContext().getColor(R.color.vk_white));
        }
        gradientDrawable.setColor(t0m0Var2.d.i);
        bwt0.p0(this.q, z);
        if (!bwt0.K(view2) && z) {
            q6(view2, true);
        } else {
            if (!bwt0.K(view2) || z) {
                return;
            }
            q6(view2, false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        T t;
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || (t = this.m) == 0) {
            return;
        }
        this.n.li(bindingAdapterPosition, t);
    }
}
