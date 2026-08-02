package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.data.NewsComment;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DefaultCommentsListPaginator.kt */
/* loaded from: classes4.dex */
public final class ocl extends td90 {
    public final com.vk.lists.c i;
    public final boolean j;
    public final boolean k;
    public String l;
    public boolean m;
    public String n;
    public String o;

    public ocl(com.vk.lists.c cVar, boolean z, boolean z2) {
        this.i = cVar;
        this.j = z;
        this.k = z2;
    }

    @Override // xsna.td90, xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> Q1(String str) {
        this.l = str;
        return e();
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> d() {
        com.vk.newsfeed.impl.requests.a s = s();
        String str = this.n;
        s.C = str;
        s.J = str == null || str.length() == 0;
        s.H = 0;
        return v(rsg0.y0(s, null, null, 3));
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> e() {
        this.f = 0;
        this.i.r(true);
        com.vk.newsfeed.impl.requests.a s = s();
        s.H = 0;
        s.I = true;
        return v(rsg0.y0(s, null, null, 3));
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.internal.operators.observable.b0 h(int i) {
        com.vk.newsfeed.impl.requests.a s = s();
        s.H = 0;
        s.I = true;
        s.E = Integer.valueOf(i);
        s.B = -50;
        s.u = 100;
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(s, null, null, 3);
        st0 st0Var = new st0(new i4h(this, 10), 12);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(st0Var, lVar, kVar, kVar);
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> l() {
        this.f = 1;
        this.i.r(false);
        com.vk.newsfeed.impl.requests.a s = s();
        s.F = Boolean.TRUE;
        s.H = 1;
        s.I = true;
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(s, null, null, 3);
        bn3 bn3Var = new bn3(new j6e(this, 14), 21);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return v(y0.E(bn3Var, lVar, kVar, kVar));
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q n(io.reactivex.rxjava3.core.q qVar) {
        return this.i.g(qVar, true, false);
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> p0() {
        if (this.m) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        boolean z = true;
        this.m = true;
        com.vk.newsfeed.impl.requests.a s = s();
        s.H = 1;
        String str = this.o;
        s.D = str;
        if (str != null && str.length() != 0) {
            z = false;
        }
        s.J = z;
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(s, null, null, 3);
        l46 l46Var = new l46(this, 5);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.observable.c0(y0.E(lVar, lVar, kVar, l46Var), lVar, new bq1(this, 2)).F(new um0(new dsc(this, 19), 23)).E(new bn3(new j6e(this, 14), 21), lVar, kVar, kVar);
    }

    @Override // xsna.td90, xsna.sd90
    public final io.reactivex.rxjava3.core.q r(int i, ArrayList arrayList) {
        com.vk.newsfeed.impl.requests.a s = s();
        s.H = 0;
        s.E = Integer.valueOf(i);
        s.B = -50;
        s.u = 100;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = rsg0.y0(s, null, null, 3).U(new q7(new rm0(10, this, arrayList), 16));
        st0 st0Var = new st0(new i4h(this, 10), 12);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(st0Var, lVar, kVar, kVar);
    }

    public final com.vk.newsfeed.impl.requests.a s() {
        UserId userId = this.a;
        int i = this.b;
        String str = this.l;
        String str2 = this.d;
        boolean z = this.j;
        com.vk.newsfeed.impl.requests.a aVar = new com.vk.newsfeed.impl.requests.a(userId, i, str, str2, z, this.k, z ? 3 : 2, this.h);
        aVar.G = Boolean.TRUE;
        return aVar;
    }

    public final void t(List list, vqt vqtVar) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList(vqtVar.a);
        int size = list.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < size; i6++) {
            if (i4 == -1) {
                i3 = 0;
            }
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                if (epx.f(list.get(i6), arrayList.get(i3))) {
                    if (i4 == -1) {
                        i4 = i6;
                        i5 = i3;
                    }
                    i2++;
                    i3++;
                } else {
                    if (i4 != -1) {
                        z = true;
                        break;
                    }
                    i3++;
                }
            }
            if (z) {
                break;
            }
        }
        if (i2 == 0) {
            return;
        }
        List subList = list.subList(0, i4);
        List subList2 = list.subList(i4 + i2, list.size());
        List subList3 = arrayList.subList(0, i5);
        int i7 = i2 + i5;
        List subList4 = arrayList.subList(i7, arrayList.size());
        List subList5 = arrayList.subList(i5, i7);
        if ((subList3.isEmpty() && subList2.isEmpty()) || (subList3.isEmpty() && j5g.d0(subList2, subList4).isEmpty())) {
            arrayList = new ArrayList(subList);
            arrayList.addAll(subList5);
            arrayList.addAll(subList4);
            str2 = this.o;
            str = vqtVar.e;
        } else if ((subList.isEmpty() && subList4.isEmpty()) || (subList4.isEmpty() && j5g.d0(subList, subList3).isEmpty())) {
            arrayList = new ArrayList(subList3);
            arrayList.addAll(subList5);
            arrayList.addAll(subList2);
            str2 = vqtVar.d;
            str = this.n;
        } else {
            str = vqtVar.e;
            str2 = vqtVar.d;
            i = vqtVar.c;
        }
        vqtVar.e = str;
        vqtVar.d = str2;
        vqtVar.c = i;
        VKList<NewsComment> vKList = vqtVar.a;
        vKList.clear();
        vKList.addAll(arrayList);
    }

    public final void u(vqt vqtVar) {
        this.l = vqtVar.g;
        String str = vqtVar.e;
        if (str == null || drm0.N(str)) {
            this.i.r(false);
        }
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 v(io.reactivex.rxjava3.internal.operators.observable.a aVar) {
        b60 b60Var = new b60(new i4e(this, 19), 20);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return aVar.E(b60Var, lVar, kVar, kVar);
    }
}
