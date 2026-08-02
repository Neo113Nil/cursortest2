package xsna;

import com.ironsource.C4504q2;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.channels.ChannelsCounters;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.log.L;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

/* compiled from: MenuCounterUpdater.kt */
/* loaded from: classes.dex */
public final class f620 implements w8i {
    public static final f620 b = new f620();
    public static volatile io.reactivex.rxjava3.disposables.c c;
    public static volatile io.reactivex.rxjava3.disposables.c d;
    public static sq9 e;
    public static final bpn0 f;
    public static final bpn0 g;
    public static final bpn0 h;

    /* compiled from: MenuCounterUpdater.kt */
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<DialogsCounters, ChannelsCounters, Pair<? extends DialogsCounters, ? extends ChannelsCounters>> {
        public static final a b = new a(2, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);

        @Override // xsna.wzs
        public final Pair<? extends DialogsCounters, ? extends ChannelsCounters> invoke(DialogsCounters dialogsCounters, ChannelsCounters channelsCounters) {
            return new Pair<>(dialogsCounters, channelsCounters);
        }
    }

    static {
        bpn0 bpn0Var = new bpn0(new r63(5));
        f = bpn0Var;
        g = new bpn0(new hu2(6));
        h = new bpn0(new s63(7));
        new bpn0(new sw1(12));
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = ((io.reactivex.rxjava3.subjects.f) bpn0Var.getValue()).a0(io.reactivex.rxjava3.schedulers.a.b());
        final qej qejVar = new qej(1);
        d = a0.subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.b620
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                qej.this.invoke(obj);
            }
        }, new c620(new e620(L.a, 0), 0));
    }

    public static void a(JSONObject jSONObject) {
        Math.max(0, jSONObject.optInt("friends_suggestions", 0));
        g620.r(jSONObject.optInt("friends", 0));
        g620.s(jSONObject.optInt("friends_unread_badge", 0));
        int optInt = jSONObject.optInt(C4504q2.x, 0);
        g620.w(optInt);
        g620.k(optInt);
        g620.B(optInt);
        g620.t(jSONObject.optInt("groups", 0));
        g620.x(jSONObject.optInt("photos", 0));
        g620.i = Math.max(0, Math.max(0, jSONObject.optInt("videos", 0)));
        g620.m(jSONObject.optInt("app_requests", 0));
        g620.o(jSONObject.optInt("menu_discover_badge", 0));
        g620.q(jSONObject.optInt("friends_recommendations", 0));
        g620.z(jSONObject.optInt("support", 0));
        g620.A(jSONObject.optInt("vkpay", 0));
        g620.p(jSONObject.optInt("faves", 0));
        g620.v(jSONObject.optInt("memories", 0));
        g620.y(jSONObject.optInt("menu_superapp_friends_badge", 0));
        g620.u(jSONObject.optInt("market_orders", 0));
        g620.l(jSONObject.optInt("games", 0));
        e(jSONObject.optInt("calls", 0));
        g620.n(jSONObject.optInt("menu_clips_badge", 0));
    }

    public static void b() {
        sq9 sq9Var = e;
        if (sq9Var == null || sq9Var.isCancelled()) {
            bpn0 bpn0Var = g;
            if (((b25) bpn0Var.getValue()).b()) {
                sq9 sq9Var2 = e;
                if (sq9Var2 == null || sq9Var2.isCancelled()) {
                    e = vre0.e((vre0) h.getValue(), new b8q0(((b25) bpn0Var.getValue()).c()), "counters_tag", new xs6(16), new ept(8), null, null, 100);
                    return;
                }
                return;
            }
            sq9 sq9Var3 = e;
            if (sq9Var3 != null) {
                sq9Var3.cancel();
            }
            e = null;
            io.reactivex.rxjava3.disposables.c cVar = c;
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }

    public static final void c() {
        f620 f620Var = b;
        if (!((b25) g.getValue()).b() || com.vk.core.apps.a.b() || BuildInfo.q()) {
            return;
        }
        c63 c63Var = c63.a;
        if (!c63.f) {
            d(f620Var, false);
            return;
        }
        synchronized (f620Var) {
            b();
            d(f620Var, false);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public static final void d(Object obj, final boolean z) {
        io.reactivex.rxjava3.core.b0 k;
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        if (a1wVar.u()) {
            a1w a1wVar2 = q1w.a;
            if (a1wVar2 == null) {
                a1wVar2 = null;
            }
            Source source = Source.CACHE;
            io.reactivex.rxjava3.internal.operators.single.c C = a1wVar2.C(obj, new gnm(source, false));
            if (BuildInfo.s()) {
                a1w a1wVar3 = q1w.a;
                if (a1wVar3 == null) {
                    a1wVar3 = null;
                }
                io.reactivex.rxjava3.internal.operators.single.c C2 = a1wVar3.C(obj, new peb(source));
                a1w a1wVar4 = q1w.a;
                k = io.reactivex.rxjava3.core.x.B(C2, (a1wVar4 != null ? a1wVar4 : null).C(obj, new jqm(Source.ACTUAL)).l(new nm3(new d220(1), 19)), new q40(new ldi((byte) 0, 4), 23));
            } else {
                ChannelsCounters.f.getClass();
                k = io.reactivex.rxjava3.core.x.k(ChannelsCounters.a.a());
            }
            io.reactivex.rxjava3.disposables.c cVar = c;
            if (cVar != null) {
                cVar.dispose();
            }
            c = hg1.i(io.reactivex.rxjava3.core.x.B(C, k, new com.vk.movika.sdk.base.hooks.f(a.b, 22)).q(asu0.a.c()), new izs() { // from class: xsna.d620
                @Override // xsna.izs
                public final Object invoke(Object obj2) {
                    boolean z2 = z;
                    Pair pair = (Pair) obj2;
                    DialogsCounters dialogsCounters = (DialogsCounters) pair.d();
                    ChannelsCounters channelsCounters = (ChannelsCounters) pair.g();
                    DialogsCounters.a aVar = dialogsCounters.c;
                    qcy<Object>[] qcyVarArr = DialogsCounters.i;
                    qcy<Object> qcyVar = qcyVarArr[2];
                    Integer num = (Integer) aVar.a().a();
                    boolean z3 = false;
                    int intValue = num != null ? num.intValue() : 0;
                    DialogsCounters.a aVar2 = dialogsCounters.a;
                    qcy<Object> qcyVar2 = qcyVarArr[0];
                    Integer num2 = (Integer) aVar2.a().a();
                    int intValue2 = num2 != null ? num2.intValue() : 0;
                    DialogsCounters.a aVar3 = dialogsCounters.b;
                    boolean z4 = true;
                    qcy<Object> qcyVar3 = qcyVarArr[1];
                    Integer num3 = (Integer) aVar3.a().a();
                    Pair pair2 = new Pair(Integer.valueOf(intValue2 + intValue), Integer.valueOf(num3 != null ? num3.intValue() : 0));
                    int intValue3 = ((Number) pair2.d()).intValue();
                    int intValue4 = ((Number) pair2.g()).intValue();
                    Integer a2 = channelsCounters.b().a();
                    int intValue5 = a2 != null ? a2.intValue() : 0;
                    Integer a3 = channelsCounters.c().a();
                    Pair pair3 = new Pair(Integer.valueOf(intValue5), Integer.valueOf(a3 != null ? a3.intValue() : 0));
                    int intValue6 = ((Number) pair3.d()).intValue();
                    int intValue7 = ((Number) pair3.g()).intValue();
                    int max = Math.max(0, intValue3);
                    int max2 = Math.max(0, intValue4);
                    int max3 = Math.max(0, intValue6);
                    int max4 = Math.max(0, intValue7);
                    synchronized (g620.D) {
                        try {
                            if (g620.b != max) {
                                g620.b = max;
                                z3 = true;
                            }
                            if (g620.c != max2) {
                                g620.c = max2;
                                z3 = true;
                            }
                            if (g620.d != max3) {
                                g620.d = max3;
                                z3 = true;
                            }
                            if (g620.e != max4) {
                                g620.e = max4;
                            } else {
                                z4 = z3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (z4 || z2) {
                        g620.j();
                    }
                    return s3q0.a;
                }
            });
        }
    }

    public static void e(int i) {
        boolean z = false;
        int max = Math.max(0, i);
        synchronized (g620.D) {
            try {
                if (g620.w != max) {
                    g620.w = max;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            g620.j();
        }
    }
}
