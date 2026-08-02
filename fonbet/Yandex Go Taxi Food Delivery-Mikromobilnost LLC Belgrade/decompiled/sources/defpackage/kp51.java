package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.m;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.navigation.NavigationFragment;
import java.io.Serializable;
import java.util.List;
import kotlin.Result;
import kotlin.sequences.b;

/* loaded from: classes2.dex */
public final class kp51 extends hw2 {
    public final FragmentActivity g;
    public final int h;
    public final FragmentManager i;
    public final m j;
    public final NavigationFragment k;
    public final hlx0 l;

    public kp51(FragmentActivity fragmentActivity, int i, FragmentManager fragmentManager, udp0 udp0Var, List list, NavigationFragment navigationFragment) {
        super(fragmentActivity, i, fragmentManager, fragmentManager.M());
        this.g = fragmentActivity;
        this.h = i;
        this.i = fragmentManager;
        this.j = udp0Var;
        this.k = navigationFragment;
        this.l = new hlx0(list);
    }

    @Override // defpackage.hw2
    public final void a() {
        e5z0 e5z0Var = i5z0.a;
        e5z0Var.m("AppFragmentNavigator");
        e5z0Var.a("activityBack() called", new Object[0]);
        NavigationFragment navigationFragment = this.k;
        if (navigationFragment != null) {
            navigationFragment.exitFromRoot();
        }
    }

    @Override // defpackage.hw2
    public final FragmentActivity e() {
        return this.g;
    }

    @Override // defpackage.hw2
    public final int f() {
        return this.h;
    }

    @Override // defpackage.hw2
    public final m g() {
        return this.j;
    }

    @Override // defpackage.hw2
    public final FragmentManager h() {
        return this.i;
    }

    @Override // defpackage.hw2
    public final void k(a aVar, Fragment fragment, Fragment fragment2, boolean z) {
        hlx0 hlx0Var = this.l;
        cs51 cs51Var = (cs51) hlx0Var.w;
        TransitionPolicyType transitionPolicyType = (TransitionPolicyType) b.j(b.o(new h73(1, (List) hlx0Var.b), new qq31(fragment, fragment2)));
        if (transitionPolicyType == null) {
            Bundle arguments = fragment2.getArguments();
            Serializable serializable = arguments != null ? arguments.getSerializable("TRANSITION_POLICY_TYPE") : null;
            transitionPolicyType = serializable instanceof TransitionPolicyType ? (TransitionPolicyType) serializable : null;
            if (transitionPolicyType == null) {
                transitionPolicyType = TransitionPolicyType.DEFAULT;
            }
        }
        int i = ds51.a[transitionPolicyType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    cs51Var = (cs51) hlx0Var.x;
                } else {
                    if (i != 4) {
                        w511.b();
                        return;
                    }
                    cs51Var = (cs51) hlx0Var.y;
                }
            }
        } else if (z) {
            cs51Var = (cs51) hlx0Var.c;
        }
        aVar.i(cs51Var.a, cs51Var.b, cs51Var.c, cs51Var.d);
        try {
            this.i.E(this.h);
        } catch (Throwable th) {
            Throwable a = Result.a(new Result.Failure(th));
            if (a != null) {
                x4c.g("Shared animation setup error; use default animation", a, null, null, 12);
            }
        }
        aVar.p = true;
    }
}
