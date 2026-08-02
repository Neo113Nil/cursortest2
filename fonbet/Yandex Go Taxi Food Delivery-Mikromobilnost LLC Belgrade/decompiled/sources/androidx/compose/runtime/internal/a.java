package androidx.compose.runtime.internal;

import defpackage.aii0;
import defpackage.bii0;
import defpackage.bms;
import defpackage.bts;
import defpackage.dms;
import defpackage.ems;
import defpackage.ew0;
import defpackage.fid;
import defpackage.fms;
import defpackage.g0;
import defpackage.gms;
import defpackage.hms;
import defpackage.jl40;
import defpackage.nc0;
import defpackage.on41;
import defpackage.r1d;
import defpackage.s09;
import defpackage.s1d;
import defpackage.so41;
import defpackage.vv8;
import defpackage.wls;
import defpackage.wwg;
import defpackage.ym11;
import defpackage.zls;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements r1d {
    public final int a;
    public final boolean b;
    public Object c;
    public aii0 w;
    public ArrayList x;

    public a(int i, Object obj, boolean z) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    @Override // defpackage.hms
    public final /* bridge */ /* synthetic */ Object a(so41 so41Var, on41 on41Var, on41 on41Var2, on41 on41Var3, Object obj, zls zlsVar, Object obj2, Object obj3, Object obj4) {
        return d(so41Var, on41Var, on41Var2, on41Var3, obj, zlsVar, obj2, (fid) obj3, ((Number) obj4).intValue());
    }

    public final Object b(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(this.a);
        l(btsVar);
        int f = i | (btsVar.k(this) ? wwg.f(2, 0) : wwg.f(1, 0));
        Object obj = this.c;
        ym11.e(2, obj);
        Object invoke = ((wls) obj).invoke(btsVar, Integer.valueOf(f));
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ComposableLambdaImpl$invoke$1(2, this, a.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }
        return invoke;
    }

    @Override // defpackage.gms
    public final /* bridge */ /* synthetic */ Object c(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, bts btsVar, Integer num) {
        return f(obj, bool, obj2, obj3, obj4, btsVar, num.intValue());
    }

    public final Object d(so41 so41Var, on41 on41Var, on41 on41Var2, on41 on41Var3, Object obj, zls zlsVar, Object obj2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(this.a);
        l(btsVar);
        int f = btsVar.k(this) ? wwg.f(2, 7) : wwg.f(1, 7);
        Object obj3 = this.c;
        ym11.e(9, obj3);
        Object a = ((hms) obj3).a(so41Var, on41Var, on41Var2, on41Var3, obj, zlsVar, obj2, btsVar, Integer.valueOf(i | f));
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vv8(this, so41Var, on41Var, on41Var2, on41Var3, obj, zlsVar, obj2, i, 1);
        }
        return a;
    }

    public final Object e(Object obj, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(this.a);
        l(btsVar);
        int f = btsVar.k(this) ? wwg.f(2, 1) : wwg.f(1, 1);
        Object obj2 = this.c;
        ym11.e(3, obj2);
        Object invoke = ((zls) obj2).invoke(obj, btsVar, Integer.valueOf(f | i));
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s1d(this, obj, i, 0);
        }
        return invoke;
    }

    public final Object f(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(this.a);
        l(btsVar);
        int f = btsVar.k(this) ? wwg.f(2, 6) : wwg.f(1, 6);
        Object obj5 = this.c;
        ym11.e(8, obj5);
        Object c = ((gms) obj5).c(obj, bool, obj2, obj3, obj4, btsVar, Integer.valueOf(i | f));
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ew0(this, obj, bool, obj2, obj3, obj4, i);
        }
        return c;
    }

    public final Object g(Object obj, Object obj2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(this.a);
        l(btsVar);
        int f = btsVar.k(this) ? wwg.f(2, 2) : wwg.f(1, 2);
        Object obj3 = this.c;
        ym11.e(4, obj3);
        Object invoke = ((bms) obj3).invoke(obj, obj2, btsVar, Integer.valueOf(f | i));
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09(this, obj, obj2, i, 15);
        }
        return invoke;
    }

    @Override // defpackage.fms
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return k(obj, obj2, obj3, obj4, obj5, (fid) obj6, ((Number) obj7).intValue());
    }

    public final Object i(Object obj, Object obj2, Object obj3, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(this.a);
        l(btsVar);
        int f = btsVar.k(this) ? wwg.f(2, 3) : wwg.f(1, 3);
        Object obj4 = this.c;
        ym11.e(5, obj4);
        Object invoke = ((dms) obj4).invoke(obj, obj2, obj3, btsVar, Integer.valueOf(f | i));
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0(this, obj, obj2, obj3, i, 14);
        }
        return invoke;
    }

    @Override // defpackage.wls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b((fid) obj, ((Number) obj2).intValue());
    }

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(this.a);
        l(btsVar);
        int f = btsVar.k(this) ? wwg.f(2, 4) : wwg.f(1, 4);
        Object obj5 = this.c;
        ym11.e(6, obj5);
        Object invoke = ((ems) obj5).invoke(obj, obj2, obj3, obj4, btsVar, Integer.valueOf(i | f));
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(this, obj, obj2, obj3, obj4, i, 9);
        }
        return invoke;
    }

    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(this.a);
        l(btsVar);
        int f = btsVar.k(this) ? wwg.f(2, 5) : wwg.f(1, 5);
        Object obj6 = this.c;
        ym11.e(7, obj6);
        Object h = ((fms) obj6).h(obj, obj2, obj3, obj4, obj5, btsVar, Integer.valueOf(i | f));
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ew0(this, obj, obj2, obj3, obj4, obj5, i, 3);
        }
        return h;
    }

    public final void l(fid fidVar) {
        aii0 B;
        if (!this.b || (B = ((bts) fidVar).B()) == null) {
            return;
        }
        B.b |= 1;
        aii0 aii0Var = this.w;
        if (aii0Var == null || !aii0Var.a() || aii0Var == B || jl40.l(aii0Var.c, B.c)) {
            this.w = B;
            return;
        }
        ArrayList arrayList = this.x;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.x = arrayList2;
            arrayList2.add(B);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aii0 aii0Var2 = (aii0) arrayList.get(i);
            if (aii0Var2 == null || !aii0Var2.a() || aii0Var2 == B || jl40.l(aii0Var2.c, B.c)) {
                arrayList.set(i, B);
                return;
            }
        }
        arrayList.add(B);
    }

    public final void m(Object obj) {
        if (jl40.l(this.c, obj)) {
            return;
        }
        boolean z = this.c == null;
        this.c = obj;
        if (z || !this.b) {
            return;
        }
        aii0 aii0Var = this.w;
        if (aii0Var != null) {
            bii0 bii0Var = aii0Var.a;
            if (bii0Var != null) {
                bii0Var.a(aii0Var, null);
            }
            this.w = null;
        }
        ArrayList arrayList = this.x;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                aii0 aii0Var2 = (aii0) arrayList.get(i);
                bii0 bii0Var2 = aii0Var2.a;
                if (bii0Var2 != null) {
                    bii0Var2.a(aii0Var2, null);
                }
            }
            arrayList.clear();
        }
    }

    @Override // defpackage.zls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return e(obj, (fid) obj2, ((Number) obj3).intValue());
    }

    @Override // defpackage.bms
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return g(obj, obj2, (fid) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.dms
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return i(obj, obj2, obj3, (fid) obj4, ((Number) obj5).intValue());
    }

    @Override // defpackage.ems
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return j(obj, obj2, obj3, obj4, (fid) obj5, ((Number) obj6).intValue());
    }
}
