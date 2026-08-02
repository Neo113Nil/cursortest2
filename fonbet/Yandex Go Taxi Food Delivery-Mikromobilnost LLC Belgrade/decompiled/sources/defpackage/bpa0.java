package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.yandex.payment.divkit.select.DkCvvInputView;

/* loaded from: classes2.dex */
public final class bpa0 implements zo31 {
    public final DkCvvInputView a;
    public final LinearLayout b;
    public final View c;
    public final CardView d;
    public final EditText e;

    public bpa0(DkCvvInputView dkCvvInputView, LinearLayout linearLayout, View view, CardView cardView, EditText editText) {
        this.a = dkCvvInputView;
        this.b = linearLayout;
        this.c = view;
        this.d = cardView;
        this.e = editText;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
