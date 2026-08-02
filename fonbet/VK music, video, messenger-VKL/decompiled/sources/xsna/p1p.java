package xsna;

import android.widget.EditText;

/* compiled from: EditTextExt.kt */
/* loaded from: classes7.dex */
public final class p1p {
    public static final void a(EditText editText, int i) {
        if (epx.f(editText.getText().toString(), String.valueOf(i))) {
            return;
        }
        editText.setText(i == 0 ? "" : String.valueOf(i));
        editText.setSelection(editText.getText().length());
    }
}
