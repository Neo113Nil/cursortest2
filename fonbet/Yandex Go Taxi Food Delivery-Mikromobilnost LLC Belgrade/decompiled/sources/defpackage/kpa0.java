package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.yandex.payment.divkit.bind.view.DKExpirationDateInput;

/* loaded from: classes2.dex */
public final class kpa0 implements zo31 {
    public final DKExpirationDateInput a;
    public final TextView b;
    public final EditText c;

    public kpa0(DKExpirationDateInput dKExpirationDateInput, TextView textView, EditText editText) {
        this.a = dKExpirationDateInput;
        this.b = textView;
        this.c = editText;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
