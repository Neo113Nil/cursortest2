package xsna;

import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.ads.dto.VkOptionalNativeAdType;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.NewsfeedData;
import com.vk.toggle.Features;
import com.vk.toggle.features.FeedFeatures;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.pv8;

/* compiled from: NewsfeedController.kt */
/* loaded from: classes.dex */
public final class ce60 implements de60, w8i {
    public static final ce60 b = new ce60();
    public static final bpn0 c = new bpn0(new hb8(4));
    public static final Object d;
    public static boolean e;
    public static final HashSet<String> f;
    public static final AtomicReference<Boolean> g;
    public static final ConcurrentHashMap<Integer, Long> h;
    public static final AtomicBoolean i;
    public static boolean j;
    public static long k;
    public static final AtomicBoolean l;
    public static Integer m;
    public static final Object n;
    public static final AtomicBoolean o;

    static {
        p5m p5mVar = new p5m(4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        d = msy.a(lazyThreadSafetyMode, p5mVar);
        f = new HashSet<>();
        g = new AtomicReference<>(null);
        h = new ConcurrentHashMap<>();
        i = new AtomicBoolean(false);
        l = new AtomicBoolean(false);
        n = msy.a(lazyThreadSafetyMode, new k03(8));
        o = new AtomicBoolean(true);
    }

    public static boolean f(long j2) {
        long b2;
        long currentTimeMillis = System.currentTimeMillis();
        pv8 pv8Var = (pv8) ((bxx) hd60.a().a().a(m6r0.Z0));
        if (pv8Var != null) {
            b2 = pv8Var.a();
        } else {
            int i2 = pv8.k;
            b2 = pv8.a.b();
        }
        return currentTimeMillis - j2 >= b2;
    }

    public static void g() {
        wmi0.a.c("situational_suggest:" + ply.a());
    }

    public static io.reactivex.rxjava3.internal.operators.observable.b0 h(int i2, io.reactivex.rxjava3.core.w wVar, boolean z) {
        io.reactivex.rxjava3.core.q c2;
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(Features.Type.EXPERIMENT_NEWS_DISABLE_CACHE)) {
            c2 = io.reactivex.rxjava3.core.q.T(EmptyList.b);
        } else {
            eqy<bek0> eqyVar = com.vk.toggle.d.a;
            FeedFeatures feedFeatures = FeedFeatures.FILE_CACHE;
            feedFeatures.getClass();
            if (bVar.a(feedFeatures)) {
                c2 = new io.reactivex.rxjava3.internal.operators.mixed.q(((hxq) c.getValue()).c(i2, z), new gs00(new gz30(3), 5));
            } else {
                Serializer.c<NewsfeedData> cVar = NewsfeedData.CREATOR;
                c2 = NewsfeedData.a.c(o25.a().c(), i2, z, wVar);
            }
        }
        ff3 ff3Var = new ff3(new rjb(i2, 1), 26);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return c2.E(ff3Var, lVar, kVar, kVar);
    }

    public static String j(int i2, boolean z) {
        return i2 != -6 ? i2 != -5 ? i2 != -4 ? i2 != -2 ? i2 != 0 ? lhg.a(i2, "feed_") : z ? "feed_top" : "feed_recent" : "feed_friends" : "feed_photos" : "feed_videos" : "feed_lives";
    }

    public static /* synthetic */ String k(ce60 ce60Var, int i2) {
        ce60Var.getClass();
        boolean m2 = m();
        ce60Var.getClass();
        return j(i2, m2);
    }

    public static io.reactivex.rxjava3.internal.operators.observable.p1 l() {
        io.reactivex.rxjava3.core.w c2 = asu0.a.c();
        io.reactivex.rxjava3.core.q<R> L = new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.be60
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ce60.b.getClass();
                return Boolean.valueOf(ce60.m());
            }
        }).r0(c2).L(new b630(new wq20(c2, 9), 5), false);
        nb nbVar = new nb(new xht(14), 26);
        L.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.p1(L, nbVar);
    }

    public static boolean m() {
        AtomicReference<Boolean> atomicReference = g;
        if (atomicReference.get() == null) {
            atomicReference.set(Boolean.valueOf(Preference.f("feed_newsfeed").getBoolean("newsfeed_is_top", false)));
        }
        Boolean bool = atomicReference.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static void n(Boolean bool) {
        if (bool == null || !o25.a().b()) {
            return;
        }
        g.set(bool);
        Preference.f("feed_newsfeed").edit().putBoolean("newsfeed_is_top", bool.booleanValue()).apply();
    }

    @Override // xsna.de60
    public final void a() {
        k = System.currentTimeMillis();
    }

    @Override // xsna.de60
    public final void b(boolean z) {
        Preference.f("feed_newsfeed").edit().putBoolean("start_from_interesting_pending", z).apply();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.de60
    public final boolean c() {
        return ((NewsfeedOptionalAdsComponent) d.getValue()).T1(VkOptionalNativeAdType.APPLOVIN);
    }

    @Override // xsna.de60
    public final long d() {
        return k;
    }

    @Override // xsna.de60
    public final boolean e() {
        return Preference.f("feed_newsfeed").getBoolean("start_from_interesting_pending", false);
    }

    public final int i() {
        Integer num = m;
        return num != null ? num.intValue() : Preference.f("feed_newsfeed").getInt("feed_list", 0);
    }
}
