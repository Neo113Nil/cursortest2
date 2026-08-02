package xsna;

import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: UiExtensions.kt */
/* loaded from: classes7.dex */
public final class dzp0 {
    public static final void a(EditText editText, String str, TextWatcher textWatcher) {
        editText.removeTextChangedListener(textWatcher);
        if (!epx.f(editText.getText().toString(), str)) {
            editText.setText(str);
        }
        editText.addTextChangedListener(textWatcher);
    }
}
