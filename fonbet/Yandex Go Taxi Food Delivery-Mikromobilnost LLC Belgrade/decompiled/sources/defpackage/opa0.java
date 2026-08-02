package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.yandex.payment.sdk.ui.view.card.ExpirationDateInput;

/* loaded from: classes2.dex */
public final class opa0 implements zo31 {
    public final ExpirationDateInput a;
    public final TextView b;
    public final EditText c;

    public opa0(ExpirationDateInput expirationDateInput, TextView textView, EditText editText) {
        this.a = expirationDateInput;
        this.b = textView;
        this.c = editText;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
