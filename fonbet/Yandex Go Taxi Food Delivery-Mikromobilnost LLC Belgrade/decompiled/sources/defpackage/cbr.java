package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.views.DateExpiredInputView;

/* loaded from: classes12.dex */
public final class cbr implements zo31 {
    public final DateExpiredInputView a;
    public final TextView b;
    public final EditText c;
    public final TextView d;

    public cbr(DateExpiredInputView dateExpiredInputView, TextView textView, EditText editText, TextView textView2) {
        this.a = dateExpiredInputView;
        this.b = textView;
        this.c = editText;
        this.d = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
