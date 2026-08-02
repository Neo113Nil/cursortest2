package xsna;

import com.vk.api.generated.tabbar.dto.TabbarItemNameDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.superapp.SuperAppFeatures;
import com.vk.tabbar.core.api.domain.TabbarItem;
import com.vk.tabbar.core.api.domain.TabbarState;
import com.vk.tabbar.core.api.domain.TabbarSuggestApplyState;
import com.vk.tabbar.core.api.domain.TabbarSuggestState;
import io.reactivex.rxjava3.internal.functions.a;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import xsna.nvn0;

/* compiled from: TabbarSettingsInteractorImpl.kt */
/* loaded from: classes11.dex */
public final class vvn0 implements rvn0 {
    public final wtn0 a;
    public final mun0 b;
    public final gxh c;
    public final hwn0 d;
    public final iwn0 e;
    public final k820 f;
    public io.reactivex.rxjava3.disposables.c g;
    public final ArrayList h = new ArrayList();
    public final io.reactivex.rxjava3.subjects.f<TabbarSuggestApplyState> i = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.subjects.f<s3q0> j = new io.reactivex.rxjava3.subjects.f<>();
    public TabbarState k;

    public vvn0(mui0 mui0Var, wtn0 wtn0Var, mun0 mun0Var, gxh gxhVar, hwn0 hwn0Var, iwn0 iwn0Var, k820 k820Var) {
        this.a = wtn0Var;
        this.b = mun0Var;
        this.c = gxhVar;
        this.d = hwn0Var;
        this.e = iwn0Var;
        this.f = k820Var;
        mui0Var.f(new ayi0() { // from class: xsna.svn0
            @Override // xsna.ayi0
            public final void a(uxi0 uxi0Var) {
                vvn0 vvn0Var = vvn0.this;
                vvn0Var.h.clear();
                vvn0Var.k = null;
            }
        });
    }

    public static TabbarItemNameDto i(String str) {
        for (TabbarItemNameDto tabbarItemNameDto : TabbarItemNameDto.values()) {
            if (epx.f(tabbarItemNameDto.name(), str.toUpperCase(Locale.ROOT))) {
                return tabbarItemNameDto;
            }
        }
        return null;
    }

    @Override // xsna.rvn0
    public final io.reactivex.rxjava3.core.x<List<wvn0>> a() {
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            return io.reactivex.rxjava3.core.x.t(1L, TimeUnit.SECONDS).l(new fhb0(new irt(22), 9));
        }
        this.c.clear();
        List<String> a = this.f.a(SuperAppFeatures.RequestName.GET_TABBAR_SETTINGS);
        this.d.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.W(yfb.x(ad0.G(alk.b(), a)), 7).l(new uxb0(new ggb0(this, 22), 10)), new d120(new wug0(this, 16), 21));
    }

    @Override // xsna.rvn0
    public final ArrayList b() {
        return this.h;
    }

    @Override // xsna.rvn0
    public final io.reactivex.rxjava3.internal.operators.observable.z0 c() {
        io.reactivex.rxjava3.subjects.f<s3q0> fVar = this.j;
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.z0(fVar);
    }

    @Override // xsna.rvn0
    public final io.reactivex.rxjava3.core.a d(ArrayList arrayList) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TabbarItemNameDto i = i(((TabbarItem) it.next()).d());
            if (i != null) {
                arrayList2.add(i);
            }
        }
        if (k(arrayList2) && j(arrayList)) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            return io.reactivex.rxjava3.core.a.r(1L, TimeUnit.SECONDS).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.uvn0
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    throw new ConnectException();
                }
            });
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            String d = ((TabbarItem) obj).d();
            nvn0.o.getClass();
            if (epx.f(d, nvn0.a.a())) {
                break;
            }
        }
        TabbarItem tabbarItem = (TabbarItem) obj;
        UserId e = tabbarItem != null ? tabbarItem.e() : null;
        List<String> a = this.f.a(SuperAppFeatures.RequestName.SET_TABBAR_SETTINGS);
        this.d.getClass();
        io.reactivex.rxjava3.internal.operators.completable.c cVar = new io.reactivex.rxjava3.internal.operators.completable.c(io.reactivex.rxjava3.core.a.n(hwn0.a(e, arrayList2, a), l(e)).q(io.reactivex.rxjava3.schedulers.a.b()));
        io.reactivex.rxjava3.disposables.c cVar2 = this.g;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.g = hg1.g(cVar, new wf9(this, arrayList, e, 8));
        return cVar;
    }

    @Override // xsna.rvn0
    public final void e(final int i, final TabbarSuggestState tabbarSuggestState, final String str, final ArrayList arrayList) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TabbarItemNameDto i2 = i(((TabbarItem) it.next()).d());
            if (i2 != null) {
                arrayList2.add(i2);
            }
        }
        TabbarSuggestApplyState tabbarSuggestApplyState = tabbarSuggestState == TabbarSuggestState.ADD ? TabbarSuggestApplyState.AddFailed : TabbarSuggestApplyState.RemoveFailed;
        if (!k(arrayList2) || !j(arrayList)) {
            com.vk.core.utils.newtork.b.a.getClass();
            if (com.vk.core.utils.newtork.b.d()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (((TabbarItem) obj).e() != null) {
                            break;
                        }
                    }
                }
                TabbarItem tabbarItem = (TabbarItem) obj;
                UserId e = tabbarItem != null ? tabbarItem.e() : null;
                io.reactivex.rxjava3.disposables.c cVar = this.g;
                if (cVar != null) {
                    cVar.dispose();
                }
                List<String> a = this.f.a(SuperAppFeatures.RequestName.SET_TABBAR_SETTINGS);
                this.d.getClass();
                io.reactivex.rxjava3.internal.operators.completable.u o = io.reactivex.rxjava3.core.a.n(hwn0.a(e, arrayList2, a), l(e)).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.android.schedulers.a.b());
                hu50 hu50Var = new hu50(new ydn0(1, this, arrayList), 25);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                io.reactivex.rxjava3.internal.operators.completable.w i3 = new io.reactivex.rxjava3.internal.operators.completable.w(o, hu50Var, lVar, kVar, kVar, kVar, kVar).i(new eeh0(new isb0(6, this, tabbarSuggestApplyState), 9));
                final UserId userId = e;
                this.g = hg1.g(i3, new gzs() { // from class: xsna.tvn0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        UserId userId2 = UserId.this;
                        vvn0 vvn0Var = this;
                        if (userId2 != null) {
                            vvn0Var.a.h(HintId.GROUP_MANAGED_GROUP.getId());
                        }
                        vvn0Var.b.a(i, tabbarSuggestState, str, arrayList);
                        return s3q0.a;
                    }
                });
                return;
            }
        }
        this.i.onNext(tabbarSuggestApplyState);
    }

    @Override // xsna.rvn0
    public final void f() {
        this.i.onNext(TabbarSuggestApplyState.OpenSettings);
    }

    @Override // xsna.rvn0
    public final io.reactivex.rxjava3.internal.operators.observable.z0 g() {
        io.reactivex.rxjava3.subjects.f<TabbarSuggestApplyState> fVar = this.i;
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.z0(fVar);
    }

    @Override // xsna.rvn0
    public final List<TabbarItem> h() {
        return this.a.c().d();
    }

    public final boolean j(List<TabbarItem> list) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String d = ((TabbarItem) obj).d();
            nvn0.o.getClass();
            if (epx.f(d, nvn0.a.a())) {
                break;
            }
        }
        TabbarItem tabbarItem = (TabbarItem) obj;
        return epx.f(this.a.k(), tabbarItem != null ? tabbarItem.e() : null);
    }

    public final boolean k(ArrayList arrayList) {
        List<TabbarItem> h = h();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = h.iterator();
        while (it.hasNext()) {
            TabbarItemNameDto i = i(((TabbarItem) it.next()).d());
            if (i != null) {
                arrayList2.add(i);
            }
        }
        return arrayList.equals(arrayList2);
    }

    public final io.reactivex.rxjava3.core.a l(UserId userId) {
        return userId != null ? new io.reactivex.rxjava3.internal.operators.observable.l0(new io.reactivex.rxjava3.internal.operators.mixed.q(new io.reactivex.rxjava3.internal.operators.single.v(new zec0(1, this, userId)), new bx80(new snj0(3, this, userId), 12)), new iun0(new h2h0(6), 1)) : new io.reactivex.rxjava3.internal.operators.completable.m(new hae(this, 2));
    }
}
