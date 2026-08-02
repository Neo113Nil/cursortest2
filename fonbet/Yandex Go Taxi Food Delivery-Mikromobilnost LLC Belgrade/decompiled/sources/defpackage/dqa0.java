package defpackage;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.payment.sdk.ui.view.EmailView;

/* loaded from: classes2.dex */
public final class dqa0 implements zo31 {
    public final EmailView a;
    public final TextInputLayout b;

    public dqa0(EmailView emailView, TextInputLayout textInputLayout) {
        this.a = emailView;
        this.b = textInputLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
