package com.vungle.ads.internal.downloader;

import android.support.v4.media.session.PlaybackStateCompat;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.NoSpaceError;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.n;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.t;
import defpackage.k0;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import okhttp3.o;
import okhttp3.p;
import okhttp3.u;
import okhttp3.v;
import ru.ok.android.commons.http.Http;
import xsna.bn8;
import xsna.bpn0;
import xsna.d8f0;
import xsna.d9p;
import xsna.dsu;
import xsna.e8f0;
import xsna.f8f0;
import xsna.ji;
import xsna.mq9;
import xsna.n8f0;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class h implements m {
    public final com.vungle.ads.internal.executor.j a;
    public final PathProvider b;
    public final Lazy c = new bpn0(new g(this));
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();

    public h(com.vungle.ads.internal.executor.j jVar, PathProvider pathProvider) {
        this.a = jVar;
        this.b = pathProvider;
    }

    public final void a(k kVar, com.vungle.ads.internal.load.c cVar) {
        this.d.add(kVar);
        this.a.a(new f(kVar, this, cVar), new d9p(kVar, this, cVar, 1));
    }

    public static final void a(k kVar, h hVar, d dVar) {
        b bVar = new b(-1, new OutOfMemory("Failed to execute download request: " + kVar.a().h()), 4);
        if (dVar != null) {
            ((com.vungle.ads.internal.load.c) dVar).a(bVar, kVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0259, code lost:
    
        r21 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x025c, code lost:
    
        r5.b(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x025f, code lost:
    
        r24 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0369, code lost:
    
        r21.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0371, code lost:
    
        if (r5.b() != 1) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0373, code lost:
    
        r5.b(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0377, code lost:
    
        if (r31 == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0379, code lost:
    
        ((com.vungle.ads.internal.load.c) r31).a(r5, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0380, code lost:
    
        r0 = r15.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0382, code lost:
    
        if (r0 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0384, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0387, code lost:
    
        r14.cancel();
        com.vungle.ads.internal.util.n.a(r21);
        com.vungle.ads.internal.util.n.a(r24);
        r0 = com.vungle.ads.internal.util.u.a;
        r0 = com.iab.omid.library.vungle.internal.l.a("download status: ");
        r0.append(r5.b());
        com.vungle.ads.internal.util.t.a("AssetDownloader", r0.toString());
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0453 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b a(k kVar, d dVar) {
        d8f0 d8f0Var;
        bn8 bn8Var;
        okhttp3.d dVar2;
        com.vungle.ads.internal.model.b bVar;
        u uVar;
        v vVar;
        int b;
        v vVar2;
        long contentLength;
        long j;
        long j2;
        long j3;
        bn8 bn8Var2;
        long j4;
        int i;
        StringBuilder sb;
        com.vungle.ads.internal.model.b a = kVar.a();
        boolean z = com.vungle.ads.internal.util.u.a;
        StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("launch request in thread: ");
        a2.append(Thread.currentThread().getId());
        a2.append(" request: ");
        a2.append(a.h());
        t.a("AssetDownloader", a2.toString());
        if (kVar.e()) {
            StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("Request ");
            a3.append(a.h());
            a3.append(" is cancelled before starting");
            t.a("AssetDownloader", a3.toString());
            new c().b(3);
            return null;
        }
        c cVar = new c();
        cVar.c(System.currentTimeMillis());
        String h = a.h();
        String c = a.c();
        int i2 = -1;
        if (h.length() == 0 || !n.a(h)) {
            return new b(-1, new InvalidAssetUrlError(com.iab.omid.library.vungle.d.a("invalid url: ", h)).setLogEntry$vungle_ads_release(kVar.c()).logError$vungle_ads_release(), 4);
        }
        if (c.length() == 0) {
            return new b(-1, new AssetWriteError(com.iab.omid.library.vungle.d.a("invalid path: ", c)).setLogEntry$vungle_ads_release(kVar.c()).logError$vungle_ads_release(), 3);
        }
        long a4 = PathProvider.a(this.b.c().getAbsolutePath());
        if (a4 < ServiceProvider.HTTP_CACHE_DISK_SIZE) {
            new NoSpaceError(k0.a(a4, "Insufficient space ")).setLogEntry$vungle_ads_release(kVar.c()).logErrorNoReturnValue$vungle_ads_release();
            return new b(-1, new NoSpaceError(null, 1, null).setLogEntry$vungle_ads_release(kVar.c()).logError$vungle_ads_release(), 2);
        }
        File file = new File(c);
        if (file.exists()) {
            StringBuilder a5 = com.iab.omid.library.vungle.internal.l.a("Deleting existing file before download: ");
            a5.append(file.getAbsolutePath());
            t.a("AssetDownloader", a5.toString());
            if (!file.delete()) {
                return new b(-1, new AssetWriteError("Cannot delete partial file for restart").setLogEntry$vungle_ads_release(kVar.c()).logError$vungle_ads_release(), 2);
            }
        }
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                try {
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                } catch (Exception e) {
                    e = e;
                    bVar = a;
                    d8f0Var = null;
                    bn8Var = null;
                    dVar2 = null;
                    uVar = null;
                    boolean z2 = com.vungle.ads.internal.util.u.a;
                    t.b("AssetDownloader", "Download exception for " + bVar.h() + ": " + e);
                    cVar.b(7);
                    b bVar2 = new b(i2, e, 1);
                    if ((uVar == null ? uVar.h : null) != null) {
                    }
                    if (dVar2 != null) {
                    }
                    n.a(d8f0Var);
                    n.a(bn8Var);
                    t.a("AssetDownloader", "download status: " + cVar.b());
                    b = cVar.b();
                    if (b == 7) {
                    }
                    return bVar2;
                } catch (Throwable th) {
                    th = th;
                    d8f0Var = null;
                    bn8Var = null;
                    dVar2 = null;
                    uVar = null;
                    if ((uVar == null ? uVar.h : null) != null) {
                    }
                    if (dVar2 != null) {
                    }
                    n.a(d8f0Var);
                    n.a(bn8Var);
                    boolean z3 = com.vungle.ads.internal.util.u.a;
                    StringBuilder a6 = com.iab.omid.library.vungle.internal.l.a("download status: ");
                    a6.append(cVar.b());
                    t.a("AssetDownloader", a6.toString());
                    throw th;
                }
            }
            p.a aVar = new p.a();
            aVar.i(h);
            dVar2 = ((o) this.c.getValue()).a(aVar.b());
        } catch (Exception e2) {
            e = e2;
            bVar = a;
            d8f0Var = null;
            bn8Var = null;
            dVar2 = null;
        } catch (Throwable th2) {
            th = th2;
            d8f0Var = null;
            bn8Var = null;
            dVar2 = null;
        }
        try {
            f8f0 f8f0Var = (f8f0) dVar2;
            uVar = f8f0Var.execute();
            try {
                try {
                    i2 = uVar.e;
                    if (uVar.t()) {
                        if (uVar.j != null) {
                            AnalyticsClient.INSTANCE.a(new m2(Sdk.SDKMetric.SDKMetricType.CACHED_ASSETS_USED), kVar.c(), h);
                            s3q0 s3q0Var = s3q0.a;
                        }
                        v a7 = a(uVar);
                        String a8 = uVar.g.a("Content-Type");
                        if (a8 == null) {
                            a8 = null;
                        }
                        if (a8 != null) {
                            kVar.a().a(a8);
                            s3q0 s3q0Var2 = s3q0.a;
                        }
                        bn8Var = a7 != null ? a7.source() : null;
                        try {
                            t.a("AssetDownloader", "Start download from url: " + h + " mimeType=" + a8);
                            try {
                                d8f0Var = new d8f0(mq9.c(file));
                                if (a7 != null) {
                                    try {
                                        try {
                                            contentLength = a7.contentLength();
                                        } catch (Exception e3) {
                                            e = e3;
                                            bVar = a;
                                            boolean z22 = com.vungle.ads.internal.util.u.a;
                                            t.b("AssetDownloader", "Download exception for " + bVar.h() + ": " + e);
                                            cVar.b(7);
                                            b bVar22 = new b(i2, e, 1);
                                            if ((uVar == null ? uVar.h : null) != null) {
                                            }
                                            if (dVar2 != null) {
                                            }
                                            n.a(d8f0Var);
                                            n.a(bn8Var);
                                            t.a("AssetDownloader", "download status: " + cVar.b());
                                            b = cVar.b();
                                            if (b == 7) {
                                            }
                                            return bVar22;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if ((uVar == null ? uVar.h : null) != null && (vVar = uVar.h) != null) {
                                            vVar.close();
                                            s3q0 s3q0Var3 = s3q0.a;
                                        }
                                        if (dVar2 != null) {
                                            ((f8f0) dVar2).cancel();
                                            s3q0 s3q0Var4 = s3q0.a;
                                        }
                                        n.a(d8f0Var);
                                        n.a(bn8Var);
                                        boolean z32 = com.vungle.ads.internal.util.u.a;
                                        StringBuilder a62 = com.iab.omid.library.vungle.internal.l.a("download status: ");
                                        a62.append(cVar.b());
                                        t.a("AssetDownloader", a62.toString());
                                        throw th;
                                    }
                                } else {
                                    contentLength = 0;
                                }
                                try {
                                    cVar.b(0);
                                    cVar.b(contentLength);
                                    d8f0 d8f0Var2 = d8f0Var;
                                    try {
                                        try {
                                            cVar.a(0L);
                                            cVar.a(0);
                                            a.a(contentLength);
                                            if (dVar != null) {
                                                try {
                                                    ((com.vungle.ads.internal.load.c) dVar).a(cVar, kVar);
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    bVar = a;
                                                    d8f0Var = d8f0Var2;
                                                    boolean z222 = com.vungle.ads.internal.util.u.a;
                                                    t.b("AssetDownloader", "Download exception for " + bVar.h() + ": " + e);
                                                    cVar.b(7);
                                                    b bVar222 = new b(i2, e, 1);
                                                    if ((uVar == null ? uVar.h : null) != null) {
                                                    }
                                                    if (dVar2 != null) {
                                                    }
                                                    n.a(d8f0Var);
                                                    n.a(bn8Var);
                                                    t.a("AssetDownloader", "download status: " + cVar.b());
                                                    b = cVar.b();
                                                    if (b == 7) {
                                                    }
                                                    return bVar222;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    d8f0Var = d8f0Var2;
                                                    if ((uVar == null ? uVar.h : null) != null) {
                                                        vVar.close();
                                                        s3q0 s3q0Var32 = s3q0.a;
                                                    }
                                                    if (dVar2 != null) {
                                                    }
                                                    n.a(d8f0Var);
                                                    n.a(bn8Var);
                                                    boolean z322 = com.vungle.ads.internal.util.u.a;
                                                    StringBuilder a622 = com.iab.omid.library.vungle.internal.l.a("download status: ");
                                                    a622.append(cVar.b());
                                                    t.a("AssetDownloader", a622.toString());
                                                    throw th;
                                                }
                                            }
                                            int i3 = 0;
                                            long j5 = 0;
                                            while (true) {
                                                if (bn8Var != null) {
                                                    j = j5;
                                                    d8f0Var = d8f0Var2;
                                                    j2 = contentLength;
                                                    j3 = bn8Var.read(d8f0Var.c, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                                                } else {
                                                    j = j5;
                                                    j2 = contentLength;
                                                    d8f0Var = d8f0Var2;
                                                    j3 = -1;
                                                }
                                                s3q0 s3q0Var5 = s3q0.a;
                                                if (j3 <= 0) {
                                                    d8f0Var2 = d8f0Var;
                                                    break;
                                                }
                                                if (kVar.e()) {
                                                    break;
                                                }
                                                d8f0Var2 = d8f0Var;
                                                if (file.exists()) {
                                                    cVar.b(1);
                                                    d8f0Var2.t3();
                                                    d8f0Var2.flush();
                                                    long j6 = j + j3;
                                                    cVar.a(j6);
                                                    Long f = a.f();
                                                    long longValue = f != null ? f.longValue() : a.g();
                                                    if (!a.o() || j6 < longValue) {
                                                        bVar = a;
                                                        bn8Var2 = bn8Var;
                                                    } else {
                                                        boolean z4 = com.vungle.ads.internal.util.u.a;
                                                        bVar = a;
                                                        try {
                                                            sb = new StringBuilder();
                                                            bn8Var2 = bn8Var;
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                            d8f0Var = d8f0Var2;
                                                            boolean z2222 = com.vungle.ads.internal.util.u.a;
                                                            t.b("AssetDownloader", "Download exception for " + bVar.h() + ": " + e);
                                                            cVar.b(7);
                                                            b bVar2222 = new b(i2, e, 1);
                                                            if ((uVar == null ? uVar.h : null) != null && (vVar2 = uVar.h) != null) {
                                                                vVar2.close();
                                                                s3q0 s3q0Var6 = s3q0.a;
                                                            }
                                                            if (dVar2 != null) {
                                                                ((f8f0) dVar2).cancel();
                                                                s3q0 s3q0Var7 = s3q0.a;
                                                            }
                                                            n.a(d8f0Var);
                                                            n.a(bn8Var);
                                                            t.a("AssetDownloader", "download status: " + cVar.b());
                                                            b = cVar.b();
                                                            if (b == 7 || b == 0) {
                                                                return bVar2222;
                                                            }
                                                            if (b != 3) {
                                                                t.a("AssetDownloader", "On cancel " + kVar);
                                                                if (dVar != null) {
                                                                    ((com.vungle.ads.internal.load.c) dVar).a(cVar, kVar);
                                                                }
                                                            } else {
                                                                t.a("AssetDownloader", "On success " + kVar);
                                                                if (dVar != null) {
                                                                    ((com.vungle.ads.internal.load.c) dVar).a(file, kVar);
                                                                }
                                                                int b2 = kVar.b();
                                                                if (b2 > 0) {
                                                                    AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                                                                    Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS;
                                                                    s c2 = kVar.c();
                                                                    StringBuilder b3 = ji.b(b2, "retryCount=", " url=");
                                                                    b3.append(kVar.a().h());
                                                                    analyticsClient.c(sDKMetricType, 1L, c2, b3.toString());
                                                                }
                                                            }
                                                            return null;
                                                        }
                                                        try {
                                                            sb.append("Downloader totalRead=");
                                                            sb.append(j6);
                                                            sb.append(" requiredBytes=");
                                                            sb.append(longValue);
                                                            t.b("AssetDownloader", sb.toString());
                                                            bVar.p();
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            d8f0Var = d8f0Var2;
                                                            bn8Var = bn8Var2;
                                                            boolean z22222 = com.vungle.ads.internal.util.u.a;
                                                            t.b("AssetDownloader", "Download exception for " + bVar.h() + ": " + e);
                                                            cVar.b(7);
                                                            b bVar22222 = new b(i2, e, 1);
                                                            if ((uVar == null ? uVar.h : null) != null) {
                                                            }
                                                            if (dVar2 != null) {
                                                            }
                                                            n.a(d8f0Var);
                                                            n.a(bn8Var);
                                                            t.a("AssetDownloader", "download status: " + cVar.b());
                                                            b = cVar.b();
                                                            if (b == 7) {
                                                            }
                                                            return bVar22222;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            d8f0Var = d8f0Var2;
                                                            bn8Var = bn8Var2;
                                                            if ((uVar == null ? uVar.h : null) != null) {
                                                            }
                                                            if (dVar2 != null) {
                                                            }
                                                            n.a(d8f0Var);
                                                            n.a(bn8Var);
                                                            boolean z3222 = com.vungle.ads.internal.util.u.a;
                                                            StringBuilder a6222 = com.iab.omid.library.vungle.internal.l.a("download status: ");
                                                            a6222.append(cVar.b());
                                                            t.a("AssetDownloader", a6222.toString());
                                                            throw th;
                                                        }
                                                    }
                                                    if (j2 > 0) {
                                                        j4 = j6;
                                                        i = (int) ((100 * j4) / j2);
                                                    } else {
                                                        j4 = j6;
                                                        i = i3;
                                                    }
                                                    while (cVar.a() + 1 <= Math.min(i, 100)) {
                                                        cVar.b(1);
                                                        cVar.a(cVar.a() + 1);
                                                        if (cVar.a() >= 100) {
                                                            cVar.b(4);
                                                        }
                                                        if (dVar != null) {
                                                            ((com.vungle.ads.internal.load.c) dVar).a(cVar, kVar);
                                                        }
                                                    }
                                                    i3 = i;
                                                    a = bVar;
                                                    bn8Var = bn8Var2;
                                                    contentLength = j2;
                                                    j5 = j4;
                                                } else {
                                                    new AssetWriteError("Asset save error " + h).setLogEntry$vungle_ads_release(kVar.c()).logErrorNoReturnValue$vungle_ads_release();
                                                    throw new l("File is not existing");
                                                }
                                            }
                                        } catch (Exception e7) {
                                            e = e7;
                                            bVar = a;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                } catch (Exception e8) {
                                    e = e8;
                                    bVar = a;
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                            } catch (Exception e9) {
                                e = e9;
                                bVar = a;
                                bn8Var = bn8Var;
                                d8f0Var = null;
                                boolean z222222 = com.vungle.ads.internal.util.u.a;
                                t.b("AssetDownloader", "Download exception for " + bVar.h() + ": " + e);
                                cVar.b(7);
                                b bVar222222 = new b(i2, e, 1);
                                if ((uVar == null ? uVar.h : null) != null) {
                                }
                                if (dVar2 != null) {
                                }
                                n.a(d8f0Var);
                                n.a(bn8Var);
                                t.a("AssetDownloader", "download status: " + cVar.b());
                                b = cVar.b();
                                if (b == 7) {
                                }
                                return bVar222222;
                            } catch (Throwable th8) {
                                th = th8;
                                bn8Var = bn8Var;
                                d8f0Var = null;
                                if ((uVar == null ? uVar.h : null) != null) {
                                }
                                if (dVar2 != null) {
                                }
                                n.a(d8f0Var);
                                n.a(bn8Var);
                                boolean z32222 = com.vungle.ads.internal.util.u.a;
                                StringBuilder a62222 = com.iab.omid.library.vungle.internal.l.a("download status: ");
                                a62222.append(cVar.b());
                                t.a("AssetDownloader", a62222.toString());
                                throw th;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            bVar = a;
                        } catch (Throwable th9) {
                            th = th9;
                        }
                    } else {
                        bVar = a;
                        try {
                            throw new l(uVar.d);
                        } catch (Exception e11) {
                            e = e11;
                            d8f0Var = null;
                            bn8Var = null;
                            boolean z2222222 = com.vungle.ads.internal.util.u.a;
                            t.b("AssetDownloader", "Download exception for " + bVar.h() + ": " + e);
                            cVar.b(7);
                            b bVar2222222 = new b(i2, e, 1);
                            if ((uVar == null ? uVar.h : null) != null) {
                                vVar2.close();
                                s3q0 s3q0Var62 = s3q0.a;
                            }
                            if (dVar2 != null) {
                            }
                            n.a(d8f0Var);
                            n.a(bn8Var);
                            t.a("AssetDownloader", "download status: " + cVar.b());
                            b = cVar.b();
                            if (b == 7) {
                                if (b != 3) {
                                }
                                return null;
                            }
                            return bVar2222222;
                        }
                    }
                } catch (Throwable th10) {
                    th = th10;
                    d8f0Var = null;
                    bn8Var = null;
                }
            } catch (Exception e12) {
                e = e12;
                bVar = a;
            }
        } catch (Exception e13) {
            e = e13;
            bVar = a;
            d8f0Var = null;
            bn8Var = null;
            uVar = null;
            boolean z22222222 = com.vungle.ads.internal.util.u.a;
            t.b("AssetDownloader", "Download exception for " + bVar.h() + ": " + e);
            cVar.b(7);
            b bVar22222222 = new b(i2, e, 1);
            if ((uVar == null ? uVar.h : null) != null) {
            }
            if (dVar2 != null) {
            }
            n.a(d8f0Var);
            n.a(bn8Var);
            t.a("AssetDownloader", "download status: " + cVar.b());
            b = cVar.b();
            if (b == 7) {
            }
            return bVar22222222;
        } catch (Throwable th11) {
            th = th11;
            d8f0Var = null;
            bn8Var = null;
            uVar = null;
            if ((uVar == null ? uVar.h : null) != null) {
            }
            if (dVar2 != null) {
            }
            n.a(d8f0Var);
            n.a(bn8Var);
            boolean z322222 = com.vungle.ads.internal.util.u.a;
            StringBuilder a622222 = com.iab.omid.library.vungle.internal.l.a("download status: ");
            a622222.append(cVar.b());
            t.a("AssetDownloader", a622222.toString());
            throw th;
        }
    }

    public static v a(u uVar) {
        v vVar = uVar.h;
        okhttp3.k kVar = uVar.g;
        String a = kVar.a(Http.Header.CONTENT_ENCODING);
        if (a == null) {
            a = null;
        }
        if (!Http.ContentEncoding.GZIP.equalsIgnoreCase(a) || vVar == null) {
            return vVar;
        }
        dsu dsuVar = new dsu(vVar.source());
        String a2 = kVar.a("Content-Type");
        return new n8f0(a2 != null ? a2 : null, -1L, new e8f0(dsuVar));
    }
}
