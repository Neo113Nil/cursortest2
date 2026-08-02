package xsna;

import android.content.Context;
import android.text.Editable;

/* compiled from: PlusPhoneNumberFormattingTextWatcher.kt */
/* loaded from: classes2.dex */
public final class yfb0 extends pcv0 {
    public yfb0(Context context) {
        super(new io.michaelrocks.libphonenumber.android.a(f3a0.a.a(context), f3a0.c), true, false);
    }

    @Override // xsna.pcv0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Character y0;
        super.afterTextChanged(editable);
        if (this.e || editable == null || (y0 = erm0.y0(editable)) == null) {
            return;
        }
        char charValue = y0.charValue();
        int i = this.f;
        if (!Character.isDigit(charValue) || charValue == '8' || i <= 3) {
            return;
        }
        editable.insert(0, "+");
    }
}
