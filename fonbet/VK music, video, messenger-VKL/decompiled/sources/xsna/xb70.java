package xsna;

import com.ironsource.Z3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.notifications.list.impl.presentation.model.common.ListNextState;
import com.vk.notifications.list.impl.presentation.model.common.NotificationPageState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.ha70;
import xsna.i870;
import xsna.kb70;
import xsna.wb70;
import xsna.xh70;

/* compiled from: NotificationListReducer.kt */
/* loaded from: classes4.dex */
public final class xb70 extends dm50<ad70, wb70, dc70> {
    public final Object d;
    public final Object e;

    public xb70() {
        super(new dc70(0));
        mg mgVar = new mg(19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, mgVar);
        this.e = msy.a(lazyThreadSafetyMode, new ob0(22));
    }

    public static dc70 i(dc70 dc70Var, int i) {
        List<o870> list = dc70Var.d;
        int i2 = dc70Var.i;
        o870 o870Var = list.get(i2);
        o870 a = o870.a(o870Var, i, null, null, null, null, null, false, false, false, k(i, o870Var.d), 510);
        List g = rdi.g(i7o0.a(dc70Var.d));
        g.set(i2, a);
        return dc70.a(dc70Var, null, null, g, 0, null, null, null, 0, false, false, 1019);
    }

    public static dc70 j(dc70 dc70Var, int i, ListNextState listNextState) {
        o870 a = o870.a(dc70Var.d.get(i), 0, listNextState, null, null, null, null, false, false, false, false, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT);
        List g = rdi.g(i7o0.a(dc70Var.d));
        g.set(i, a);
        return dc70.a(dc70Var, null, null, g, 0, null, null, null, 0, false, false, 1019);
    }

    public static boolean k(int i, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            kb70 kb70Var = (kb70) obj;
            if ((kb70Var instanceof kb70.d) && ((kb70.d) kb70Var).b > i) {
                break;
            }
        }
        return obj != null;
    }

    @Override // xsna.dm50
    public final dc70 c(dc70 dc70Var, wb70 wb70Var) {
        int i;
        Integer num;
        dc70 dc70Var2 = dc70Var;
        wb70 wb70Var2 = wb70Var;
        int i2 = dc70Var2.e;
        int i3 = dc70Var2.i;
        List list = dc70Var2.d;
        if (wb70Var2 instanceof wb70.h) {
            wb70.h hVar = (wb70.h) wb70Var2;
            String str = hVar.b;
            Long l = hVar.c;
            boolean z = hVar.d;
            List list2 = hVar.e;
            List list3 = list2 == null ? EmptyList.b : list2;
            boolean z2 = hVar.f;
            if (list2 == null) {
                list2 = EmptyList.b;
            }
            int size = list2.size();
            i = size != 0 ? size : 7;
            ListBuilder e = e43.e();
            for (int i4 = 0; i4 < i; i4++) {
                e.add(new o870(0));
            }
            return dc70.a(dc70Var2, str, l, e.g(), 0, null, null, list3, 0, z, z2, 184);
        }
        if (wb70Var2 instanceof wb70.t) {
            int i5 = ((wb70.t) wb70Var2).b;
            o870 o870Var = (o870) list.get(i5);
            List g = rdi.g(i7o0.a(list));
            g.set(i5, o870.a(o870Var, 0, null, NotificationPageState.REFRESHING, null, null, null, false, false, false, false, 1019));
            return dc70.a(dc70Var2, null, null, g, 0, null, null, null, 0, false, false, 1019);
        }
        if (wb70Var2 instanceof wb70.s) {
            int i6 = ((wb70.s) wb70Var2).b;
            o870 o870Var2 = (o870) list.get(i6);
            List g2 = rdi.g(i7o0.a(list));
            g2.set(i6, o870.a(o870Var2, 0, null, NotificationPageState.LOADING, null, null, null, false, false, false, false, 1019));
            return dc70.a(dc70Var2, null, null, g2, 0, null, null, null, 0, false, false, 1019);
        }
        if (wb70Var2 instanceof wb70.f) {
            int i7 = ((wb70.f) wb70Var2).b;
            o870 o870Var3 = (o870) list.get(i7);
            List g3 = rdi.g(i7o0.a(list));
            g3.set(i7, o870.a(o870Var3, 0, null, NotificationPageState.ERROR, EmptyList.b, null, null, false, false, false, false, 1011));
            return dc70.a(dc70Var2, null, null, g3, 0, null, null, null, 0, false, false, 1019);
        }
        Object obj = null;
        if (wb70Var2 instanceof wb70.a) {
            wb70.a aVar = (wb70.a) wb70Var2;
            int i8 = aVar.b;
            ArrayList arrayList = aVar.c;
            int i9 = aVar.d;
            o870 o870Var4 = (o870) list.get(i8);
            int intValue = (!aVar.e || (num = o870Var4.f) == null) ? i9 : num.intValue();
            int a = ((int) (qni0.a() / 1000)) + 1;
            for (Object obj2 : arrayList) {
                kb70 kb70Var = (kb70) obj2;
                if (kb70Var instanceof kb70.d) {
                    snv snvVar = ((kb70.d) kb70Var).c;
                    if ((snvVar instanceof ha70.h) || (snvVar instanceof ha70.g)) {
                        obj = obj2;
                        break;
                    }
                }
            }
            o870 a2 = o870.a(o870Var4, intValue, null, NotificationPageState.CONTENT, arrayList, aVar.f, Integer.valueOf(a), false, false, obj != null, k(i9, arrayList), 194);
            List g4 = rdi.g(i7o0.a(list));
            g4.set(i8, a2);
            return dc70.a(dc70Var2, null, null, g4, 0, null, null, null, 0, false, false, 1019);
        }
        if (wb70Var2 instanceof wb70.n) {
            List<zi70> list4 = ((wb70.n) wb70Var2).b;
            int size2 = list4.size();
            i = size2 != 0 ? size2 : 7;
            ListBuilder e2 = e43.e();
            for (int i10 = 0; i10 < i; i10++) {
                e2.add(new o870(0));
            }
            return dc70.a(dc70Var2, null, null, e2.g(), 0, null, null, list4, 0, false, false, 955);
        }
        if (wb70Var2 instanceof wb70.g) {
            return j(dc70Var2, ((wb70.g) wb70Var2).b, ListNextState.ERROR);
        }
        if (wb70Var2 instanceof wb70.i) {
            return j(dc70Var2, ((wb70.i) wb70Var2).b, ListNextState.LOADING);
        }
        if (wb70Var2 instanceof wb70.j) {
            o870 o870Var5 = (o870) list.get(i3);
            o870 a3 = o870.a(o870Var5, 0, null, null, j5g.u0(((wb70.j) wb70Var2).c, o870Var5.d), null, null, false, false, false, false, Z3.i);
            List g5 = rdi.g(i7o0.a(list));
            g5.set(i3, a3);
            return dc70.a(dc70Var2, null, null, g5, 0, null, null, null, 0, false, false, 1019);
        }
        if (wb70Var2 instanceof wb70.a0) {
            return i(dc70Var2, ((wb70.a0) wb70Var2).b);
        }
        if (wb70Var2 instanceof wb70.o) {
            return i(dc70Var2, Integer.MAX_VALUE);
        }
        if (wb70Var2 instanceof wb70.p) {
            return dc70.a(dc70Var2, null, null, null, 0, null, null, null, ((wb70.p) wb70Var2).b, false, false, 895);
        }
        if (wb70Var2.equals(wb70.r.b)) {
            return dc70.a(dc70Var2, null, null, null, i2 + 1, xh70.b.a, null, null, 0, false, false, 999);
        }
        if (wb70Var2 instanceof wb70.u) {
            return dc70.a(dc70Var2, null, null, null, i2 + 1, ((wb70.u) wb70Var2).b, null, null, 0, false, false, 999);
        }
        if (wb70Var2 instanceof wb70.m) {
            wb70.m mVar = (wb70.m) wb70Var2;
            o870 o870Var6 = (o870) list.get(i3);
            List<kb70> list5 = o870Var6.d;
            ArrayList arrayList2 = new ArrayList(c5g.u(list5, 10));
            for (Object obj3 : list5) {
                if (obj3 instanceof kb70.d) {
                    kb70.d dVar = (kb70.d) obj3;
                    if (epx.f(dVar.a, mVar.b)) {
                        i870 i870Var = dVar.k;
                        if (i870Var instanceof i870.a) {
                            obj3 = kb70.d.a(dVar, null, i870.a.a((i870.a) i870Var, mVar.c), null, 3071);
                        }
                    }
                }
                arrayList2.add(obj3);
            }
            o870 a4 = o870.a(o870Var6, 0, null, null, arrayList2, null, null, false, false, false, false, 1015);
            List g6 = rdi.g(i7o0.a(list));
            g6.set(i3, a4);
            return dc70.a(dc70Var2, null, null, g6, 0, null, null, null, 0, false, false, 1019);
        }
        if (wb70Var2 instanceof wb70.w) {
            wb70.w wVar = (wb70.w) wb70Var2;
            o870 o870Var7 = (o870) list.get(i3);
            List<kb70> list6 = o870Var7.d;
            ArrayList arrayList3 = new ArrayList(c5g.u(list6, 10));
            for (Object obj4 : list6) {
                if (obj4 instanceof kb70.d) {
                    kb70.d dVar2 = (kb70.d) obj4;
                    if (epx.f(dVar2.a, wVar.b)) {
                        obj4 = kb70.d.a(dVar2, null, new i870.b(wVar.c, wVar.d), null, 3071);
                    }
                }
                arrayList3.add(obj4);
            }
            o870 a5 = o870.a(o870Var7, 0, null, null, arrayList3, null, null, false, false, false, false, 1015);
            List g7 = rdi.g(i7o0.a(list));
            g7.set(i3, a5);
            return dc70.a(dc70Var2, null, null, g7, 0, null, null, null, 0, false, false, 1019);
        }
        if (wb70Var2.equals(wb70.d.b)) {
            return dc70.a(dc70Var2, null, null, null, 0, null, null, null, 0, false, false, 991);
        }
        if (wb70Var2 instanceof wb70.q) {
            return dc70.a(dc70Var2, null, null, null, 0, null, ((wb70.q) wb70Var2).b, null, 0, false, false, 991);
        }
        if (wb70Var2 instanceof wb70.y) {
            o870 a6 = o870.a((o870) list.get(i3), 0, null, null, null, null, null, ((wb70.y) wb70Var2).c, false, false, false, 959);
            List g8 = rdi.g(i7o0.a(list));
            g8.set(i3, a6);
            return dc70.a(dc70Var2, null, null, g8, 0, null, null, null, 0, false, false, 1019);
        }
        if (wb70Var2 instanceof wb70.z) {
            o870 a7 = o870.a((o870) list.get(i3), 0, null, null, null, null, null, false, ((wb70.z) wb70Var2).b, false, false, 895);
            List g9 = rdi.g(i7o0.a(list));
            g9.set(i3, a7);
            return dc70.a(dc70Var2, null, null, g9, 0, null, null, null, 0, false, false, 1019);
        }
        if (wb70Var2 instanceof wb70.b0) {
            o870 a8 = o870.a((o870) list.get(i3), 0, null, null, null, ((wb70.b0) wb70Var2).b, null, false, false, false, false, 1007);
            List g10 = rdi.g(i7o0.a(list));
            g10.set(i3, a8);
            return dc70.a(dc70Var2, null, null, g10, 0, null, null, null, 0, false, false, 1019);
        }
        if (wb70Var2 instanceof wb70.c) {
            wb70.c cVar = (wb70.c) wb70Var2;
            o870 o870Var8 = (o870) list.get(i3);
            List<kb70> list7 = o870Var8.d;
            ArrayList arrayList4 = new ArrayList(c5g.u(list7, 10));
            for (Object obj5 : list7) {
                if (obj5 instanceof kb70.d) {
                    kb70.d dVar3 = (kb70.d) obj5;
                    if (epx.f(cVar.b, dVar3.a)) {
                        obj5 = kb70.d.a(dVar3, null, null, cVar.c, 2047);
                    }
                }
                arrayList4.add(obj5);
            }
            o870 a9 = o870.a(o870Var8, 0, null, null, arrayList4, null, null, false, false, false, false, 1015);
            List g11 = rdi.g(i7o0.a(list));
            g11.set(i3, a9);
            return dc70.a(dc70Var2, null, null, g11, 0, null, null, null, 0, false, false, 1019);
        }
        if (wb70Var2 instanceof wb70.e) {
            wb70.e eVar = (wb70.e) wb70Var2;
            o870 o870Var9 = (o870) list.get(i3);
            List<kb70> list8 = o870Var9.d;
            ArrayList arrayList5 = new ArrayList(c5g.u(list8, 10));
            for (Object obj6 : list8) {
                if (obj6 instanceof kb70.d) {
                    kb70.d dVar4 = (kb70.d) obj6;
                    if (epx.f(eVar.b, dVar4.a)) {
                        obj6 = kb70.d.a(dVar4, null, null, null, 2047);
                    }
                }
                arrayList5.add(obj6);
            }
            o870 a10 = o870.a(o870Var9, 0, null, null, arrayList5, null, null, false, false, false, false, 1015);
            List g12 = rdi.g(i7o0.a(list));
            g12.set(i3, a10);
            return dc70.a(dc70Var2, null, null, g12, 0, null, null, null, 0, false, false, 1019);
        }
        if (wb70Var2 instanceof wb70.b) {
            o870 o870Var10 = (o870) list.get(i3);
            o870 a11 = o870.a(o870Var10, 0, null, null, rdi.A(((wb70.b) wb70Var2).b, o870Var10.d), null, null, false, false, false, false, 1015);
            List g13 = rdi.g(i7o0.a(list));
            g13.set(i3, a11);
            return dc70.a(dc70Var2, null, null, g13, 0, null, null, null, 0, false, false, 1019);
        }
        if (wb70Var2 instanceof wb70.k) {
            wb70.k kVar = (wb70.k) wb70Var2;
            o870 o870Var11 = (o870) list.get(i3);
            ArrayList arrayList6 = new ArrayList(i7o0.a(o870Var11.d));
            arrayList6.add(kVar.b, kVar.c);
            o870 a12 = o870.a(o870Var11, 0, null, null, arrayList6, null, null, false, false, false, false, 1015);
            List g14 = rdi.g(i7o0.a(list));
            g14.set(i3, a12);
            return dc70.a(dc70Var2, null, null, g14, 0, null, null, null, 0, false, false, 1019);
        }
        if (wb70Var2 instanceof wb70.l) {
            return dc70.a(dc70Var2, null, null, null, 0, null, null, null, 0, false, ((wb70.l) wb70Var2).b, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
        }
        if (!(wb70Var2 instanceof wb70.v)) {
            if (!(wb70Var2 instanceof wb70.x)) {
                throw new NoWhenBranchMatchedException();
            }
            int i11 = ((wb70.x) wb70Var2).b;
            o870 o870Var12 = (o870) list.get(i11);
            List<kb70> list9 = o870Var12.d;
            ArrayList arrayList7 = new ArrayList(c5g.u(list9, 10));
            for (kb70 kb70Var2 : list9) {
                if (kb70Var2 instanceof kb70.c) {
                    kb70.c cVar2 = (kb70.c) kb70Var2;
                    kb70Var2 = new kb70.c(cVar2.a, cVar2.b, cVar2.c, 0);
                }
                arrayList7.add(kb70Var2);
            }
            o870 a13 = o870.a(o870Var12, 0, null, null, arrayList7, null, null, false, false, false, false, 1015);
            List g15 = rdi.g(i7o0.a(list));
            g15.set(i11, a13);
            return dc70.a(dc70Var2, null, null, g15, 0, null, null, null, 0, false, false, 1019);
        }
        wb70.v vVar = (wb70.v) wb70Var2;
        List<zi70> list10 = vVar.e;
        if (!epx.f(dc70Var2.h, list10)) {
            int size3 = list10.size();
            i = size3 != 0 ? size3 : 7;
            ListBuilder e3 = e43.e();
            for (int i12 = 0; i12 < i; i12++) {
                e3.add(new o870(0));
            }
            list = e3.g();
        }
        String str2 = vVar.b;
        Long l2 = vVar.c;
        List<zi70> list11 = vVar.e;
        boolean z3 = vVar.d;
        Integer num2 = vVar.f;
        if (num2 != null) {
            i3 = num2.intValue();
        }
        return dc70.a(dc70Var2, str2, l2, list, 0, null, null, list11, i3, z3, false, 568);
    }

    @Override // xsna.dm50
    public final ad70 d() {
        return new ad70(e(new qz40(this, 5)));
    }

    @Override // xsna.dm50
    public final void h(dc70 dc70Var, ad70 ad70Var) {
        f(ad70Var.a, dc70Var);
    }
}
