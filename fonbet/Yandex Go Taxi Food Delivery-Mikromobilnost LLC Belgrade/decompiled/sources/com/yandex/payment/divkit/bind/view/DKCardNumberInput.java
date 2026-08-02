package com.yandex.payment.divkit.bind.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.navigation.NavigationBarView;
import com.yandex.xplat.payment.sdk.CardPaymentSystem;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import defpackage.a5f;
import defpackage.azv;
import defpackage.bk;
import defpackage.bzv;
import defpackage.cma1;
import defpackage.czv;
import defpackage.dja0;
import defpackage.dxg0;
import defpackage.evu0;
import defpackage.ff2;
import defpackage.fpa0;
import defpackage.gvu0;
import defpackage.hxe;
import defpackage.i891;
import defpackage.iog0;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kby;
import defpackage.l9h0;
import defpackage.ny61;
import defpackage.of8;
import defpackage.ong0;
import defpackage.p2u0;
import defpackage.pk8;
import defpackage.q501;
import defpackage.qjd;
import defpackage.rp8;
import defpackage.sls;
import defpackage.tfb1;
import defpackage.tls;
import defpackage.tyh0;
import defpackage.ulh0;
import defpackage.up8;
import defpackage.w511;
import defpackage.wj91;
import defpackage.wme;
import defpackage.xrf;
import defpackage.znb1;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 e2\u00020\u0001:\u0002fgB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\f0\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u00020\f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0%¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020)¢\u0006\u0004\b,\u0010+J\r\u0010-\u001a\u00020\f¢\u0006\u0004\b-\u0010\u0010J!\u0010/\u001a\u00020\f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\f0\u001c¢\u0006\u0004\b/\u0010 J\u0011\u00101\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\f2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\fH\u0002¢\u0006\u0004\b7\u0010\u0010J\u0019\u00109\u001a\u00020\f2\b\b\u0002\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\b9\u0010\u000eJ\u000f\u0010:\u001a\u00020\fH\u0002¢\u0006\u0004\b:\u0010\u0010R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020\f0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R.\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010 R.\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010A\u001a\u0004\bF\u0010C\"\u0004\bG\u0010 R*\u0010H\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010?\u001a\u0004\bI\u0010J\"\u0004\bK\u0010(R(\u0010L\u001a\b\u0012\u0004\u0012\u00020\f0%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010?\u001a\u0004\bM\u0010J\"\u0004\bN\u0010(R*\u00104\u001a\u0002032\u0006\u0010O\u001a\u0002038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u00106R\"\u0010T\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010$\"\u0004\bW\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010UR\u001c\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010YR$\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\f\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010AR\u0016\u0010[\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\"\u0010`\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\f0\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010AR\u0016\u0010a\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010UR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006h"}, d2 = {"Lcom/yandex/payment/divkit/bind/view/DKCardNumberInput;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enableDebranding", "Lzy11;", "setEnableDebranding", "(Z)V", "gainFocus", "()V", "dropFocus", "reset", "", "cardNumber", "setExternalPreparedNumber", "(Ljava/lang/String;)V", "Lof8;", "Lpk8;", "cardNumberValidator", "setValidator", "(Lof8;)V", "Lkotlin/Function1;", "Lrp8;", "listener", "setOnCardTypeChangedListener", "(Ltls;)V", "getCardNumber", "()Ljava/lang/String;", "isValid", "()Z", "Lkotlin/Function0;", "onCvnFinishEditing", "setCallback", "(Lsls;)V", "Landroid/widget/ImageView;", "getScannerImageView", "()Landroid/widget/ImageView;", "getClearInputView", "showError", "Lczv;", "setInputEventListener", "Lup8;", "validate", "()Lup8;", "Lcom/yandex/payment/divkit/bind/view/DKCardNumberInput$State;", ClidProvider.STATE, "updateState", "(Lcom/yandex/payment/divkit/bind/view/DKCardNumberInput$State;)V", "moveCursor", "shouldShowError", "onFinishEditing", "updateCardType", "Lfpa0;", "binding", "Lfpa0;", "callback", "Lsls;", "onFinish", "Ltls;", "getOnFinish", "()Ltls;", "setOnFinish", "onEmpty", "getOnEmpty", "setOnEmpty", "onFocus", "getOnFocus", "()Lsls;", "setOnFocus", "onKeyboardAction", "getOnKeyboardAction", "setOnKeyboardAction", "value", "Lcom/yandex/payment/divkit/bind/view/DKCardNumberInput$State;", "getState", "()Lcom/yandex/payment/divkit/bind/view/DKCardNumberInput$State;", "setState", "hasError", "Z", "getHasError", "setHasError", "validator", "Lof8;", "onCardTypeChangedListener", "cardType", "Lrp8;", "Landroid/text/Editable;", "backedText", "Landroid/text/Editable;", "eventListener", UgcLiveVideoData.UgcLiveStatus.READY, "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "Companion", "State", "xrf", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DKCardNumberInput extends LinearLayout {

    @Deprecated
    public static final int COLLAPSED_VISIBLE_LENGTH = 4;
    private static final xrf Companion = new xrf();

    @Deprecated
    public static final int LENGTH_ERROR_CHECK_THRESHOLD = 16;
    private final AccessibilityManager accessibilityManager;
    private Editable backedText;
    private final fpa0 binding;
    private sls callback;
    private rp8 cardType;
    private boolean enableDebranding;
    private tls eventListener;
    private boolean hasError;
    private tls onCardTypeChangedListener;
    private tls onEmpty;
    private tls onFinish;
    private sls onFocus;
    private sls onKeyboardAction;
    private boolean ready;
    private State state;
    private of8 validator;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/payment/divkit/bind/view/DKCardNumberInput$State;", "", "FULL", "MASKED", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    public DKCardNumberInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(ulh0.paymentsdk_dk_card_number_input, this);
        int i2 = l9h0.cardInputContainer;
        if (((LinearLayout) cma1.O(i2, this)) != null) {
            i2 = l9h0.cardTypeIcon;
            ImageView imageView = (ImageView) cma1.O(i2, this);
            if (imageView != null) {
                i2 = l9h0.dotTextView;
                TextView textView = (TextView) cma1.O(i2, this);
                if (textView != null) {
                    i2 = l9h0.paymentsdk_prebuilt_card_scanner;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
                    if (appCompatImageView != null) {
                        i2 = l9h0.paymentsdk_prebuilt_clear_input;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i2, this);
                        if (appCompatImageView2 != null) {
                            i2 = l9h0.paymentsdk_prebuilt_pan_input_label;
                            TextView textView2 = (TextView) cma1.O(i2, this);
                            if (textView2 != null) {
                                i2 = l9h0.paymentsdk_prebuilt_pan_input_text;
                                EditText editText = (EditText) cma1.O(i2, this);
                                if (editText != null) {
                                    this.binding = new fpa0(this, imageView, textView, appCompatImageView, appCompatImageView2, textView2, editText);
                                    this.callback = new hxe(27);
                                    this.onFinish = new a5f(22);
                                    this.onEmpty = new a5f(23);
                                    this.onKeyboardAction = new hxe(28);
                                    this.state = State.FULL;
                                    this.cardType = znb1.e(CardPaymentSystem.UNKNOWN);
                                    this.eventListener = new a5f(24);
                                    setOrientation(1);
                                    setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
                                    AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
                                    this.accessibilityManager = accessibilityManager;
                                    if (accessibilityManager.isEnabled()) {
                                        editText.setHint(context.getString(tyh0.paymentsdk_prebuilt_card_number_input_title));
                                    }
                                    editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.divkit.bind.view.DKCardNumberInput.1
                                        private String current = "";

                                        @Override // android.text.TextWatcher
                                        public void afterTextChanged(Editable s) {
                                            if (DKCardNumberInput.this.getState() == State.MASKED || jl40.l(s.toString(), this.current)) {
                                                return;
                                            }
                                            DKCardNumberInput.this.eventListener.invoke(new bzv(TextFieldNameForAnalytics.CARD_NUMBER));
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
                                            DKCardNumberInput.this.updateCardType();
                                            DKCardNumberInput.this.getOnEmpty().invoke(Boolean.valueOf(s.length() == 0));
                                            DKCardNumberInput.this.onFinishEditing(sb.length() >= 16);
                                        }

                                        @Override // android.text.TextWatcher
                                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                                        }

                                        @Override // android.text.TextWatcher
                                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                                        }
                                    });
                                    editText.setOnFocusChangeListener(new bk(12, this));
                                    editText.setOnEditorActionListener(new ff2(8, this));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(DKCardNumberInput dKCardNumberInput, View view, boolean z) {
        if (z) {
            sls slsVar = dKCardNumberInput.onFocus;
            if (slsVar != null) {
                slsVar.invoke();
            }
        } else {
            onFinishEditing$default(dKCardNumberInput, false, 1, null);
        }
        dKCardNumberInput.eventListener.invoke(new azv(z, TextFieldNameForAnalytics.CARD_NUMBER));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(DKCardNumberInput dKCardNumberInput, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        dKCardNumberInput.onKeyboardAction.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 eventListener$lambda$0(czv czvVar) {
        return zy11.a;
    }

    private final void moveCursor() {
        EditText editText = this.binding.g;
        Editable text = editText.getText();
        if (text != null) {
            editText.setSelection(text.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onEmpty$lambda$0(boolean z) {
        return zy11.a;
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
        if ((validate instanceof p2u0) || !(!shouldShowError || z2 || evu0.J(getCardNumber()))) {
            if (validate == null || (string = validate.a) == null) {
                string = getResources().getString(tyh0.paymentsdk_prebuilt_wrong_card_number_message);
            }
            announceForAccessibility(string);
            this.binding.f.setTextColor(i891.i(getContext().getTheme(), iog0.colorError));
            z = true;
        } else {
            this.binding.f.setTextColor(i891.i(getContext().getTheme(), ong0.paymentsdk_prebuilt_divkitInputTitleTextColor));
        }
        this.hasError = z;
        this.callback.invoke();
        if (this.ready != z2) {
            this.ready = z2;
            this.onFinish.invoke(Boolean.valueOf(z2));
        }
    }

    public static /* synthetic */ void onFinishEditing$default(DKCardNumberInput dKCardNumberInput, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        dKCardNumberInput.onFinishEditing(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateCardType() {
        Integer valueOf;
        tls tlsVar;
        ArrayList arrayList = rp8.f;
        rp8 s = q501.s(getCardNumber());
        CardPaymentSystem cardPaymentSystem = this.cardType.a;
        CardPaymentSystem cardPaymentSystem2 = s.a;
        if (cardPaymentSystem != cardPaymentSystem2) {
            this.cardType = s;
            com.yandex.payment.sdk.core.data.CardPaymentSystem d = wme.d(cardPaymentSystem2);
            boolean h = i891.h(getContext().getTheme(), ong0.paymentsdk_is_light_theme, true);
            Context context = getContext();
            boolean z = this.enableDebranding;
            if (!h) {
                switch (dja0.b[d.ordinal()]) {
                    case 1:
                        valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_american_express);
                        if (valueOf != null) {
                        }
                        if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                        }
                        this.binding.b.setVisibility(r5 != null ? 0 : 8);
                        this.binding.b.setImageDrawable(r5);
                        tlsVar = this.onCardTypeChangedListener;
                        if (tlsVar != null) {
                        }
                        break;
                    case 2:
                        valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_diners);
                        if (valueOf != null) {
                        }
                        if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                        }
                        this.binding.b.setVisibility(r5 != null ? 0 : 8);
                        this.binding.b.setImageDrawable(r5);
                        tlsVar = this.onCardTypeChangedListener;
                        if (tlsVar != null) {
                        }
                        break;
                    case 3:
                        valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_discover_dark);
                        if (valueOf != null) {
                        }
                        if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                        }
                        this.binding.b.setVisibility(r5 != null ? 0 : 8);
                        this.binding.b.setImageDrawable(r5);
                        tlsVar = this.onCardTypeChangedListener;
                        if (tlsVar != null) {
                        }
                        break;
                    case 4:
                        valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_jcb_dark);
                        if (valueOf != null) {
                        }
                        if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                        }
                        this.binding.b.setVisibility(r5 != null ? 0 : 8);
                        this.binding.b.setImageDrawable(r5);
                        tlsVar = this.onCardTypeChangedListener;
                        if (tlsVar != null) {
                        }
                        break;
                    case 5:
                        valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_humo_dark);
                        if (valueOf != null) {
                        }
                        if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                        }
                        this.binding.b.setVisibility(r5 != null ? 0 : 8);
                        this.binding.b.setImageDrawable(r5);
                        tlsVar = this.onCardTypeChangedListener;
                        if (tlsVar != null) {
                        }
                        break;
                    case 6:
                        valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_maestro);
                        if (valueOf != null) {
                        }
                        if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                        }
                        this.binding.b.setVisibility(r5 != null ? 0 : 8);
                        this.binding.b.setImageDrawable(r5);
                        tlsVar = this.onCardTypeChangedListener;
                        if (tlsVar != null) {
                        }
                        break;
                    case 7:
                        valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_mastercard);
                        if (valueOf != null) {
                        }
                        if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                        }
                        this.binding.b.setVisibility(r5 != null ? 0 : 8);
                        this.binding.b.setImageDrawable(r5);
                        tlsVar = this.onCardTypeChangedListener;
                        if (tlsVar != null) {
                        }
                        break;
                    case 8:
                        if (!z) {
                            valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_rps);
                            if (valueOf != null) {
                            }
                            if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                            }
                            this.binding.b.setVisibility(r5 != null ? 0 : 8);
                            this.binding.b.setImageDrawable(r5);
                            tlsVar = this.onCardTypeChangedListener;
                            if (tlsVar != null) {
                            }
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                        }
                        this.binding.b.setVisibility(r5 != null ? 0 : 8);
                        this.binding.b.setImageDrawable(r5);
                        tlsVar = this.onCardTypeChangedListener;
                        if (tlsVar != null) {
                        }
                        break;
                    case 9:
                        valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_union_pay_dark);
                        if (valueOf != null) {
                        }
                        if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                        }
                        this.binding.b.setVisibility(r5 != null ? 0 : 8);
                        this.binding.b.setImageDrawable(r5);
                        tlsVar = this.onCardTypeChangedListener;
                        if (tlsVar != null) {
                        }
                        break;
                    case 10:
                        valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_uzcard);
                        if (valueOf != null) {
                        }
                        if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                        }
                        this.binding.b.setVisibility(r5 != null ? 0 : 8);
                        this.binding.b.setImageDrawable(r5);
                        tlsVar = this.onCardTypeChangedListener;
                        if (tlsVar != null) {
                        }
                        break;
                    case 11:
                        valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_visa);
                        if (valueOf != null) {
                        }
                        if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                        }
                        this.binding.b.setVisibility(r5 != null ? 0 : 8);
                        this.binding.b.setImageDrawable(r5);
                        tlsVar = this.onCardTypeChangedListener;
                        if (tlsVar != null) {
                        }
                        break;
                    case 12:
                        valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_visa_electron);
                        if (valueOf != null) {
                        }
                        if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                        }
                        this.binding.b.setVisibility(r5 != null ? 0 : 8);
                        this.binding.b.setImageDrawable(r5);
                        tlsVar = this.onCardTypeChangedListener;
                        if (tlsVar != null) {
                        }
                        break;
                    case 13:
                        break;
                    default:
                        w511.b();
                        break;
                }
            }
            switch (dja0.b[d.ordinal()]) {
                case 1:
                    valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_american_express);
                    Drawable drawable = valueOf != null ? context.getDrawable(valueOf.intValue()) : null;
                    if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                        announceForAccessibility(cardPaymentSystem2.getValue());
                        this.binding.g.setHint(getContext().getString(tyh0.paymentsdk_prebuilt_card_number_input_title) + " " + cardPaymentSystem2.getValue());
                    } else {
                        this.binding.g.setHint(this.accessibilityManager.isEnabled() ? getContext().getString(tyh0.paymentsdk_prebuilt_card_number_input_title) : getContext().getString(tyh0.paymentsdk_prebuilt_card_number_hint));
                    }
                    this.binding.b.setVisibility(drawable != null ? 0 : 8);
                    this.binding.b.setImageDrawable(drawable);
                    tlsVar = this.onCardTypeChangedListener;
                    if (tlsVar != null) {
                        tlsVar.invoke(this.cardType);
                        break;
                    }
                    break;
                case 2:
                    valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_diners);
                    if (valueOf != null) {
                    }
                    if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                    }
                    this.binding.b.setVisibility(drawable != null ? 0 : 8);
                    this.binding.b.setImageDrawable(drawable);
                    tlsVar = this.onCardTypeChangedListener;
                    if (tlsVar != null) {
                    }
                    break;
                case 3:
                    valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_discover_light);
                    if (valueOf != null) {
                    }
                    if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                    }
                    this.binding.b.setVisibility(drawable != null ? 0 : 8);
                    this.binding.b.setImageDrawable(drawable);
                    tlsVar = this.onCardTypeChangedListener;
                    if (tlsVar != null) {
                    }
                    break;
                case 4:
                    valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_jcb_light);
                    if (valueOf != null) {
                    }
                    if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                    }
                    this.binding.b.setVisibility(drawable != null ? 0 : 8);
                    this.binding.b.setImageDrawable(drawable);
                    tlsVar = this.onCardTypeChangedListener;
                    if (tlsVar != null) {
                    }
                    break;
                case 5:
                    valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_humo);
                    if (valueOf != null) {
                    }
                    if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                    }
                    this.binding.b.setVisibility(drawable != null ? 0 : 8);
                    this.binding.b.setImageDrawable(drawable);
                    tlsVar = this.onCardTypeChangedListener;
                    if (tlsVar != null) {
                    }
                    break;
                case 6:
                    valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_maestro);
                    if (valueOf != null) {
                    }
                    if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                    }
                    this.binding.b.setVisibility(drawable != null ? 0 : 8);
                    this.binding.b.setImageDrawable(drawable);
                    tlsVar = this.onCardTypeChangedListener;
                    if (tlsVar != null) {
                    }
                    break;
                case 7:
                    valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_mastercard);
                    if (valueOf != null) {
                    }
                    if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                    }
                    this.binding.b.setVisibility(drawable != null ? 0 : 8);
                    this.binding.b.setImageDrawable(drawable);
                    tlsVar = this.onCardTypeChangedListener;
                    if (tlsVar != null) {
                    }
                    break;
                case 8:
                    if (!z) {
                        valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_rps);
                        if (valueOf != null) {
                        }
                        if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                        }
                        this.binding.b.setVisibility(drawable != null ? 0 : 8);
                        this.binding.b.setImageDrawable(drawable);
                        tlsVar = this.onCardTypeChangedListener;
                        if (tlsVar != null) {
                        }
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                    }
                    this.binding.b.setVisibility(drawable != null ? 0 : 8);
                    this.binding.b.setImageDrawable(drawable);
                    tlsVar = this.onCardTypeChangedListener;
                    if (tlsVar != null) {
                    }
                    break;
                case 9:
                    valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_union_pay_light);
                    if (valueOf != null) {
                    }
                    if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                    }
                    this.binding.b.setVisibility(drawable != null ? 0 : 8);
                    this.binding.b.setImageDrawable(drawable);
                    tlsVar = this.onCardTypeChangedListener;
                    if (tlsVar != null) {
                    }
                    break;
                case 10:
                    valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_uzcard);
                    if (valueOf != null) {
                    }
                    if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                    }
                    this.binding.b.setVisibility(drawable != null ? 0 : 8);
                    this.binding.b.setImageDrawable(drawable);
                    tlsVar = this.onCardTypeChangedListener;
                    if (tlsVar != null) {
                    }
                    break;
                case 11:
                    valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_visa);
                    if (valueOf != null) {
                    }
                    if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                    }
                    this.binding.b.setVisibility(drawable != null ? 0 : 8);
                    this.binding.b.setImageDrawable(drawable);
                    tlsVar = this.onCardTypeChangedListener;
                    if (tlsVar != null) {
                    }
                    break;
                case 12:
                    valueOf = Integer.valueOf(dxg0.paymentsdk_dk_ic_visa_electron);
                    if (valueOf != null) {
                    }
                    if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                    }
                    this.binding.b.setVisibility(drawable != null ? 0 : 8);
                    this.binding.b.setImageDrawable(drawable);
                    tlsVar = this.onCardTypeChangedListener;
                    if (tlsVar != null) {
                    }
                    break;
                case 13:
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    if (cardPaymentSystem2 != CardPaymentSystem.UNKNOWN) {
                    }
                    this.binding.b.setVisibility(drawable != null ? 0 : 8);
                    this.binding.b.setImageDrawable(drawable);
                    tlsVar = this.onCardTypeChangedListener;
                    if (tlsVar != null) {
                    }
                    break;
                default:
                    w511.b();
                    break;
            }
        }
    }

    private final void updateState(State state) {
        int i = b.a[state.ordinal()];
        if (i == 1) {
            this.binding.g.setText(this.backedText);
            this.binding.c.setVisibility(8);
            moveCursor();
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            this.backedText = this.binding.g.getText();
            this.binding.c.setVisibility(0);
            this.binding.g.setText(gvu0.B0(4, String.valueOf(this.backedText)));
        }
    }

    private final up8 validate() {
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

    public final void dropFocus() {
        this.binding.g.clearFocus();
    }

    public final void gainFocus() {
        requestFocus();
        wj91.c(this.binding.g);
    }

    public final String getCardNumber() {
        int i = b.a[this.state.ordinal()];
        String str = null;
        if (i != 1) {
            if (i == 2) {
                return String.valueOf(this.backedText);
            }
            w511.b();
            return null;
        }
        Editable text = this.binding.g.getText();
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

    public final ImageView getClearInputView() {
        return this.binding.e;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    public final tls getOnEmpty() {
        return this.onEmpty;
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

    public final ImageView getScannerImageView() {
        return this.binding.d;
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
        this.binding.g.setText((CharSequence) null);
        this.ready = false;
    }

    public final void setCallback(sls onCvnFinishEditing) {
        this.callback = onCvnFinishEditing;
    }

    public final void setEnableDebranding(boolean enableDebranding) {
        this.enableDebranding = enableDebranding;
    }

    public final void setExternalPreparedNumber(String cardNumber) {
        this.binding.g.setText(cardNumber);
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

    public final void setOnEmpty(tls tlsVar) {
        this.onEmpty = tlsVar;
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
        this.binding.f.setTextColor(i891.i(getContext().getTheme(), iog0.colorError));
    }

    public DKCardNumberInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DKCardNumberInput(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DKCardNumberInput(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
