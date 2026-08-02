package xsna;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.text.SquareExcerptTextView;
import com.vkontakte.android.R;
import xsna.uij0;

/* compiled from: DescriptionViewHelper.kt */
/* loaded from: classes4.dex */
public final class s2m implements f8q {
    public final hs50 b;
    public final View c;
    public final FrameLayout d;
    public final SquareExcerptTextView e;
    public final r8q f;
    public final SpannableStringBuilder g;
    public final x7q h;
    public gzs<s3q0> i;
    public final s1q j;

    public s2m(hs50 hs50Var) {
        this.b = hs50Var;
        View view = hs50Var.itemView;
        this.c = view;
        this.d = (FrameLayout) view.findViewById(R.id.description_container);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.text_container);
        SquareExcerptTextView squareExcerptTextView = (SquareExcerptTextView) view.findViewById(R.id.description);
        this.e = squareExcerptTextView;
        o7q o7qVar = new o7q();
        r8q r8qVar = new r8q(viewGroup, squareExcerptTextView, this, o7qVar);
        this.f = r8qVar;
        this.j = new s1q(3, 0, 52);
        view.getContext();
        squareExcerptTextView.setAvailableShowMoreExpandSpanMeasureStrategy(true);
        squareExcerptTextView.setExpandAnimationController(o7qVar);
        x7q x7qVar = new x7q();
        x7qVar.g(false);
        this.h = x7qVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xwk.d().a().p(view.getContext(), uij0.c.a));
        this.g = spannableStringBuilder;
        spannableStringBuilder.setSpan(x7qVar, 0, spannableStringBuilder.length(), 33);
        r8qVar.x = R.attr.vk_ui_text_subhead;
        x7qVar.j();
    }

    @Override // xsna.f8q
    public final void K0(gzs<s3q0> gzsVar) {
        this.i = gzsVar;
    }

    @Override // xsna.f8q
    public final void h() {
        SquareExcerptTextView squareExcerptTextView = this.e;
        squareExcerptTextView.setShouldTruncate(false);
        squareExcerptTextView.setEllipsize(null);
        squareExcerptTextView.setMaxLines(Integer.MAX_VALUE);
        squareExcerptTextView.setMaxExcerptLines(Integer.MAX_VALUE);
        squareExcerptTextView.sendAccessibilityEvent(8);
    }

    @Override // xsna.f8q
    public final gzs<s3q0> r3() {
        return this.i;
    }

    @Override // xsna.f8q
    public final void x2(boolean z) {
        this.d.performClick();
    }

    @Override // xsna.f8q
    public final void P2() {
    }

    @Override // xsna.f8q
    public final void Z0(boolean z) {
    }
}
