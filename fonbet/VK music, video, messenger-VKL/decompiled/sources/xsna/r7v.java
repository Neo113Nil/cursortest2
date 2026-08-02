package xsna;

import android.view.View;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.hints.HintId;
import com.vk.im.ui.fragments.DialogsFragment;
import com.vk.navigation.NavigationDelegateActivity;
import kotlin.LazyThreadSafetyMode;

/* compiled from: HintsNavigationBottomDelegate.kt */
/* loaded from: classes.dex */
public final class r7v {
    public final utn0 a;
    public final jwn0 b;
    public final wtn0 c;
    public final v57 d;
    public final zys e;
    public boolean g;
    public View h;
    public NavigationDelegateActivity i;
    public FragmentImpl j;
    public final a[] l;
    public final Object m;
    public final rvv f = new rvv(2000);
    public final io.reactivex.rxjava3.disposables.b k = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: HintsNavigationBottomDelegate.kt */
    public interface a {
        void a(NavigationDelegateActivity navigationDelegateActivity, FragmentImpl fragmentImpl, td5 td5Var);

        boolean b(FragmentImpl fragmentImpl);
    }

    public r7v(utn0 utn0Var, jwn0 jwn0Var, wtn0 wtn0Var, v57 v57Var, zys zysVar, hx50 hx50Var) {
        this.a = utn0Var;
        this.b = jwn0Var;
        this.c = wtn0Var;
        this.d = v57Var;
        this.e = zysVar;
        fd60 fd60Var = new fd60();
        bd9 bd9Var = new bd9();
        pgj pgjVar = new pgj();
        pgjVar.a = -1L;
        this.l = new a[]{fd60Var, bd9Var, pgjVar};
        this.m = msy.a(LazyThreadSafetyMode.NONE, new mu2(this, 2));
    }

    public final void a() {
        if (this.j instanceof DialogsFragment) {
            pla.e().b().b(HintId.VOIP_PROMO_CALLS_TAB_BAR.getId());
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void b() {
        for (a aVar : this.l) {
            if (aVar.b(this.j)) {
                if (this.e.b.get() != null || this.g || this.h == null) {
                    return;
                }
                this.g = true;
                this.f.b(0L, (Runnable) this.m.getValue());
                return;
            }
        }
    }
}
