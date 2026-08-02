package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.views.SecretCodeInputView;

/* loaded from: classes12.dex */
public final class ebr implements zo31 {
    public final SecretCodeInputView a;
    public final TextView b;
    public final EditText c;
    public final TextView d;

    public ebr(SecretCodeInputView secretCodeInputView, TextView textView, EditText editText, TextView textView2) {
        this.a = secretCodeInputView;
        this.b = textView;
        this.c = editText;
        this.d = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
