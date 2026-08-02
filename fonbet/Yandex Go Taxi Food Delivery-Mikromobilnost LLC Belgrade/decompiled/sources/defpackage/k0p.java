package defpackage;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;

/* loaded from: classes12.dex */
public abstract class k0p extends m230 {
    public final boolean E;
    public Fragment F;
    public ViewGroup G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0p(int i) {
        super(null);
        boolean z = (i & 2) != 0;
        this.E = z;
    }

    @Override // defpackage.m230, defpackage.h55
    public final void G(Object obj) {
        ViewGroup viewGroup;
        super.G(obj);
        Fragment U = U(obj);
        this.F = U;
        if (!this.E || (viewGroup = this.G) == null || U == null) {
            return;
        }
        FragmentManager supportFragmentManager = T().getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = new a(supportFragmentManager);
        aVar.h(viewGroup.getId(), U, null);
        aVar.n();
    }

    @Override // defpackage.m230, defpackage.h55
    public final void H(Object obj) {
        Fragment fragment = this.F;
        if (fragment != null && !T().isFinishing() && !T().isDestroyed()) {
            FragmentManager supportFragmentManager = T().getSupportFragmentManager();
            supportFragmentManager.getClass();
            a aVar = new a(supportFragmentManager);
            aVar.p(fragment);
            aVar.n();
        }
        this.G = null;
        this.F = null;
        super.H(obj);
    }

    @Override // defpackage.m230
    public final void R(u45 u45Var) {
        if (u45Var instanceof bcs) {
            this.G = ((bcs) u45Var).fragmentContainer();
        } else {
            ny61.r("ExternalFragmentNavigationRouter can be used only with ModalView that implements FragmentContainerModalView!");
        }
    }

    public abstract FragmentActivity T();

    public abstract Fragment U(Object obj);

    public k0p() {
        this(3);
    }
}
