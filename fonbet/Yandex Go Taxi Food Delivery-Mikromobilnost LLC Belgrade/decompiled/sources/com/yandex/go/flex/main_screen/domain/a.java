package com.yandex.go.flex.main_screen.domain;

import com.yandex.go.address.models.Address;
import com.yandex.go.shortcuts.dto.request.ProductsParam;
import com.yandex.go.shortcuts.dto.request.ProductsParamsState;
import com.yandex.go.shortcuts.impl.repository.s;
import defpackage.d5v0;
import defpackage.e5v0;
import defpackage.kx70;
import defpackage.ny61;
import defpackage.o5t;
import defpackage.ofp0;
import defpackage.pf10;
import defpackage.scc;
import defpackage.tcc;
import defpackage.uaf0;
import defpackage.uj31;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.yaf0;
import defpackage.ybt;
import defpackage.zwa1;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a implements ybt {
    public final wnt a;
    public final s b;
    public final o5t c;
    public final com.yandex.go.route.interactor.b d;

    public a(wnt wntVar, s sVar, o5t o5tVar, com.yandex.go.route.interactor.b bVar) {
        this.a = wntVar;
        this.b = sVar;
        this.c = o5tVar;
        this.d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zzs zzsVar, List list, ContinuationImpl continuationImpl) {
        GetProductsParamsInteractorImpl$execute$1 getProductsParamsInteractorImpl$execute$1;
        int i;
        zzs zzsVar2;
        ProductsParam.Shortcuts shortcuts;
        if (continuationImpl instanceof GetProductsParamsInteractorImpl$execute$1) {
            getProductsParamsInteractorImpl$execute$1 = (GetProductsParamsInteractorImpl$execute$1) continuationImpl;
            int i2 = getProductsParamsInteractorImpl$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getProductsParamsInteractorImpl$execute$1.label = i2 - Integer.MIN_VALUE;
                GetProductsParamsInteractorImpl$execute$1 getProductsParamsInteractorImpl$execute$12 = getProductsParamsInteractorImpl$execute$1;
                Object obj = getProductsParamsInteractorImpl$execute$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getProductsParamsInteractorImpl$execute$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List a = this.d.c().a();
                    ProductsParam.Shortcuts shortcuts2 = new ProductsParam.Shortcuts(ProductsParam.i, 510);
                    List list2 = a;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    int i3 = 0;
                    for (Object obj2 : list2) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            scc.m();
                            throw null;
                        }
                        Address address = (Address) obj2;
                        zzs B = address.B();
                        String uri = address.getUri();
                        if (uri == null) {
                            uri = "";
                        }
                        String c2 = address.c2();
                        d5v0 d5v0Var = e5v0.Companion;
                        int size = a.size();
                        d5v0Var.getClass();
                        arrayList.add(new e5v0(B, uri, c2, d5v0.a(i3, size), address.J1(), address.D1()));
                        i3 = i4;
                    }
                    uaf0 uaf0Var = yaf0.b;
                    List list3 = list;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(zwa1.b((kx70) it.next()));
                    }
                    ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((kx70) it2.next()).d());
                    }
                    zzsVar2 = zzsVar;
                    getProductsParamsInteractorImpl$execute$12.L$0 = zzsVar2;
                    getProductsParamsInteractorImpl$execute$12.L$1 = null;
                    getProductsParamsInteractorImpl$execute$12.L$2 = null;
                    getProductsParamsInteractorImpl$execute$12.L$3 = shortcuts2;
                    getProductsParamsInteractorImpl$execute$12.label = 1;
                    obj = this.b.c(arrayList, arrayList3, arrayList2, uaf0Var, getProductsParamsInteractorImpl$execute$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    shortcuts = shortcuts2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ProductsParam.Shortcuts shortcuts3 = (ProductsParam.Shortcuts) getProductsParamsInteractorImpl$execute$12.L$3;
                    zzs zzsVar3 = (zzs) getProductsParamsInteractorImpl$execute$12.L$0;
                    kotlin.b.b(obj);
                    shortcuts = shortcuts3;
                    zzsVar2 = zzsVar3;
                }
                return ((xnt) this.a).f(new ProductsParam(zzsVar2, (ProductsParamsState) obj, shortcuts, new pf10(ofp0.c, ofp0.b, ofp0.a), uj31.a, this.c.a(), 64), ProductsParam.Companion.serializer());
            }
        }
        getProductsParamsInteractorImpl$execute$1 = new GetProductsParamsInteractorImpl$execute$1(this, continuationImpl);
        GetProductsParamsInteractorImpl$execute$1 getProductsParamsInteractorImpl$execute$122 = getProductsParamsInteractorImpl$execute$1;
        Object obj3 = getProductsParamsInteractorImpl$execute$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getProductsParamsInteractorImpl$execute$122.label;
        if (i != 0) {
        }
        return ((xnt) this.a).f(new ProductsParam(zzsVar2, (ProductsParamsState) obj3, shortcuts, new pf10(ofp0.c, ofp0.b, ofp0.a), uj31.a, this.c.a(), 64), ProductsParam.Companion.serializer());
    }
}
