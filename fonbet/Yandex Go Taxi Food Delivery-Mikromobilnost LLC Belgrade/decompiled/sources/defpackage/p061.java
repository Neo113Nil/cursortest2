package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.checkbox.CheckBoxView;

/* loaded from: classes13.dex */
public final class p061 implements zo31 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final CheckBoxView c;
    public final AppCompatImageView d;
    public final TextView e;
    public final TextView f;

    public p061(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, CheckBoxView checkBoxView, AppCompatImageView appCompatImageView2, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = checkBoxView;
        this.d = appCompatImageView2;
        this.e = textView;
        this.f = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
