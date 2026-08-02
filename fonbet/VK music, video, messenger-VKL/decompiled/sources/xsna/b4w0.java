package xsna;

import android.app.Application;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.push.authsdk.Secrets;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.common.analytics.EmptyAnalyticsSender;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.analytics.AnalyticsTimingsStoreImpl;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.data.repository.CallingAppRepositoryImplKt;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.data.repository.CrashSenderRepositoryFactory;
import com.vk.push.core.data.repository.IssueKeyBlackListRepository;
import com.vk.push.core.data.repository.MetadataRepositoryImplKt;
import com.vk.push.core.data.source.CallingAppDataSource;
import com.vk.push.core.data.source.DeviceInfoDataSource;
import com.vk.push.core.data.source.ManifestDataSource;
import com.vk.push.core.deviceid.CollectDeviceIdErrorsUseCase;
import com.vk.push.core.deviceid.DeviceIdRepositoryProvider;
import com.vk.push.core.domain.repository.CallingAppRepository;
import com.vk.push.core.domain.repository.MetadataRepository;
import com.vk.push.core.domain.usecase.GetCallingAppInfoUseCase;
import com.vk.push.core.feature.FeatureManager;
import com.vk.push.core.feature.FeatureManagerImpl;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import com.vk.push.core.network.http.HttpClient;
import com.vk.push.core.process.SeparateProcessRepository;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Lambda;

/* compiled from: VkpnsAuthSdk.kt */
/* loaded from: classes.dex */
public final class b4w0 {
    public static final b E = new b();
    public static final SdkInitAwaiter F = new SdkInitAwaiter("VkpnsAuthSdk", a.i);
    public static volatile b4w0 G;
    public final bpn0 A;
    public final bpn0 B;
    public final bpn0 C;
    public final hpj D;
    public final y3w0 a;
    public final Application b;
    public final zzp c;
    public final yhe0 d;
    public final bpn0 e = new bpn0(new s());
    public final bpn0 f = new bpn0(new w());
    public final bpn0 g = new bpn0(new u());
    public final bpn0 h = new bpn0(new p());
    public final bpn0 i = new bpn0(new k());
    public final bpn0 j = new bpn0(new t());
    public final bpn0 k = new bpn0(new c());
    public final bpn0 l = new bpn0(new l());
    public final bpn0 m = new bpn0(b0.i);
    public final bpn0 n = new bpn0(new r());
    public final bpn0 o;
    public final bpn0 p;
    public final bpn0 q;
    public final bpn0 r;
    public final bpn0 s;
    public final bpn0 t;
    public final bpn0 u;
    public final bpn0 v;
    public final bpn0 w;
    public final bpn0 x;
    public final bpn0 y;
    public final bpn0 z;

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class a extends Lambda implements gzs<Boolean> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final Boolean invoke() {
            boolean z;
            if (b4w0.G != null) {
                b bVar = b4w0.E;
                if (b.a().a.d) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class a0 extends Lambda implements gzs<vri0> {
        public a0() {
            super(0);
        }

        @Override // xsna.gzs
        public final vri0 invoke() {
            return new vri0((tri0) b4w0.this.s.getValue());
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class b {
        public static b4w0 a() {
            b4w0 b4w0Var = b4w0.G;
            if (b4w0Var != null) {
                return b4w0Var;
            }
            throw new IllegalStateException("VKPNS Auth Provider SDK has not been initialized!");
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class b0 extends Lambda implements gzs<AnalyticsTimingsStoreImpl> {
        public static final b0 i = new b0(0);

        @Override // xsna.gzs
        public final AnalyticsTimingsStoreImpl invoke() {
            return new AnalyticsTimingsStoreImpl();
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class c extends Lambda implements gzs<x3w0> {
        public c() {
            super(0);
        }

        @Override // xsna.gzs
        public final x3w0 invoke() {
            return new x3w0((HttpClient) b4w0.this.e.getValue());
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class d extends Lambda implements gzs<a4w0> {
        public d() {
            super(0);
        }

        @Override // xsna.gzs
        public final a4w0 invoke() {
            return new a4w0((q15) b4w0.this.k.getValue());
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class e extends Lambda implements gzs<v55> {
        public e() {
            super(0);
        }

        @Override // xsna.gzs
        public final v55 invoke() {
            return new v55(pvk.a(b4w0.this.b));
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class f extends Lambda implements gzs<y55> {
        public f() {
            super(0);
        }

        @Override // xsna.gzs
        public final y55 invoke() {
            return new y55((v55) b4w0.this.q.getValue(), (o1i0) b4w0.this.t.getValue());
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class g extends Lambda implements gzs<b66> {
        public g() {
            super(0);
        }

        @Override // xsna.gzs
        public final b66 invoke() {
            b4w0 b4w0Var = b4w0.this;
            b bVar = b4w0.E;
            b4w0Var.getClass();
            return new b66(new ad0(), new DeviceInfoDataSource(b4w0.this.b), (DeviceIdRepository) b4w0.this.l.getValue(), (FeatureManager) b4w0.this.h.getValue());
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class h extends Lambda implements gzs<CallingAppDataSource> {
        public h() {
            super(0);
        }

        @Override // xsna.gzs
        public final CallingAppDataSource invoke() {
            return new CallingAppDataSource(b4w0.this.b);
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class i extends Lambda implements gzs<CallingAppRepository> {
        public i() {
            super(0);
        }

        @Override // xsna.gzs
        public final CallingAppRepository invoke() {
            return CallingAppRepositoryImplKt.CallingAppRepository((CallingAppDataSource) b4w0.this.v.getValue());
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class j extends Lambda implements gzs<CollectDeviceIdErrorsUseCase> {
        public j() {
            super(0);
        }

        @Override // xsna.gzs
        public final CollectDeviceIdErrorsUseCase invoke() {
            DeviceIdRepository deviceIdRepository = (DeviceIdRepository) b4w0.this.l.getValue();
            CrashReporterRepository crashReporterRepository = (CrashReporterRepository) b4w0.this.i.getValue();
            b4w0 b4w0Var = b4w0.this;
            return new CollectDeviceIdErrorsUseCase(deviceIdRepository, crashReporterRepository, b4w0Var.d, b4w0Var.D);
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class k extends Lambda implements gzs<CrashReporterRepository> {
        public k() {
            super(0);
        }

        @Override // xsna.gzs
        public final CrashReporterRepository invoke() {
            CrashSenderRepositoryFactory crashSenderRepositoryFactory = new CrashSenderRepositoryFactory();
            b4w0 b4w0Var = b4w0.this;
            return crashSenderRepositoryFactory.createCrashSenderRepository(b4w0Var.b, "com.vk.push.authsdk", (IssueKeyBlackListRepository) b4w0Var.g.getValue(), b4w0Var.d);
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class l extends Lambda implements gzs<DeviceIdRepository> {
        public l() {
            super(0);
        }

        @Override // xsna.gzs
        public final DeviceIdRepository invoke() {
            DeviceIdRepositoryProvider deviceIdRepositoryProvider = DeviceIdRepositoryProvider.INSTANCE;
            b4w0 b4w0Var = b4w0.this;
            return deviceIdRepositoryProvider.initIfRequired(b4w0Var.b, b4w0Var.d);
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class m extends Lambda implements gzs<yzm> {
        public m() {
            super(0);
        }

        @Override // xsna.gzs
        public final yzm invoke() {
            return new yzm((vri0) b4w0.this.u.getValue());
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class n extends Lambda implements gzs<EmptyAnalyticsSender> {
        public static final n i = new n(0);

        @Override // xsna.gzs
        public final EmptyAnalyticsSender invoke() {
            return new EmptyAnalyticsSender();
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class o extends Lambda implements gzs<hip> {
        public o() {
            super(0);
        }

        @Override // xsna.gzs
        public final hip invoke() {
            return new hip((vri0) b4w0.this.u.getValue());
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class p extends Lambda implements gzs<FeatureManagerImpl> {
        public p() {
            super(0);
        }

        @Override // xsna.gzs
        public final FeatureManagerImpl invoke() {
            b4w0 b4w0Var = b4w0.this;
            return new FeatureManagerImpl(b4w0Var.b, (HttpClient) b4w0.this.f.getValue(), (CrashReporterRepository) b4w0Var.i.getValue(), (IssueKeyBlackListRepository) b4w0.this.g.getValue(), (DeviceIdRepository) b4w0.this.l.getValue(), b4w0.this.d, null, null, PsExtractor.AUDIO_STREAM, null);
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class q extends Lambda implements gzs<GetCallingAppInfoUseCase> {
        public q() {
            super(0);
        }

        @Override // xsna.gzs
        public final GetCallingAppInfoUseCase invoke() {
            return new GetCallingAppInfoUseCase((CallingAppRepository) b4w0.this.w.getValue());
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class r extends Lambda implements gzs<m55> {
        public r() {
            super(0);
        }

        @Override // xsna.gzs
        public final m55 invoke() {
            return new m55(r3y0.c.a(b4w0.this.b).b, (b66) b4w0.this.o.getValue(), (AnalyticsTimingsStore) b4w0.this.m.getValue(), (FeatureManager) b4w0.this.h.getValue(), b4w0.this.d);
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class s extends Lambda implements gzs<HttpClient> {
        public s() {
            super(0);
        }

        @Override // xsna.gzs
        public final HttpClient invoke() {
            BaseHttpHeadersHolder baseHttpHeadersHolder = (BaseHttpHeadersHolder) b4w0.this.j.getValue();
            b4w0 b4w0Var = b4w0.this;
            return new HttpClient(0, 0, baseHttpHeadersHolder, null, null, b4w0Var.b, false, false, (CrashReporterRepository) b4w0Var.i.getValue(), b4w0Var.d, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, null);
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class t extends Lambda implements gzs<BaseHttpHeadersHolder> {
        public t() {
            super(0);
        }

        @Override // xsna.gzs
        public final BaseHttpHeadersHolder invoke() {
            return new BaseHttpHeadersHolder("host_sdk/7.4.0-rc01", b4w0.this.b.getPackageName(), null, 4, null);
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class u extends Lambda implements gzs<IssueKeyBlackListRepository> {
        public u() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.gzs
        public final IssueKeyBlackListRepository invoke() {
            return new IssueKeyBlackListRepository(b4w0.this.b, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class v extends Lambda implements gzs<MetadataRepository> {
        public v() {
            super(0);
        }

        @Override // xsna.gzs
        public final MetadataRepository invoke() {
            return MetadataRepositoryImplKt.MetadataRepository(new ManifestDataSource(b4w0.this.b.getPackageManager(), b4w0.this.b.getPackageName()));
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class w extends Lambda implements gzs<HttpClient> {
        public w() {
            super(0);
        }

        @Override // xsna.gzs
        public final HttpClient invoke() {
            BaseHttpHeadersHolder baseHttpHeadersHolder = new BaseHttpHeadersHolder("host_sdk/7.4.0-rc01", b4w0.this.b.getPackageName(), BaseHttpHeadersHolder.CONTENT_TYPE_URLENCODED);
            b4w0 b4w0Var = b4w0.this;
            return new HttpClient(0, 0, baseHttpHeadersHolder, null, null, b4w0Var.b, false, false, (CrashReporterRepository) b4w0Var.i.getValue(), b4w0Var.d, 27, null);
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class x extends Lambda implements gzs<o1i0> {
        public x() {
            super(0);
        }

        @Override // xsna.gzs
        public final o1i0 invoke() {
            b4w0 b4w0Var = b4w0.this;
            return new o1i0(b4w0Var.b, (m55) b4w0Var.n.getValue(), new Secrets());
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class y extends Lambda implements gzs<SeparateProcessRepository> {
        public y() {
            super(0);
        }

        @Override // xsna.gzs
        public final SeparateProcessRepository invoke() {
            b4w0 b4w0Var = b4w0.this;
            return new SeparateProcessRepository(b4w0Var.b, (MetadataRepository) b4w0Var.B.getValue());
        }
    }

    /* compiled from: VkpnsAuthSdk.kt */
    public static final class z extends Lambda implements gzs<tri0> {
        public z() {
            super(0);
        }

        @Override // xsna.gzs
        public final tri0 invoke() {
            b4w0 b4w0Var = b4w0.this;
            return new tri0(b4w0Var.b, b4w0Var.d);
        }
    }

    public b4w0(y3w0 y3w0Var) {
        this.a = y3w0Var;
        this.b = y3w0Var.a;
        this.c = y3w0Var.b;
        this.d = y3w0Var.c;
        new bpn0(n.i);
        this.o = new bpn0(new g());
        this.p = new bpn0(new d());
        this.q = new bpn0(new e());
        this.r = new bpn0(new f());
        this.s = new bpn0(new z());
        this.t = new bpn0(new x());
        this.u = new bpn0(new a0());
        this.v = new bpn0(new h());
        this.w = new bpn0(new i());
        this.x = new bpn0(new q());
        this.y = new bpn0(new o());
        this.z = new bpn0(new m());
        this.A = new bpn0(new j());
        this.B = new bpn0(new v());
        this.C = new bpn0(new y());
        this.D = zvj.a(bdn.b);
    }
}
