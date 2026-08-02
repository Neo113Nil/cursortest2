package com.yandex.payment.sdk.ui.view.card;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.navigation.NavigationBarView;
import com.yandex.xplat.payment.sdk.CardPaymentSystem;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import defpackage.azv;
import defpackage.bk;
import defpackage.bzv;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.czv;
import defpackage.eja0;
import defpackage.evu0;
import defpackage.ff2;
import defpackage.gvu0;
import defpackage.iog0;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kby;
import defpackage.ny61;
import defpackage.o9h0;
import defpackage.of8;
import defpackage.ong0;
import defpackage.pk8;
import defpackage.q501;
import defpackage.qjd;
import defpackage.r891;
import defpackage.rp8;
import defpackage.sd8;
import defpackage.sls;
import defpackage.tfb1;
import defpackage.tls;
import defpackage.tyh0;
import defpackage.uk8;
import defpackage.uoa0;
import defpackage.up8;
import defpackage.w511;
import defpackage.we8;
import defpackage.wme;
import defpackage.xlh0;
import defpackage.znb1;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 [2\u00020\u0001:\u0002\\]B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\f0\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\u001b\u0010*\u001a\u00020\f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010\u0010J!\u0010.\u001a\u00020\f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\f0\u001c¢\u0006\u0004\b.\u0010 J\u0017\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\fH\u0002¢\u0006\u0004\b3\u0010\u0010J\u0019\u00105\u001a\u00020\f2\b\b\u0002\u00104\u001a\u00020\nH\u0002¢\u0006\u0004\b5\u0010\u000eJ\u000f\u00106\u001a\u00020\fH\u0002¢\u0006\u0004\b6\u0010\u0010R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\f0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R.\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010 R*\u0010A\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010;\u001a\u0004\bB\u0010C\"\u0004\bD\u0010+R(\u0010E\u001a\b\u0012\u0004\u0012\u00020\f0(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010;\u001a\u0004\bF\u0010C\"\u0004\bG\u0010+R*\u00100\u001a\u00020/2\u0006\u0010H\u001a\u00020/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u00102R\"\u0010M\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010'\"\u0004\bP\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010NR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR$\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\f\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010=R\u0016\u0010T\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\"\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\f0\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010=R\u0016\u0010Z\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010N¨\u0006^"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/card/CardNumberInput;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enableDebranding", "Lzy11;", "setEnableDebranding", "(Z)V", "gainFocus", "()V", "dropFocus", "reset", "", "cardNumber", "setExternalPreparedNumber", "(Ljava/lang/String;)V", "Lof8;", "Lpk8;", "cardNumberValidator", "setValidator", "(Lof8;)V", "Lkotlin/Function1;", "Lrp8;", "listener", "setOnCardTypeChangedListener", "(Ltls;)V", "getCardNumber", "()Ljava/lang/String;", "Lup8;", "validate", "()Lup8;", "isValid", "()Z", "Lkotlin/Function0;", "onCvnFinishEditing", "setCallback", "(Lsls;)V", "showError", "Lczv;", "setInputEventListener", "Lcom/yandex/payment/sdk/ui/view/card/CardNumberInput$State;", ClidProvider.STATE, "updateState", "(Lcom/yandex/payment/sdk/ui/view/card/CardNumberInput$State;)V", "moveCursor", "shouldShowError", "onFinishEditing", "updateCardType", "Luoa0;", "binding", "Luoa0;", "callback", "Lsls;", "onFinish", "Ltls;", "getOnFinish", "()Ltls;", "setOnFinish", "onFocus", "getOnFocus", "()Lsls;", "setOnFocus", "onKeyboardAction", "getOnKeyboardAction", "setOnKeyboardAction", "value", "Lcom/yandex/payment/sdk/ui/view/card/CardNumberInput$State;", "getState", "()Lcom/yandex/payment/sdk/ui/view/card/CardNumberInput$State;", "setState", "hasError", "Z", "getHasError", "setHasError", "validator", "Lof8;", "onCardTypeChangedListener", "cardType", "Lrp8;", "Landroid/text/Editable;", "backedText", "Landroid/text/Editable;", "eventListener", UgcLiveVideoData.UgcLiveStatus.READY, "Companion", "State", "uk8", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardNumberInput extends LinearLayout {
    private static final uk8 Companion = new uk8();

    @Deprecated
    public static final int LENGTH_ERROR_CHECK_THRESHOLD = 16;
    private Editable backedText;
    private final uoa0 binding;
    private sls callback;
    private rp8 cardType;
    private boolean enableDebranding;
    private tls eventListener;
    private boolean hasError;
    private tls onCardTypeChangedListener;
    private tls onFinish;
    private sls onFocus;
    private sls onKeyboardAction;
    private boolean ready;
    private State state;
    private of8 validator;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/card/CardNumberInput$State;", "", "FULL", "MASKED", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State FULL;
        public static final State MASKED;

        static {
            State state = new State("FULL", 0);
            FULL = state;
            State state2 = new State("MASKED", 1);
            MASKED = state2;
            State[] stateArr = {state, state2};
            $VALUES = stateArr;
            $ENTRIES = kotlin.enums.a.a(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public CardNumberInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(xlh0.paymentsdk_card_number_input, this);
        int i2 = o9h0.paymentsdk_prebuilt_pan_input_label;
        TextView textView = (TextView) cma1.O(i2, this);
        if (textView != null) {
            i2 = o9h0.paymentsdk_prebuilt_pan_input_text;
            EditText editText = (EditText) cma1.O(i2, this);
            if (editText != null) {
                this.binding = new uoa0(this, textView, editText);
                this.callback = new we8(5);
                this.onFinish = new sd8(13);
                this.onKeyboardAction = new we8(6);
                this.state = State.FULL;
                this.cardType = znb1.e(CardPaymentSystem.UNKNOWN);
                this.eventListener = new sd8(14);
                setOrientation(1);
                setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
                if (((AccessibilityManager) context.getSystemService("accessibility")).isEnabled()) {
                    editText.setHint(context.getString(tyh0.paymentsdk_prebuilt_card_number_input_title));
                }
                editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.ui.view.card.CardNumberInput.1
                    private String current = "";

                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable s) {
                        if (CardNumberInput.this.getState() == State.MASKED || jl40.l(s.toString(), this.current)) {
                            return;
                        }
                        CardNumberInput.this.eventListener.invoke(new bzv(TextFieldNameForAnalytics.CARD_NUMBER));
                        StringBuilder sb = new StringBuilder();
                        int length = s.length();
                        for (int i3 = 0; i3 < length; i3++) {
                            char charAt = s.charAt(i3);
                            if (Character.isDigit(charAt)) {
                                sb.append(charAt);
                            }
                        }
                        ArrayList arrayList = rp8.f;
                        rp8 s2 = q501.s(sb.toString());
                        if (sb.length() <= ((Number) kotlin.collections.a.Z(s2.c)).intValue()) {
                            this.current = tfb1.f(sb.toString(), s2.e);
                            s.setFilters(new InputFilter[0]);
                        }
                        int length2 = s.length();
                        String str = this.current;
                        s.replace(0, length2, str, 0, str.length());
                        CardNumberInput.this.updateCardType();
                        CardNumberInput.this.onFinishEditing(sb.length() >= 16);
                    }

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                    }
                });
                editText.setOnFocusChangeListener(new bk(4, this));
                editText.setOnEditorActionListener(new ff2(2, this));
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CardNumberInput cardNumberInput, View view, boolean z) {
        if (z) {
            sls slsVar = cardNumberInput.onFocus;
            if (slsVar != null) {
                slsVar.invoke();
            }
        } else {
            onFinishEditing$default(cardNumberInput, false, 1, null);
        }
        cardNumberInput.eventListener.invoke(new azv(z, TextFieldNameForAnalytics.CARD_NUMBER));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(CardNumberInput cardNumberInput, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        cardNumberInput.onKeyboardAction.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 eventListener$lambda$0(czv czvVar) {
        return zy11.a;
    }

    private final void moveCursor() {
        EditText editText = this.binding.c;
        Editable text = editText.getText();
        if (text != null) {
            editText.setSelection(text.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onFinish$lambda$0(boolean z) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFinishEditing(boolean shouldShowError) {
        String string;
        if (this.state == State.MASKED) {
            return;
        }
        up8 validate = validate();
        boolean z = false;
        boolean z2 = validate == null;
        if (!shouldShowError || z2 || evu0.J(getCardNumber())) {
            this.binding.b.setTextColor(r891.f(getContext().getTheme(), ong0.paymentsdk_prebuilt_cardNumberHintColor));
        } else {
            if (validate == null || (string = validate.a) == null) {
                string = getResources().getString(tyh0.paymentsdk_prebuilt_wrong_card_number_message);
            }
            announceForAccessibility(string);
            this.binding.b.setTextColor(r891.f(getContext().getTheme(), iog0.colorError));
            z = true;
        }
        this.hasError = z;
        this.callback.invoke();
        if (this.ready != z2) {
            this.ready = z2;
            this.onFinish.invoke(Boolean.valueOf(z2));
        }
    }

    public static /* synthetic */ void onFinishEditing$default(CardNumberInput cardNumberInput, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        cardNumberInput.onFinishEditing(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCardType() {
        ArrayList arrayList = rp8.f;
        rp8 s = q501.s(getCardNumber());
        CardPaymentSystem cardPaymentSystem = this.cardType.a;
        CardPaymentSystem cardPaymentSystem2 = s.a;
        if (cardPaymentSystem != cardPaymentSystem2) {
            this.cardType = s;
            com.yandex.payment.sdk.core.data.CardPaymentSystem d = wme.d(cardPaymentSystem2);
            Context context = getContext();
            Integer a = eja0.a(d, true, this.enableDebranding);
            Drawable drawable = a != null ? context.getDrawable(a.intValue()) : null;
            if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                announceForAccessibility(cardPaymentSystem2.getValue());
                this.binding.c.setHint(getContext().getString(tyh0.paymentsdk_prebuilt_card_number_input_title) + " " + cardPaymentSystem2.getValue());
            } else {
                this.binding.c.setHint(getContext().getString(tyh0.paymentsdk_prebuilt_card_number_input_title));
            }
            this.binding.c.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            tls tlsVar = this.onCardTypeChangedListener;
            if (tlsVar != null) {
                tlsVar.invoke(this.cardType);
            }
        }
    }

    private final void updateState(State state) {
        int i = a.a[state.ordinal()];
        if (i == 1) {
            this.binding.c.setText(this.backedText);
            moveCursor();
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            this.backedText = this.binding.c.getText();
            SpannableString spannableString = new SpannableString(getContext().getString(tyh0.paymentsdk_prebuilt_card_number_mask_format, gvu0.B0(4, String.valueOf(this.backedText))));
            spannableString.setSpan(new ForegroundColorSpan(r891.f(getContext().getTheme(), ong0.paymentsdk_prebuilt_cardNumberHintColor)), 0, 2, 33);
            this.binding.c.setText(spannableString);
        }
    }

    public final void dropFocus() {
        this.binding.c.clearFocus();
    }

    public final void gainFocus() {
        requestFocus();
        EditText editText = this.binding.c;
        editText.requestFocus();
        editText.post(new ce0(editText, 22));
    }

    public final String getCardNumber() {
        int i = a.a[this.state.ordinal()];
        String str = null;
        if (i != 1) {
            if (i == 2) {
                return String.valueOf(this.backedText);
            }
            w511.b();
            return null;
        }
        Editable text = this.binding.c.getText();
        if (text != null) {
            StringBuilder sb = new StringBuilder();
            int length = text.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = text.charAt(i2);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            str = sb.toString();
        }
        return str == null ? "" : str;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    public final tls getOnFinish() {
        return this.onFinish;
    }

    public final sls getOnFocus() {
        return this.onFocus;
    }

    public final sls getOnKeyboardAction() {
        return this.onKeyboardAction;
    }

    public final State getState() {
        return this.state;
    }

    /* renamed from: isValid, reason: from getter */
    public final boolean getReady() {
        return this.ready;
    }

    public final void reset() {
        setState(State.FULL);
        this.backedText = null;
        this.ready = false;
    }

    public final void setCallback(sls onCvnFinishEditing) {
        this.callback = onCvnFinishEditing;
    }

    public final void setEnableDebranding(boolean enableDebranding) {
        this.enableDebranding = enableDebranding;
    }

    public final void setExternalPreparedNumber(String cardNumber) {
        this.binding.c.setText(cardNumber);
    }

    public final void setHasError(boolean z) {
        this.hasError = z;
    }

    public final void setInputEventListener(tls listener) {
        this.eventListener = listener;
    }

    public final void setOnCardTypeChangedListener(tls listener) {
        this.onCardTypeChangedListener = listener;
    }

    public final void setOnFinish(tls tlsVar) {
        this.onFinish = tlsVar;
    }

    public final void setOnFocus(sls slsVar) {
        this.onFocus = slsVar;
    }

    public final void setOnKeyboardAction(sls slsVar) {
        this.onKeyboardAction = slsVar;
    }

    public final void setState(State state) {
        if (state != this.state) {
            this.state = state;
            updateState(state);
        }
    }

    public final void setValidator(of8 cardNumberValidator) {
        this.validator = cardNumberValidator;
    }

    public final void showError() {
        this.binding.b.setTextColor(r891.f(getContext().getTheme(), iog0.colorError));
    }

    public final up8 validate() {
        pk8 pk8Var = new pk8(getCardNumber());
        of8 of8Var = this.validator;
        if (of8Var == null) {
            of8Var = null;
        }
        qjd a = of8Var.a();
        CardPaymentSystem cardPaymentSystem = this.cardType.a;
        ArrayList arrayList = rp8.f;
        a.c(new kby(q501.r(cardPaymentSystem, false).c));
        return a.b(pk8Var);
    }

    public CardNumberInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CardNumberInput(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CardNumberInput(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
