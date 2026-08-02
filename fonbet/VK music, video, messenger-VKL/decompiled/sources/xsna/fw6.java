package xsna;

import androidx.fragment.app.FragmentManager;
import com.vk.voip.ui.call_effects.beauty.ui.BeautySettingsFragment;
import com.vk.voip.ui.call_effects.beauty.ui.BeautyVideoFragment;
import xsna.aw6;
import xsna.ew6;

/* compiled from: BeautyScreenDelegate.kt */
/* loaded from: classes7.dex */
public final class fw6 {
    public final ofy0 a;
    public final hw6 b;
    public final e0a c;
    public final io.reactivex.rxjava3.internal.operators.observable.y d;
    public final wqf0 e;
    public final io.reactivex.rxjava3.disposables.b f = new io.reactivex.rxjava3.disposables.b();
    public cw6 g;

    public fw6(ofy0 ofy0Var, hw6 hw6Var, e0a e0aVar, io.reactivex.rxjava3.internal.operators.observable.y yVar, wqf0 wqf0Var) {
        this.a = ofy0Var;
        this.b = hw6Var;
        this.c = e0aVar;
        this.d = yVar;
        this.e = wqf0Var;
    }

    public final void a() {
        this.f.e();
        cw6 cw6Var = this.g;
        if (cw6Var != null) {
            cw6Var.a(aw6.a.a);
        }
        this.g = null;
    }

    public final void b(FragmentManager fragmentManager) {
        if (this.g != null) {
            return;
        }
        this.e.invoke();
        cw6 cw6Var = new cw6(this.a, this.b, this.c);
        cw6Var.a(aw6.b.a);
        io.reactivex.rxjava3.disposables.c subscribe = (cw6Var.g ? io.reactivex.rxjava3.core.q.T(ew6.a.a) : cw6Var.d).subscribe(new xz(new j9(this, 10), 6));
        io.reactivex.rxjava3.disposables.b bVar = this.f;
        bVar.b(subscribe);
        bVar.b(this.d.a0(asu0.a.d()).subscribe(new k41(new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(this, 7), 4)));
        this.g = cw6Var;
        new BeautyVideoFragment().Td(fragmentManager, "BeautyVideoFragment");
        new BeautySettingsFragment().Td(fragmentManager, "BeautySettingsFragment");
    }
}
