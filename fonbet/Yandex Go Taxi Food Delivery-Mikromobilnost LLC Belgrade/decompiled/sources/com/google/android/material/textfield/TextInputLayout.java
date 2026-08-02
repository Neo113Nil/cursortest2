package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import defpackage.b4a1;
import defpackage.dfz0;
import defpackage.dp5;
import defpackage.ei;
import defpackage.eja1;
import defpackage.eng0;
import defpackage.fp5;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.gpy0;
import defpackage.h2i0;
import defpackage.hbc;
import defpackage.hpy0;
import defpackage.iog0;
import defpackage.ipy0;
import defpackage.jx81;
import defpackage.kp50;
import defpackage.kux0;
import defpackage.kxh0;
import defpackage.l6u0;
import defpackage.leh0;
import defpackage.lhc;
import defpackage.mj2;
import defpackage.n2v0;
import defpackage.ny61;
import defpackage.or2;
import defpackage.org0;
import defpackage.oyr;
import defpackage.rxi;
import defpackage.s2u0;
import defpackage.uqg0;
import defpackage.vbm;
import defpackage.vez0;
import defpackage.vng;
import defpackage.wuj0;
import defpackage.wvb1;
import defpackage.xre;
import defpackage.xvz;
import defpackage.yvy0;
import defpackage.z2i0;
import defpackage.z610;
import defpackage.zre;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEFAULT_PLACEHOLDER_FADE_DURATION = 87;
    private static final int DEF_STYLE_RES = g2i0.Widget_Design_TextInputLayout;
    private static final int[][] EDIT_TEXT_BACKGROUND_RIPPLE_STATE = {new int[]{R.attr.state_pressed}, new int[0]};
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final String LOG_TAG = "TextInputLayout";
    private static final int NO_WIDTH = -1;
    private static final int PLACEHOLDER_START_DELAY = 67;
    private static final String TAG = "TextInputLayout";
    private ValueAnimator animator;
    private boolean areCornerRadiiRtl;
    private MaterialShapeDrawable boxBackground;
    private boolean boxBackgroundApplied;
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;
    private MaterialShapeDrawable boxUnderlineDefault;
    private MaterialShapeDrawable boxUnderlineFocused;
    final hbc collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;
    private ColorStateList counterTextColor;
    private TextView counterView;
    private ColorStateList cursorColor;
    private ColorStateList cursorErrorColor;
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;
    private int defaultStrokeColor;
    private int disabledColor;
    private int disabledFilledBackgroundColor;
    EditText editText;
    private final LinkedHashSet<hpy0> editTextAttachedListeners;
    private Drawable endDummyDrawable;
    private int endDummyDrawableWidth;
    private final EndCompoundLayout endLayout;
    private boolean expandedHintEnabled;
    private final int extraSpaceBetweenPlaceholderAndHint;
    private StateListDrawable filledDropDownMenuBackground;
    private int focusedFilledBackgroundColor;
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private boolean globalLayoutListenerAdded;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;
    private int hoveredFilledBackgroundColor;
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final h indicatorViewController;
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;
    private gpy0 lengthCounter;
    private int maxEms;
    private int maxWidth;
    private int minEms;
    private int minWidth;
    private Drawable originalEditTextEndDrawable;
    int originalEditTextMinimumHeight;
    private CharSequence originalHint;
    private MaterialShapeDrawable outlinedDropDownMenuBackground;
    private boolean placeholderEnabled;
    private Fade placeholderFadeIn;
    private Fade placeholderFadeOut;
    private CharSequence placeholderText;
    private int placeholderTextAppearance;
    private ColorStateList placeholderTextColor;
    private TextView placeholderTextView;
    private boolean restoringSavedState;
    private com.google.android.material.shape.b shapeAppearanceModel;
    private Drawable startDummyDrawable;
    private int startDummyDrawableWidth;
    private final StartCompoundLayout startLayout;
    private ColorStateList strokeErrorColor;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, r5), attributeSet, i);
        int i2 = DEF_STYLE_RES;
        this.minEms = -1;
        this.maxEms = -1;
        this.minWidth = -1;
        this.maxWidth = -1;
        this.indicatorViewController = new h(this);
        this.lengthCounter = new s2u0(13);
        this.tmpRect = new Rect();
        this.tmpBoundsRect = new Rect();
        this.tmpRectF = new RectF();
        this.editTextAttachedListeners = new LinkedHashSet<>();
        hbc hbcVar = new hbc(this);
        this.collapsingTextHelper = hbcVar;
        this.globalLayoutListenerAdded = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.inputFrame = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = mj2.a;
        hbcVar.X = linearInterpolator;
        hbcVar.l(false);
        hbcVar.W = linearInterpolator;
        hbcVar.l(false);
        hbcVar.s(8388659);
        dfz0 e = yvy0.e(context2, attributeSet, z2i0.TextInputLayout, i, i2, z2i0.TextInputLayout_counterTextAppearance, z2i0.TextInputLayout_counterOverflowTextAppearance, z2i0.TextInputLayout_errorTextAppearance, z2i0.TextInputLayout_helperTextTextAppearance, z2i0.TextInputLayout_hintTextAppearance);
        StartCompoundLayout startCompoundLayout = new StartCompoundLayout(this, e);
        this.startLayout = startCompoundLayout;
        int i3 = z2i0.TextInputLayout_hintEnabled;
        TypedArray typedArray = e.b;
        this.hintEnabled = typedArray.getBoolean(i3, true);
        setHint(typedArray.getText(z2i0.TextInputLayout_android_hint));
        this.hintAnimationEnabled = typedArray.getBoolean(z2i0.TextInputLayout_hintAnimationEnabled, true);
        this.expandedHintEnabled = typedArray.getBoolean(z2i0.TextInputLayout_expandedHintEnabled, true);
        if (typedArray.hasValue(z2i0.TextInputLayout_android_minEms)) {
            setMinEms(typedArray.getInt(z2i0.TextInputLayout_android_minEms, -1));
        } else if (typedArray.hasValue(z2i0.TextInputLayout_android_minWidth)) {
            setMinWidth(typedArray.getDimensionPixelSize(z2i0.TextInputLayout_android_minWidth, -1));
        }
        if (typedArray.hasValue(z2i0.TextInputLayout_android_maxEms)) {
            setMaxEms(typedArray.getInt(z2i0.TextInputLayout_android_maxEms, -1));
        } else if (typedArray.hasValue(z2i0.TextInputLayout_android_maxWidth)) {
            setMaxWidth(typedArray.getDimensionPixelSize(z2i0.TextInputLayout_android_maxWidth, -1));
        }
        this.shapeAppearanceModel = com.google.android.material.shape.b.j(context2, attributeSet, i, i2).a();
        this.boxLabelCutoutPaddingPx = context2.getResources().getDimensionPixelOffset(org0.mtrl_textinput_box_label_cutout_padding);
        this.boxCollapsedPaddingTopPx = typedArray.getDimensionPixelOffset(z2i0.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.extraSpaceBetweenPlaceholderAndHint = getResources().getDimensionPixelSize(org0.m3_multiline_hint_filled_text_extra_space);
        this.boxStrokeWidthDefaultPx = typedArray.getDimensionPixelSize(z2i0.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(org0.mtrl_textinput_box_stroke_width_default));
        this.boxStrokeWidthFocusedPx = typedArray.getDimensionPixelSize(z2i0.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(org0.mtrl_textinput_box_stroke_width_focused));
        this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
        float dimension = typedArray.getDimension(z2i0.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float dimension2 = typedArray.getDimension(z2i0.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = typedArray.getDimension(z2i0.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = typedArray.getDimension(z2i0.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        b.a m = this.shapeAppearanceModel.m();
        if (dimension >= 0.0f) {
            m.j(dimension);
        }
        if (dimension2 >= 0.0f) {
            m.l(dimension2);
        }
        if (dimension3 >= 0.0f) {
            m.h(dimension3);
        }
        if (dimension4 >= 0.0f) {
            m.f(dimension4);
        }
        this.shapeAppearanceModel = m.a();
        ColorStateList n = jx81.n(context2, e, z2i0.TextInputLayout_boxBackgroundColor);
        if (n != null) {
            int defaultColor = n.getDefaultColor();
            this.defaultFilledBackgroundColor = defaultColor;
            this.boxBackgroundColor = defaultColor;
            if (n.isStateful()) {
                this.disabledFilledBackgroundColor = n.getColorForState(new int[]{-16842910}, -1);
                this.focusedFilledBackgroundColor = n.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.hoveredFilledBackgroundColor = n.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.focusedFilledBackgroundColor = this.defaultFilledBackgroundColor;
                ColorStateList a = wuj0.a(context2.getResources(), uqg0.mtrl_filled_background_color, context2.getTheme());
                this.disabledFilledBackgroundColor = a.getColorForState(new int[]{-16842910}, -1);
                this.hoveredFilledBackgroundColor = a.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.boxBackgroundColor = 0;
            this.defaultFilledBackgroundColor = 0;
            this.disabledFilledBackgroundColor = 0;
            this.focusedFilledBackgroundColor = 0;
            this.hoveredFilledBackgroundColor = 0;
        }
        if (typedArray.hasValue(z2i0.TextInputLayout_android_textColorHint)) {
            ColorStateList a2 = e.a(z2i0.TextInputLayout_android_textColorHint);
            this.focusedTextColor = a2;
            this.defaultHintTextColor = a2;
        }
        ColorStateList n2 = jx81.n(context2, e, z2i0.TextInputLayout_boxStrokeColor);
        this.focusedStrokeColor = typedArray.getColor(z2i0.TextInputLayout_boxStrokeColor, 0);
        this.defaultStrokeColor = context2.getColor(uqg0.mtrl_textinput_default_box_stroke_color);
        this.disabledColor = context2.getColor(uqg0.mtrl_textinput_disabled_color);
        this.hoveredStrokeColor = context2.getColor(uqg0.mtrl_textinput_hovered_box_stroke_color);
        if (n2 != null) {
            setBoxStrokeColorStateList(n2);
        }
        if (typedArray.hasValue(z2i0.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(jx81.n(context2, e, z2i0.TextInputLayout_boxStrokeErrorColor));
        }
        if (typedArray.getResourceId(z2i0.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(z2i0.TextInputLayout_hintTextAppearance, 0));
        }
        this.cursorColor = e.a(z2i0.TextInputLayout_cursorColor);
        this.cursorErrorColor = e.a(z2i0.TextInputLayout_cursorErrorColor);
        int resourceId = typedArray.getResourceId(z2i0.TextInputLayout_errorTextAppearance, 0);
        CharSequence text = typedArray.getText(z2i0.TextInputLayout_errorContentDescription);
        int i4 = typedArray.getInt(z2i0.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean z = typedArray.getBoolean(z2i0.TextInputLayout_errorEnabled, false);
        int resourceId2 = typedArray.getResourceId(z2i0.TextInputLayout_helperTextTextAppearance, 0);
        boolean z2 = typedArray.getBoolean(z2i0.TextInputLayout_helperTextEnabled, false);
        CharSequence text2 = typedArray.getText(z2i0.TextInputLayout_helperText);
        int resourceId3 = typedArray.getResourceId(z2i0.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence text3 = typedArray.getText(z2i0.TextInputLayout_placeholderText);
        boolean z3 = typedArray.getBoolean(z2i0.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(typedArray.getInt(z2i0.TextInputLayout_counterMaxLength, -1));
        this.counterTextAppearance = typedArray.getResourceId(z2i0.TextInputLayout_counterTextAppearance, 0);
        this.counterOverflowTextAppearance = typedArray.getResourceId(z2i0.TextInputLayout_counterOverflowTextAppearance, 0);
        setBoxBackgroundMode(typedArray.getInt(z2i0.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i4);
        setCounterOverflowTextAppearance(this.counterOverflowTextAppearance);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.counterTextAppearance);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(z2i0.TextInputLayout_errorTextColor)) {
            setErrorTextColor(e.a(z2i0.TextInputLayout_errorTextColor));
        }
        if (typedArray.hasValue(z2i0.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(e.a(z2i0.TextInputLayout_helperTextTextColor));
        }
        if (typedArray.hasValue(z2i0.TextInputLayout_hintTextColor)) {
            setHintTextColor(e.a(z2i0.TextInputLayout_hintTextColor));
        }
        if (typedArray.hasValue(z2i0.TextInputLayout_counterTextColor)) {
            setCounterTextColor(e.a(z2i0.TextInputLayout_counterTextColor));
        }
        if (typedArray.hasValue(z2i0.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(e.a(z2i0.TextInputLayout_counterOverflowTextColor));
        }
        if (typedArray.hasValue(z2i0.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(e.a(z2i0.TextInputLayout_placeholderTextColor));
        }
        EndCompoundLayout endCompoundLayout = new EndCompoundLayout(this, e);
        this.endLayout = endCompoundLayout;
        boolean z4 = typedArray.getBoolean(z2i0.TextInputLayout_android_enabled, true);
        setHintMaxLines(typedArray.getInt(z2i0.TextInputLayout_hintMaxLines, 1));
        e.g();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(startCompoundLayout);
        frameLayout.addView(endCompoundLayout);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private void addPlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            this.inputFrame.addView(textView);
            this.placeholderTextView.setVisibility(0);
        }
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
        if (this.editText == null || this.boxBackgroundMode != 1) {
            return;
        }
        if (!isHintTextSingleLine()) {
            EditText editText = this.editText;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.collapsingTextHelper.g() + this.extraSpaceBetweenPlaceholderAndHint), this.editText.getPaddingEnd(), getResources().getDimensionPixelSize(org0.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.editText;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(org0.material_filled_edittext_font_2_0_padding_top), this.editText.getPaddingEnd(), getResources().getDimensionPixelSize(org0.material_filled_edittext_font_2_0_padding_bottom));
        } else if (jx81.z(getContext())) {
            EditText editText3 = this.editText;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(org0.material_filled_edittext_font_1_3_padding_top), this.editText.getPaddingEnd(), getResources().getDimensionPixelSize(org0.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    private void applyBoxAttributes() {
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable == null) {
            return;
        }
        com.google.android.material.shape.b shapeAppearanceModel = materialShapeDrawable.getShapeAppearanceModel();
        com.google.android.material.shape.b bVar = this.shapeAppearanceModel;
        if (shapeAppearanceModel != bVar) {
            this.boxBackground.setShapeAppearanceModel(bVar);
        }
        if (canDrawOutlineStroke()) {
            this.boxBackground.setStroke(this.boxStrokeWidthPx, this.boxStrokeColor);
        }
        int calculateBoxBackgroundColor = calculateBoxBackgroundColor();
        this.boxBackgroundColor = calculateBoxBackgroundColor;
        this.boxBackground.setFillColor(ColorStateList.valueOf(calculateBoxBackgroundColor));
        applyBoxUnderlineAttributes();
        updateEditTextBoxBackgroundIfNeeded();
    }

    private void applyBoxUnderlineAttributes() {
        if (this.boxUnderlineDefault == null || this.boxUnderlineFocused == null) {
            return;
        }
        if (canDrawStroke()) {
            this.boxUnderlineDefault.setFillColor(this.editText.isFocused() ? ColorStateList.valueOf(this.defaultStrokeColor) : ColorStateList.valueOf(this.boxStrokeColor));
            this.boxUnderlineFocused.setFillColor(ColorStateList.valueOf(this.boxStrokeColor));
        }
        invalidate();
    }

    private void applyCutoutPadding(RectF rectF) {
        float f = rectF.left;
        int i = this.boxLabelCutoutPaddingPx;
        rectF.left = f - i;
        rectF.right += i;
    }

    private void assignBoxBackgroundByMode() {
        int i = this.boxBackgroundMode;
        if (i == 0) {
            this.boxBackground = null;
            this.boxUnderlineDefault = null;
            this.boxUnderlineFocused = null;
            return;
        }
        if (i == 1) {
            this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
            this.boxUnderlineDefault = new MaterialShapeDrawable();
            this.boxUnderlineFocused = new MaterialShapeDrawable();
        } else {
            if (i != 2) {
                ny61.g(oyr.m(this.boxBackgroundMode, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
                return;
            }
            if (!this.hintEnabled || (this.boxBackground instanceof CutoutDrawable)) {
                this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
            } else {
                this.boxBackground = CutoutDrawable.create(this.shapeAppearanceModel);
            }
            this.boxUnderlineDefault = null;
            this.boxUnderlineFocused = null;
        }
    }

    private int calculateBoxBackgroundColor() {
        int i = this.boxBackgroundColor;
        if (this.boxBackgroundMode != 1) {
            return i;
        }
        return lhc.d(this.boxBackgroundColor, vez0.x(getContext(), eng0.colorSurface, 0));
    }

    private Rect calculateCollapsedTextBounds(Rect rect) {
        if (this.editText == null) {
            ny61.k();
            return null;
        }
        Rect rect2 = this.tmpBoundsRect;
        boolean z = getLayoutDirection() == 1;
        rect2.bottom = rect.bottom;
        int i = this.boxBackgroundMode;
        if (i == 1) {
            rect2.left = getLabelLeftBoundAlignedWithPrefixAndSuffix(rect.left, z);
            rect2.top = rect.top + this.boxCollapsedPaddingTopPx;
            rect2.right = getLabelRightBoundAlignedWithPrefixAndSuffix(rect.right, z);
            return rect2;
        }
        int i2 = rect.left;
        if (i != 2) {
            rect2.left = getLabelLeftBoundAlignedWithPrefixAndSuffix(i2, z);
            rect2.top = getPaddingTop();
            rect2.right = getLabelRightBoundAlignedWithPrefixAndSuffix(rect.right, z);
            return rect2;
        }
        rect2.left = this.editText.getPaddingLeft() + i2;
        rect2.top = rect.top - calculateLabelMarginTop();
        rect2.right = rect.right - this.editText.getPaddingRight();
        return rect2;
    }

    private int calculateExpandedLabelBottom(Rect rect, Rect rect2, float f) {
        return isSingleLineFilledTextField() ? (int) (rect2.top + f) : rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private int calculateExpandedLabelTop(Rect rect, float f) {
        int i;
        if (isSingleLineFilledTextField()) {
            return (int) (rect.centerY() - (f / 2.0f));
        }
        if (this.boxBackgroundMode != 0 || isHintTextSingleLine()) {
            i = 0;
        } else {
            hbc hbcVar = this.collapsingTextHelper;
            TextPaint textPaint = hbcVar.V;
            textPaint.setTextSize(hbcVar.m);
            textPaint.setTypeface(hbcVar.A);
            textPaint.setLetterSpacing(hbcVar.h0);
            i = (int) ((-textPaint.ascent()) / 2.0f);
        }
        return (this.editText.getCompoundPaddingTop() + rect.top) - i;
    }

    private Rect calculateExpandedTextBounds(Rect rect) {
        float i;
        if (this.editText == null) {
            ny61.k();
            return null;
        }
        Rect rect2 = this.tmpBoundsRect;
        boolean isHintTextSingleLine = isHintTextSingleLine();
        hbc hbcVar = this.collapsingTextHelper;
        if (isHintTextSingleLine) {
            TextPaint textPaint = hbcVar.V;
            textPaint.setTextSize(hbcVar.m);
            textPaint.setTypeface(hbcVar.A);
            textPaint.setLetterSpacing(hbcVar.h0);
            i = -textPaint.ascent();
        } else {
            i = hbcVar.i() * this.collapsingTextHelper.q;
        }
        rect2.left = this.editText.getCompoundPaddingLeft() + rect.left;
        rect2.top = calculateExpandedLabelTop(rect, i);
        rect2.right = rect.right - this.editText.getCompoundPaddingRight();
        rect2.bottom = calculateExpandedLabelBottom(rect, rect2, i);
        return rect2;
    }

    private int calculateLabelMarginTop() {
        if (this.hintEnabled) {
            int i = this.boxBackgroundMode;
            if (i == 0) {
                return (int) this.collapsingTextHelper.g();
            }
            if (i == 2) {
                boolean isHintTextSingleLine = isHintTextSingleLine();
                hbc hbcVar = this.collapsingTextHelper;
                if (isHintTextSingleLine) {
                    return (int) (hbcVar.g() / 2.0f);
                }
                float g = hbcVar.g();
                hbc hbcVar2 = this.collapsingTextHelper;
                TextPaint textPaint = hbcVar2.V;
                textPaint.setTextSize(hbcVar2.n);
                textPaint.setTypeface(hbcVar2.x);
                textPaint.setLetterSpacing(hbcVar2.g0);
                return Math.max(0, (int) (g - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    private boolean canDrawOutlineStroke() {
        return this.boxBackgroundMode == 2 && canDrawStroke();
    }

    private boolean canDrawStroke() {
        return this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0;
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((CutoutDrawable) this.boxBackground).removeCutout();
        }
    }

    private void collapseHint(boolean z) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z && this.hintAnimationEnabled) {
            animateToExpansionFraction(1.0f);
        } else {
            this.collapsingTextHelper.A(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
        updatePlaceholderText();
        this.startLayout.onHintStateChanged(false);
        this.endLayout.onHintStateChanged(false);
    }

    private Fade createPlaceholderFadeTransition() {
        Fade fade = new Fade();
        fade.c = kp50.O(getContext(), eng0.motionDurationShort2, 87);
        fade.w = kp50.P(getContext(), eng0.motionEasingLinearInterpolator, mj2.a);
        return fade;
    }

    private boolean cutoutEnabled() {
        return this.hintEnabled && !TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof CutoutDrawable);
    }

    private void dispatchOnEditTextAttached() {
        Iterator<hpy0> it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(this);
        }
    }

    private void drawBoxUnderline(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        if (this.boxUnderlineFocused == null || (materialShapeDrawable = this.boxUnderlineDefault) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.editText.isFocused()) {
            Rect bounds = this.boxUnderlineFocused.getBounds();
            Rect bounds2 = this.boxUnderlineDefault.getBounds();
            float f = this.collapsingTextHelper.b;
            int centerX = bounds2.centerX();
            bounds.left = mj2.c(centerX, bounds2.left, f);
            bounds.right = mj2.c(centerX, bounds2.right, f);
            this.boxUnderlineFocused.draw(canvas);
        }
    }

    private void drawHint(Canvas canvas) {
        if (this.hintEnabled) {
            this.collapsingTextHelper.f(canvas);
        }
    }

    private void expandHint(boolean z) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z && this.hintAnimationEnabled) {
            animateToExpansionFraction(0.0f);
        } else {
            this.collapsingTextHelper.A(0.0f);
        }
        if (cutoutEnabled() && ((CutoutDrawable) this.boxBackground).hasCutout()) {
            closeCutout();
        }
        this.hintExpanded = true;
        hidePlaceholderText();
        this.startLayout.onHintStateChanged(true);
        this.endLayout.onHintStateChanged(true);
    }

    private MaterialShapeDrawable getDropDownMaterialShapeDrawable(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(org0.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.editText;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(org0.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(org0.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        b.a aVar = new b.a();
        aVar.j(f);
        aVar.l(f);
        aVar.f(dimensionPixelOffset);
        aVar.h(dimensionPixelOffset);
        com.google.android.material.shape.b a = aVar.a();
        EditText editText2 = this.editText;
        MaterialShapeDrawable createWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(getContext(), popupElevation, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        createWithElevationOverlay.setShapeAppearanceModel(a);
        createWithElevationOverlay.setPadding(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return createWithElevationOverlay;
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.editText;
        if (!(editText instanceof AutoCompleteTextView) || b4a1.c(editText)) {
            return this.boxBackground;
        }
        int w = vez0.w(iog0.colorControlHighlight, this.editText);
        int i = this.boxBackgroundMode;
        if (i == 2) {
            return getOutlinedBoxBackgroundWithRipple(getContext(), this.boxBackground, w, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
        }
        if (i == 1) {
            return getFilledBoxBackgroundWithRipple(this.boxBackground, this.boxBackgroundColor, w, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
        }
        return null;
    }

    private static Drawable getFilledBoxBackgroundWithRipple(MaterialShapeDrawable materialShapeDrawable, int i, int i2, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{vez0.Q(0.1f, i2, i), i}), materialShapeDrawable, materialShapeDrawable);
    }

    private int getLabelLeftBoundAlignedWithPrefixAndSuffix(int i, boolean z) {
        int suffixTextEndOffset;
        if (!z && getPrefixText() != null) {
            suffixTextEndOffset = this.startLayout.getPrefixTextStartOffset();
        } else {
            if (!z || getSuffixText() == null) {
                return this.editText.getCompoundPaddingLeft() + i;
            }
            suffixTextEndOffset = this.endLayout.getSuffixTextEndOffset();
        }
        return i + suffixTextEndOffset;
    }

    private int getLabelRightBoundAlignedWithPrefixAndSuffix(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.editText.getCompoundPaddingRight() : this.startLayout.getPrefixTextStartOffset() : this.endLayout.getSuffixTextEndOffset());
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.filledDropDownMenuBackground == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.filledDropDownMenuBackground = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.filledDropDownMenuBackground.addState(new int[0], getDropDownMaterialShapeDrawable(false));
        }
        return this.filledDropDownMenuBackground;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.outlinedDropDownMenuBackground == null) {
            this.outlinedDropDownMenuBackground = getDropDownMaterialShapeDrawable(true);
        }
        return this.outlinedDropDownMenuBackground;
    }

    private static Drawable getOutlinedBoxBackgroundWithRipple(Context context, MaterialShapeDrawable materialShapeDrawable, int i, int[][] iArr) {
        int T = vez0.T(context, z610.f(context, eng0.colorSurface, "TextInputLayout"));
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        int Q = vez0.Q(0.1f, i, T);
        materialShapeDrawable2.setFillColor(new ColorStateList(iArr, new int[]{Q, 0}));
        materialShapeDrawable2.setTint(T);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{Q, T});
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        materialShapeDrawable3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable2, materialShapeDrawable3), materialShapeDrawable});
    }

    private void hidePlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView == null || !this.placeholderEnabled) {
            return;
        }
        textView.setText((CharSequence) null);
        TransitionManager.a(this.placeholderFadeOut, this.inputFrame);
        this.placeholderTextView.setVisibility(4);
    }

    private boolean isHintTextSingleLine() {
        return getHintMaxLines() == 1;
    }

    private boolean isOnError() {
        if (shouldShowError()) {
            return true;
        }
        return this.counterView != null && this.counterOverflowed;
    }

    private boolean isSingleLineFilledTextField() {
        return this.boxBackgroundMode == 1 && this.editText.getMinLines() <= 1;
    }

    private static /* synthetic */ int lambda$new$0(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onGlobalLayout$1() {
        this.editText.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateEditTextHeight$2(StaticLayout.Builder builder) {
        builder.setBreakStrategy(this.placeholderTextView.getBreakStrategy());
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        updateEditTextBoxBackgroundIfNeeded();
        updateTextInputBoxState();
        updateBoxCollapsedPaddingTop();
        adjustFilledEditTextPaddingForLargeFont();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
        setDropDownMenuBackgroundIfNeeded();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void openCutout() {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        int i2;
        if (cutoutEnabled()) {
            RectF rectF = this.tmpRectF;
            hbc hbcVar = this.collapsingTextHelper;
            int width = this.editText.getWidth();
            int gravity = this.editText.getGravity();
            boolean c = hbcVar.c(hbcVar.H);
            hbcVar.J = c;
            Rect rect = hbcVar.h;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = hbcVar.k0;
                    }
                } else if (c) {
                    f = rect.right;
                    f2 = hbcVar.k0;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float max = Math.max(f3, rect.left);
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (hbcVar.k0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (hbcVar.J) {
                        f5 = hbcVar.k0;
                        f4 = f5 + max;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (hbcVar.J) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = hbcVar.k0;
                    f4 = f5 + max;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = hbcVar.g() + rect.top;
                if (hbcVar.j0 != null && !hbcVar.C()) {
                    StaticLayout staticLayout = hbcVar.j0;
                    float lineWidth = (hbcVar.n / hbcVar.m) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (hbcVar.J) {
                        rectF.right = rectF.left + lineWidth;
                    } else {
                        rectF.left = rectF.right - lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                applyCutoutPadding(rectF);
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.boxStrokeWidthPx);
                rectF.top = 0.0f;
                ((CutoutDrawable) this.boxBackground).setCutout(rectF);
                return;
            }
            f = width / 2.0f;
            f2 = hbcVar.k0 / 2.0f;
            f3 = f - f2;
            float max2 = Math.max(f3, rect.left);
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f4 = (width / 2.0f) + (hbcVar.k0 / 2.0f);
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = hbcVar.g() + rect.top;
            if (hbcVar.j0 != null) {
                StaticLayout staticLayout2 = hbcVar.j0;
                float lineWidth2 = (hbcVar.n / hbcVar.m) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (hbcVar.J) {
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    private void recalculateCutout() {
        if (!cutoutEnabled() || this.hintExpanded) {
            return;
        }
        closeCutout();
        openCutout();
    }

    private static void recursiveSetEnabled(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                recursiveSetEnabled((ViewGroup) childAt, z);
            }
        }
    }

    private void removePlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void setDropDownMenuBackgroundIfNeeded() {
        EditText editText = this.editText;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i = this.boxBackgroundMode;
                if (i == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.editText != null) {
            ny61.g("We already have an EditText, can only have one");
            return;
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.editText = editText;
        int i = this.minEms;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.minWidth);
        }
        int i2 = this.maxEms;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.maxWidth);
        }
        this.boxBackgroundApplied = false;
        onApplyBoxBackgroundMode();
        setTextInputAccessibilityDelegate(new k(this));
        hbc hbcVar = this.collapsingTextHelper;
        Typeface typeface = this.editText.getTypeface();
        boolean t = hbcVar.t(typeface);
        boolean z = hbcVar.z(typeface);
        if (t || z) {
            hbcVar.l(false);
        }
        this.collapsingTextHelper.y(this.editText.getTextSize());
        hbc hbcVar2 = this.collapsingTextHelper;
        float letterSpacing = this.editText.getLetterSpacing();
        if (hbcVar2.h0 != letterSpacing) {
            hbcVar2.h0 = letterSpacing;
            hbcVar2.l(false);
        }
        int gravity = this.editText.getGravity();
        this.collapsingTextHelper.s((gravity & (-113)) | 48);
        this.collapsingTextHelper.x(gravity);
        this.originalEditTextMinimumHeight = editText.getMinimumHeight();
        this.editText.addTextChangedListener(new TextWatcher(editText) { // from class: com.google.android.material.textfield.TextInputLayout.1
            int previousLineCount;
            final /* synthetic */ EditText val$editText;

            {
                this.val$editText = editText;
                this.previousLineCount = editText.getLineCount();
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                TextInputLayout.this.updateLabelState(!r0.restoringSavedState);
                TextInputLayout textInputLayout = TextInputLayout.this;
                if (textInputLayout.counterEnabled) {
                    textInputLayout.updateCounter(editable);
                }
                if (TextInputLayout.this.placeholderEnabled) {
                    TextInputLayout.this.updatePlaceholderText(editable);
                }
                int lineCount = this.val$editText.getLineCount();
                int i3 = this.previousLineCount;
                if (lineCount != i3) {
                    if (lineCount < i3) {
                        int minimumHeight = this.val$editText.getMinimumHeight();
                        int i4 = TextInputLayout.this.originalEditTextMinimumHeight;
                        if (minimumHeight != i4) {
                            this.val$editText.setMinimumHeight(i4);
                        }
                    }
                    this.previousLineCount = lineCount;
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }
        });
        if (this.defaultHintTextColor == null) {
            this.defaultHintTextColor = this.editText.getHintTextColors();
        }
        if (this.hintEnabled) {
            if (TextUtils.isEmpty(this.hint)) {
                CharSequence hint = this.editText.getHint();
                this.originalHint = hint;
                setHint(hint);
                this.editText.setHint((CharSequence) null);
            }
            this.isProvidingHint = true;
        }
        updateCursorColor();
        if (this.counterView != null) {
            updateCounter(this.editText.getText());
        }
        updateEditTextBackground();
        this.indicatorViewController.b();
        this.startLayout.bringToFront();
        this.endLayout.bringToFront();
        dispatchOnEditTextAttached();
        this.endLayout.updateSuffixTextViewPadding();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        updateLabelState(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.hint)) {
            return;
        }
        this.hint = charSequence;
        this.collapsingTextHelper.B(charSequence);
        if (this.hintExpanded) {
            return;
        }
        openCutout();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.placeholderEnabled == z) {
            return;
        }
        if (z) {
            addPlaceholderTextView();
        } else {
            removePlaceholderTextView();
            this.placeholderTextView = null;
        }
        this.placeholderEnabled = z;
    }

    private boolean shouldUpdateEndDummyDrawable() {
        return (this.endLayout.isErrorIconVisible() || ((this.endLayout.hasEndIcon() && isEndIconVisible()) || this.endLayout.getSuffixText() != null)) && this.endLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUpdateStartDummyDrawable() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.startLayout.getMeasuredWidth() > 0;
    }

    private void showPlaceholderText() {
        if (this.placeholderTextView == null || !this.placeholderEnabled || TextUtils.isEmpty(this.placeholderText)) {
            return;
        }
        this.placeholderTextView.setText(this.placeholderText);
        TransitionManager.a(this.placeholderFadeIn, this.inputFrame);
        this.placeholderTextView.setVisibility(0);
        this.placeholderTextView.bringToFront();
    }

    private void updateBoxCollapsedPaddingTop() {
        if (this.boxBackgroundMode == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(org0.material_font_2_0_box_collapsed_padding_top);
            } else if (jx81.z(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(org0.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    private void updateBoxUnderlineBounds(Rect rect) {
        MaterialShapeDrawable materialShapeDrawable = this.boxUnderlineDefault;
        if (materialShapeDrawable != null) {
            int i = rect.bottom;
            materialShapeDrawable.setBounds(rect.left, i - this.boxStrokeWidthDefaultPx, rect.right, i);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.boxUnderlineFocused;
        if (materialShapeDrawable2 != null) {
            int i2 = rect.bottom;
            materialShapeDrawable2.setBounds(rect.left, i2 - this.boxStrokeWidthFocusedPx, rect.right, i2);
        }
    }

    private void updateCollapsingTextDimens(int i) {
        hbc hbcVar = this.collapsingTextHelper;
        TextPaint textPaint = hbcVar.V;
        textPaint.setTextSize(hbcVar.n);
        textPaint.setTypeface(hbcVar.x);
        textPaint.setLetterSpacing(hbcVar.g0);
        float f = i;
        hbcVar.t0 = hbcVar.e(hbcVar.p0, textPaint, hbcVar.H, (hbcVar.n / hbcVar.m) * f, hbcVar.J).getHeight();
        textPaint.setTextSize(hbcVar.m);
        textPaint.setTypeface(hbcVar.A);
        textPaint.setLetterSpacing(hbcVar.h0);
        hbcVar.u0 = hbcVar.e(hbcVar.o0, textPaint, hbcVar.H, f, hbcVar.J).getHeight();
        Rect rect = this.tmpRect;
        rxi.a(this, this.editText, rect);
        hbc hbcVar2 = this.collapsingTextHelper;
        Rect calculateCollapsedTextBounds = calculateCollapsedTextBounds(rect);
        hbcVar2.getClass();
        hbcVar2.o(calculateCollapsedTextBounds.left, calculateCollapsedTextBounds.top, calculateCollapsedTextBounds.right, calculateCollapsedTextBounds.bottom);
        updateInputLayoutMargins();
        adjustFilledEditTextPaddingForLargeFont();
        updateEditTextHeight(i);
    }

    private static void updateCounterContentDescription(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? kxh0.character_counter_overflowed_content_description : kxh0.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void updateCounterTextAppearanceAndColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.counterView;
        if (textView != null) {
            setTextAppearanceCompatWithErrorFallback(textView, this.counterOverflowed ? this.counterOverflowTextAppearance : this.counterTextAppearance);
            if (!this.counterOverflowed && (colorStateList2 = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList2);
            }
            if (!this.counterOverflowed || (colorStateList = this.counterOverflowTextColor) == null) {
                return;
            }
            this.counterView.setTextColor(colorStateList);
        }
    }

    private void updateCursorColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.cursorColor;
        if (colorStateList2 == null) {
            colorStateList2 = vez0.z(iog0.colorControlActivated, getContext());
        }
        EditText editText = this.editText;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable mutate = this.editText.getTextCursorDrawable().mutate();
        if (isOnError() && (colorStateList = this.cursorErrorColor) != null) {
            colorStateList2 = colorStateList;
        }
        mutate.setTintList(colorStateList2);
    }

    private void updateEditTextBoxBackground() {
        this.editText.setBackground(getEditTextBoxBackground());
    }

    private void updateEditTextHeight(int i) {
        float f;
        if (this.editText == null) {
            return;
        }
        hbc hbcVar = this.collapsingTextHelper;
        int i2 = hbcVar.u0;
        if (i2 != -1) {
            f = i2;
        } else {
            TextPaint textPaint = hbcVar.V;
            textPaint.setTextSize(hbcVar.m);
            textPaint.setTypeface(hbcVar.A);
            textPaint.setLetterSpacing(hbcVar.h0);
            f = -textPaint.ascent();
        }
        if (this.placeholderText != null) {
            TextPaint textPaint2 = new TextPaint(HProv.PP_SECURITY_LEVEL);
            textPaint2.set(this.placeholderTextView.getPaint());
            textPaint2.setTextSize(this.placeholderTextView.getTextSize());
            textPaint2.setTypeface(this.placeholderTextView.getTypeface());
            textPaint2.setLetterSpacing(this.placeholderTextView.getLetterSpacing());
            l6u0 l6u0Var = new l6u0(this.placeholderText, textPaint2, i);
            l6u0Var.k = getLayoutDirection() == 1;
            l6u0Var.j = true;
            float lineSpacingExtra = this.placeholderTextView.getLineSpacingExtra();
            float lineSpacingMultiplier = this.placeholderTextView.getLineSpacingMultiplier();
            l6u0Var.g = lineSpacingExtra;
            l6u0Var.h = lineSpacingMultiplier;
            l6u0Var.m = new n2v0(16, this);
            r2 = (this.boxBackgroundMode == 1 ? this.extraSpaceBetweenPlaceholderAndHint + this.collapsingTextHelper.g() + this.boxCollapsedPaddingTopPx : 0.0f) + l6u0Var.a().getHeight();
        }
        float max = Math.max(f, r2);
        if (this.editText.getMeasuredHeight() < max) {
            this.editText.setMinimumHeight(Math.round(max));
        }
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int max;
        if (this.editText == null || this.editText.getMeasuredHeight() >= (max = Math.max(this.endLayout.getMeasuredHeight(), this.startLayout.getMeasuredHeight()))) {
            return false;
        }
        this.editText.setMinimumHeight(max);
        return true;
    }

    private void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int calculateLabelMarginTop = calculateLabelMarginTop();
            if (calculateLabelMarginTop != layoutParams.topMargin) {
                layoutParams.topMargin = calculateLabelMarginTop;
                this.inputFrame.requestLayout();
            }
        }
    }

    private void updateLabelState(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.editText;
        boolean z3 = false;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.editText;
        if (editText2 != null && editText2.hasFocus()) {
            z3 = true;
        }
        ColorStateList colorStateList2 = this.defaultHintTextColor;
        if (colorStateList2 != null) {
            this.collapsingTextHelper.n(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.defaultHintTextColor;
            int i = this.disabledColor;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, i);
            }
            this.collapsingTextHelper.n(ColorStateList.valueOf(i));
        } else if (shouldShowError()) {
            hbc hbcVar = this.collapsingTextHelper;
            AppCompatTextView appCompatTextView = this.indicatorViewController.r;
            hbcVar.n(appCompatTextView != null ? appCompatTextView.getTextColors() : null);
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.collapsingTextHelper.n(textView.getTextColors());
        } else if (z3 && (colorStateList = this.focusedTextColor) != null) {
            this.collapsingTextHelper.r(colorStateList);
        }
        if (z4 || !this.expandedHintEnabled || (isEnabled() && z3)) {
            if (z2 || this.hintExpanded) {
                collapseHint(z);
                return;
            }
            return;
        }
        if (z2 || !this.hintExpanded) {
            expandHint(z);
        }
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
        EditText editText;
        if (this.placeholderTextView == null || (editText = this.editText) == null) {
            return;
        }
        this.placeholderTextView.setGravity(editText.getGravity());
        this.placeholderTextView.setPadding(this.editText.getCompoundPaddingLeft(), this.editText.getCompoundPaddingTop(), this.editText.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaceholderText(Editable editable) {
        ((s2u0) this.lengthCounter).getClass();
        if (lambda$new$0(editable) != 0 || this.hintExpanded) {
            hidePlaceholderText();
        } else {
            showPlaceholderText();
        }
    }

    private void updateStrokeErrorColor(boolean z, boolean z2) {
        int defaultColor = this.strokeErrorColor.getDefaultColor();
        int colorForState = this.strokeErrorColor.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.strokeErrorColor.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.boxStrokeColor = colorForState2;
        } else if (z2) {
            this.boxStrokeColor = colorForState;
        } else {
            this.boxStrokeColor = defaultColor;
        }
    }

    public void addOnEditTextAttachedListener(hpy0 hpy0Var) {
        this.editTextAttachedListeners.add(hpy0Var);
        if (this.editText != null) {
            ((e) hpy0Var).a(this);
        }
    }

    public void addOnEndIconChangedListener(ipy0 ipy0Var) {
        this.endLayout.addOnEndIconChangedListener(ipy0Var);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.inputFrame.addView(view, layoutParams2);
        this.inputFrame.setLayoutParams(layoutParams);
        updateInputLayoutMargins();
        setEditText((EditText) view);
    }

    public void animateToExpansionFraction(float f) {
        if (this.collapsingTextHelper.b == f) {
            return;
        }
        if (this.animator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.animator = valueAnimator;
            valueAnimator.setInterpolator(kp50.P(getContext(), eng0.motionEasingEmphasizedInterpolator, mj2.b));
            this.animator.setDuration(kp50.O(getContext(), eng0.motionDurationMedium4, LABEL_SCALE_ANIMATION_DURATION));
            this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.TextInputLayout.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TextInputLayout.this.collapsingTextHelper.A(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.animator.setFloatValues(this.collapsingTextHelper.b, f);
        this.animator.start();
    }

    public void clearOnEditTextAttachedListeners() {
        this.editTextAttachedListeners.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.endLayout.clearOnEndIconChangedListeners();
    }

    public boolean cutoutIsOpen() {
        return cutoutEnabled() && ((CutoutDrawable) this.boxBackground).hasCutout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.editText;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.originalHint != null) {
            boolean z = this.isProvidingHint;
            this.isProvidingHint = false;
            CharSequence hint = editText.getHint();
            this.editText.setHint(this.originalHint);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.editText.setHint(hint);
                this.isProvidingHint = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.inputFrame.getChildCount());
        for (int i2 = 0; i2 < this.inputFrame.getChildCount(); i2++) {
            View childAt = this.inputFrame.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.editText) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.inDrawableStateChanged) {
            return;
        }
        this.inDrawableStateChanged = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        hbc hbcVar = this.collapsingTextHelper;
        if (hbcVar != null) {
            hbcVar.S = drawableState;
            ColorStateList colorStateList2 = hbcVar.p;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = hbcVar.o) != null && colorStateList.isStateful())) {
                hbcVar.l(false);
                z = true;
                if (this.editText != null) {
                    updateLabelState(isLaidOut() && isEnabled());
                }
                updateEditTextBackground();
                updateTextInputBoxState();
                if (z) {
                    invalidate();
                }
                this.inDrawableStateChanged = false;
            }
        }
        z = false;
        if (this.editText != null) {
        }
        updateEditTextBackground();
        updateTextInputBoxState();
        if (z) {
        }
        this.inDrawableStateChanged = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.editText;
        if (editText == null) {
            return super.getBaseline();
        }
        return getPaddingTop() + editText.getBaseline() + calculateLabelMarginTop();
    }

    public MaterialShapeDrawable getBoxBackground() {
        int i = this.boxBackgroundMode;
        if (i == 1 || i == 2) {
            return this.boxBackground;
        }
        ny61.k();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.boxCollapsedPaddingTopPx;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        com.google.android.material.shape.b bVar = this.shapeAppearanceModel;
        return layoutDirection == 1 ? bVar.h.a(this.tmpRectF) : bVar.g.a(this.tmpRectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        com.google.android.material.shape.b bVar = this.shapeAppearanceModel;
        return layoutDirection == 1 ? bVar.g.a(this.tmpRectF) : bVar.h.a(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        com.google.android.material.shape.b bVar = this.shapeAppearanceModel;
        return layoutDirection == 1 ? bVar.e.a(this.tmpRectF) : bVar.f.a(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        com.google.android.material.shape.b bVar = this.shapeAppearanceModel;
        return layoutDirection == 1 ? bVar.f.a(this.tmpRectF) : bVar.e.a(this.tmpRectF);
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.strokeErrorColor;
    }

    public int getBoxStrokeWidth() {
        return this.boxStrokeWidthDefaultPx;
    }

    public int getBoxStrokeWidthFocused() {
        return this.boxStrokeWidthFocusedPx;
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.counterEnabled && this.counterOverflowed && (textView = this.counterView) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.counterOverflowTextColor;
    }

    public ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    public ColorStateList getCursorColor() {
        return this.cursorColor;
    }

    public ColorStateList getCursorErrorColor() {
        return this.cursorErrorColor;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    public EditText getEditText() {
        return this.editText;
    }

    public CharSequence getEndIconContentDescription() {
        return this.endLayout.getEndIconContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.endLayout.getEndIconDrawable();
    }

    public int getEndIconMinSize() {
        return this.endLayout.getEndIconMinSize();
    }

    public int getEndIconMode() {
        return this.endLayout.getEndIconMode();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.endLayout.getEndIconScaleType();
    }

    public CheckableImageButton getEndIconView() {
        return this.endLayout.getEndIconView();
    }

    public CharSequence getError() {
        h hVar = this.indicatorViewController;
        if (hVar.q) {
            return hVar.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.indicatorViewController.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.indicatorViewController.s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.indicatorViewController.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.endLayout.getErrorIconDrawable();
    }

    public CharSequence getHelperText() {
        h hVar = this.indicatorViewController;
        if (hVar.x) {
            return hVar.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.indicatorViewController.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.hintEnabled) {
            return this.hint;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.g();
    }

    public final int getHintCurrentCollapsedTextColor() {
        hbc hbcVar = this.collapsingTextHelper;
        return hbcVar.h(hbcVar.p);
    }

    public int getHintMaxLines() {
        return this.collapsingTextHelper.o0;
    }

    public ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    public gpy0 getLengthCounter() {
        return this.lengthCounter;
    }

    public int getMaxEms() {
        return this.maxEms;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getMinEms() {
        return this.minEms;
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endLayout.getPasswordVisibilityToggleContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endLayout.getPasswordVisibilityToggleDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.placeholderEnabled) {
            return this.placeholderText;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.placeholderTextAppearance;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    public CharSequence getPrefixText() {
        return this.startLayout.getPrefixText();
    }

    public ColorStateList getPrefixTextColor() {
        return this.startLayout.getPrefixTextColor();
    }

    public TextView getPrefixTextView() {
        return this.startLayout.getPrefixTextView();
    }

    public com.google.android.material.shape.b getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public CharSequence getStartIconContentDescription() {
        return this.startLayout.getStartIconContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.startLayout.getStartIconDrawable();
    }

    public int getStartIconMinSize() {
        return this.startLayout.getStartIconMinSize();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.startLayout.getStartIconScaleType();
    }

    public CharSequence getSuffixText() {
        return this.endLayout.getSuffixText();
    }

    public ColorStateList getSuffixTextColor() {
        return this.endLayout.getSuffixTextColor();
    }

    public TextView getSuffixTextView() {
        return this.endLayout.getSuffixTextView();
    }

    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public boolean isEndIconCheckable() {
        return this.endLayout.isEndIconCheckable();
    }

    public boolean isEndIconVisible() {
        return this.endLayout.isEndIconVisible();
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.q;
    }

    public boolean isExpandedHintEnabled() {
        return this.expandedHintEnabled;
    }

    public final boolean isHelperTextDisplayed() {
        h hVar = this.indicatorViewController;
        return (hVar.n != 2 || hVar.y == null || TextUtils.isEmpty(hVar.w)) ? false : true;
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.x;
    }

    public boolean isHintAnimationEnabled() {
        return this.hintAnimationEnabled;
    }

    public boolean isHintEnabled() {
        return this.hintEnabled;
    }

    public final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endLayout.isPasswordVisibilityToggleEnabled();
    }

    public boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    public boolean isStartIconCheckable() {
        return this.startLayout.isStartIconCheckable();
    }

    public boolean isStartIconVisible() {
        return this.startLayout.isStartIconVisible();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.k(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.endLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.globalLayoutListenerAdded = false;
        boolean updateEditTextHeightBasedOnIcon = updateEditTextHeightBasedOnIcon();
        boolean updateDummyDrawables = updateDummyDrawables();
        if (updateEditTextHeightBasedOnIcon || updateDummyDrawables) {
            this.editText.post(new kux0(8, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.editText;
        if (editText != null) {
            Rect rect = this.tmpRect;
            rxi.a(this, editText, rect);
            updateBoxUnderlineBounds(rect);
            if (this.hintEnabled) {
                this.collapsingTextHelper.y(this.editText.getTextSize());
                int gravity = this.editText.getGravity();
                this.collapsingTextHelper.s((gravity & (-113)) | 48);
                this.collapsingTextHelper.x(gravity);
                hbc hbcVar = this.collapsingTextHelper;
                Rect calculateCollapsedTextBounds = calculateCollapsedTextBounds(rect);
                hbcVar.getClass();
                hbcVar.o(calculateCollapsedTextBounds.left, calculateCollapsedTextBounds.top, calculateCollapsedTextBounds.right, calculateCollapsedTextBounds.bottom);
                hbc hbcVar2 = this.collapsingTextHelper;
                Rect calculateExpandedTextBounds = calculateExpandedTextBounds(rect);
                hbcVar2.getClass();
                hbcVar2.u(calculateExpandedTextBounds.left, calculateExpandedTextBounds.top, calculateExpandedTextBounds.right, calculateExpandedTextBounds.bottom, true);
                this.collapsingTextHelper.l(false);
                if (!cutoutEnabled() || this.hintExpanded) {
                    return;
                }
                openCutout();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.globalLayoutListenerAdded) {
            this.endLayout.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.globalLayoutListenerAdded = true;
        }
        updatePlaceholderMeasurementsBasedOnEditText();
        this.endLayout.updateSuffixTextViewPadding();
        if (isHintTextSingleLine()) {
            return;
        }
        updateCollapsingTextDimens((this.editText.getMeasuredWidth() - this.editText.getCompoundPaddingLeft()) - this.editText.getCompoundPaddingRight());
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.error);
        if (savedState.isEndIconChecked) {
            post(new j(this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.areCornerRadiiRtl) {
            float a = this.shapeAppearanceModel.e.a(this.tmpRectF);
            float a2 = this.shapeAppearanceModel.f.a(this.tmpRectF);
            float a3 = this.shapeAppearanceModel.h.a(this.tmpRectF);
            float a4 = this.shapeAppearanceModel.g.a(this.tmpRectF);
            com.google.android.material.shape.b bVar = this.shapeAppearanceModel;
            zre zreVar = bVar.a;
            zre zreVar2 = bVar.b;
            zre zreVar3 = bVar.d;
            zre zreVar4 = bVar.c;
            b.a aVar = new b.a();
            aVar.i(zreVar2);
            aVar.k(zreVar);
            aVar.e(zreVar4);
            aVar.g(zreVar3);
            aVar.j(a2);
            aVar.l(a);
            aVar.f(a4);
            aVar.h(a3);
            com.google.android.material.shape.b a5 = aVar.a();
            this.areCornerRadiiRtl = z;
            setShapeAppearanceModel(a5);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (shouldShowError()) {
            savedState.error = getError();
        }
        savedState.isEndIconChecked = this.endLayout.isEndIconChecked();
        return savedState;
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z) {
        this.endLayout.togglePasswordVisibilityToggle(z);
    }

    public void refreshEndIconDrawableState() {
        this.endLayout.refreshEndIconDrawableState();
    }

    public void refreshErrorIconDrawableState() {
        this.endLayout.refreshErrorIconDrawableState();
    }

    public void refreshStartIconDrawableState() {
        this.startLayout.refreshStartIconDrawableState();
    }

    public void removeOnEditTextAttachedListener(hpy0 hpy0Var) {
        this.editTextAttachedListeners.remove(hpy0Var);
    }

    public void removeOnEndIconChangedListener(ipy0 ipy0Var) {
        this.endLayout.removeOnEndIconChangedListener(ipy0Var);
    }

    public void setBoxBackgroundColor(int i) {
        if (this.boxBackgroundColor != i) {
            this.boxBackgroundColor = i;
            this.defaultFilledBackgroundColor = i;
            this.focusedFilledBackgroundColor = i;
            this.hoveredFilledBackgroundColor = i;
            applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.defaultFilledBackgroundColor = defaultColor;
        this.boxBackgroundColor = defaultColor;
        this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        applyBoxAttributes();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.boxBackgroundMode) {
            return;
        }
        this.boxBackgroundMode = i;
        if (this.editText != null) {
            onApplyBoxBackgroundMode();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.boxCollapsedPaddingTopPx = i;
    }

    public void setBoxCornerFamily(int i) {
        b.a m = this.shapeAppearanceModel.m();
        xre xreVar = this.shapeAppearanceModel.e;
        m.i(eja1.m(i));
        m.e = xreVar;
        xre xreVar2 = this.shapeAppearanceModel.f;
        m.k(eja1.m(i));
        m.f = xreVar2;
        xre xreVar3 = this.shapeAppearanceModel.h;
        m.e(eja1.m(i));
        m.h = xreVar3;
        xre xreVar4 = this.shapeAppearanceModel.g;
        m.g(eja1.m(i));
        m.g = xreVar4;
        this.shapeAppearanceModel = m.a();
        applyBoxAttributes();
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        boolean z = getLayoutDirection() == 1;
        this.areCornerRadiiRtl = z;
        float f5 = z ? f2 : f;
        if (!z) {
            f = f2;
        }
        float f6 = z ? f4 : f3;
        if (!z) {
            f3 = f4;
        }
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable != null && materialShapeDrawable.getTopLeftCornerResolvedSize() == f5 && this.boxBackground.getTopRightCornerResolvedSize() == f && this.boxBackground.getBottomLeftCornerResolvedSize() == f6 && this.boxBackground.getBottomRightCornerResolvedSize() == f3) {
            return;
        }
        b.a m = this.shapeAppearanceModel.m();
        m.j(f5);
        m.l(f);
        m.f(f6);
        m.h(f3);
        this.shapeAppearanceModel = m.a();
        applyBoxAttributes();
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxStrokeColor(int i) {
        if (this.focusedStrokeColor != i) {
            this.focusedStrokeColor = i;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.defaultStrokeColor = colorStateList.getDefaultColor();
            this.disabledColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.focusedStrokeColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.focusedStrokeColor != colorStateList.getDefaultColor()) {
            this.focusedStrokeColor = colorStateList.getDefaultColor();
        }
        updateTextInputBoxState();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.strokeErrorColor != colorStateList) {
            this.strokeErrorColor = colorStateList;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.boxStrokeWidthDefaultPx = i;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.boxStrokeWidthFocusedPx = i;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.counterEnabled != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.counterView = appCompatTextView;
                appCompatTextView.setId(leh0.textinput_counter);
                Typeface typeface = this.typeface;
                if (typeface != null) {
                    this.counterView.setTypeface(typeface);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.a(this.counterView, 2);
                ((ViewGroup.MarginLayoutParams) this.counterView.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(org0.mtrl_textinput_counter_margin_start));
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.g(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.counterMaxLength != i) {
            if (i > 0) {
                this.counterMaxLength = i;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.counterOverflowTextAppearance != i) {
            this.counterOverflowTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.counterOverflowTextColor != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.counterTextAppearance != i) {
            this.counterTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.counterTextColor != colorStateList) {
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.cursorColor != colorStateList) {
            this.cursorColor = colorStateList;
            updateCursorColor();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.cursorErrorColor != colorStateList) {
            this.cursorErrorColor = colorStateList;
            if (isOnError()) {
                updateCursorColor();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            updateLabelState(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        recursiveSetEnabled(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.endLayout.setEndIconActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.endLayout.setEndIconCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        this.endLayout.setEndIconContentDescription(i);
    }

    public void setEndIconDrawable(int i) {
        this.endLayout.setEndIconDrawable(i);
    }

    public void setEndIconMinSize(int i) {
        this.endLayout.setEndIconMinSize(i);
    }

    public void setEndIconMode(int i) {
        this.endLayout.setEndIconMode(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.endLayout.setEndIconOnClickListener(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endLayout.setEndIconOnLongClickListener(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.endLayout.setEndIconScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.endLayout.setEndIconTintList(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.endLayout.setEndIconTintMode(mode);
    }

    public void setEndIconVisible(boolean z) {
        this.endLayout.setEndIconVisible(z);
    }

    public void setError(CharSequence charSequence) {
        if (!this.indicatorViewController.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        h hVar = this.indicatorViewController;
        if (isEmpty) {
            hVar.f();
            return;
        }
        hVar.c();
        hVar.p = charSequence;
        hVar.r.setText(charSequence);
        int i = hVar.n;
        if (i != 1) {
            hVar.o = 1;
        }
        hVar.i(i, hVar.o, hVar.h(hVar.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        h hVar = this.indicatorViewController;
        hVar.t = i;
        AppCompatTextView appCompatTextView = hVar.r;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        h hVar = this.indicatorViewController;
        hVar.s = charSequence;
        AppCompatTextView appCompatTextView = hVar.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        h hVar = this.indicatorViewController;
        TextInputLayout textInputLayout = hVar.h;
        if (hVar.q == z) {
            return;
        }
        hVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(hVar.g);
            hVar.r = appCompatTextView;
            appCompatTextView.setId(leh0.textinput_error);
            hVar.r.setTextAlignment(5);
            Typeface typeface = hVar.B;
            if (typeface != null) {
                hVar.r.setTypeface(typeface);
            }
            int i = hVar.u;
            hVar.u = i;
            AppCompatTextView appCompatTextView2 = hVar.r;
            if (appCompatTextView2 != null) {
                hVar.h.setTextAppearanceCompatWithErrorFallback(appCompatTextView2, i);
            }
            ColorStateList colorStateList = hVar.v;
            hVar.v = colorStateList;
            AppCompatTextView appCompatTextView3 = hVar.r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = hVar.s;
            hVar.s = charSequence;
            AppCompatTextView appCompatTextView4 = hVar.r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i2 = hVar.t;
            hVar.t = i2;
            AppCompatTextView appCompatTextView5 = hVar.r;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAccessibilityLiveRegion(i2);
            }
            hVar.r.setVisibility(4);
            hVar.a(hVar.r, 0);
        } else {
            hVar.f();
            hVar.g(hVar.r, 0);
            hVar.r = null;
            textInputLayout.updateEditTextBackground();
            textInputLayout.updateTextInputBoxState();
        }
        hVar.q = z;
    }

    public void setErrorIconDrawable(int i) {
        this.endLayout.setErrorIconDrawable(i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.endLayout.setErrorIconOnClickListener(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endLayout.setErrorIconOnLongClickListener(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.endLayout.setErrorIconTintList(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.endLayout.setErrorIconTintMode(mode);
    }

    public void setErrorTextAppearance(int i) {
        h hVar = this.indicatorViewController;
        hVar.u = i;
        AppCompatTextView appCompatTextView = hVar.r;
        if (appCompatTextView != null) {
            hVar.h.setTextAppearanceCompatWithErrorFallback(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        h hVar = this.indicatorViewController;
        hVar.v = colorStateList;
        AppCompatTextView appCompatTextView = hVar.r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.expandedHintEnabled != z) {
            this.expandedHintEnabled = z;
            updateLabelState(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!isHelperTextEnabled()) {
            setHelperTextEnabled(true);
        }
        h hVar = this.indicatorViewController;
        hVar.c();
        hVar.w = charSequence;
        hVar.y.setText(charSequence);
        int i = hVar.n;
        if (i != 2) {
            hVar.o = 2;
        }
        hVar.i(i, hVar.o, hVar.h(hVar.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        h hVar = this.indicatorViewController;
        hVar.A = colorStateList;
        AppCompatTextView appCompatTextView = hVar.y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        h hVar = this.indicatorViewController;
        TextInputLayout textInputLayout = hVar.h;
        if (hVar.x == z) {
            return;
        }
        hVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(hVar.g);
            hVar.y = appCompatTextView;
            appCompatTextView.setId(leh0.textinput_helper_text);
            hVar.y.setTextAlignment(5);
            Typeface typeface = hVar.B;
            if (typeface != null) {
                hVar.y.setTypeface(typeface);
            }
            hVar.y.setVisibility(4);
            hVar.y.setImportantForAccessibility(2);
            int i = hVar.z;
            hVar.z = i;
            AppCompatTextView appCompatTextView2 = hVar.y;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(i);
            }
            ColorStateList colorStateList = hVar.A;
            hVar.A = colorStateList;
            AppCompatTextView appCompatTextView3 = hVar.y;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            hVar.a(hVar.y, 1);
        } else {
            hVar.c();
            int i2 = hVar.n;
            if (i2 == 2) {
                hVar.o = 0;
            }
            hVar.i(i2, hVar.o, hVar.h(hVar.y, ""));
            hVar.g(hVar.y, 1);
            hVar.y = null;
            textInputLayout.updateEditTextBackground();
            textInputLayout.updateTextInputBoxState();
        }
        hVar.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        h hVar = this.indicatorViewController;
        hVar.z = i;
        AppCompatTextView appCompatTextView = hVar.y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.hintAnimationEnabled = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.hintEnabled) {
            this.hintEnabled = z;
            if (z) {
                CharSequence hint = this.editText.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        setHint(hint);
                    }
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            } else {
                this.isProvidingHint = false;
                if (!TextUtils.isEmpty(this.hint) && TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                setHintInternal(null);
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public void setHintMaxLines(int i) {
        hbc hbcVar = this.collapsingTextHelper;
        if (i != hbcVar.p0) {
            hbcVar.p0 = i;
            hbcVar.l(false);
        }
        this.collapsingTextHelper.v(i);
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        this.collapsingTextHelper.q(i);
        this.focusedTextColor = this.collapsingTextHelper.p;
        if (this.editText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                this.collapsingTextHelper.r(colorStateList);
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false);
            }
        }
    }

    public void setLengthCounter(gpy0 gpy0Var) {
        this.lengthCounter = gpy0Var;
    }

    public void setMaxEms(int i) {
        this.maxEms = i;
        EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
        EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.minEms = i;
        EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.minWidth = i;
        EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        this.endLayout.setPasswordVisibilityToggleContentDescription(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        this.endLayout.setPasswordVisibilityToggleDrawable(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        this.endLayout.setPasswordVisibilityToggleEnabled(z);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.endLayout.setPasswordVisibilityToggleTintList(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.endLayout.setPasswordVisibilityToggleTintMode(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.placeholderTextView == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.placeholderTextView = appCompatTextView;
            appCompatTextView.setId(leh0.textinput_placeholder);
            this.placeholderTextView.setImportantForAccessibility(1);
            this.placeholderTextView.setAccessibilityLiveRegion(1);
            Fade createPlaceholderFadeTransition = createPlaceholderFadeTransition();
            this.placeholderFadeIn = createPlaceholderFadeTransition;
            createPlaceholderFadeTransition.b = 67L;
            this.placeholderFadeOut = createPlaceholderFadeTransition();
            setPlaceholderTextAppearance(this.placeholderTextAppearance);
            setPlaceholderTextColor(this.placeholderTextColor);
            androidx.core.view.b.p(this.placeholderTextView, new ei(27));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.placeholderEnabled) {
                setPlaceholderTextEnabled(true);
            }
            this.placeholderText = charSequence;
        }
        updatePlaceholderText();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.placeholderTextAppearance = i;
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.placeholderTextColor != colorStateList) {
            this.placeholderTextColor = colorStateList;
            TextView textView = this.placeholderTextView;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.startLayout.setPrefixText(charSequence);
    }

    public void setPrefixTextAppearance(int i) {
        this.startLayout.setPrefixTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.startLayout.setPrefixTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(com.google.android.material.shape.b bVar) {
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable == null || materialShapeDrawable.getShapeAppearanceModel() == bVar) {
            return;
        }
        this.shapeAppearanceModel = bVar;
        applyBoxAttributes();
    }

    public void setStartIconCheckable(boolean z) {
        this.startLayout.setStartIconCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? vng.t(i, getContext()) : null);
    }

    public void setStartIconMinSize(int i) {
        this.startLayout.setStartIconMinSize(i);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.startLayout.setStartIconOnClickListener(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.startLayout.setStartIconOnLongClickListener(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.startLayout.setStartIconScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.startLayout.setStartIconTintList(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.startLayout.setStartIconTintMode(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.startLayout.setStartIconVisible(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.endLayout.setSuffixText(charSequence);
    }

    public void setSuffixTextAppearance(int i) {
        this.endLayout.setSuffixTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.endLayout.setSuffixTextColor(colorStateList);
    }

    public void setTextAppearanceCompatWithErrorFallback(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(h2i0.TextAppearance_AppCompat_Caption);
        textView.setTextColor(getContext().getColor(uqg0.design_error));
    }

    public void setTextInputAccessibilityDelegate(k kVar) {
        EditText editText = this.editText;
        if (editText != null) {
            androidx.core.view.b.p(editText, kVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.typeface) {
            this.typeface = typeface;
            hbc hbcVar = this.collapsingTextHelper;
            boolean t = hbcVar.t(typeface);
            boolean z = hbcVar.z(typeface);
            if (t || z) {
                hbcVar.l(false);
            }
            h hVar = this.indicatorViewController;
            if (typeface != hVar.B) {
                hVar.B = typeface;
                AppCompatTextView appCompatTextView = hVar.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = hVar.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            TextView textView = this.counterView;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public boolean shouldShowError() {
        h hVar = this.indicatorViewController;
        return (hVar.o != 1 || hVar.r == null || TextUtils.isEmpty(hVar.p)) ? false : true;
    }

    public void updateCounter(Editable editable) {
        ((s2u0) this.lengthCounter).getClass();
        int lambda$new$0 = lambda$new$0(editable);
        boolean z = this.counterOverflowed;
        int i = this.counterMaxLength;
        if (i == -1) {
            this.counterView.setText(String.valueOf(lambda$new$0));
            this.counterView.setContentDescription(null);
            this.counterOverflowed = false;
        } else {
            this.counterOverflowed = lambda$new$0 > i;
            updateCounterContentDescription(getContext(), this.counterView, lambda$new$0, this.counterMaxLength, this.counterOverflowed);
            if (z != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
            }
            wvb1 wvb1Var = fp5.d;
            fp5 a = new dp5().a();
            TextView textView = this.counterView;
            String string = getContext().getString(kxh0.character_counter_pattern, Integer.valueOf(lambda$new$0), Integer.valueOf(this.counterMaxLength));
            textView.setText(string != null ? a.c(string, a.c).toString() : null);
        }
        if (this.editText == null || z == this.counterOverflowed) {
            return;
        }
        updateLabelState(false);
        updateTextInputBoxState();
        updateEditTextBackground();
    }

    public boolean updateDummyDrawables() {
        boolean z;
        if (this.editText == null) {
            return false;
        }
        boolean z2 = true;
        if (shouldUpdateStartDummyDrawable()) {
            int max = Math.max(0, this.startLayout.getMeasuredWidth() - this.editText.getPaddingLeft());
            if (this.startDummyDrawable == null || this.startDummyDrawableWidth != max) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.startDummyDrawable = colorDrawable;
                this.startDummyDrawableWidth = max;
                colorDrawable.setBounds(0, 0, max, 1);
            }
            Drawable[] compoundDrawablesRelative = this.editText.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.startDummyDrawable;
            if (drawable != drawable2) {
                this.editText.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.startDummyDrawable != null) {
                Drawable[] compoundDrawablesRelative2 = this.editText.getCompoundDrawablesRelative();
                this.editText.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.startDummyDrawable = null;
                z = true;
            }
            z = false;
        }
        if (shouldUpdateEndDummyDrawable()) {
            int measuredWidth = this.endLayout.getSuffixTextView().getMeasuredWidth() - this.editText.getPaddingRight();
            CheckableImageButton currentEndIconView = this.endLayout.getCurrentEndIconView();
            if (currentEndIconView != null) {
                measuredWidth = ((ViewGroup.MarginLayoutParams) currentEndIconView.getLayoutParams()).getMarginStart() + currentEndIconView.getMeasuredWidth() + measuredWidth;
            }
            int max2 = Math.max(0, measuredWidth);
            Drawable[] compoundDrawablesRelative3 = this.editText.getCompoundDrawablesRelative();
            Drawable drawable3 = this.endDummyDrawable;
            if (drawable3 != null && this.endDummyDrawableWidth != max2) {
                this.endDummyDrawableWidth = max2;
                drawable3.setBounds(0, 0, max2, 1);
                this.editText.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.endDummyDrawable, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.endDummyDrawable = colorDrawable2;
                this.endDummyDrawableWidth = max2;
                colorDrawable2.setBounds(0, 0, max2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.endDummyDrawable;
            if (drawable4 != drawable5) {
                this.originalEditTextEndDrawable = drawable4;
                this.editText.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.endDummyDrawable != null) {
            Drawable[] compoundDrawablesRelative4 = this.editText.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.endDummyDrawable) {
                this.editText.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.originalEditTextEndDrawable, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.endDummyDrawable = null;
            return z2;
        }
        return z;
    }

    public void updateEditTextBackground() {
        Drawable background;
        TextView textView;
        EditText editText = this.editText;
        if (editText == null || this.boxBackgroundMode != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = vbm.a;
        Drawable mutate = background.mutate();
        if (shouldShowError()) {
            mutate.setColorFilter(or2.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            mutate.setColorFilter(or2.c(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.editText.refreshDrawableState();
        }
    }

    public void updateEditTextBoxBackgroundIfNeeded() {
        EditText editText = this.editText;
        if (editText == null || this.boxBackground == null) {
            return;
        }
        if ((this.boxBackgroundApplied || editText.getBackground() == null) && this.boxBackgroundMode != 0) {
            updateEditTextBoxBackground();
            this.boxBackgroundApplied = true;
        }
    }

    public void updateTextInputBoxState() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.boxBackground == null || this.boxBackgroundMode == 0) {
            return;
        }
        boolean z = isFocused() || ((editText2 = this.editText) != null && editText2.hasFocus());
        boolean z2 = isHovered() || ((editText = this.editText) != null && editText.isHovered());
        if (!isEnabled()) {
            this.boxStrokeColor = this.disabledColor;
        } else if (shouldShowError()) {
            if (this.strokeErrorColor != null) {
                updateStrokeErrorColor(z, z2);
            } else {
                this.boxStrokeColor = getErrorCurrentTextColors();
            }
        } else if (!this.counterOverflowed || (textView = this.counterView) == null) {
            if (z) {
                this.boxStrokeColor = this.focusedStrokeColor;
            } else if (z2) {
                this.boxStrokeColor = this.hoveredStrokeColor;
            } else {
                this.boxStrokeColor = this.defaultStrokeColor;
            }
        } else if (this.strokeErrorColor != null) {
            updateStrokeErrorColor(z, z2);
        } else {
            this.boxStrokeColor = textView.getCurrentTextColor();
        }
        updateCursorColor();
        this.endLayout.onTextInputBoxStateUpdated();
        refreshStartIconDrawableState();
        if (this.boxBackgroundMode == 2) {
            int i = this.boxStrokeWidthPx;
            if (z && isEnabled()) {
                this.boxStrokeWidthPx = this.boxStrokeWidthFocusedPx;
            } else {
                this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
            }
            if (this.boxStrokeWidthPx != i) {
                recalculateCutout();
            }
        }
        if (this.boxBackgroundMode == 1) {
            if (!isEnabled()) {
                this.boxBackgroundColor = this.disabledFilledBackgroundColor;
            } else if (z2 && !z) {
                this.boxBackgroundColor = this.hoveredFilledBackgroundColor;
            } else if (z) {
                this.boxBackgroundColor = this.focusedFilledBackgroundColor;
            } else {
                this.boxBackgroundColor = this.defaultFilledBackgroundColor;
            }
        }
        applyBoxAttributes();
        if (getEndIconMode() == 3) {
            EditText editText3 = this.editText;
            if (!(editText3 instanceof AutoCompleteTextView) || b4a1.c(editText3)) {
                getEndIconView().setFocusable(true);
                getEndIconView().setClickable(true);
            } else {
                getEndIconView().setFocusable(false);
                getEndIconView().setClickable(false);
            }
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.endLayout.setEndIconContentDescription(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.endLayout.setEndIconDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.endLayout.setErrorIconDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.endLayout.setPasswordVisibilityToggleContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.endLayout.setPasswordVisibilityToggleDrawable(drawable);
    }

    public void setHint(CharSequence charSequence) {
        if (this.hintEnabled) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.startLayout.setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.startLayout.setStartIconDrawable(drawable);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.textfield.TextInputLayout.SavedState.1
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
        CharSequence error;
        boolean isEndIconChecked;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.error = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.isEndIconChecked = parcel.readInt() == 1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TextInputLayout.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" error=");
            return xvz.n(sb, this.error, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.error, parcel, i);
            parcel.writeInt(this.isEndIconChecked ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private void updatePlaceholderText() {
        EditText editText = this.editText;
        updatePlaceholderText(editText == null ? null : editText.getText());
    }

    private void updateCounter() {
        if (this.counterView != null) {
            EditText editText = this.editText;
            updateCounter(editText == null ? null : editText.getText());
        }
    }

    public void updateLabelState(boolean z) {
        updateLabelState(z, false);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.textInputStyle);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }
}
