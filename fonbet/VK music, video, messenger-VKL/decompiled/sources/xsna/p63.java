package xsna;

import android.content.Context;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.geo.GeoLocation;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.nxz;

/* compiled from: AppLocationVc.kt */
/* loaded from: classes15.dex */
public final class p63 extends lzz {
    public static final String f;
    public static final String g;
    public static final String h;
    public final kkm b;
    public n63 c;
    public nxz.d d;
    public o63 e;

    /* compiled from: AppLocationVc.kt */
    public static final class b {
        public static final String a(GeoLocation geoLocation) {
            String str = p63.f;
            String str2 = geoLocation.k;
            return str2 == null ? String.format("%.4f, %.4f", Arrays.copyOf(new Object[]{Double.valueOf(geoLocation.g), Double.valueOf(geoLocation.h)}, 2)) : str2;
        }
    }

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        f = context.getString(R.string.vkim_nearby_locations_not_found);
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        g = context2.getString(R.string.vkim_picker_no_results);
        Context context3 = e43.a;
        h = (context3 != null ? context3 : null).getString(R.string.vkim_current_location_not_set);
    }

    public p63(kkm kkmVar) {
        this.b = kkmVar;
    }

    public static ArrayList j(GeoLocation geoLocation) {
        return j5g.u0(geoLocation != null ? Collections.singletonList(new uxz(geoLocation, b.a(geoLocation))) : EmptyList.b, Collections.singletonList(new ql00(geoLocation)));
    }

    @Override // xsna.lzz
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        a aVar = new a();
        n63 n63Var = new n63(true);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(layoutInflater.getContext(), dhr0.C().c);
        LayoutInflater from = LayoutInflater.from(contextThemeWrapper);
        rm00 rm00Var = new rm00(LayoutInflater.from(contextThemeWrapper.getBaseContext()), aVar);
        SparseArray<p1u0<?>> sparseArray = n63Var.e;
        sparseArray.put(0, rm00Var);
        kkm kkmVar = this.b;
        sparseArray.put(1, new nzz(from, aVar, kkmVar, R.drawable.vk_icon_place_circle_fill_blue_48));
        sparseArray.put(2, new zpz(from, kkmVar));
        sparseArray.put(3, new e470(from));
        n63Var.setHasStableIds(true);
        this.c = n63Var;
        View inflate = layoutInflater.inflate(R.layout.attach_location_holder, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.locations_list);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        n63 n63Var2 = this.c;
        if (n63Var2 == null) {
            n63Var2 = null;
        }
        recyclerView.setAdapter(n63Var2);
        recyclerView.setItemAnimator(null);
        f4m.v(iah0.a(20.0f), recyclerView);
        this.a = recyclerView;
        return inflate;
    }

    @Override // xsna.lzz
    public final void b() {
        RecyclerView recyclerView = this.a;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        this.a = null;
        o63 o63Var = this.e;
        if (o63Var != null) {
            wvv wvvVar = wvv.a;
            wvv.a(o63Var);
        }
    }

    @Override // xsna.lzz
    public final void c(float f2) {
        RecyclerView recyclerView = this.a;
        if (recyclerView != null) {
            for (int i = 0; i < recyclerView.getChildCount(); i++) {
                View childAt = recyclerView.getChildAt(i);
                RecyclerView recyclerView2 = this.a;
                RecyclerView.e0 childViewHolder = recyclerView2 != null ? recyclerView2.getChildViewHolder(childAt) : null;
                a680 a680Var = childViewHolder instanceof a680 ? (a680) childViewHolder : null;
                if (a680Var != null) {
                    a680Var.I3(f2);
                }
            }
        }
    }

    @Override // xsna.lzz
    public final void d(nxz.d dVar) {
        this.d = dVar;
    }

    @Override // xsna.lzz
    public final void e(GeoLocation geoLocation) {
        n63 n63Var = this.c;
        if (n63Var == null) {
            n63Var = null;
        }
        Iterator<? extends hfz> it = n63Var.d.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next() instanceof uxz) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            n63 n63Var2 = this.c;
            (n63Var2 != null ? n63Var2 : null).setItems(j(geoLocation));
            return;
        }
        n63 n63Var3 = this.c;
        if (n63Var3 == null) {
            n63Var3 = null;
        }
        ArrayList j = j(geoLocation);
        n63 n63Var4 = this.c;
        n63Var3.setItems(j5g.u0((n63Var4 == null ? null : n63Var4).d.subList(i + 1, (n63Var4 != null ? n63Var4 : null).d.size()), j));
    }

    @Override // xsna.lzz
    public final void f() {
        l();
        n63 n63Var = this.c;
        if (n63Var == null) {
            n63Var = null;
        }
        n63Var.setItems(j5g.v0(new c470(h), n63Var.d));
    }

    @Override // xsna.lzz
    public final void g(boolean z) {
        l();
        if (z) {
            k(Collections.singletonList(new c470(g)));
        } else {
            k(Collections.singletonList(new c470(f)));
        }
    }

    @Override // xsna.lzz
    public final void h(boolean z) {
        n63 n63Var = this.c;
        if (n63Var == null) {
            n63Var = null;
        }
        if (n63Var.d.contains(wpz.b)) {
            return;
        }
        n63 n63Var2 = this.c;
        qul qulVar = n63Var2 == null ? null : n63Var2;
        if (n63Var2 == null) {
            n63Var2 = null;
        }
        List<? extends hfz> list = n63Var2.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((hfz) obj) instanceof c470)) {
                arrayList.add(obj);
            }
        }
        qulVar.setItems(arrayList);
        if (!z) {
            k(Collections.singletonList(wpz.b));
        } else {
            n63 n63Var3 = this.c;
            (n63Var3 != null ? n63Var3 : null).setItems(Collections.singletonList(wpz.b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    @Override // xsna.lzz
    public final void i(List<GeoLocation> list, boolean z) {
        List<GeoLocation> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (GeoLocation geoLocation : list2) {
            arrayList.add(new uxz(geoLocation, b.a(geoLocation)));
        }
        if (!z) {
            List<? extends hfz> list3 = arrayList;
            if (list.isEmpty()) {
                list3 = Collections.singletonList(new c470(f));
            }
            l();
            k(list3);
            return;
        }
        n63 n63Var = this.c;
        n63 n63Var2 = n63Var;
        if (n63Var == null) {
            n63Var2 = null;
        }
        ArrayList arrayList2 = arrayList;
        if (list.isEmpty()) {
            arrayList2 = Collections.singletonList(new c470(null));
        }
        n63Var2.setItems(arrayList2);
    }

    public final void k(List<? extends hfz> list) {
        n63 n63Var = this.c;
        if (n63Var == null) {
            n63Var = null;
        }
        Iterator<? extends hfz> it = n63Var.d.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next() instanceof uxz) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            n63 n63Var2 = this.c;
            (n63Var2 == null ? null : n63Var2).setItems(j5g.u0(list, (n63Var2 != null ? n63Var2 : null).d.subList(0, i + 1)));
        } else {
            n63 n63Var3 = this.c;
            n63 n63Var4 = n63Var3 != null ? n63Var3 : null;
            n63Var4.setItems(j5g.u0(list, n63Var4.d));
        }
    }

    public final void l() {
        n63 n63Var = this.c;
        if (n63Var == null) {
            n63Var = null;
        }
        Iterator<? extends hfz> it = n63Var.d.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next() instanceof wpz) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            n63 n63Var2 = this.c;
            (n63Var2 == null ? null : n63Var2).setItems((n63Var2 != null ? n63Var2 : null).d.subList(0, i));
        }
    }

    /* compiled from: AppLocationVc.kt */
    public final class a implements wj00, jxz, h820 {
        public a() {
        }

        @Override // xsna.wj00
        public final void N() {
            nxz.d dVar = p63.this.d;
            if (dVar != null) {
                dVar.N();
            }
        }

        @Override // xsna.wj00
        public final void a() {
            nxz.d dVar = p63.this.d;
            if (dVar != null) {
                dVar.a();
            }
        }

        @Override // xsna.wj00
        public final void b() {
            p63 p63Var = p63.this;
            RecyclerView recyclerView = p63Var.a;
            if (recyclerView != null) {
                recyclerView.requestDisallowInterceptTouchEvent(false);
            }
            nxz.d dVar = p63Var.d;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // xsna.wj00
        public final void c() {
            p63 p63Var = p63.this;
            RecyclerView recyclerView = p63Var.a;
            if (recyclerView != null) {
                recyclerView.requestDisallowInterceptTouchEvent(true);
            }
            nxz.d dVar = p63Var.d;
            if (dVar != null) {
                dVar.c();
            }
        }

        @Override // xsna.wj00
        public final boolean e() {
            nxz.d dVar = p63.this.d;
            if (dVar != null) {
                return nxz.this.p;
            }
            return false;
        }

        @Override // xsna.wj00
        public final void f(double d, double d2) {
            nxz.d dVar = p63.this.d;
            if (dVar != null) {
                dVar.f(d, d2);
            }
        }

        @Override // xsna.wj00
        public final boolean g() {
            nxz.d dVar = p63.this.d;
            if (dVar != null) {
                return dVar.g();
            }
            return false;
        }

        @Override // xsna.jxz
        public final void h(uxz uxzVar) {
            GeoLocation geoLocation = uxzVar.b;
            int i = geoLocation.b;
            p63 p63Var = p63.this;
            if (i == -1 || i == -2) {
                nxz.d dVar = p63Var.d;
                if (dVar != null) {
                    dVar.d(geoLocation);
                    return;
                }
                return;
            }
            com.vk.movika.sdk.base.ui.r rVar = new com.vk.movika.sdk.base.ui.r(1, p63Var, uxzVar);
            RecyclerView recyclerView = p63Var.a;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(0);
            }
            o63 o63Var = new o63(rVar, 0);
            p63Var.e = o63Var;
            wvv.b(wvv.a, o63Var, 300L, 100L, 8);
        }

        @Override // xsna.h820
        public final void onSearchRequested() {
            nxz.d dVar = p63.this.d;
            if (dVar != null) {
                dVar.onSearchRequested();
            }
        }

        @Override // xsna.jxz
        public final void d(uxz uxzVar, View view) {
        }
    }
}
