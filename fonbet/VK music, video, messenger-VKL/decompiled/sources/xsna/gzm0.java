package xsna;

import androidx.appcompat.widget.Toolbar;
import com.vk.subscriptions.SubscriptionFragment;
import com.vk.superapp.api.dto.app.GameSubscription;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.collections.builders.ListBuilder;
import xsna.lym0;
import xsna.nak;

/* compiled from: SubscriptionPresenter.kt */
/* loaded from: classes6.dex */
public final class gzm0 implements vxm0 {
    public final SubscriptionFragment b;
    public final wxm0 c;
    public final GameSubscription d;
    public io.reactivex.rxjava3.disposables.c e;
    public final boolean f;

    public gzm0(SubscriptionFragment subscriptionFragment, wxm0 wxm0Var, GameSubscription gameSubscription) {
        this.b = subscriptionFragment;
        this.c = wxm0Var;
        this.d = gameSubscription;
        this.f = gameSubscription.p;
    }

    @Override // xsna.vxm0
    public final void J5() {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.e = vdx0Var.d().V(this.d.b, r1.o).subscribe(new xk30(new q8i0(this, 10), 25), new tmz(new l850(this, 17), 17));
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    public final ListBuilder b(boolean z) {
        ListBuilder e = e43.e();
        wxm0 wxm0Var = this.c;
        String h = wxm0Var.h();
        GameSubscription gameSubscription = this.d;
        String str = gameSubscription.k;
        boolean z2 = gameSubscription.p;
        e.add(new lym0.b(h, str));
        e.add(new lym0.b(wxm0Var.e(), wxm0Var.c(gameSubscription.e)));
        e.add(new lym0.b(gameSubscription.q ? wxm0Var.b() : wxm0Var.d(), gameSubscription.l));
        String f = wxm0Var.f((int) gameSubscription.m);
        boolean z3 = z ? !z2 : z2;
        e.add(new lym0.b(wxm0Var.g(), wxm0Var.a(f)));
        if (!z) {
            e.add(new lym0.a(z2));
        }
        e.add(new lym0.c(f, z3));
        return e.g();
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.cc6
    public final void onResume() {
        String str = this.d.k;
        SubscriptionFragment subscriptionFragment = this.b;
        Toolbar toolbar = subscriptionFragment.T;
        if (toolbar != null) {
            toolbar.setTitle(str);
        }
        subscriptionFragment.jo(b(false));
    }

    @Override // xsna.vxm0
    public final void v() {
        GameSubscription gameSubscription = this.d;
        if (gameSubscription.p) {
            this.e = new io.reactivex.rxjava3.internal.operators.mixed.f(new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.maybe.k(new io.reactivex.rxjava3.internal.operators.maybe.u(zq70.D(new pw80(new gj80(this, 21)), 200L).k(io.reactivex.rxjava3.android.schedulers.a.b()), new si60(ezm0.b, 11)), new u1j0(new e750(17), 6)), new a.i(nak.a.class)), new mlh0(new zyl0(this, 5), 2)).subscribe(new kjs(new cim0(this, 2), 24), new zk30(new fuc0(this, 14), 19));
        } else {
            SubscriptionFragment subscriptionFragment = this.b;
            new w2j(subscriptionFragment.requireContext(), new iym0(subscriptionFragment)).a(gameSubscription);
        }
    }

    @Override // xsna.gm6
    public final void d() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
