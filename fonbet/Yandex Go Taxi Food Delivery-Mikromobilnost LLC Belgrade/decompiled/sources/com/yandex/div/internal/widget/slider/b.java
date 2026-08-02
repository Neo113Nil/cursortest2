package com.yandex.div.internal.widget.slider;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.yandex.div.internal.widget.slider.SliderView;
import defpackage.m810;
import defpackage.ph;
import defpackage.rps0;
import defpackage.sxh0;
import defpackage.vh;
import defpackage.w511;
import defpackage.wh;
import defpackage.xso;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b extends xso {
    public final SliderView G;
    public final Rect H;

    public b(SliderView sliderView) {
        super(sliderView);
        this.G = sliderView;
        this.H = new Rect();
        androidx.core.view.b.p(sliderView, this);
        sliderView.setAccessibilityLiveRegion(1);
    }

    @Override // defpackage.xso
    public final int e(float f, float f2) {
        SliderView sliderView = this.G;
        if (f < sliderView.getPaddingLeft()) {
            return 0;
        }
        int i = a.a[sliderView.getClosestThumb$div_release((int) f).ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        w511.b();
        return 0;
    }

    @Override // defpackage.xso
    public final void f(ArrayList arrayList) {
        arrayList.add(0);
        if (this.G.getThumbSecondaryValue() != null) {
            arrayList.add(1);
        }
    }

    @Override // defpackage.xso
    public final boolean k(int i, int i2, Bundle bundle) {
        float q;
        SliderView sliderView = this.G;
        if (i2 == 4096) {
            q = q(i) + Math.max(m810.a((sliderView.getMaxValue() - sliderView.getMinValue()) * 0.05d), 1);
        } else if (i2 == 8192) {
            q = q(i) - Math.max(m810.a((sliderView.getMaxValue() - sliderView.getMinValue()) * 0.05d), 1);
        } else {
            if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                return false;
            }
            q = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
        }
        sliderView.setValueToAccessibilityThumb$div_release(i == 0 ? SliderView.Thumb.THUMB : sliderView.getThumbSecondaryValue() != null ? SliderView.Thumb.THUMB_SECONDARY : SliderView.Thumb.THUMB, q);
        p(i, 4);
        g(i, 0);
        return true;
    }

    @Override // defpackage.xso
    public final void m(int i, wh whVar) {
        int b;
        int a;
        whVar.p("android.widget.SeekBar");
        SliderView sliderView = this.G;
        whVar.a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) vh.a(sliderView.getMinValue(), sliderView.getMaxValue(), q(i), 0).a);
        StringBuilder sb = new StringBuilder();
        CharSequence contentDescription = sliderView.getContentDescription();
        if (contentDescription != null) {
            sb.append(contentDescription);
            sb.append(",");
        }
        String str = "";
        if (sliderView.getThumbSecondaryValue() != null) {
            if (i == 0) {
                str = sliderView.getContext().getString(sxh0.div_slider_range_start);
            } else if (i == 1) {
                str = sliderView.getContext().getString(sxh0.div_slider_range_end);
            }
        }
        sb.append(str);
        whVar.t(sb.toString());
        whVar.b(ph.k);
        whVar.b(ph.l);
        if (i == 1) {
            rps0 rps0Var = SliderView.Companion;
            Drawable thumbSecondaryDrawable = sliderView.getThumbSecondaryDrawable();
            rps0Var.getClass();
            b = rps0.b(thumbSecondaryDrawable);
            a = rps0.a(sliderView.getThumbSecondaryDrawable());
        } else {
            rps0 rps0Var2 = SliderView.Companion;
            Drawable thumbDrawable = sliderView.getThumbDrawable();
            rps0Var2.getClass();
            b = rps0.b(thumbDrawable);
            a = rps0.a(sliderView.getThumbDrawable());
        }
        int positionInView$div_release = sliderView.getPositionInView$div_release(q(i));
        Rect rect = this.H;
        rect.left = positionInView$div_release;
        rect.right = positionInView$div_release + b;
        rect.top = (((sliderView.getPaddingTop() + sliderView.getHeight()) - sliderView.getPaddingBottom()) - a) / 2;
        rect.bottom = (((sliderView.getPaddingTop() + sliderView.getHeight()) - sliderView.getPaddingBottom()) + a) / 2;
        whVar.k(rect);
    }

    @Override // defpackage.xso, androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
    }

    public final float q(int i) {
        Float thumbSecondaryValue;
        SliderView sliderView = this.G;
        if (i != 0 && (thumbSecondaryValue = sliderView.getThumbSecondaryValue()) != null) {
            return thumbSecondaryValue.floatValue();
        }
        return sliderView.getThumbValue();
    }
}
