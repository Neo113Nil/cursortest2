package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.core.utils.text.d;

/* loaded from: classes3.dex */
public final class niz0 {
    public static final float h = 1.0f * Resources.getSystem().getDisplayMetrics().scaledDensity;
    public final SpoilerTextView a;
    public final ImageView b;
    public final LinearLayout c;
    public final float d;
    public final float e = 1.0f * Resources.getSystem().getDisplayMetrics().scaledDensity;
    public final TextPaint f;
    public View.OnLayoutChangeListener g;

    public niz0(SpoilerTextView spoilerTextView, ImageView imageView, LinearLayout linearLayout) {
        this.a = spoilerTextView;
        this.b = imageView;
        this.c = linearLayout;
        this.d = b.h(vvg0.ybsdk_textsize_numbers3, spoilerTextView);
        this.f = new TextPaint(spoilerTextView.getPaint());
    }

    public final void a(Context context, adb0 adb0Var) {
        int i;
        TextPaint textPaint;
        CharSequence a = d.a(context, adb0Var.c);
        if (adb0Var.b != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            i = layoutParams.getMarginEnd() + layoutParams.getMarginStart() + rje.d(ewg0.ybsdk_pfm_expanded_category_header_title_currency_icon_size, context);
        } else {
            i = 0;
        }
        int width = this.c.getWidth() - i;
        SpoilerTextView spoilerTextView = this.a;
        if (width <= 0) {
            spoilerTextView.setText(a);
            return;
        }
        float f = this.d;
        while (true) {
            float f2 = this.e;
            textPaint = this.f;
            if (f < f2) {
                f = f2;
                break;
            }
            textPaint.setTextSize(f);
            if (spoilerTextView.getPaddingRight() + spoilerTextView.getPaddingLeft() + ((int) Math.ceil(Layout.getDesiredWidth(a, textPaint))) <= width) {
                break;
            } else {
                f -= h;
            }
        }
        textPaint.setTextSize(f);
        int min = Math.min(spoilerTextView.getPaddingRight() + spoilerTextView.getPaddingLeft() + ((int) Math.ceil(Layout.getDesiredWidth(a, textPaint))), width);
        spoilerTextView.setTextSize(0, f);
        ViewGroup.LayoutParams layoutParams2 = spoilerTextView.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams2.width = min;
        spoilerTextView.setLayoutParams(layoutParams2);
        spoilerTextView.setText(a);
    }
}
