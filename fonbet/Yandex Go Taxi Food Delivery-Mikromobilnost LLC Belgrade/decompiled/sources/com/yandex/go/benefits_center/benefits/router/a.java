package com.yandex.go.benefits_center.benefits.router;

import defpackage.bn5;
import defpackage.co5;
import defpackage.g0p;
import defpackage.g92;
import defpackage.h3y;
import defpackage.hn5;
import defpackage.jjr;
import defpackage.jn5;
import defpackage.ljr;
import defpackage.mjr;
import defpackage.mqg0;
import defpackage.nhr;
import defpackage.nu;
import defpackage.ny61;
import defpackage.szl;
import defpackage.tls;
import defpackage.tpr;
import defpackage.vlr;
import defpackage.wgr;
import defpackage.ym5;
import defpackage.zm5;
import defpackage.zn5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.h;

/* loaded from: classes12.dex */
public final class a {
    public final wgr a;
    public final h3y b;
    public final com.yandex.go.benefits_center.benefits.sdk.document.a c;
    public final bn5 d;
    public final co5 e;
    public final h3y f;

    public a(wgr wgrVar, h3y h3yVar, com.yandex.go.benefits_center.benefits.sdk.document.a aVar, bn5 bn5Var, co5 co5Var, h3y h3yVar2) {
        this.a = wgrVar;
        this.b = h3yVar;
        this.c = aVar;
        this.d = bn5Var;
        this.e = co5Var;
        this.f = h3yVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e8 A[LOOP:0: B:12:0x00e2->B:14:0x00e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r2v12, types: [tls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(b bVar, zn5 zn5Var, hn5 hn5Var, jn5 jn5Var, List list, ContinuationImpl continuationImpl) {
        BenefitsCenterConfigBuilder$build$1 benefitsCenterConfigBuilder$build$1;
        int i;
        com.yandex.div.core.expression.variables.a aVar;
        ljr a;
        tpr[] tprVarArr;
        szl szlVar;
        int i2;
        b bVar2;
        List list2;
        hn5 hn5Var2;
        tpr[] tprVarArr2;
        Iterator it;
        if (continuationImpl instanceof BenefitsCenterConfigBuilder$build$1) {
            benefitsCenterConfigBuilder$build$1 = (BenefitsCenterConfigBuilder$build$1) continuationImpl;
            int i3 = benefitsCenterConfigBuilder$build$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                benefitsCenterConfigBuilder$build$1.label = i3 - Integer.MIN_VALUE;
                Object obj = benefitsCenterConfigBuilder$build$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = benefitsCenterConfigBuilder$build$1.label;
                int i4 = 0;
                int i5 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aVar = (com.yandex.div.core.expression.variables.a) this.b.get();
                    a = ((mjr) this.f.get()).a(jjr.b, aVar);
                    int i6 = mqg0.transparent;
                    tprVarArr = new tpr[2];
                    tprVarArr[0] = this.a.b();
                    benefitsCenterConfigBuilder$build$1.L$0 = bVar;
                    benefitsCenterConfigBuilder$build$1.L$1 = null;
                    benefitsCenterConfigBuilder$build$1.L$2 = hn5Var;
                    szlVar = jn5Var;
                    benefitsCenterConfigBuilder$build$1.L$3 = szlVar;
                    benefitsCenterConfigBuilder$build$1.L$4 = list;
                    benefitsCenterConfigBuilder$build$1.L$5 = aVar;
                    benefitsCenterConfigBuilder$build$1.L$6 = a;
                    benefitsCenterConfigBuilder$build$1.L$7 = tprVarArr;
                    benefitsCenterConfigBuilder$build$1.L$8 = tprVarArr;
                    benefitsCenterConfigBuilder$build$1.I$0 = i6;
                    benefitsCenterConfigBuilder$build$1.I$1 = 1;
                    benefitsCenterConfigBuilder$build$1.label = 1;
                    Object a2 = this.c.a(zn5Var, false, true, benefitsCenterConfigBuilder$build$1);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i2 = i6;
                    obj = a2;
                    bVar2 = bVar;
                    list2 = list;
                    hn5Var2 = hn5Var;
                    tprVarArr2 = tprVarArr;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = benefitsCenterConfigBuilder$build$1.I$1;
                    i2 = benefitsCenterConfigBuilder$build$1.I$0;
                    tprVarArr = (tpr[]) benefitsCenterConfigBuilder$build$1.L$8;
                    tprVarArr2 = (tpr[]) benefitsCenterConfigBuilder$build$1.L$7;
                    a = (ljr) benefitsCenterConfigBuilder$build$1.L$6;
                    aVar = (com.yandex.div.core.expression.variables.a) benefitsCenterConfigBuilder$build$1.L$5;
                    List list3 = (List) benefitsCenterConfigBuilder$build$1.L$4;
                    szlVar = (szl) benefitsCenterConfigBuilder$build$1.L$3;
                    hn5Var2 = (hn5) benefitsCenterConfigBuilder$build$1.L$2;
                    ?? r2 = (tls) benefitsCenterConfigBuilder$build$1.L$0;
                    kotlin.b.b(obj);
                    bVar2 = r2;
                    list2 = list3;
                }
                szl szlVar2 = szlVar;
                tprVarArr[i5] = new g92(2, obj);
                h K = e.K((tpr[]) Arrays.copyOf(tprVarArr2, tprVarArr2.length));
                Set set = this.d.a;
                ArrayList arrayList = new ArrayList(set.size());
                it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((nu) it.next()).create());
                }
                g0p g0pVar = new g0p(null, null, arrayList, null, null, null, null, null, 1015);
                return new nhr(new vlr("BenefitsCenter", new zm5(aVar, 0), new ym5(i4, hn5Var2, this), g0pVar, null, null, null, szlVar2, list2, null, null, null, null, null, null, null, null, null, null, 1047778), null, K, null, null, new Integer(i2), bVar2, a, null, null, 7770);
            }
        }
        benefitsCenterConfigBuilder$build$1 = new BenefitsCenterConfigBuilder$build$1(this, continuationImpl);
        Object obj2 = benefitsCenterConfigBuilder$build$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = benefitsCenterConfigBuilder$build$1.label;
        int i42 = 0;
        int i52 = 1;
        if (i != 0) {
        }
        szl szlVar22 = szlVar;
        tprVarArr[i52] = new g92(2, obj2);
        h K2 = e.K((tpr[]) Arrays.copyOf(tprVarArr2, tprVarArr2.length));
        Set set2 = this.d.a;
        ArrayList arrayList2 = new ArrayList(set2.size());
        it = set2.iterator();
        while (it.hasNext()) {
        }
        g0p g0pVar2 = new g0p(null, null, arrayList2, null, null, null, null, null, 1015);
        return new nhr(new vlr("BenefitsCenter", new zm5(aVar, 0), new ym5(i42, hn5Var2, this), g0pVar2, null, null, null, szlVar22, list2, null, null, null, null, null, null, null, null, null, null, 1047778), null, K2, null, null, new Integer(i2), bVar2, a, null, null, 7770);
    }
}
