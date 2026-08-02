package xsna;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.vk.log.L;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuActionsFragment;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuFragmentBase;
import com.vk.voip.ui.menu.ui.MainMenuView;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.utils.Logger;
import xsna.ghw0;
import xsna.ihw0;
import xsna.ivw0;
import xsna.v59;
import xsna.ze00;

/* compiled from: CallMainMenuComponent.kt */
/* loaded from: classes7.dex */
public class u59 implements tmg0, qa9 {
    public final ze00.a b;
    public final b5u0 c;
    public final ihw0 d;
    public final Object e;
    public final e820 f;
    public final lh80 g;
    public final t70 h;
    public final io.reactivex.rxjava3.disposables.c i;

    /* compiled from: CallMainMenuComponent.kt */
    public interface a {
    }

    public u59(ze00.a aVar) {
        this.b = aVar;
        ze00 ze00Var = (ze00) this;
        this.e = msy.a(LazyThreadSafetyMode.NONE, new h6(ze00Var, 10));
        z89 z89Var = new z89();
        this.h = z89Var;
        bwt0.p0(b(), false);
        b().setActionsProvider$ui_release(z89Var);
        b5u0 b5u0Var = new b5u0(b(), new n59(0, aVar, b.class, "isAnimationAllowed", "isAnimationAllowed()Z", 0));
        this.c = b5u0Var;
        ihw0 ihw0Var = new ihw0(new ihw0.a(ze00Var, (FragmentManager) aVar.d.invoke(), new o59(1, aVar, b.class, "createDefaultMenuFragment", "createDefaultMenuFragment(Lcom/vk/voip/ui/menu/CallMainMenuComponent;)Landroidx/fragment/app/Fragment;", 0), new p59(1, aVar, b.class, "mapRequestedVisibilityToPossible", "mapRequestedVisibilityToPossible(Z)Z", 0), new q59(0, aVar, b.class, "isMenuEnabled", "isMenuEnabled()Z", 0), new r59(0, aVar, b.class, "isExpandAllowed", "isExpandAllowed()Z", 0), new s59(1, aVar, b.class, "isRootFragment", "isRootFragment(Landroidx/fragment/app/Fragment;)Z", 0)));
        this.d = ihw0Var;
        if (b().getUiMode() == MainMenuView.UIMode.FLYING) {
            z89Var.b = new s0p0(b().getToggleButtonConfig$ui_release(), ihw0Var);
            h70 h70Var = z89Var.a;
            if (h70Var != null) {
                h70Var.a(z89Var, false);
            }
        }
        kny knyVar = new kny(ihw0Var);
        this.f = new e820(b(), ihw0Var, b5u0Var, knyVar);
        this.i = io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.observable.i0(ihw0Var.e.b0(v59.b.class), new s41(new md(9), 7)).K(), new t59(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), new pd(ze00Var, 14));
        this.g = new lh80(b(), ihw0Var, knyVar);
        gvw0 f = aVar.f();
        ivw0 ivw0Var = f != null ? f.b : null;
        if (ivw0Var != null) {
            ihw0Var.f.b(io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.i0(ivw0Var.a.b0(ivw0.a.C3084a.class), new or20(new d7l0(19), 25)), null, new p6e0(27), new waf0(ihw0Var, 28)));
        }
    }

    @Override // xsna.qa9
    public final void a(float f) {
        this.c.a(f);
        b().a(f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final MainMenuView b() {
        return (MainMenuView) this.e.getValue();
    }

    public final void c(VoipMainMenuFragmentBase voipMainMenuFragmentBase, boolean z) {
        this.d.a(new ghw0.p(voipMainMenuFragmentBase, z));
    }

    @Override // xsna.tmg0
    public final List<View> getAnimatedViewsToRotate() {
        return b().getAnimatedViewsToRotate();
    }

    @Override // xsna.tmg0
    public final List<View> getViewsToRotate() {
        return b().getViewsToRotate();
    }

    /* compiled from: CallMainMenuComponent.kt */
    public static abstract class b {
        public final m1i a;

        public b(m1i m1iVar) {
            this.a = m1iVar;
        }

        public abstract VoipMainMenuActionsFragment a(u59 u59Var);

        public boolean b() {
            return true;
        }

        public boolean c() {
            return true;
        }

        public boolean d() {
            return true;
        }

        public boolean e(boolean z) {
            return z;
        }
    }
}
