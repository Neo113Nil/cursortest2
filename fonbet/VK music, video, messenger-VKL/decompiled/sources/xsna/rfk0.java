package xsna;

import android.view.View;
import android.widget.EditText;

/* compiled from: DelegateUtils.kt */
/* loaded from: classes15.dex */
public final class rfk0 extends wq70<Boolean> {
    public final /* synthetic */ qfk0 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rfk0(qfk0 qfk0Var) {
        super(r0);
        Boolean bool = Boolean.FALSE;
        this.b = qfk0Var;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
        qfk0 qfk0Var = this.b;
        View view = qfk0Var.d;
        View view2 = qfk0Var.c;
        boolean booleanValue = bool2.booleanValue();
        bool.getClass();
        if (!booleanValue) {
            f4m.j(view2);
            view.setVisibility(0);
            return;
        }
        view2.setVisibility(0);
        f4m.j(view);
        EditText editText = qfk0Var.k;
        editText.requestFocus();
        editText.postDelayed(new bi5(qfk0Var, 7), 100L);
    }

    @Override // xsna.wq70
    public final boolean beforeChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
        return !epx.f(bool, bool2);
    }
}
