package com.yandex.fintechsdk.core.network.impl.internal.network;

import com.yandex.fintechsdk.core.network.api.exception.NetworkException;
import com.yandex.fintechsdk.core.network.api.model.Header;
import com.yandex.fintechsdk.core.network.impl.internal.model.MimeType;
import defpackage.an11;
import defpackage.d1k0;
import defpackage.d5j0;
import defpackage.dvw;
import defpackage.evu0;
import defpackage.f6j0;
import defpackage.g6j0;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.h6j0;
import defpackage.itq0;
import defpackage.j18;
import defpackage.jwu;
import defpackage.keu;
import defpackage.kvj0;
import defpackage.kwu;
import defpackage.l5j0;
import defpackage.lfh;
import defpackage.m5j0;
import defpackage.meu;
import defpackage.mgx;
import defpackage.nci0;
import defpackage.ny61;
import defpackage.osu;
import defpackage.qoi0;
import defpackage.rvj0;
import defpackage.sbx;
import defpackage.sf00;
import defpackage.suf;
import defpackage.t4j0;
import defpackage.tje;
import defpackage.uf00;
import defpackage.v4j0;
import defpackage.wf00;
import defpackage.wms;
import defpackage.z22;
import defpackage.zcx;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.c;
import okhttp3.OkHttpClient;

/* loaded from: classes12.dex */
public class a implements lfh {
    public final z22 a;
    public final h6j0 b;
    public final String c;
    public final zcx d = tje.a(sbx.d, new suf(22));

    public a(osu osuVar, z22 z22Var, h6j0 h6j0Var) {
        this.a = z22Var;
        this.b = h6j0Var;
        this.c = osuVar.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|13|(1:15)|16))|29|6|7|(0)(0)|12|13|(0)|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        r7 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object d(a aVar, v4j0 v4j0Var, an11 an11Var, ContinuationImpl continuationImpl) {
        DefaultNetworkApiImpl$sendRequest$1 defaultNetworkApiImpl$sendRequest$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof DefaultNetworkApiImpl$sendRequest$1) {
            defaultNetworkApiImpl$sendRequest$1 = (DefaultNetworkApiImpl$sendRequest$1) continuationImpl;
            int i2 = defaultNetworkApiImpl$sendRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultNetworkApiImpl$sendRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultNetworkApiImpl$sendRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultNetworkApiImpl$sendRequest$1.label;
                if (i != 0) {
                    b.b(obj);
                    defaultNetworkApiImpl$sendRequest$1.L$0 = aVar;
                    defaultNetworkApiImpl$sendRequest$1.label = 1;
                    obj = aVar.c(v4j0Var, an11Var, defaultNetworkApiImpl$sendRequest$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = (a) defaultNetworkApiImpl$sendRequest$1.L$0;
                    b.b(obj);
                }
                a = Result.a(obj);
                if (a != null) {
                    ((com.yandex.fintechsdk.core.analytics.impl.internal.a) aVar.a).c("network_error", a);
                }
                return obj;
            }
        }
        defaultNetworkApiImpl$sendRequest$1 = new DefaultNetworkApiImpl$sendRequest$1(aVar, continuationImpl);
        Object obj2 = defaultNetworkApiImpl$sendRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultNetworkApiImpl$sendRequest$1.label;
        if (i != 0) {
        }
        a = Result.a(obj2);
        if (a != null) {
        }
        return obj2;
    }

    public Map a() {
        return kotlin.collections.b.f();
    }

    public Object b(rvj0 rvj0Var, mgx mgxVar) {
        return this.d.b(gtq0.H(itq0.a, mgxVar), rvj0Var.string());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01dd A[Catch: all -> 0x01e1, TryCatch #0 {all -> 0x01e1, blocks: (B:12:0x01cf, B:14:0x01dd, B:15:0x01e5, B:18:0x01eb, B:20:0x01ef, B:24:0x01f7, B:29:0x020c, B:36:0x0224, B:32:0x021b, B:33:0x0223, B:39:0x0225, B:44:0x023d, B:45:0x0240, B:31:0x020e), top: B:11:0x01cf, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01eb A[Catch: all -> 0x01e1, TRY_ENTER, TryCatch #0 {all -> 0x01e1, blocks: (B:12:0x01cf, B:14:0x01dd, B:15:0x01e5, B:18:0x01eb, B:20:0x01ef, B:24:0x01f7, B:29:0x020c, B:36:0x0224, B:32:0x021b, B:33:0x0223, B:39:0x0225, B:44:0x023d, B:45:0x0240, B:31:0x020e), top: B:11:0x01cf, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0225 A[Catch: all -> 0x01e1, TryCatch #0 {all -> 0x01e1, blocks: (B:12:0x01cf, B:14:0x01dd, B:15:0x01e5, B:18:0x01eb, B:20:0x01ef, B:24:0x01f7, B:29:0x020c, B:36:0x0224, B:32:0x021b, B:33:0x0223, B:39:0x0225, B:44:0x023d, B:45:0x0240, B:31:0x020e), top: B:11:0x01cf, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(v4j0 v4j0Var, mgx mgxVar, ContinuationImpl continuationImpl) {
        DefaultNetworkApiImpl$getResponseFor$1 defaultNetworkApiImpl$getResponseFor$1;
        int i;
        mgx mgxVar2;
        l5j0 l5j0Var;
        int i2;
        rvj0 rvj0Var;
        v4j0 v4j0Var2 = v4j0Var;
        try {
            if (continuationImpl instanceof DefaultNetworkApiImpl$getResponseFor$1) {
                defaultNetworkApiImpl$getResponseFor$1 = (DefaultNetworkApiImpl$getResponseFor$1) continuationImpl;
                int i3 = defaultNetworkApiImpl$getResponseFor$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    defaultNetworkApiImpl$getResponseFor$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = defaultNetworkApiImpl$getResponseFor$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = defaultNetworkApiImpl$getResponseFor$1.label;
                    Object obj2 = null;
                    Object obj3 = null;
                    if (i != 0) {
                        b.b(obj);
                        String b = v4j0Var2.b();
                        if (b == null) {
                            b = this.c;
                        }
                        Map a = a();
                        defaultNetworkApiImpl$getResponseFor$1.L$0 = v4j0Var2;
                        mgxVar2 = mgxVar;
                        defaultNetworkApiImpl$getResponseFor$1.L$1 = mgxVar2;
                        defaultNetworkApiImpl$getResponseFor$1.label = 1;
                        h6j0 h6j0Var = this.b;
                        h6j0Var.getClass();
                        j18 j18Var = new j18(1, dvw.b(defaultNetworkApiImpl$getResponseFor$1));
                        j18Var.u();
                        OkHttpClient okHttpClient = h6j0Var.c;
                        c a2 = v4j0Var2.a();
                        if (a2 != null) {
                            String cVar = a2.toString();
                            int i4 = m5j0.a;
                            l5j0Var = wms.a(cVar, MimeType.APPLICATION_JSON.a());
                        } else {
                            l5j0Var = null;
                        }
                        Map g = v4j0Var2.g();
                        boolean z = v4j0Var2.a.a;
                        MapBuilder mapBuilder = new MapBuilder();
                        mapBuilder.putAll(h6j0Var.b.getHeaders());
                        mapBuilder.putAll(a);
                        mapBuilder.putAll(v4j0Var2.f());
                        MapBuilder j = mapBuilder.j();
                        keu keuVar = new keu();
                        Object it = ((wf00) j.keySet()).iterator();
                        while (((uf00) it).hasNext()) {
                            Object obj4 = obj2;
                            String str = (String) ((sf00) it).next();
                            keuVar.a(str, (String) j.get(str));
                            obj2 = obj4;
                        }
                        Object obj5 = obj2;
                        if (z) {
                            String a3 = h6j0Var.a.a();
                            if (a3 == null) {
                                ny61.r("Missing auth token");
                                return obj5;
                            }
                            keuVar.a(Header.OAuthToken.getKey(), a3);
                            keuVar.a(Header.Authorization.getKey(), String.format("OAuth %s", Arrays.copyOf(new Object[]{a3}, 1)));
                        }
                        keuVar.a(Header.UserAgent.getKey(), h6j0Var.d.d());
                        if (l5j0Var != null) {
                            keuVar.a(Header.ContentType.getKey(), String.valueOf(l5j0Var.b));
                        }
                        meu d = keuVar.d();
                        String p = g8e.p(evu0.n0(b, '/'), "/", evu0.p0(v4j0Var2.e(), '/'));
                        jwu jwuVar = new jwu();
                        kwu kwuVar = obj5;
                        jwuVar.i(kwuVar, p);
                        jwu g2 = jwuVar.e().g();
                        for (Map.Entry entry : g.entrySet()) {
                            g2.d((String) entry.getKey(), (String) entry.getValue());
                        }
                        kwu e = g2.e();
                        t4j0 t4j0Var = new t4j0();
                        t4j0Var.a = e;
                        t4j0Var.c = d.d();
                        t4j0Var.e(v4j0Var2.c().name(), l5j0Var);
                        nci0 nci0Var = (nci0) okHttpClient.newCall(new d5j0(t4j0Var));
                        nci0Var.I(new f6j0(j18Var, v4j0Var2));
                        i2 = 0;
                        j18Var.w(new g6j0(nci0Var, i2));
                        obj = j18Var.s();
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        obj3 = kwuVar;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mgx mgxVar3 = (mgx) defaultNetworkApiImpl$getResponseFor$1.L$1;
                        v4j0 v4j0Var3 = (v4j0) defaultNetworkApiImpl$getResponseFor$1.L$0;
                        b.b(obj);
                        mgxVar2 = mgxVar3;
                        v4j0Var2 = v4j0Var3;
                        i2 = 0;
                    }
                    kvj0 kvj0Var = (kvj0) obj;
                    d5j0 d5j0Var = kvj0Var.a;
                    meu meuVar = kvj0Var.y;
                    d1k0 d1k0Var = (d1k0) d5j0Var.c(d1k0.class);
                    int i5 = d1k0Var == null ? d1k0Var.a : i2;
                    rvj0Var = kvj0Var.z;
                    String str2 = "";
                    if (rvj0Var != null) {
                        String d2 = v4j0Var2.d();
                        String a4 = meuVar.a(Header.RequestId.getKey());
                        Object obj6 = a4 == null ? obj3 : a4;
                        if (obj6 != null) {
                            str2 = obj6;
                        }
                        throw new NetworkException.EmptyBodyException(d2, str2, i5);
                    }
                    if (kvj0Var.J) {
                        Object b2 = b(rvj0Var, mgxVar2);
                        kvj0Var.close();
                        return b2;
                    }
                    String d3 = v4j0Var2.d();
                    Object a5 = meuVar.a(Header.RequestId.getKey());
                    if (a5 == null) {
                        a5 = obj3;
                    }
                    if (a5 != null) {
                        str2 = a5;
                    }
                    int i6 = kvj0Var.w;
                    try {
                        obj3 = b(rvj0Var, qoi0.e(c.class));
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                    }
                    throw new NetworkException.BadCodeException(d3, str2, i6, (c) obj3, i5);
                }
            }
            d5j0 d5j0Var2 = kvj0Var.a;
            meu meuVar2 = kvj0Var.y;
            d1k0 d1k0Var2 = (d1k0) d5j0Var2.c(d1k0.class);
            if (d1k0Var2 == null) {
            }
            rvj0Var = kvj0Var.z;
            String str22 = "";
            if (rvj0Var != null) {
            }
        } finally {
        }
        defaultNetworkApiImpl$getResponseFor$1 = new DefaultNetworkApiImpl$getResponseFor$1(this, continuationImpl);
        Object obj7 = defaultNetworkApiImpl$getResponseFor$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultNetworkApiImpl$getResponseFor$1.label;
        Object obj22 = null;
        Object obj32 = null;
        if (i != 0) {
        }
        kvj0 kvj0Var2 = (kvj0) obj7;
    }
}
