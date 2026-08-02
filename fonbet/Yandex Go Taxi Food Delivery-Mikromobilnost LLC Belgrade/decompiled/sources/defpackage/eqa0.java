package defpackage;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.payment.sdk.ui.view.ExpirationDateView;

/* loaded from: classes2.dex */
public final class eqa0 implements zo31 {
    public final ExpirationDateView a;
    public final TextInputLayout b;

    public eqa0(ExpirationDateView expirationDateView, TextInputLayout textInputLayout) {
        this.a = expirationDateView;
        this.b = textInputLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
