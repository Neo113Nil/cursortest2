package com.yandex.passport.internal.badges;

import android.content.Context;
import androidx.core.app.s0;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.domain.RetryStrategy;
import com.yandex.passport.common.network.l0;
import com.yandex.passport.common.network.m;
import com.yandex.passport.data.network.core.i;
import com.yandex.passport.data.network.g1;
import com.yandex.passport.data.network.nc;
import com.yandex.passport.data.network.r0;
import com.yandex.passport.internal.config.q;
import com.yandex.passport.internal.di.module.h;
import com.yandex.passport.internal.di.module.n;
import com.yandex.passport.internal.push.c0;
import com.yandex.passport.internal.push.z;
import com.yandex.passport.internal.report.reporters.p;
import com.yandex.passport.internal.sloth.k;
import defpackage.ei00;
import defpackage.v7p;
import defpackage.w53;
import defpackage.xvf0;
import defpackage.yvf0;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public final class d implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final Object c;
    public final Object d;

    public d(n nVar, yvf0 yvf0Var, yvf0 yvf0Var2) {
        this.a = 4;
        this.d = nVar;
        this.b = yvf0Var;
        this.c = yvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        yvf0 yvf0Var = this.b;
        switch (i) {
            case 0:
                return new c((com.yandex.passport.common.coroutine.a) yvf0Var.get(), (Context) ((yvf0) obj2).get(), (b) ((i) obj).get());
            case 1:
                Map map = (Map) yvf0Var.get();
                Map map2 = (Map) ((ei00) obj).get();
                ((h) obj2).getClass();
                com.yandex.passport.internal.network.client.b bVar = new com.yandex.passport.internal.network.client.b();
                Iterator it = map.entrySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    w53 w53Var = bVar.a;
                    if (hasNext) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Integer num = (Integer) entry.getKey();
                        com.yandex.passport.internal.network.client.a aVar = (com.yandex.passport.internal.network.client.a) entry.getValue();
                        com.yandex.passport.common.core.a aVar2 = Environment.Companion;
                        int intValue = num.intValue();
                        aVar2.getClass();
                        w53Var.put(com.yandex.passport.common.core.a.a(intValue), aVar);
                    } else {
                        Iterator it2 = map2.entrySet().iterator();
                        while (true) {
                            boolean hasNext2 = it2.hasNext();
                            w53 w53Var2 = bVar.b;
                            if (!hasNext2) {
                                return new com.yandex.passport.internal.network.client.c(w53Var, w53Var2);
                            }
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            Integer num2 = (Integer) entry2.getKey();
                            com.yandex.passport.internal.network.client.e eVar = (com.yandex.passport.internal.network.client.e) entry2.getValue();
                            com.yandex.passport.common.core.a aVar3 = Environment.Companion;
                            int intValue2 = num2.intValue();
                            aVar3.getClass();
                            w53Var2.put(com.yandex.passport.common.core.a.a(intValue2), eVar);
                        }
                    }
                }
            case 2:
                com.yandex.passport.common.coroutine.a aVar4 = (com.yandex.passport.common.coroutine.a) yvf0Var.get();
                m mVar = (m) ((xvf0) obj).get();
                ((h) obj2).getClass();
                l0 l0Var = new l0(((com.yandex.passport.common.coroutine.b) aVar4).c, mVar);
                l0Var.e = RetryStrategy.EXPONENTIAL;
                return l0Var;
            case 3:
                com.yandex.passport.internal.core.accounts.n nVar = (com.yandex.passport.internal.core.accounts.n) yvf0Var.get();
                com.yandex.passport.internal.helper.c cVar = (com.yandex.passport.internal.helper.c) ((xvf0) obj).get();
                ((n) obj2).getClass();
                return new com.yandex.passport.internal.core.accounts.d(nVar, cVar);
            case 4:
                Context context = (Context) ((yvf0) obj2).get();
                ((n) obj).getClass();
                return new com.yandex.passport.internal.push.f(new s0(context));
            case 5:
                return new com.yandex.passport.internal.push.i((Context) yvf0Var.get(), (z) ((nc) obj2).get(), (c0) ((r0) obj).get());
            case 6:
                return new com.yandex.passport.internal.ui.common.web.b((q) yvf0Var.get(), (k) ((p) obj).get(), (com.yandex.passport.internal.network.e) ((yvf0) obj2).get());
            default:
                return new com.yandex.passport.internal.usecase.ui.c0((com.yandex.passport.common.coroutine.a) yvf0Var.get(), (com.yandex.passport.internal.core.accounts.d) ((yvf0) obj2).get(), (com.yandex.passport.internal.filter.i) ((g1) obj).get());
        }
    }

    public /* synthetic */ d(Object obj, yvf0 yvf0Var, xvf0 xvf0Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = yvf0Var;
        this.d = xvf0Var;
    }

    public /* synthetic */ d(yvf0 yvf0Var, yvf0 yvf0Var2, v7p v7pVar, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = v7pVar;
    }

    public d(yvf0 yvf0Var, p pVar, yvf0 yvf0Var2) {
        this.a = 6;
        this.b = yvf0Var;
        this.d = pVar;
        this.c = yvf0Var2;
    }
}
