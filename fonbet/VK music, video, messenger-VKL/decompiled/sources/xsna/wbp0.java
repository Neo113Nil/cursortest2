package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: TopshelfComponentExt.kt */
/* loaded from: classes16.dex */
public final class wbp0 {
    public static final int a(vbp0 vbp0Var) {
        return vbp0Var.getView().getId();
    }

    public static final void b(vbp0 vbp0Var, izs izsVar) {
        if (!(vbp0Var.getView().getLayoutParams() instanceof ConstraintLayout.b)) {
            fp.d("LayoutParams is not ConstraintLayout.LayoutParams!");
            return;
        }
        View view = vbp0Var.getView();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        izsVar.invoke(bVar);
        view.setLayoutParams(bVar);
    }
}
