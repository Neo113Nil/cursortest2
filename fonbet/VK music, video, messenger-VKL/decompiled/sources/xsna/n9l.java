package xsna;

import android.content.Context;
import android.net.Uri;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.pathfinder.utils.DeepLinkThrowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import kotlin.collections.builders.MapBuilder;
import xsna.i9l;

/* compiled from: DeepLinkRouter.kt */
/* loaded from: classes4.dex */
public final class n9l implements g9l<gg50> {
    public final xnd a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final String e;
    public final Set<fgx> f;

    public n9l() {
        this(0);
    }

    public static void b(Map map, j9l j9lVar, bpn0 bpn0Var) {
        new com.vk.movika.sdk.base.observable.u(20);
        ((List) map.computeIfAbsent(j9lVar, new l9l())).add(bpn0Var);
    }

    public static i9l e(n9l n9lVar, hpu0 hpu0Var) {
        fgx fgxVar;
        n9lVar.getClass();
        CompletableFuture completableFuture = new CompletableFuture();
        Context context = hpu0Var.a;
        Uri uri = hpu0Var.b;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("launch_context", hpu0Var.c);
        yp80 yp80Var = hpu0Var.d;
        if (yp80Var != null) {
            mapBuilder.put("open_callback", yp80Var);
        }
        MapBuilder h = mapBuilder.h();
        m9l m9lVar = new m9l(1, completableFuture, CompletableFuture.class, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, "complete(Ljava/lang/Object;)Z", 8, 0);
        synchronized (n9lVar) {
            try {
                Set<fgx> set = n9lVar.f;
                ArrayList arrayList = new ArrayList(c5g.u(set, 10));
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((fgx) it.next()).d);
                }
                if (!arrayList.isEmpty()) {
                    zq90.a.a(new d5(7, uri, arrayList));
                }
                fgxVar = new fgx(n9lVar, context, uri, m9lVar);
                n9lVar.f.add(fgxVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        fgxVar.a = new LinkedHashMap(h);
        try {
            fgxVar.b();
        } catch (Throwable th2) {
            m9lVar.invoke(new i9l.a(new DeepLinkThrowable(fgxVar, th2)));
        }
        return (i9l) completableFuture.get(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
    }

    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        xcd xcdVar = new xcd(fgxVar, 15);
        fgx fgxVar2 = new fgx(fgxVar.d, new LinkedHashMap(fgxVar.a), fgxVar.e, new LinkedHashMap(fgxVar.f), fgxVar.g);
        fgxVar2.h = this;
        fgxVar2.i = xcdVar;
        fgxVar2.m = new ws90<>(e43.l(this.b, this.c, this.d).iterator());
        fgxVar2.b();
    }

    public final j9l c(j9l j9lVar) {
        return j9l.a(j9lVar, new uq90(j9lVar.a.a, !this.a.a ? j9lVar.a.b : drm0.W(j9lVar.a.b, DomExceptionUtils.SEPARATOR).concat("/?")));
    }

    public final void d(j9l j9lVar, h9l h9lVar) {
        b(this.c, c(j9lVar), new bpn0(new b1j(h9lVar, 4)));
    }

    public n9l(int i) {
        xnd xndVar = zq90.b;
        this.a = xndVar;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = xndVar.a ? "(/.*)?" : "/.*";
        this.f = Collections.newSetFromMap(new WeakHashMap());
    }
}
