package xsna;

import android.util.LruCache;
import com.vk.dto.stickers.AnimatedStickerInfo;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.rlottie.RLottieDrawable;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.p;

/* compiled from: VKAnimationLoader.kt */
/* loaded from: classes14.dex */
public final class c7r0 {
    public static final bpn0 a = new bpn0(new c2c0(15));
    public static final bpn0 b = new bpn0(new vo50(21));
    public static final bpn0 c = new bpn0(new vxl0(2));
    public static final HashMap<String, Integer> d = new HashMap<>();
    public static final bpn0 e = new bpn0(new qdh0(4));
    public static final ConcurrentHashMap<String, io.reactivex.rxjava3.subjects.a<RLottieDrawable>> f = new ConcurrentHashMap<>();
    public static final HashMap<String, AnimatedStickerInfo> g = new HashMap<>();
    public static final AtomicBoolean h = new AtomicBoolean();

    /* compiled from: VKAnimationLoader.kt */
    public static final class a extends LruCache<String, RLottieDrawable> {
        @Override // android.util.LruCache
        public final void entryRemoved(boolean z, String str, RLottieDrawable rLottieDrawable, RLottieDrawable rLottieDrawable2) {
            RLottieDrawable rLottieDrawable3 = rLottieDrawable;
            Integer num = c7r0.d.get(str);
            if (num == null || num.intValue() == 0) {
                rLottieDrawable3.k();
            }
        }
    }

    public static void a() {
        g.clear();
        ((LruCache) a.getValue()).evictAll();
        c().evictAll();
        ((LruCache) b.getValue()).evictAll();
        e().evictAll();
        wmi0.a.c("animated_stickers_list_v21");
    }

    public static String b(int i, String str, boolean z, boolean z2, boolean z3) {
        return str + '_' + i + '_' + z + '_' + z2 + '_' + z3;
    }

    public static LruCache c() {
        return (LruCache) c.getValue();
    }

    public static String d(String str) {
        return go9.b("sticker_content_", str);
    }

    public static a e() {
        return (a) e.getValue();
    }

    public static String f(String str) {
        p.a aVar = new p.a();
        aVar.i(str);
        okhttp3.p b2 = aVar.b();
        o260 o260Var = d260.a;
        o260 o260Var2 = d260.a;
        if (o260Var2 == null) {
            o260Var2 = null;
        }
        o260Var2.getClass();
        okhttp3.v vVar = ((f8f0) o260Var2.b(NetworkClient.ClientType.CLIENT_DEFAULT).a(b2)).execute().h;
        if (vVar != null) {
            return vVar.string();
        }
        return null;
    }

    public static io.reactivex.rxjava3.core.q g(String str, String str2, boolean z) {
        i700 i700Var;
        if (!z && (i700Var = (i700) ((LruCache) a.getValue()).get(str)) != null) {
            return io.reactivex.rxjava3.core.q.T(i700Var);
        }
        if (!g.containsKey(str)) {
            int i = kwg0.a;
            return new io.reactivex.rxjava3.internal.operators.single.h(new io.reactivex.rxjava3.internal.operators.single.b(new l340(new com.vk.movika.sdk.base.logic.processor.actions.e(22, str, str2), 9)).q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b()), new o060(new z6r0(z, str), 18)).w();
        }
        int i2 = 16;
        int i3 = 4;
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = wmi0.a.i(d(str), false).a0(asu0.a.c()).U(new bj50(new m0m0(6), i2)).U(new u730(new t62(str2, i3), i2)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        j720 j720Var = new j720(new agk(z, str, i3), 14);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return a0.E(j720Var, lVar, kVar, kVar);
    }

    public static io.reactivex.rxjava3.core.q h(String str) {
        String str2 = (String) c().get(str);
        if (str2 != null) {
            return io.reactivex.rxjava3.core.q.T(str2);
        }
        if (g.containsKey(str)) {
            return wmi0.a.i(d(str), false).a0(asu0.a.c()).U(new n8c0(new vsp(str, 2), 12)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        }
        int i = kwg0.a;
        io.reactivex.rxjava3.internal.operators.single.b bVar = new io.reactivex.rxjava3.internal.operators.single.b(new l340(new qd2(str, 1), 9));
        asu0.a.getClass();
        return bVar.q(asu0.r()).m(io.reactivex.rxjava3.android.schedulers.a.b()).w();
    }

    public static io.reactivex.rxjava3.core.q i(String str) {
        AnimatedStickerInfo animatedStickerInfo = (AnimatedStickerInfo) ((LruCache) b.getValue()).get(str);
        if (animatedStickerInfo != null) {
            return io.reactivex.rxjava3.core.q.T(animatedStickerInfo);
        }
        boolean containsKey = g.containsKey(str);
        int i = 1;
        int i2 = 0;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        if (!containsKey) {
            int i3 = kwg0.a;
            return new io.reactivex.rxjava3.internal.operators.mixed.q(new io.reactivex.rxjava3.internal.operators.single.b(new l340(new u6n(str, i), 9)).q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b()), new xhb0(new b7r0(str, i2), 11)).E(new fv70(new jv2(str, 3), 23), lVar, kVar, kVar);
        }
        int i4 = 2;
        return wmi0.a.i(d(str), false).a0(asu0.a.c()).U(new pi40(new jyq0(i), 15)).L(new tuz(new hkv(str, i4), 20), false).E(new rt10(new rgb0(str, i4), 21), lVar, kVar, kVar);
    }

    public static void j(String str, String str2) {
        new io.reactivex.rxjava3.internal.operators.observable.s0(new q9e(str2, 1)).r0(asu0.a.c()).U(new nit(new oed0(str, 1), 21)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new uu60(new sdh(str, 1), 29));
    }
}
