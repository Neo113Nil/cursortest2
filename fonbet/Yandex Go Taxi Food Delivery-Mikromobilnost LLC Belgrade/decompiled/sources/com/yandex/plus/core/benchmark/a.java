package com.yandex.plus.core.benchmark;

import defpackage.d9;
import defpackage.djt;
import defpackage.i3y;
import defpackage.ll5;
import defpackage.q03;
import defpackage.ql5;
import defpackage.rl5;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.xyj;
import defpackage.yci0;
import defpackage.zx4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class a implements rl5, djt {
    public final yci0 a;
    public volatile sls b = new q03(23);
    public final i3y c;
    public final i3y d;
    public final i3y e;
    public final i3y f;

    public a(sls slsVar, List list, yci0 yci0Var, xyj xyjVar) {
        this.a = yci0Var;
        this.c = kotlin.a.a(slsVar);
        this.d = kotlin.a.a(new zx4(this, list));
        this.e = kotlin.a.a(new zx4(list, this));
        this.f = kotlin.a.a(new d9(22, xyjVar));
    }

    @Override // defpackage.djt
    public final void a(d9 d9Var) {
        this.b = d9Var;
    }

    @Override // defpackage.rl5
    public final void b(ll5 ll5Var, Map map) {
        if (((Boolean) this.c.getValue()).booleanValue()) {
            tje.N((tse) this.f.getValue(), null, null, new BaseBenchmarker$trackBenchmark$1(this, ll5Var, map, null), 3);
        }
    }

    public final b c(String str) {
        List list = (List) this.d.getValue();
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ql5) it.next()).a(str));
        }
        return new b(str, arrayList, this.a);
    }
}
