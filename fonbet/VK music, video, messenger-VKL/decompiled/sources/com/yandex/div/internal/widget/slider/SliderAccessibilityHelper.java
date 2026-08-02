package com.yandex.div.internal.widget.slider;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.yandex.div.R$string;
import com.yandex.div.internal.widget.slider.SliderView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.am;
import xsna.an10;
import xsna.iut0;
import xsna.y9q;

/* compiled from: SliderAccessibilityHelper.kt */
/* loaded from: classes7.dex */
public final class SliderAccessibilityHelper extends y9q {
    private final Rect bounds;
    private final SliderView slider;

    /* compiled from: SliderAccessibilityHelper.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SliderView.Thumb.values().length];
            try {
                iArr[SliderView.Thumb.THUMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SliderView.Thumb.THUMB_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SliderAccessibilityHelper(SliderView sliderView) {
        super(sliderView);
        this.slider = sliderView;
        this.bounds = new Rect();
        iut0.q(sliderView, this);
        sliderView.setAccessibilityLiveRegion(1);
    }

    private final int getStep() {
        return Math.max(an10.a((this.slider.getMaxValue() - this.slider.getMinValue()) * 0.05d), 1);
    }

    private final void setThumbValue(int i, float f) {
        this.slider.setValueToAccessibilityThumb$div_release(toThumb(i), f);
        sendEventForVirtualView(i, 4);
        invalidateVirtualView(i);
    }

    private final String startOrEndDescription(int i) {
        return this.slider.getThumbSecondaryValue() == null ? "" : i == 0 ? this.slider.getContext().getString(R$string.div_slider_range_start) : i == 1 ? this.slider.getContext().getString(R$string.div_slider_range_end) : "";
    }

    private final SliderView.Thumb toThumb(int i) {
        return i == 0 ? SliderView.Thumb.THUMB : this.slider.getThumbSecondaryValue() != null ? SliderView.Thumb.THUMB_SECONDARY : SliderView.Thumb.THUMB;
    }

    private final float toThumbValue(int i) {
        if (i == 0) {
            return this.slider.getThumbValue();
        }
        Float thumbSecondaryValue = this.slider.getThumbSecondaryValue();
        return thumbSecondaryValue != null ? thumbSecondaryValue.floatValue() : this.slider.getThumbValue();
    }

    private final void updateBounds(int i) {
        int boundsWidth;
        int boundsHeight;
        if (i == 1) {
            SliderView.Companion companion = SliderView.Companion;
            boundsWidth = companion.getBoundsWidth(this.slider.getThumbSecondaryDrawable());
            boundsHeight = companion.getBoundsHeight(this.slider.getThumbSecondaryDrawable());
        } else {
            SliderView.Companion companion2 = SliderView.Companion;
            boundsWidth = companion2.getBoundsWidth(this.slider.getThumbDrawable());
            boundsHeight = companion2.getBoundsHeight(this.slider.getThumbDrawable());
        }
        int positionInView$div_release = this.slider.getPositionInView$div_release(toThumbValue(i));
        Rect rect = this.bounds;
        rect.left = positionInView$div_release;
        rect.right = positionInView$div_release + boundsWidth;
        rect.top = (((this.slider.getPaddingTop() + this.slider.getHeight()) - this.slider.getPaddingBottom()) - boundsHeight) / 2;
        rect.bottom = (((this.slider.getPaddingTop() + this.slider.getHeight()) - this.slider.getPaddingBottom()) + boundsHeight) / 2;
    }

    @Override // xsna.y9q
    public int getVirtualViewAt(float f, float f2) {
        if (f < this.slider.getPaddingLeft()) {
            return 0;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.slider.getClosestThumb$div_release((int) f).ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.y9q
    public void getVisibleVirtualViews(List<Integer> list) {
        list.add(0);
        if (this.slider.getThumbSecondaryValue() != null) {
            list.add(1);
        }
    }

    @Override // xsna.y9q
    public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        float thumbValue;
        if (i2 == 4096) {
            thumbValue = toThumbValue(i) + getStep();
        } else if (i2 == 8192) {
            thumbValue = toThumbValue(i) - getStep();
        } else {
            if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                return false;
            }
            thumbValue = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
        }
        setThumbValue(i, thumbValue);
        return true;
    }

    @Override // xsna.y9q
    public void onPopulateNodeForVirtualView(int i, am amVar) {
        amVar.n("android.widget.SeekBar");
        amVar.a.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(0, this.slider.getMinValue(), this.slider.getMaxValue(), toThumbValue(i)));
        StringBuilder sb = new StringBuilder();
        CharSequence contentDescription = this.slider.getContentDescription();
        if (contentDescription != null) {
            sb.append(contentDescription);
            sb.append(StringUtils.COMMA);
        }
        sb.append(startOrEndDescription(i));
        amVar.r(sb.toString());
        amVar.b(am.a.i);
        amVar.b(am.a.j);
        updateBounds(i);
        amVar.j(this.bounds);
    }

    @Override // xsna.y9q, xsna.hk
    public void onInitializeAccessibilityNodeInfo(View view, am amVar) {
    }
}
