package com.yandex.go.information.domain;

import com.yandex.go.information.analytics.InformationAnalyticsEvent$ItemType;
import defpackage.bms;
import defpackage.bns;
import defpackage.j6;
import defpackage.jl40;
import defpackage.jxq0;
import defpackage.nw8;
import defpackage.ouq0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.utv;
import defpackage.vuv;
import defpackage.w511;
import defpackage.wvq0;
import defpackage.xtv;
import defpackage.xvq0;
import defpackage.yvq0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.common.clid.ClidProvider;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class InformationUiStateInteractor$uiStateFlow$1 extends AdaptedFunctionReference implements bms {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        ?? r4;
        jxq0 jxq0Var;
        j6 j6Var = (j6) obj;
        yvq0 yvq0Var = (yvq0) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        h hVar = (h) this.receiver;
        hVar.getClass();
        nw8 nw8Var = hVar.d;
        boolean l = jl40.l(yvq0Var, wvq0.a);
        EmptyList emptyList = EmptyList.a;
        if (l) {
            return new vuv(true, j6Var, null, null, emptyList, null, booleanValue);
        }
        if (!(yvq0Var instanceof xvq0)) {
            w511.b();
            return null;
        }
        xvq0 xvq0Var = (xvq0) yvq0Var;
        ArrayList arrayList = new ArrayList(xvq0Var.b);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj5 = null;
                break;
            }
            obj5 = it.next();
            if (jl40.l(((ouq0) obj5).a, ClidProvider.APPLICATION)) {
                break;
            }
        }
        ouq0 ouq0Var = (ouq0) obj5;
        if (ouq0Var != null) {
            arrayList.remove(ouq0Var);
            r4 = null;
        } else {
            r4 = null;
            ouq0Var = null;
        }
        EmptyList emptyList2 = ouq0Var != null ? ouq0Var.f : r4;
        if (emptyList2 != null) {
            emptyList = emptyList2;
        }
        utv utvVar = new utv(arrayList, emptyList);
        String str = xvq0Var.a;
        int i = 16;
        if (ouq0Var != null) {
            xtv xtvVar = new xtv(-1, ouq0Var.c, ouq0Var.a, InformationAnalyticsEvent$ItemType.SERVICE);
            bns bnsVar = new bns(i, hVar);
            nw8Var.getClass();
            jxq0Var = nw8.d(ouq0Var, xtvVar, bnsVar);
        } else {
            jxq0Var = r4;
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                Throwable th = r4;
                scc.m();
                throw th;
            }
            ouq0 ouq0Var2 = (ouq0) next;
            Object obj6 = r4;
            xtv xtvVar2 = new xtv(i2, ouq0Var2.c, ouq0Var2.a, InformationAnalyticsEvent$ItemType.SERVICE);
            bns bnsVar2 = new bns(16, hVar);
            nw8Var.getClass();
            arrayList2.add(nw8.d(ouq0Var2, xtvVar2, bnsVar2));
            r4 = obj6;
            i2 = i3;
        }
        return new vuv(false, j6Var, str, jxq0Var, arrayList2, utvVar, booleanValue);
    }
}
