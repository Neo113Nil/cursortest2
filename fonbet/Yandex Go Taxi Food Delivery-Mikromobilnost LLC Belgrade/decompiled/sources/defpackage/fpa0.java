package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.payment.divkit.bind.view.DKCardNumberInput;

/* loaded from: classes2.dex */
public final class fpa0 implements zo31 {
    public final DKCardNumberInput a;
    public final ImageView b;
    public final TextView c;
    public final AppCompatImageView d;
    public final AppCompatImageView e;
    public final TextView f;
    public final EditText g;

    public fpa0(DKCardNumberInput dKCardNumberInput, ImageView imageView, TextView textView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TextView textView2, EditText editText) {
        this.a = dKCardNumberInput;
        this.b = imageView;
        this.c = textView;
        this.d = appCompatImageView;
        this.e = appCompatImageView2;
        this.f = textView2;
        this.g = editText;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
