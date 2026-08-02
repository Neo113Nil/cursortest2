package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes2.dex */
public final class f461 implements zo31 {
    public final ConstraintLayout a;
    public final TextView b;
    public final YbButtonView c;
    public final YbButtonView d;
    public final TextView e;
    public final TextView f;
    public final View g;
    public final EditText h;
    public final View i;
    public final TextView j;

    public f461(ConstraintLayout constraintLayout, TextView textView, YbButtonView ybButtonView, YbButtonView ybButtonView2, TextView textView2, TextView textView3, View view, EditText editText, View view2, TextView textView4) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = ybButtonView;
        this.d = ybButtonView2;
        this.e = textView2;
        this.f = textView3;
        this.g = view;
        this.h = editText;
        this.i = view2;
        this.j = textView4;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
