package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.payment.divkit.bind.view.DKCvnInput;

/* loaded from: classes2.dex */
public final class ipa0 implements zo31 {
    public final DKCvnInput a;
    public final TextView b;
    public final EditText c;

    public ipa0(DKCvnInput dKCvnInput, AppCompatImageView appCompatImageView, TextView textView, EditText editText) {
        this.a = dKCvnInput;
        this.b = textView;
        this.c = editText;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
