package defpackage;

import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmCategoriesView;
import com.ybsdk.widgets.common.ColorFilterConstraintLayout;
import kotlin.a;

/* loaded from: classes3.dex */
public final class i59 {
    public final PfmCategoriesView a;
    public final i3y b = a.a(new ju8(9, this));
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public Integer i;

    public i59(PfmCategoriesView pfmCategoriesView) {
        this.a = pfmCategoriesView;
        this.c = rje.d(ewg0.ybsdk_pfm_category_margin_horizontal, pfmCategoriesView.getContext());
        this.d = rje.d(ewg0.ybsdk_pfm_category_default_width, pfmCategoriesView.getContext());
        this.e = rje.d(ewg0.ybsdk_pfm_category_amounts_horizontal_margins, pfmCategoriesView.getContext()) * 2;
        this.f = rje.d(ewg0.ybsdk_pfm_category_amount_icon_size, pfmCategoriesView.getContext());
        this.g = rje.d(ewg0.ybsdk_pfm_category_subtitle_icon_size, pfmCategoriesView.getContext());
        this.h = rje.d(ewg0.ybsdk_pfm_category_small_icons_margin_start, pfmCategoriesView.getContext());
    }

    public final int a(l9b0 l9b0Var, int i) {
        if (i == 0) {
            return 0;
        }
        i261 i261Var = (i261) this.b.getValue();
        ColorFilterConstraintLayout colorFilterConstraintLayout = i261Var.a;
        he60 he60Var = l9b0Var.f;
        i261Var.o.setVisibility(8);
        i261Var.j.setVisibility(8);
        i261Var.e.setVisibility(l9b0Var.g != null ? 0 : 8);
        com.ybsdk.feature.pfm.internal.ui.delegates.a.e(he60Var, i261Var);
        com.ybsdk.feature.pfm.internal.ui.delegates.a.d(he60Var, i261Var);
        colorFilterConstraintLayout.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return colorFilterConstraintLayout.getMeasuredHeight();
    }

    public final int b(edb0 edb0Var, SpoilerTextView spoilerTextView, boolean z) {
        Integer num;
        double ceil;
        if (edb0Var instanceof adb0) {
            adb0 adb0Var = (adb0) edb0Var;
            String obj = d.a(spoilerTextView.getContext(), adb0Var.c).toString();
            if (spoilerTextView.getMaxLines() == 1) {
                ceil = Math.ceil(spoilerTextView.getPaint().measureText(obj));
            } else {
                TextPaint paint = spoilerTextView.getPaint();
                int maxLines = spoilerTextView.getMaxLines();
                StaticLayout build = StaticLayout.Builder.obtain(obj, 0, obj.length(), paint, Integer.MAX_VALUE).setMaxLines(maxLines).build();
                int lineCount = build.getLineCount();
                if (lineCount <= maxLines) {
                    maxLines = lineCount;
                }
                float f = 0.0f;
                for (int i = 0; i < maxLines; i++) {
                    float lineWidth = build.getLineWidth(i);
                    if (lineWidth > f) {
                        f = lineWidth;
                    }
                }
                ceil = Math.ceil(f);
            }
            num = Integer.valueOf(((int) ceil) + this.e + (adb0Var.b != null ? (z ? this.f : this.g) + this.h : 0));
        } else if (edb0Var instanceof bdb0) {
            num = 0;
        } else {
            if (!edb0Var.equals(ddb0.a)) {
                w511.b();
                return 0;
            }
            num = this.i;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int c(he60 he60Var, i261 i261Var) {
        SpoilerTextView spoilerTextView = i261Var.k;
        SpoilerTextView spoilerTextView2 = i261Var.f;
        boolean z = he60Var instanceof ge60;
        int r = z ? kp50.r(2) : 0;
        LinearLayout linearLayout = i261Var.g;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), r, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        if (z) {
            return b(((ge60) he60Var).a, spoilerTextView2, false);
        }
        if (he60Var instanceof fe60) {
            fe60 fe60Var = (fe60) he60Var;
            return Math.max(b(fe60Var.a, spoilerTextView, true), b(fe60Var.b, spoilerTextView2, false));
        }
        w511.b();
        return 0;
    }
}
