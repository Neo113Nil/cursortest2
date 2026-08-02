package com.yandex.go.taxi.tariffs.interactor;

import android.net.Uri;
import defpackage.b8r;
import defpackage.c8r;
import defpackage.jl40;
import defpackage.mi31;
import defpackage.ni31;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.urw;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes14.dex */
public final class h {
    public final c8r a;
    public final b8r b;
    public final ru.yandex.taxi.personalstate.domain.interactor.j c;

    public h(c8r c8rVar, b8r b8rVar, ru.yandex.taxi.personalstate.domain.interactor.j jVar) {
        this.a = c8rVar;
        this.b = b8rVar;
        this.c = jVar;
    }

    public static /* synthetic */ Object c(h hVar, String str, String str2, String str3, String str4, ContinuationImpl continuationImpl, int i) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        return hVar.b(str, str2, str3, str4, continuationImpl);
    }

    public final Object a(Uri uri, String str, SuspendLambda suspendLambda) {
        String queryParameter = uri.getQueryParameter("tariffClass");
        if (queryParameter == null || queryParameter.length() == 0) {
            queryParameter = uri.getQueryParameter("class");
        }
        return c(this, queryParameter, uri.getQueryParameter("vertical"), uri.getQueryParameter("alternative"), str, suspendLambda, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        FetchTariffFromDeeplinkInteractorImpl$findTariff$1 fetchTariffFromDeeplinkInteractorImpl$findTariff$1;
        int i;
        mi31 f;
        String str5;
        List list;
        pex0 pex0Var;
        ru.yandex.taxi.tariffs.model.a aVar;
        pex0 c;
        if (continuationImpl instanceof FetchTariffFromDeeplinkInteractorImpl$findTariff$1) {
            fetchTariffFromDeeplinkInteractorImpl$findTariff$1 = (FetchTariffFromDeeplinkInteractorImpl$findTariff$1) continuationImpl;
            int i2 = fetchTariffFromDeeplinkInteractorImpl$findTariff$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchTariffFromDeeplinkInteractorImpl$findTariff$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchTariffFromDeeplinkInteractorImpl$findTariff$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchTariffFromDeeplinkInteractorImpl$findTariff$1.label;
                mi31 mi31Var = null;
                c8r c8rVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str6 = str2 == null ? "" : str2;
                    if (str4 == null || str2 != null) {
                        str4 = null;
                    }
                    if ((str4 == null || (f = f(str, str4)) == null) && (f = f(str, str2)) == null && (f = c8rVar.b.e(str, str6, ((com.yandex.go.taxi.tariffs.internal.repository.k) c8rVar.a).j().a)) == null) {
                        fetchTariffFromDeeplinkInteractorImpl$findTariff$1.L$0 = str;
                        fetchTariffFromDeeplinkInteractorImpl$findTariff$1.L$1 = null;
                        fetchTariffFromDeeplinkInteractorImpl$findTariff$1.L$2 = null;
                        fetchTariffFromDeeplinkInteractorImpl$findTariff$1.L$3 = str3;
                        fetchTariffFromDeeplinkInteractorImpl$findTariff$1.L$4 = null;
                        fetchTariffFromDeeplinkInteractorImpl$findTariff$1.L$5 = str6;
                        fetchTariffFromDeeplinkInteractorImpl$findTariff$1.L$6 = null;
                        fetchTariffFromDeeplinkInteractorImpl$findTariff$1.label = 1;
                        Object e = e(str2, fetchTariffFromDeeplinkInteractorImpl$findTariff$1);
                        if (e == obj2) {
                            return obj2;
                        }
                        String str7 = str6;
                        obj = e;
                        str5 = str7;
                        list = null;
                    }
                    if (str3 != null) {
                        if (f != null && (pex0Var = f.a) != null && (aVar = pex0Var.t0) != null && (c = aVar.c(str3)) != null) {
                            mi31Var = mi31.a(f, c, null, 30);
                        }
                        if (mi31Var != null) {
                            return mi31Var;
                        }
                    }
                    return f;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str5 = (String) fetchTariffFromDeeplinkInteractorImpl$findTariff$1.L$5;
                str3 = (String) fetchTariffFromDeeplinkInteractorImpl$findTariff$1.L$3;
                List list2 = (List) fetchTariffFromDeeplinkInteractorImpl$findTariff$1.L$2;
                String str8 = (String) fetchTariffFromDeeplinkInteractorImpl$findTariff$1.L$0;
                kotlin.b.b(obj);
                list = list2;
                str = str8;
                f = (mi31) obj;
                if (f == null) {
                    f = c8rVar.a(str, str5, list);
                }
                if (str3 != null) {
                }
                return f;
            }
        }
        fetchTariffFromDeeplinkInteractorImpl$findTariff$1 = new FetchTariffFromDeeplinkInteractorImpl$findTariff$1(this, continuationImpl);
        Object obj3 = fetchTariffFromDeeplinkInteractorImpl$findTariff$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchTariffFromDeeplinkInteractorImpl$findTariff$1.label;
        mi31 mi31Var2 = null;
        c8r c8rVar2 = this.a;
        if (i != 0) {
        }
        f = (mi31) obj3;
        if (f == null) {
        }
        if (str3 != null) {
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        FetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1 fetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1;
        int i;
        if (continuationImpl instanceof FetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1) {
            fetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1 = (FetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1) continuationImpl;
            int i2 = fetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1.L$0 = str;
                    fetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1.label = 1;
                    obj = this.c.d(fetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) fetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1.L$0;
                    kotlin.b.b(obj);
                }
                for (Object obj2 : (Iterable) obj) {
                    if (jl40.l(((ni31) obj2).b, str)) {
                        return obj2;
                    }
                }
                return null;
            }
        }
        fetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1 = new FetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1(this, continuationImpl);
        Object obj3 = fetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchTariffFromDeeplinkInteractorImpl$findTariffClassFromPersonalState$1.label;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        FetchTariffFromDeeplinkInteractorImpl$findTariffForVerticalFromPersonalState$1 fetchTariffFromDeeplinkInteractorImpl$findTariffForVerticalFromPersonalState$1;
        int i;
        List list;
        ni31 ni31Var;
        if (continuationImpl instanceof FetchTariffFromDeeplinkInteractorImpl$findTariffForVerticalFromPersonalState$1) {
            fetchTariffFromDeeplinkInteractorImpl$findTariffForVerticalFromPersonalState$1 = (FetchTariffFromDeeplinkInteractorImpl$findTariffForVerticalFromPersonalState$1) continuationImpl;
            int i2 = fetchTariffFromDeeplinkInteractorImpl$findTariffForVerticalFromPersonalState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchTariffFromDeeplinkInteractorImpl$findTariffForVerticalFromPersonalState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchTariffFromDeeplinkInteractorImpl$findTariffForVerticalFromPersonalState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchTariffFromDeeplinkInteractorImpl$findTariffForVerticalFromPersonalState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fetchTariffFromDeeplinkInteractorImpl$findTariffForVerticalFromPersonalState$1.L$0 = null;
                    fetchTariffFromDeeplinkInteractorImpl$findTariffForVerticalFromPersonalState$1.L$1 = null;
                    fetchTariffFromDeeplinkInteractorImpl$findTariffForVerticalFromPersonalState$1.label = 1;
                    obj = d(str, fetchTariffFromDeeplinkInteractorImpl$findTariffForVerticalFromPersonalState$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    list = null;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) fetchTariffFromDeeplinkInteractorImpl$findTariffForVerticalFromPersonalState$1.L$1;
                    kotlin.b.b(obj);
                }
                ni31Var = (ni31) obj;
                if (ni31Var != null) {
                    return null;
                }
                String str2 = ni31Var.a;
                String str3 = ni31Var.b;
                if (str2 == null) {
                    return null;
                }
                return this.b.c(str2, str3, list);
            }
        }
        fetchTariffFromDeeplinkInteractorImpl$findTariffForVerticalFromPersonalState$1 = new FetchTariffFromDeeplinkInteractorImpl$findTariffForVerticalFromPersonalState$1(this, continuationImpl);
        Object obj3 = fetchTariffFromDeeplinkInteractorImpl$findTariffForVerticalFromPersonalState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchTariffFromDeeplinkInteractorImpl$findTariffForVerticalFromPersonalState$1.label;
        if (i != 0) {
        }
        ni31Var = (ni31) obj3;
        if (ni31Var != null) {
        }
    }

    public final mi31 f(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        mi31 c = str == null ? null : this.b.c(str, str2, null);
        if (c != null) {
            return c;
        }
        if (str == null) {
            return null;
        }
        c8r c8rVar = this.a;
        urw urwVar = c8rVar.b;
        List list = ((com.yandex.go.taxi.tariffs.internal.repository.k) c8rVar.a).j().a;
        urwVar.getClass();
        return urw.f(str, str2, list);
    }
}
