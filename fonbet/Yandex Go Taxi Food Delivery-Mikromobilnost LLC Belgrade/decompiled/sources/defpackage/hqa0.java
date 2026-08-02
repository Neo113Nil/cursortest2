package defpackage;

import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.payment.sdk.ui.view.EmailView;
import com.yandex.payment.sdk.ui.view.PersonalInfoView;

/* loaded from: classes2.dex */
public final class hqa0 implements zo31 {
    public final PersonalInfoView a;
    public final EmailView b;
    public final TextInputEditText c;
    public final TextInputLayout d;
    public final TextInputEditText e;
    public final TextInputLayout f;
    public final TextInputEditText g;
    public final TextInputLayout h;

    public hqa0(PersonalInfoView personalInfoView, EmailView emailView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, TextInputEditText textInputEditText3, TextInputLayout textInputLayout3) {
        this.a = personalInfoView;
        this.b = emailView;
        this.c = textInputEditText;
        this.d = textInputLayout;
        this.e = textInputEditText2;
        this.f = textInputLayout2;
        this.g = textInputEditText3;
        this.h = textInputLayout3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
