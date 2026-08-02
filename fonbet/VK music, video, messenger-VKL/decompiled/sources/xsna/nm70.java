package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.NoWhenBranchMatchedException;
import xsna.mm70;

/* compiled from: NspkChooserRouter.kt */
/* loaded from: classes2.dex */
public final class nm70 implements hm50<mm70> {
    public final Fragment a;

    public nm70(lm70 lm70Var) {
        this.a = lm70Var;
    }

    @Override // xsna.hm50
    public final void a(mm70 mm70Var) {
        mm70 mm70Var2 = mm70Var;
        boolean equals = mm70Var2.equals(mm70.a.a);
        Fragment fragment = this.a;
        if (!equals) {
            if (!(mm70Var2 instanceof mm70.b)) {
                throw new NoWhenBranchMatchedException();
            }
            fragment.startActivity(((mm70.b) mm70Var2).a);
        } else {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            parentFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.q(fragment);
            aVar.m();
        }
    }
}
