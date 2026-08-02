package xsna;

import android.annotation.SuppressLint;
import androidx.appcompat.widget.SwitchCompat;
import com.vk.balance.BalanceFragment;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: BalancePresenter.kt */
/* loaded from: classes15.dex */
public final class d06 implements uz5 {
    public final BalanceFragment b;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public final bpn0 d = new bpn0(new com.vk.movika.sdk.base.logic.interactor.l(5));
    public io.reactivex.rxjava3.subjects.f e;
    public io.reactivex.rxjava3.subjects.f f;

    /* compiled from: BalancePresenter.kt */
    public static final class a {
        public final int a;
        public final boolean b;
        public final boolean c;

        public a(int i, boolean z, boolean z2) {
            this.a = i;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BalanceSettings(votes=");
            sb.append(this.a);
            sb.append(", isGamesAutoBuyEnabled=");
            sb.append(this.b);
            sb.append(", isMiniAppsAutoBuyEnabled=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    public d06(BalanceFragment balanceFragment) {
        this.b = balanceFragment;
    }

    @Override // xsna.uz5
    public final void B4(boolean z) {
        io.reactivex.rxjava3.subjects.f fVar = this.e;
        if (fVar != null) {
            fVar.onNext(Boolean.valueOf(z));
        }
    }

    @Override // xsna.uz5
    public final void M4(boolean z) {
        io.reactivex.rxjava3.subjects.f fVar = this.f;
        if (fVar != null) {
            fVar.onNext(Boolean.valueOf(z));
        }
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    public final void b() {
        io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
        io.reactivex.rxjava3.core.q<R> s0 = new io.reactivex.rxjava3.internal.operators.observable.y(fVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).v0(300L, TimeUnit.MILLISECONDS).s0(new d22(new on(this, 4), 3));
        pm1 pm1Var = new pm1(new l00(this, 5), 4);
        s0.getClass();
        this.c.b(new io.reactivex.rxjava3.internal.operators.observable.c0(s0, pm1Var, io.reactivex.rxjava3.internal.functions.a.c).subscribe(new p41(new qm1(this, 3), 4), new wn(new r9(this, 4), 4)));
        this.e = fVar;
    }

    @Override // xsna.gm6
    public final void d() {
        x();
    }

    public final void g() {
        io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
        io.reactivex.rxjava3.core.q<R> s0 = new io.reactivex.rxjava3.internal.operators.observable.y(fVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).v0(300L, TimeUnit.MILLISECONDS).s0(new r41(new p1(this, 8), 6));
        i22 i22Var = new i22(new v9(this, 5), 1);
        s0.getClass();
        this.c.b(new io.reactivex.rxjava3.internal.operators.observable.c0(s0, i22Var, io.reactivex.rxjava3.internal.functions.a.c).subscribe(new w00(new tl0(this, 10), 3), new y00(new com.vk.movika.sdk.base.hooks.p(this, 12), 4)));
        this.f = fVar;
    }

    @Override // xsna.uz5
    public final void h6(BaseFragment baseFragment) {
        boolean z = !vx2.d.o();
        ufx ufxVar = new ufx("store.getReplenishBalanceLink", new cjl0(0), new sni0(3));
        ufxVar.i("no_inapp", z);
        dz2 x = yfb.x(ufxVar);
        x.p = true;
        io.reactivex.rxjava3.disposables.c subscribe = rsg0.y0(x, null, null, 3).subscribe(new c06(), new mf1(new com.vk.voip.ui.menu.feature.a(this, baseFragment), 2));
        baseFragment.eo(subscribe);
        this.c.b(subscribe);
    }

    @Override // xsna.uz5
    public final void n6(FragmentImpl fragmentImpl) {
        hf3.d(new np20((int) InternalVkMiniApps.PROMO_CODES.h().a, fragmentImpl.requireContext(), new mq20(String.format("https://static.%s/promo_codes/", Arrays.copyOf(new Object[]{a0a.d}, 1)), (String) null, (String) null, (String) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (String) null, (String) null), null, new aq20(null, null, null, null, 228, null, null, false, null, false, 4079), 8));
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
        this.c.e();
    }

    @Override // xsna.uz5
    public final void refresh() {
        x();
    }

    @SuppressLint({"CheckResult"})
    public final void x() {
        BalanceFragment balanceFragment = this.b;
        SwitchCompat switchCompat = balanceFragment.d0;
        if (switchCompat == null) {
            switchCompat = null;
        }
        switchCompat.setEnabled(false);
        SwitchCompat switchCompat2 = balanceFragment.a0;
        if (switchCompat2 == null) {
            switchCompat2 = null;
        }
        switchCompat2.setEnabled(false);
        io.reactivex.rxjava3.disposables.b bVar = this.c;
        bVar.e();
        bVar.b(io.reactivex.rxjava3.core.q.I0(rsg0.y0(new un(), null, null, 3), rsg0.y0(yfb.x(new tfx("orders.getAutoBuyStatus", new zn(25), new ao(26))), null, null, 3), new com.vk.movika.sdk.base.hooks.k(new b06((byte) 0, 0), 2)).subscribe(new ga(new com.vk.movika.sdk.base.logic.interactor.d(this, 10), 7), new ia(new ha(this, 6), 7)));
        b();
        g();
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
