package com.yandex.payment.divkit.select;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.xplat.payment.sdk.CardPaymentSystem;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import defpackage.a8a0;
import defpackage.aia0;
import defpackage.asw;
import defpackage.bk;
import defpackage.boj0;
import defpackage.bpa0;
import defpackage.bt5;
import defpackage.cma1;
import defpackage.cmi;
import defpackage.d6w;
import defpackage.evu0;
import defpackage.gvu0;
import defpackage.hmk;
import defpackage.imk;
import defpackage.j8h;
import defpackage.jby;
import defpackage.jmk;
import defpackage.kc8;
import defpackage.l9h0;
import defpackage.md51;
import defpackage.n891;
import defpackage.ny61;
import defpackage.pwl;
import defpackage.q;
import defpackage.q501;
import defpackage.qjd;
import defpackage.qof;
import defpackage.qv90;
import defpackage.qwl;
import defpackage.rp8;
import defpackage.rwo;
import defpackage.scc;
import defpackage.sga0;
import defpackage.sv90;
import defpackage.tls;
import defpackage.ulh0;
import defpackage.up8;
import defpackage.vv90;
import defpackage.wga0;
import defpackage.wj91;
import defpackage.y22;
import defpackage.ymx;
import defpackage.yv90;
import defpackage.znb1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u0013J\u000f\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u0013J\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010\u0013J\u000f\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010\u0013J\u0017\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0011H\u0016¢\u0006\u0004\b.\u0010\u0013J%\u00101\u001a\u00020\u00112\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0011\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R$\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0011\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lcom/yandex/payment/divkit/select/DkCvvInputView;", "Landroid/widget/FrameLayout;", "Lqwl;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getCvn", "()Ljava/lang/String;", "Lup8;", "validate", "()Lup8;", "Lzy11;", "updateLengthFilter", "()V", "", "shouldShowError", "onFinishEditing", "(Z)V", "Lrwo;", "eventReporter", "setEventReporter", "(Lrwo;)V", "isLoading", "showLoading", "showError", "showSuccess", "Lcom/yandex/payment/sdk/core/data/CardPaymentSystem;", "system", "setCardPaymentSystem", "(Lcom/yandex/payment/sdk/core/data/CardPaymentSystem;)V", "Lvv90;", "api", "setPaymentApi", "(Lvv90;)V", "provideCvn", "provideCvnForChallenge", "Lpwl;", "provider", "setCvnProvider", "(Lpwl;)V", "focusInput", "Lkotlin/Function1;", "listener", "setOnReadyListener", "(Ltls;)V", "Lbpa0;", "binding", "Lbpa0;", "Lj8h;", "validator", "Lj8h;", "Lrp8;", "cardType", "Lrp8;", "onReadyListener", "Ltls;", "Lasw;", "paymentApi", "Lasw;", "readyToProvide", "Z", "Lqof;", "controller", "Lqof;", "Lrwo;", "Landroid/view/animation/TranslateAnimation;", "anim", "Landroid/view/animation/TranslateAnimation;", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DkCvvInputView extends FrameLayout implements qwl {
    private final TranslateAnimation anim;
    private final bpa0 binding;
    private rp8 cardType;
    private final qof controller;
    private rwo eventReporter;
    private tls onReadyListener;
    private asw paymentApi;
    private boolean readyToProvide;
    private j8h validator;

    public DkCvvInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        LayoutInflater.from(context).inflate(ulh0.paymentsdk_divkit_cvn_input_view, this);
        int i2 = l9h0.paymentsdk_container_for_numbers;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i2, this);
        if (linearLayout != null && (O = cma1.O((i2 = l9h0.paymentsdk_cvv_blur), this)) != null) {
            i2 = l9h0.paymentsdk_cvv_blur_container;
            CardView cardView = (CardView) cma1.O(i2, this);
            if (cardView != null) {
                i2 = l9h0.paymentsdk_cvv_fake_edittext;
                EditText editText = (EditText) cma1.O(i2, this);
                if (editText != null) {
                    this.binding = new bpa0(this, linearLayout, O, cardView, editText);
                    this.validator = new j8h();
                    this.cardType = znb1.e(CardPaymentSystem.UNKNOWN);
                    this.controller = new qof();
                    editText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.divkit.select.DkCvvInputView$special$$inlined$doOnTextChanged$1
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable s) {
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence text, int start, int before, int count) {
                            rwo rwoVar;
                            qof qofVar;
                            String cvn;
                            rwoVar = DkCvvInputView.this.eventReporter;
                            if (rwoVar != null) {
                                sv90 sv90Var = qv90.a;
                                String valueOf = String.valueOf(text != null ? Integer.valueOf(text.length()) : null);
                                sv90Var.getClass();
                                ((y22) rwoVar).a(sv90.o(valueOf));
                            }
                            qofVar = DkCvvInputView.this.controller;
                            cvn = DkCvvInputView.this.getCvn();
                            boolean z = count > 0;
                            int i3 = 0;
                            for (Object obj : qofVar.a) {
                                int i4 = i3 + 1;
                                if (i3 < 0) {
                                    scc.m();
                                    throw null;
                                }
                                ((DivCvvNumber) obj).setState(qofVar.a.size() - 1 == i3 ? new imk(false) : cvn.length() == i3 ? hmk.a : (cvn.length() - 1 == i3 && z) ? new jmk(String.valueOf(gvu0.y0(cvn))) : cvn.length() > i3 ? hmk.b : hmk.d);
                                i3 = i4;
                            }
                            DkCvvInputView.this.onFinishEditing(false);
                        }
                    });
                    linearLayout.setOnClickListener(new cmi(8, this));
                    editText.setOnFocusChangeListener(new bk(16, this));
                    updateLengthFilter();
                    TranslateAnimation translateAnimation = new TranslateAnimation(2, -0.8f, 2, -0.2f, 1, 0.0f, 1, 0.0f);
                    translateAnimation.setDuration(800L);
                    translateAnimation.setInterpolator(new LinearInterpolator());
                    translateAnimation.setRepeatMode(2);
                    translateAnimation.setRepeatCount(-1);
                    this.anim = translateAnimation;
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(DkCvvInputView dkCvvInputView, View view) {
        wj91.c(dkCvvInputView.binding.e);
        if (dkCvvInputView.readyToProvide) {
            Animation animation = dkCvvInputView.binding.c.getAnimation();
            if (n891.p(animation != null ? Boolean.valueOf(animation.hasEnded()) : null)) {
                qof qofVar = dkCvvInputView.controller;
                boolean z = dkCvvInputView.getVisibility() == 0;
                DivCvvNumber divCvvNumber = (DivCvvNumber) kotlin.collections.a.b0(qofVar.a);
                if (divCvvNumber != null) {
                    divCvvNumber.setState(new imk(z));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(DkCvvInputView dkCvvInputView, View view, boolean z) {
        rwo rwoVar = dkCvvInputView.eventReporter;
        if (rwoVar != null) {
            ((y22) rwoVar).a(sv90.A0(qv90.a, TextFieldNameForAnalytics.CVN, z));
        }
        if (z) {
            return;
        }
        onFinishEditing$default(dkCvvInputView, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getCvn() {
        String str;
        Editable text = this.binding.e.getText();
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFinishEditing(boolean shouldShowError) {
        up8 validate = validate();
        if (shouldShowError && validate != null && !evu0.J(getCvn())) {
            this.controller.a();
        }
        boolean z = validate == null;
        if (this.readyToProvide != z) {
            this.readyToProvide = z;
            if (z) {
                qv90.a.getClass();
                sv90.H(null).c();
            }
            tls tlsVar = this.onReadyListener;
            if (tlsVar != null) {
                tlsVar.invoke(Boolean.valueOf(z));
            }
        }
    }

    public static /* synthetic */ void onFinishEditing$default(DkCvvInputView dkCvvInputView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        dkCvvInputView.onFinishEditing(z);
    }

    private final void updateLengthFilter() {
        this.binding.e.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.cardType.d)});
    }

    private final up8 validate() {
        kc8 kc8Var = new kc8(getCvn());
        qjd a = this.validator.a();
        CardPaymentSystem cardPaymentSystem = this.cardType.a;
        ArrayList arrayList = rp8.f;
        a.c(new jby(q501.r(cardPaymentSystem, false).d));
        return a.b(kc8Var);
    }

    @Override // defpackage.qwl
    public void focusInput() {
        wj91.c(this.binding.e);
    }

    @Override // defpackage.qwl
    public void provideCvn() {
        asw aswVar = this.paymentApi;
        if (aswVar != null) {
            ((yv90) aswVar).h(getCvn());
        }
    }

    @Override // defpackage.qwl
    public void provideCvnForChallenge() {
        wga0 h;
        asw aswVar = this.paymentApi;
        if (aswVar != null) {
            String cvn = getCvn();
            boj0 boj0Var = ((yv90) aswVar).i;
            if (boj0Var == null || (h = boj0Var.h()) == null) {
                return;
            }
            aia0 aia0Var = h.b;
            PaymentMethod paymentMethod = h.m;
            int i = 19;
            if (paymentMethod instanceof PaymentMethod.Card) {
                String c = a8a0.c(paymentMethod);
                String b = h.b();
                bt5 bt5Var = aia0Var.a;
                md51 a = bt5Var.a(b);
                q qVar = new q(i, bt5Var, cvn, c);
                ymx ymxVar = (ymx) a;
                ymxVar.getClass();
                ymx.j(ymxVar, qVar, null, 5).c(new sga0(h, 1));
                return;
            }
            if (paymentMethod instanceof PaymentMethod.YBMethod) {
                String c2 = a8a0.c(paymentMethod);
                String b2 = h.b();
                bt5 bt5Var2 = aia0Var.a;
                md51 a2 = bt5Var2.a(b2);
                q qVar2 = new q(i, bt5Var2, cvn, c2);
                ymx ymxVar2 = (ymx) a2;
                ymxVar2.getClass();
                ymx.j(ymxVar2, qVar2, null, 5).c(new sga0(h, 2));
            }
        }
    }

    @Override // defpackage.qwl
    public void setCardPaymentSystem(com.yandex.payment.sdk.core.data.CardPaymentSystem system) {
        ArrayList arrayList = rp8.f;
        this.cardType = q501.r(znb1.j(system), false);
        ArrayList arrayList2 = new ArrayList();
        int i = this.cardType.d + 1;
        for (int i2 = 0; i2 < i; i2++) {
            LinearLayout linearLayout = this.binding.b;
            DivCvvNumber divCvvNumber = new DivCvvNumber(linearLayout.getContext(), null, 0, 6, null);
            arrayList2.add(divCvvNumber);
            linearLayout.addView(divCvvNumber);
        }
        qof qofVar = this.controller;
        qofVar.a = arrayList2;
        qofVar.b = 0;
        Iterator it = arrayList2.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                scc.m();
                throw null;
            }
            ((DivCvvNumber) next).setState(i3 == qofVar.b ? hmk.a : i3 == qofVar.a.size() + (-1) ? new imk(false) : hmk.d);
            i3 = i4;
        }
        Editable text = this.binding.e.getText();
        if (text != null) {
            text.toString();
        }
        updateLengthFilter();
    }

    @Override // defpackage.qwl
    public void setCvnProvider(pwl provider) {
        String cvn = getCvn();
        tls tlsVar = ((com.yandex.payment.divkit.cvv_confirm.b) provider).H;
        if (tlsVar != null) {
            tlsVar.invoke(cvn);
        }
    }

    public final void setEventReporter(rwo eventReporter) {
        this.eventReporter = eventReporter;
    }

    @Override // defpackage.qwl
    public void setOnReadyListener(tls listener) {
        this.onReadyListener = listener;
    }

    @Override // defpackage.qwl
    public void setPaymentApi(vv90 api) {
        this.paymentApi = api != null ? wj91.a(api) : null;
    }

    @Override // defpackage.qwl
    public void showError() {
        this.controller.a();
    }

    @Override // defpackage.qwl
    public void showLoading(boolean isLoading) {
        this.binding.c.getLayoutParams().width = this.binding.b.getMeasuredWidth() * 2;
        DivCvvNumber divCvvNumber = (DivCvvNumber) kotlin.collections.a.b0(this.controller.a);
        if (divCvvNumber != null) {
            divCvvNumber.setState(new imk(false));
        }
        bpa0 bpa0Var = this.binding;
        if (isLoading) {
            bpa0Var.d.setVisibility(0);
            this.binding.c.startAnimation(this.anim);
            return;
        }
        bpa0Var.c.animate().setDuration(200L).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.yandex.payment.divkit.select.DkCvvInputView$showLoading$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                bpa0 bpa0Var2;
                bpa0 bpa0Var3;
                bpa0Var2 = DkCvvInputView.this.binding;
                bpa0Var2.d.setVisibility(8);
                bpa0Var3 = DkCvvInputView.this.binding;
                bpa0Var3.c.setAlpha(1.0f);
            }
        }).start();
        Animation animation = this.binding.c.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
    }

    @Override // defpackage.qwl
    public void showSuccess() {
        showLoading(false);
        Iterator it = kotlin.collections.a.v0(new d6w(0, r4.a.size() - 2, 1), this.controller.a).iterator();
        while (it.hasNext()) {
            ((DivCvvNumber) it.next()).setState(hmk.e);
        }
    }

    public DkCvvInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DkCvvInputView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DkCvvInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
