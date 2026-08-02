package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.push.common.DefaultLogger;
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
import com.vk.push.core.data.repository.MetadataRepositoryImplKt;
import com.vk.push.core.data.repository.PackagesRepositoryImplKt;
import com.vk.push.core.data.source.CallingAppDataSource;
import com.vk.push.core.data.source.ContextDataSource;
import com.vk.push.core.data.source.DeviceInfoDataSource;
import com.vk.push.core.data.source.ManifestDataSource;
import com.vk.push.core.data.source.PackageManagerDataSource;
import com.vk.push.core.deviceid.DeviceIdRepositoryProvider;
import com.vk.push.core.domain.repository.CallingAppRepository;
import com.vk.push.core.domain.repository.MetadataRepository;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.feature.FeatureManager;
import com.vk.push.core.feature.FeatureManagerImpl;
import com.vk.push.core.filedatastore.FileDataSource;
import com.vk.push.core.filedatastore.FileDataStore;
import com.vk.push.core.network.PusherHostProvider;
import com.vk.push.core.network.http.HttpClient;
import com.vk.push.core.process.SeparateProcessRepository;
import com.vk.push.pushsdk.VkpnsPushConfig;
import com.vk.push.pushsdk.ipc.PushService;
import kotlin.jvm.internal.Lambda;

/* compiled from: RepositoryModule.kt */
/* loaded from: classes.dex */
public final class v6g0 {
    public static final bpn0 A;
    public static final bpn0 B;
    public static final bpn0 C;
    public static final bpn0 D;
    public static final bpn0 E;
    public static final bpn0 F;
    public static final bpn0 G;
    public static final bpn0 H;
    public static final bpn0 I;
    public static final bpn0 J;
    public static final bpn0 K;
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
    public static final bpn0 x;
    public static final bpn0 y;
    public static final bpn0 z;

    /* compiled from: RepositoryModule.kt */
    public static final class a extends Lambda implements gzs<ly1> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final ly1 invoke() {
            Logger logger = v6g0.a;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig != null) {
                return new ly1(new iy1(new FileDataSource(vkpnsPushConfig.a.getApplicationContext(), "sending_push_count_file.txt", null, 4, null)));
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class a0 extends Lambda implements gzs<w80> {
        public static final a0 i = new a0(0);

        @Override // xsna.gzs
        public final w80 invoke() {
            Logger logger = v6g0.a;
            AnalyticsSender a = v6g0.a();
            FeatureManager c = v6g0.c();
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig != null) {
                return new w80(a, c, new FileDataSource(vkpnsPushConfig.a.getApplicationContext(), "service_active_analytics.txt", null, 4, null), "push_service");
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class b extends Lambda implements gzs<fe6> {
        public static final b i = new b(0);

        @Override // xsna.gzs
        public final fe6 invoke() {
            Logger logger = v6g0.a;
            z4g z4gVar = new z4g(7);
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig != null) {
                return new fe6(z4gVar, new DeviceInfoDataSource(vkpnsPushConfig.a.getApplicationContext()), (DeviceIdRepository) v6g0.g.getValue(), v6g0.c());
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class b0 extends Lambda implements gzs<uri0> {
        public static final b0 i = new b0(0);

        @Override // xsna.gzs
        public final uri0 invoke() {
            Logger logger = v6g0.a;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = vkpnsPushConfig.a.getApplicationContext();
            if (qxi.b != null) {
                return new uri0(new fpz(applicationContext, v6g0.a));
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class c extends Lambda implements gzs<pv6> {
        public static final c i = new c(0);

        @Override // xsna.gzs
        public final pv6 invoke() {
            qvk qvkVar = qvk.a;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = vkpnsPushConfig.a.getApplicationContext();
            qvkVar.getClass();
            return new pv6((FileDataStore) qvk.g.getValue(applicationContext, qvk.b[4]));
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class c0 extends Lambda implements gzs<msi0> {
        public static final c0 i = new c0(0);

        @Override // xsna.gzs
        public final msi0 invoke() {
            Logger logger = v6g0.a;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig != null) {
                return new msi0(new vt5(vkpnsPushConfig.a.getApplicationContext()));
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class d extends Lambda implements gzs<CallingAppRepository> {
        public static final d i = new d(0);

        @Override // xsna.gzs
        public final CallingAppRepository invoke() {
            Logger logger = v6g0.a;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig != null) {
                return CallingAppRepositoryImplKt.CallingAppRepository(new CallingAppDataSource(vkpnsPushConfig.a.getApplicationContext()));
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class d0 extends Lambda implements gzs<rvk> {
        public static final d0 i = new d0(0);

        @Override // xsna.gzs
        public final rvk invoke() {
            qvk qvkVar = qvk.a;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = vkpnsPushConfig.a.getApplicationContext();
            qvkVar.getClass();
            return new rvk((FileDataStore) qvk.h.getValue(applicationContext, qvk.b[5]));
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class e extends Lambda implements gzs<jlc> {
        public static final e i = new e(0);

        @Override // xsna.gzs
        public final jlc invoke() {
            g790 a = mwk.a();
            ske0 c = mwk.c();
            Logger logger = v6g0.a;
            return new jlc(a, c, v6g0.f(), mwk.b(), v6g0.a(), v6g0.a);
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class e0 extends Lambda implements gzs<AnalyticsTimingsStoreImpl> {
        public static final e0 i = new e0(0);

        @Override // xsna.gzs
        public final AnalyticsTimingsStoreImpl invoke() {
            return new AnalyticsTimingsStoreImpl();
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class f extends Lambda implements gzs<CrashReporterRepository> {
        public static final f i = new f(0);

        @Override // xsna.gzs
        public final CrashReporterRepository invoke() {
            CrashSenderRepositoryFactory crashSenderRepositoryFactory = new CrashSenderRepositoryFactory();
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            return crashSenderRepositoryFactory.createCrashSenderRepository(vkpnsPushConfig.a.getApplicationContext(), "com.vk.push.pushsdk", (IssueKeyBlackListRepository) v6g0.D.getValue(), v6g0.a);
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class f0 extends Lambda implements gzs<u8x0> {
        public static final f0 i = new f0(0);

        @Override // xsna.gzs
        public final u8x0 invoke() {
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = vkpnsPushConfig.a.getApplicationContext();
            Logger logger = v6g0.a;
            return new u8x0(applicationContext, v6g0.c());
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class g extends Lambda implements gzs<DeviceIdRepository> {
        public static final g i = new g(0);

        @Override // xsna.gzs
        public final DeviceIdRepository invoke() {
            DeviceIdRepositoryProvider deviceIdRepositoryProvider = DeviceIdRepositoryProvider.INSTANCE;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig != null) {
                return deviceIdRepositoryProvider.initIfRequired(vkpnsPushConfig.a.getApplicationContext(), v6g0.a);
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class g0 extends Lambda implements gzs<w80> {
        public static final g0 i = new g0(0);

        @Override // xsna.gzs
        public final w80 invoke() {
            Logger logger = v6g0.a;
            AnalyticsSender a = v6g0.a();
            FeatureManager c = v6g0.c();
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig != null) {
                return new w80(a, c, new FileDataSource(vkpnsPushConfig.a.getApplicationContext(), "web_socket_active_analytics.txt", null, 4, null), "web_socket");
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class h extends Lambda implements gzs<sap> {
        public static final h i = new h(0);

        @Override // xsna.gzs
        public final sap invoke() {
            qvk qvkVar = qvk.a;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = vkpnsPushConfig.a.getApplicationContext();
            qvkVar.getClass();
            return new sap((FileDataStore) qvk.f.getValue(applicationContext, qvk.b[3]));
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class h0 extends Lambda implements gzs<wvx0> {
        public static final h0 i = new h0(0);

        @Override // xsna.gzs
        public final wvx0 invoke() {
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig != null) {
                return new wvx0(vkpnsPushConfig.a.getApplicationContext(), v6g0.a);
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class i extends Lambda implements gzs<EmptyAnalyticsSender> {
        public static final i i = new i(0);

        @Override // xsna.gzs
        public final EmptyAnalyticsSender invoke() {
            return new EmptyAnalyticsSender();
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class i0 extends Lambda implements gzs<ezx0> {
        public static final i0 i = new i0(0);

        @Override // xsna.gzs
        public final ezx0 invoke() {
            Logger logger = v6g0.a;
            fzx0 fzx0Var = (fzx0) v6g0.w.getValue();
            z540 z540Var = (z540) v6g0.v.getValue();
            qvk qvkVar = qvk.a;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = vkpnsPushConfig.a.getApplicationContext();
            qvkVar.getClass();
            return new ezx0(fzx0Var, z540Var, new v260((FileDataStore) qvk.c.getValue(applicationContext, qvk.b[0])), (SeparateProcessRepository) v6g0.x.getValue());
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class j extends Lambda implements gzs<FeatureManagerImpl> {
        public static final j i = new j(0);

        @Override // xsna.gzs
        public final FeatureManagerImpl invoke() {
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = vkpnsPushConfig.a.getApplicationContext();
            Logger logger = v6g0.a;
            return new FeatureManagerImpl(applicationContext, (HttpClient) o460.d.getValue(), v6g0.b(), (IssueKeyBlackListRepository) v6g0.D.getValue(), (DeviceIdRepository) v6g0.g.getValue(), v6g0.a, null, null, PsExtractor.AUDIO_STREAM, null);
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class j0 extends Lambda implements gzs<fzx0> {
        public static final j0 i = new j0(0);

        @Override // xsna.gzs
        public final fzx0 invoke() {
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = vkpnsPushConfig.a.getApplicationContext();
            Logger logger = v6g0.a;
            return new fzx0(applicationContext, (gzx0) v6g0.t.getValue(), v6g0.b());
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class k extends Lambda implements gzs<agv> {
        public static final k i = new k(0);

        @Override // xsna.gzs
        public final agv invoke() {
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            hl20 hl20Var = r3y0.c.a(vkpnsPushConfig.a.getApplicationContext()).b;
            Logger logger = v6g0.a;
            return new agv(hl20Var, (fe6) v6g0.e.getValue(), (AnalyticsTimingsStore) v6g0.b.getValue(), v6g0.c(), v6g0.a);
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class k0 extends Lambda implements gzs<gzx0> {
        public static final k0 i = new k0(0);

        @Override // xsna.gzs
        public final gzx0 invoke() {
            return new gzx0();
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class l extends Lambda implements gzs<IssueKeyBlackListRepository> {
        public static final l i = new l(0);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.gzs
        public final IssueKeyBlackListRepository invoke() {
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            return new IssueKeyBlackListRepository(vkpnsPushConfig.a.getApplicationContext(), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class m extends Lambda implements gzs<yly> {
        public static final m i = new m(0);

        @Override // xsna.gzs
        public final yly invoke() {
            qvk qvkVar = qvk.a;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = vkpnsPushConfig.a.getApplicationContext();
            qvkVar.getClass();
            return new yly((FileDataStore) qvk.j.getValue(applicationContext, qvk.b[7]));
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class n extends Lambda implements gzs<pmy> {
        public static final n i = new n(0);

        @Override // xsna.gzs
        public final pmy invoke() {
            qvk qvkVar = qvk.a;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = vkpnsPushConfig.a.getApplicationContext();
            qvkVar.getClass();
            return new pmy((FileDataStore) qvk.d.getValue(applicationContext, qvk.b[1]));
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class o extends Lambda implements gzs<bk10> {
        public static final o i = new o(0);

        @Override // xsna.gzs
        public final bk10 invoke() {
            Logger logger = v6g0.a;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            ContextDataSource contextDataSource = new ContextDataSource(vkpnsPushConfig.a.getApplicationContext());
            qvk qvkVar = qvk.a;
            VkpnsPushConfig vkpnsPushConfig2 = qxi.b;
            if (vkpnsPushConfig2 == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = vkpnsPushConfig2.a.getApplicationContext();
            qvkVar.getClass();
            return new bk10((FileDataStore) qvk.e.getValue(applicationContext, qvk.b[2]), contextDataSource);
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class p extends Lambda implements gzs<MetadataRepository> {
        public static final p i = new p(0);

        @Override // xsna.gzs
        public final MetadataRepository invoke() {
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            PackageManager packageManager = vkpnsPushConfig.a.getApplicationContext().getPackageManager();
            VkpnsPushConfig vkpnsPushConfig2 = qxi.b;
            if (vkpnsPushConfig2 != null) {
                return MetadataRepositoryImplKt.MetadataRepository(new ManifestDataSource(packageManager, vkpnsPushConfig2.a.getApplicationContext().getPackageName()));
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class q extends Lambda implements gzs<z540> {
        public static final q i = new q(0);

        @Override // xsna.gzs
        public final z540 invoke() {
            Logger logger = v6g0.a;
            return new z540((wvx0) v6g0.u.getValue());
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class r extends Lambda implements gzs<w790> {
        public static final r i = new r(0);

        @Override // xsna.gzs
        public final w790 invoke() {
            return new w790(mwk.a());
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class s extends Lambda implements gzs<PackagesRepository> {
        public static final s i = new s(0);

        @Override // xsna.gzs
        public final PackagesRepository invoke() {
            Logger logger = v6g0.a;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            PackageManagerDataSource packageManagerDataSource = new PackageManagerDataSource(vkpnsPushConfig.a.getApplicationContext().getPackageManager());
            VkpnsPushConfig vkpnsPushConfig2 = qxi.b;
            if (vkpnsPushConfig2 != null) {
                return PackagesRepositoryImplKt.PackagesRepository(packageManagerDataSource, new ContextDataSource(vkpnsPushConfig2.a.getApplicationContext()));
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class t extends Lambda implements gzs<vgd0> {
        public static final t i = new t(0);

        @Override // xsna.gzs
        public final vgd0 invoke() {
            Logger logger = v6g0.a;
            return new vgd0(new rte0());
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class u extends Lambda implements gzs<tje0> {
        public static final u i = new u(0);

        @Override // xsna.gzs
        public final tje0 invoke() {
            return new tje0(mwk.d(), mwk.b(), mwk.c(), v6g0.a);
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class v extends Lambda implements gzs<sle0> {
        public static final v i = new v(0);

        @Override // xsna.gzs
        public final sle0 invoke() {
            ske0 c = mwk.c();
            bpn0 bpn0Var = o460.a;
            HttpClient httpClient = (HttpClient) o460.c.getValue();
            if (qxi.b != null) {
                return new sle0(c, new rke0(httpClient, new PusherHostProvider()));
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class w extends Lambda implements gzs<ijh0> {
        public static final w i = new w(0);

        @Override // xsna.gzs
        public final ijh0 invoke() {
            qvk qvkVar = qvk.a;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            Context applicationContext = vkpnsPushConfig.a.getApplicationContext();
            qvkVar.getClass();
            return new ijh0((FileDataStore) qvk.i.getValue(applicationContext, qvk.b[6]));
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class x extends Lambda implements gzs<qjh0> {
        public static final x i = new x(0);

        @Override // xsna.gzs
        public final qjh0 invoke() {
            Logger logger = v6g0.a;
            return new qjh0(new z4g(7));
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class y extends Lambda implements gzs<SeparateProcessRepository> {
        public static final y i = new y(0);

        @Override // xsna.gzs
        public final SeparateProcessRepository invoke() {
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig != null) {
                return new SeparateProcessRepository(vkpnsPushConfig.a.getApplicationContext(), (MetadataRepository) v6g0.s.getValue());
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    /* compiled from: RepositoryModule.kt */
    public static final class z extends Lambda implements gzs<coi0> {
        public static final z i = new z(0);

        @Override // xsna.gzs
        public final coi0 invoke() {
            if (qxi.b == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig != null) {
                return new coi0(vkpnsPushConfig.a.getApplicationContext(), PushService.class);
            }
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }

    static {
        Logger defaultLogger;
        VkpnsPushConfig vkpnsPushConfig = qxi.b;
        if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
            defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
        }
        a = defaultLogger;
        b = new bpn0(e0.i);
        c = new bpn0(k.i);
        new bpn0(i.i);
        d = new bpn0(f0.i);
        e = new bpn0(b.i);
        f = new bpn0(x.i);
        g = new bpn0(g.i);
        h = new bpn0(d0.i);
        i = new bpn0(o.i);
        j = new bpn0(n.i);
        k = new bpn0(c.i);
        l = new bpn0(h.i);
        m = new bpn0(b0.i);
        n = new bpn0(v.i);
        o = new bpn0(r.i);
        p = new bpn0(w.i);
        q = new bpn0(t.i);
        r = new bpn0(c0.i);
        s = new bpn0(p.i);
        t = new bpn0(k0.i);
        u = new bpn0(h0.i);
        v = new bpn0(q.i);
        w = new bpn0(j0.i);
        x = new bpn0(y.i);
        y = new bpn0(i0.i);
        z = new bpn0(s.i);
        A = new bpn0(u.i);
        B = new bpn0(a.i);
        C = new bpn0(d.i);
        D = new bpn0(l.i);
        E = new bpn0(j.i);
        F = new bpn0(f.i);
        G = new bpn0(e.i);
        H = new bpn0(z.i);
        I = new bpn0(a0.i);
        J = new bpn0(g0.i);
        K = new bpn0(m.i);
    }

    public static AnalyticsSender a() {
        if (qxi.b != null) {
            return (agv) c.getValue();
        }
        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
    }

    public static CrashReporterRepository b() {
        return (CrashReporterRepository) F.getValue();
    }

    public static FeatureManager c() {
        return (FeatureManager) E.getValue();
    }

    public static bk10 d() {
        return (bk10) i.getValue();
    }

    public static PackagesRepository e() {
        return (PackagesRepository) z.getValue();
    }

    public static don0 f() {
        return (don0) h.getValue();
    }

    public static ezx0 g() {
        return (ezx0) y.getValue();
    }
}
