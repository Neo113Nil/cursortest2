package xsna;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.attaches.AttachMap;
import com.vk.dto.geo.GeoLocation;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.nxz;

/* compiled from: ImLocationVc.kt */
/* loaded from: classes2.dex */
public final class c9w extends lzz {
    public static final String g;
    public static final String h;
    public static final String i;
    public final kkm b;
    public ixz c;
    public final g820 d = new g820();
    public nxz.d e;
    public yn2 f;

    /* compiled from: ImLocationVc.kt */
    public final class a implements wj00, jxz, h820 {
        public a() {
        }

        @Override // xsna.wj00
        public final void N() {
            nxz.d dVar = c9w.this.e;
            if (dVar != null) {
                dVar.N();
            }
        }

        @Override // xsna.wj00
        public final void a() {
            nxz.d dVar = c9w.this.e;
            if (dVar != null) {
                dVar.a();
            }
        }

        @Override // xsna.wj00
        public final void b() {
            c9w c9wVar = c9w.this;
            RecyclerView recyclerView = c9wVar.a;
            if (recyclerView != null) {
                recyclerView.requestDisallowInterceptTouchEvent(false);
            }
            nxz.d dVar = c9wVar.e;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // xsna.wj00
        public final void c() {
            c9w c9wVar = c9w.this;
            RecyclerView recyclerView = c9wVar.a;
            if (recyclerView != null) {
                recyclerView.requestDisallowInterceptTouchEvent(true);
            }
            nxz.d dVar = c9wVar.e;
            if (dVar != null) {
                dVar.c();
            }
        }

        @Override // xsna.jxz
        public final void d(uxz uxzVar, View view) {
            nxz.d dVar;
            GeoLocation geoLocation = uxzVar.b;
            int i = geoLocation.b;
            if ((i == -1 || i == -2) && (dVar = c9w.this.e) != null) {
                nxz.a aVar = nxz.this.j;
                AttachMap attachMap = new AttachMap();
                attachMap.e = geoLocation.g;
                attachMap.f = geoLocation.h;
                String str = geoLocation.i;
                if (str == null) {
                    str = "";
                }
                attachMap.g = str;
                String str2 = geoLocation.m;
                if (str2 == null) {
                    str2 = "";
                }
                attachMap.h = str2;
                String str3 = geoLocation.l;
                attachMap.i = str3 != null ? str3 : "";
                aVar.d(attachMap, view);
            }
        }

        @Override // xsna.wj00
        public final boolean e() {
            nxz.d dVar = c9w.this.e;
            if (dVar != null) {
                return nxz.this.p;
            }
            return false;
        }

        @Override // xsna.wj00
        public final void f(double d, double d2) {
            nxz.d dVar = c9w.this.e;
            if (dVar != null) {
                dVar.f(d, d2);
            }
        }

        @Override // xsna.wj00
        public final boolean g() {
            nxz.d dVar = c9w.this.e;
            if (dVar != null) {
                return dVar.g();
            }
            return false;
        }

        @Override // xsna.jxz
        public final void h(uxz uxzVar) {
            GeoLocation geoLocation = uxzVar.b;
            int i = geoLocation.b;
            c9w c9wVar = c9w.this;
            if (i == -1 || i == -2) {
                nxz.d dVar = c9wVar.e;
                if (dVar != null) {
                    dVar.d(geoLocation);
                    return;
                }
                return;
            }
            ni0 ni0Var = new ni0(7, c9wVar, uxzVar);
            RecyclerView recyclerView = c9wVar.a;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(0);
            }
            yn2 yn2Var = new yn2(ni0Var, 8);
            c9wVar.f = yn2Var;
            wvv.b(wvv.a, yn2Var, 300L, 100L, 8);
        }

        @Override // xsna.h820
        public final void onSearchRequested() {
            nxz.d dVar = c9w.this.e;
            if (dVar != null) {
                dVar.onSearchRequested();
            }
        }
    }

    /* compiled from: ImLocationVc.kt */
    public static final class c {
        public static final String a(GeoLocation geoLocation) {
            String str = c9w.g;
            String str2 = geoLocation.k;
            return str2 == null ? String.format("%.4f, %.4f", Arrays.copyOf(new Object[]{Double.valueOf(geoLocation.g), Double.valueOf(geoLocation.h)}, 2)) : str2;
        }
    }

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        g = context.getString(R.string.vkim_nearby_locations_not_found);
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        h = context2.getString(R.string.vkim_picker_no_results);
        Context context3 = e43.a;
        i = (context3 != null ? context3 : null).getString(R.string.vkim_current_location_not_set);
    }

    public c9w(kkm kkmVar) {
        this.b = kkmVar;
    }

    @Override // xsna.lzz
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        a aVar = new a();
        ixz ixzVar = new ixz();
        rm00 rm00Var = new rm00(layoutInflater, aVar);
        SparseArray<p1u0<?>> sparseArray = ixzVar.e;
        sparseArray.put(0, rm00Var);
        kkm kkmVar = this.b;
        sparseArray.put(1, new nzz(layoutInflater, aVar, kkmVar, 0));
        sparseArray.put(2, new zpz(layoutInflater, kkmVar));
        sparseArray.put(3, new e470(layoutInflater));
        sparseArray.put(4, new j820(layoutInflater, kkmVar, aVar));
        ixzVar.setHasStableIds(true);
        this.c = ixzVar;
        View inflate = layoutInflater.inflate(R.layout.vkim_msg_send_picker, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.vkim_picker_list);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ixz ixzVar2 = this.c;
        if (ixzVar2 == null) {
            ixzVar2 = null;
        }
        recyclerView.setAdapter(ixzVar2);
        recyclerView.setItemAnimator(null);
        f4m.v(iah0.a(48.0f), recyclerView);
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
        yn2 yn2Var = this.f;
        if (yn2Var != null) {
            wvv wvvVar = wvv.a;
            wvv.a(yn2Var);
        }
    }

    @Override // xsna.lzz
    public final void c(float f) {
        RecyclerView recyclerView = this.a;
        if (recyclerView != null) {
            for (int i2 = 0; i2 < recyclerView.getChildCount(); i2++) {
                View childAt = recyclerView.getChildAt(i2);
                RecyclerView recyclerView2 = this.a;
                RecyclerView.e0 childViewHolder = recyclerView2 != null ? recyclerView2.getChildViewHolder(childAt) : null;
                a680 a680Var = childViewHolder instanceof a680 ? (a680) childViewHolder : null;
                if (a680Var != null) {
                    a680Var.I3(f);
                }
            }
        }
    }

    @Override // xsna.lzz
    public final void d(nxz.d dVar) {
        this.e = dVar;
    }

    @Override // xsna.lzz
    public final void e(GeoLocation geoLocation) {
        ixz ixzVar = this.c;
        if (ixzVar == null) {
            ixzVar = null;
        }
        Iterator<? extends hfz> it = ixzVar.h.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (it.next() instanceof uxz) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            ixz ixzVar2 = this.c;
            (ixzVar2 != null ? ixzVar2 : null).setItems(j(geoLocation));
            return;
        }
        ixz ixzVar3 = this.c;
        if (ixzVar3 == null) {
            ixzVar3 = null;
        }
        ArrayList j = j(geoLocation);
        ixz ixzVar4 = this.c;
        ixzVar3.setItems(j5g.u0((ixzVar4 == null ? null : ixzVar4).h.subList(i2 + 1, (ixzVar4 != null ? ixzVar4 : null).h.size()), j));
    }

    @Override // xsna.lzz
    public final void f() {
        l();
        ixz ixzVar = this.c;
        if (ixzVar == null) {
            ixzVar = null;
        }
        ixzVar.setItems(j5g.v0(new c470(i), ixzVar.h));
    }

    @Override // xsna.lzz
    public final void g(boolean z) {
        l();
        if (z) {
            k(Collections.singletonList(new c470(h)));
        } else {
            k(Collections.singletonList(new c470(g)));
        }
    }

    @Override // xsna.lzz
    public final void h(boolean z) {
        ixz ixzVar = this.c;
        if (ixzVar == null) {
            ixzVar = null;
        }
        if (ixzVar.h.contains(wpz.b)) {
            return;
        }
        ixz ixzVar2 = this.c;
        qul qulVar = ixzVar2 == null ? null : ixzVar2;
        if (ixzVar2 == null) {
            ixzVar2 = null;
        }
        List<? extends hfz> list = ixzVar2.h;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((hfz) obj) instanceof c470)) {
                arrayList.add(obj);
            }
        }
        qulVar.setItems(arrayList);
        if (!z) {
            k(Collections.singletonList(wpz.b));
            return;
        }
        ixz ixzVar3 = this.c;
        (ixzVar3 != null ? ixzVar3 : null).setItems(j5g.v0(wpz.b, Collections.singletonList(this.d)));
    }

    @Override // xsna.lzz
    public final void i(List<GeoLocation> list, boolean z) {
        List<GeoLocation> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (GeoLocation geoLocation : list2) {
            arrayList.add(new uxz(geoLocation, c.a(geoLocation)));
        }
        if (!z) {
            List<? extends hfz> list3 = arrayList;
            if (list.isEmpty()) {
                list3 = Collections.singletonList(new c470(g));
            }
            l();
            k(list3);
            return;
        }
        ixz ixzVar = this.c;
        if (ixzVar == null) {
            ixzVar = null;
        }
        List singletonList = Collections.singletonList(this.d);
        Collection collection = arrayList;
        if (list.isEmpty()) {
            collection = Collections.singletonList(new c470(null));
        }
        ixzVar.setItems(j5g.u0(collection, singletonList));
    }

    public final ArrayList j(GeoLocation geoLocation) {
        return j5g.u0(geoLocation != null ? Collections.singletonList(new uxz(geoLocation, c.a(geoLocation))) : EmptyList.b, e43.l(this.d, new ql00(geoLocation)));
    }

    public final void k(List<? extends hfz> list) {
        ixz ixzVar = this.c;
        if (ixzVar == null) {
            ixzVar = null;
        }
        Iterator<? extends hfz> it = ixzVar.h.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (it.next() instanceof uxz) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            ixz ixzVar2 = this.c;
            (ixzVar2 == null ? null : ixzVar2).setItems(j5g.u0(list, (ixzVar2 != null ? ixzVar2 : null).h.subList(0, i2 + 1)));
        } else {
            ixz ixzVar3 = this.c;
            ixz ixzVar4 = ixzVar3 != null ? ixzVar3 : null;
            ixzVar4.setItems(j5g.u0(list, ixzVar4.h));
        }
    }

    public final void l() {
        ixz ixzVar = this.c;
        if (ixzVar == null) {
            ixzVar = null;
        }
        Iterator<? extends hfz> it = ixzVar.h.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (it.next() instanceof wpz) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            ixz ixzVar2 = this.c;
            (ixzVar2 == null ? null : ixzVar2).setItems((ixzVar2 != null ? ixzVar2 : null).h.subList(0, i2));
        }
    }

    /* compiled from: ImLocationVc.kt */
    public interface b extends wj00, h820 {
        static {
            int i = a.a;
        }

        /* compiled from: ImLocationVc.kt */
        public static final class a {
            public static final /* synthetic */ int a = 0;

            /* compiled from: ImLocationVc.kt */
            /* renamed from: xsna.c9w$b$a$a, reason: collision with other inner class name */
            public static final class C2651a implements b {
                @Override // xsna.wj00
                public final boolean e() {
                    return false;
                }

                @Override // xsna.wj00
                public final boolean g() {
                    return false;
                }

                @Override // xsna.wj00
                public final void N() {
                }

                @Override // xsna.wj00
                public final void a() {
                }

                @Override // xsna.wj00
                public final void b() {
                }

                @Override // xsna.wj00
                public final void c() {
                }

                @Override // xsna.h820
                public final void onSearchRequested() {
                }

                @Override // xsna.wj00
                public final void f(double d, double d2) {
                }
            }
        }
    }
}
