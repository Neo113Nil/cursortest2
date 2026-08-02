package com.yandex.payment.divkit.challenger;

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
import defpackage.ci8;
import defpackage.cma1;
import defpackage.csf;
import defpackage.dsf;
import defpackage.esf;
import defpackage.evu0;
import defpackage.exg0;
import defpackage.fsf;
import defpackage.gsf;
import defpackage.hpa0;
import defpackage.j9f;
import defpackage.l9h0;
import defpackage.lpg0;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tls;
import defpackage.ulh0;
import defpackage.w511;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 \\2\u00020\u0001:\u0003]\n^B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u0013J\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010\u0013J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0013J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010\u0013J\u000f\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010\u0013J'\u0010,\u001a\u00020\u000e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\b\u0010+\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000eH\u0002¢\u0006\u0004\b.\u0010\u0013J\u000f\u0010/\u001a\u00020\u000eH\u0002¢\u0006\u0004\b/\u0010\u0013J\u0013\u00101\u001a\u00020\u000e*\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0013\u00104\u001a\u00020\u000e*\u000203H\u0002¢\u0006\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010@\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010>R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010C\u001a\b\u0012\u0004\u0012\u0002000(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010BR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010R\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010NR\u0014\u0010V\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010NR\u0014\u0010X\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010QR\u0014\u0010[\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006_"}, d2 = {"Lcom/yandex/payment/divkit/challenger/DKChallengerInputView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lfsf;", ConfigConstants.CONFIG, "Lkotlin/Function1;", "", "Lzy11;", "inputListener", "setConfig", "(Lfsf;Ltls;)Lfsf;", "showSuccess", "()V", "showIncorrectAppearance", "focusInput", "text", "onTextChanged", "(Ljava/lang/String;)V", "hideError", AuthSdkActivity.RESPONSE_TYPE_CODE, "renderCode", "length", "renderCursor", "(I)V", "cleanFieldsContentDescription", "checkShowAmountDivider", "(Ljava/lang/String;Lfsf;)V", "showLoading", "stopLoading", "applyConfig", "(Lfsf;)V", "showSmsConfigView", "hideSmsConfigView", "", "Landroid/widget/TextView;", "list", "hint", "setHints", "(Ljava/util/List;Ljava/lang/String;)V", "showExtraViews", "hideExtraViews", "Landroid/view/View;", "showKeyboard", "(Landroid/view/View;)V", "Landroid/widget/EditText;", "focusOnLastLetter", "(Landroid/widget/EditText;)V", "Lhpa0;", "binding", "Lhpa0;", "currentConfig", "Lfsf;", "listener", "Ltls;", "textColor", CA20Status.STATUS_USER_I, "errorTextColor", "successTextColor", "numberViews", "Ljava/util/List;", "cursorViews", "", "isError", "Z", "Landroid/view/animation/TranslateAnimation;", "anim", "Landroid/view/animation/TranslateAnimation;", "Lcom/yandex/payment/divkit/challenger/DKChallengerInputView$a;", "blinkingAnimation", "Lcom/yandex/payment/divkit/challenger/DKChallengerInputView$a;", "getDotTextView", "()Landroid/widget/TextView;", "dotTextView", "getDotCursorView", "()Landroid/view/View;", "dotCursorView", "getCurrencyTextView", "currencyTextView", "getExtraTextView", "extraTextView", "getExtraCursorView", "extraCursorView", "getInput", "()Landroid/widget/EditText;", "input", "Companion", "gsf", "a", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DKChallengerInputView extends RelativeLayout {

    @Deprecated
    public static final String AMOUNT_DIVIDER = ",";

    @Deprecated
    public static final long CURSOR_BLINK_DELAY = 500;
    private static final gsf Companion = new gsf();

    @Deprecated
    public static final String DEFAULT_AMOUNT_HINT = "0";

    @Deprecated
    public static final long LOADING_ANIMATION_DURATION = 700;

    @Deprecated
    public static final String RUB = "₽";
    private final TranslateAnimation anim;
    private final hpa0 binding;
    private final a blinkingAnimation;
    private fsf currentConfig;
    private List<? extends View> cursorViews;
    private final int errorTextColor;
    private boolean isError;
    private tls listener;
    private List<? extends TextView> numberViews;
    private final int successTextColor;
    private final int textColor;

    public static final class a {
        public View a;
        public boolean b = true;

        public final void a(View view) {
            if (evu0.J(view.getContentDescription()) || !this.b) {
                view.setVisibility(4);
            } else {
                view.setVisibility(view.getVisibility() == 4 ? 0 : 4);
                view.postDelayed(new j9f(12, this, view), 500L);
            }
        }
    }

    public DKChallengerInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        View O2;
        View O3;
        View O4;
        View O5;
        View O6;
        View O7;
        LayoutInflater.from(context).inflate(ulh0.paymentsdk_dk_challenger_input_view, this);
        int i2 = l9h0.blur;
        View O8 = cma1.O(i2, this);
        if (O8 != null) {
            i2 = l9h0.code1;
            TextView textView = (TextView) cma1.O(i2, this);
            if (textView != null) {
                i2 = l9h0.code2;
                TextView textView2 = (TextView) cma1.O(i2, this);
                if (textView2 != null) {
                    i2 = l9h0.code3;
                    TextView textView3 = (TextView) cma1.O(i2, this);
                    if (textView3 != null) {
                        i2 = l9h0.code4;
                        TextView textView4 = (TextView) cma1.O(i2, this);
                        if (textView4 != null) {
                            i2 = l9h0.code5;
                            TextView textView5 = (TextView) cma1.O(i2, this);
                            if (textView5 != null) {
                                i2 = l9h0.code6;
                                TextView textView6 = (TextView) cma1.O(i2, this);
                                if (textView6 != null) {
                                    i2 = l9h0.code7;
                                    TextView textView7 = (TextView) cma1.O(i2, this);
                                    if (textView7 != null) {
                                        i2 = l9h0.code8;
                                        TextView textView8 = (TextView) cma1.O(i2, this);
                                        if (textView8 != null && (O = cma1.O((i2 = l9h0.cursor0), this)) != null && (O2 = cma1.O((i2 = l9h0.cursor1), this)) != null && (O3 = cma1.O((i2 = l9h0.cursor2), this)) != null && (O4 = cma1.O((i2 = l9h0.cursor3), this)) != null && (O5 = cma1.O((i2 = l9h0.cursor4), this)) != null && (O6 = cma1.O((i2 = l9h0.cursor7), this)) != null && (O7 = cma1.O((i2 = l9h0.cursor8), this)) != null) {
                                            i2 = l9h0.editCodeReal;
                                            EditText editText = (EditText) cma1.O(i2, this);
                                            if (editText != null) {
                                                i2 = l9h0.llCodeWrapper;
                                                if (((LinearLayout) cma1.O(i2, this)) != null) {
                                                    i2 = l9h0.mainContainer;
                                                    if (((RelativeLayout) cma1.O(i2, this)) != null) {
                                                        this.binding = new hpa0(this, O8, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, O, O2, O3, O4, O5, O6, O7, editText);
                                                        this.currentConfig = csf.c;
                                                        this.textColor = context.getColor(lpg0.paymentsdk_divkit_primary_text_color);
                                                        this.errorTextColor = context.getColor(lpg0.paymentsdk_divkit_error_text_color);
                                                        this.successTextColor = context.getColor(lpg0.paymentsdk_divkit_success_cvv_color);
                                                        EmptyList emptyList = EmptyList.a;
                                                        this.numberViews = emptyList;
                                                        this.cursorViews = emptyList;
                                                        editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.divkit.challenger.DKChallengerInputView$special$$inlined$doAfterTextChanged$1
                                                            @Override // android.text.TextWatcher
                                                            public void afterTextChanged(Editable s) {
                                                                DKChallengerInputView.this.onTextChanged(String.valueOf(s));
                                                            }

                                                            @Override // android.text.TextWatcher
                                                            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                                                            }

                                                            @Override // android.text.TextWatcher
                                                            public void onTextChanged(CharSequence text, int start, int before, int count) {
                                                            }
                                                        });
                                                        setBackgroundResource(exg0.paymentsdk_bg_challenger_input);
                                                        TranslateAnimation translateAnimation = new TranslateAnimation(1, -1.0f, 2, 1.0f, 1, 0.0f, 1, 0.0f);
                                                        translateAnimation.setDuration(700L);
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
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void applyConfig(fsf config) {
        getInput().setFilters(new InputFilter[]{new InputFilter.LengthFilter(config.a)});
        setOnClickListener(new ci8(21, this));
        if (config instanceof esf) {
            showSmsConfigView();
            hpa0 hpa0Var = this.binding;
            this.numberViews = scc.g(hpa0Var.c, hpa0Var.e, hpa0Var.f, hpa0Var.g, hpa0Var.i, hpa0Var.j);
            hpa0 hpa0Var2 = this.binding;
            this.cursorViews = scc.g(hpa0Var2.k, hpa0Var2.l, hpa0Var2.m, hpa0Var2.n, hpa0Var2.o, hpa0Var2.p, hpa0Var2.q);
            setHints(this.numberViews, null);
            getDotTextView().setVisibility(0);
            this.binding.d.setVisibility(8);
            getDotCursorView().setVisibility(4);
            this.binding.l.setVisibility(4);
            getCurrencyTextView().setVisibility(8);
            return;
        }
        if (config instanceof dsf) {
            hideSmsConfigView();
            hpa0 hpa0Var3 = this.binding;
            this.numberViews = scc.g(hpa0Var3.c, hpa0Var3.f, hpa0Var3.g);
            hpa0 hpa0Var4 = this.binding;
            this.cursorViews = scc.g(hpa0Var4.k, hpa0Var4.m, hpa0Var4.n, hpa0Var4.o);
            setHints(this.numberViews, "0");
            getDotCursorView().setVisibility(4);
            getDotTextView().setVisibility(0);
            getCurrencyTextView().setVisibility(0);
            hideExtraViews();
            return;
        }
        if (!(config instanceof csf)) {
            w511.b();
            return;
        }
        hideSmsConfigView();
        hpa0 hpa0Var5 = this.binding;
        this.numberViews = scc.g(hpa0Var5.c, hpa0Var5.d, hpa0Var5.f, hpa0Var5.g);
        hpa0 hpa0Var6 = this.binding;
        this.cursorViews = scc.g(hpa0Var6.k, hpa0Var6.l, hpa0Var6.m, hpa0Var6.n, hpa0Var6.o);
        setHints(this.numberViews, "0");
        getDotTextView().setVisibility(0);
        getDotCursorView().setVisibility(4);
        getCurrencyTextView().setVisibility(0);
        showExtraViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyConfig$lambda$0(DKChallengerInputView dKChallengerInputView, View view) {
        if (dKChallengerInputView.binding.b.getVisibility() == 0) {
            return;
        }
        dKChallengerInputView.focusInput();
    }

    private final void checkShowAmountDivider(String code, fsf config) {
        if (code.length() >= config.b) {
            getDotTextView().setText(",");
        } else {
            getDotTextView().setText("");
        }
    }

    private final void cleanFieldsContentDescription() {
        Iterator<T> it = this.cursorViews.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setContentDescription("");
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
        Iterator<T> it = this.numberViews.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setTextColor(this.textColor);
        }
        getDotTextView().setTextColor(this.textColor);
        getCurrencyTextView().setText("");
    }

    private final void hideExtraViews() {
        getExtraTextView().setVisibility(8);
        getExtraCursorView().setVisibility(8);
    }

    private final void hideSmsConfigView() {
        hpa0 hpa0Var = this.binding;
        hpa0Var.i.setVisibility(8);
        hpa0Var.j.setVisibility(8);
        hpa0Var.p.setVisibility(8);
        hpa0Var.q.setVisibility(8);
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
        fsf fsfVar = this.currentConfig;
        if (!(fsfVar instanceof esf)) {
            checkShowAmountDivider(code, fsfVar);
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
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setHint(hint);
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
        hpa0 hpa0Var = this.binding;
        hpa0Var.i.setVisibility(0);
        hpa0Var.j.setVisibility(0);
        hpa0Var.p.setVisibility(4);
        hpa0Var.q.setVisibility(4);
    }

    private final void stopLoading() {
        this.binding.b.setVisibility(8);
        this.anim.cancel();
        this.anim.reset();
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

    public final fsf setConfig(fsf config, tls inputListener) {
        this.currentConfig = config;
        this.listener = inputListener;
        applyConfig(config);
        getInput().setText("");
        focusInput();
        return config;
    }

    public final void showIncorrectAppearance() {
        this.binding.r.setEnabled(true);
        Iterator<T> it = this.numberViews.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setTextColor(this.errorTextColor);
        }
        stopLoading();
        if (!(this.currentConfig instanceof esf)) {
            getDotTextView().setText(",");
            getDotTextView().setTextColor(this.errorTextColor);
            getCurrencyTextView().setText("₽");
        }
        this.isError = true;
        focusInput();
    }

    public final void showSuccess() {
        stopLoading();
        Iterator<T> it = this.numberViews.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setTextColor(this.successTextColor);
        }
        if (this.currentConfig instanceof esf) {
            return;
        }
        getDotTextView().setTextColor(this.successTextColor);
        getCurrencyTextView().setText("₽");
        getCurrencyTextView().setTextColor(this.successTextColor);
    }

    public DKChallengerInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DKChallengerInputView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DKChallengerInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
