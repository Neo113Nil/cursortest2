package sg.bigo.ads.e;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import sg.bigo.ads.ai.j;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.aj.g;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.IconAds;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.b;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.z.c;

/* loaded from: classes9.dex */
public final class a extends g<IconAds, sg.bigo.ads.cp.a> implements d<IconAds>, IconAds {
    public final c[] a;
    private long d;
    private final sg.bigo.ads.api.d e;
    private final AtomicBoolean f;
    private final AtomicBoolean g;
    private final AtomicBoolean h;
    private final AtomicBoolean i;
    private final AtomicBoolean j;
    private sg.bigo.ads.api.d k;
    private int l;

    /* renamed from: sg.bigo.ads.e.a$a, reason: collision with other inner class name */
    public static class C2481a implements AdInteractionListener {
        protected final c a;
        protected final sg.bigo.ads.api.d b;

        public C2481a(c cVar, sg.bigo.ads.api.d dVar) {
            this.a = cVar;
            this.b = dVar;
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClicked() {
            sg.bigo.ads.api.d dVar = this.b;
            if (dVar != null) {
                dVar.b(this.a);
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClosed() {
            sg.bigo.ads.api.d dVar = this.b;
            if (dVar != null) {
                dVar.d(this.a);
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdError(@NonNull AdError adError) {
            sg.bigo.ads.api.d dVar = this.b;
            if (dVar != null) {
                dVar.a(this.a, adError);
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdImpression() {
            sg.bigo.ads.api.d dVar = this.b;
            if (dVar != null) {
                dVar.a(this.a);
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdOpened() {
            sg.bigo.ads.api.d dVar = this.b;
            if (dVar != null) {
                dVar.c(this.a);
            }
        }
    }

    public a(b bVar, sg.bigo.ads.api.core.g... gVarArr) {
        super(bVar);
        this.e = new sg.bigo.ads.api.d() { // from class: sg.bigo.ads.e.a.1
            @Override // sg.bigo.ads.api.d
            public final void a(@NonNull NativeAd nativeAd) {
                a.a(a.this, nativeAd);
                if (a.this.k != null) {
                    a.this.k.a(nativeAd);
                }
            }

            @Override // sg.bigo.ads.api.d
            public final void b(@NonNull NativeAd nativeAd) {
                if (a.this.k != null) {
                    a.this.k.b(nativeAd);
                }
            }

            @Override // sg.bigo.ads.api.d
            public final void c(@NonNull NativeAd nativeAd) {
                if (a.this.k != null) {
                    a.this.k.c(nativeAd);
                }
            }

            @Override // sg.bigo.ads.api.d
            public final void d(@NonNull NativeAd nativeAd) {
                if (a.this.k != null) {
                    a.this.k.d(nativeAd);
                }
            }

            @Override // sg.bigo.ads.api.d
            public final void a(@NonNull NativeAd nativeAd, @NonNull AdError adError) {
                if (a.this.k != null) {
                    a.this.k.a(nativeAd, adError);
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        for (sg.bigo.ads.api.core.g gVar : gVarArr) {
            sg.bigo.ads.y.b a = sg.bigo.ads.y.a.a(gVar);
            if (a instanceof c) {
                arrayList.add((c) a);
            }
        }
        c[] cVarArr = new c[arrayList.size()];
        l.a(arrayList, cVarArr);
        this.a = cVarArr;
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        this.j = new AtomicBoolean(false);
        this.l = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // sg.bigo.ads.aj.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public sg.bigo.ads.cp.a f() {
        for (c cVar : this.a) {
            sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) cVar.f();
            if (aVar != null) {
                return aVar;
            }
        }
        return null;
    }

    @Override // sg.bigo.ads.aj.a
    public final void b() {
        if (this.f.compareAndSet(false, true)) {
            Object obj = this.X;
            if (obj instanceof sg.bigo.ads.aj.c) {
                this.l = ((sg.bigo.ads.aj.c) obj).m();
            }
            boolean z = false;
            for (c cVar : this.a) {
                if (cVar != null) {
                    cVar.b();
                    z |= ((Boolean) cVar.b("is_cache", (String) Boolean.FALSE)).booleanValue();
                }
            }
            sg.bigo.ads.da.b.a(this, z);
        }
    }

    @Override // sg.bigo.ads.aj.a
    public final void c() {
        if (this.g.compareAndSet(false, true)) {
            for (c cVar : this.a) {
                if (cVar != null) {
                    cVar.c();
                }
            }
            a("filled");
        }
    }

    @Override // sg.bigo.ads.aj.a
    public final String d() {
        return "";
    }

    @Override // sg.bigo.ads.api.Ad
    public final void destroy() {
        for (c cVar : this.a) {
            cVar.destroy();
        }
        sg.bigo.ads.da.b.a(f(), SystemClock.elapsedRealtime() - this.d);
    }

    @Override // sg.bigo.ads.aj.a
    public final long e() {
        j jVar = k.a;
        if (jVar != null) {
            return jVar.i();
        }
        return 0L;
    }

    @Override // sg.bigo.ads.aj.a
    public final double g() {
        c[] cVarArr = this.a;
        double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        for (c cVar : cVarArr) {
            d += cVar.g();
        }
        return d;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final AdBid getBid() {
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final String getCreativeId() {
        return "";
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final String getExtraInfo(String str) {
        sg.bigo.ads.cp.a f = f();
        return f != null ? f.b(str) : "";
    }

    @Override // sg.bigo.ads.api.IconAds
    public final NativeAd[] getNativeAds() {
        c[] cVarArr = this.a;
        return (NativeAd[]) Arrays.copyOf(cVarArr, cVarArr.length);
    }

    @Override // sg.bigo.ads.aj.g
    public final int h() {
        return this.l;
    }

    @Override // sg.bigo.ads.aj.g
    public final int i() {
        return this.a.length;
    }

    @Override // sg.bigo.ads.api.Ad
    public final boolean isExpired() {
        for (c cVar : this.a) {
            if (!cVar.isExpired()) {
                return false;
            }
        }
        return true;
    }

    @Override // sg.bigo.ads.aj.g
    public final int j() {
        int i = 0;
        for (c cVar : this.a) {
            if (!cVar.J) {
                i++;
            }
        }
        return i;
    }

    @Override // sg.bigo.ads.api.Ad
    @Deprecated
    public final void setAdInteractionListener(AdInteractionListener adInteractionListener) {
    }

    @Override // sg.bigo.ads.aj.a
    public final void a(int i, int i2, String str) {
        if (this.h.compareAndSet(false, true)) {
            for (c cVar : this.a) {
                if (cVar != null) {
                    cVar.a(i, i2, str);
                }
            }
            sg.bigo.ads.da.b.a(this, i, i2, str);
        }
    }

    @Override // sg.bigo.ads.api.IconAds
    public final void setAdInteractionListener(sg.bigo.ads.api.d dVar) {
        this.k = dVar;
    }

    private void a(String str) {
        sg.bigo.ads.cq.b.a().a(str, sg.bigo.ads.cq.a.a(str, this.X.i(), this.X, null, null, null, null, this));
    }

    @Override // sg.bigo.ads.aj.a
    public final void a(String str, String str2, int i) {
        if (this.j.compareAndSet(false, true)) {
            sg.bigo.ads.da.b.a(this, str, str2, i);
        }
    }

    @Override // sg.bigo.ads.aj.d
    public final void a(@NonNull final d.a<IconAds> aVar) {
        final HashSet hashSet = new HashSet(Arrays.asList(this.a));
        final HashSet hashSet2 = new HashSet();
        final d.a<IconAds> aVar2 = new d.a<IconAds>() { // from class: sg.bigo.ads.e.a.2
            private void a() {
                if (l.a(hashSet)) {
                    if (l.a(hashSet2)) {
                        aVar.a(a.this, 1020, 1500, "all icon ads are invalid.");
                    } else {
                        aVar.a(a.this);
                    }
                }
            }

            @Override // sg.bigo.ads.aj.d.a
            public final /* bridge */ /* synthetic */ void a(IconAds iconAds) {
                a();
            }

            @Override // sg.bigo.ads.aj.d.a
            public final /* bridge */ /* synthetic */ void a(IconAds iconAds, int i, int i2, String str) {
                a();
            }

            @Override // sg.bigo.ads.aj.d.a
            public final /* bridge */ /* synthetic */ void a(IconAds iconAds, boolean z, int i, int i2, String str, boolean z2) {
                a();
            }
        };
        for (c cVar : this.a) {
            cVar.a((sg.bigo.ads.aj.a) this);
            cVar.b("filled");
            cVar.b("impression");
            cVar.c("06002008");
            cVar.c("06002010");
            cVar.c("06002029");
            cVar.setAdInteractionListener(new C2481a(cVar, this.e));
            cVar.a(new d.a<NativeAd>() { // from class: sg.bigo.ads.e.a.3
                @Override // sg.bigo.ads.aj.d.a
                public final /* synthetic */ void a(NativeAd nativeAd) {
                    NativeAd nativeAd2 = nativeAd;
                    hashSet.remove(nativeAd2);
                    hashSet2.add(nativeAd2);
                    aVar2.a(a.this);
                }

                @Override // sg.bigo.ads.aj.d.a
                public final /* synthetic */ void a(NativeAd nativeAd, int i, int i2, String str) {
                    hashSet.remove(nativeAd);
                    aVar2.a(a.this, i, i2, str);
                }

                @Override // sg.bigo.ads.aj.d.a
                public final /* synthetic */ void a(NativeAd nativeAd, boolean z, int i, int i2, String str, boolean z2) {
                    NativeAd nativeAd2 = nativeAd;
                    hashSet.remove(nativeAd2);
                    hashSet2.add(nativeAd2);
                    aVar2.a(a.this, z, i, i2, str, z2);
                }
            });
        }
    }

    public static /* synthetic */ void a(a aVar, NativeAd nativeAd) {
        if (aVar.i.compareAndSet(false, true)) {
            aVar.d = SystemClock.elapsedRealtime();
            aVar.a("impression");
            if (nativeAd instanceof c) {
                c cVar = (c) nativeAd;
                Pair<Integer, Integer> a = (aVar.f() == null || !aVar.f().a(64) || aVar.f().O() == null) ? null : sg.bigo.ads.controller.landing.d.a(cVar.b.e, aVar.f().O().h(), aVar.f().o());
                sg.bigo.ads.da.b.a(cVar.b.e, aVar, (String) cVar.b("show_proportion", ""), cVar.j(), ((Integer) cVar.b("render_style", (String) 0)).intValue(), cVar.w(), ((Long) cVar.b("attach_render_cost", (String) (-1L))).longValue(), SystemClock.elapsedRealtime() - cVar.l, -1, -1, -1, a == null ? -1 : ((Integer) a.first).intValue(), a != null ? ((Integer) a.second).intValue() : -1);
            }
        }
    }

    @Override // sg.bigo.ads.aj.i
    public final sg.bigo.ads.api.core.b[] a() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.a) {
            arrayList.add(cVar.f());
        }
        sg.bigo.ads.api.core.b[] bVarArr = new sg.bigo.ads.api.core.b[arrayList.size()];
        l.a(arrayList, bVarArr);
        return bVarArr;
    }
}
