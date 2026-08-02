package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.widgets.common.checkbox.CheckBoxView;

/* loaded from: classes13.dex */
public final class k261 implements zo31 {
    public final ConstraintLayout a;
    public final CheckBoxView b;
    public final AppCompatImageView c;
    public final TextView d;
    public final SpoilerTextView e;
    public final FrameLayout f;
    public final TextView g;

    public k261(ConstraintLayout constraintLayout, CheckBoxView checkBoxView, AppCompatImageView appCompatImageView, TextView textView, SpoilerTextView spoilerTextView, FrameLayout frameLayout, TextView textView2) {
        this.a = constraintLayout;
        this.b = checkBoxView;
        this.c = appCompatImageView;
        this.d = textView;
        this.e = spoilerTextView;
        this.f = frameLayout;
        this.g = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
