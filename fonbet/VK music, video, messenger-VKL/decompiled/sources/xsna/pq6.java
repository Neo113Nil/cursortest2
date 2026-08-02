package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.tool.view.FrameLayoutSwiped;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import xsna.x8s;

/* compiled from: BaseVideoCommentViewHolder.kt */
/* loaded from: classes4.dex */
public abstract class pq6 extends ib6 {
    public static final /* synthetic */ int W = 0;
    public final TextView U;
    public final lfo0 V;

    public pq6(int i, ViewGroup viewGroup, afg afgVar, g3f0 g3f0Var) {
        super(i, viewGroup, afgVar, g3f0Var);
        this.U = (TextView) this.itemView.findViewById(R.id.count_answer);
        FrameLayoutSwiped frameLayoutSwiped = (FrameLayoutSwiped) this.itemView.findViewById(R.id.wrapper);
        TextView textView = this.A;
        this.V = new lfo0(textView);
        textView.setHighlightColor(0);
        if (frameLayoutSwiped != null) {
            frameLayoutSwiped.setInterceptOnlyForLeftScroll(true);
        }
    }

    public final void F6(int i) {
        this.I = i;
        this.J = true;
        TextView textView = this.H;
        textView.setOnTouchListener(this);
        awt0.j(cn70.b(8), textView);
        textView.setOnClickListener(this);
    }

    public final void G6(iag iagVar, int i, gzs<s3q0> gzsVar) {
        TextView textView = this.U;
        if (textView != null) {
            textView.setVisibility((iagVar.f4() <= 0 || getItemViewType() != i) ? 8 : 0);
        }
        if (textView != null) {
            textView.setText(enj.f(R.plurals.answer_count, iagVar.f4(), this.itemView.getContext()));
        }
        if (textView != null) {
            textView.setOnClickListener(new yn3(gzsVar, 2));
        }
    }

    public final void I6(iag iagVar) {
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) "· ");
        DecimalFormat decimalFormat = z8s.a;
        SpannableStringBuilder append2 = append.append((CharSequence) z8s.c(this.itemView.getContext(), iagVar.C() * 1000, x8s.b.g, false));
        TextView textView = this.y;
        textView.setText(append2);
        textView.setContentDescription(z8s.c(this.itemView.getContext(), iagVar.C() * 1000, x8s.a.g, false));
    }

    public final void M6() {
        TextView textView = this.A;
        qj80.a(textView, new nq6(textView, this, textView.getText()));
    }

    public final void O6() {
        dhr0.a.getClass();
        int f = e3m.f(R.attr.vk_ui_accent_red, dhr0.s());
        int f2 = e3m.f(R.attr.vk_ui_text_secondary, dhr0.s());
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, new baf0(m33.a(R.drawable.vk_icon_like_16, dhr0.s()), f));
        stateListDrawable.addState(new int[0], new baf0(m33.a(R.drawable.vk_icon_like_outline_16, dhr0.s()), f2));
        int layoutDirection = b6().getConfiguration().getLayoutDirection();
        TextView textView = this.H;
        if (layoutDirection == 1) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, stateListDrawable, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(stateListDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @Override // xsna.ib6, xsna.a4g0
    public final aa P3(boolean z) {
        boolean z2 = z || !o25.a().b();
        this.M = z2;
        View view = this.s;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
        }
        return this;
    }
}
