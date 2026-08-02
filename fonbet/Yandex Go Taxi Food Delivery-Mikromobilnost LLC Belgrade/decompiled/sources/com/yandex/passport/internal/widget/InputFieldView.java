package com.yandex.passport.internal.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.passport.R;

/* loaded from: classes15.dex */
public class InputFieldView extends LinearLayout {
    private final int colorInvalidRegistrationField;
    private EditText editText;
    private int editTextInputType;
    private KeyListener editTextKeyListener;
    private int editTextPaddingBottom;
    private int editTextPaddingLeft;
    private int editTextPaddingRightWithValidityIcon;
    private int editTextPaddingRightWithoutIcons;
    private int editTextPaddingRightWithoutValidityIcon;
    private int editTextPaddingTop;
    private final int iconAnimationDuration;
    private final int iconButtonSafeZone;
    private final int iconButtonSize;
    private final int iconValiditySafeZone;
    private final int iconValiditySize;
    private final TimeInterpolator iconsHidingInterpolator;
    private final TimeInterpolator iconsShowingInterpolator;
    private ImageButton imageButton;
    private final AppCompatImageView imageValidity;
    public final AppCompatTextView textError;

    public InputFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.iconsShowingInterpolator = new DecelerateInterpolator();
        this.iconsHidingInterpolator = new AccelerateInterpolator();
        setOrientation(1);
        Resources resources = getResources();
        this.colorInvalidRegistrationField = getContext().getColor(R.color.passport_invalid_registration_field);
        this.iconValiditySize = resources.getDimensionPixelSize(R.dimen.passport_input_field_icon_validity_size);
        this.iconValiditySafeZone = resources.getDimensionPixelSize(R.dimen.passport_input_field_icon_validity_safe_zone);
        this.iconButtonSize = resources.getDimensionPixelSize(R.dimen.passport_input_field_icon_button_size);
        this.iconButtonSafeZone = resources.getDimensionPixelSize(R.dimen.passport_input_field_icon_button_safe_zone);
        this.iconAnimationDuration = resources.getInteger(android.R.integer.config_mediumAnimTime);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null, R.style.Passport_Widget_TextView_Error);
        this.textError = appCompatTextView;
        appCompatTextView.setId(R.id.text_error);
        appCompatTextView.setIncludeFontPadding(false);
        appCompatTextView.setTextAppearance(R.style.Passport_TextAppearance_Regular_Small);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.imageValidity = appCompatImageView;
        appCompatImageView.setId(R.id.image_validity);
        appCompatImageView.setImageResource(R.drawable.passport_ic_check_success);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        appCompatImageView.setVisibility(8);
    }

    private void animateEditTextPaddingRightChanging(int i, int i2) {
        if (i == i2) {
            return;
        }
        this.editText.clearAnimation();
        TimeInterpolator timeInterpolator = i < i2 ? this.iconsShowingInterpolator : this.iconsHidingInterpolator;
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(this.iconAnimationDuration);
        ofInt.setInterpolator(timeInterpolator);
        ofInt.addUpdateListener(new com.yandex.passport.common.ui.view.b(this, 1));
        ofInt.start();
    }

    private void collapseEditTextPaddingRight() {
        animateEditTextPaddingRightChanging(this.editText.getPaddingRight(), this.editTextPaddingRightWithValidityIcon);
    }

    private RelativeLayout.LayoutParams createIconLayoutParams(int i) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(15);
        layoutParams.addRule(11);
        layoutParams.addRule(21);
        layoutParams.rightMargin = this.editTextPaddingRightWithoutIcons;
        return layoutParams;
    }

    private void expandEditTextPaddingRight() {
        animateEditTextPaddingRightChanging(this.editText.getPaddingRight(), this.editTextPaddingRightWithoutValidityIcon);
    }

    private void hideValidityIcon() {
        if (this.imageValidity.getVisibility() != 0) {
            return;
        }
        this.imageValidity.clearAnimation();
        this.imageValidity.setAnimation(AnimationUtils.makeOutAnimation(getContext(), true));
        this.imageValidity.setVisibility(8);
        ImageButton imageButton = this.imageButton;
        if (imageButton != null) {
            imageButton.setTranslationX(imageButton.getTranslationX());
            this.imageButton.animate().translationX(0.0f).setDuration(this.iconAnimationDuration).setInterpolator(this.iconsHidingInterpolator).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$animateEditTextPaddingRightChanging$0(ValueAnimator valueAnimator) {
        this.editText.setPadding(this.editTextPaddingLeft, this.editTextPaddingTop, ((Integer) valueAnimator.getAnimatedValue()).intValue(), this.editTextPaddingBottom);
    }

    private void showValidityIcon() {
        if (this.imageValidity.getVisibility() != 8) {
            return;
        }
        this.imageValidity.clearAnimation();
        this.imageValidity.setAnimation(AnimationUtils.makeInAnimation(getContext(), false));
        this.imageValidity.setVisibility(0);
        ImageButton imageButton = this.imageButton;
        if (imageButton != null) {
            imageButton.setTranslationX(imageButton.getTranslationX());
            this.imageButton.animate().translationX(-this.iconValiditySize).setDuration(this.iconAnimationDuration).setInterpolator(this.iconsShowingInterpolator).start();
        }
    }

    public EditText getEditText() {
        return this.editText;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        int i;
        int i2;
        super.onFinishInflate();
        this.editText = (EditText) getChildAt(0);
        this.imageButton = (ImageButton) getChildAt(1);
        removeAllViews();
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        addView(relativeLayout, new LinearLayout.LayoutParams(-1, -2));
        relativeLayout.addView(this.editText, new LinearLayout.LayoutParams(-1, -2));
        this.editTextKeyListener = this.editText.getKeyListener();
        this.editTextInputType = this.editText.getInputType();
        this.editTextPaddingLeft = this.editText.getPaddingLeft();
        this.editTextPaddingTop = this.editText.getPaddingTop();
        this.editTextPaddingBottom = this.editText.getPaddingBottom();
        int paddingRight = this.editText.getPaddingRight();
        this.editTextPaddingRightWithoutIcons = paddingRight;
        ImageButton imageButton = this.imageButton;
        this.editTextPaddingRightWithoutValidityIcon = imageButton == null ? paddingRight : this.iconButtonSize + paddingRight + this.iconButtonSafeZone;
        int i3 = this.iconValiditySize;
        if (imageButton == null) {
            i = paddingRight + i3;
            i2 = this.iconValiditySafeZone;
        } else {
            i = paddingRight + i3 + this.iconButtonSize;
            i2 = this.iconButtonSafeZone;
        }
        this.editTextPaddingRightWithValidityIcon = i + i2;
        this.editText.setMaxLines(1);
        addView(this.textError, new LinearLayout.LayoutParams(-1, -2));
        relativeLayout.addView(this.imageValidity, createIconLayoutParams(this.iconValiditySize));
        if (this.imageButton != null) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
            this.imageButton.setBackgroundResource(typedValue.resourceId);
            this.imageButton.setScaleType(ImageView.ScaleType.CENTER);
            relativeLayout.addView(this.imageButton, createIconLayoutParams(this.iconButtonSize));
        }
        this.textError.setPadding(this.editTextPaddingLeft, 0, this.editTextPaddingRightWithoutIcons, 0);
        setPadding(0, (int) getResources().getDimension(R.dimen.passport_input_field_top_padding), 0, 0);
    }

    public void onIndeterminate() {
        this.editText.getBackground().clearColorFilter();
        expandEditTextPaddingRight();
        hideValidityIcon();
        this.textError.setText("");
    }

    public void onInvalid(String str) {
        this.editText.getBackground().setColorFilter(this.colorInvalidRegistrationField, PorterDuff.Mode.SRC_IN);
        expandEditTextPaddingRight();
        hideValidityIcon();
        this.textError.setText(str);
        this.textError.setVisibility(0);
    }

    public void onValid() {
        this.editText.getBackground().clearColorFilter();
        collapseEditTextPaddingRight();
        showValidityIcon();
        this.textError.setText("");
    }

    public void setEditable() {
        if (this.editText.getKeyListener() != null) {
            return;
        }
        this.editText.setKeyListener(this.editTextKeyListener);
        this.editText.setInputType(this.editTextInputType);
        this.editText.setFocusableInTouchMode(true);
    }

    public void setNonEditable() {
        if (this.editText.getKeyListener() == null) {
            return;
        }
        this.editText.setInputType(0);
        this.editText.setKeyListener(null);
        this.editText.setEllipsize(TextUtils.TruncateAt.END);
        this.editText.setFocusable(false);
    }

    public InputFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
