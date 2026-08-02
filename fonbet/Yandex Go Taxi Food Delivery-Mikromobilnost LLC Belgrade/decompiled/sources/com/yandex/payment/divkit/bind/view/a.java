package com.yandex.payment.divkit.bind.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.yandex.payment.divkit.bind.view.DKCardInputViewImpl;
import com.yandex.payment.divkit.bind.view.DKCardNumberInput;
import com.yandex.payment.divkit.bind.view.a;
import com.yandex.payment.sdk.ui.CardInput$State;
import com.yandex.xplat.payment.sdk.BankName;
import com.yandex.xplat.payment.sdk.ButtonNameForAnalytics;
import com.yandex.xplat.payment.sdk.NewCard;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import defpackage.cp7;
import defpackage.epa0;
import defpackage.jhd;
import defpackage.kjh0;
import defpackage.kvg0;
import defpackage.lg;
import defpackage.mjf;
import defpackage.ny61;
import defpackage.q501;
import defpackage.qh8;
import defpackage.rp8;
import defpackage.sae;
import defpackage.sls;
import defpackage.tls;
import defpackage.tyv;
import defpackage.vp8;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a {
    public final epa0 a;
    public final cp7 b;
    public final boolean c;
    public CardInput$State d = CardInput$State.CARD_NUMBER;
    public final DKCardNumberInput e;
    public final DKExpirationDateInput f;
    public final DKCvnInput g;
    public final ImageView h;
    public final ImageView i;
    public final boolean j;
    public final sae k;
    public final long l;
    public mjf m;
    public tls n;
    public tls o;
    public tls p;
    public qh8 q;
    public boolean r;

    public a(epa0 epa0Var, vp8 vp8Var, cp7 cp7Var, boolean z, boolean z2, boolean z3) {
        this.a = epa0Var;
        this.b = cp7Var;
        this.c = z2;
        DKCardNumberInput dKCardNumberInput = epa0Var.b;
        this.e = dKCardNumberInput;
        DKExpirationDateInput dKExpirationDateInput = epa0Var.e;
        this.f = dKExpirationDateInput;
        DKCvnInput dKCvnInput = epa0Var.d;
        this.g = dKCvnInput;
        ImageView scannerImageView = dKCardNumberInput.getScannerImageView();
        this.h = scannerImageView;
        ImageView clearInputView = dKCardNumberInput.getClearInputView();
        this.i = clearInputView;
        this.k = new sae(14, this);
        this.l = epa0Var.a.getResources().getInteger(kjh0.paymentsdk_prebuilt_card_number_animation_duration);
        dKCardNumberInput.setEnableDebranding(z);
        dKCardNumberInput.setValidator(vp8Var.a);
        dKCardNumberInput.setOnFinish(new tls(this) { // from class: qrf
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                qh8 qh8Var;
                int i = r2;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                switch (i) {
                    case 0:
                        if (!((Boolean) obj).booleanValue()) {
                            aVar.e(CardInput$State.CARD_NUMBER);
                            tls tlsVar = aVar.o;
                            if (tlsVar != null) {
                                tlsVar.invoke(null);
                                break;
                            }
                        } else {
                            qh8 qh8Var2 = aVar.q;
                            if (qh8Var2 != null) {
                                qh8Var2.invoke(new yyv(TextFieldNameForAnalytics.CARD_NUMBER));
                            }
                            aVar.e(CardInput$State.CARD_NUMBER_VALID);
                            tls tlsVar2 = aVar.o;
                            if (tlsVar2 != null) {
                                tlsVar2.invoke(sfb1.d(aVar.e.getCardNumber()));
                                break;
                            }
                        }
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i2 = 8;
                        aVar.i.setVisibility(!booleanValue ? 0 : 8);
                        ImageView imageView = aVar.h;
                        if (booleanValue && aVar.j) {
                            i2 = 0;
                        }
                        imageView.setVisibility(i2);
                        break;
                    case 2:
                        rp8 rp8Var = (rp8) obj;
                        aVar.g.setCardType(rp8Var);
                        tls tlsVar3 = aVar.p;
                        if (tlsVar3 != null) {
                            tlsVar3.invoke(wme.d(rp8Var.a));
                            break;
                        }
                        break;
                    default:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        boolean isValid = aVar.f.isValid();
                        if (isValid && booleanValue2) {
                            aVar.g.gainFocus();
                        }
                        if (isValid && (qh8Var = aVar.q) != null) {
                            qh8Var.invoke(new yyv(TextFieldNameForAnalytics.EXPIRATION_DATE));
                        }
                        aVar.f();
                        break;
                }
                return zy11Var;
            }
        });
        final int i = 1;
        dKCardNumberInput.setOnEmpty(new tls(this) { // from class: qrf
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                qh8 qh8Var;
                int i2 = i;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                switch (i2) {
                    case 0:
                        if (!((Boolean) obj).booleanValue()) {
                            aVar.e(CardInput$State.CARD_NUMBER);
                            tls tlsVar = aVar.o;
                            if (tlsVar != null) {
                                tlsVar.invoke(null);
                                break;
                            }
                        } else {
                            qh8 qh8Var2 = aVar.q;
                            if (qh8Var2 != null) {
                                qh8Var2.invoke(new yyv(TextFieldNameForAnalytics.CARD_NUMBER));
                            }
                            aVar.e(CardInput$State.CARD_NUMBER_VALID);
                            tls tlsVar2 = aVar.o;
                            if (tlsVar2 != null) {
                                tlsVar2.invoke(sfb1.d(aVar.e.getCardNumber()));
                                break;
                            }
                        }
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i22 = 8;
                        aVar.i.setVisibility(!booleanValue ? 0 : 8);
                        ImageView imageView = aVar.h;
                        if (booleanValue && aVar.j) {
                            i22 = 0;
                        }
                        imageView.setVisibility(i22);
                        break;
                    case 2:
                        rp8 rp8Var = (rp8) obj;
                        aVar.g.setCardType(rp8Var);
                        tls tlsVar3 = aVar.p;
                        if (tlsVar3 != null) {
                            tlsVar3.invoke(wme.d(rp8Var.a));
                            break;
                        }
                        break;
                    default:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        boolean isValid = aVar.f.isValid();
                        if (isValid && booleanValue2) {
                            aVar.g.gainFocus();
                        }
                        if (isValid && (qh8Var = aVar.q) != null) {
                            qh8Var.invoke(new yyv(TextFieldNameForAnalytics.EXPIRATION_DATE));
                        }
                        aVar.f();
                        break;
                }
                return zy11Var;
            }
        });
        final int i2 = 2;
        dKCardNumberInput.setOnCardTypeChangedListener(new tls(this) { // from class: qrf
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                qh8 qh8Var;
                int i22 = i2;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        if (!((Boolean) obj).booleanValue()) {
                            aVar.e(CardInput$State.CARD_NUMBER);
                            tls tlsVar = aVar.o;
                            if (tlsVar != null) {
                                tlsVar.invoke(null);
                                break;
                            }
                        } else {
                            qh8 qh8Var2 = aVar.q;
                            if (qh8Var2 != null) {
                                qh8Var2.invoke(new yyv(TextFieldNameForAnalytics.CARD_NUMBER));
                            }
                            aVar.e(CardInput$State.CARD_NUMBER_VALID);
                            tls tlsVar2 = aVar.o;
                            if (tlsVar2 != null) {
                                tlsVar2.invoke(sfb1.d(aVar.e.getCardNumber()));
                                break;
                            }
                        }
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i222 = 8;
                        aVar.i.setVisibility(!booleanValue ? 0 : 8);
                        ImageView imageView = aVar.h;
                        if (booleanValue && aVar.j) {
                            i222 = 0;
                        }
                        imageView.setVisibility(i222);
                        break;
                    case 2:
                        rp8 rp8Var = (rp8) obj;
                        aVar.g.setCardType(rp8Var);
                        tls tlsVar3 = aVar.p;
                        if (tlsVar3 != null) {
                            tlsVar3.invoke(wme.d(rp8Var.a));
                            break;
                        }
                        break;
                    default:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        boolean isValid = aVar.f.isValid();
                        if (isValid && booleanValue2) {
                            aVar.g.gainFocus();
                        }
                        if (isValid && (qh8Var = aVar.q) != null) {
                            qh8Var.invoke(new yyv(TextFieldNameForAnalytics.EXPIRATION_DATE));
                        }
                        aVar.f();
                        break;
                }
                return zy11Var;
            }
        });
        dKCardNumberInput.setOnFocus(new jhd(21, dKCardNumberInput, this));
        dKCardNumberInput.setCallback(new sls(this) { // from class: rrf
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                qh8 qh8Var;
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                switch (i3) {
                    case 0:
                        if (aVar.g.isValid() && (qh8Var = aVar.q) != null) {
                            qh8Var.invoke(new yyv(TextFieldNameForAnalytics.CVN));
                        }
                        aVar.f();
                        break;
                    case 1:
                        DKCardInputViewImpl dKCardInputViewImpl = aVar.a.a;
                        Object systemService = dKCardInputViewImpl.getContext().getSystemService("input_method");
                        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                        if (inputMethodManager != null) {
                            inputMethodManager.hideSoftInputFromWindow(dKCardInputViewImpl.getWindowToken(), 0);
                            break;
                        }
                        break;
                    case 2:
                        aVar.b();
                        break;
                    case 3:
                        aVar.c();
                        break;
                    default:
                        aVar.g.gainFocus();
                        break;
                }
                return zy11Var;
            }
        });
        final int i3 = 3;
        dKCardNumberInput.setOnKeyboardAction(new sls(this) { // from class: rrf
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                qh8 qh8Var;
                int i32 = i3;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                switch (i32) {
                    case 0:
                        if (aVar.g.isValid() && (qh8Var = aVar.q) != null) {
                            qh8Var.invoke(new yyv(TextFieldNameForAnalytics.CVN));
                        }
                        aVar.f();
                        break;
                    case 1:
                        DKCardInputViewImpl dKCardInputViewImpl = aVar.a.a;
                        Object systemService = dKCardInputViewImpl.getContext().getSystemService("input_method");
                        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                        if (inputMethodManager != null) {
                            inputMethodManager.hideSoftInputFromWindow(dKCardInputViewImpl.getWindowToken(), 0);
                            break;
                        }
                        break;
                    case 2:
                        aVar.b();
                        break;
                    case 3:
                        aVar.c();
                        break;
                    default:
                        aVar.g.gainFocus();
                        break;
                }
                return zy11Var;
            }
        });
        dKExpirationDateInput.setValidator(vp8Var.b);
        dKExpirationDateInput.setCallback(new tls(this) { // from class: qrf
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                qh8 qh8Var;
                int i22 = i3;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        if (!((Boolean) obj).booleanValue()) {
                            aVar.e(CardInput$State.CARD_NUMBER);
                            tls tlsVar = aVar.o;
                            if (tlsVar != null) {
                                tlsVar.invoke(null);
                                break;
                            }
                        } else {
                            qh8 qh8Var2 = aVar.q;
                            if (qh8Var2 != null) {
                                qh8Var2.invoke(new yyv(TextFieldNameForAnalytics.CARD_NUMBER));
                            }
                            aVar.e(CardInput$State.CARD_NUMBER_VALID);
                            tls tlsVar2 = aVar.o;
                            if (tlsVar2 != null) {
                                tlsVar2.invoke(sfb1.d(aVar.e.getCardNumber()));
                                break;
                            }
                        }
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i222 = 8;
                        aVar.i.setVisibility(!booleanValue ? 0 : 8);
                        ImageView imageView = aVar.h;
                        if (booleanValue && aVar.j) {
                            i222 = 0;
                        }
                        imageView.setVisibility(i222);
                        break;
                    case 2:
                        rp8 rp8Var = (rp8) obj;
                        aVar.g.setCardType(rp8Var);
                        tls tlsVar3 = aVar.p;
                        if (tlsVar3 != null) {
                            tlsVar3.invoke(wme.d(rp8Var.a));
                            break;
                        }
                        break;
                    default:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        boolean isValid = aVar.f.isValid();
                        if (isValid && booleanValue2) {
                            aVar.g.gainFocus();
                        }
                        if (isValid && (qh8Var = aVar.q) != null) {
                            qh8Var.invoke(new yyv(TextFieldNameForAnalytics.EXPIRATION_DATE));
                        }
                        aVar.f();
                        break;
                }
                return zy11Var;
            }
        });
        final int i4 = 4;
        dKExpirationDateInput.setOnKeyboardAction(new sls(this) { // from class: rrf
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                qh8 qh8Var;
                int i32 = i4;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                switch (i32) {
                    case 0:
                        if (aVar.g.isValid() && (qh8Var = aVar.q) != null) {
                            qh8Var.invoke(new yyv(TextFieldNameForAnalytics.CVN));
                        }
                        aVar.f();
                        break;
                    case 1:
                        DKCardInputViewImpl dKCardInputViewImpl = aVar.a.a;
                        Object systemService = dKCardInputViewImpl.getContext().getSystemService("input_method");
                        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                        if (inputMethodManager != null) {
                            inputMethodManager.hideSoftInputFromWindow(dKCardInputViewImpl.getWindowToken(), 0);
                            break;
                        }
                        break;
                    case 2:
                        aVar.b();
                        break;
                    case 3:
                        aVar.c();
                        break;
                    default:
                        aVar.g.gainFocus();
                        break;
                }
                return zy11Var;
            }
        });
        dKCvnInput.setValidator(vp8Var.c);
        dKCvnInput.setNoCvvMirEnabled(z2);
        dKCvnInput.setCallback(new sls(this) { // from class: rrf
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                qh8 qh8Var;
                int i32 = r2;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                switch (i32) {
                    case 0:
                        if (aVar.g.isValid() && (qh8Var = aVar.q) != null) {
                            qh8Var.invoke(new yyv(TextFieldNameForAnalytics.CVN));
                        }
                        aVar.f();
                        break;
                    case 1:
                        DKCardInputViewImpl dKCardInputViewImpl = aVar.a.a;
                        Object systemService = dKCardInputViewImpl.getContext().getSystemService("input_method");
                        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                        if (inputMethodManager != null) {
                            inputMethodManager.hideSoftInputFromWindow(dKCardInputViewImpl.getWindowToken(), 0);
                            break;
                        }
                        break;
                    case 2:
                        aVar.b();
                        break;
                    case 3:
                        aVar.c();
                        break;
                    default:
                        aVar.g.gainFocus();
                        break;
                }
                return zy11Var;
            }
        });
        dKCvnInput.setOnKeyboardAction(new sls(this) { // from class: rrf
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                qh8 qh8Var;
                int i32 = i;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                switch (i32) {
                    case 0:
                        if (aVar.g.isValid() && (qh8Var = aVar.q) != null) {
                            qh8Var.invoke(new yyv(TextFieldNameForAnalytics.CVN));
                        }
                        aVar.f();
                        break;
                    case 1:
                        DKCardInputViewImpl dKCardInputViewImpl = aVar.a.a;
                        Object systemService = dKCardInputViewImpl.getContext().getSystemService("input_method");
                        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                        if (inputMethodManager != null) {
                            inputMethodManager.hideSoftInputFromWindow(dKCardInputViewImpl.getWindowToken(), 0);
                            break;
                        }
                        break;
                    case 2:
                        aVar.b();
                        break;
                    case 3:
                        aVar.c();
                        break;
                    default:
                        aVar.g.gainFocus();
                        break;
                }
                return zy11Var;
            }
        });
        clearInputView.setVisibility(dKCardNumberInput.getCardNumber().length() > 0 ? 0 : 8);
        clearInputView.setOnClickListener(new View.OnClickListener(this) { // from class: urf
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = r2;
                a aVar = this.b;
                switch (i5) {
                    case 0:
                        DKCardNumberInput dKCardNumberInput2 = aVar.e;
                        dKCardNumberInput2.reset();
                        dKCardNumberInput2.gainFocus();
                        break;
                    default:
                        qh8 qh8Var = aVar.q;
                        if (qh8Var != null) {
                            qh8Var.invoke(new xyv(ButtonNameForAnalytics.SCANNER_BUTTON));
                        }
                        cp7 cp7Var2 = aVar.b;
                        if (cp7Var2 != null) {
                            ((lg) cp7Var2).g(aVar.k);
                            break;
                        }
                        break;
                }
            }
        });
        boolean z4 = cp7Var != null && com.google.android.gms.common.a.d.d((FragmentActivity) ((lg) cp7Var).b, com.google.android.gms.common.b.a) == 0 && z3;
        this.j = z4;
        scannerImageView.setVisibility(z4 ? 0 : 8);
        scannerImageView.setOnClickListener(new View.OnClickListener(this) { // from class: urf
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i;
                a aVar = this.b;
                switch (i5) {
                    case 0:
                        DKCardNumberInput dKCardNumberInput2 = aVar.e;
                        dKCardNumberInput2.reset();
                        dKCardNumberInput2.gainFocus();
                        break;
                    default:
                        qh8 qh8Var = aVar.q;
                        if (qh8Var != null) {
                            qh8Var.invoke(new xyv(ButtonNameForAnalytics.SCANNER_BUTTON));
                        }
                        cp7 cp7Var2 = aVar.b;
                        if (cp7Var2 != null) {
                            ((lg) cp7Var2).g(aVar.k);
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final NewCard a() {
        DKCardNumberInput dKCardNumberInput = this.e;
        if (!dKCardNumberInput.getReady()) {
            return null;
        }
        DKExpirationDateInput dKExpirationDateInput = this.f;
        if (!dKExpirationDateInput.isValid()) {
            return null;
        }
        DKCvnInput dKCvnInput = this.g;
        if (dKCvnInput.isValid()) {
            return new NewCard(dKCardNumberInput.getCardNumber(), dKExpirationDateInput.getExpirationMonth(), dKExpirationDateInput.getExpirationYear(), dKCvnInput.getCvn(), this.r, BankName.UnknownBank);
        }
        return null;
    }

    public final void b() {
        boolean hasError = this.g.getHasError();
        boolean hasError2 = this.f.getHasError();
        boolean hasError3 = this.e.getHasError();
        CardInput$State cardInput$State = this.d;
        tyv tyvVar = ((cardInput$State == CardInput$State.CARD_NUMBER || cardInput$State == CardInput$State.CARD_NUMBER_VALID) && hasError3) ? tyv.f : (hasError && hasError2) ? tyv.e : hasError ? tyv.c : hasError2 ? tyv.d : tyv.b;
        tls tlsVar = this.n;
        if (tlsVar != null) {
            tlsVar.invoke(tyvVar);
        }
    }

    public final void c() {
        if (this.d != CardInput$State.CARD_NUMBER_VALID) {
            DKCardInputViewImpl dKCardInputViewImpl = this.a.a;
            Object systemService = dKCardInputViewImpl.getContext().getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(dKCardInputViewImpl.getWindowToken(), 0);
                return;
            }
            return;
        }
        if (this.f.isValid()) {
            DKCvnInput dKCvnInput = this.g;
            if (dKCvnInput.isValid()) {
                e(CardInput$State.CARD_DETAILS_VALID);
                dKCvnInput.gainFocus();
                return;
            }
        }
        e(CardInput$State.CARD_DETAILS);
        b();
    }

    public final void d(boolean z) {
        ArrayList arrayList = rp8.f;
        boolean z2 = q501.r(q501.s(this.e.getCardNumber()).a, this.c).d == 0;
        epa0 epa0Var = this.a;
        epa0Var.e.setVisibility(z ? 0 : 8);
        epa0Var.d.setVisibility((!z || z2) ? 8 : 0);
        epa0Var.f.setVisibility(z ? 0 : 8);
        epa0Var.c.setVisibility(z ? 0 : 8);
    }

    public final void e(CardInput$State cardInput$State) {
        CardInput$State cardInput$State2 = this.d;
        if (cardInput$State == cardInput$State2) {
            return;
        }
        final int i = 1;
        final int i2 = 0;
        boolean z = cardInput$State == CardInput$State.CARD_DETAILS || cardInput$State == CardInput$State.CARD_DETAILS_VALID;
        boolean z2 = cardInput$State2 == CardInput$State.CARD_NUMBER || cardInput$State2 == CardInput$State.CARD_NUMBER_VALID;
        long j = this.l;
        epa0 epa0Var = this.a;
        if (z && z2) {
            d(true);
            if (this.j) {
                this.h.setVisibility(8);
            }
            this.i.setVisibility(8);
            ValueAnimator ofInt = ValueAnimator.ofInt(epa0Var.b.getWidth(), epa0Var.a.getResources().getDimensionPixelSize(kvg0.paymentsdk_prebuilt_dk_card_number_input_collapsed_width));
            ofInt.setDuration(j);
            ofInt.setInterpolator(new DecelerateInterpolator());
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: srf
                public final /* synthetic */ a b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = i2;
                    a aVar = this.b;
                    switch (i3) {
                        case 0:
                            DKCardNumberInput dKCardNumberInput = aVar.a.b;
                            ViewGroup.LayoutParams layoutParams = dKCardNumberInput.getLayoutParams();
                            if (layoutParams == null) {
                                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                break;
                            } else {
                                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                dKCardNumberInput.setLayoutParams(layoutParams);
                                break;
                            }
                        default:
                            DKCardNumberInput dKCardNumberInput2 = aVar.a.b;
                            ViewGroup.LayoutParams layoutParams2 = dKCardNumberInput2.getLayoutParams();
                            if (layoutParams2 == null) {
                                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                break;
                            } else {
                                layoutParams2.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                dKCardNumberInput2.setLayoutParams(layoutParams2);
                                break;
                            }
                    }
                }
            });
            ofInt.start();
            ofInt.addListener(new Animator.AnimatorListener() { // from class: com.yandex.payment.divkit.bind.view.DKCardInputViewController$collapseCardNumber$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    DKCardNumberInput dKCardNumberInput = a.this.a.b;
                    ViewGroup.LayoutParams layoutParams = dKCardNumberInput.getLayoutParams();
                    if (layoutParams == null) {
                        ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return;
                    }
                    layoutParams.width = a.this.a.a.getResources().getDimensionPixelSize(kvg0.paymentsdk_prebuilt_dk_card_number_input_collapsed_width);
                    dKCardNumberInput.setLayoutParams(layoutParams);
                    a.this.a.b.setState(DKCardNumberInput.State.MASKED);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
            this.e.dropFocus();
            DKExpirationDateInput dKExpirationDateInput = this.f;
            if (dKExpirationDateInput.isValid()) {
                this.g.gainFocus();
            } else {
                dKExpirationDateInput.gainFocus();
            }
        } else if (!z && !z2) {
            d(false);
            epa0Var.b.setState(DKCardNumberInput.State.FULL);
            ValueAnimator ofInt2 = ValueAnimator.ofInt(epa0Var.b.getWidth(), epa0Var.a.getResources().getDimensionPixelSize(kvg0.paymentsdk_prebuilt_dk_card_number_input_expanded_width));
            ofInt2.setDuration(j);
            ofInt2.setInterpolator(new DecelerateInterpolator());
            ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: srf
                public final /* synthetic */ a b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = i;
                    a aVar = this.b;
                    switch (i3) {
                        case 0:
                            DKCardNumberInput dKCardNumberInput = aVar.a.b;
                            ViewGroup.LayoutParams layoutParams = dKCardNumberInput.getLayoutParams();
                            if (layoutParams == null) {
                                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                break;
                            } else {
                                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                dKCardNumberInput.setLayoutParams(layoutParams);
                                break;
                            }
                        default:
                            DKCardNumberInput dKCardNumberInput2 = aVar.a.b;
                            ViewGroup.LayoutParams layoutParams2 = dKCardNumberInput2.getLayoutParams();
                            if (layoutParams2 == null) {
                                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                break;
                            } else {
                                layoutParams2.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                dKCardNumberInput2.setLayoutParams(layoutParams2);
                                break;
                            }
                    }
                }
            });
            ofInt2.start();
            ofInt2.addListener(new Animator.AnimatorListener() { // from class: com.yandex.payment.divkit.bind.view.DKCardInputViewController$expandCardNumber$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    DKCardNumberInput dKCardNumberInput = a.this.a.b;
                    ViewGroup.LayoutParams layoutParams = dKCardNumberInput.getLayoutParams();
                    if (layoutParams == null) {
                        ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return;
                    }
                    layoutParams.width = -1;
                    dKCardNumberInput.setLayoutParams(layoutParams);
                    a aVar = a.this;
                    aVar.i.setVisibility(aVar.a.b.getCardNumber().length() > 0 ? 0 : 8);
                    a aVar2 = a.this;
                    aVar2.h.setVisibility(aVar2.i.getVisibility() != 0 ? 0 : 8);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
        }
        mjf mjfVar = this.m;
        if (mjfVar != null) {
            mjfVar.invoke(this.d, cardInput$State);
        }
        this.d = cardInput$State;
    }

    public final void f() {
        e((this.e.getReady() && this.f.isValid() && this.g.isValid()) ? CardInput$State.CARD_DETAILS_VALID : CardInput$State.CARD_DETAILS);
        b();
    }
}
