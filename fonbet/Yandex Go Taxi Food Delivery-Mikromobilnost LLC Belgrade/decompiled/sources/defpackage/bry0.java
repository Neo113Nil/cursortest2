package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import kotlin.a;
import ru.yandex.taxi.design.ellipsize.TextMiddleEllipsizer$EllipsizingMode;
import ru.yandex.taxi.utils.CustomImageSpan;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes10.dex */
public final class bry0 {
    public final ShimmeringRobotoTextView a;
    public boolean b;
    public boolean c;
    public int g;
    public CharSequence d = "";
    public CharSequence e = "";
    public final i3y f = a.a(new oay0(3, this));
    public final SpannableStringBuilder h = new SpannableStringBuilder();
    public final pry0 i = new pry0(new t6f0(6, this));

    public bry0(ShimmeringRobotoTextView shimmeringRobotoTextView) {
        this.a = shimmeringRobotoTextView;
    }

    public final CharSequence a(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, boolean z) {
        if (!z) {
            return charSequence;
        }
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
        }
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append(" ");
        spannableStringBuilder.append(" ", (CustomImageSpan) this.f.getValue(), 18);
        return spannableStringBuilder;
    }

    public final int b() {
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) shimmeringRobotoTextView.getLayoutParams();
        return shimmeringRobotoTextView.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final boolean c() {
        return this.a.getVisibility() == 0;
    }

    public final int d() {
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) shimmeringRobotoTextView.getLayoutParams();
        return shimmeringRobotoTextView.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public final int e(int i, int i2, int i3, boolean z) {
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) shimmeringRobotoTextView.getLayoutParams();
        int i4 = i3 + marginLayoutParams.topMargin;
        int measuredWidth = z ? ((i - i2) - marginLayoutParams.rightMargin) - shimmeringRobotoTextView.getMeasuredWidth() : marginLayoutParams.leftMargin + i2;
        shimmeringRobotoTextView.layout(measuredWidth, i4, shimmeringRobotoTextView.getMeasuredWidth() + measuredWidth, shimmeringRobotoTextView.getMeasuredHeight() + i4);
        return shimmeringRobotoTextView.getHeight() + i4 + marginLayoutParams.bottomMargin;
    }

    public final void f(int i, int i2) {
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) shimmeringRobotoTextView.getLayoutParams();
        int i3 = i - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        CharSequence charSequence = this.d;
        CharSequence charSequence2 = this.e;
        if (charSequence != charSequence2 || i3 != this.g) {
            this.d = charSequence2;
            this.g = i3;
            boolean z = this.b;
            if (z || this.c) {
                pry0 pry0Var = this.i;
                pry0Var.getClass();
                shimmeringRobotoTextView.setText(a(null, pry0Var.a(charSequence2, TextMiddleEllipsizer$EllipsizingMode.CUSTOM_ELLIPSE), this.b));
            } else {
                shimmeringRobotoTextView.setText(a(null, charSequence2, z));
            }
        }
        shimmeringRobotoTextView.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
    }

    public final void g(CharSequence charSequence) {
        int i = (charSequence == null || charSequence.length() == 0) ? 8 : 0;
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.a;
        shimmeringRobotoTextView.setVisibility(i);
        if (shimmeringRobotoTextView.getVisibility() != 0 || jl40.l(this.e, charSequence)) {
            return;
        }
        this.e = charSequence;
        shimmeringRobotoTextView.requestLayout();
    }
}
