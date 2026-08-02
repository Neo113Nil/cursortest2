package defpackage;

import android.app.Activity;
import android.text.method.DigitsKeyListener;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import com.yandex.go.payments.cards.pci_dss.ui.c;
import com.yandex.go.payments.cards.ui.CardNumberPadView;
import com.yandex.go.payments.cards.ui.ConfirmationType;
import com.yandex.go.payments.cards.ui.HideKeyboardActionModeCallback;
import com.yandex.go.payments.cards.ui.d;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class n3e extends a350 {
    public final s3e d;
    public final bia0 e;
    public final se8 f;
    public final CardNumberPadView g;
    public final TextView h;
    public final ListItemComponent i;
    public final ViewStub j;
    public final c k;
    public View l;
    public final ConfirmationType m;

    public n3e(View view, s3e s3eVar, d dVar, bia0 bia0Var, se8 se8Var) {
        super(view);
        this.d = s3eVar;
        this.e = bia0Var;
        this.f = se8Var;
        CardNumberPadView cardNumberPadView = (CardNumberPadView) e(e6h0.number_pad);
        this.g = cardNumberPadView;
        this.h = (TextView) e(e6h0.confirm_card_cvn_explanation);
        this.i = (ListItemComponent) e(e6h0.confirm_card_info);
        this.j = (ViewStub) e(e6h0.confirm_card_toolbar_stub);
        cardNumberPadView.setConfirmButtonText(kyh0.common_done);
        cardNumberPadView.setConfirmButtonEnabled(false);
        this.k = new c((EditText) e(e6h0.cvn), new gyc(cardNumberPadView), dVar);
        this.m = ConfirmationType.CVN;
    }

    @Override // defpackage.r3e
    public final void a(String str) {
        if (this.l == null) {
            this.l = this.j.inflate();
        }
        View view = this.l;
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
        int i = kyh0.common_done;
        CardNumberPadView cardNumberPadView = this.g;
        cardNumberPadView.setConfirmButtonText(i);
        cardNumberPadView.showDecimalSeparator(true);
        cardNumberPadView.setFocusedViewSupplier(this.d);
        c cVar = this.k;
        gyc gycVar = cVar.b;
        ((CardNumberPadView) gycVar.a).setOnConfirmClickedListener(new ci8(19, cVar));
        EditText editText = cVar.a;
        editText.setTransformationMethod(new PasswordTransformationMethod());
        editText.setCustomSelectionActionModeCallback(new HideKeyboardActionModeCallback(editText));
        editText.setShowSoftInputOnFocus(false);
        editText.setOnTouchListener(new cz2(3));
        editText.addTextChangedListener(cVar.d);
        editText.setFilters(new DigitsKeyListener[]{new DigitsKeyListener()});
        editText.requestFocus();
    }

    @Override // defpackage.a350
    public final void c() {
        this.c = false;
        q5t0 q5t0Var = this.b;
        if (q5t0Var != null && q5t0Var.b != -1) {
            q5t0Var.a.getWindow().setSoftInputMode(q5t0Var.b);
        }
        CardNumberPadView cardNumberPadView = this.g;
        cardNumberPadView.setOnConfirmClickedListener(null);
        cardNumberPadView.setFocusedViewSupplier(null);
        c cVar = this.k;
        EditText editText = cVar.a;
        editText.removeTextChangedListener(cVar.d);
        editText.setCustomSelectionActionModeCallback(null);
        editText.setOnTouchListener(null);
    }

    @Override // defpackage.a350
    public final ConfirmationType d() {
        return this.m;
    }

    @Override // defpackage.a350
    public final void f() {
        View view = this.l;
        if (view == null) {
            view = this.h;
        }
        xw31.w(view);
    }

    @Override // defpackage.a350
    public final void g() {
    }
}
