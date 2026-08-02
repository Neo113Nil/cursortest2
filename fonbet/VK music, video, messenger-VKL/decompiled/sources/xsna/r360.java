package xsna;

import android.app.Application;
import android.util.Log;
import com.vk.core.apps.BuildInfo;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.core.utils.newtork.c;
import com.vk.dto.common.id.UserId;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.data.BucketPriorityConfig;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.InitializedLazyImpl;
import kotlin.collections.EmptySet;
import kotlin.text.Regex;
import okhttp3.Interceptor;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;
import xsna.dev0;
import xsna.l2p0;
import xsna.n460;
import xsna.o260;
import xsna.wjy;
import xsna.y390;
import xsna.yx2;

/* compiled from: NetworkInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final class r360 extends ParallelTaskRunner.a {
    public final bpn0 d;
    public final bpn0 e;
    public final bpn0 f;
    public final uv8 g;
    public final bpn0 h;
    public final bpn0 i;

    /* compiled from: NetworkInitTaskLogic.kt */
    public static final class a {
        public static final boolean a(String str, String str2) {
            if (str == null) {
                return false;
            }
            return str.equals(str2) || (str.equalsIgnoreCase("clips") && brm0.B(str2, "clips/", true));
        }
    }

    /* compiled from: NetworkInitTaskLogic.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BucketPriorityConfig.BucketStrategy.values().length];
            try {
                iArr[BucketPriorityConfig.BucketStrategy.FAIR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BucketPriorityConfig.BucketStrategy.STEAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BucketPriorityConfig.BucketStrategy.STEAL_LESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public r360(VKApplication vKApplication, r12 r12Var) {
        super(vKApplication, r12Var);
        this.d = new bpn0(new t3a(this, 1));
        this.e = new bpn0(new rwe(6));
        this.f = new bpn0(new nb8(12));
        this.g = new uv8(3);
        this.h = new bpn0(new b55(this, 5));
        this.i = new bpn0(new pb8(4));
    }

    public static boolean e() {
        if (BuildInfo.h()) {
            o2l.a.getClass();
            if (o2l.b("mockApiResponsesEnabled", false)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "InitNetwork";
    }

    public final h360 d() {
        return (h360) this.d.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v29, types: [kotlin.collections.EmptySet] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.util.Set<kotlin.text.Regex>] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [kotlin.collections.EmptySet] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    @Override // xsna.gzs
    public final s3q0 invoke() {
        aky akyVar;
        Executor ddkVar;
        Application application;
        mqa mqaVar;
        InitializedLazyImpl initializedLazyImpl;
        jgp jgpVar;
        ?? r5;
        ?? r52;
        ?? r53;
        yek yekVar;
        Iterator<String> keys;
        try {
            dsw<UserId, v390> dswVar = y390.a;
            y390.a.a().getClass();
        } catch (Throwable th) {
            Log.e("InitNetwork", "", th);
        }
        Set<Regex> set = aky.f;
        String str = d().g().m;
        jgp jgpVar2 = jgp.b;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray optJSONArray = jSONObject.optJSONArray("hosts");
            if (optJSONArray != null) {
                ?? linkedHashMap = new LinkedHashMap();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    linkedHashMap.put(new Regex(jSONObject2.getString(CandidateTypeHintConfig.TYPE_HOST)), jSONObject2.getString("quic_host"));
                }
                jgpVar = linkedHashMap;
            } else {
                jgpVar = jgpVar2;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("alt-hosts");
            if (optJSONArray2 != null) {
                r5 = new LinkedHashSet();
                int length2 = optJSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    r5.add(new Regex(optJSONArray2.getString(i2)));
                }
            } else {
                r5 = EmptySet.b;
            }
            Set set2 = r5;
            JSONArray optJSONArray3 = jSONObject.optJSONArray("ignore");
            if (optJSONArray3 != null) {
                r52 = new LinkedHashSet();
                int length3 = optJSONArray3.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    r52.add(new Regex(optJSONArray3.getString(i3)));
                }
            } else {
                r52 = aky.f;
            }
            Set set3 = r52;
            JSONArray optJSONArray4 = jSONObject.optJSONArray("hints");
            if (optJSONArray4 != null) {
                r53 = new LinkedHashSet();
                int length4 = optJSONArray4.length();
                for (int i4 = 0; i4 < length4; i4++) {
                    r53.add(optJSONArray4.getString(i4));
                }
            } else {
                r53 = EmptySet.b;
            }
            int optInt = jSONObject.optInt("version", 0);
            JSONObject optJSONObject = jSONObject.optJSONObject("quic_options");
            if (optJSONObject != null) {
                int i5 = optJSONObject.getInt("max_server_configs_stored_in_properties");
                int i6 = optJSONObject.getInt("idle_connection_timeout_seconds");
                int i7 = optJSONObject.getInt("reduced_ping_timeout_seconds");
                boolean z = optJSONObject.getBoolean("close_sessions_on_ip_change");
                boolean z2 = optJSONObject.getBoolean("goaway_sessions_on_ip_change");
                boolean z3 = optJSONObject.getBoolean("migrate_sessions_on_network_change_v2");
                boolean z4 = optJSONObject.getBoolean("migrate_sessions_early_v2");
                boolean z5 = optJSONObject.getBoolean("migrate_idle_sessions");
                boolean z6 = optJSONObject.getBoolean("origins_to_force_quic_on");
                boolean optBoolean = optJSONObject.optBoolean("enable_socket_recv_optimization", true);
                boolean z7 = optJSONObject.getBoolean("retry_on_alternate_network_before_handshake");
                String string = optJSONObject.getString("version");
                HashMap hashMap = new HashMap();
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("additional");
                if (optJSONObject2 != null && (keys = optJSONObject2.keys()) != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object opt = optJSONObject2.opt(next);
                        if (opt != null) {
                            hashMap.put(next, opt);
                        }
                    }
                }
                Iterable iterable = (Iterable) r53;
                ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(new zfv((String) it.next()));
                }
                Set S0 = j5g.S0(jgpVar.values());
                ArrayList arrayList2 = new ArrayList(c5g.u(S0, 10));
                Iterator it2 = S0.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new zfv((String) it2.next()));
                }
                yekVar = new yek(j5g.u0(arrayList2, arrayList), i5, i6, i7, z, z2, z3, z4, z5, z6, optBoolean, z7, string, hashMap, 2048);
            } else {
                yekVar = null;
            }
            akyVar = new aky(jgpVar, set3, set2, yekVar, optInt);
        } catch (Exception e) {
            L.i(e);
            akyVar = new aky(jgpVar2, aky.f, EmptySet.b, null, 0);
        }
        o2l o2lVar = o2l.a;
        o2lVar.getClass();
        aky akyVar2 = akyVar;
        NetworkClient.a aVar = new NetworkClient.a((o2l.b("__dbg_msg_pack_disabled", false) || e()) ? false : true, d().getApiConfig().c, o2l.b("__dbg_network_tools", false) && !BuildInfo.m(), new NetworkClient.a.C1087a(new t360(0, o2lVar, o2l.class, "networkFailWithExceptionEnabled", "networkFailWithExceptionEnabled()Ljava/util/EnumSet;", 0), new u360(0, o2lVar, o2l.class, "knetFailWithExceptionEnabled", "knetFailWithExceptionEnabled()Z", 0), new v360(0, o2lVar, o2l.class, "networkFakeFailTimeoutMs", "networkFakeFailTimeoutMs()I", 0), new w360(0, o2lVar, o2l.class, "fakeNetworkConditions", "fakeNetworkConditions()Ljava/util/EnumSet;", 0)));
        yx2 apiConfig = d().getApiConfig();
        b260 g = d().g();
        int i8 = 6;
        w6l w6lVar = new w6l(new x360(0, o2lVar, o2l.class, "getIsSaveNetStatToFile", "getIsSaveNetStatToFile()Z", 0), new y360(0, o2lVar, o2l.class, "isKnetDetailedLogEnabled", "isKnetDetailedLogEnabled()Z", 0), new z360(0, o2lVar, o2l.class, "getApiMaxLength", "getApiMaxLength()I", 0), new dia(this, 4), this.e, this.f, this.g, new bpn0(new kb0(i8)), new exw(this, 1), this.h, new jal(this, 2));
        bae0 bae0Var = new bae0(new s360(0, o2lVar, o2l.class, "isDebugProxy", "isDebugProxy()Z", 0), new fb8(this, 4), new hb8(3), true);
        kse0 kse0Var = new kse0(new zf6(this, 9), new ag6(this, 7), new bg6(this, 7), new xsa(this, 3), new c24(0), 32);
        v7y0 d = d().d();
        t7y0 t7y0Var = new t7y0(16, d.c, p1p0.a(d().e().g()), d.a, d.b);
        tnk0 tnk0Var = new tnk0(d().c().h);
        final a460 a460Var = new a460(true, true, true);
        boolean booleanValue = ((Boolean) com.vk.core.apps.a.j.getValue()).booleanValue();
        hiv b2 = d().b();
        int i9 = 8;
        wjy.a.b bVar = new wjy.a.b(new s65(8), new c24(7), new l67(i8));
        boolean a2 = p1p0.a(d().e().a());
        s260 a3 = d().a();
        if (a3 == null || !a3.a) {
            ddkVar = new ddk();
        } else {
            asu0.a.getClass();
            ddkVar = asu0.x();
        }
        Executor executor = ddkVar;
        boolean z8 = !com.vk.toggle.d.k().a ? com.vk.toggle.d.d().a && com.vk.toggle.d.d().c : com.vk.toggle.d.k().d;
        bpn0 bpn0Var = new bpn0(new k03(7));
        com.vk.toggle.data.b b3 = com.vk.toggle.d.B0.b();
        if (b3 == null) {
            com.vk.toggle.data.b.e.getClass();
            b3 = com.vk.toggle.data.b.f;
        }
        com.vk.toggle.data.b bVar2 = b3;
        kek b4 = com.vk.toggle.d.M0.b();
        if (b4 == null) {
            kek.c.getClass();
            b4 = kek.d;
        }
        kek kekVar = b4;
        q360 q360Var = new q360(this);
        sb8 sb8Var = new sb8(this, 4);
        v62 v62Var = new v62(this, 3);
        wb3 wb3Var = new wb3(2);
        t260 t260Var = new t260(akyVar2, aVar, apiConfig, g, w6lVar, bae0Var, kse0Var, t7y0Var, tnk0Var, a460Var, booleanValue, b2, sb8Var, v62Var, bVar, wb3Var, a2, executor, z8, bVar2, new xb3(8), bpn0Var, q360Var, kekVar);
        hjv hjvVar = hjv.a;
        Application application2 = this.b;
        s73 s73Var = new s73();
        bpn0 bpn0Var2 = new bpn0(new xh6(i9));
        o260.c cVar = new o260.c(application2);
        bpn0 bpn0Var3 = new bpn0(new d53(1));
        hjvVar.getClass();
        hjv.g = t260Var;
        hjv.h = s73Var;
        hjv.b(((Boolean) bpn0Var2.getValue()).booleanValue());
        c460 c460Var = new c460(application2, a0a.d.equals("vk.com"));
        c460Var.a(new b460());
        wvb0 wvb0Var = new wvb0(new apf(application2, 3), new cjv(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0));
        bpn0 bpn0Var4 = rhr.i;
        io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(((mir) bpn0Var4.getValue()).g.a0(io.reactivex.rxjava3.schedulers.a.b()), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
        final dir dirVar = new dir();
        io.reactivex.rxjava3.internal.operators.observable.p1 p1Var = new io.reactivex.rxjava3.internal.operators.observable.p1(yVar, new io.reactivex.rxjava3.functions.l() { // from class: xsna.eir
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj) {
                return (it80) dir.this.invoke(obj);
            }
        });
        io.reactivex.rxjava3.internal.operators.observable.m1 F = sa30.F();
        final ajv ajvVar = new ajv();
        mqa mqaVar2 = new mqa(wvb0Var, c460Var, booleanValue && !((mir) bpn0Var4.getValue()).b.a.getBoolean("config_disable_pinning", false), io.reactivex.rxjava3.core.q.m(p1Var, F, new io.reactivex.rxjava3.functions.c() { // from class: xsna.yiv
            @Override // io.reactivex.rxjava3.functions.c
            public final Object apply(Object obj, Object obj2) {
                return (List) ajv.this.invoke(obj, obj2);
            }
        }));
        yx2.a aVar2 = apiConfig.f;
        Interceptor a4 = tz80.a(new l2p0(new l2p0.a(aVar2.a, aVar2.b), z8 ? k2p0.b : z4g.e), "TooManyRequest");
        ywe0 ywe0Var = bVar2.a ? new ywe0(bVar2) : null;
        Interceptor interceptor = (!bVar2.a || ywe0Var == null) ? a4 : null;
        if (bae0Var.a) {
            application = application2;
            mqaVar = mqaVar2;
            initializedLazyImpl = new InitializedLazyImpl(new gae0(application2, mqaVar2, bae0Var, a4, s73Var, false, bpn0Var2).invoke());
        } else {
            dev0.a.getClass();
            initializedLazyImpl = new InitializedLazyImpl(dev0.a.a());
            application = application2;
            mqaVar = mqaVar2;
        }
        n460 n460Var = new n460(new n460.a(application.getFilesDir(), akyVar2.e, w6lVar.a.invoke().booleanValue(), apiConfig.d), new bpn0(new e53(5)), (com.vk.core.utils.newtork.b) hjv.d.getValue(), new sq6(5), new jnf(2), new ziv(0));
        hjv.c = n460Var;
        o260 o260Var = d260.a;
        kui kuiVar = (kui) hjv.b.getValue();
        Application application3 = application;
        Set y0 = rl3.y0(new izs[]{new pej(2), new gyu(t260Var, 1), new zdf(t260Var, 4), new e45(ywe0Var, 1), new icw(interceptor, 1), new faj(t260Var, 2), new adx(0, wb3Var), new qib(sb8Var, 1), new i45(t260Var, 1), new z35(t260Var, 1)});
        final m7y0 m7y0Var = (m7y0) hjv.f.getValue();
        final z4g z4gVar = new z4g(4);
        final k7y0 k7y0Var = new k7y0(t7y0Var.b, t7y0Var.c, t7y0Var.d);
        d260.a = new o260(application3, aVar, d260.b, mqaVar, kuiVar, n460Var, initializedLazyImpl, t260Var.d, y0, rl3.y0(new izs[]{new izs() { // from class: xsna.bdx
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                if (a460.this.c) {
                    return tz80.a(new bsu(), "GzipResponse");
                }
                return null;
            }
        }, new izs() { // from class: xsna.cdx
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                m7y0 m7y0Var2 = m7y0.this;
                if (m7y0Var2 != null) {
                    return tz80.a(new u7y0(m7y0Var2, z4gVar, k7y0Var), "Zstd");
                }
                return null;
            }
        }, new la4(a460Var, 3)}), new djv(bpn0Var3, g), cVar, t260Var.w, new fjv(0, hjvVar, hjv.class, "getCurrentXScreen", "getCurrentXScreen()Ljava/lang/String;", 0), new r260(t260Var.q, executor, new wrk0(n460Var)), t260Var.e.h);
        Application application4 = this.b;
        y56 y56Var = new y56(3);
        nb3 nb3Var = nb3.a;
        if (q5m.a.invoke().booleanValue()) {
            asu0.a.getClass();
            asu0.o().execute(new o8i(application4, y56Var));
        }
        com.vk.core.utils.newtork.b bVar3 = com.vk.core.utils.newtork.b.a;
        Application application5 = this.b;
        c.a aVar3 = new c.a();
        aVar3.a = new ihg(5);
        com.vk.core.utils.newtork.c cVar2 = new com.vk.core.utils.newtork.c();
        cVar2.a = aVar3.a;
        synchronized (bVar3) {
            L.e("Initialization of network manager");
            com.vk.core.utils.newtork.b.c = cVar2;
            if (com.vk.core.utils.newtork.b.b == null) {
                com.vk.core.utils.newtork.a aVar4 = new com.vk.core.utils.newtork.a(application5, cVar2);
                com.vk.core.utils.newtork.b.b = aVar4;
                com.vk.core.utils.newtork.d b5 = aVar4.b();
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Initial status of NetworkManager = ".concat(b5.getClass().getSimpleName())});
                }
                com.vk.core.utils.newtork.b.d.onNext(b5);
                utk0 utk0Var = com.vk.core.utils.newtork.b.f;
                utk0Var.getClass();
                utk0Var.i(null, b5);
                com.vk.core.utils.newtork.a aVar5 = com.vk.core.utils.newtork.b.b;
                (aVar5 == null ? null : aVar5).a(bVar3);
            }
        }
        gjv.b = new qxi();
        return s3q0.a;
    }
}
