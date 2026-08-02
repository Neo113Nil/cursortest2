package defpackage;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.payment.sdk.ui.view.CardNumberView;

/* loaded from: classes2.dex */
public final class bqa0 implements zo31 {
    public final CardNumberView a;
    public final TextInputLayout b;

    public bqa0(CardNumberView cardNumberView, TextInputLayout textInputLayout) {
        this.a = cardNumberView;
        this.b = textInputLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
