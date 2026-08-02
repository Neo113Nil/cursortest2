package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.views.ExpirationDateInputView;

/* loaded from: classes2.dex */
public final class dbr implements zo31 {
    public final ExpirationDateInputView a;
    public final TextView b;
    public final EditText c;
    public final TextView d;

    public dbr(ExpirationDateInputView expirationDateInputView, TextView textView, EditText editText, TextView textView2) {
        this.a = expirationDateInputView;
        this.b = textView;
        this.c = editText;
        this.d = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
