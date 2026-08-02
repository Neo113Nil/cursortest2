package xsna;

import android.content.Context;
import androidx.media3.datasource.a;
import androidx.media3.datasource.c;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.n;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import one.video.exo.offline.DownloadInfo;
import one.video.player.model.VideoContentType;
import xsna.gqg0;
import xsna.ink;

/* compiled from: MediaSourceFactoryBuilder.kt */
/* loaded from: classes8.dex */
public final class sy10 {
    public final Context a;
    public final sht0 b;
    public final ink.a c;
    public v7s0 d;
    public Cache e;
    public fe60 f;
    public one.video.player.i g;
    public qo10 h;
    public j1d0 i;
    public usk j;
    public lj00 k;
    public androidx.media3.exoplayer.upstream.b l;
    public z0d0 m;
    public mm80 n;
    public boolean o;

    /* compiled from: MediaSourceFactoryBuilder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoContentType.values().length];
            try {
                iArr[VideoContentType.MP4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoContentType.HLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoContentType.DASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoContentType.RTMP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoContentType.OFFLINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoContentType.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VideoContentType.FRAME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public sy10(Context context, sht0 sht0Var, ink.a aVar) {
        this.a = context;
        this.b = sht0Var;
        this.c = aVar;
        int i = wn80.a;
        this.h = new rhh0(8);
        this.l = new androidx.media3.exoplayer.upstream.a();
    }

    public static int c(sht0 sht0Var) {
        switch (a.$EnumSwitchMapping$0[sht0Var.a.ordinal()]) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
                return 4;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final a.b a(sht0 sht0Var, ink.a aVar) {
        CacheDataSink.a aVar2;
        z0d0 z0d0Var;
        j1d0 j1d0Var = this.i;
        if (j1d0Var == null || this.o) {
            z0d0 z0d0Var2 = this.m;
            if (z0d0Var2 == null || !(sht0Var instanceof dbn)) {
                k7s0 d = d(sht0Var);
                if (d != null) {
                    a.b bVar = new a.b();
                    androidx.media3.datasource.cache.c cVar = d.c;
                    bVar.a = cVar;
                    bVar.c = d.d;
                    bVar.e = aVar;
                    bVar.h = 2;
                    if (d.b.a) {
                        aVar2 = new CacheDataSink.a();
                        aVar2.a(cVar);
                    } else {
                        aVar2 = null;
                    }
                    bVar.d(aVar2);
                    bVar.f = null;
                    bVar.g = -1000;
                    return bVar;
                }
            } else if (j1d0Var == null || this.o) {
                boolean z = z0d0Var2.d;
                if (sht0Var != null && z && (z0d0Var = this.m) != null) {
                    dbn dbnVar = (dbn) sht0Var;
                    van vanVar = z0d0Var.h;
                    if (z0d0Var.d && vanVar != null) {
                        return vanVar.b(aVar, true, dbnVar);
                    }
                }
            }
        }
        return null;
    }

    public final i.a b(sht0 sht0Var) {
        van vanVar;
        z0d0 z0d0Var;
        i.a aVar;
        i.a aVar2;
        kr10 d;
        androidx.media3.exoplayer.source.i d2;
        kr10 d3;
        androidx.media3.exoplayer.source.i d4;
        a.b bVar;
        if (sht0Var instanceof zfd) {
            zfd zfdVar = (zfd) sht0Var;
            sht0 sht0Var2 = zfdVar.d;
            ClippingMediaSource.a aVar3 = new ClippingMediaSource.a(b(sht0Var2).d(kr10.b(sht0Var2.b)));
            long j = zfdVar.e;
            fxc0.p(j >= 0);
            fxc0.z(!aVar3.e);
            aVar3.b = j;
            long j2 = zfdVar.f;
            fxc0.z(!aVar3.e);
            aVar3.c = j2;
            fxc0.z(!aVar3.e);
            aVar3.d = false;
            aVar3.e = true;
            return new krj0(new ClippingMediaSource(aVar3), c(sht0Var));
        }
        Cache cache = null;
        cache = null;
        switch (a.$EnumSwitchMapping$0[sht0Var.a.ordinal()]) {
            case 1:
                sht0 sht0Var3 = this.b;
                ink.a aVar4 = this.c;
                a.b a2 = a(sht0Var3, aVar4);
                if (a2 != null) {
                    aVar4 = a2;
                }
                aVar2 = new n.b(aVar4);
                aVar2.c(false);
                return aVar2;
            case 2:
                sht0 sht0Var4 = this.b;
                ink.a aVar5 = this.c;
                a.b a3 = a(sht0Var4, aVar5);
                if (a3 != null) {
                    aVar5 = a3;
                }
                HlsMediaSource.Factory factory = new HlsMediaSource.Factory(aVar5);
                factory.e = new gl80(this.f, this.g, this.k);
                aVar2 = factory;
                aVar2.c(false);
                return aVar2;
            case 3:
                if (this.m == null || !(sht0Var instanceof dbn)) {
                    ink.a aVar6 = this.c;
                    a.b a4 = a(sht0Var, aVar6);
                    if (a4 != null) {
                        aVar6 = a4;
                    }
                    k7s0 d5 = d(sht0Var);
                    if (d5 != null && d5.b.b) {
                        cache = d5.c;
                    }
                    lsk lskVar = new lsk();
                    if (this.i == null || this.o) {
                        if (cache == null) {
                            cache = this.e;
                        }
                        lskVar.a = cache;
                    }
                    lskVar.c = this.h;
                    if (d5 != null) {
                        lskVar.b = d5.d;
                    }
                    DashMediaSource.Factory factory2 = new DashMediaSource.Factory(lskVar.a(aVar6), aVar6);
                    factory2.h = this.j;
                    androidx.media3.exoplayer.upstream.b bVar2 = this.l;
                    fxc0.t(bVar2, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
                    factory2.e = bVar2;
                    aVar2 = factory2;
                    aVar2.c(false);
                    return aVar2;
                }
                a.InterfaceC0045a a5 = a((dbn) sht0Var, this.c);
                if (a5 == null) {
                    a5 = this.c;
                }
                z0d0 z0d0Var2 = this.m;
                if (z0d0Var2 == null || !z0d0Var2.d || (z0d0Var = this.m) == null) {
                    vanVar = null;
                } else {
                    vanVar = z0d0Var.h;
                    if (!z0d0Var.d || vanVar == null) {
                        throw new IllegalStateException("PreloadDiskCacheManager must be initialized first, call init() method");
                    }
                }
                androidx.media3.datasource.cache.c cVar = vanVar != null ? vanVar.d : null;
                boolean z = cVar != null && this.i == null;
                pn pnVar = vanVar != null ? vanVar.f : null;
                androidx.media3.datasource.cache.c cVar2 = z ? cVar : null;
                lsk lskVar2 = new lsk();
                if (cVar2 != null) {
                    lskVar2.a = cVar2;
                    lskVar2.d = true;
                }
                if (pnVar != null) {
                    lskVar2.b = pnVar;
                }
                lskVar2.c = this.h;
                DashMediaSource.Factory factory3 = new DashMediaSource.Factory(lskVar2.a(a5), a5);
                factory3.h = this.j;
                androidx.media3.exoplayer.upstream.b bVar3 = this.l;
                fxc0.t(bVar3, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
                factory3.e = bVar3;
                aVar = factory3;
                aVar2 = aVar;
                aVar2.c(false);
                return aVar2;
            case 4:
                aVar2 = new n.b(new gqg0.a());
                aVar2.c(false);
                return aVar2;
            case 5:
                mm80 mm80Var = this.n;
                if (mm80Var != null) {
                    mv70 mv70Var = (mv70) sht0Var;
                    String str = mv70Var.d;
                    synchronized (mm80Var) {
                        DownloadInfo downloadInfo = mm80Var.e().g.get(str);
                        d3 = downloadInfo != null ? downloadInfo.d() : null;
                    }
                    sht0 sht0Var5 = mv70Var.e;
                    if (d3 != null) {
                        ink.a aVar7 = mv70Var.f ? null : this.c;
                        synchronized (mm80Var) {
                            androidx.media3.datasource.cache.c cVar3 = mm80Var.d;
                            if (cVar3 == null) {
                                throw new IllegalStateException("OneVideoOfflineManager.init() must be called first");
                            }
                            bVar = new a.b();
                            bVar.a = cVar3;
                            bVar.c = mm80Var.g;
                            bVar.e = aVar7;
                            bVar.d(null);
                            bVar.h = 2;
                        }
                        androidx.media3.exoplayer.source.e eVar = new androidx.media3.exoplayer.source.e(bVar);
                        if (wn80.u) {
                            eVar.h(this.l);
                        }
                        d4 = eVar.d(d3);
                    } else {
                        if (sht0Var5 == null) {
                            throw new IllegalStateException(fo8.a(str, " was not found in the OneVideoOfflineManager"));
                        }
                        d4 = b(sht0Var5).d(kr10.b(sht0Var5.b));
                    }
                    aVar = new krj0(d4, c(mv70Var));
                } else {
                    mv70 mv70Var2 = (mv70) sht0Var;
                    String str2 = mv70Var2.d;
                    bu70 bu70Var = bu70.a;
                    synchronized (bu70Var) {
                        DownloadInfo downloadInfo2 = bu70.e().g.get(str2);
                        d = downloadInfo2 != null ? downloadInfo2.d() : null;
                    }
                    sht0 sht0Var6 = mv70Var2.e;
                    if (d != null) {
                        androidx.media3.exoplayer.source.e eVar2 = new androidx.media3.exoplayer.source.e(bu70Var.c(mv70Var2.f ? null : this.c));
                        if (wn80.u) {
                            eVar2.h(this.l);
                        }
                        d2 = eVar2.d(d);
                    } else {
                        if (sht0Var6 == null) {
                            throw new IllegalStateException(str2.concat(" was not found in the DownloadTracker"));
                        }
                        d2 = b(sht0Var6).d(kr10.b(sht0Var6.b));
                    }
                    aVar = new krj0(d2, c(mv70Var2));
                }
                aVar2 = aVar;
                aVar2.c(false);
                return aVar2;
            case 6:
                aVar2 = new n.b(new c.a(this.a));
                aVar2.c(false);
                return aVar2;
            case 7:
                throw new IllegalArgumentException("FrameVideoSource is not supported in OneVideoExoPlayer");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final k7s0 d(sht0 sht0Var) {
        if ((this.i != null && !this.o) || !(sht0Var instanceof ay8)) {
            return null;
        }
        ConcurrentHashMap<String, k7s0> concurrentHashMap = z7s0.a;
        ay8 ay8Var = (ay8) sht0Var;
        k7s0 k7s0Var = z7s0.a.get(ay8Var.e.getId());
        if (k7s0Var != null) {
            return k7s0Var;
        }
        v7s0 v7s0Var = this.d;
        if (v7s0Var != null) {
            return v7s0Var.e(ay8Var.e);
        }
        return null;
    }
}
