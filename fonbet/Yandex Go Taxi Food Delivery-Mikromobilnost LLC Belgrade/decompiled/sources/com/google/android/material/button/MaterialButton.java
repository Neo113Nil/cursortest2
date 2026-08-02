package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.e;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.StateListSizeChange;
import com.google.android.material.shape.b;
import com.google.android.material.shape.c;
import defpackage.b810;
import defpackage.e710;
import defpackage.eja1;
import defpackage.eng0;
import defpackage.f710;
import defpackage.fbz;
import defpackage.fhr0;
import defpackage.g2i0;
import defpackage.g710;
import defpackage.g810;
import defpackage.i710;
import defpackage.j710;
import defpackage.jx81;
import defpackage.kp50;
import defpackage.mor;
import defpackage.nwt0;
import defpackage.ny61;
import defpackage.owt0;
import defpackage.p500;
import defpackage.qke;
import defpackage.tt91;
import defpackage.uhx;
import defpackage.uir0;
import defpackage.v9j;
import defpackage.vng;
import defpackage.xm2;
import defpackage.yvy0;
import defpackage.z2i0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes11.dex */
public class MaterialButton extends AppCompatButton implements Checkable, uir0 {
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;
    private static final String LOG_TAG = "MaterialButton";
    private static final float OPTICAL_CENTER_RATIO = 0.11f;
    private static final int UNSET = Integer.MIN_VALUE;
    private String accessibilityClassName;
    int allowedWidthDecrease;
    private boolean broadcasting;
    private boolean checked;
    private float displayedWidthDecrease;
    private float displayedWidthIncrease;
    private Drawable icon;
    private int iconGravity;
    private int iconLeft;
    private int iconPadding;
    private int iconSize;
    private ColorStateList iconTint;
    private PorterDuff.Mode iconTintMode;
    private int iconTop;
    private boolean isInHorizontalButtonGroup;
    private final j710 materialButtonHelper;
    private final LinkedHashSet<f710> onCheckedChangeListeners;
    private g710 onPressedChangeListenerInternal;
    private boolean opticalCenterEnabled;
    private int opticalCenterShift;
    private int orientation;
    private LinearLayout.LayoutParams originalLayoutParams;
    private int originalPaddingEnd;
    private int originalPaddingStart;
    private float originalWidth;
    private Drawable secondaryIcon;
    private int secondaryIconGravity;
    private int secondaryIconLeft;
    private ColorStateList secondaryIconTint;
    private PorterDuff.Mode secondaryIconTintMode;
    private int secondaryIconTop;
    StateListSizeChange sizeChange;
    private boolean stopNullSecondaryIconUpdate;
    private WidthChangeDirection widthChangeDirection;
    int widthChangeMax;
    private nwt0 widthIncreaseSpringAnimation;
    private static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int DEF_STYLE_RES = g2i0.Widget_MaterialComponents_Button;
    private static final int MATERIAL_SIZE_OVERLAY_ATTR = eng0.materialSizeOverlay;
    private static final mor WIDTH_INCREASE = new v9j(2);

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<MaterialButton> {
        private int mIconPaddingId;
        private boolean mPropertiesMapped = false;

        @Override // android.view.inspector.InspectionCompanion
        public void mapProperties(PropertyMapper propertyMapper) {
            this.mIconPaddingId = propertyMapper.mapInt("iconPadding", eng0.iconPadding);
            this.mPropertiesMapped = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public void readProperties(MaterialButton materialButton, PropertyReader propertyReader) {
            if (!this.mPropertiesMapped) {
                throw new InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readInt(this.mIconPaddingId, materialButton.getIconPadding());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WidthChangeDirection {
        private static final /* synthetic */ WidthChangeDirection[] $VALUES;
        public static final WidthChangeDirection BOTH;
        public static final WidthChangeDirection END;
        public static final WidthChangeDirection NONE;
        public static final WidthChangeDirection START;

        static {
            WidthChangeDirection widthChangeDirection = new WidthChangeDirection(JCP.RAW_PREFIX, 0);
            NONE = widthChangeDirection;
            WidthChangeDirection widthChangeDirection2 = new WidthChangeDirection("START", 1);
            START = widthChangeDirection2;
            WidthChangeDirection widthChangeDirection3 = new WidthChangeDirection("END", 2);
            END = widthChangeDirection3;
            WidthChangeDirection widthChangeDirection4 = new WidthChangeDirection("BOTH", 3);
            BOTH = widthChangeDirection4;
            $VALUES = new WidthChangeDirection[]{widthChangeDirection, widthChangeDirection2, widthChangeDirection3, widthChangeDirection4};
        }

        public static WidthChangeDirection valueOf(String str) {
            return (WidthChangeDirection) Enum.valueOf(WidthChangeDirection.class, str);
        }

        public static WidthChangeDirection[] values() {
            return (WidthChangeDirection[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(g810.a(i, r4, context, attributeSet, new int[]{MATERIAL_SIZE_OVERLAY_ATTR}), attributeSet, i);
        int i2 = DEF_STYLE_RES;
        this.onCheckedChangeListeners = new LinkedHashSet<>();
        this.checked = false;
        this.broadcasting = false;
        this.orientation = Integer.MIN_VALUE;
        this.originalWidth = -2.1474836E9f;
        this.originalPaddingStart = Integer.MIN_VALUE;
        this.originalPaddingEnd = Integer.MIN_VALUE;
        this.allowedWidthDecrease = Integer.MIN_VALUE;
        this.widthChangeDirection = WidthChangeDirection.BOTH;
        Context context2 = getContext();
        TypedArray d = yvy0.d(context2, attributeSet, z2i0.MaterialButton, i, i2, new int[0]);
        this.iconPadding = d.getDimensionPixelSize(z2i0.MaterialButton_iconPadding, 0);
        int i3 = d.getInt(z2i0.MaterialButton_iconTintMode, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.iconTintMode = e.j(i3, mode);
        this.iconTint = jx81.o(getContext(), d, z2i0.MaterialButton_iconTint);
        this.icon = jx81.q(getContext(), d, z2i0.MaterialButton_icon);
        this.iconGravity = d.getInteger(z2i0.MaterialButton_iconGravity, 1);
        this.iconSize = d.getDimensionPixelSize(z2i0.MaterialButton_iconSize, 0);
        this.secondaryIconTintMode = e.j(d.getInt(z2i0.MaterialButton_secondaryIconTintMode, -1), mode);
        this.secondaryIconTint = d.hasValue(z2i0.MaterialButton_secondaryIconTint) ? jx81.o(getContext(), d, z2i0.MaterialButton_secondaryIconTint) : this.iconTint;
        this.secondaryIconGravity = d.getInteger(z2i0.MaterialButton_secondaryIconGravity, 3);
        Drawable q = jx81.q(getContext(), d, z2i0.MaterialButton_secondaryIcon);
        this.secondaryIcon = q;
        this.stopNullSecondaryIconUpdate = q == null;
        fhr0 h = c.h(context2, d, z2i0.MaterialButton_shapeAppearance);
        h = h == null ? b.j(context2, attributeSet, i, i2).a() : h;
        boolean z = d.getBoolean(z2i0.MaterialButton_opticalCenterEnabled, false);
        j710 j710Var = new j710(this, h);
        this.materialButtonHelper = j710Var;
        j710Var.e = d.getDimensionPixelOffset(z2i0.MaterialButton_android_insetLeft, 0);
        j710Var.f = d.getDimensionPixelOffset(z2i0.MaterialButton_android_insetRight, 0);
        j710Var.g = d.getDimensionPixelOffset(z2i0.MaterialButton_android_insetTop, 0);
        j710Var.h = d.getDimensionPixelOffset(z2i0.MaterialButton_android_insetBottom, 0);
        if (d.hasValue(z2i0.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = d.getDimensionPixelSize(z2i0.MaterialButton_cornerRadius, -1);
            j710Var.i = dimensionPixelSize;
            j710Var.b = j710Var.b.a(dimensionPixelSize);
            j710Var.d();
            j710Var.r = true;
        }
        j710Var.j = d.getDimensionPixelSize(z2i0.MaterialButton_strokeWidth, 0);
        j710Var.k = e.j(d.getInt(z2i0.MaterialButton_backgroundTintMode, -1), mode);
        j710Var.l = jx81.o(getContext(), d, z2i0.MaterialButton_backgroundTint);
        j710Var.m = jx81.o(getContext(), d, z2i0.MaterialButton_strokeColor);
        j710Var.n = jx81.o(getContext(), d, z2i0.MaterialButton_rippleColor);
        j710Var.s = d.getBoolean(z2i0.MaterialButton_android_checkable, false);
        j710Var.v = d.getDimensionPixelSize(z2i0.MaterialButton_elevation, 0);
        j710Var.t = d.getBoolean(z2i0.MaterialButton_toggleCheckedStateOnClick, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (d.hasValue(z2i0.MaterialButton_android_background)) {
            j710Var.q = true;
            setSupportBackgroundTintList(j710Var.l);
            setSupportBackgroundTintMode(j710Var.k);
        } else {
            j710Var.c();
        }
        setPaddingRelative(paddingStart + j710Var.e, paddingTop + j710Var.g, paddingEnd + j710Var.f, paddingBottom + j710Var.h);
        setCheckedInternal(d.getBoolean(z2i0.MaterialButton_android_checked, false));
        if (h instanceof c) {
            j710Var.c = createSpringForce();
            if (j710Var.b instanceof c) {
                j710Var.d();
            }
        }
        setOpticalCenterEnabled(z);
        d.recycle();
        setCompoundDrawablePadding(this.iconPadding);
        updateIcon(this.icon != null);
        updateSecondaryIcon(this.secondaryIcon != null);
    }

    private boolean areIconsGravitySameAlignment() {
        if (isIconStart() && isSecondaryIconStart()) {
            return true;
        }
        if (isIconEnd() && isSecondaryIconEnd()) {
            return true;
        }
        return isIconTop() && isSecondaryIconTop();
    }

    private int calculateEffectiveWidthChangeMax() {
        int ordinal = this.widthChangeDirection.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return this.widthChangeMax / 2;
        }
        if (ordinal != 3) {
            return 0;
        }
        return this.widthChangeMax;
    }

    private boolean canUpdateWithoutTextAlignment(int i) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i == 1 || i == 3 || (i == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    private owt0 createSpringForce() {
        return kp50.Q(getContext(), eng0.motionSpringFastSpatial, g2i0.Motion_Material3_Spring_Standard_Fast_Spatial);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.displayedWidthIncrease;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getIconLeft(int i, int i2) {
        int i3;
        int i4;
        Drawable drawable = this.icon;
        if (drawable != null) {
            i3 = this.iconSize;
            if (i3 == 0) {
                i3 = drawable.getIntrinsicWidth();
            }
        } else {
            i3 = 0;
        }
        Drawable drawable2 = this.secondaryIcon;
        if (drawable2 != null) {
            i4 = this.iconSize;
            if (i4 == 0) {
                i4 = drawable2.getIntrinsicWidth();
            }
        } else {
            i4 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - i3) - i4) - this.iconPadding) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return isLayoutRTL() != (i2 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    private int getIconTop(int i, int i2) {
        return Math.max(0, (((((i - getTextHeight()) - getPaddingTop()) - i2) - this.iconPadding) - getPaddingBottom()) / 2);
    }

    private int getOpticalCenterShift() {
        MaterialShapeDrawable a;
        if (this.opticalCenterEnabled && this.isInHorizontalButtonGroup && (a = this.materialButtonHelper.a(false)) != null) {
            return (int) (a.getCornerSizeDiffX() * OPTICAL_CENTER_RATIO);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    private Drawable getUpdatedIconFor(int i) {
        if (i == 0) {
            if (this.secondaryIcon == null || !isSecondaryIconStart()) {
                return null;
            }
            return this.secondaryIcon;
        }
        if (i == 1) {
            if (this.secondaryIcon == null || !isSecondaryIconTop()) {
                return null;
            }
            return this.secondaryIcon;
        }
        if (i == 2 && this.secondaryIcon != null && isSecondaryIconEnd()) {
            return this.secondaryIcon;
        }
        return null;
    }

    private Drawable getUpdatedSecondaryIconFor(int i) {
        if (i == 0) {
            if (this.icon == null || !isIconStart()) {
                return null;
            }
            return this.icon;
        }
        if (i == 1) {
            if (this.icon == null || !isIconEnd()) {
                return null;
            }
            return this.icon;
        }
        if (i == 2 && this.icon != null && isIconEnd()) {
            return this.icon;
        }
        return null;
    }

    private void initializeSizeAnimation() {
        nwt0 nwt0Var = new nwt0(this, WIDTH_INCREASE);
        this.widthIncreaseSpringAnimation = nwt0Var;
        nwt0Var.u = createSpringForce();
    }

    private boolean isIconEnd() {
        int i = this.iconGravity;
        return i == 3 || i == 4;
    }

    private boolean isIconStart() {
        int i = this.iconGravity;
        return i == 1 || i == 2;
    }

    private boolean isIconTop() {
        int i = this.iconGravity;
        return i == 16 || i == 32;
    }

    private boolean isInHorizontalButtonGroup() {
        return (getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).getOrientation() == 0;
    }

    private boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    private boolean isSecondaryIconEnd() {
        int i = this.secondaryIconGravity;
        return i == 3 || i == 4;
    }

    private boolean isSecondaryIconStart() {
        int i = this.secondaryIconGravity;
        return i == 1 || i == 2;
    }

    private boolean isSecondaryIconTop() {
        int i = this.secondaryIconGravity;
        return i == 16 || i == 32;
    }

    private boolean isUsingOriginalBackground() {
        j710 j710Var = this.materialButtonHelper;
        return (j710Var == null || j710Var.q) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeRunAfterWidthAnimation$0(Runnable runnable) {
        runnable.run();
        recoverOriginalLayoutParams();
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOpticalCenterEnabled$4(float f) {
        int i = (int) (f * OPTICAL_CENTER_RATIO);
        if (this.opticalCenterShift != i) {
            this.opticalCenterShift = i;
            updatePaddingsAndSizeForWidthAnimation();
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOpticalCenterEnabled$5() {
        this.opticalCenterShift = getOpticalCenterShift();
        updatePaddingsAndSizeForWidthAnimation();
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
    
        if (r1 == com.google.android.material.shape.StateListSizeChange.SizeChangeType.PIXELS) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void maybeAnimateSize(boolean z) {
        int i;
        if (this.sizeChange == null) {
            return;
        }
        if (this.widthIncreaseSpringAnimation == null) {
            initializeSizeAnimation();
        }
        if (this.isInHorizontalButtonGroup) {
            int calculateEffectiveWidthChangeMax = calculateEffectiveWidthChangeMax();
            StateListSizeChange stateListSizeChange = this.sizeChange;
            int[] drawableState = getDrawableState();
            int[][] iArr = stateListSizeChange.c;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = -1;
                if (i3 >= stateListSizeChange.a) {
                    i3 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i3], drawableState)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = stateListSizeChange.c;
                int i4 = 0;
                while (true) {
                    if (i4 >= stateListSizeChange.a) {
                        break;
                    }
                    if (StateSet.stateSetMatches(iArr3[i4], iArr2)) {
                        i = i4;
                        break;
                    }
                    i4++;
                }
                i3 = i;
            }
            com.google.android.material.shape.e eVar = (i3 < 0 ? stateListSizeChange.b : stateListSizeChange.d[i3]).a;
            int width = getWidth();
            float f = eVar.b;
            StateListSizeChange.SizeChangeType sizeChangeType = eVar.a;
            if (sizeChangeType == StateListSizeChange.SizeChangeType.PERCENT) {
                f *= width;
            }
            i2 = (int) f;
            this.widthIncreaseSpringAnimation.i(Math.min(calculateEffectiveWidthChangeMax, i2));
            if (z) {
                this.widthIncreaseSpringAnimation.j();
            }
        }
    }

    private boolean maybeRunAfterWidthAnimation(Runnable runnable) {
        nwt0 nwt0Var = this.widthIncreaseSpringAnimation;
        if (nwt0Var == null || !nwt0Var.f) {
            return false;
        }
        post(new p500(10, this, runnable));
        return true;
    }

    private void setCheckedInternal(boolean z) {
        if (!isCheckable() || this.checked == z) {
            return;
        }
        this.checked = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            ((MaterialButtonToggleGroup) getParent()).onButtonCheckedStateChanged(this, this.checked);
        }
        if (this.broadcasting) {
            return;
        }
        this.broadcasting = true;
        Iterator<f710> it = this.onCheckedChangeListeners.iterator();
        while (it.hasNext()) {
            f710 next = it.next();
            b810 b810Var = (b810) next;
            b810Var.a.lambda$addView$0(b810Var.b, this, this.checked);
        }
        this.broadcasting = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        if (this.displayedWidthIncrease != f) {
            this.displayedWidthIncrease = f;
            updatePaddingsAndSizeForWidthAnimation();
            invalidate();
            if (getParent() instanceof MaterialButtonGroup) {
                ((MaterialButtonGroup) getParent()).onButtonWidthChanged(this, (int) this.displayedWidthIncrease);
            }
        }
    }

    private void updateIcon(boolean z) {
        Drawable drawable = this.icon;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.icon = mutate;
            mutate.setTintList(this.iconTint);
            PorterDuff.Mode mode = this.iconTintMode;
            if (mode != null) {
                this.icon.setTintMode(mode);
            }
            int i = this.iconSize;
            if (i == 0) {
                i = this.icon.getIntrinsicWidth();
            }
            int i2 = this.iconSize;
            if (i2 == 0) {
                i2 = this.icon.getIntrinsicHeight();
            }
            Drawable drawable2 = this.icon;
            int i3 = this.iconLeft;
            int i4 = this.iconTop;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.icon.setVisible(true, z);
        }
        validateIconGravity();
        if (this.icon == null && this.secondaryIcon != null && areIconsGravitySameAlignment()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (isIconStart() && compoundDrawablesRelative[0] != this.icon) || (isIconEnd() && compoundDrawablesRelative[2] != this.icon) || (isIconTop() && compoundDrawablesRelative[1] != this.icon);
        if (z || z2) {
            if (isIconStart()) {
                setCompoundDrawablesRelative(this.icon, getUpdatedIconFor(1), getUpdatedIconFor(2), null);
            } else if (isIconEnd()) {
                setCompoundDrawablesRelative(getUpdatedIconFor(0), getUpdatedIconFor(1), this.icon, null);
            } else if (isIconTop()) {
                setCompoundDrawablesRelative(getUpdatedIconFor(0), this.icon, getUpdatedIconFor(2), null);
            }
        }
    }

    private void updateIconPosition(int i, int i2) {
        if (this.icon == null || getLayout() == null) {
            return;
        }
        if (isIconStart() || isIconEnd()) {
            this.iconTop = 0;
            if (canUpdateWithoutTextAlignment(this.iconGravity)) {
                this.iconLeft = 0;
                updateIcon(false);
                return;
            }
            int iconLeft = getIconLeft(i, this.iconGravity);
            if (this.iconLeft != iconLeft) {
                this.iconLeft = iconLeft;
                updateIcon(false);
                return;
            }
            return;
        }
        if (isIconTop()) {
            this.iconLeft = 0;
            if (this.iconGravity == 16) {
                this.iconTop = 0;
                updateIcon(false);
                return;
            }
            int i3 = this.iconSize;
            if (i3 == 0) {
                i3 = this.icon.getIntrinsicHeight();
            }
            int iconTop = getIconTop(i2, i3);
            if (this.iconTop != iconTop) {
                this.iconTop = iconTop;
                updateIcon(false);
            }
        }
    }

    private void updatePaddingsAndSizeForWidthAnimation() {
        int i = (int) (this.displayedWidthIncrease - this.displayedWidthDecrease);
        boolean isLayoutRTL = isLayoutRTL();
        int i2 = this.opticalCenterShift;
        if (isLayoutRTL) {
            i2 = -i2;
        }
        int i3 = (i / 2) + i2;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.originalWidth + i);
        }
        setPaddingRelative(this.originalPaddingStart + i3, getPaddingTop(), (this.originalPaddingEnd + i) - i3, getPaddingBottom());
    }

    private void updateSecondaryIcon(boolean z) {
        Drawable drawable = this.secondaryIcon;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.secondaryIcon = mutate;
            mutate.setTintList(this.secondaryIconTint);
            PorterDuff.Mode mode = this.secondaryIconTintMode;
            if (mode != null) {
                this.secondaryIcon.setTintMode(mode);
            }
            int i = this.iconSize;
            if (i == 0) {
                i = this.secondaryIcon.getIntrinsicWidth();
            }
            int i2 = this.iconSize;
            if (i2 == 0) {
                i2 = this.secondaryIcon.getIntrinsicHeight();
            }
            Drawable drawable2 = this.secondaryIcon;
            int i3 = this.secondaryIconLeft;
            int i4 = this.secondaryIconTop;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.secondaryIcon.setVisible(true, z);
        }
        validateSecondaryIconGravity();
        if (this.secondaryIcon == null) {
            if (this.stopNullSecondaryIconUpdate) {
                return;
            }
            if (this.icon != null && areIconsGravitySameAlignment()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (isSecondaryIconStart() && compoundDrawablesRelative[0] != this.secondaryIcon) || (isSecondaryIconEnd() && compoundDrawablesRelative[2] != this.secondaryIcon) || (isSecondaryIconTop() && compoundDrawablesRelative[1] != this.secondaryIcon);
        if (z || z2) {
            if (isSecondaryIconStart()) {
                setCompoundDrawablesRelative(this.secondaryIcon, getUpdatedSecondaryIconFor(1), getUpdatedSecondaryIconFor(2), null);
            } else if (isSecondaryIconEnd()) {
                setCompoundDrawablesRelative(getUpdatedSecondaryIconFor(0), getUpdatedSecondaryIconFor(1), this.secondaryIcon, null);
            } else if (isSecondaryIconTop()) {
                setCompoundDrawablesRelative(getUpdatedSecondaryIconFor(0), this.secondaryIcon, getUpdatedSecondaryIconFor(2), null);
            }
        }
    }

    private void updateSecondaryIconPosition(int i, int i2) {
        if (this.secondaryIcon == null || getLayout() == null) {
            return;
        }
        if (isSecondaryIconStart() || isSecondaryIconEnd()) {
            this.secondaryIconTop = 0;
            if (canUpdateWithoutTextAlignment(this.secondaryIconGravity)) {
                this.secondaryIconLeft = 0;
                updateSecondaryIcon(false);
                return;
            }
            int iconLeft = getIconLeft(i, this.secondaryIconGravity);
            if (this.secondaryIconLeft != iconLeft) {
                this.secondaryIconLeft = iconLeft;
                updateSecondaryIcon(false);
                return;
            }
            return;
        }
        if (isSecondaryIconTop()) {
            this.secondaryIconLeft = 0;
            if (this.secondaryIconGravity == 16) {
                this.secondaryIconTop = 0;
                updateSecondaryIcon(false);
                return;
            }
            int i3 = this.iconSize;
            if (i3 == 0) {
                i3 = this.secondaryIcon.getIntrinsicHeight();
            }
            int iconTop = getIconTop(i2, i3);
            if (this.secondaryIconTop != iconTop) {
                this.secondaryIconTop = iconTop;
                updateSecondaryIcon(false);
            }
        }
    }

    private void validateIconGravity() {
        if (this.icon == null || this.secondaryIcon == null || !areIconsGravitySameAlignment()) {
            return;
        }
        ny61.g("iconGravity cannot have the same alignment as secondaryIconGravity");
    }

    private void validateSecondaryIconGravity() {
        if (this.secondaryIcon == null || this.icon == null || !areIconsGravitySameAlignment()) {
            return;
        }
        ny61.g("secondaryIconGravity cannot have the same alignment as iconGravity");
    }

    public void addOnCheckedChangeListener(f710 f710Var) {
        this.onCheckedChangeListeners.add(f710Var);
    }

    public void clearOnCheckedChangeListeners() {
        this.onCheckedChangeListeners.clear();
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.accessibilityClassName)) {
            return (isCheckable() ? CompoundButton.class : Button.class).getName();
        }
        return this.accessibilityClassName;
    }

    public int getAllowedWidthDecrease() {
        return this.allowedWidthDecrease;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.i;
        }
        return 0;
    }

    public owt0 getCornerSpringForce() {
        return this.materialButtonHelper.c;
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public int getIconGravity() {
        return this.iconGravity;
    }

    public int getIconPadding() {
        return this.iconPadding;
    }

    public int getIconSize() {
        return this.iconSize;
    }

    public ColorStateList getIconTint() {
        return this.iconTint;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.iconTintMode;
    }

    public int getInsetBottom() {
        return this.materialButtonHelper.h;
    }

    public int getInsetLeft() {
        return this.materialButtonHelper.e;
    }

    public int getInsetRight() {
        return this.materialButtonHelper.f;
    }

    public int getInsetTop() {
        return this.materialButtonHelper.g;
    }

    public ColorStateList getRippleColor() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.n;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.secondaryIcon;
    }

    public int getSecondaryIconGravity() {
        return this.secondaryIconGravity;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.secondaryIconTint;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.secondaryIconTintMode;
    }

    public fhr0 getShapeAppearance() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.b;
        }
        ny61.r("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        return null;
    }

    @Override // defpackage.uir0
    public b getShapeAppearanceModel() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.b.c();
        }
        ny61.r("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.m;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.j;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return isUsingOriginalBackground() ? this.materialButtonHelper.l : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return isUsingOriginalBackground() ? this.materialButtonHelper.k : super.getSupportBackgroundTintMode();
    }

    public boolean isCheckable() {
        j710 j710Var = this.materialButtonHelper;
        return j710Var != null && j710Var.s;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    public boolean isOpticalCenterEnabled() {
        return this.opticalCenterEnabled;
    }

    public boolean isToggleCheckedStateOnClick() {
        return this.materialButtonHelper.t;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isUsingOriginalBackground()) {
            eja1.B(this, this.materialButtonHelper.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isCheckable()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        updateSecondaryIconPosition(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.orientation != i6) {
            this.orientation = i6;
            this.originalWidth = -2.1474836E9f;
        }
        if (this.originalWidth == -2.1474836E9f) {
            this.originalWidth = getMeasuredWidth();
            if (this.originalLayoutParams == null && (getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).getButtonSizeChange() != null) {
                this.originalLayoutParams = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.originalLayoutParams);
                layoutParams.width = (int) this.originalWidth;
                setLayoutParams(layoutParams);
            }
        }
        if (this.allowedWidthDecrease == Integer.MIN_VALUE) {
            if (this.icon == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i7 = this.iconSize;
                if (i7 == 0) {
                    i7 = this.icon.getIntrinsicWidth();
                }
                i5 = iconPadding + i7;
            }
            this.allowedWidthDecrease = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.originalPaddingStart == Integer.MIN_VALUE) {
            this.originalPaddingStart = getPaddingStart();
        }
        if (this.originalPaddingEnd == Integer.MIN_VALUE) {
            this.originalPaddingEnd = getPaddingEnd();
        }
        this.isInHorizontalButtonGroup = isInHorizontalButtonGroup();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.checked);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.checked = this.checked;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        updateSecondaryIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean z;
        if (isEnabled() && this.materialButtonHelper.t) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean performClick = super.performClick();
        if (z && !performClick) {
            playSoundEffect(0);
        }
        return performClick;
    }

    public void recoverOriginalLayoutParams() {
        LinearLayout.LayoutParams layoutParams = this.originalLayoutParams;
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
            this.originalLayoutParams = null;
            this.originalWidth = -2.1474836E9f;
        }
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.icon != null) {
            if (this.icon.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void removeOnCheckedChangeListener(f710 f710Var) {
        this.onCheckedChangeListeners.remove(f710Var);
    }

    public void setA11yClassName(String str) {
        this.accessibilityClassName = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!isUsingOriginalBackground()) {
            super.setBackgroundColor(i);
            return;
        }
        j710 j710Var = this.materialButtonHelper;
        if (j710Var.a(false) != null) {
            j710Var.a(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!isUsingOriginalBackground()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        j710 j710Var = this.materialButtonHelper;
        j710Var.q = true;
        MaterialButton materialButton = j710Var.a;
        materialButton.setSupportBackgroundTintList(j710Var.l);
        materialButton.setSupportBackgroundTintMode(j710Var.k);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? vng.t(i, getContext()) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.s = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.originalWidth = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public void setCornerRadius(int i) {
        if (isUsingOriginalBackground()) {
            j710 j710Var = this.materialButtonHelper;
            if (j710Var.r && j710Var.i == i) {
                return;
            }
            j710Var.i = i;
            j710Var.r = true;
            j710Var.b = j710Var.b.a(i);
            j710Var.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (isUsingOriginalBackground()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(owt0 owt0Var) {
        j710 j710Var = this.materialButtonHelper;
        j710Var.c = owt0Var;
        if (j710Var.b instanceof c) {
            j710Var.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.displayedWidthDecrease = Math.min(i, this.allowedWidthDecrease);
        updatePaddingsAndSizeForWidthAnimation();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.a(false).setElevation(f);
        }
    }

    /* renamed from: setIcon, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$setSecondaryIcon$3(Drawable drawable) {
        if (this.icon == drawable || maybeRunAfterWidthAnimation(new e710(this, drawable, 1))) {
            return;
        }
        this.originalWidth = -2.1474836E9f;
        this.icon = drawable;
        updateIcon(true);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconGravity(int i) {
        if (this.iconGravity != i) {
            validateIconGravity();
            this.iconGravity = i;
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.iconPadding != i) {
            this.iconPadding = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        lambda$setSecondaryIcon$3(i != 0 ? vng.t(i, getContext()) : null);
    }

    /* renamed from: setIconSize, reason: merged with bridge method [inline-methods] */
    public void lambda$setIconSize$1(int i) {
        if (i < 0) {
            ny61.g("iconSize cannot be less than 0");
            return;
        }
        if (this.iconSize == i || maybeRunAfterWidthAnimation(new xm2(this, i, 11))) {
            return;
        }
        this.originalWidth = -2.1474836E9f;
        this.iconSize = i;
        updateIcon(true);
        updateSecondaryIcon(true);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.iconTint != colorStateList) {
            this.iconTint = colorStateList;
            updateIcon(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.iconTintMode != mode) {
            this.iconTintMode = mode;
            updateIcon(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(qke.m(i, getContext()));
    }

    public void setInsetBottom(int i) {
        j710 j710Var = this.materialButtonHelper;
        j710Var.b(j710Var.e, j710Var.g, j710Var.f, i);
    }

    public void setInsetLeft(int i) {
        j710 j710Var = this.materialButtonHelper;
        j710Var.b(i, j710Var.g, j710Var.f, j710Var.h);
    }

    public void setInsetRight(int i) {
        j710 j710Var = this.materialButtonHelper;
        j710Var.b(j710Var.e, j710Var.g, i, j710Var.h);
    }

    public void setInsetTop(int i) {
        j710 j710Var = this.materialButtonHelper;
        j710Var.b(j710Var.e, i, j710Var.f, j710Var.h);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(g710 g710Var) {
        this.onPressedChangeListenerInternal = g710Var;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.opticalCenterEnabled != z) {
            this.opticalCenterEnabled = z;
            j710 j710Var = this.materialButtonHelper;
            if (z) {
                uhx uhxVar = new uhx(8, this);
                j710Var.d = uhxVar;
                MaterialShapeDrawable a = j710Var.a(false);
                if (a != null) {
                    a.setOnCornerSizeChangeListener(uhxVar);
                }
            } else {
                j710Var.d = null;
                MaterialShapeDrawable a2 = j710Var.a(false);
                if (a2 != null) {
                    a2.setOnCornerSizeChangeListener(null);
                }
            }
            post(new fbz(19, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        g710 g710Var = this.onPressedChangeListenerInternal;
        if (g710Var != null) {
            ((i710) g710Var).a.invalidate();
        }
        super.setPressed(z);
        maybeAnimateSize(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            j710 j710Var = this.materialButtonHelper;
            MaterialButton materialButton = j710Var.a;
            if (j710Var.n != colorStateList) {
                j710Var.n = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(tt91.e(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (isUsingOriginalBackground()) {
            setRippleColor(qke.m(i, getContext()));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.secondaryIcon == drawable || maybeRunAfterWidthAnimation(new e710(this, drawable, 0))) {
            return;
        }
        this.originalWidth = -2.1474836E9f;
        this.secondaryIcon = drawable;
        this.stopNullSecondaryIconUpdate = false;
        updateSecondaryIcon(true);
        updateSecondaryIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSecondaryIconGravity(int i) {
        if (this.secondaryIconGravity != i) {
            validateSecondaryIconGravity();
            this.secondaryIconGravity = i;
            updateSecondaryIconPosition(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? vng.t(i, getContext()) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.secondaryIconTint != colorStateList) {
            this.secondaryIconTint = colorStateList;
            updateSecondaryIcon(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.secondaryIconTintMode != mode) {
            this.secondaryIconTintMode = mode;
            updateSecondaryIcon(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(qke.m(i, getContext()));
    }

    public void setShapeAppearance(fhr0 fhr0Var) {
        if (!isUsingOriginalBackground()) {
            ny61.r("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
            return;
        }
        if (this.materialButtonHelper.c == null && fhr0Var.f()) {
            j710 j710Var = this.materialButtonHelper;
            j710Var.c = createSpringForce();
            if (j710Var.b instanceof c) {
                j710Var.d();
            }
        }
        j710 j710Var2 = this.materialButtonHelper;
        j710Var2.b = fhr0Var;
        j710Var2.d();
    }

    @Override // defpackage.uir0
    public void setShapeAppearanceModel(b bVar) {
        if (!isUsingOriginalBackground()) {
            ny61.r("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        j710 j710Var = this.materialButtonHelper;
        j710Var.b = bVar;
        j710Var.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (isUsingOriginalBackground()) {
            j710 j710Var = this.materialButtonHelper;
            j710Var.p = z;
            j710Var.e();
        }
    }

    public void setSizeChange(StateListSizeChange stateListSizeChange) {
        if (this.sizeChange != stateListSizeChange) {
            this.sizeChange = stateListSizeChange;
            maybeAnimateSize(true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            j710 j710Var = this.materialButtonHelper;
            if (j710Var.m != colorStateList) {
                j710Var.m = colorStateList;
                j710Var.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (isUsingOriginalBackground()) {
            setStrokeColor(qke.m(i, getContext()));
        }
    }

    public void setStrokeWidth(int i) {
        if (isUsingOriginalBackground()) {
            j710 j710Var = this.materialButtonHelper;
            if (j710Var.j != i) {
                j710Var.j = i;
                j710Var.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (isUsingOriginalBackground()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!isUsingOriginalBackground()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        j710 j710Var = this.materialButtonHelper;
        if (j710Var.l != colorStateList) {
            j710Var.l = colorStateList;
            if (j710Var.a(false) != null) {
                j710Var.a(false).setTintList(j710Var.l);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!isUsingOriginalBackground()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        j710 j710Var = this.materialButtonHelper;
        if (j710Var.k != mode) {
            j710Var.k = mode;
            if (j710Var.a(false) == null || j710Var.k == null) {
                return;
            }
            j710Var.a(false).setTintMode(j710Var.k);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.originalWidth = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        updateSecondaryIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        this.originalWidth = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void setTextSize(int i, float f) {
        this.originalWidth = -2.1474836E9f;
        super.setTextSize(i, f);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.materialButtonHelper.t = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.originalWidth = -2.1474836E9f;
        super.setWidth(i);
    }

    public void setWidthChangeDirection(WidthChangeDirection widthChangeDirection) {
        if (this.widthChangeDirection != widthChangeDirection) {
            this.widthChangeDirection = widthChangeDirection;
            maybeAnimateSize(true);
        }
    }

    public void setWidthChangeMax(int i) {
        if (this.widthChangeMax != i) {
            this.widthChangeMax = i;
            maybeAnimateSize(true);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.checked);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.button.MaterialButton.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };
        boolean checked;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            readFromParcel(parcel);
        }

        private void readFromParcel(Parcel parcel) {
            this.checked = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.checked ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.materialButtonStyle);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }
}
