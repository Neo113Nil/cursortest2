package com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.redirect;

import com.yandex.fintechsdk.data.config.api.model.RedirectionStrategy;
import defpackage.an11;
import defpackage.blp;
import defpackage.bsu;
import defpackage.fct;
import defpackage.imi0;
import defpackage.jgs;
import defpackage.jl40;
import defpackage.lmi0;
import defpackage.ny61;
import defpackage.omi0;
import defpackage.qoi0;
import defpackage.tcc;
import defpackage.yru;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a extends com.yandex.fintechsdk.core.network.api.request.a {
    public final jgs b;

    public a(jgs jgsVar) {
        super(0);
        this.b = jgsVar;
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object a(Object obj) {
        return new fct();
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object d(Object obj) {
        Object obj2;
        lmi0 lmi0Var = (lmi0) obj;
        Boolean bool = lmi0Var.d;
        List<bsu> list = lmi0Var.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (bsu bsuVar : list) {
            List list2 = bsuVar.a;
            int i = bsuVar.b;
            int i2 = bsuVar.c;
            String str = bsuVar.d;
            omi0 omi0Var = RedirectionStrategy.Companion;
            String str2 = bsuVar.e;
            omi0Var.getClass();
            Iterator<E> it = RedirectionStrategy.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((RedirectionStrategy) obj2).name(), str2)) {
                    break;
                }
            }
            RedirectionStrategy redirectionStrategy = (RedirectionStrategy) obj2;
            if (redirectionStrategy == null) {
                redirectionStrategy = RedirectionStrategy.UNKNOWN;
            }
            arrayList.add(new yru(list2, i, i2, str, redirectionStrategy));
        }
        List list3 = lmi0Var.a;
        ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((blp) it2.next()).a);
        }
        return new imi0(bool, arrayList, kotlin.collections.a.N0(arrayList2));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.fintechsdk.core.network.api.request.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(fct fctVar, ContinuationImpl continuationImpl) {
        GetRedirectionConfigRequester$executeRequest$1 getRedirectionConfigRequester$executeRequest$1;
        int i;
        if (continuationImpl instanceof GetRedirectionConfigRequester$executeRequest$1) {
            getRedirectionConfigRequester$executeRequest$1 = (GetRedirectionConfigRequester$executeRequest$1) continuationImpl;
            int i2 = getRedirectionConfigRequester$executeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getRedirectionConfigRequester$executeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getRedirectionConfigRequester$executeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getRedirectionConfigRequester$executeRequest$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                an11 e = qoi0.e(lmi0.class);
                getRedirectionConfigRequester$executeRequest$1.label = 1;
                jgs jgsVar = this.b;
                jgsVar.getClass();
                Object d = com.yandex.fintechsdk.core.network.impl.internal.network.a.d(jgsVar, fctVar, e, getRedirectionConfigRequester$executeRequest$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        getRedirectionConfigRequester$executeRequest$1 = new GetRedirectionConfigRequester$executeRequest$1(this, continuationImpl);
        Object obj2 = getRedirectionConfigRequester$executeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getRedirectionConfigRequester$executeRequest$1.label;
        if (i == 0) {
        }
    }
}
