package com.google.android.material.slider;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import defpackage.kxh0;
import defpackage.ph;
import defpackage.sb2;
import defpackage.tp31;
import defpackage.vh;
import defpackage.vih0;
import defpackage.wh;
import defpackage.xso;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class f extends xso {
    public final BaseSlider G;
    public final Rect H;

    public f(BaseSlider baseSlider) {
        super(baseSlider);
        this.H = new Rect();
        this.G = baseSlider;
    }

    @Override // defpackage.xso
    public final int e(float f, float f2) {
        int i = 0;
        while (true) {
            BaseSlider baseSlider = this.G;
            if (i >= baseSlider.getValues().size()) {
                return -1;
            }
            Rect rect = this.H;
            baseSlider.updateBoundsForVirtualViewId(i, rect);
            if (rect.contains((int) f, (int) f2)) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.xso
    public final void f(ArrayList arrayList) {
        for (int i = 0; i < this.G.getValues().size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // defpackage.xso
    public final boolean k(int i, int i2, Bundle bundle) {
        float calculateStepIncrement;
        boolean snapThumbToValue;
        boolean snapThumbToValue2;
        BaseSlider baseSlider = this.G;
        if (!baseSlider.isEnabled()) {
            return false;
        }
        if (i2 != 4096 && i2 != 8192) {
            if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                snapThumbToValue2 = baseSlider.snapThumbToValue(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"));
                if (snapThumbToValue2) {
                    baseSlider.updateHaloHotspot();
                    baseSlider.postInvalidate();
                    return true;
                }
            }
            return false;
        }
        calculateStepIncrement = baseSlider.calculateStepIncrement(20);
        if (i2 == 8192) {
            calculateStepIncrement = -calculateStepIncrement;
        }
        if (baseSlider.isRtl()) {
            calculateStepIncrement = -calculateStepIncrement;
        }
        snapThumbToValue = baseSlider.snapThumbToValue(i, sb2.j(baseSlider.getValues().get(i).floatValue() + calculateStepIncrement, baseSlider.getValueFrom(), baseSlider.getValueTo()));
        if (!snapThumbToValue) {
            return false;
        }
        baseSlider.setActiveThumbIndex(i);
        baseSlider.scheduleTooltipTimeout();
        baseSlider.updateHaloHotspot();
        baseSlider.postInvalidate();
        return true;
    }

    @Override // defpackage.xso
    public final void m(int i, wh whVar) {
        String formatValue;
        Object tag;
        String unused;
        whVar.b(ph.u);
        BaseSlider baseSlider = this.G;
        List<Float> values = baseSlider.getValues();
        float floatValue = values.get(i).floatValue();
        float valueFrom = baseSlider.getValueFrom();
        float valueTo = baseSlider.getValueTo();
        if (baseSlider.isEnabled()) {
            if (floatValue > valueFrom) {
                whVar.a(8192);
            }
            if (floatValue < valueTo) {
                whVar.a(4096);
            }
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        try {
            valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
            valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
            floatValue = numberInstance.parse(numberInstance.format(floatValue)).floatValue();
        } catch (ParseException unused2) {
            unused = BaseSlider.TAG;
        }
        whVar.a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) vh.a(valueFrom, valueTo, floatValue, 1).a);
        whVar.p(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (baseSlider.getContentDescription() != null) {
            sb.append(baseSlider.getContentDescription());
            sb.append(",");
        }
        formatValue = baseSlider.formatValue(floatValue);
        String string = baseSlider.getContext().getString(kxh0.material_slider_value);
        if (values.size() > 1) {
            string = i == baseSlider.getValues().size() - 1 ? baseSlider.getContext().getString(kxh0.material_slider_range_end) : i == 0 ? baseSlider.getContext().getString(kxh0.material_slider_range_start) : "";
        }
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        int i2 = vih0.tag_state_description;
        if (Build.VERSION.SDK_INT >= 30) {
            tag = tp31.b(baseSlider);
        } else {
            tag = baseSlider.getTag(i2);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        if (TextUtils.isEmpty(charSequence)) {
            Locale.getDefault();
            sb.append(string + Extension.FIX_SPACE + formatValue);
        } else {
            whVar.D(charSequence);
        }
        whVar.t(sb.toString());
        Rect rect = this.H;
        baseSlider.updateBoundsForVirtualViewId(i, rect);
        whVar.k(rect);
    }
}
