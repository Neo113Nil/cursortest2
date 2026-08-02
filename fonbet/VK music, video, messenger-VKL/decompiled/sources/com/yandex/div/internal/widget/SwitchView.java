package com.yandex.div.internal.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.yandex.div.core.view2.drawable.NoOpDrawable;
import xsna.izs;
import xsna.n8g;
import xsna.qcz;
import xsna.s3q0;
import xsna.y01;
import xsna.zcl;

/* compiled from: SwitchView.kt */
/* loaded from: classes7.dex */
public class SwitchView extends FrameLayout {
    private static final int[] CHECKED;
    public static final Companion Companion = new Companion(null);
    private static final int[] DEFAULT;
    private static final int[] DISABLED;
    private static final int[][] STATES_ARRAY;
    private Integer colorOn;

    /* renamed from: switch, reason: not valid java name */
    private final SwitchCompat f50switch;
    private final int[] thumbTintColors;
    private final int[] trackTintColors;

    /* compiled from: SwitchView.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    static {
        int[] iArr = {-16842910};
        DISABLED = iArr;
        int[] iArr2 = {R.attr.state_checked};
        CHECKED = iArr2;
        int[] iArr3 = new int[0];
        DEFAULT = iArr3;
        STATES_ARRAY = new int[][]{iArr, iArr2, iArr3};
    }

    public SwitchView(Context context) {
        super(context);
        SwitchCompat switchCompat = new SwitchCompat(context, null);
        this.f50switch = switchCompat;
        this.trackTintColors = new int[3];
        this.thumbTintColors = new int[3];
        switchCompat.setShowText(false);
        switchCompat.setBackground(NoOpDrawable.INSTANCE);
        addView(switchCompat, new FrameLayout.LayoutParams(-2, -2, 17));
        setOnClickListener(new y01(this, 13));
        fillDefaultColors();
        updateTints();
    }

    private final int applyAlpha(int i, float f) {
        return setAlpha(i, (int) (Color.alpha(i) * f));
    }

    private final void changeTints() {
        Integer num = this.colorOn;
        if (num != null) {
            int intValue = num.intValue();
            this.thumbTintColors[1] = intValue;
            this.trackTintColors[1] = applyAlpha(intValue, 0.3f);
            updateTints();
        }
    }

    private final void fillDefaultColors() {
        TypedValue typedValue = new TypedValue();
        int colorFromTheme = getColorFromTheme(R.attr.colorForeground, typedValue, false);
        int colorFromTheme2 = getColorFromTheme(R.attr.colorControlActivated, typedValue, false);
        int colorFromTheme3 = getColorFromTheme(com.vkontakte.android.R.attr.colorSwitchThumbNormal, typedValue, true);
        this.trackTintColors[1] = applyAlpha(colorFromTheme2, 0.3f);
        this.trackTintColors[2] = setAlpha(colorFromTheme, 0.3f);
        this.trackTintColors[0] = setAlpha(colorFromTheme, 0.1f);
        int[] iArr = this.thumbTintColors;
        iArr[1] = colorFromTheme2;
        iArr[2] = colorFromTheme3;
        iArr[0] = lightenColor(colorFromTheme3, 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forwardClicksToSwitch() {
        if (isEnabled()) {
            this.f50switch.performClick();
        }
    }

    private final int getColorFromTheme(int i, TypedValue typedValue, boolean z) {
        if (getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return (!z || typedValue.resourceId == 0) ? typedValue.data : getContext().getColor(typedValue.resourceId);
        }
        return 0;
    }

    private final int lightenColor(int i, float f) {
        return n8g.d(f, i, -1);
    }

    private final int setAlpha(int i, int i2) {
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnCheckedChangeListener$lambda$2(izs izsVar, CompoundButton compoundButton, boolean z) {
        izsVar.invoke(Boolean.valueOf(z));
    }

    private final void updateTints() {
        SwitchCompat switchCompat = this.f50switch;
        int[][] iArr = STATES_ARRAY;
        switchCompat.setTrackTintList(new ColorStateList(iArr, this.trackTintColors));
        this.f50switch.setThumbTintList(new ColorStateList(iArr, this.thumbTintColors));
    }

    public final Integer getColorOn() {
        return this.colorOn;
    }

    public final ColorStateList getThumbTintList$div_release() {
        return this.f50switch.getThumbTintList();
    }

    public final ColorStateList getTrackTintList$div_release() {
        return this.f50switch.getTrackTintList();
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f50switch.isEnabled();
    }

    public final void setChecked(boolean z) {
        this.f50switch.setChecked(z);
    }

    public final void setColorOn(Integer num) {
        this.colorOn = num;
        changeTints();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.f50switch.setEnabled(z);
    }

    public final void setOnCheckedChangeListener(izs<? super Boolean, s3q0> izsVar) {
        this.f50switch.setOnCheckedChangeListener(new qcz(izsVar, 2));
    }

    private final int setAlpha(int i, float f) {
        return setAlpha(i, (int) (f * 255));
    }

    public static /* synthetic */ void getThumbTintList$div_release$annotations() {
    }

    public static /* synthetic */ void getTrackTintList$div_release$annotations() {
    }
}
