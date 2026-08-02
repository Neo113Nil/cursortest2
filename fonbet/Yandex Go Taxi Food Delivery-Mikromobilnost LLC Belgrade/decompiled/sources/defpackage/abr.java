package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.views.CardPanInputView;

/* loaded from: classes12.dex */
public final class abr implements zo31 {
    public final CardPanInputView a;
    public final ImageView b;
    public final TextView c;
    public final EditText d;
    public final TextView e;
    public final EditText f;

    public abr(CardPanInputView cardPanInputView, ImageView imageView, TextView textView, EditText editText, TextView textView2, EditText editText2) {
        this.a = cardPanInputView;
        this.b = imageView;
        this.c = textView;
        this.d = editText;
        this.e = textView2;
        this.f = editText2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
