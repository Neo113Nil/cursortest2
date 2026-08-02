package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes2.dex */
public final class m961 implements zo31 {
    public final ConstraintLayout a;
    public final View b;
    public final AppCompatEditText c;
    public final View d;

    public m961(ConstraintLayout constraintLayout, View view, AppCompatEditText appCompatEditText, View view2, YbButtonView ybButtonView) {
        this.a = constraintLayout;
        this.b = view;
        this.c = appCompatEditText;
        this.d = view2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
