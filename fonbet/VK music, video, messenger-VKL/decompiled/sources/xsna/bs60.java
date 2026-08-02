package xsna;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ads.api.di.AdsComponent;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.audience.api.domain.AudienceResearchSurfaceCode;
import com.vk.feed.core.models.NewsfeedResearchEvent;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.util.NewsfeedViewPostCache;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.fb80;

/* compiled from: NewsfeedListStatisticsViewsPlugin.kt */
/* loaded from: classes4.dex */
public final class bs60 {
    public final tr60 a;
    public final io.reactivex.rxjava3.disposables.b b;
    public final fb80.a c;
    public final Lazy<AdsComponent> d;
    public final Lazy<NewsfeedOptionalAdsComponent> e;
    public final to60 f;
    public final Lazy g;
    public final String h;
    public final boolean i;
    public final Object j;
    public final HashSet<Integer> k;
    public final o8s0 l;
    public final as60 m;
    public boolean n;
    public ks60 o;
    public rwc0<? extends pwc0> p;
    public RecyclerView.t q;
    public final Object r;
    public List<? extends ol60> s;
    public RecyclerView t;

    /* compiled from: NewsfeedListStatisticsViewsPlugin.kt */
    public static final class a implements bin0, g0t {
        public final /* synthetic */ to60 b;

        public a(to60 to60Var) {
            this.b = to60Var;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof bin0) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.bin0
        public final /* synthetic */ Object get() {
            return this.b.invoke();
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public bs60(tr60 tr60Var, io.reactivex.rxjava3.disposables.b bVar, fb80.a aVar, bpn0 bpn0Var, Lazy lazy, bpn0 bpn0Var2, to60 to60Var) {
        this.a = tr60Var;
        this.b = bVar;
        this.c = aVar;
        this.d = bpn0Var;
        this.e = lazy;
        this.f = to60Var;
        this.g = bpn0Var2;
        this.h = tr60Var.b;
        this.i = tr60Var.c;
        qc00 qc00Var = new qc00(4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, qc00Var);
        this.k = izi0.d(17, Integer.valueOf(atv0.b));
        this.l = new o8s0();
        this.m = new as60(this);
        this.r = msy.a(lazyThreadSafetyMode, new hn9(22, this, bpn0Var2));
        this.s = EmptyList.b;
    }

    public static void b(bs60 bs60Var) {
        ks60 ks60Var = bs60Var.o;
        if (ks60Var != null) {
            ks60Var.c(false);
        }
    }

    public final void a(List<? extends ol60> list) {
        ks60 ks60Var = this.o;
        if (ks60Var != null) {
            ks60Var.b();
        }
        d().a();
        this.s = list;
    }

    public final void c() {
        rwc0<? extends pwc0> rwc0Var = this.p;
        if (rwc0Var != null) {
            rwc0Var.c();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final gqp d() {
        return (gqp) this.j.getValue();
    }

    public final void e() {
        this.o = null;
        NewsfeedViewPostCache.SetWrapper setWrapper = NewsfeedViewPostCache.a;
        wmi0.a.a("newsfeed:cache:view_post:ids", NewsfeedViewPostCache.a);
    }

    public final void f() {
        RecyclerView recyclerView;
        RecyclerView.t tVar = this.q;
        if (tVar != null && (recyclerView = this.t) != null) {
            recyclerView.removeOnScrollListener(tVar);
        }
        this.q = null;
        String str = this.h;
        if (str != null) {
            String str2 = com.vk.newsfeed.common.util.k.a;
            com.vk.newsfeed.common.util.k.d.remove(str);
        }
        this.t = null;
    }

    public final void g() {
        ks60 ks60Var = this.o;
        if (ks60Var != null) {
            ks60Var.c(false);
        }
        rwc0<? extends pwc0> rwc0Var = this.p;
        if (rwc0Var != null) {
            rwc0Var.c();
        }
        rwc0<? extends pwc0> rwc0Var2 = this.p;
        if (rwc0Var2 != null) {
            rwc0Var2.b();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void h() {
        d().terminate();
        ks60 ks60Var = this.o;
        if (ks60Var != null) {
            ks60Var.c(false);
        }
        this.o = null;
        rwc0<? extends pwc0> rwc0Var = this.p;
        if (rwc0Var != null) {
            rwc0Var.c();
        }
        rwc0<? extends pwc0> rwc0Var2 = this.p;
        if (rwc0Var2 != null) {
            rwc0Var2.b();
        }
        this.p = null;
        ((hs60) this.r.getValue()).b();
        this.n = false;
    }

    public final void i(RecyclerView recyclerView, ho60 ho60Var) {
        this.t = recyclerView;
        recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.wr60
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ks60 ks60Var = bs60.this.o;
                if (ks60Var != null) {
                    ks60Var.b();
                }
            }
        });
        ho60Var.D0(this.m);
        yr60 yr60Var = new yr60(this);
        recyclerView.addOnScrollListener(yr60Var);
        this.q = yr60Var;
    }

    public final void j() {
        ks60 ks60Var = this.o;
        if (ks60Var != null) {
            ks60Var.b();
        }
        rwc0<? extends pwc0> rwc0Var = this.p;
        if (rwc0Var != null) {
            rwc0Var.a();
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void k(Activity activity, a4r a4rVar) {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            if (this.o == null) {
                this.o = new ks60(recyclerView, this.c, d().isEnabled(), new xr60(this), this.e.getValue().d5());
            }
            if (this.p == null) {
                this.p = this.d.getValue().j2(recyclerView, (String) this.f.invoke(), new dlv(this));
            }
            ks60 ks60Var = this.o;
            rwc0<? extends pwc0> rwc0Var = this.p;
            if (activity != null) {
                d().d(a4rVar);
                d().e(activity, ks60Var, rwc0Var);
            }
            ks60 ks60Var2 = this.o;
            if (ks60Var2 != null) {
                ks60Var2.b();
            }
            rwc0<? extends pwc0> rwc0Var2 = this.p;
            if (rwc0Var2 != null) {
                rwc0Var2.a();
            }
        }
        String str = this.h;
        if (str != null) {
            String str2 = com.vk.newsfeed.common.util.k.a;
            com.vk.newsfeed.common.util.k.m(str, new mj6(this, 2));
        }
        ((hs60) this.r.getValue()).a();
        this.n = true;
    }

    public final void l() {
        ks60 ks60Var = this.o;
        if (ks60Var == null) {
            return;
        }
        HashMap<NewsEntry, Integer> hashMap = ks60Var.k;
        ph50<NewsEntry, Long> ph50Var = ks60Var.f;
        Object[] objArr = ph50Var.b;
        long[] jArr = ph50Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        NewsEntry newsEntry = (NewsEntry) objArr[(i << 3) + i3];
                        Integer d = ks60Var.d(newsEntry, hashMap.get(newsEntry));
                        if (d != null) {
                            hashMap.put(newsEntry, d);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void m(NewsEntry newsEntry, List<String> list, List<NewsfeedResearchEvent> list2, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        List<String> list3 = list;
        if (list3 == null || list3.isEmpty()) {
            return;
        }
        AudienceResearchSurfaceCode a2 = sa4.a(newsEntry, mobileOfficialAppsCoreNavStat$EventScreen);
        Lazy lazy = this.g;
        io.reactivex.rxjava3.internal.operators.single.s sVar = new io.reactivex.rxjava3.internal.operators.single.s(nr2.v(a2, list, ((AudienceResearchComponent) lazy.getValue()).Z2()), new oyr(new eqq(this, 25), 12));
        asu0.a.getClass();
        io.reactivex.rxjava3.disposables.c subscribe = sVar.q(asu0.i()).subscribe();
        io.reactivex.rxjava3.disposables.b bVar = this.b;
        bVar.b(subscribe);
        List<NewsfeedResearchEvent> list4 = list2;
        if (list4 == null || list4.isEmpty()) {
            return;
        }
        bVar.b(pq3.r(((AudienceResearchComponent) lazy.getValue()).b(), list2).q(asu0.i()).subscribe());
    }
}
