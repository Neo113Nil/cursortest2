package com.yandex.go.zone.repository;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import com.yandex.go.net.taxi.dto.request.ZoneInfoParam;
import com.yandex.go.zone.dto.objects.VerticalType;
import com.yandex.go.zone.model.Zone;
import defpackage.ae61;
import defpackage.avj0;
import defpackage.be61;
import defpackage.bqe;
import defpackage.bvf0;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.fn21;
import defpackage.g050;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.h1f;
import defpackage.i050;
import defpackage.i3y;
import defpackage.id61;
import defpackage.j73;
import defpackage.jd61;
import defpackage.jsq0;
import defpackage.jst;
import defpackage.kd61;
import defpackage.ksq0;
import defpackage.ld61;
import defpackage.md61;
import defpackage.mdh;
import defpackage.mth;
import defpackage.ny61;
import defpackage.oay0;
import defpackage.on2;
import defpackage.qre;
import defpackage.r8h;
import defpackage.rre;
import defpackage.sjh;
import defpackage.t61;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xby;
import defpackage.zf;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class o {
    public final on2 a;
    public final l b;
    public final r8h c;
    public final kd61 d;
    public final h e;
    public final id61 f;
    public final r g;
    public final fn21 h;
    public final tt2 i;
    public final ae61 j;
    public final jd61 k;
    public final bqe l;
    public final rre m;
    public final h1f n;
    public final ru.yandex.taxi.perf.screen.c o;
    public final d p;
    public final i3y q = kotlin.a.a(new oay0(26, this));
    public final r0 r = bvf0.c(null);
    public final n0 s = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public final i050 t = new i050();

    public o(on2 on2Var, l lVar, r8h r8hVar, kd61 kd61Var, h hVar, id61 id61Var, r rVar, fn21 fn21Var, tt2 tt2Var, ae61 ae61Var, jd61 jd61Var, bqe bqeVar, rre rreVar, h1f h1fVar, ru.yandex.taxi.perf.screen.c cVar, d dVar) {
        this.a = on2Var;
        this.b = lVar;
        this.c = r8hVar;
        this.d = kd61Var;
        this.e = hVar;
        this.f = id61Var;
        this.g = rVar;
        this.h = fn21Var;
        this.i = tt2Var;
        this.j = ae61Var;
        this.k = jd61Var;
        this.l = bqeVar;
        this.m = rreVar;
        this.n = h1fVar;
        this.o = cVar;
        this.p = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(o oVar, String str, String str2, ContinuationImpl continuationImpl) {
        ZoneInfoRepositoryImpl$internalRequest$1 zoneInfoRepositoryImpl$internalRequest$1;
        int i;
        ZoneInfoParam zoneInfoParam;
        Exception exc;
        ZoneInfoParam zoneInfoParam2;
        CancellationException cancellationException;
        String str3 = str2;
        oVar.getClass();
        try {
            if (continuationImpl instanceof ZoneInfoRepositoryImpl$internalRequest$1) {
                zoneInfoRepositoryImpl$internalRequest$1 = (ZoneInfoRepositoryImpl$internalRequest$1) continuationImpl;
                int i2 = zoneInfoRepositoryImpl$internalRequest$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zoneInfoRepositoryImpl$internalRequest$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = zoneInfoRepositoryImpl$internalRequest$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = zoneInfoRepositoryImpl$internalRequest$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        rre rreVar = oVar.m;
                        rreVar.getClass();
                        com.yandex.go.net.taxi.dto.request.c cVar = ZoneInfoParam.Companion;
                        int j = ((avj0) rreVar.a).j();
                        int i3 = qre.a[rreVar.b.c().ordinal()] != 1 ? 10 : 9;
                        List singletonList = Collections.singletonList(VerticalType.GROUP);
                        cVar.getClass();
                        String str4 = (str3 == null || evu0.J(str3)) ? null : str3;
                        List A = j73.A(new String[]{"eula_actions", "map_style_2", "childchair_v2", "compoundselect", "grouped_requirements", "address_requirement", "verticals_selector", "local_persistence_policy"});
                        jsq0 jsq0Var = ksq0.a;
                        zoneInfoParam = new ZoneInfoParam(str, str4, j, i3, A, new jsq0(singletonList));
                        try {
                            l lVar = oVar.b;
                            ZoneInfoRepositoryImpl$internalRequest$2 zoneInfoRepositoryImpl$internalRequest$2 = new ZoneInfoRepositoryImpl$internalRequest$2(zoneInfoParam, oVar, null);
                            zoneInfoRepositoryImpl$internalRequest$1.L$0 = null;
                            zoneInfoRepositoryImpl$internalRequest$1.L$1 = str3;
                            zoneInfoRepositoryImpl$internalRequest$1.L$2 = zoneInfoParam;
                            zoneInfoRepositoryImpl$internalRequest$1.label = 1;
                            lVar.getClass();
                            obj = lVar.a("zoneinfo", new ZoneInfoAnalytics$zoneInfoWithLogging$2(lVar, zoneInfoRepositoryImpl$internalRequest$2, null), zoneInfoRepositoryImpl$internalRequest$1);
                            if (obj == obj2) {
                                return obj2;
                            }
                        } catch (CancellationException e) {
                            cancellationException = e;
                            xby.l(jst.e, "zoneinfo: Cancel", null, cancellationException, g8e.o("Cancel zone info request for ", str3), 2);
                            throw cancellationException;
                        } catch (Exception e2) {
                            exc = e2;
                            zoneInfoParam2 = zoneInfoParam;
                            xby.l(jst.e, "zoneinfo: Remote error", null, exc, "Error updating zone info", 2);
                            zoneInfoRepositoryImpl$internalRequest$1.L$0 = null;
                            zoneInfoRepositoryImpl$internalRequest$1.L$1 = null;
                            zoneInfoRepositoryImpl$internalRequest$1.L$2 = null;
                            zoneInfoRepositoryImpl$internalRequest$1.L$3 = null;
                            zoneInfoRepositoryImpl$internalRequest$1.label = 2;
                            obj = oVar.j(exc, zoneInfoParam2, zoneInfoRepositoryImpl$internalRequest$1);
                            if (obj == obj2) {
                            }
                            return (Zone) obj;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return (Zone) obj;
                        }
                        zoneInfoParam2 = (ZoneInfoParam) zoneInfoRepositoryImpl$internalRequest$1.L$2;
                        String str5 = (String) zoneInfoRepositoryImpl$internalRequest$1.L$1;
                        try {
                            kotlin.b.b(obj);
                            zoneInfoParam = zoneInfoParam2;
                            str3 = str5;
                        } catch (CancellationException e3) {
                            cancellationException = e3;
                            str3 = str5;
                            xby.l(jst.e, "zoneinfo: Cancel", null, cancellationException, g8e.o("Cancel zone info request for ", str3), 2);
                            throw cancellationException;
                        } catch (Exception e4) {
                            exc = e4;
                            xby.l(jst.e, "zoneinfo: Remote error", null, exc, "Error updating zone info", 2);
                            zoneInfoRepositoryImpl$internalRequest$1.L$0 = null;
                            zoneInfoRepositoryImpl$internalRequest$1.L$1 = null;
                            zoneInfoRepositoryImpl$internalRequest$1.L$2 = null;
                            zoneInfoRepositoryImpl$internalRequest$1.L$3 = null;
                            zoneInfoRepositoryImpl$internalRequest$1.label = 2;
                            obj = oVar.j(exc, zoneInfoParam2, zoneInfoRepositoryImpl$internalRequest$1);
                            if (obj == obj2) {
                                return obj2;
                            }
                            return (Zone) obj;
                        }
                    }
                    return ((Result) obj).getValue();
                }
            }
            if (i != 0) {
            }
            return ((Result) obj).getValue();
        } catch (CancellationException e5) {
            throw e5;
        } catch (Exception e6) {
            return new Result.Failure(e6);
        }
        zoneInfoRepositoryImpl$internalRequest$1 = new ZoneInfoRepositoryImpl$internalRequest$1(oVar, continuationImpl);
        Object obj3 = zoneInfoRepositoryImpl$internalRequest$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneInfoRepositoryImpl$internalRequest$1.label;
    }

    public final Zone b() {
        be61 be61Var = (be61) this.r.getValue();
        if (be61Var != null) {
            return be61Var.a;
        }
        return null;
    }

    public final mth c() {
        return new mth(new n(this.r), 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1 A[Catch: all -> 0x00f7, TryCatch #1 {all -> 0x00f7, blocks: (B:30:0x00f9, B:43:0x00bb, B:45:0x00c1, B:51:0x00e4), top: B:42:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, ContinuationImpl continuationImpl) {
        ZoneInfoRepositoryImpl$cacheOrFetchZone$1 zoneInfoRepositoryImpl$cacheOrFetchZone$1;
        Object obj;
        Object obj2;
        int i;
        String str3;
        g050 g050Var;
        Object putIfAbsent;
        Zone h;
        String str4;
        String str5;
        g050 g050Var2;
        Zone zone;
        Throwable th;
        g050 g050Var3;
        try {
            if (continuationImpl instanceof ZoneInfoRepositoryImpl$cacheOrFetchZone$1) {
                zoneInfoRepositoryImpl$cacheOrFetchZone$1 = (ZoneInfoRepositoryImpl$cacheOrFetchZone$1) continuationImpl;
                int i2 = zoneInfoRepositoryImpl$cacheOrFetchZone$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zoneInfoRepositoryImpl$cacheOrFetchZone$1.label = i2 - Integer.MIN_VALUE;
                    obj = zoneInfoRepositoryImpl$cacheOrFetchZone$1.result;
                    obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = zoneInfoRepositoryImpl$cacheOrFetchZone$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ConcurrentHashMap concurrentHashMap = this.t.a;
                        Object obj3 = concurrentHashMap.get(str2);
                        if (obj3 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str2, (obj3 = gtq0.a()))) != null) {
                            obj3 = putIfAbsent;
                        }
                        g050 g050Var4 = (g050) obj3;
                        zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$0 = str;
                        zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$1 = str2;
                        zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$2 = null;
                        zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$3 = null;
                        zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$4 = g050Var4;
                        zoneInfoRepositoryImpl$cacheOrFetchZone$1.label = 1;
                        if (g050Var4.a(zoneInfoRepositoryImpl$cacheOrFetchZone$1) != obj2) {
                            str3 = str;
                            g050Var = g050Var4;
                        }
                        return obj2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var3 = (g050) zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$4;
                            try {
                                kotlin.b.b(obj);
                                zone = (Zone) obj;
                                g050Var2 = g050Var3;
                                g050Var2.d(null);
                                return zone;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var3.d(null);
                                throw th;
                            }
                        }
                        zone = (Zone) zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$5;
                        g050Var2 = (g050) zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$4;
                        str5 = (String) zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$1;
                        str4 = (String) zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            if (zone == null) {
                                g050Var = g050Var2;
                                str2 = str5;
                                str3 = str4;
                                zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$0 = null;
                                zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$1 = null;
                                zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$2 = null;
                                zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$3 = null;
                                zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$4 = g050Var;
                                zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$5 = null;
                                zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$6 = null;
                                zoneInfoRepositoryImpl$cacheOrFetchZone$1.label = 3;
                                obj = i(str3, str2, zoneInfoRepositoryImpl$cacheOrFetchZone$1);
                                if (obj != obj2) {
                                    g050Var3 = g050Var;
                                    zone = (Zone) obj;
                                    g050Var2 = g050Var3;
                                }
                                return obj2;
                            }
                            g050Var2.d(null);
                            return zone;
                        } catch (Throwable th3) {
                            th = th3;
                            g050Var3 = g050Var2;
                            g050Var3.d(null);
                            throw th;
                        }
                    }
                    g050Var = (g050) zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$4;
                    str2 = (String) zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$1;
                    str3 = (String) zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$0;
                    kotlin.b.b(obj);
                    h = h(str3, str2);
                    if (h != null) {
                        zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$0 = str3;
                        zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$1 = str2;
                        zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$2 = null;
                        zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$3 = null;
                        zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$4 = g050Var;
                        zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$5 = h;
                        zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$6 = null;
                        zoneInfoRepositoryImpl$cacheOrFetchZone$1.label = 2;
                        this.i.getClass();
                        Object k0 = tje.k0(uyj.a, new ZoneInfoRepositoryImpl$updateLastObservedZone$2(this, h, str3, null), zoneInfoRepositoryImpl$cacheOrFetchZone$1);
                        if (k0 != obj2) {
                            k0 = zy11.a;
                        }
                        if (k0 == obj2) {
                            return obj2;
                        }
                        str4 = str3;
                        str5 = str2;
                        g050Var2 = g050Var;
                        zone = h;
                        if (zone == null) {
                        }
                        g050Var2.d(null);
                        return zone;
                    }
                    zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$0 = null;
                    zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$1 = null;
                    zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$2 = null;
                    zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$3 = null;
                    zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$4 = g050Var;
                    zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$5 = null;
                    zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$6 = null;
                    zoneInfoRepositoryImpl$cacheOrFetchZone$1.label = 3;
                    obj = i(str3, str2, zoneInfoRepositoryImpl$cacheOrFetchZone$1);
                    if (obj != obj2) {
                    }
                    return obj2;
                }
            }
            h = h(str3, str2);
            if (h != null) {
            }
            zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$0 = null;
            zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$1 = null;
            zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$2 = null;
            zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$3 = null;
            zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$4 = g050Var;
            zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$5 = null;
            zoneInfoRepositoryImpl$cacheOrFetchZone$1.L$6 = null;
            zoneInfoRepositoryImpl$cacheOrFetchZone$1.label = 3;
            obj = i(str3, str2, zoneInfoRepositoryImpl$cacheOrFetchZone$1);
            if (obj != obj2) {
            }
            return obj2;
        } catch (Throwable th4) {
            g050 g050Var5 = g050Var;
            th = th4;
            g050Var3 = g050Var5;
            g050Var3.d(null);
            throw th;
        }
        zoneInfoRepositoryImpl$cacheOrFetchZone$1 = new ZoneInfoRepositoryImpl$cacheOrFetchZone$1(this, continuationImpl);
        obj = zoneInfoRepositoryImpl$cacheOrFetchZone$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneInfoRepositoryImpl$cacheOrFetchZone$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        if (r3.c(r13, r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        if (r13 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(kotlinx.serialization.json.c cVar, ZoneInfoParam zoneInfoParam, ContinuationImpl continuationImpl) {
        ZoneInfoRepositoryImpl$extractZone$1 zoneInfoRepositoryImpl$extractZone$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        d dVar;
        String str;
        Zone zone;
        if (continuationImpl instanceof ZoneInfoRepositoryImpl$extractZone$1) {
            zoneInfoRepositoryImpl$extractZone$1 = (ZoneInfoRepositoryImpl$extractZone$1) continuationImpl;
            int i2 = zoneInfoRepositoryImpl$extractZone$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneInfoRepositoryImpl$extractZone$1.label = i2 - Integer.MIN_VALUE;
                Object obj = zoneInfoRepositoryImpl$extractZone$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneInfoRepositoryImpl$extractZone$1.label;
                dVar = this.p;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = zoneInfoParam.b;
                    zoneInfoRepositoryImpl$extractZone$1.L$0 = null;
                    zoneInfoRepositoryImpl$extractZone$1.L$1 = zoneInfoParam;
                    zoneInfoRepositoryImpl$extractZone$1.label = 1;
                    id61 id61Var = this.f;
                    id61Var.b.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new ZoneInfoParser$parseZoneInfoResponse$2(id61Var, cVar, str2, null), zoneInfoRepositoryImpl$extractZone$1);
                } else if (i == 1) {
                    zoneInfoParam = (ZoneInfoParam) zoneInfoRepositoryImpl$extractZone$1.L$1;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Zone zone2 = (Zone) zoneInfoRepositoryImpl$extractZone$1.L$2;
                            kotlin.b.b(obj);
                            return zone2;
                        }
                        zone = (Zone) zoneInfoRepositoryImpl$extractZone$1.L$2;
                        zoneInfoParam = (ZoneInfoParam) zoneInfoRepositoryImpl$extractZone$1.L$1;
                        kotlin.b.b(obj);
                        String str3 = zoneInfoParam.a;
                        zoneInfoRepositoryImpl$extractZone$1.L$0 = null;
                        zoneInfoRepositoryImpl$extractZone$1.L$1 = null;
                        zoneInfoRepositoryImpl$extractZone$1.L$2 = zone;
                        zoneInfoRepositoryImpl$extractZone$1.label = 4;
                        this.i.getClass();
                        Object k0 = tje.k0(uyj.a, new ZoneInfoRepositoryImpl$updateLastObservedZone$2(this, zone, str3, null), zoneInfoRepositoryImpl$extractZone$1);
                        if (k0 != coroutineSingletons) {
                            k0 = zy11.a;
                        }
                        return k0 == coroutineSingletons ? coroutineSingletons : zone;
                    }
                    zone = (Zone) zoneInfoRepositoryImpl$extractZone$1.L$2;
                    zoneInfoParam = (ZoneInfoParam) zoneInfoRepositoryImpl$extractZone$1.L$1;
                    kotlin.b.b(obj);
                    String str4 = zone.B;
                    zoneInfoRepositoryImpl$extractZone$1.L$0 = null;
                    zoneInfoRepositoryImpl$extractZone$1.L$1 = zoneInfoParam;
                    zoneInfoRepositoryImpl$extractZone$1.L$2 = zone;
                    zoneInfoRepositoryImpl$extractZone$1.label = 3;
                }
                Zone zone3 = (Zone) obj;
                str = zoneInfoParam.b;
                if (str == null) {
                    str = "";
                }
                zoneInfoRepositoryImpl$extractZone$1.L$0 = null;
                zoneInfoRepositoryImpl$extractZone$1.L$1 = zoneInfoParam;
                zoneInfoRepositoryImpl$extractZone$1.L$2 = zone3;
                zoneInfoRepositoryImpl$extractZone$1.label = 2;
                if (dVar.d(str, zoneInfoRepositoryImpl$extractZone$1) != coroutineSingletons) {
                    zone = zone3;
                    String str42 = zone.B;
                    zoneInfoRepositoryImpl$extractZone$1.L$0 = null;
                    zoneInfoRepositoryImpl$extractZone$1.L$1 = zoneInfoParam;
                    zoneInfoRepositoryImpl$extractZone$1.L$2 = zone;
                    zoneInfoRepositoryImpl$extractZone$1.label = 3;
                }
            }
        }
        zoneInfoRepositoryImpl$extractZone$1 = new ZoneInfoRepositoryImpl$extractZone$1(this, continuationImpl);
        Object obj2 = zoneInfoRepositoryImpl$extractZone$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneInfoRepositoryImpl$extractZone$1.label;
        dVar = this.p;
        if (i != 0) {
        }
        Zone zone32 = (Zone) obj2;
        str = zoneInfoParam.b;
        if (str == null) {
        }
        zoneInfoRepositoryImpl$extractZone$1.L$0 = null;
        zoneInfoRepositoryImpl$extractZone$1.L$1 = zoneInfoParam;
        zoneInfoRepositoryImpl$extractZone$1.L$2 = zone32;
        zoneInfoRepositoryImpl$extractZone$1.label = 2;
        if (dVar.d(str, zoneInfoRepositoryImpl$extractZone$1) != coroutineSingletons) {
        }
    }

    public final Zone f(String str) {
        ld61 ld61Var;
        String Hg = ((ru.yandex.taxi.startup.launch.h) this.h).Hg();
        if (Hg == null || Hg.length() == 0 || str == null || str.length() == 0 || (ld61Var = (ld61) this.d.b.get(new md61(Hg, str))) == null) {
            return null;
        }
        return ld61Var.a;
    }

    public final Zone g() {
        ld61 ld61Var;
        String Hg = ((ru.yandex.taxi.startup.launch.h) this.h).Hg();
        String a = this.g.a();
        if (Hg == null || Hg.length() == 0 || a == null || a.length() == 0 || (ld61Var = (ld61) this.d.b.get(new md61(Hg, a))) == null) {
            return null;
        }
        return ld61Var.a;
    }

    public final Zone h(String str, String str2) {
        ld61 ld61Var;
        if (str2 == null || str2.length() == 0 || (ld61Var = (ld61) this.d.b.get(new md61(str, str2))) == null) {
            return null;
        }
        this.c.getClass();
        long currentTimeMillis = System.currentTimeMillis() - ld61Var.b;
        if (0 > currentTimeMillis || currentTimeMillis >= MapiClientImpl.RETRIES_TIME_MILLIS) {
            return null;
        }
        return ld61Var.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, String str2, ContinuationImpl continuationImpl) {
        ZoneInfoRepositoryImpl$remoteZoneInfo$1 zoneInfoRepositoryImpl$remoteZoneInfo$1;
        int i;
        if (continuationImpl instanceof ZoneInfoRepositoryImpl$remoteZoneInfo$1) {
            zoneInfoRepositoryImpl$remoteZoneInfo$1 = (ZoneInfoRepositoryImpl$remoteZoneInfo$1) continuationImpl;
            int i2 = zoneInfoRepositoryImpl$remoteZoneInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneInfoRepositoryImpl$remoteZoneInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = zoneInfoRepositoryImpl$remoteZoneInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneInfoRepositoryImpl$remoteZoneInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.i.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    ZoneInfoRepositoryImpl$remoteZoneInfo$zone$1 zoneInfoRepositoryImpl$remoteZoneInfo$zone$1 = new ZoneInfoRepositoryImpl$remoteZoneInfo$zone$1(this, str, str2, null);
                    zoneInfoRepositoryImpl$remoteZoneInfo$1.L$0 = null;
                    zoneInfoRepositoryImpl$remoteZoneInfo$1.L$1 = null;
                    zoneInfoRepositoryImpl$remoteZoneInfo$1.label = 1;
                    obj = tje.k0(mdhVar, zoneInfoRepositoryImpl$remoteZoneInfo$zone$1, zoneInfoRepositoryImpl$remoteZoneInfo$1);
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
                Object value = ((Result) obj).getValue();
                kotlin.b.b(value);
                return (Zone) value;
            }
        }
        zoneInfoRepositoryImpl$remoteZoneInfo$1 = new ZoneInfoRepositoryImpl$remoteZoneInfo$1(this, continuationImpl);
        Object obj2 = zoneInfoRepositoryImpl$remoteZoneInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneInfoRepositoryImpl$remoteZoneInfo$1.label;
        if (i != 0) {
        }
        Object value2 = ((Result) obj2).getValue();
        kotlin.b.b(value2);
        return (Zone) value2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x007e, code lost:
    
        if (r14 == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.yandex.go.zone.repository.o] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Exception, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Exception exc, ZoneInfoParam zoneInfoParam, ContinuationImpl continuationImpl) {
        ZoneInfoRepositoryImpl$tryFallbackCache$1 zoneInfoRepositoryImpl$tryFallbackCache$1;
        int i;
        kotlinx.serialization.json.c cVar;
        Throwable th;
        Throwable th2;
        String message;
        if (continuationImpl instanceof ZoneInfoRepositoryImpl$tryFallbackCache$1) {
            zoneInfoRepositoryImpl$tryFallbackCache$1 = (ZoneInfoRepositoryImpl$tryFallbackCache$1) continuationImpl;
            int i2 = zoneInfoRepositoryImpl$tryFallbackCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneInfoRepositoryImpl$tryFallbackCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = zoneInfoRepositoryImpl$tryFallbackCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneInfoRepositoryImpl$tryFallbackCache$1.label;
                l lVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = zoneInfoParam.a;
                    String str2 = zoneInfoParam.b;
                    zoneInfoRepositoryImpl$tryFallbackCache$1.L$0 = exc;
                    zoneInfoRepositoryImpl$tryFallbackCache$1.L$1 = zoneInfoParam;
                    zoneInfoRepositoryImpl$tryFallbackCache$1.label = 1;
                    h hVar = this.e;
                    hVar.getClass();
                    if (str2 == null || evu0.J(str2)) {
                        obj = null;
                    } else {
                        hVar.b.getClass();
                        sjh sjhVar = uyj.a;
                        obj = tje.k0(mdh.b, new ZoneFallbackCache$getZoneInfo$2(hVar, str, str2, null), zoneInfoRepositoryImpl$tryFallbackCache$1);
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th2 = (Throwable) zoneInfoRepositoryImpl$tryFallbackCache$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            Zone zone = (Zone) obj;
                            t61 t61Var = lVar.c;
                            t61Var.getClass();
                            t61Var.a.a("Zone.Fallback.Success", new HashMap(), 1, new HashMap());
                            return zone;
                        } catch (Throwable th3) {
                            th = th3;
                            message = th.getMessage();
                            zf zfVar = lVar.d;
                            if (message == null) {
                                message = "";
                            }
                            zfVar.getClass();
                            HashMap hashMap = new HashMap();
                            hashMap.put(Constants.KEY_MESSAGE, message);
                            zfVar.a.a("Zone.Fallback.Failure", hashMap, 1, new HashMap());
                            throw th2;
                        }
                    }
                    zoneInfoParam = (ZoneInfoParam) zoneInfoRepositoryImpl$tryFallbackCache$1.L$1;
                    exc = (Throwable) zoneInfoRepositoryImpl$tryFallbackCache$1.L$0;
                    kotlin.b.b(obj);
                }
                cVar = (kotlinx.serialization.json.c) obj;
                if (cVar != null) {
                    t61 t61Var2 = lVar.c;
                    t61Var2.getClass();
                    t61Var2.a.a("Zone.Fallback.Missing", new HashMap(), 1, new HashMap());
                    throw exc;
                }
                try {
                    zoneInfoRepositoryImpl$tryFallbackCache$1.L$0 = exc;
                    zoneInfoRepositoryImpl$tryFallbackCache$1.L$1 = null;
                    zoneInfoRepositoryImpl$tryFallbackCache$1.L$2 = null;
                    zoneInfoRepositoryImpl$tryFallbackCache$1.label = 2;
                    obj = e(cVar, zoneInfoParam, zoneInfoRepositoryImpl$tryFallbackCache$1);
                    if (obj != coroutineSingletons) {
                        th2 = exc;
                        Zone zone2 = (Zone) obj;
                        t61 t61Var3 = lVar.c;
                        t61Var3.getClass();
                        t61Var3.a.a("Zone.Fallback.Success", new HashMap(), 1, new HashMap());
                        return zone2;
                    }
                    return coroutineSingletons;
                } catch (Throwable th4) {
                    Throwable th5 = exc;
                    th = th4;
                    th2 = th5;
                    message = th.getMessage();
                    zf zfVar2 = lVar.d;
                    if (message == null) {
                    }
                    zfVar2.getClass();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(Constants.KEY_MESSAGE, message);
                    zfVar2.a.a("Zone.Fallback.Failure", hashMap2, 1, new HashMap());
                    throw th2;
                }
            }
        }
        zoneInfoRepositoryImpl$tryFallbackCache$1 = new ZoneInfoRepositoryImpl$tryFallbackCache$1(this, continuationImpl);
        Object obj2 = zoneInfoRepositoryImpl$tryFallbackCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneInfoRepositoryImpl$tryFallbackCache$1.label;
        l lVar2 = this.b;
        if (i != 0) {
        }
        cVar = (kotlinx.serialization.json.c) obj2;
        if (cVar != null) {
        }
    }
}
