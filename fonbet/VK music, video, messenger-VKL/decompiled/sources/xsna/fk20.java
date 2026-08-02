package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ironsource.O6;

/* compiled from: MethodSelectorRouterImpl.kt */
/* loaded from: classes3.dex */
public final class fk20 implements ek20 {
    @Override // xsna.ek20
    public final void a(FragmentManager fragmentManager, sj20 sj20Var, mj20 mj20Var) {
        try {
            Fragment H = fragmentManager.H("[TAG] MethodSelectorBottomSheetFragment");
            oj20 oj20Var = H instanceof oj20 ? (oj20) H : null;
            if (oj20Var == null) {
                oj20Var = new oj20();
            }
            if (oj20Var.isAdded()) {
                return;
            }
            oj20Var.C = sj20Var;
            Bundle bundle = new Bundle();
            bundle.putString(O6.e1, mj20Var.a);
            bundle.putString("login", mj20Var.b);
            bundle.putParcelable("selected_type", mj20Var.c);
            bundle.putBoolean("is_ok_mimicry", mj20Var.d);
            oj20Var.setArguments(bundle);
            oj20Var.Td(fragmentManager, oj20Var.getTag());
        } catch (Exception e) {
            par0.a.getClass();
            par0.d(e);
        }
    }
}
