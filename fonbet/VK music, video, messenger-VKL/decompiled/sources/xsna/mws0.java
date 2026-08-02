package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.vkontakte.android.R;
import xsna.xts0;

/* compiled from: VideoMinimizablePlayerDialogsNavigator.kt */
/* loaded from: classes7.dex */
public final class mws0 {
    public final xts0 a;
    public final kcj0 b;
    public final l6n0 c;
    public com.vk.video.ui.discovery.minimizable.b d;
    public final lws0 e;

    public mws0(xts0 xts0Var, FragmentManager fragmentManager, kcj0 kcj0Var, l6n0 l6n0Var) {
        this.a = xts0Var;
        this.b = kcj0Var;
        this.c = l6n0Var;
        this.e = new lws0(fragmentManager);
    }

    public final void a() {
        lws0 lws0Var = this.e;
        if (lws0Var.b().size() <= 1) {
            this.b.invoke();
            return;
        }
        Fragment fragment = (Fragment) j5g.k0(lws0Var.b());
        if (fragment != null) {
            lws0Var.a(fragment.getTag(), true);
        }
    }

    public final void b(xts0.a aVar, String str) {
        Class<? extends Fragment> cls = aVar.a;
        Bundle bundle = aVar.b;
        this.c.invoke();
        lws0 lws0Var = this.e;
        FragmentManager fragmentManager = lws0Var.a;
        if (str != null && fragmentManager.H(str) != null) {
            lws0Var.a(str, false);
            return;
        }
        fragmentManager.F();
        Fragment fragment = (Fragment) j5g.k0(lws0Var.b());
        if (fragment != null) {
            Lifecycle.State state = Lifecycle.State.STARTED;
            FragmentManager fragmentManager2 = lws0Var.a;
            fragmentManager2.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager2);
            aVar2.r(fragment, state);
            aVar2.l();
        }
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(fragmentManager);
        if (lws0Var.b().size() > 0) {
            aVar3.i(R.anim.fr_anim_slide_in_right, R.anim.fr_anim_fade_out, R.anim.fr_anim_fade_in, R.anim.fr_anim_slide_out_right);
        }
        aVar3.f(R.id.dialogContainer, aVar3.e(cls, bundle), str, 1);
        aVar3.k(true);
    }
}
