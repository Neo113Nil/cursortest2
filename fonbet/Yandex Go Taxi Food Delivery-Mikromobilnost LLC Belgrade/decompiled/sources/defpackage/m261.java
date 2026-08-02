package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.widgets.common.checkbox.CheckBoxView;

/* loaded from: classes13.dex */
public final class m261 implements zo31 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public final SpoilerTextView d;
    public final TextView e;
    public final CheckBoxView f;
    public final ImageView g;

    public m261(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, SpoilerTextView spoilerTextView, TextView textView, CheckBoxView checkBoxView, ImageView imageView) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = spoilerTextView;
        this.e = textView;
        this.f = checkBoxView;
        this.g = imageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
