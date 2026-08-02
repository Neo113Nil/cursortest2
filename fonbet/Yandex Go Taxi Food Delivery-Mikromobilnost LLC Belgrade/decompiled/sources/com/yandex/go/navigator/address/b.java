package com.yandex.go.navigator.address;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import defpackage.dd61;
import defpackage.ne50;
import defpackage.ny61;
import defpackage.pe50;
import defpackage.tcc;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class b {
    public final ru.yandex.taxi.deeplinks.e a;
    public final com.yandex.go.route.interactor.b b;

    public b(ru.yandex.taxi.deeplinks.e eVar, com.yandex.go.route.interactor.b bVar) {
        this.a = eVar;
        this.b = bVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(1:29))|12|(4:14|(2:17|15)|18|19)|21|22))|33|6|7|(0)(0)|12|(0)|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        defpackage.jst.e.getClass();
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[Catch: all -> 0x0087, CancellationException -> 0x008f, TryCatch #2 {CancellationException -> 0x008f, all -> 0x0087, blocks: (B:11:0x002a, B:12:0x004f, B:14:0x005b, B:15:0x0071, B:17:0x0077, B:19:0x0083, B:27:0x0038), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(pe50 pe50Var, ContinuationImpl continuationImpl) {
        NavigatorPreorderRouteUpdater$updateByNavigatorRoute$1 navigatorPreorderRouteUpdater$updateByNavigatorRoute$1;
        int i;
        ZoneAddress a;
        com.yandex.go.route.interactor.b bVar = this.b;
        if (continuationImpl instanceof NavigatorPreorderRouteUpdater$updateByNavigatorRoute$1) {
            navigatorPreorderRouteUpdater$updateByNavigatorRoute$1 = (NavigatorPreorderRouteUpdater$updateByNavigatorRoute$1) continuationImpl;
            int i2 = navigatorPreorderRouteUpdater$updateByNavigatorRoute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorPreorderRouteUpdater$updateByNavigatorRoute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorPreorderRouteUpdater$updateByNavigatorRoute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorPreorderRouteUpdater$updateByNavigatorRoute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.deeplinks.e eVar = this.a;
                    zzs B = pe50Var.a.c.B();
                    navigatorPreorderRouteUpdater$updateByNavigatorRoute$1.L$0 = pe50Var;
                    navigatorPreorderRouteUpdater$updateByNavigatorRoute$1.label = 1;
                    obj = eVar.e(B, null, false, false, navigatorPreorderRouteUpdater$updateByNavigatorRoute$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pe50Var = (pe50) navigatorPreorderRouteUpdater$updateByNavigatorRoute$1.L$0;
                    kotlin.b.b(obj);
                }
                a = ((dd61) obj).a();
                if (a.a()) {
                    bVar.m(a, null);
                    List list = pe50Var.b;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ne50) it.next()).c);
                    }
                    bVar.o(arrayList);
                }
                return zy11.a;
            }
        }
        navigatorPreorderRouteUpdater$updateByNavigatorRoute$1 = new NavigatorPreorderRouteUpdater$updateByNavigatorRoute$1(this, continuationImpl);
        Object obj2 = navigatorPreorderRouteUpdater$updateByNavigatorRoute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorPreorderRouteUpdater$updateByNavigatorRoute$1.label;
        if (i != 0) {
        }
        a = ((dd61) obj2).a();
        if (a.a()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Address address, ContinuationImpl continuationImpl) {
        NavigatorPreorderRouteUpdater$updateSourceAddress$1 navigatorPreorderRouteUpdater$updateSourceAddress$1;
        int i;
        ZoneAddress a;
        if (continuationImpl instanceof NavigatorPreorderRouteUpdater$updateSourceAddress$1) {
            navigatorPreorderRouteUpdater$updateSourceAddress$1 = (NavigatorPreorderRouteUpdater$updateSourceAddress$1) continuationImpl;
            int i2 = navigatorPreorderRouteUpdater$updateSourceAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorPreorderRouteUpdater$updateSourceAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorPreorderRouteUpdater$updateSourceAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorPreorderRouteUpdater$updateSourceAddress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zzs B = address.B();
                    navigatorPreorderRouteUpdater$updateSourceAddress$1.L$0 = null;
                    navigatorPreorderRouteUpdater$updateSourceAddress$1.label = 1;
                    obj = this.a.e(B, null, false, false, navigatorPreorderRouteUpdater$updateSourceAddress$1);
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
                a = ((dd61) obj).a();
                if (a.a()) {
                    this.b.m(a, null);
                }
                return zy11.a;
            }
        }
        navigatorPreorderRouteUpdater$updateSourceAddress$1 = new NavigatorPreorderRouteUpdater$updateSourceAddress$1(this, continuationImpl);
        Object obj2 = navigatorPreorderRouteUpdater$updateSourceAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorPreorderRouteUpdater$updateSourceAddress$1.label;
        if (i != 0) {
        }
        a = ((dd61) obj2).a();
        if (a.a()) {
        }
        return zy11.a;
    }
}
