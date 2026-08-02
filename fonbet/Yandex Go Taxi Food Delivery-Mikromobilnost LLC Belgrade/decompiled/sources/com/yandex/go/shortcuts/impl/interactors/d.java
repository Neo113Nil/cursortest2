package com.yandex.go.shortcuts.impl.interactors;

import com.yandex.go.shortcuts.dto.response.ProductsResponse;
import defpackage.d1z;
import defpackage.d4s0;
import defpackage.ezs;
import defpackage.fva0;
import defpackage.g4s0;
import defpackage.h4s0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.q6c0;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.y430;
import defpackage.yaf0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class d {
    public final m a;
    public final pwy0 b;
    public final tt2 c;
    public final q6c0 d;
    public final h4s0 e;
    public final fva0 f;
    public ProductsResponse g = ProductsResponse.h;

    public d(m mVar, pwy0 pwy0Var, tt2 tt2Var, q6c0 q6c0Var, h4s0 h4s0Var, fva0 fva0Var) {
        this.a = mVar;
        this.b = pwy0Var;
        this.c = tt2Var;
        this.d = q6c0Var;
        this.e = h4s0Var;
        this.f = fva0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, ezs ezsVar, yaf0 yaf0Var, ContinuationImpl continuationImpl) {
        GetModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$1 getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof GetModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$1) {
            getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$1 = (GetModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$1) continuationImpl;
            int i2 = getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fva0.f(dVar.f, "Products.Mapping", null, 0L, 6);
                    q6c0 q6c0Var = dVar.d;
                    getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$1.L$0 = ezsVar;
                    getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$1.L$1 = null;
                    getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$1.label = 1;
                    obj = q6c0Var.N(ezsVar, yaf0Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ezsVar = (ezs) getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$1.L$0;
                    kotlin.b.b(obj);
                }
                d4s0 d4s0Var = (d4s0) obj;
                boolean z = (d4s0Var.b == d1z.a || jl40.l(dVar.g, ezsVar.b) || d4s0Var.d.isEmpty()) ? false : true;
                dVar.g = ezsVar.b;
                g4s0 g4s0Var = new g4s0();
                g4s0Var.a = d4s0Var;
                Set<y430> set = dVar.e.a;
                ArrayList arrayList = new ArrayList(tcc.n(set, 10));
                for (y430 y430Var : set) {
                    if (z) {
                        y430Var.c(d4s0Var);
                    }
                    g4s0Var.a(y430Var, y430Var.b());
                    arrayList.add(new b0(y430Var.a(), y430Var));
                }
                fva0.b(dVar.f, "Products.Mapping", null, null, 6);
                tpr[] tprVarArr = (tpr[]) arrayList.toArray(new tpr[0]);
                tpr d = com.yandex.go.coroutines.b.d(new c(kotlinx.coroutines.flow.e.f(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(tprVarArr, tprVarArr.length)), 0, null, 3), g4s0Var), new GetModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$start$1(g4s0Var.a, null));
                dVar.c.getClass();
                return kotlinx.coroutines.flow.e.F(d, uyj.a);
            }
        }
        getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$1 = new GetModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$1(dVar, continuationImpl);
        Object obj3 = getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$1.label;
        if (i != 0) {
        }
        d4s0 d4s0Var2 = (d4s0) obj3;
        if (d4s0Var2.b == d1z.a) {
        }
        dVar.g = ezsVar.b;
        g4s0 g4s0Var2 = new g4s0();
        g4s0Var2.a = d4s0Var2;
        Set<y430> set2 = dVar.e.a;
        ArrayList arrayList2 = new ArrayList(tcc.n(set2, 10));
        while (r13.hasNext()) {
        }
        fva0.b(dVar.f, "Products.Mapping", null, null, 6);
        tpr[] tprVarArr2 = (tpr[]) arrayList2.toArray(new tpr[0]);
        tpr d2 = com.yandex.go.coroutines.b.d(new c(kotlinx.coroutines.flow.e.f(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(tprVarArr2, tprVarArr2.length)), 0, null, 3), g4s0Var2), new GetModelsInteractorImpl$mapGeoDependentProductsToShortcutFlow$$inlined$start$1(g4s0Var2.a, null));
        dVar.c.getClass();
        return kotlinx.coroutines.flow.e.F(d2, uyj.a);
    }

    public final kotlinx.coroutines.flow.internal.g b(yaf0 yaf0Var) {
        return kotlinx.coroutines.flow.e.X(this.b.a(), new GetModelsInteractorImpl$getModelsFlow$1(this, yaf0Var, null));
    }
}
