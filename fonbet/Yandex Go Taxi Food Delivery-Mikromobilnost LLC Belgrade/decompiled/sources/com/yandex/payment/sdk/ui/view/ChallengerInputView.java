package com.yandex.payment.sdk.ui.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.b99;
import defpackage.c99;
import defpackage.ci8;
import defpackage.cma1;
import defpackage.d99;
import defpackage.e99;
import defpackage.evu0;
import defpackage.f99;
import defpackage.j9h0;
import defpackage.kpg0;
import defpackage.nm7;
import defpackage.ny61;
import defpackage.rlh0;
import defpackage.scc;
import defpackage.tls;
import defpackage.voa0;
import defpackage.w511;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 Z2\u00020\u0001:\u0003[\n\\B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u0013J\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010\u0013J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b%\u0010\u0013J\u000f\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010\u0013J%\u0010+\u001a\u00020\u000e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010*\u001a\u00020\rH\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000eH\u0002¢\u0006\u0004\b-\u0010\u0013J\u000f\u0010.\u001a\u00020\u000eH\u0002¢\u0006\u0004\b.\u0010\u0013J\u0013\u00100\u001a\u00020\u000e*\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u0013\u00103\u001a\u00020\u000e*\u000202H\u0002¢\u0006\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R$\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020/0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@R\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010LR\u0014\u0010T\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010LR\u0014\u0010V\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010OR\u0014\u0010Y\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006]"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/ChallengerInputView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Le99;", ConfigConstants.CONFIG, "Lkotlin/Function1;", "", "Lzy11;", "inputListener", "setConfig", "(Le99;Ltls;)Le99;", "showIncorrectAppearance", "()V", "stopLoading", "focusInput", "text", "onTextChanged", "(Ljava/lang/String;)V", "hideError", AuthSdkActivity.RESPONSE_TYPE_CODE, "renderCode", "length", "renderCursor", "(I)V", "cleanFieldsContentDescription", "checkShowAmountDivider", "(Ljava/lang/String;Le99;)V", "showLoading", "applyConfig", "(Le99;)V", "showSmsConfigView", "hideSmsConfigView", "", "Landroid/widget/TextView;", "list", "hint", "setHints", "(Ljava/util/List;Ljava/lang/String;)V", "showExtraViews", "hideExtraViews", "Landroid/view/View;", "showKeyboard", "(Landroid/view/View;)V", "Landroid/widget/EditText;", "focusOnLastLetter", "(Landroid/widget/EditText;)V", "Lvoa0;", "binding", "Lvoa0;", "currentConfig", "Le99;", "listener", "Ltls;", "textColor", CA20Status.STATUS_USER_I, "errorTextColor", "numberViews", "Ljava/util/List;", "cursorViews", "", "isError", "Z", "Landroid/view/animation/TranslateAnimation;", "anim", "Landroid/view/animation/TranslateAnimation;", "Lcom/yandex/payment/sdk/ui/view/ChallengerInputView$a;", "blinkingAnimation", "Lcom/yandex/payment/sdk/ui/view/ChallengerInputView$a;", "getDotTextView", "()Landroid/widget/TextView;", "dotTextView", "getDotCursorView", "()Landroid/view/View;", "dotCursorView", "getCurrencyTextView", "currencyTextView", "getExtraTextView", "extraTextView", "getExtraCursorView", "extraCursorView", "getInput", "()Landroid/widget/EditText;", "input", "Companion", "f99", "a", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChallengerInputView extends RelativeLayout {

    @Deprecated
    public static final String AMOUNT_DIVIDER = ",";
    private static final f99 Companion = new f99();

    @Deprecated
    public static final String DEFAULT_AMOUNT_HINT = "0";

    @Deprecated
    public static final String DEFAULT_SMS_HINT = "•";

    @Deprecated
    public static final String RUB = "₽";
    private final TranslateAnimation anim;
    private final voa0 binding;
    private final a blinkingAnimation;
    private e99 currentConfig;
    private List<? extends View> cursorViews;
    private final int errorTextColor;
    private boolean isError;
    private tls listener;
    private List<? extends TextView> numberViews;
    private final int textColor;

    public static final class a {
        public View a;
        public boolean b = true;

        public final void a(View view) {
            if (evu0.J(view.getContentDescription()) || !this.b) {
                view.setVisibility(4);
            } else {
                view.setVisibility(view.getVisibility() == 4 ? 0 : 4);
                view.postDelayed(new nm7(23, this, view), 500L);
            }
        }
    }

    public ChallengerInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        View O2;
        View O3;
        View O4;
        View O5;
        View O6;
        View O7;
        LayoutInflater.from(context).inflate(rlh0.paymentsdk_challenger_input_view, this);
        int i2 = j9h0.blur;
        View O8 = cma1.O(i2, this);
        if (O8 != null) {
            i2 = j9h0.code1;
            TextView textView = (TextView) cma1.O(i2, this);
            if (textView != null) {
                i2 = j9h0.code2;
                TextView textView2 = (TextView) cma1.O(i2, this);
                if (textView2 != null) {
                    i2 = j9h0.code3;
                    TextView textView3 = (TextView) cma1.O(i2, this);
                    if (textView3 != null) {
                        i2 = j9h0.code4;
                        TextView textView4 = (TextView) cma1.O(i2, this);
                        if (textView4 != null) {
                            i2 = j9h0.code5;
                            TextView textView5 = (TextView) cma1.O(i2, this);
                            if (textView5 != null) {
                                i2 = j9h0.code6;
                                TextView textView6 = (TextView) cma1.O(i2, this);
                                if (textView6 != null) {
                                    i2 = j9h0.code7;
                                    TextView textView7 = (TextView) cma1.O(i2, this);
                                    if (textView7 != null) {
                                        i2 = j9h0.code8;
                                        TextView textView8 = (TextView) cma1.O(i2, this);
                                        if (textView8 != null && (O = cma1.O((i2 = j9h0.cursor0), this)) != null && (O2 = cma1.O((i2 = j9h0.cursor1), this)) != null && (O3 = cma1.O((i2 = j9h0.cursor2), this)) != null && (O4 = cma1.O((i2 = j9h0.cursor3), this)) != null && (O5 = cma1.O((i2 = j9h0.cursor4), this)) != null && (O6 = cma1.O((i2 = j9h0.cursor7), this)) != null && (O7 = cma1.O((i2 = j9h0.cursor8), this)) != null) {
                                            i2 = j9h0.editCodeReal;
                                            EditText editText = (EditText) cma1.O(i2, this);
                                            if (editText != null) {
                                                i2 = j9h0.llCodeWrapper;
                                                if (((LinearLayout) cma1.O(i2, this)) != null) {
                                                    this.binding = new voa0(this, O8, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, O, O2, O3, O4, O5, O6, O7, editText);
                                                    this.currentConfig = b99.c;
                                                    this.textColor = context.getColor(kpg0.paymentsdk_inputTextColor);
                                                    this.errorTextColor = context.getColor(kpg0.paymentsdk_inputErrorTextColor);
                                                    EmptyList emptyList = EmptyList.a;
                                                    this.numberViews = emptyList;
                                                    this.cursorViews = emptyList;
                                                    editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.ui.view.ChallengerInputView$special$$inlined$doAfterTextChanged$1
                                                        @Override // android.text.TextWatcher
                                                        public void afterTextChanged(Editable s) {
                                                            ChallengerInputView.this.onTextChanged(String.valueOf(s));
                                                        }

                                                        @Override // android.text.TextWatcher
                                                        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                                                        }

                                                        @Override // android.text.TextWatcher
                                                        public void onTextChanged(CharSequence text, int start, int before, int count) {
                                                        }
                                                    });
                                                    TranslateAnimation translateAnimation = new TranslateAnimation(1, -1.0f, 2, 1.0f, 1, 0.0f, 1, 0.0f);
                                                    translateAnimation.setDuration(1000L);
                                                    translateAnimation.setInterpolator(new LinearInterpolator());
                                                    translateAnimation.setRepeatMode(1);
                                                    translateAnimation.setRepeatCount(-1);
                                                    this.anim = translateAnimation;
                                                    this.blinkingAnimation = new a();
                                                    return;
                                                }
                                            }
                                        }
                                    }
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

    private final void applyConfig(e99 config) {
        getInput().setFilters(new InputFilter[]{new InputFilter.LengthFilter(config.a)});
        setOnClickListener(new ci8(4, this));
        if (config instanceof d99) {
            showSmsConfigView();
            voa0 voa0Var = this.binding;
            this.numberViews = scc.g(voa0Var.c, voa0Var.e, voa0Var.f, voa0Var.g, voa0Var.i, voa0Var.j);
            voa0 voa0Var2 = this.binding;
            this.cursorViews = scc.g(voa0Var2.k, voa0Var2.l, voa0Var2.m, voa0Var2.n, voa0Var2.o, voa0Var2.p, voa0Var2.q);
            setHints(this.numberViews, DEFAULT_SMS_HINT);
            getDotTextView().setVisibility(0);
            this.binding.d.setVisibility(8);
            getDotCursorView().setVisibility(4);
            this.binding.l.setVisibility(4);
            getCurrencyTextView().setVisibility(8);
            return;
        }
        if (config instanceof c99) {
            hideSmsConfigView();
            voa0 voa0Var3 = this.binding;
            this.numberViews = scc.g(voa0Var3.c, voa0Var3.f, voa0Var3.g);
            voa0 voa0Var4 = this.binding;
            this.cursorViews = scc.g(voa0Var4.k, voa0Var4.m, voa0Var4.n, voa0Var4.o);
            setHints(this.numberViews, "0");
            getDotCursorView().setVisibility(4);
            getDotTextView().setVisibility(0);
            getCurrencyTextView().setVisibility(0);
            hideExtraViews();
            return;
        }
        if (!(config instanceof b99)) {
            w511.b();
            return;
        }
        hideSmsConfigView();
        voa0 voa0Var5 = this.binding;
        this.numberViews = scc.g(voa0Var5.c, voa0Var5.d, voa0Var5.f, voa0Var5.g);
        voa0 voa0Var6 = this.binding;
        this.cursorViews = scc.g(voa0Var6.k, voa0Var6.l, voa0Var6.m, voa0Var6.n, voa0Var6.o);
        setHints(this.numberViews, "0");
        getDotTextView().setVisibility(0);
        getDotCursorView().setVisibility(4);
        getCurrencyTextView().setVisibility(0);
        showExtraViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyConfig$lambda$0(ChallengerInputView challengerInputView, View view) {
        if (challengerInputView.binding.b.getVisibility() == 0) {
            return;
        }
        challengerInputView.focusInput();
    }

    private final void checkShowAmountDivider(String code, e99 config) {
        if (code.length() >= config.b) {
            getDotTextView().setText(",");
        } else {
            getDotTextView().setText("");
        }
    }

    private final void cleanFieldsContentDescription() {
        Iterator<? extends View> it = this.cursorViews.iterator();
        while (it.hasNext()) {
            it.next().setContentDescription("");
        }
    }

    private final void focusOnLastLetter(EditText editText) {
        editText.setSelection(editText.getText().length());
    }

    private final TextView getCurrencyTextView() {
        return this.binding.h;
    }

    private final View getDotCursorView() {
        return this.binding.n;
    }

    private final TextView getDotTextView() {
        return this.binding.e;
    }

    private final View getExtraCursorView() {
        return this.binding.l;
    }

    private final TextView getExtraTextView() {
        return this.binding.d;
    }

    private final EditText getInput() {
        return this.binding.r;
    }

    private final void hideError() {
        this.blinkingAnimation.b = true;
        this.binding.r.setEnabled(true);
        this.isError = false;
        Iterator<? extends TextView> it = this.numberViews.iterator();
        while (it.hasNext()) {
            it.next().setTextColor(this.textColor);
        }
        getDotTextView().setTextColor(this.textColor);
        getCurrencyTextView().setText("");
    }

    private final void hideExtraViews() {
        getExtraTextView().setVisibility(8);
        getExtraCursorView().setVisibility(8);
    }

    private final void hideSmsConfigView() {
        voa0 voa0Var = this.binding;
        voa0Var.i.setVisibility(8);
        voa0Var.j.setVisibility(8);
        voa0Var.p.setVisibility(8);
        voa0Var.q.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTextChanged(String text) {
        if (this.isError) {
            hideError();
        }
        renderCode(text);
        if (text.length() == this.currentConfig.a) {
            tls tlsVar = this.listener;
            if (tlsVar != null) {
                tlsVar.invoke(text);
            }
            showLoading();
            this.binding.r.setEnabled(false);
        }
    }

    private final void renderCode(String code) {
        e99 e99Var = this.currentConfig;
        if (!(e99Var instanceof d99)) {
            checkShowAmountDivider(code, e99Var);
        }
        int size = this.numberViews.size() - code.length();
        int i = 0;
        int i2 = 0;
        for (Object obj : kotlin.collections.a.q0(this.numberViews)) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            TextView textView = (TextView) obj;
            if (i2 < size) {
                textView.setText("");
            }
            i2 = i3;
        }
        int i4 = 0;
        while (i < code.length()) {
            this.numberViews.get(i4).setText(String.valueOf(code.charAt(i)));
            i++;
            i4++;
        }
        renderCursor(code.length());
    }

    private final void renderCursor(int length) {
        if (scc.f(this.cursorViews) >= length) {
            int i = 0;
            for (Object obj : this.cursorViews) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                View view = (View) obj;
                if (i == length) {
                    view.setContentDescription("s");
                } else {
                    view.setContentDescription("");
                }
                i = i2;
            }
            a aVar = this.blinkingAnimation;
            View view2 = this.cursorViews.get(length);
            View view3 = aVar.a;
            if (view3 != null) {
                view3.setVisibility(4);
            }
            aVar.a = view2;
            aVar.a(view2);
        }
    }

    private final void setHints(List<? extends TextView> list, String hint) {
        Iterator<? extends TextView> it = list.iterator();
        while (it.hasNext()) {
            it.next().setHint(hint);
        }
    }

    private final void showExtraViews() {
        getExtraTextView().setVisibility(0);
        getExtraCursorView().setVisibility(4);
    }

    private final void showKeyboard(View view) {
        view.requestFocus();
        Object systemService = view.getContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 2);
        }
    }

    private final void showLoading() {
        cleanFieldsContentDescription();
        this.blinkingAnimation.b = false;
        this.binding.b.setVisibility(0);
        this.binding.b.startAnimation(this.anim);
    }

    private final void showSmsConfigView() {
        voa0 voa0Var = this.binding;
        voa0Var.i.setVisibility(0);
        voa0Var.j.setVisibility(0);
        voa0Var.p.setVisibility(4);
        voa0Var.q.setVisibility(4);
    }

    public final void focusInput() {
        EditText input = getInput();
        showKeyboard(input);
        focusOnLastLetter(input);
        a aVar = this.blinkingAnimation;
        if (aVar.b) {
            return;
        }
        aVar.b = true;
        renderCursor(input.getText().length());
    }

    public final e99 setConfig(e99 config, tls inputListener) {
        this.currentConfig = config;
        this.listener = inputListener;
        applyConfig(config);
        getInput().setText("");
        focusInput();
        return config;
    }

    public final void showIncorrectAppearance() {
        this.binding.r.setEnabled(true);
        Iterator<? extends TextView> it = this.numberViews.iterator();
        while (it.hasNext()) {
            it.next().setTextColor(this.errorTextColor);
        }
        stopLoading();
        if (!(this.currentConfig instanceof d99)) {
            getDotTextView().setText(",");
            getDotTextView().setTextColor(this.errorTextColor);
            getCurrencyTextView().setText("₽");
        }
        this.isError = true;
        focusInput();
    }

    public final void stopLoading() {
        this.binding.b.setVisibility(8);
        this.anim.cancel();
        this.anim.reset();
    }

    public ChallengerInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ChallengerInputView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ChallengerInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
