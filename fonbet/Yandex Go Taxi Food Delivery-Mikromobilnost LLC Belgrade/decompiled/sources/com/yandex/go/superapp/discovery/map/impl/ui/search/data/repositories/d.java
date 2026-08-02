package com.yandex.go.superapp.discovery.map.impl.ui.search.data.repositories;

import android.net.Uri;
import android.util.LruCache;
import com.yandex.go.superapp.discovery.map.impl.analytics.generated.SuperMapAnalytics$SuperMapSearchType;
import defpackage.bxv0;
import defpackage.c2v0;
import defpackage.co40;
import defpackage.ctp0;
import defpackage.cwj;
import defpackage.evu0;
import defpackage.h73;
import defpackage.hwj;
import defpackage.kwj;
import defpackage.l9e;
import defpackage.lwv0;
import defpackage.mwv0;
import defpackage.nwv0;
import defpackage.ny61;
import defpackage.omu0;
import defpackage.owv0;
import defpackage.oxv0;
import defpackage.pvv0;
import defpackage.pwv0;
import defpackage.pxv0;
import defpackage.qi80;
import defpackage.qvv0;
import defpackage.qwv0;
import defpackage.ri80;
import defpackage.rl2;
import defpackage.rvv0;
import defpackage.rwp0;
import defpackage.rwv0;
import defpackage.rxv0;
import defpackage.si80;
import defpackage.stv0;
import defpackage.swv0;
import defpackage.sxv0;
import defpackage.ti80;
import defpackage.uc61;
import defpackage.vwj;
import defpackage.vxv0;
import defpackage.w8v0;
import defpackage.wvj;
import defpackage.ywv0;
import defpackage.yxv0;
import defpackage.z8v0;
import defpackage.zvj;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.persuggest.source.h;
import ru.yandex.taxi.persuggest.source.m;

/* loaded from: classes14.dex */
public final class d {
    public final m a;
    public final h b;
    public final vxv0 c;
    public final rvv0 d;
    public final stv0 e;
    public final LruCache f = new LruCache(20);

    public d(m mVar, h hVar, vxv0 vxv0Var, rvv0 rvv0Var, stv0 stv0Var) {
        this.a = mVar;
        this.b = hVar;
        this.c = vxv0Var;
        this.d = rvv0Var;
        this.e = stv0Var;
    }

    public static swv0 b(rl2 rl2Var, w8v0 w8v0Var) {
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
            return new nwv0(str, str2, formattedText);
        }
        if (rl2Var instanceof cwj) {
            cwj cwjVar = (cwj) rl2Var;
            String str3 = cwjVar.b;
            String str4 = cwjVar.a;
            String str5 = cwjVar.c;
            ti80 qi80Var = (str3 == null || !l9e.f(str3) || str4 == null || evu0.J(str4)) ? (str3 == null || !l9e.f(str3)) ? (str4 == null || evu0.J(str4)) ? null : new qi80(str4, str5) : new ri80(str3, str5) : new si80(str3, str4, str5);
            if (qi80Var != null) {
                return new mwv0(qi80Var);
            }
        } else {
            if (rl2Var instanceof wvj) {
                return new owv0(((wvj) rl2Var).a);
            }
            if (rl2Var instanceof zvj) {
                vwj vwjVar = ((zvj) rl2Var).a;
                return new pwv0(vwjVar.c, vwjVar.a, vwjVar.b);
            }
            if (rl2Var instanceof hwj) {
                String str6 = ((hwj) rl2Var).a;
                if (!evu0.J(str6)) {
                    return new lwv0(Uri.parse(str6));
                }
            } else if (rl2Var instanceof ctp0) {
                if (w8v0Var instanceof z8v0) {
                    z8v0 z8v0Var = (z8v0) w8v0Var;
                    return new qwv0(z8v0Var.h, z8v0Var.e);
                }
            } else if (rl2Var instanceof c2v0) {
                return new rwv0(((c2v0) rl2Var).a);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Type inference failed for: r12v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ywv0 ywv0Var, ContinuationImpl continuationImpl) {
        SuperAppDiscoveryMapSearchOrganizationRepositories$getData$1 superAppDiscoveryMapSearchOrganizationRepositories$getData$1;
        int i;
        String str;
        uc61 uc61Var;
        List s;
        try {
            try {
                if (continuationImpl instanceof SuperAppDiscoveryMapSearchOrganizationRepositories$getData$1) {
                    superAppDiscoveryMapSearchOrganizationRepositories$getData$1 = (SuperAppDiscoveryMapSearchOrganizationRepositories$getData$1) continuationImpl;
                    int i2 = superAppDiscoveryMapSearchOrganizationRepositories$getData$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        superAppDiscoveryMapSearchOrganizationRepositories$getData$1.label = i2 - Integer.MIN_VALUE;
                        SuperAppDiscoveryMapSearchOrganizationRepositories$getData$1 superAppDiscoveryMapSearchOrganizationRepositories$getData$12 = superAppDiscoveryMapSearchOrganizationRepositories$getData$1;
                        Object obj = superAppDiscoveryMapSearchOrganizationRepositories$getData$12.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = superAppDiscoveryMapSearchOrganizationRepositories$getData$12.label;
                        LruCache lruCache = this.f;
                        stv0 stv0Var = this.e;
                        if (i != 0) {
                            kotlin.b.b(obj);
                            String obj2 = evu0.k0(ywv0Var.a()).toString();
                            rxv0 rxv0Var = (rxv0) lruCache.get(obj2);
                            if (rxv0Var != null) {
                                stv0Var.b(obj2, rxv0Var.b.a);
                                return rxv0Var;
                            }
                            try {
                                qvv0 qvv0Var = ((pvv0) this.d.a.get()).a;
                                String str2 = qvv0Var.c;
                                RoutePointType routePointType = qvv0Var.b;
                                if (evu0.J(obj2)) {
                                    m mVar = this.a;
                                    superAppDiscoveryMapSearchOrganizationRepositories$getData$12.L$0 = null;
                                    superAppDiscoveryMapSearchOrganizationRepositories$getData$12.L$1 = obj2;
                                    superAppDiscoveryMapSearchOrganizationRepositories$getData$12.L$2 = null;
                                    superAppDiscoveryMapSearchOrganizationRepositories$getData$12.L$3 = null;
                                    superAppDiscoveryMapSearchOrganizationRepositories$getData$12.L$4 = null;
                                    superAppDiscoveryMapSearchOrganizationRepositories$getData$12.L$5 = null;
                                    superAppDiscoveryMapSearchOrganizationRepositories$getData$12.label = 1;
                                    obj = mVar.b(routePointType, str2, superAppDiscoveryMapSearchOrganizationRepositories$getData$12);
                                    if (obj != coroutineSingletons) {
                                        str = obj2;
                                        uc61Var = (uc61) obj;
                                    }
                                } else {
                                    h hVar = this.b;
                                    String c = ((rwp0) this.c.a.getValue()).c();
                                    superAppDiscoveryMapSearchOrganizationRepositories$getData$12.L$0 = null;
                                    superAppDiscoveryMapSearchOrganizationRepositories$getData$12.L$1 = obj2;
                                    superAppDiscoveryMapSearchOrganizationRepositories$getData$12.L$2 = null;
                                    superAppDiscoveryMapSearchOrganizationRepositories$getData$12.L$3 = null;
                                    superAppDiscoveryMapSearchOrganizationRepositories$getData$12.L$4 = null;
                                    superAppDiscoveryMapSearchOrganizationRepositories$getData$12.L$5 = null;
                                    superAppDiscoveryMapSearchOrganizationRepositories$getData$12.label = 2;
                                    obj = hVar.c(c, obj2, routePointType, str2, superAppDiscoveryMapSearchOrganizationRepositories$getData$12);
                                    if (obj != coroutineSingletons) {
                                        str = obj2;
                                        uc61Var = (uc61) obj;
                                    }
                                }
                                return coroutineSingletons;
                            } catch (Throwable unused) {
                                ywv0Var = obj2;
                                co40 co40Var = stv0Var.b;
                                SuperMapAnalytics$SuperMapSearchType a = stv0.a(ywv0Var);
                                co40Var.getClass();
                                HashMap hashMap = new HashMap();
                                hashMap.put("type", a.getEventValue());
                                if (ywv0Var != 0) {
                                    hashMap.put("search_query", ywv0Var);
                                }
                                co40Var.a.a("SuperMap.Search.LoadingFailed", hashMap, 1, new HashMap());
                                return new sxv0(ywv0Var);
                            }
                        }
                        if (i == 1) {
                            str = (String) superAppDiscoveryMapSearchOrganizationRepositories$getData$12.L$1;
                            kotlin.b.b(obj);
                            uc61Var = (uc61) obj;
                        } else {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str = (String) superAppDiscoveryMapSearchOrganizationRepositories$getData$12.L$1;
                            kotlin.b.b(obj);
                            uc61Var = (uc61) obj;
                        }
                        s = kotlin.sequences.b.s(kotlin.sequences.b.o(kotlin.sequences.b.i(kotlin.sequences.a.c(kotlin.sequences.b.o(kotlin.sequences.b.g(new h73(1, kotlin.collections.a.M(uc61Var.a)), pxv0.a), new omu0(29)))), new oxv0(0, this)));
                        if (!s.isEmpty()) {
                            return new sxv0(str);
                        }
                        Object b0 = kotlin.collections.a.b0(s);
                        bxv0 bxv0Var = b0 instanceof bxv0 ? (bxv0) b0 : null;
                        if (bxv0Var != null) {
                            bxv0Var.e = false;
                        }
                        rxv0 rxv0Var2 = new rxv0(str, new yxv0(s));
                        lruCache.put(str, rxv0Var2);
                        stv0Var.b(str, s);
                        return rxv0Var2;
                    }
                }
                if (i != 0) {
                }
                s = kotlin.sequences.b.s(kotlin.sequences.b.o(kotlin.sequences.b.i(kotlin.sequences.a.c(kotlin.sequences.b.o(kotlin.sequences.b.g(new h73(1, kotlin.collections.a.M(uc61Var.a)), pxv0.a), new omu0(29)))), new oxv0(0, this)));
                if (!s.isEmpty()) {
                }
            } catch (Throwable unused2) {
            }
        } catch (CancellationException e) {
            throw e;
        }
        superAppDiscoveryMapSearchOrganizationRepositories$getData$1 = new SuperAppDiscoveryMapSearchOrganizationRepositories$getData$1(this, continuationImpl);
        SuperAppDiscoveryMapSearchOrganizationRepositories$getData$1 superAppDiscoveryMapSearchOrganizationRepositories$getData$122 = superAppDiscoveryMapSearchOrganizationRepositories$getData$1;
        Object obj3 = superAppDiscoveryMapSearchOrganizationRepositories$getData$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapSearchOrganizationRepositories$getData$122.label;
        LruCache lruCache2 = this.f;
        stv0 stv0Var2 = this.e;
    }
}
