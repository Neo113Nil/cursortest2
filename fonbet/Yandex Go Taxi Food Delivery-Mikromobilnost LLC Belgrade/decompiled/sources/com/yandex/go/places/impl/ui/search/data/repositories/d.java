package com.yandex.go.places.impl.ui.search.data.repositories;

import android.net.Uri;
import android.util.LruCache;
import defpackage.c2v0;
import defpackage.ctp0;
import defpackage.cwj;
import defpackage.dg80;
import defpackage.evu0;
import defpackage.gj80;
import defpackage.h73;
import defpackage.hj80;
import defpackage.hwj;
import defpackage.ij80;
import defpackage.jst;
import defpackage.kup0;
import defpackage.kwj;
import defpackage.kwp0;
import defpackage.l9e;
import defpackage.lg80;
import defpackage.lwp0;
import defpackage.lx4;
import defpackage.ny61;
import defpackage.owp0;
import defpackage.pvp0;
import defpackage.qi80;
import defpackage.ri80;
import defpackage.rl2;
import defpackage.rwp0;
import defpackage.si80;
import defpackage.ti80;
import defpackage.tyo0;
import defpackage.uc61;
import defpackage.usp0;
import defpackage.uyo0;
import defpackage.vsp0;
import defpackage.w8v0;
import defpackage.wbc0;
import defpackage.wsp0;
import defpackage.wtp0;
import defpackage.wwp0;
import defpackage.xby;
import defpackage.xsp0;
import defpackage.ysp0;
import defpackage.yw01;
import defpackage.z8v0;
import defpackage.zsp0;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.persuggest.source.h;
import ru.yandex.taxi.persuggest.source.m;

/* loaded from: classes13.dex */
public final class d {
    public final m a;
    public final h b;
    public final owp0 c;
    public final com.yandex.go.places.impl.analytics.a d;
    public final lg80 e;
    public final LruCache f = new LruCache(20);

    public d(m mVar, h hVar, owp0 owp0Var, com.yandex.go.places.impl.analytics.a aVar, lg80 lg80Var) {
        this.a = mVar;
        this.b = hVar;
        this.c = owp0Var;
        this.d = aVar;
        this.e = lg80Var;
    }

    public static zsp0 b(rl2 rl2Var, w8v0 w8v0Var) {
        FormattedText formattedText = null;
        if (rl2Var instanceof kwj) {
            kwj kwjVar = (kwj) rl2Var;
            String str = kwjVar.a;
            String str2 = kwjVar.c;
            FormattedText formattedText2 = kwjVar.b;
            if (formattedText2 != null) {
                formattedText = formattedText2;
            } else if (w8v0Var != null) {
                formattedText = w8v0Var.getA();
            }
            return new wsp0(str, str2, formattedText);
        }
        if (rl2Var instanceof cwj) {
            cwj cwjVar = (cwj) rl2Var;
            String str3 = cwjVar.b;
            String str4 = cwjVar.a;
            String str5 = cwjVar.c;
            ti80 qi80Var = (str3 == null || !l9e.f(str3) || str4 == null || evu0.J(str4)) ? (str3 == null || !l9e.f(str3)) ? (str4 == null || evu0.J(str4)) ? null : new qi80(str4, str5) : new ri80(str3, str5) : new si80(str3, str4, str5);
            if (qi80Var != null) {
                return new vsp0(qi80Var);
            }
        } else if (rl2Var instanceof hwj) {
            String str6 = ((hwj) rl2Var).a;
            if (!evu0.J(str6)) {
                return new usp0(Uri.parse(str6));
            }
        } else if (rl2Var instanceof ctp0) {
            if (w8v0Var instanceof z8v0) {
                z8v0 z8v0Var = (z8v0) w8v0Var;
                return new xsp0(z8v0Var.h, z8v0Var.e);
            }
        } else if (rl2Var instanceof c2v0) {
            return new ysp0(((c2v0) rl2Var).a);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(wtp0 wtp0Var, ContinuationImpl continuationImpl) {
        SearchOrganizationRepositories$getData$1 searchOrganizationRepositories$getData$1;
        int i;
        Throwable th;
        String str;
        RoutePointType routePointType;
        String str2;
        uc61 uc61Var;
        List s;
        lg80 lg80Var = this.e;
        try {
            try {
                if (continuationImpl instanceof SearchOrganizationRepositories$getData$1) {
                    searchOrganizationRepositories$getData$1 = (SearchOrganizationRepositories$getData$1) continuationImpl;
                    int i2 = searchOrganizationRepositories$getData$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        searchOrganizationRepositories$getData$1.label = i2 - Integer.MIN_VALUE;
                        SearchOrganizationRepositories$getData$1 searchOrganizationRepositories$getData$12 = searchOrganizationRepositories$getData$1;
                        Object obj = searchOrganizationRepositories$getData$12.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = searchOrganizationRepositories$getData$12.label;
                        LruCache lruCache = this.f;
                        com.yandex.go.places.impl.analytics.a aVar = this.d;
                        if (i != 0) {
                            kotlin.b.b(obj);
                            String obj2 = evu0.k0(wtp0Var.a()).toString();
                            kwp0 kwp0Var = (kwp0) lruCache.get(obj2);
                            if (kwp0Var != null) {
                                aVar.m(kwp0Var.b, obj2);
                                return kwp0Var;
                            }
                            try {
                                String str3 = lg80Var instanceof dg80 ? ((dg80) lg80Var).b : null;
                                if (str3 == null) {
                                    str3 = RoutePointType.DISCOVERY_ORGANIZATION.getType();
                                }
                                String str4 = str3;
                                ij80 a = lg80Var.a();
                                if (a instanceof gj80) {
                                    routePointType = ((gj80) a).a == 0 ? RoutePointType.POINT_A : RoutePointType.POINT_B;
                                } else {
                                    if (!(a instanceof hj80)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    routePointType = null;
                                }
                                if (routePointType == null) {
                                    routePointType = RoutePointType.POINT_B;
                                }
                                RoutePointType routePointType2 = routePointType;
                                if (evu0.J(obj2)) {
                                    m mVar = this.a;
                                    searchOrganizationRepositories$getData$12.L$0 = null;
                                    searchOrganizationRepositories$getData$12.L$1 = obj2;
                                    searchOrganizationRepositories$getData$12.L$2 = null;
                                    searchOrganizationRepositories$getData$12.L$3 = null;
                                    searchOrganizationRepositories$getData$12.L$4 = null;
                                    searchOrganizationRepositories$getData$12.label = 1;
                                    obj = mVar.b(routePointType2, str4, searchOrganizationRepositories$getData$12);
                                    if (obj != coroutineSingletons) {
                                        str2 = obj2;
                                        uc61Var = (uc61) obj;
                                    }
                                } else {
                                    h hVar = this.b;
                                    String c = ((rwp0) this.c.a.getValue()).c();
                                    searchOrganizationRepositories$getData$12.L$0 = null;
                                    searchOrganizationRepositories$getData$12.L$1 = obj2;
                                    searchOrganizationRepositories$getData$12.L$2 = null;
                                    searchOrganizationRepositories$getData$12.L$3 = null;
                                    searchOrganizationRepositories$getData$12.L$4 = null;
                                    searchOrganizationRepositories$getData$12.label = 2;
                                    obj = hVar.c(c, obj2, routePointType2, str4, searchOrganizationRepositories$getData$12);
                                    if (obj != coroutineSingletons) {
                                        str2 = obj2;
                                        uc61Var = (uc61) obj;
                                    }
                                }
                                return coroutineSingletons;
                            } catch (Throwable th2) {
                                th = th2;
                                str = obj2;
                                xby.l(jst.e, "ORGANIZATIONS_DISCOVERY_ERROR", null, th, "ORGANIZATIONS_DISCOVERY_SEARCH_GET_DATA", 2);
                                aVar.getClass();
                                String n = com.yandex.go.places.impl.analytics.a.n(str);
                                i d = ((j) ((lx4) aVar.a)).d("Discovery.PlacesSearch.LoadingFailed");
                                d.d("type", n);
                                d.d("search_query", str);
                                d.d("source", ((wbc0) aVar.b).a().a());
                                d.m();
                                return new lwp0(str);
                            }
                        }
                        if (i == 1) {
                            str2 = (String) searchOrganizationRepositories$getData$12.L$1;
                            kotlin.b.b(obj);
                            uc61Var = (uc61) obj;
                        } else {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str2 = (String) searchOrganizationRepositories$getData$12.L$1;
                            kotlin.b.b(obj);
                            uc61Var = (uc61) obj;
                        }
                        s = kotlin.sequences.b.s(kotlin.sequences.b.i(new yw01(kotlin.sequences.b.i(kotlin.sequences.a.c(kotlin.sequences.b.o(kotlin.sequences.b.g(new h73(1, kotlin.collections.a.M(uc61Var.a)), pvp0.a), new tyo0(13)))), new uyo0(14, this))));
                        if (!s.isEmpty()) {
                            return new lwp0(str2);
                        }
                        Object b0 = kotlin.collections.a.b0(s);
                        kup0 kup0Var = b0 instanceof kup0 ? (kup0) b0 : null;
                        if (kup0Var != null) {
                            kup0Var.e = false;
                        }
                        wwp0 wwp0Var = new wwp0(s);
                        kwp0 kwp0Var2 = new kwp0(wwp0Var, str2);
                        lruCache.put(str2, kwp0Var2);
                        aVar.m(wwp0Var, str2);
                        return kwp0Var2;
                    }
                }
                if (i != 0) {
                }
                s = kotlin.sequences.b.s(kotlin.sequences.b.i(new yw01(kotlin.sequences.b.i(kotlin.sequences.a.c(kotlin.sequences.b.o(kotlin.sequences.b.g(new h73(1, kotlin.collections.a.M(uc61Var.a)), pvp0.a), new tyo0(13)))), new uyo0(14, this))));
                if (!s.isEmpty()) {
                }
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th3) {
            th = th3;
            str = lg80Var;
        }
        searchOrganizationRepositories$getData$1 = new SearchOrganizationRepositories$getData$1(this, continuationImpl);
        SearchOrganizationRepositories$getData$1 searchOrganizationRepositories$getData$122 = searchOrganizationRepositories$getData$1;
        Object obj3 = searchOrganizationRepositories$getData$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchOrganizationRepositories$getData$122.label;
        LruCache lruCache2 = this.f;
        com.yandex.go.places.impl.analytics.a aVar2 = this.d;
    }
}
