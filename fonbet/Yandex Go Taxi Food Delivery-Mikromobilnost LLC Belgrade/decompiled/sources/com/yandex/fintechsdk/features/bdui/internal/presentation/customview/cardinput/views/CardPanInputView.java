package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import coil.c;
import com.google.android.material.navigation.NavigationBarView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics.DynamicBinInfoEventName;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import defpackage.abr;
import defpackage.b5n;
import defpackage.bev;
import defpackage.brg0;
import defpackage.btg0;
import defpackage.ce0;
import defpackage.cl8;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.dl8;
import defpackage.evu0;
import defpackage.g1k;
import defpackage.h2b1;
import defpackage.jl40;
import defpackage.li3;
import defpackage.m810;
import defpackage.ny61;
import defpackage.omh0;
import defpackage.qj8;
import defpackage.rj8;
import defpackage.sj8;
import defpackage.th91;
import defpackage.tj8;
import defpackage.ugh0;
import defpackage.wis0;
import defpackage.wuj0;
import defpackage.xj8;
import defpackage.yi;
import defpackage.yz91;
import defpackage.z22;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 O2\u00020\u0001:\u0003APQB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0019\u0010\u000fJ\u0019\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001c\u0010\u000fJO\u0010)\u001a\u00020\r2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0001\u0010#\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010$H\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010,\u001a\u00020\rH\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010/\u001a\u00020\u000bH\u0000¢\u0006\u0004\b-\u0010.J\u0017\u00103\u001a\u00020\r2\u0006\u00100\u001a\u00020$H\u0000¢\u0006\u0004\b1\u00102J\u000f\u00105\u001a\u00020\rH\u0000¢\u0006\u0004\b4\u0010+R\u001a\u00107\u001a\u0002068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR$\u0010K\u001a\u00020$2\u0006\u0010G\u001a\u00020$8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u00102R$\u0010N\u001a\u00020$2\u0006\u0010G\u001a\u00020$8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bL\u0010I\"\u0004\bM\u00102¨\u0006R"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/views/CardPanInputView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "hasIcon", "Lzy11;", "animateIconAndPadding", "(Z)V", "width", "setIconWidth", "(I)V", "padding", "setInputStartPadding", "Landroid/animation/ValueAnimator;", "createIconAnimator", "()Landroid/animation/ValueAnimator;", "isLocked", "setLocked$features_bdui_release", "setLocked", "showKeyboard", "gainFocus$features_bdui_release", "gainFocus", "Lz22;", "analytics", "isDynamicBinEnabled", "Lb5n;", "binWrapper", "fallbackImage", "", "iconUrl", "trackedIconUrl", "updateCardTypeView$features_bdui_release", "(Lz22;ZLb5n;ILjava/lang/String;Ljava/lang/String;)V", "updateCardTypeView", "moveCursor$features_bdui_release", "()V", "moveCursor", "showError$features_bdui_release", "()Z", "showError", "text", "setCardNumberIfNew$features_bdui_release", "(Ljava/lang/String;)V", "setCardNumberIfNew", "hideError$features_bdui_release", "hideError", "Labr;", "binding", "Labr;", "getBinding$features_bdui_release", "()Labr;", "paddingWithIcon", CA20Status.STATUS_USER_I, "paddingWithoutIcon", "iconWidthPx", "paddingAnimator", "Landroid/animation/ValueAnimator;", "Ldl8;", "iconAnimationState", "Ldl8;", "Lxj8;", "lastIconState", "Lxj8;", "value", "getTextFieldValue", "()Ljava/lang/String;", "setTextFieldValue", "textFieldValue", "getTextFieldValueMasked$features_bdui_release", "setTextFieldValueMasked$features_bdui_release", "textFieldValueMasked", "Companion", "IconAnimationListener", "cl8", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardPanInputView extends LinearLayout {
    private static final cl8 Companion = new cl8();
    private static final long ICON_ANIMATION_DURATION_MS = 200;
    private final abr binding;
    private dl8 iconAnimationState;
    private final int iconWidthPx;
    private xj8 lastIconState;
    private ValueAnimator paddingAnimator;
    private final int paddingWithIcon;
    private final int paddingWithoutIcon;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/views/CardPanInputView$IconAnimationListener;", "Landroid/animation/AnimatorListenerAdapter;", "<init>", "(Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/views/CardPanInputView;)V", "Landroid/animation/Animator;", "animation", "Lzy11;", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationCancel", "onAnimationEnd", "", "wasCancelled", "Z", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class IconAnimationListener extends AnimatorListenerAdapter {
        private boolean wasCancelled;

        public IconAnimationListener() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            this.wasCancelled = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            dl8 dl8Var;
            if (this.wasCancelled || (dl8Var = CardPanInputView.this.iconAnimationState) == null) {
                return;
            }
            int i = dl8Var.d;
            CardPanInputView.this.setIconWidth(i);
            CardPanInputView.this.getBinding().b.setVisibility(i == 0 ? 4 : 0);
            CardPanInputView.this.setInputStartPadding(dl8Var.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            this.wasCancelled = false;
        }
    }

    public CardPanInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(omh0.finsdk_view_card_pan_input, this);
        int i3 = ugh0.finsdkPanCardIcon;
        ImageView imageView = (ImageView) cma1.O(i3, this);
        if (imageView != null) {
            i3 = ugh0.finsdkPanInputLabel;
            TextView textView = (TextView) cma1.O(i3, this);
            if (textView != null) {
                i3 = ugh0.finsdkPanInputText;
                EditText editText = (EditText) cma1.O(i3, this);
                if (editText != null) {
                    i3 = ugh0.finsdkPanInputTextHint;
                    TextView textView2 = (TextView) cma1.O(i3, this);
                    if (textView2 != null) {
                        i3 = ugh0.finsdkPanInputTextMasked;
                        EditText editText2 = (EditText) cma1.O(i3, this);
                        if (editText2 != null) {
                            final abr abrVar = new abr(this, imageView, textView, editText, textView2, editText2);
                            this.binding = abrVar;
                            this.paddingWithIcon = getResources().getDimensionPixelSize(btg0.finsdk_card_icon_width);
                            this.paddingWithoutIcon = editText.getPaddingLeft();
                            this.iconWidthPx = getResources().getDimensionPixelSize(btg0.finsdk_card_icon_width);
                            setOrientation(1);
                            setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
                            textView2.setVisibility(editText.getText().length() == 0 ? 0 : 8);
                            editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.views.CardPanInputView$_init_$lambda$1$$inlined$doAfterTextChanged$1
                                @Override // android.text.TextWatcher
                                public void afterTextChanged(Editable s) {
                                    abr.this.e.setVisibility((s == null || s.length() == 0) ? 0 : 8);
                                }

                                @Override // android.text.TextWatcher
                                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                                }

                                @Override // android.text.TextWatcher
                                public void onTextChanged(CharSequence text, int start, int before, int count) {
                                }
                            });
                            setIconWidth(0);
                            imageView.setVisibility(4);
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    private final void animateIconAndPadding(boolean hasIcon) {
        int paddingLeft;
        int i;
        ValueAnimator valueAnimator = this.paddingAnimator;
        Float f = null;
        if (valueAnimator != null) {
            if (!valueAnimator.isRunning()) {
                valueAnimator = null;
            }
            if (valueAnimator != null) {
                f = Float.valueOf(valueAnimator.getAnimatedFraction());
            }
        }
        dl8 dl8Var = this.iconAnimationState;
        if (f == null || dl8Var == null) {
            paddingLeft = this.binding.d.getPaddingLeft();
        } else {
            float floatValue = f.floatValue();
            paddingLeft = m810.b(((dl8Var.b - r3) * floatValue) + dl8Var.a);
        }
        if (f == null || dl8Var == null) {
            i = this.binding.b.getLayoutParams().width;
        } else {
            float floatValue2 = f.floatValue();
            i = m810.b(((dl8Var.d - r3) * floatValue2) + dl8Var.c);
        }
        int i2 = hasIcon ? this.paddingWithIcon : this.paddingWithoutIcon;
        int i3 = hasIcon ? this.iconWidthPx : 0;
        if (paddingLeft == i2 && i == i3) {
            this.binding.b.setVisibility(i3 == 0 ? 4 : 0);
            return;
        }
        this.iconAnimationState = new dl8(paddingLeft, i2, i, i3);
        this.binding.b.setVisibility(0);
        ValueAnimator valueAnimator2 = this.paddingAnimator;
        if (valueAnimator2 == null) {
            valueAnimator2 = createIconAnimator();
            this.paddingAnimator = valueAnimator2;
        }
        valueAnimator2.start();
    }

    private final ValueAnimator createIconAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new yi(10, this));
        ofFloat.addListener(new IconAnimationListener());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createIconAnimator$lambda$9$lambda$8(CardPanInputView cardPanInputView, ValueAnimator valueAnimator) {
        dl8 dl8Var = cardPanInputView.iconAnimationState;
        if (dl8Var == null) {
            return;
        }
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int b = m810.b(((dl8Var.b - r1) * animatedFraction) + dl8Var.a);
        cardPanInputView.setIconWidth(m810.b(((dl8Var.d - r2) * animatedFraction) + dl8Var.c));
        cardPanInputView.setInputStartPadding(b);
    }

    public static /* synthetic */ void gainFocus$features_bdui_release$default(CardPanInputView cardPanInputView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        cardPanInputView.gainFocus$features_bdui_release(z);
    }

    private final String getTextFieldValue() {
        return this.binding.d.getText().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setIconWidth(int width) {
        ViewGroup.LayoutParams layoutParams = this.binding.b.getLayoutParams();
        if (layoutParams.width != width) {
            layoutParams.width = width;
            this.binding.b.setLayoutParams(layoutParams);
            this.binding.b.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInputStartPadding(int padding) {
        EditText editText = this.binding.d;
        editText.setPadding(padding, editText.getPaddingTop(), this.binding.d.getPaddingRight(), this.binding.d.getPaddingBottom());
        TextView textView = this.binding.e;
        textView.setPadding(padding, textView.getPaddingTop(), this.binding.e.getPaddingRight(), this.binding.e.getPaddingBottom());
        EditText editText2 = this.binding.f;
        editText2.setPadding(padding, editText2.getPaddingTop(), this.binding.f.getPaddingRight(), this.binding.f.getPaddingBottom());
    }

    private final void setTextFieldValue(String str) {
        this.binding.d.setText(str);
    }

    public static /* synthetic */ void updateCardTypeView$features_bdui_release$default(CardPanInputView cardPanInputView, z22 z22Var, boolean z, b5n b5nVar, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z22Var = null;
        }
        if ((i2 & 4) != 0) {
            b5nVar = null;
        }
        if ((i2 & 32) != 0) {
            str2 = null;
        }
        cardPanInputView.updateCardTypeView$features_bdui_release(z22Var, z, b5nVar, i, str, str2);
    }

    public final void gainFocus$features_bdui_release(boolean showKeyboard) {
        EditText editText = this.binding.d;
        if (showKeyboard) {
            editText.requestFocus();
            editText.post(new ce0(editText, 14));
        }
    }

    /* renamed from: getBinding$features_bdui_release, reason: from getter */
    public final abr getBinding() {
        return this.binding;
    }

    public final String getTextFieldValueMasked$features_bdui_release() {
        String str;
        Editable text = this.binding.f.getText();
        if (text != null) {
            StringBuilder sb = new StringBuilder();
            int length = text.length();
            for (int i = 0; i < length; i++) {
                char charAt = text.charAt(i);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            str = sb.toString();
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    public final void hideError$features_bdui_release() {
        TextView textView = this.binding.c;
        Resources resources = getResources();
        int i = brg0.finsdk_text_secondary;
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal threadLocal = wuj0.a;
        textView.setTextColor(resources.getColor(i, theme));
    }

    public final void moveCursor$features_bdui_release() {
        EditText editText = this.binding.d;
        Editable text = editText.getText();
        if (text != null) {
            editText.setSelection(text.length());
        }
    }

    public final void setCardNumberIfNew$features_bdui_release(String text) {
        if (cvu0.v(this.binding.d.getText().toString(), " ", "", false).equals(text)) {
            return;
        }
        this.binding.d.setText(text);
    }

    public final void setLocked$features_bdui_release(boolean isLocked) {
        abr abrVar = this.binding;
        TextView textView = abrVar.c;
        th91.g(textView, isLocked);
        textView.setClickable(false);
        th91.g(abrVar.d, isLocked);
        th91.g(abrVar.f, isLocked);
    }

    public final void setTextFieldValueMasked$features_bdui_release(String str) {
        this.binding.f.setText(str);
    }

    public final boolean showError$features_bdui_release() {
        hideError$features_bdui_release();
        boolean z = !evu0.J(getTextFieldValue());
        TextView textView = this.binding.c;
        Resources resources = getResources();
        int i = brg0.finsdk_text_negative;
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal threadLocal = wuj0.a;
        textView.setTextColor(resources.getColor(i, theme));
        return z;
    }

    public final void updateCardTypeView$features_bdui_release(z22 analytics, boolean isDynamicBinEnabled, b5n binWrapper, int fallbackImage, String iconUrl, String trackedIconUrl) {
        boolean z = (fallbackImage == 0 && (iconUrl == null || evu0.J(iconUrl))) ? false : true;
        xj8 xj8Var = new xj8(fallbackImage, iconUrl);
        boolean equals = xj8Var.equals(this.lastIconState);
        if (!equals) {
            animateIconAndPadding(z);
            if (z) {
                this.binding.b.setVisibility(0);
            }
            this.lastIconState = xj8Var;
        }
        if (!z) {
            setIconWidth(0);
            setInputStartPadding(this.paddingWithoutIcon);
            this.binding.b.setVisibility(4);
        }
        if (equals) {
            return;
        }
        WeakHashMap weakHashMap = tj8.a;
        ImageView imageView = this.binding.b;
        qj8 qj8Var = new qj8(analytics, binWrapper, imageView, isDynamicBinEnabled, trackedIconUrl);
        rj8 rj8Var = new rj8(iconUrl, fallbackImage);
        WeakHashMap weakHashMap2 = tj8.b;
        rj8 rj8Var2 = (rj8) weakHashMap2.get(imageView);
        WeakHashMap weakHashMap3 = tj8.a;
        g1k g1kVar = (g1k) weakHashMap3.get(imageView);
        if (iconUrl == null || evu0.J(iconUrl)) {
            if (g1kVar != null) {
                g1kVar.dispose();
            }
            weakHashMap3.remove(imageView);
            weakHashMap2.put(imageView, rj8Var);
            tj8.a(imageView, fallbackImage);
            return;
        }
        weakHashMap2.put(imageView, rj8Var);
        if (jl40.l(rj8Var2, weakHashMap2.get(imageView)) && g1kVar == null) {
            imageView.setVisibility(0);
            tj8.b(qj8Var, rj8Var, System.currentTimeMillis(), true);
            return;
        }
        g1k g1kVar2 = (g1k) weakHashMap3.remove(imageView);
        if (g1kVar2 != null) {
            g1kVar2.dispose();
        }
        tj8.a(imageView, fallbackImage);
        long currentTimeMillis = System.currentTimeMillis();
        if (analytics != null && binWrapper != null) {
            yz91.c(analytics, new li3(6, DynamicBinInfoEventName.ICON_LOAD_STARTED.a(), b.i(new Pair(AppSettingsContract$Setting.COLUMN_PREFIX, binWrapper.a), new Pair("icon_url", iconUrl), new Pair("is_cached", String.valueOf(false)))), isDynamicBinEnabled);
        }
        c f = h2b1.f(imageView.getContext());
        bev bevVar = new bev(imageView.getContext());
        bevVar.c = iconUrl;
        bevVar.o(imageView);
        bevVar.e();
        bevVar.n(wis0.c);
        if (fallbackImage != 0) {
            bevVar.u = Integer.valueOf(fallbackImage);
            bevVar.v = null;
            bevVar.w = Integer.valueOf(fallbackImage);
        }
        bevVar.e = new sj8(rj8Var, qj8Var, currentTimeMillis, qj8Var, rj8Var, currentTimeMillis);
        weakHashMap3.put(imageView, f.b(bevVar.d()));
    }

    public CardPanInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public CardPanInputView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ CardPanInputView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public CardPanInputView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
