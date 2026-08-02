package ru.rustore.sdk.pushclient.m;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.HostInfoProvider;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.common.analytics.EmptyAnalyticsSender;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.analytics.AnalyticsTimingsStoreImpl;
import com.vk.push.core.data.repository.CallingAppRepositoryImplKt;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.data.repository.CrashSenderRepositoryFactory;
import com.vk.push.core.data.repository.IssueKeyBlackListRepository;
import com.vk.push.core.data.repository.PackagesRepositoryImplKt;
import com.vk.push.core.data.source.CallingAppDataSource;
import com.vk.push.core.data.source.ContextDataSource;
import com.vk.push.core.data.source.DeviceInfoDataSource;
import com.vk.push.core.data.source.PackageManagerDataSource;
import com.vk.push.core.deviceid.DeviceIdRepositoryProvider;
import com.vk.push.core.domain.repository.CallingAppRepository;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.feature.FeatureManager;
import com.vk.push.core.feature.FeatureManagerImpl;
import com.vk.push.core.filedatastore.FileDataSource;
import com.vk.push.core.filedatastore.FileDataStore;
import com.vk.push.core.network.PusherHostProvider;
import com.vk.push.core.network.data.source.MasterHostApi;
import com.vk.push.core.network.http.HttpClient;
import kotlin.jvm.internal.Lambda;
import xsna.aaz0;
import xsna.apy0;
import xsna.axy0;
import xsna.bay0;
import xsna.bpn0;
import xsna.c4z0;
import xsna.cfy0;
import xsna.dd70;
import xsna.el20;
import xsna.gzs;
import xsna.h3g0;
import xsna.h7l0;
import xsna.hay0;
import xsna.i7f0;
import xsna.iay0;
import xsna.imj0;
import xsna.jay0;
import xsna.jn4;
import xsna.k2z0;
import xsna.k5z0;
import xsna.kvy0;
import xsna.nbz0;
import xsna.niy0;
import xsna.nyy0;
import xsna.pvy0;
import xsna.q5o;
import xsna.qcy;
import xsna.r3y0;
import xsna.s101;
import xsna.s9y0;
import xsna.u1z0;
import xsna.utb;
import xsna.uty0;
import xsna.wkz;
import xsna.xwy0;
import xsna.yoy0;

/* loaded from: classes9.dex */
public final class h {
    public static final Logger a;
    public static final bpn0 b;
    public static final bpn0 c;
    public static final bpn0 d;
    public static final bpn0 e;
    public static final bpn0 f;
    public static final bpn0 g;
    public static final bpn0 h;
    public static final bpn0 i;
    public static final bpn0 j;
    public static final bpn0 k;
    public static final bpn0 l;
    public static final bpn0 m;
    public static final bpn0 n;
    public static final bpn0 o;
    public static final bpn0 p;
    public static final bpn0 q;
    public static final bpn0 r;
    public static final bpn0 s;
    public static final bpn0 t;
    public static final bpn0 u;
    public static final bpn0 v;
    public static final bpn0 w;

    public static final class a extends Lambda implements gzs<ru.rustore.sdk.pushclient.f.a> {
        public static final a i = new a();

        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final ru.rustore.sdk.pushclient.f.a invoke() {
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            return new ru.rustore.sdk.pushclient.f.a(r3y0.c.a(aaz0Var.a.getApplicationContext()).b, (ru.rustore.sdk.pushclient.k.c) h.o.getValue(), (AnalyticsTimingsStore) h.p.getValue(), (FeatureManager) h.u.getValue(), h.a);
        }
    }

    public static final class b extends Lambda implements gzs<bay0> {
        public static final b i = new b();

        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final bay0 invoke() {
            Logger logger = h.a;
            aaz0 aaz0Var = s101.f;
            if (aaz0Var != null) {
                return new bay0(new h3g0(aaz0Var.a));
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    public static final class c extends Lambda implements gzs<ru.rustore.sdk.pushclient.k.b> {
        public static final c i = new c();

        public c() {
            super(0);
        }

        @Override // xsna.gzs
        public final ru.rustore.sdk.pushclient.k.b invoke() {
            Logger logger = h.a;
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            PackageManagerDataSource packageManagerDataSource = new PackageManagerDataSource(aaz0Var.a.getApplicationContext().getPackageManager());
            utb utbVar = new utb(ru.rustore.sdk.pushclient.m.j.i, ru.rustore.sdk.pushclient.m.k.i);
            ru.rustore.sdk.pushclient.m.e eVar = ru.rustore.sdk.pushclient.m.e.a;
            aaz0 aaz0Var2 = s101.f;
            if (aaz0Var2 == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = aaz0Var2.a.getApplicationContext();
            eVar.getClass();
            i7f0 i7f0Var = ru.rustore.sdk.pushclient.m.e.i;
            qcy<?>[] qcyVarArr = ru.rustore.sdk.pushclient.m.e.b;
            FileDataStore fileDataStore = (FileDataStore) i7f0Var.getValue(applicationContext, qcyVarArr[6]);
            aaz0 aaz0Var3 = s101.f;
            if (aaz0Var3 == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            niy0 niy0Var = new niy0(fileDataStore, (FileDataStore) ru.rustore.sdk.pushclient.m.e.j.getValue(aaz0Var3.a.getApplicationContext(), qcyVarArr[7]));
            HttpClient httpClient = (HttpClient) ru.rustore.sdk.pushclient.m.g.b.getValue();
            aaz0 aaz0Var4 = s101.f;
            if (aaz0Var4 == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            HostInfoProvider hostInfoProvider = aaz0Var4.f;
            if (hostInfoProvider == null) {
                hostInfoProvider = new PusherHostProvider();
            }
            MasterHostApi masterHostApi = new MasterHostApi(httpClient, hostInfoProvider, null, 4, null);
            aaz0 aaz0Var5 = s101.f;
            if (aaz0Var5 == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext2 = aaz0Var5.a.getApplicationContext();
            Logger logger2 = h.a;
            return new ru.rustore.sdk.pushclient.k.b(packageManagerDataSource, utbVar, niy0Var, masterHostApi, new apy0(new q5o(applicationContext2, logger2)), new ru.rustore.sdk.pushclient.m.i(1, null), h.b(), logger2);
        }
    }

    public static final class d extends Lambda implements gzs<ru.rustore.sdk.pushclient.k.c> {
        public static final d i = new d();

        public d() {
            super(0);
        }

        @Override // xsna.gzs
        public final ru.rustore.sdk.pushclient.k.c invoke() {
            Logger logger = h.a;
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            jn4 jn4Var = new jn4(aaz0Var.j);
            wkz a = h.a();
            aaz0 aaz0Var2 = s101.f;
            if (aaz0Var2 != null) {
                return new ru.rustore.sdk.pushclient.k.c(jn4Var, a, new DeviceInfoDataSource(aaz0Var2.a.getApplicationContext()), (DeviceIdRepository) h.n.getValue(), (FeatureManager) h.u.getValue());
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    public static final class e extends Lambda implements gzs<CallingAppRepository> {
        public static final e i = new e();

        public e() {
            super(0);
        }

        @Override // xsna.gzs
        public final CallingAppRepository invoke() {
            Logger logger = h.a;
            aaz0 aaz0Var = s101.f;
            if (aaz0Var != null) {
                return CallingAppRepositoryImplKt.CallingAppRepository(new CallingAppDataSource(aaz0Var.a.getApplicationContext()));
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    public static final class f extends Lambda implements gzs<yoy0> {
        public static final f i = new f();

        public f() {
            super(0);
        }

        @Override // xsna.gzs
        public final yoy0 invoke() {
            return new yoy0(h.a());
        }
    }

    public static final class g extends Lambda implements gzs<uty0> {
        public static final g i = new g();

        public g() {
            super(0);
        }

        @Override // xsna.gzs
        public final uty0 invoke() {
            Logger logger = h.a;
            ru.rustore.sdk.pushclient.m.e eVar = ru.rustore.sdk.pushclient.m.e.a;
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = aaz0Var.a.getApplicationContext();
            eVar.getClass();
            return new uty0(new axy0((FileDataStore) ru.rustore.sdk.pushclient.m.e.c.getValue(applicationContext, ru.rustore.sdk.pushclient.m.e.b[0])));
        }
    }

    /* renamed from: ru.rustore.sdk.pushclient.m.h$h, reason: collision with other inner class name */
    public static final class C2407h extends Lambda implements gzs<iay0> {
        public static final C2407h i = new C2407h();

        public C2407h() {
            super(0);
        }

        @Override // xsna.gzs
        public final iay0 invoke() {
            Logger logger = h.a;
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = aaz0Var.a.getApplicationContext();
            Logger logger2 = h.a;
            return new iay0(new el20(applicationContext, logger2), (s9y0) h.c.getValue(), logger2);
        }
    }

    public static final class i extends Lambda implements gzs<CrashReporterRepository> {
        public static final i i = new i();

        public i() {
            super(0);
        }

        @Override // xsna.gzs
        public final CrashReporterRepository invoke() {
            CrashSenderRepositoryFactory crashSenderRepositoryFactory = new CrashSenderRepositoryFactory();
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            return crashSenderRepositoryFactory.createCrashSenderRepository(aaz0Var.a.getApplicationContext(), "ru.rustore.sdk.pushclient", (IssueKeyBlackListRepository) h.t.getValue(), h.a);
        }
    }

    public static final class j extends Lambda implements gzs<DeviceIdRepository> {
        public static final j i = new j();

        public j() {
            super(0);
        }

        @Override // xsna.gzs
        public final DeviceIdRepository invoke() {
            DeviceIdRepositoryProvider deviceIdRepositoryProvider = DeviceIdRepositoryProvider.INSTANCE;
            aaz0 aaz0Var = s101.f;
            if (aaz0Var != null) {
                return deviceIdRepositoryProvider.initIfRequired(aaz0Var.a.getApplicationContext(), h.a);
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    public static final class k extends Lambda implements gzs<EmptyAnalyticsSender> {
        public static final k i = new k();

        public k() {
            super(0);
        }

        @Override // xsna.gzs
        public final EmptyAnalyticsSender invoke() {
            return new EmptyAnalyticsSender();
        }
    }

    public static final class l extends Lambda implements gzs<hay0> {
        public static final l i = new l();

        public l() {
            super(0);
        }

        @Override // xsna.gzs
        public final hay0 invoke() {
            FeatureManager featureManager = (FeatureManager) h.u.getValue();
            aaz0 aaz0Var = s101.f;
            if (aaz0Var != null) {
                return new hay0(featureManager, new FileDataSource(aaz0Var.a.getApplicationContext(), "vkpns_client_external_apps_config", null, 4, null));
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    public static final class m extends Lambda implements gzs<FeatureManagerImpl> {
        public static final m i = new m();

        public m() {
            super(0);
        }

        @Override // xsna.gzs
        public final FeatureManagerImpl invoke() {
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            return new FeatureManagerImpl(aaz0Var.a.getApplicationContext(), (HttpClient) ru.rustore.sdk.pushclient.m.g.c.getValue(), (CrashReporterRepository) h.v.getValue(), (IssueKeyBlackListRepository) h.t.getValue(), (DeviceIdRepository) h.n.getValue(), h.a, null, null, PsExtractor.AUDIO_STREAM, null);
        }
    }

    public static final class n extends Lambda implements gzs<kvy0> {
        public static final n i = new n();

        public n() {
            super(0);
        }

        @Override // xsna.gzs
        public final kvy0 invoke() {
            Logger logger = h.a;
            s101.h();
            return new kvy0(new nyy0(new h7l0(s101.h().a.getApplicationContext(), s101.h().b, logger), new ru.rustore.sdk.pushclient.m.l(1, null), new ru.rustore.sdk.pushclient.m.m(1, null), logger));
        }
    }

    public static final class o extends Lambda implements gzs<IssueKeyBlackListRepository> {
        public static final o i = new o();

        public o() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.gzs
        public final IssueKeyBlackListRepository invoke() {
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            return new IssueKeyBlackListRepository(aaz0Var.a.getApplicationContext(), null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class p extends Lambda implements gzs<xwy0> {
        public static final p i = new p();

        public p() {
            super(0);
        }

        @Override // xsna.gzs
        public final xwy0 invoke() {
            Logger logger = h.a;
            ru.rustore.sdk.pushclient.m.e eVar = ru.rustore.sdk.pushclient.m.e.a;
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = aaz0Var.a.getApplicationContext();
            eVar.getClass();
            return new xwy0(new k5z0((FileDataStore) ru.rustore.sdk.pushclient.m.e.d.getValue(applicationContext, ru.rustore.sdk.pushclient.m.e.b[1])));
        }
    }

    public static final class q extends Lambda implements gzs<dd70> {
        public static final q i = new q();

        public q() {
            super(0);
        }

        @Override // xsna.gzs
        public final dd70 invoke() {
            aaz0 aaz0Var = s101.f;
            if (aaz0Var != null) {
                return new dd70(aaz0Var.a.getApplicationContext());
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    public static final class r extends Lambda implements gzs<PackagesRepository> {
        public static final r i = new r();

        public r() {
            super(0);
        }

        @Override // xsna.gzs
        public final PackagesRepository invoke() {
            Logger logger = h.a;
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            PackageManagerDataSource packageManagerDataSource = new PackageManagerDataSource(aaz0Var.a.getApplicationContext().getPackageManager());
            aaz0 aaz0Var2 = s101.f;
            if (aaz0Var2 != null) {
                return PackagesRepositoryImplKt.PackagesRepository(packageManagerDataSource, new ContextDataSource(aaz0Var2.a.getApplicationContext()));
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    public static final class s extends Lambda implements gzs<s9y0> {
        public static final s i = new s();

        public s() {
            super(0);
        }

        @Override // xsna.gzs
        public final s9y0 invoke() {
            ru.rustore.sdk.pushclient.m.e eVar = ru.rustore.sdk.pushclient.m.e.a;
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = aaz0Var.a.getApplicationContext();
            eVar.getClass();
            i7f0 i7f0Var = ru.rustore.sdk.pushclient.m.e.f;
            qcy<?>[] qcyVarArr = ru.rustore.sdk.pushclient.m.e.b;
            FileDataStore fileDataStore = (FileDataStore) i7f0Var.getValue(applicationContext, qcyVarArr[3]);
            aaz0 aaz0Var2 = s101.f;
            if (aaz0Var2 == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            return new cfy0(fileDataStore, (FileDataStore) ru.rustore.sdk.pushclient.m.e.g.getValue(aaz0Var2.a.getApplicationContext(), qcyVarArr[4]));
        }
    }

    public static final class t extends Lambda implements gzs<u1z0> {
        public static final t i = new t();

        public t() {
            super(0);
        }

        @Override // xsna.gzs
        public final u1z0 invoke() {
            Logger logger = h.a;
            aaz0 aaz0Var = s101.f;
            if (aaz0Var != null) {
                return new u1z0(new jn4(aaz0Var.j));
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    public static final class u extends Lambda implements gzs<k2z0> {
        public static final u i = new u();

        public u() {
            super(0);
        }

        @Override // xsna.gzs
        public final k2z0 invoke() {
            new ru.rustore.sdk.pushclient.m.o(1, null);
            return new k2z0(h.a);
        }
    }

    public static final class v extends Lambda implements gzs<AnalyticsTimingsStoreImpl> {
        public static final v i = new v();

        public v() {
            super(0);
        }

        @Override // xsna.gzs
        public final AnalyticsTimingsStoreImpl invoke() {
            return new AnalyticsTimingsStoreImpl();
        }
    }

    public static final class w extends Lambda implements gzs<c4z0> {
        public static final w i = new w();

        public w() {
            super(0);
        }

        @Override // xsna.gzs
        public final c4z0 invoke() {
            HttpClient httpClient = (HttpClient) ru.rustore.sdk.pushclient.m.g.b.getValue();
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            HostInfoProvider hostInfoProvider = aaz0Var.g;
            if (hostInfoProvider == null) {
                hostInfoProvider = new imj0();
            }
            return new c4z0(new nbz0(httpClient, hostInfoProvider), (s9y0) h.c.getValue(), h.a);
        }
    }

    static {
        Logger defaultLogger;
        aaz0 aaz0Var = s101.f;
        if (aaz0Var == null || (defaultLogger = aaz0Var.c) == null) {
            defaultLogger = new DefaultLogger("VkpnsClientSdk");
        }
        a = defaultLogger;
        b = new bpn0(g.i);
        c = new bpn0(s.i);
        d = new bpn0(w.i);
        e = new bpn0(c.i);
        f = new bpn0(u.i);
        g = new bpn0(C2407h.i);
        h = new bpn0(q.i);
        i = new bpn0(r.i);
        j = new bpn0(b.i);
        k = new bpn0(p.i);
        l = new bpn0(f.i);
        m = new bpn0(t.i);
        n = new bpn0(j.i);
        o = new bpn0(d.i);
        p = new bpn0(v.i);
        q = new bpn0(a.i);
        new bpn0(k.i);
        r = new bpn0(e.i);
        s = new bpn0(n.i);
        t = new bpn0(o.i);
        u = new bpn0(m.i);
        v = new bpn0(i.i);
        w = new bpn0(l.i);
    }

    public static final wkz a() {
        Logger defaultLogger;
        if (s101.f == null) {
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
        aaz0 aaz0Var = s101.f;
        if (aaz0Var == null || (defaultLogger = aaz0Var.c) == null) {
            defaultLogger = new DefaultLogger("VkpnsClientSdk");
        }
        wkz wkzVar = new wkz();
        wkzVar.b = defaultLogger.createLogger("ClientIdDataSource");
        return wkzVar;
    }

    public static AnalyticsSender b() {
        if (s101.f != null) {
            return (ru.rustore.sdk.pushclient.f.a) q.getValue();
        }
        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
    }

    public static jay0 c() {
        if (s101.f == null) {
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
        HttpClient httpClient = (HttpClient) ru.rustore.sdk.pushclient.m.g.b.getValue();
        aaz0 aaz0Var = s101.f;
        if (aaz0Var == null) {
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
        String str = aaz0Var.b;
        aaz0 aaz0Var2 = s101.f;
        if (aaz0Var2 == null) {
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
        HostInfoProvider hostInfoProvider = aaz0Var2.f;
        if (hostInfoProvider == null) {
            hostInfoProvider = new PusherHostProvider();
        }
        return new ru.rustore.sdk.pushclient.w.c(new pvy0(httpClient, str, hostInfoProvider), (s9y0) c.getValue());
    }
}
