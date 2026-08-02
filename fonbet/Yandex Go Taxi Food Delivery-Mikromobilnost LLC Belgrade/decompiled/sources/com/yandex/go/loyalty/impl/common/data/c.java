package com.yandex.go.loyalty.impl.common.data;

import defpackage.dvz;
import defpackage.evz;
import defpackage.jl40;
import defpackage.lvz;
import defpackage.lxz;
import defpackage.mth;
import defpackage.mxz;
import defpackage.nxz;
import defpackage.tpr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;

/* loaded from: classes.dex */
public final class c {
    public final nxz a;
    public final lvz b;

    public c(nxz nxzVar, lvz lvzVar) {
        this.a = nxzVar;
        this.b = lvzVar;
    }

    public final List a() {
        lxz a = this.a.a();
        ArrayList c = a != null ? c(a) : null;
        return c == null ? EmptyList.a : c;
    }

    public final tpr b() {
        return e.t(new n(new b(new mth(this.a.a, 6), this), new AllLoyaltyProgramsInteractorImpl$loyaltyProgramsFlow$2(2, null)));
    }

    public final ArrayList c(lxz lxzVar) {
        evz evzVar;
        Object obj;
        List<dvz> a = lxzVar.b().a();
        ArrayList arrayList = new ArrayList();
        for (dvz dvzVar : a) {
            Iterator it = lxzVar.a().iterator();
            while (true) {
                evzVar = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((mxz) obj).d(), dvzVar.b())) {
                    break;
                }
            }
            mxz mxzVar = (mxz) obj;
            if (mxzVar != null) {
                this.b.getClass();
                evzVar = lvz.a(dvzVar, mxzVar);
            }
            if (evzVar != null) {
                arrayList.add(evzVar);
            }
        }
        return arrayList;
    }
}
