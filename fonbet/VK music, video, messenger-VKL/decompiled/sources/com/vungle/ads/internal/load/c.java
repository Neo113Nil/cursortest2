package com.vungle.ads.internal.load;

import com.vungle.ads.AssetRequestError;
import com.vungle.ads.PrivacyIconFallbackError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import xsna.ifw;
import xsna.k9x;
import xsna.ugr;

/* loaded from: classes7.dex */
public final class c implements com.vungle.ads.internal.downloader.d {
    public boolean a;
    public final /* synthetic */ g b;

    public c(g gVar) {
        this.b = gVar;
    }

    public final void a(com.vungle.ads.internal.downloader.k kVar) {
        boolean z = u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onStart called: ");
        a.append(kVar.a().h());
        t.c("BaseAdLoader", a.toString());
        kVar.f();
    }

    public final void a(com.vungle.ads.internal.downloader.c cVar, com.vungle.ads.internal.downloader.k kVar) {
        com.vungle.ads.internal.model.b a = kVar.a();
        Integer e = a.e();
        boolean z = u.a;
        t.a("BaseAdLoader", "Download progress: " + cVar + " url: " + a.h());
        if (this.a || e == null || cVar.a() < e.intValue()) {
            return;
        }
        this.a = true;
        if (new k9x(1, 99, 1).e(e.intValue())) {
            kVar.h();
        }
        t.c("BaseAdLoader", "Download progress: hit chunk percentage=" + e + " for url: " + a.h());
        if (a.n()) {
            ((com.vungle.ads.internal.executor.d) this.b.g()).b().execute(new ugr(8, this.b, a));
        }
    }

    public static final void a(g gVar, com.vungle.ads.internal.model.b bVar) {
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        AtomicBoolean atomicBoolean;
        linkedHashSet = gVar.i;
        linkedHashSet.remove(bVar.h());
        linkedHashSet2 = gVar.i;
        if (linkedHashSet2.isEmpty()) {
            atomicBoolean = gVar.p;
            if (atomicBoolean.get()) {
                g.g(gVar);
            } else {
                gVar.a();
                gVar.a(new AssetRequestError("Failed to download required assets."));
            }
        }
    }

    public final void a(com.vungle.ads.internal.downloader.b bVar, com.vungle.ads.internal.downloader.k kVar) {
        boolean z = u.a;
        t.b("BaseAdLoader", "onError called: " + bVar);
        ((com.vungle.ads.internal.executor.d) this.b.g()).b().execute(new ifw(kVar, this.b, this, bVar, 1));
    }

    public static final void a(com.vungle.ads.internal.downloader.k kVar, g gVar, c cVar, com.vungle.ads.internal.downloader.b bVar) {
        AtomicBoolean atomicBoolean;
        AtomicLong atomicLong;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        AtomicBoolean atomicBoolean2;
        com.vungle.ads.internal.model.b a = kVar.a();
        if (a.m()) {
            File a2 = com.vungle.ads.internal.downloader.i.a(gVar.f().getVmDir());
            if (a2 != null && a2.exists()) {
                cVar.a(a2, kVar);
                return;
            }
            new PrivacyIconFallbackError("Failed to inject default privacy icon").setLogEntry$vungle_ads_release(gVar.e()).logErrorNoReturnValue$vungle_ads_release();
        }
        a.a(com.vungle.ads.internal.model.a.DOWNLOAD_FAILED);
        atomicBoolean = gVar.o;
        atomicBoolean.set(false);
        if (a.n()) {
            atomicBoolean2 = gVar.p;
            atomicBoolean2.set(false);
        }
        StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("Failed to download assets ");
        a3.append(a.h());
        a3.append(". error: ");
        a3.append(bVar);
        a3.append(" errorType=");
        a3.append(com.vungle.ads.internal.platform.e.a(bVar != null ? bVar.a() : null));
        a3.append(" proxyEnabled=");
        a3.append(com.vungle.ads.internal.platform.e.e(gVar.d()));
        a3.append(" privateDns=");
        a3.append(com.vungle.ads.internal.platform.e.b(gVar.d()));
        a3.append(" network=");
        a3.append(com.vungle.ads.internal.platform.e.a(gVar.d()));
        new AssetRequestError(a3.toString()).setLogEntry$vungle_ads_release(gVar.e()).logErrorNoReturnValue$vungle_ads_release();
        if (a.n()) {
            linkedHashSet = gVar.i;
            linkedHashSet.remove(kVar.a().h());
            linkedHashSet2 = gVar.i;
            if (linkedHashSet2.isEmpty()) {
                gVar.a();
                gVar.a(new AssetRequestError("Error: Failed to download required assets."));
                return;
            }
        }
        atomicLong = gVar.h;
        if (atomicLong.decrementAndGet() <= 0) {
            gVar.a(new AssetRequestError("Error: Failed to download assets."));
        }
    }

    public final void a(final File file, final com.vungle.ads.internal.downloader.k kVar) {
        com.vungle.ads.internal.executor.j b = ((com.vungle.ads.internal.executor.d) this.b.g()).b();
        final g gVar = this.b;
        b.execute(new Runnable() { // from class: xsna.xhy0
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.internal.load.c.a(file, this, kVar, gVar);
            }
        });
    }

    public static final void a(File file, c cVar, com.vungle.ads.internal.downloader.k kVar, g gVar) {
        m2 m2Var;
        m2 m2Var2;
        AtomicLong atomicLong;
        AtomicBoolean atomicBoolean;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        AtomicBoolean atomicBoolean2;
        AtomicBoolean atomicBoolean3;
        AtomicBoolean atomicBoolean4;
        m2 m2Var3;
        m2 m2Var4;
        if (!file.exists()) {
            cVar.a(new com.vungle.ads.internal.downloader.b(-1, new IOException("Downloaded file not found!"), 3), kVar);
            return;
        }
        com.vungle.ads.internal.model.b a = kVar.a();
        a.b(file.length());
        a.a(com.vungle.ads.internal.model.a.DOWNLOAD_SUCCESS);
        Integer e = a.e();
        if (e == null || e.intValue() == 0 || e.intValue() == 100) {
            kVar.h();
        }
        if (a.j()) {
            kVar.i();
            m2Var3 = gVar.s;
            m2Var3.a(Long.valueOf(file.length()));
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            m2Var4 = gVar.s;
            analyticsClient.a(m2Var4, gVar.e(), a.h());
        } else if (a.l()) {
            m2Var = gVar.r;
            m2Var.a(Long.valueOf(file.length()));
            AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
            m2Var2 = gVar.r;
            analyticsClient2.a(m2Var2, gVar.e(), a.h());
        }
        h0 c = gVar.c();
        if (c != null) {
            c.a(file, a.a());
        }
        if (a.j() && !g.a(gVar, a, gVar.c())) {
            atomicBoolean3 = gVar.o;
            atomicBoolean3.set(false);
            if (a.n()) {
                atomicBoolean4 = gVar.p;
                atomicBoolean4.set(false);
            }
        }
        if (a.n()) {
            linkedHashSet = gVar.i;
            linkedHashSet.remove(a.h());
            linkedHashSet2 = gVar.i;
            if (linkedHashSet2.isEmpty()) {
                atomicBoolean2 = gVar.p;
                if (atomicBoolean2.get()) {
                    g.g(gVar);
                } else {
                    gVar.a();
                    gVar.a(new AssetRequestError("Failed to download required assets."));
                    return;
                }
            }
        }
        atomicLong = gVar.h;
        if (atomicLong.decrementAndGet() <= 0) {
            atomicBoolean = gVar.o;
            if (atomicBoolean.get()) {
                g.a(gVar, gVar.b());
            } else {
                gVar.a(new AssetRequestError("Failed to download assets."));
            }
        }
    }
}
