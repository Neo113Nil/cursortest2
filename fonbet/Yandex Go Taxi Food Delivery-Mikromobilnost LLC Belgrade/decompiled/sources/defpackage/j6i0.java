package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import com.yandex.go.payments.cards.data.model.GuessAmount;
import com.yandex.go.payments.cards.ui.CardNumberPadView;
import com.yandex.go.payments.cards.ui.ConfirmationType;
import com.yandex.go.payments.cards.ui.GuessAmountTextWatcher;
import com.yandex.go.payments.cards.ui.HideKeyboardActionModeCallback;
import defpackage.f3e;
import defpackage.j6i0;
import defpackage.jst;
import defpackage.tje;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class j6i0 extends a350 {
    public final s3e d;
    public final io9 e;
    public final CardNumberPadView f;
    public final EditText g;
    public final RobotoTextView h;
    public final ViewStub i;
    public final GuessAmountTextWatcher j;
    public View k;
    public GuessAmount l;
    public final ConfirmationType m;

    public j6i0(View view, s3e s3eVar, io9 io9Var) {
        super(view);
        this.d = s3eVar;
        this.e = io9Var;
        this.f = (CardNumberPadView) e(e6h0.number_pad);
        this.g = (EditText) e(e6h0.random_amount);
        this.h = (RobotoTextView) e(e6h0.explanation);
        this.i = (ViewStub) e(e6h0.confirm_card_toolbar_stub);
        this.j = new GuessAmountTextWatcher();
        this.m = ConfirmationType.RANDOM_AMOUNT;
    }

    @Override // defpackage.r3e
    public final void a(String str) {
        if (this.k == null) {
            this.k = this.i.inflate();
        }
        View view = this.k;
        view.setVisibility(0);
        ((RobotoTextView) view.findViewById(e6h0.confirm_card_toolbar_title)).setText(str);
    }

    @Override // defpackage.a350
    public final void b() {
        q5t0 q5t0Var = this.b;
        if (q5t0Var != null) {
            Activity activity = q5t0Var.a;
            q5t0Var.b = activity.getWindow().getAttributes().softInputMode;
            activity.getWindow().setSoftInputMode(2);
        }
        this.c = true;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.yandex.go.payments.cards.ui.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c cVar;
                j6i0 j6i0Var = j6i0.this;
                GuessAmount guessAmount = j6i0Var.l;
                if (guessAmount == null) {
                    jst.e.w(new IllegalStateException("Confirm should not be available without valid guess amount"));
                    return;
                }
                cVar = ((ConfirmPaymentMethodViewImpl) j6i0Var.e.a).presenter;
                ((f3e) cVar.Dg()).rf(true);
                tje.N(cVar.Kg(), null, null, new ConfirmCardPresenter$guessAmount$1(cVar, guessAmount, null), 3);
                j6i0Var.g.setText("");
            }
        };
        CardNumberPadView cardNumberPadView = this.f;
        cardNumberPadView.setOnConfirmClickedListener(onClickListener);
        cardNumberPadView.setConfirmButtonText(kyh0.verify_payment_random_amt_confirm);
        cardNumberPadView.setConfirmButtonEnabled(false);
        cardNumberPadView.showDecimalSeparator(true);
        cardNumberPadView.setFocusedViewSupplier(this.d);
        EditText editText = this.g;
        editText.setCustomSelectionActionModeCallback(new HideKeyboardActionModeCallback(editText));
        editText.setOnTouchListener(new cz2(9));
        editText.setHint(c.H(this.a, kyh0.add_credit_card_random_amt_hint, Arrays.copyOf(new Object[]{Character.valueOf(DecimalFormatSymbols.getInstance().getDecimalSeparator())}, 1)));
        GuessAmountTextWatcher guessAmountTextWatcher = this.j;
        editText.addTextChangedListener(guessAmountTextWatcher);
        guessAmountTextWatcher.setListener(new sue0(12, this));
    }

    @Override // defpackage.a350
    public final void c() {
        this.c = false;
        q5t0 q5t0Var = this.b;
        if (q5t0Var != null && q5t0Var.b != -1) {
            q5t0Var.a.getWindow().setSoftInputMode(q5t0Var.b);
        }
        CardNumberPadView cardNumberPadView = this.f;
        cardNumberPadView.setOnConfirmClickedListener(null);
        cardNumberPadView.setFocusedViewSupplier(null);
        EditText editText = this.g;
        GuessAmountTextWatcher guessAmountTextWatcher = this.j;
        editText.removeTextChangedListener(guessAmountTextWatcher);
        editText.setCustomSelectionActionModeCallback(null);
        editText.setOnTouchListener(null);
        guessAmountTextWatcher.setListener(null);
    }

    @Override // defpackage.a350
    public final ConfirmationType d() {
        return this.m;
    }

    @Override // defpackage.a350
    public final void f() {
        View view;
        View view2 = this.k;
        if (view2 != null) {
            if (view2 == null) {
                this.k = this.i.inflate();
            }
            view = this.k.findViewById(ndh0.back);
        } else {
            view = this.h;
        }
        xw31.w(view);
    }

    @Override // defpackage.a350
    public final void g() {
        this.g.requestFocus();
    }
}
