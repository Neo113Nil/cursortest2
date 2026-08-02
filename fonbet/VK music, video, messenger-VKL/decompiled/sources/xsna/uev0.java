package xsna;

import com.vk.core.preference.Preference;
import com.vk.metrics.eventtracking.Event;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.akq;
import xsna.u870;

/* compiled from: VkPushSubscriber.kt */
/* loaded from: classes.dex */
public final class uev0 extends nke0 implements w8i {
    public String l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;

    public uev0() {
        this(null);
    }

    @Override // xsna.nke0
    public final String f() {
        String str = this.l;
        if (str != null) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        i6i a = j6i.a();
        p4g.a("vk_client", arrayList, a.e() == a.i() || j6i.a().i().e());
        i6i a2 = j6i.a();
        p4g.a("vk_me", arrayList, a2.e() == a2.g() || j6i.a().g().e());
        i6i a3 = j6i.a();
        p4g.a("vk_calls", arrayList, a3.e() == a3.a() || j6i.a().a().e());
        i6i a4 = j6i.a();
        p4g.a("vk_clips", arrayList, a4.e() == a4.b() || j6i.a().b().e());
        i6i a5 = j6i.a();
        p4g.a("vk_video", arrayList, a5.e() == a5.k() || j6i.a().k().e());
        i6i a6 = j6i.a();
        p4g.a("vk_dating", arrayList, a6.e() == a6.h() || j6i.a().h().e());
        i6i a7 = j6i.a();
        p4g.a("vk_music", arrayList, epx.f(a7.e(), a7.V()) || j6i.a().V().e());
        String k = p4g.k(arrayList, StringUtils.COMMA, null);
        this.l = k;
        return k;
    }

    @Override // xsna.nke0
    public final String g() {
        return z4g.d().c().i();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Pair<le6<s3q0>, akq> k(boolean z, Boolean bool) {
        boolean a = ((hlu0) this.n.getValue()).a();
        ?? r1 = this.p;
        return (a && o25.a().b()) ? new Pair<>(new oh00(g(), z4g.d().S(), f(), ((Boolean) r1.getValue()).booleanValue(), z4g.d().d(), EmptyList.b, Preference.f("multi_push_settings_prefs").getBoolean("is_multi_push_disabled", true), bool), akq.b.b) : new Pair<>(new aqf0(g(), z4g.d().S(), f(), ((Boolean) r1.getValue()).booleanValue(), z4g.d().d(), (List) this.o.getValue(), z), akq.c.b);
    }

    public final io.reactivex.rxjava3.internal.operators.single.o l(le6 le6Var, boolean z) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.f();
        aVar.g("push_subscribe_scheduled");
        aVar.b("attempt", Integer.valueOf(this.e));
        bVar.k(aVar.e());
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        return new io.reactivex.rxjava3.internal.operators.single.o(a1wVar.C(rsr.x("PushSubscriberNew", new Throwable()), le6Var).m(io.reactivex.rxjava3.schedulers.a.b()), new jgs0(new tev0(z), 2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uev0(Object obj) {
        super(new bpn0(new sq6(22)), u870.a.b);
        u870.a.getClass();
        c13 c13Var = new c13(20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.m = msy.a(lazyThreadSafetyMode, c13Var);
        this.n = msy.a(lazyThreadSafetyMode, new r30(this, 10));
        this.o = msy.a(lazyThreadSafetyMode, new knf(21));
        this.p = msy.a(lazyThreadSafetyMode, new lnf(18));
    }
}
