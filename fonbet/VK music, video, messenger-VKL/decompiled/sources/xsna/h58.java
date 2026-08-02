package xsna;

import com.vk.core.preference.Preference;
import com.vk.dto.hints.Hint;
import com.vk.dto.menu.TabBarItem;
import com.vk.dto.menu.TabBarItems;
import com.vk.dto.menu.a;
import com.vk.tabbar.core.api.domain.TabbarItem;
import com.vk.tabbar.core.api.domain.TabbarState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.b68;

/* compiled from: BottomNavigationInteractor.kt */
/* loaded from: classes.dex */
public final class h58 {
    public final ez50 a;
    public final wtn0 b;
    public com.vk.dto.menu.a e;
    public int f;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public final bpn0 d = new bpn0(new g58(0));
    public final ArrayList<WeakReference<b68.a>> g = new ArrayList<>();

    public h58(ez50 ez50Var, wtn0 wtn0Var) {
        this.a = ez50Var;
        this.b = wtn0Var;
    }

    public final com.vk.dto.menu.a a() {
        com.vk.dto.menu.a aVar = this.e;
        if (aVar != null) {
            return aVar;
        }
        com.vk.dto.menu.a a = this.a.a();
        this.e = a;
        return a;
    }

    public final TabBarItems b() {
        TabbarState c = this.b.c();
        Boolean e = c.e();
        TabBarItems tabBarItems = new TabBarItems(e != null ? e.booleanValue() : false);
        List<TabbarItem> d = c.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(new TabBarItem(((TabbarItem) it.next()).d(), null, 2, null));
        }
        tabBarItems.addAll(arrayList);
        return tabBarItems;
    }

    public final void c() {
        Hint a;
        String id;
        a.C0910a c0910a = a().c;
        a.c a2 = c0910a != null ? c0910a.a() : null;
        if (a2 == null || (a = a2.a()) == null || (id = a.getId()) == null) {
            return;
        }
        itg0.m(rsg0.y0(new mo(id), null, null, 3));
        com.vk.dto.menu.a a3 = a();
        a.C0910a c0910a2 = a3.c;
        if (c0910a2 != null) {
            c0910a2.e();
        }
        this.a.b(a3);
    }

    public final void d() {
        Boolean valueOf = !Preference.v("NavigationUtils", "cached_is_enabled") ? null : Boolean.valueOf(Preference.d("NavigationUtils", "cached_is_enabled", false));
        if (valueOf != null) {
            boolean booleanValue = valueOf.booleanValue();
            String s = !Preference.v("NavigationUtils", "cached_source") ? null : Preference.s("NavigationUtils", "cached_source", new String());
            if (epx.f(!Preference.v("NavigationUtils", "synced_is_enabled") ? null : Boolean.valueOf(Preference.d("NavigationUtils", "synced_is_enabled", false)), valueOf)) {
                return;
            }
            io.reactivex.rxjava3.disposables.b bVar = this.c;
            bVar.e();
            bVar.b(rsg0.y0(yfb.x(((bs) this.d.getValue()).i(s, booleanValue)), null, null, 3).subscribe(new bg1(new f58(this, booleanValue, 0), 6), new hz(new mb(this, 12), 7)));
        }
    }
}
