package defpackage;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.alicekit.core.views.EllipsizingTextView;

/* loaded from: classes11.dex */
public final class cty0 {
    public final yvf0 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Integer f;
    public int g;

    public cty0(yvf0 yvf0Var, int i, int i2, int i3, int i4, int i5, Integer num) {
        this.a = yvf0Var;
        this.b = i;
        this.g = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = num;
    }

    public final void a(TextView textView) {
        float f;
        textView.setTypeface((Typeface) this.a.get());
        textView.setTextColor(textView.getContext().getColor(this.b));
        Resources resources = textView.getResources();
        if (this.g <= 0) {
            this.g = resources.getDimensionPixelSize(this.c);
        }
        textView.setTextSize(0, this.g);
        textView.setLineSpacing(resources.getDimensionPixelSize(this.e), 1.0f);
        textView.setTextAlignment(2);
        int i = this.d;
        if (i != 0) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(i, typedValue, true);
            f = typedValue.getFloat();
        } else {
            f = 0.0f;
        }
        textView.setLetterSpacing(f);
    }

    public final void b(AppCompatTextView appCompatTextView) {
        a(appCompatTextView);
        Integer num = this.f;
        if (num != null) {
            appCompatTextView.setMaxLines(num.intValue());
        }
        if (appCompatTextView instanceof EllipsizingTextView) {
            ((EllipsizingTextView) appCompatTextView).setEllipsis((char) 8230);
        }
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cty0)) {
            return false;
        }
        cty0 cty0Var = (cty0) obj;
        Integer num2 = cty0Var.f;
        return this.b == cty0Var.b && this.g == cty0Var.g && this.d == cty0Var.d && this.e == cty0Var.e && ((Typeface) this.a.get()).equals(cty0Var.a.get()) && (((num = this.f) == null && num2 == null) || !(num == null || num2 == null || !num.equals(num2)));
    }

    public final int hashCode() {
        return ((Typeface) this.a.get()).hashCode();
    }
}
