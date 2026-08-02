package xsna;

import com.vk.api.generated.tabbar.dto.TabbarItemNameDto;
import com.vk.dto.common.id.UserId;
import com.vk.tabbar.core.api.domain.TabbarItem;
import com.vk.tabbar.settings.impl.mvi.InteractSource;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.awn0;
import xsna.jun0;
import xsna.t0j0;
import xsna.y2j0;
import xsna.zvn0;

/* compiled from: TabbarSettingsFeature.kt */
/* loaded from: classes6.dex */
public final class nvn0 extends wk50<nwn0, mwn0, jun0, awn0> {
    public static final a o;
    public static final /* synthetic */ qcy<Object>[] p;
    public static final String q;
    public static final String r;
    public static final int s;
    public static final float t;
    public final String f;
    public final k820 g;
    public final rvn0 h;
    public final pvn0 i;
    public final ArrayList j;
    public int k;
    public boolean l;
    public final pgn m;
    public final f4z n;

    /* compiled from: TabbarSettingsFeature.kt */
    public static final class a {
        public static String a() {
            return nvn0.r;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(nvn0.class, "disposableManagedCommunity", "getDisposableManagedCommunity()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        p = new qcy[]{mutablePropertyReference1Impl};
        o = new a();
        q = TabbarItemNameDto.EMPTY.i();
        r = TabbarItemNameDto.MANAGED_GROUP.i();
        s = iah0.a((int) 72.0f);
        t = 72.0f;
    }

    public nvn0(String str, k820 k820Var, rvn0 rvn0Var, pvn0 pvn0Var) {
        super(jun0.c.b, new fwn0(new mwn0(y2j0.b.a, t0j0.b.a, false, false)));
        this.f = str;
        this.g = k820Var;
        this.h = rvn0Var;
        this.i = pvn0Var;
        this.j = new ArrayList();
        this.k = -1;
        this.m = new pgn();
        this.n = new f4z();
    }

    @Override // xsna.wk50
    public final void N(mwn0 mwn0Var, jun0 jun0Var) {
        Object obj;
        jun0 jun0Var2 = jun0Var;
        boolean equals = jun0Var2.equals(jun0.c.b);
        pvn0 pvn0Var = this.i;
        String str = r;
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        ArrayList arrayList = this.j;
        rvn0 rvn0Var = this.h;
        if (equals || jun0Var2.equals(jun0.f.b)) {
            arrayList.clear();
            List<TabbarItem> h = rvn0Var.h();
            Iterator<T> it = h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((TabbarItem) obj).d(), str)) {
                        break;
                    }
                }
            }
            TabbarItem tabbarItem = (TabbarItem) obj;
            if (tabbarItem != null) {
                pvn0Var.c(tabbarItem.e());
            }
            arrayList.addAll(h);
            ArrayList b = pvn0Var.b();
            if (!b.isEmpty()) {
                U(b);
                return;
            } else {
                T(new awn0.d(new t0j0.a(W(EmptyList.b, false), false)));
                bVar.b(rvn0Var.a().m(asu0.a.d()).subscribe(new fl30(new ptl0(this, 7), 27), new h4f0(new gqe0(this, 12), 8)));
                return;
            }
        }
        if (jun0Var2.equals(jun0.g.b)) {
            io.reactivex.rxjava3.internal.operators.completable.u o2 = rvn0Var.d(arrayList).o(asu0.a.d());
            o330 o330Var = new o330(new qjl0(this, 4), 20);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            bVar.b(new io.reactivex.rxjava3.internal.operators.completable.w(o2, o330Var, lVar, kVar, kVar, kVar, kVar).subscribe(new lcb(this, 3), new j720(new n7b0(this, 13), 11)));
            return;
        }
        if (jun0Var2.equals(jun0.b.b)) {
            this.n.b(zvn0.a.a);
            return;
        }
        if (jun0Var2 instanceof jun0.a) {
            int i = ((jun0.a) jun0Var2).b;
            int i2 = this.k < i ? 1 : -1;
            this.k = i;
            this.l = true;
            b0(InteractSource.USER_INTERACT_WITH_BOTTOM_PANEL, i2);
            return;
        }
        if (!(jun0Var2 instanceof jun0.d)) {
            if (!(jun0Var2 instanceof jun0.e)) {
                throw new NoWhenBranchMatchedException();
            }
            jun0.e eVar = (jun0.e) jun0Var2;
            String str2 = eVar.b;
            pvn0Var.c(eVar.c);
            V(str2);
            return;
        }
        jun0.d dVar = (jun0.d) jun0Var2;
        String str3 = dVar.b;
        if (dVar.c <= 1 || !epx.f(str3, str)) {
            V(str3);
        } else {
            T(awn0.f.b);
        }
    }

    public final void U(List<wvn0> list) {
        String str;
        ArrayList arrayList = this.j;
        int i = -1;
        String str2 = this.f;
        if (str2 != null) {
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                TabbarItem tabbarItem = (TabbarItem) it.next();
                if (brm0.w(tabbarItem.d(), str2, true) && tabbarItem.f()) {
                    break;
                } else {
                    i2++;
                }
            }
            this.k = i2;
        }
        if (this.k == -1) {
            Iterator it2 = arrayList.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((TabbarItem) it2.next()).f()) {
                    i = i3;
                    break;
                }
                i3++;
            }
            this.k = i;
        }
        TabbarItem tabbarItem2 = (TabbarItem) j5g.b0(this.k, arrayList);
        if (tabbarItem2 == null || (str = tabbarItem2.d()) == null) {
            str = q;
        }
        io.reactivex.rxjava3.core.x<List<sh00>> e = this.i.e(false);
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c subscribe = e.q(asu0Var.c()).m(asu0Var.d()).h(new uu60(new i0b0(this, 19), 23)).subscribe(new jw80(new vh9(this, list, str, 14), 16));
        qcy<Object> qcyVar = p[0];
        this.m.b(subscribe);
    }

    public final void V(final String str) {
        Object obj;
        if (this.k < 0) {
            return;
        }
        pvn0 pvn0Var = this.i;
        Iterator it = pvn0Var.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((wvn0) obj).a, str)) {
                    break;
                }
            }
        }
        wvn0 wvn0Var = (wvn0) obj;
        if (wvn0Var != null) {
            UnaryOperator unaryOperator = new UnaryOperator() { // from class: xsna.mvn0
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    TabbarItem tabbarItem = (TabbarItem) obj2;
                    return epx.f(tabbarItem.d(), str) ? new TabbarItem(nvn0.q, null, null, true, null, 18, null) : tabbarItem;
                }
            };
            ArrayList arrayList = this.j;
            arrayList.replaceAll(unaryOperator);
            int i = this.k;
            String str2 = wvn0Var.a;
            String str3 = wvn0Var.b;
            boolean z = wvn0Var.c;
            UserId g = pvn0Var.g();
            if (g == null) {
                g = wvn0Var.f;
            }
            arrayList.set(i, new TabbarItem(str2, null, str3, z, g, 2, null));
            this.l = true;
            b0(InteractSource.USER_INTERACT_WITH_MAIN_PANEL, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v6, types: [xsna.uun0] */
    /* JADX WARN: Type inference failed for: r10v7, types: [xsna.uun0] */
    /* JADX WARN: Type inference failed for: r10v9, types: [xsna.uun0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList W(List list, boolean z) {
        Object obj;
        String str;
        ArrayList b = this.i.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.j.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            TabbarItem tabbarItem = (TabbarItem) next;
            boolean z2 = i == this.k;
            Iterator it2 = b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (epx.f(((wvn0) obj).a, tabbarItem.d())) {
                    break;
                }
            }
            wvn0 wvn0Var = (wvn0) obj;
            if (epx.f(tabbarItem.d(), q)) {
                aqv aqvVar = new aqv(6, Integer.valueOf(z2 ? R.drawable.vk_icon_block_outline_28 : R.drawable.vk_icon_add_outline_28), null, null);
                String d = tabbarItem.d();
                boolean f = tabbarItem.f();
                if (!z2 || z) {
                    if (wvn0Var != null) {
                        r9 = wvn0Var.e;
                    }
                } else if (wvn0Var != null) {
                    r9 = wvn0Var.d;
                }
                str = new uun0(aqvVar, d, true, f, z2, r9, z2 ? 1.0f : -1.0f, new gzo0(2, Integer.valueOf(R.string.tabbar_settings_accessibility_add_tab)), null);
            } else if (epx.f(tabbarItem.d(), r)) {
                if (wvn0Var != null) {
                    str = new uun0(X(wvn0Var, list, s), wvn0Var.a, false, wvn0Var.c, z2, wvn0Var.d, 1.0f, Y(wvn0Var, list), wvn0Var.f);
                }
                if (r9 != null) {
                    arrayList.add(r9);
                }
                i = i2;
            } else {
                String d2 = tabbarItem.d();
                k820 k820Var = this.g;
                Integer e = k820Var.e(d2);
                if (e != null) {
                    int intValue = e.intValue();
                    str = new uun0(new aqv(6, Integer.valueOf(k820Var.c(intValue)), null, null), tabbarItem.d(), false, tabbarItem.f(), z2, wvn0Var != null ? wvn0Var.d : null, 1.0f, new gzo0(2, Integer.valueOf(k820Var.f(intValue))), null);
                }
                if (r9 != null) {
                }
                i = i2;
            }
            r9 = str;
            if (r9 != null) {
            }
            i = i2;
        }
        return arrayList;
    }

    public final aqv X(wvn0 wvn0Var, List<sh00> list, int i) {
        sh00 sh00Var;
        int c;
        Object obj;
        aqv aqvVar = new aqv(7, null, null, null);
        UserId userId = wvn0Var.f;
        if (userId != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((sh00) obj).a, userId)) {
                    break;
                }
            }
            sh00Var = (sh00) obj;
        } else {
            sh00Var = null;
        }
        if (sh00Var != null) {
            return new aqv(1, null, Integer.valueOf(list.size()), js5.a(i, sh00Var.c));
        }
        String str = wvn0Var.a;
        k820 k820Var = this.g;
        Integer e = k820Var.e(str);
        return (e == null || (c = k820Var.c(e.intValue())) == 0) ? aqvVar : new aqv(6, Integer.valueOf(c), null, null);
    }

    public final gzo0 Y(wvn0 wvn0Var, List<sh00> list) {
        sh00 sh00Var;
        Object obj;
        UserId userId = wvn0Var.f;
        if (userId != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((sh00) obj).a, userId)) {
                    break;
                }
            }
            sh00Var = (sh00) obj;
        } else {
            sh00Var = null;
        }
        String str = wvn0Var.a;
        String str2 = sh00Var != null ? sh00Var.b : null;
        int size = list.size();
        gzo0 gzo0Var = new gzo0(3, (Integer) null);
        k820 k820Var = this.g;
        Integer e = k820Var.e(str);
        if (e != null) {
            int intValue = e.intValue();
            if (k820Var.f(intValue) != 0) {
                return (!k820Var.b(intValue) || size <= 1) ? new gzo0(Integer.valueOf(k820Var.f(intValue)), str2) : new gzo0(Integer.valueOf(k820Var.f(intValue)), (String) null);
            }
        }
        return gzo0Var;
    }

    public final xvn0 Z(wvn0 wvn0Var, ArrayList arrayList, List list) {
        String str = wvn0Var.a;
        String str2 = q;
        Object obj = null;
        if (epx.f(str, str2)) {
            return new xvn0(str2, new gzo0(Integer.valueOf(R.string.tabbar_settings_not_show_tab), wvn0Var.b), new aqv(6, Integer.valueOf(R.drawable.vk_icon_block_outline_28), null, null), true, false, null);
        }
        boolean f = epx.f(str, r);
        int i = s;
        if (!f) {
            String str3 = wvn0Var.a;
            gzo0 Y = Y(wvn0Var, list);
            aqv X = X(wvn0Var, list, i);
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                uun0 uun0Var = (uun0) next;
                if (epx.f(uun0Var.b, str) && uun0Var.d) {
                    obj = next;
                    break;
                }
            }
            return new xvn0(str3, Y, X, false, obj != null, null);
        }
        if (list.isEmpty()) {
            return null;
        }
        String str4 = wvn0Var.a;
        gzo0 Y2 = Y(wvn0Var, list);
        aqv X2 = X(wvn0Var, list, i);
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            uun0 uun0Var2 = (uun0) next2;
            if (epx.f(uun0Var2.b, str) && uun0Var2.d) {
                obj = next2;
                break;
            }
        }
        return new xvn0(str4, Y2, X2, false, obj != null, wvn0Var.f);
    }

    public final void b0(InteractSource interactSource, int i) {
        io.reactivex.rxjava3.core.x<List<sh00>> e = this.i.e(true);
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c subscribe = e.q(asu0Var.c()).m(asu0Var.d()).h(new t6m0(new pod0(this, 15), 2)).subscribe(new n1r(new a7(this, interactSource, i), 25));
        qcy<Object> qcyVar = p[0];
        this.m.b(subscribe);
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        this.i.invalidate();
        qcy<Object> qcyVar = p[0];
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.m.b;
        if (cVar != null) {
            cVar.dispose();
        }
        super.onDestroy();
    }
}
