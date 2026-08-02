package com.yandex.go.superapp.impl.delegate;

import com.yandex.go.shortcuts.experiments.OrderShortcutsParamsExperiment;
import com.yandex.go.superapp.model.Action;
import com.yandex.go.superapp.order.multi.old.provider.g;
import defpackage.d9n;
import defpackage.evu0;
import defpackage.f0t;
import defpackage.h1p;
import defpackage.i0t;
import defpackage.l3p;
import defpackage.lgn;
import defpackage.m3p;
import defpackage.n3p;
import defpackage.ny61;
import defpackage.o3p;
import defpackage.rcc;
import defpackage.v3x;
import defpackage.v770;
import defpackage.vmx;
import defpackage.wl40;
import defpackage.wls;
import defpackage.wsv0;
import defpackage.y9w0;
import defpackage.zy11;
import defpackage.zzs;
import java.io.Serializable;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.appdelegates.SupportedOrderType;
import ru.yandex.taxi.eatskit.dto.ExternalServiceData;
import ru.yandex.taxi.superapp.address.j;

/* loaded from: classes14.dex */
public final class a {
    public final y9w0 a;
    public final j b;
    public final com.yandex.go.superapp.impl.interactor.a c;

    public a(y9w0 y9w0Var, j jVar, com.yandex.go.superapp.impl.interactor.a aVar) {
        this.a = y9w0Var;
        this.b = jVar;
        this.c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(h1p h1pVar, wsv0 wsv0Var, lgn lgnVar, ContinuationImpl continuationImpl) {
        ExternalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1 externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1;
        int i;
        ListBuilder a;
        ExternalServiceData externalServiceData;
        String str;
        zzs zzsVar;
        ?? r11;
        ListBuilder listBuilder;
        Object failure;
        ListBuilder listBuilder2;
        i0t i0tVar;
        if (continuationImpl instanceof ExternalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1) {
            externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1 = (ExternalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1) continuationImpl;
            int i2 = externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1.label;
                f0t f0tVar = null;
                if (i != 0) {
                    b.b(obj);
                    a = rcc.a();
                    String str2 = wsv0Var.b;
                    if (str2 != null) {
                        if (evu0.J(str2)) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            try {
                                failure = (ExternalServiceData) vmx.a.a().b(ExternalServiceData.Companion.serializer(), str2);
                            } catch (Throwable th) {
                                failure = new Result.Failure(th);
                            }
                            Throwable a2 = Result.a(failure);
                            if (a2 != null) {
                                v3x.a.a(10, "ExternalServiceDeeplinkDataDelegateImpl", a2, "Push data convert error");
                            }
                            if (failure instanceof Result.Failure) {
                                failure = null;
                            }
                            externalServiceData = (ExternalServiceData) failure;
                            if (externalServiceData != null) {
                                a.add(new n3p(externalServiceData));
                            }
                            str = wsv0Var.c;
                            if (str != null && !evu0.J(str)) {
                                a.add(new m3p(str, lgnVar.b));
                            }
                            zzsVar = wsv0Var.d;
                            if (zzsVar != null) {
                                r11 = a;
                                listBuilder2 = a;
                                if (f0tVar != null) {
                                    listBuilder2.add(new l3p(f0tVar));
                                }
                                return ((ListBuilder) r11).j();
                            }
                            externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1.L$0 = null;
                            externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1.L$1 = null;
                            externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1.L$2 = null;
                            externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1.L$3 = a;
                            externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1.L$4 = a;
                            externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1.L$5 = null;
                            externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1.L$6 = null;
                            externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1.L$7 = null;
                            externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1.label = 1;
                            Object a3 = this.b.a(h1pVar, zzsVar, externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1);
                            if (a3 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            r11 = a;
                            obj = a3;
                            listBuilder = r11;
                        }
                    }
                    externalServiceData = null;
                    if (externalServiceData != null) {
                    }
                    str = wsv0Var.c;
                    if (str != null) {
                        a.add(new m3p(str, lgnVar.b));
                    }
                    zzsVar = wsv0Var.d;
                    if (zzsVar != null) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r10 = (List) externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1.L$4;
                    r11 = (List) externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1.L$3;
                    b.b(obj);
                    listBuilder = r10;
                }
                i0tVar = (i0t) obj;
                if (i0tVar == null) {
                    f0tVar = i0tVar.a;
                    listBuilder2 = listBuilder;
                    if (f0tVar != null) {
                    }
                    return ((ListBuilder) r11).j();
                }
                a = listBuilder;
                listBuilder2 = a;
                if (f0tVar != null) {
                }
                return ((ListBuilder) r11).j();
            }
        }
        externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1 = new ExternalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1(this, continuationImpl);
        Object obj2 = externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = externalServiceDeeplinkDataDelegateImpl$createAdditionalServiceActions$1.label;
        f0t f0tVar2 = null;
        if (i != 0) {
        }
        i0tVar = (i0t) obj2;
        if (i0tVar == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0115, code lost:
    
        if (r1.j() <= 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0129, code lost:
    
        if (r0.a == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(wsv0 wsv0Var, v770 v770Var, wls wlsVar, ContinuationImpl continuationImpl) {
        ExternalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1 externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1;
        int i;
        v770 v770Var2;
        wsv0 wsv0Var2;
        h1p h1pVar;
        wls wlsVar2;
        lgn lgnVar;
        lgn lgnVar2;
        wls wlsVar3;
        String str;
        h1p h1pVar2;
        v770 v770Var3;
        List list;
        y9w0 y9w0Var;
        d9n d9nVar;
        g gVar;
        o3p o3pVar;
        if (continuationImpl instanceof ExternalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1) {
            externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1 = (ExternalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1) continuationImpl;
            int i2 = externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.label;
                boolean z = true;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    h1p h1pVar3 = wsv0Var.a;
                    if (h1pVar3 != null) {
                        String value = h1pVar3.getValue();
                        externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$0 = wsv0Var;
                        v770Var2 = v770Var;
                        externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$1 = v770Var2;
                        externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$2 = wlsVar;
                        externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$3 = h1pVar3;
                        externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.label = 1;
                        Object a = this.c.a(value, externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1);
                        if (a != serializable) {
                            wsv0Var2 = wsv0Var;
                            h1pVar = h1pVar3;
                            obj = a;
                            wlsVar2 = wlsVar;
                        }
                        return serializable;
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str2 = (String) externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$5;
                    lgnVar2 = (lgn) externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$4;
                    h1pVar2 = (h1p) externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$3;
                    wlsVar3 = (wls) externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$2;
                    v770 v770Var4 = (v770) externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$1;
                    b.b(obj);
                    str = str2;
                    v770Var3 = v770Var4;
                    list = (List) obj;
                    y9w0Var = this.a;
                    if (str == null && !evu0.J(str) && lgnVar2.a) {
                        y9w0Var.getClass();
                        o3pVar = new o3p(lgnVar2.a ? Action.FORCE_RELATIVE_PATH : Action.SHOW_RELATIVE_PATH, v770Var3, null, str, list, 4);
                    } else {
                        y9w0Var.getClass();
                        String value2 = h1pVar2.getValue();
                        d9nVar = new d9n(value2);
                        gVar = y9w0Var.a;
                        if (g.f(gVar.a(), d9nVar)) {
                            wl40 a2 = gVar.a();
                            SupportedOrderType supportedOrderType = SupportedOrderType.TAXI;
                            if (!gVar.b.r()) {
                                if (!g.g(a2)) {
                                }
                            }
                            OrderShortcutsParamsExperiment.Param param = (OrderShortcutsParamsExperiment.Param) y9w0Var.b.a().d.get(value2);
                            if (param != null) {
                            }
                        }
                        z = false;
                        o3pVar = new o3p(!z ? Action.SHOW_SHOP : Action.NONE, v770Var3, null, null, list, 12);
                    }
                    wlsVar3.invoke(h1pVar2, o3pVar);
                    return zy11Var;
                }
                h1pVar = (h1p) externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$3;
                wlsVar2 = (wls) externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$2;
                v770Var2 = (v770) externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$1;
                wsv0Var2 = (wsv0) externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$0;
                b.b(obj);
                lgnVar = (lgn) obj;
                if (lgnVar != lgn.c) {
                    String str3 = wsv0Var2.c;
                    externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$0 = null;
                    externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$1 = v770Var2;
                    externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$2 = wlsVar2;
                    externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$3 = h1pVar;
                    externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$4 = lgnVar;
                    externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.L$5 = str3;
                    externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.label = 2;
                    Serializable a3 = a(h1pVar, wsv0Var2, lgnVar, externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1);
                    if (a3 != serializable) {
                        lgnVar2 = lgnVar;
                        obj = a3;
                        wlsVar3 = wlsVar2;
                        str = str3;
                        h1pVar2 = h1pVar;
                        v770Var3 = v770Var2;
                        list = (List) obj;
                        y9w0Var = this.a;
                        if (str == null) {
                        }
                        y9w0Var.getClass();
                        String value22 = h1pVar2.getValue();
                        d9nVar = new d9n(value22);
                        gVar = y9w0Var.a;
                        if (g.f(gVar.a(), d9nVar)) {
                        }
                        z = false;
                        o3pVar = new o3p(!z ? Action.SHOW_SHOP : Action.NONE, v770Var3, null, null, list, 12);
                        wlsVar3.invoke(h1pVar2, o3pVar);
                        return zy11Var;
                    }
                    return serializable;
                }
                return zy11Var;
            }
        }
        externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1 = new ExternalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1(this, continuationImpl);
        Object obj2 = externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = externalServiceDeeplinkDataDelegateImpl$processDeeplinkData$1.label;
        boolean z2 = true;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        lgnVar = (lgn) obj2;
        if (lgnVar != lgn.c) {
        }
        return zy11Var2;
    }
}
