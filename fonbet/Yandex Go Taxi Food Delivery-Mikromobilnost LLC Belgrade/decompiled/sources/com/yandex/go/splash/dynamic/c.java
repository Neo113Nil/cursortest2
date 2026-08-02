package com.yandex.go.splash.dynamic;

import android.graphics.Bitmap;
import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.go.image.domain.requests.e;
import com.yandex.go.splash.data.dto.DynamicSplash;
import com.yandex.go.splash.data.dto.SplashScreenShowPolicy;
import defpackage.aev;
import defpackage.bg5;
import defpackage.cne0;
import defpackage.dei0;
import defpackage.dne0;
import defpackage.e2t;
import defpackage.e9n;
import defpackage.ec1;
import defpackage.f9n;
import defpackage.gqt0;
import defpackage.hk20;
import defpackage.iei0;
import defpackage.j9n;
import defpackage.jtq0;
import defpackage.k9n;
import defpackage.kei0;
import defpackage.lei0;
import defpackage.m16;
import defpackage.mdh;
import defpackage.nbj;
import defpackage.obv;
import defpackage.pav;
import defpackage.po21;
import defpackage.qv10;
import defpackage.r5r;
import defpackage.rac;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tbv;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vac;
import defpackage.vez0;
import defpackage.wf7;
import defpackage.xv11;
import defpackage.zy11;
import java.io.File;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class c {
    public final jtq0 a;
    public final pav b;
    public final tt2 c;
    public final e9n d;
    public final gqt0 e;
    public final f9n f;
    public final e2t g;
    public final bg5 h;
    public final po21 i;
    public final xv11 j;
    public final nbj k;
    public final cne0 l;
    public final AtomicReference m = new AtomicReference(null);
    public final AtomicReference n = new AtomicReference(null);
    public final AtomicReference o = new AtomicReference(EmptyList.a);

    public c(jtq0 jtq0Var, pav pavVar, dne0 dne0Var, tt2 tt2Var, e9n e9nVar, gqt0 gqt0Var, f9n f9nVar, e2t e2tVar, bg5 bg5Var, po21 po21Var, xv11 xv11Var, nbj nbjVar) {
        this.a = jtq0Var;
        this.b = pavVar;
        this.c = tt2Var;
        this.d = e9nVar;
        this.e = gqt0Var;
        this.f = f9nVar;
        this.g = e2tVar;
        this.h = bg5Var;
        this.i = po21Var;
        this.j = xv11Var;
        this.k = nbjVar;
        this.l = dne0Var.a("dynamic_splash_screen_prefs");
    }

    public static final void a(c cVar, DynamicSplash dynamicSplash, String str, String str2, String str3, String str4, long j) {
        cVar.getClass();
        try {
            e h = cVar.b.h();
            obv obvVar = new obv(str, null, 6, 0);
            h.getClass();
            tbv f0 = vez0.f0(obvVar);
            tbv S = f0 != null ? vez0.S(f0, h.a, h.c) : null;
            aev aevVar = h.d;
            aevVar.c = S;
            h.d = aevVar;
            ec1 ec1Var = new ec1(cVar, dynamicSplash, j, 5);
            aevVar.e = new rac(ec1Var, ec1Var, h, new j9n(cVar, str2, dynamicSplash, str3, str4, j));
            ((coil3.c) h.b).a(aevVar.a());
            m16 m16Var = vac.a;
        } catch (Exception unused) {
            cVar.e.a(j, dynamicSplash.a);
        }
    }

    public static final Object b(c cVar, sls slsVar, List list, Continuation continuation) {
        Bitmap bitmap;
        int i;
        cne0 cne0Var = cVar.l;
        if (cne0Var.h("transparent_height/") == 0.0f && (bitmap = (Bitmap) slsVar.invoke()) != null) {
            int height = bitmap.getHeight();
            loop0: while (true) {
                height--;
                if (-1 >= height) {
                    break;
                }
                int width = bitmap.getWidth() / 2;
                if (width >= 0) {
                    while (bitmap.getPixel(i, height) == 0) {
                        i = i != width ? i + 1 : 0;
                    }
                    cne0Var.d().putFloat("transparent_height/", (bitmap.getHeight() - height) * 1.3f).apply();
                    break loop0;
                }
            }
        }
        cVar.c.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new DynamicSplashRepository$cacheImages$2(list, cVar, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final DynamicSplash c() {
        cne0 cne0Var;
        Object failure;
        String e;
        Object failure2;
        AtomicReference atomicReference = this.m;
        if (atomicReference.get() != null) {
            return (DynamicSplash) atomicReference.get();
        }
        List list = (List) ((hk20) this.f.a.getValue()).c();
        this.o.set(list);
        List<DynamicSplash> list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            cne0Var = this.l;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            DynamicSplash dynamicSplash = (DynamicSplash) next;
            SplashScreenShowPolicy splashScreenShowPolicy = dynamicSplash.f;
            String str = dynamicSplash.a;
            Calendar b = splashScreenShowPolicy.getB();
            jtq0 jtq0Var = this.a;
            if (b == null || splashScreenShowPolicy.getC() == null || wf7.d(jtq0Var.b(null), splashScreenShowPolicy.getB(), splashScreenShowPolicy.getC())) {
                String d = splashScreenShowPolicy.getD();
                if (d != null) {
                    try {
                        failure = LocalTime.parse(d);
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    LocalTime localTime = (LocalTime) failure;
                    if (localTime != null && (e = splashScreenShowPolicy.getE()) != null) {
                        try {
                            failure2 = LocalTime.parse(e);
                        } catch (Throwable th2) {
                            failure2 = new Result.Failure(th2);
                        }
                        if (failure2 instanceof Result.Failure) {
                            failure2 = null;
                        }
                        LocalTime localTime2 = (LocalTime) failure2;
                        if (localTime2 != null) {
                            LocalTime localTime3 = Instant.ofEpochMilli(jtq0Var.d()).atZone(ZoneId.systemDefault()).toLocalTime();
                            if (localTime.compareTo(localTime2) <= 0) {
                                if (localTime3.compareTo(localTime) >= 0 && localTime3.compareTo(localTime2) <= 0) {
                                }
                            } else if (localTime3.compareTo(localTime) < 0 && localTime3.compareTo(localTime2) > 0) {
                            }
                        }
                    }
                }
                if (splashScreenShowPolicy.getA() > qv10.d("show_count/", str, cne0Var, 0) || splashScreenShowPolicy.getA() == -1) {
                    if (dynamicSplash.d != null) {
                        String l = cne0Var.l("top_image/" + str, null);
                        if (l == null) {
                            l = "";
                        }
                        if (new File(l).exists()) {
                        }
                    }
                    if (dynamicSplash.e != null) {
                        String l2 = cne0Var.l("background_image/" + str, null);
                        if (new File(l2 != null ? l2 : "").exists()) {
                        }
                    }
                    arrayList.add(next);
                }
            }
        }
        DynamicSplash dynamicSplash2 = (DynamicSplash) kotlin.collections.a.R(kotlin.collections.a.x0(arrayList, new k9n()));
        this.n.set(dynamicSplash2 != null ? dynamicSplash2.a : null);
        for (DynamicSplash dynamicSplash3 : list2) {
            String str2 = dynamicSplash3.a;
            Map map = dynamicSplash3.k;
            gqt0 gqt0Var = this.e;
            dei0 dei0Var = gqt0Var.b;
            dei0 dei0Var2 = gqt0Var.b;
            CreativeType creativeType = CreativeType.Splash;
            ((com.yandex.go.analytics.realtime.a) dei0Var).d(new lei0(creativeType, str2 == null ? "" : str2, map));
            boolean equals = dynamicSplash3.equals(dynamicSplash2);
            Map map2 = dynamicSplash3.k;
            if (equals) {
                ((com.yandex.go.analytics.realtime.a) dei0Var2).d(new iei0(creativeType, str2 == null ? "" : str2, map2, null, 18));
            } else {
                String str3 = dynamicSplash2 != null ? dynamicSplash2.a : null;
                if (str3 == null) {
                    str3 = "";
                }
                if (str2 == null) {
                    str2 = "";
                }
                ((com.yandex.go.analytics.realtime.a) dei0Var2).d(new kei0(creativeType, str2, new r5r(str3, creativeType), map2));
            }
        }
        atomicReference.set(dynamicSplash2 != null ? new DynamicSplash(dynamicSplash2.a, dynamicSplash2.b, dynamicSplash2.c, dynamicSplash2.d, dynamicSplash2.e, dynamicSplash2.f, dynamicSplash2.g, dynamicSplash2.h, dynamicSplash2.i, dynamicSplash2.j, dynamicSplash2.k, cne0Var.h("transparent_height/")) : null);
        return (DynamicSplash) atomicReference.get();
    }
}
