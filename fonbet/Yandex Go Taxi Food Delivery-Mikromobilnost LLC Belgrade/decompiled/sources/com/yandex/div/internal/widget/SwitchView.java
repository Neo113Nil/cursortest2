package com.yandex.div.internal.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.b;
import com.yandex.div.core.view2.drawable.NoOpDrawable;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ei;
import defpackage.iog0;
import defpackage.lhc;
import defpackage.ojb;
import defpackage.t37;
import defpackage.tls;
import defpackage.vzw0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0010\u0018\u0000 ?2\u00020\u0001:\u0001@B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ'\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0017\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u00062\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060$¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R.\u0010+\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u001c\u00109\u001a\u0004\u0018\u0001058@X\u0081\u0004¢\u0006\f\u0012\u0004\b8\u0010\b\u001a\u0004\b6\u00107R\u001c\u0010<\u001a\u0004\u0018\u0001058@X\u0081\u0004¢\u0006\f\u0012\u0004\b;\u0010\b\u001a\u0004\b:\u00107R$\u0010=\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010 \"\u0004\b>\u0010#¨\u0006A"}, d2 = {"Lcom/yandex/div/internal/widget/SwitchView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "changeTints", "()V", "updateTints", "fillDefaultColors", "", "resId", "Landroid/util/TypedValue;", "typedValue", "", "outputIsResource", "getColorFromTheme", "(ILandroid/util/TypedValue;Z)I", "", "value", "applyAlpha", "(IF)I", "setAlpha", "(II)I", "lightenColor", "forwardClicksToSwitch", "onAttachedToWindow", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "isEnabled", "()Z", BackendConfig.Restrictions.ENABLED, "setEnabled", "(Z)V", "Lkotlin/Function1;", "listener", "setOnCheckedChangeListener", "(Ltls;)V", "Landroidx/appcompat/widget/SwitchCompat;", "switch", "Landroidx/appcompat/widget/SwitchCompat;", "colorOn", "Ljava/lang/Integer;", "getColorOn", "()Ljava/lang/Integer;", "setColorOn", "(Ljava/lang/Integer;)V", "", "trackTintColors", "[I", "thumbTintColors", "Landroid/content/res/ColorStateList;", "getThumbTintList$div_release", "()Landroid/content/res/ColorStateList;", "getThumbTintList$div_release$annotations", "thumbTintList", "getTrackTintList$div_release", "getTrackTintList$div_release$annotations", "trackTintList", "isChecked", "setChecked", "Companion", "vzw0", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class SwitchView extends FrameLayout {
    private static final int[] CHECKED;
    private static final int CHECKED_INDEX = 1;
    public static final vzw0 Companion = new vzw0();
    private static final int[] DEFAULT;
    private static final int[] DISABLED;
    private static final int DISABLED_INDEX = 0;
    private static final int[][] STATES_ARRAY;
    private static final int UNCHECKED_INDEX = 2;
    private Integer colorOn;
    private final SwitchCompat switch;
    private final int[] thumbTintColors;
    private final int[] trackTintColors;

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
        SwitchCompat switchCompat = new SwitchCompat(context);
        this.switch = switchCompat;
        this.trackTintColors = new int[3];
        this.thumbTintColors = new int[3];
        switchCompat.setShowText(false);
        switchCompat.setBackground(NoOpDrawable.INSTANCE);
        switchCompat.setImportantForAccessibility(2);
        switchCompat.setFocusable(false);
        switchCompat.setFocusableInTouchMode(false);
        addView(switchCompat, new FrameLayout.LayoutParams(-2, -2, 17));
        setOnClickListener(new t37(5, this));
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
        int colorFromTheme3 = getColorFromTheme(iog0.colorSwitchThumbNormal, typedValue, true);
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
            this.switch.performClick();
        }
    }

    private final int getColorFromTheme(int resId, TypedValue typedValue, boolean outputIsResource) {
        if (getContext().getTheme().resolveAttribute(resId, typedValue, true)) {
            return (!outputIsResource || typedValue.resourceId == 0) ? typedValue.data : getContext().getColor(typedValue.resourceId);
        }
        return 0;
    }

    public static /* synthetic */ void getThumbTintList$div_release$annotations() {
    }

    public static /* synthetic */ void getTrackTintList$div_release$annotations() {
    }

    private final int lightenColor(int i, float f) {
        return lhc.b(f, i, -1);
    }

    private final int setAlpha(int i, int i2) {
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnCheckedChangeListener$lambda$2(tls tlsVar, CompoundButton compoundButton, boolean z) {
        tlsVar.invoke(Boolean.valueOf(z));
    }

    private final void updateTints() {
        SwitchCompat switchCompat = this.switch;
        int[][] iArr = STATES_ARRAY;
        switchCompat.setTrackTintList(new ColorStateList(iArr, this.trackTintColors));
        this.switch.setThumbTintList(new ColorStateList(iArr, this.thumbTintColors));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Switch";
    }

    public final Integer getColorOn() {
        return this.colorOn;
    }

    public final ColorStateList getThumbTintList$div_release() {
        return this.switch.getThumbTintList();
    }

    public final ColorStateList getTrackTintList$div_release() {
        return this.switch.getTrackTintList();
    }

    public final boolean isChecked() {
        return this.switch.isChecked();
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.switch.isEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b.f(this) == null) {
            b.p(this, new ei(26));
        }
    }

    public final void setChecked(boolean z) {
        this.switch.setChecked(z);
    }

    public final void setColorOn(Integer num) {
        this.colorOn = num;
        changeTints();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        this.switch.setEnabled(enabled);
    }

    public final void setOnCheckedChangeListener(tls listener) {
        this.switch.setOnCheckedChangeListener(new ojb(1, listener));
    }

    private final int setAlpha(int i, float f) {
        return setAlpha(i, (int) (f * 255.0f));
    }
}
