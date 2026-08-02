package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.views.CvvInputView;

/* loaded from: classes2.dex */
public final class bbr implements zo31 {
    public final CvvInputView a;
    public final TextView b;
    public final EditText c;
    public final TextView d;

    public bbr(CvvInputView cvvInputView, TextView textView, EditText editText, TextView textView2) {
        this.a = cvvInputView;
        this.b = textView;
        this.c = editText;
        this.d = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
