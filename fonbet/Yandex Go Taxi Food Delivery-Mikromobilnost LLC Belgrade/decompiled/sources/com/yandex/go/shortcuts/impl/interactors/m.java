package com.yandex.go.shortcuts.impl.interactors;

import com.yandex.go.address.models.Address;
import com.yandex.go.shortcuts.dto.request.ProductsScreenType$Type;
import com.yandex.go.shortcuts.experiments.OrderShortcutsParamsExperiment;
import defpackage.abf0;
import defpackage.eaf0;
import defpackage.h3y;
import defpackage.hof0;
import defpackage.itx;
import defpackage.jst;
import defpackage.m8f0;
import defpackage.maf0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o3s0;
import defpackage.q9f0;
import defpackage.qaf0;
import defpackage.qmp;
import defpackage.s680;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uaf0;
import defpackage.ul51;
import defpackage.unr0;
import defpackage.uyj;
import defpackage.zaf0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes8.dex */
public final class m {
    public final h3y a;
    public final m8f0 b;
    public final s680 c;
    public final qmp d;
    public final itx e;
    public final q9f0 f;
    public final o3s0 g;
    public final maf0 h;
    public final abf0 i;
    public final hof0 j;
    public final tt2 k;

    public m(h3y h3yVar, m8f0 m8f0Var, s680 s680Var, qmp qmpVar, itx itxVar, q9f0 q9f0Var, o3s0 o3s0Var, maf0 maf0Var, abf0 abf0Var, hof0 hof0Var, tt2 tt2Var) {
        this.a = h3yVar;
        this.b = m8f0Var;
        this.c = s680Var;
        this.d = qmpVar;
        this.e = itxVar;
        this.f = q9f0Var;
        this.g = o3s0Var;
        this.h = maf0Var;
        this.i = abf0Var;
        this.j = hof0Var;
        this.k = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(m mVar, qaf0 qaf0Var, ContinuationImpl continuationImpl) {
        ProductsInteractorImpl$updateScreenShortcutsFlow$1 productsInteractorImpl$updateScreenShortcutsFlow$1;
        int i;
        uaf0 uaf0Var;
        uaf0 uaf0Var2;
        mVar.getClass();
        if (continuationImpl instanceof ProductsInteractorImpl$updateScreenShortcutsFlow$1) {
            productsInteractorImpl$updateScreenShortcutsFlow$1 = (ProductsInteractorImpl$updateScreenShortcutsFlow$1) continuationImpl;
            int i2 = productsInteractorImpl$updateScreenShortcutsFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsInteractorImpl$updateScreenShortcutsFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productsInteractorImpl$updateScreenShortcutsFlow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsInteractorImpl$updateScreenShortcutsFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    uaf0Var = (uaf0) qaf0Var.a;
                    if (ProductsScreenType$Type.ON_MULTI_ORDER == uaf0Var.e) {
                        productsInteractorImpl$updateScreenShortcutsFlow$1.L$0 = null;
                        productsInteractorImpl$updateScreenShortcutsFlow$1.L$1 = uaf0Var;
                        productsInteractorImpl$updateScreenShortcutsFlow$1.L$2 = uaf0Var;
                        productsInteractorImpl$updateScreenShortcutsFlow$1.label = 1;
                        obj = mVar.d(productsInteractorImpl$updateScreenShortcutsFlow$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                        uaf0Var2 = uaf0Var;
                    }
                    return uaf0Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uaf0Var2 = (uaf0) productsInteractorImpl$updateScreenShortcutsFlow$1.L$2;
                uaf0Var = (uaf0) productsInteractorImpl$updateScreenShortcutsFlow$1.L$1;
                kotlin.b.b(obj);
                uaf0Var2.f = ((Boolean) obj).booleanValue();
                return uaf0Var;
            }
        }
        productsInteractorImpl$updateScreenShortcutsFlow$1 = new ProductsInteractorImpl$updateScreenShortcutsFlow$1(mVar, continuationImpl);
        Object obj3 = productsInteractorImpl$updateScreenShortcutsFlow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsInteractorImpl$updateScreenShortcutsFlow$1.label;
        if (i != 0) {
        }
        uaf0Var2.f = ((Boolean) obj3).booleanValue();
        return uaf0Var;
    }

    public final Object b(qaf0 qaf0Var, eaf0 eaf0Var, ContinuationImpl continuationImpl) {
        List d = eaf0Var.d();
        Address a = eaf0Var.a();
        zzs B = a.B();
        zaf0 c = this.i.c(qaf0Var);
        if (eaf0Var.e() || !eaf0Var.equals(c.c)) {
            c.c = eaf0Var;
            return c(qaf0Var, d, a, eaf0Var.g(), B, continuationImpl);
        }
        jst.e.getClass();
        return zy11.a;
    }

    public final Object c(qaf0 qaf0Var, List list, Address address, zzs zzsVar, zzs zzsVar2, ContinuationImpl continuationImpl) {
        ((ul51) this.d).getClass();
        abf0 abf0Var = this.i;
        zzs zzsVar3 = zzsVar;
        zaf0 c = abf0Var.c(qaf0Var);
        if (zzsVar3 == null) {
            zzsVar3 = zzsVar2;
        }
        unr0.C(new Object[]{address}, 1, "SC: start fetching products after pin drop - %s", jst.e);
        tpr e = kotlinx.coroutines.flow.e.e(new kotlinx.coroutines.flow.n(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.T(new i(abf0Var.a, qaf0Var), 1), new ProductsInteractorImpl$fetchProducts$5(this, qaf0Var, null)), new ProductsInteractorImpl$fetchProducts$$inlined$flatMapLatest$1(null, this, zzsVar2, list)), new ProductsInteractorImpl$fetchProducts$7(this, c, null)), 2, BufferOverflow.DROP_OLDEST);
        this.k.getClass();
        sjh sjhVar = uyj.a;
        return new kotlinx.coroutines.flow.o(new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.F(e, mdh.b), new ProductsInteractorImpl$fetchProducts$8(this, c, null)), new ProductsInteractorImpl$fetchProducts$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new j(this, qaf0Var, address, c, zzsVar3), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ProductsInteractorImpl$supportAllShortcuts$1 productsInteractorImpl$supportAllShortcuts$1;
        int i;
        if (continuationImpl instanceof ProductsInteractorImpl$supportAllShortcuts$1) {
            productsInteractorImpl$supportAllShortcuts$1 = (ProductsInteractorImpl$supportAllShortcuts$1) continuationImpl;
            int i2 = productsInteractorImpl$supportAllShortcuts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsInteractorImpl$supportAllShortcuts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productsInteractorImpl$supportAllShortcuts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsInteractorImpl$supportAllShortcuts$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    productsInteractorImpl$supportAllShortcuts$1.label = 1;
                    obj = this.c.a.b(productsInteractorImpl$supportAllShortcuts$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                OrderShortcutsParamsExperiment.ShortcutsParams shortcutsParams = ((OrderShortcutsParamsExperiment) obj).b;
                return Boolean.valueOf(shortcutsParams == null && shortcutsParams.b);
            }
        }
        productsInteractorImpl$supportAllShortcuts$1 = new ProductsInteractorImpl$supportAllShortcuts$1(this, continuationImpl);
        Object obj2 = productsInteractorImpl$supportAllShortcuts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsInteractorImpl$supportAllShortcuts$1.label;
        if (i != 0) {
        }
        OrderShortcutsParamsExperiment.ShortcutsParams shortcutsParams2 = ((OrderShortcutsParamsExperiment) obj2).b;
        return Boolean.valueOf(shortcutsParams2 == null && shortcutsParams2.b);
    }
}
