package xsna;

import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.appmetrica.analytics.impl.L2;
import java.io.IOException;
import ru.ok.android.sdk.OkListenerKt;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import ru.ok.tracer.SystemState;
import xsna.j5k;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* loaded from: classes.dex */
public final class ye5 implements gzi {
    public static final ye5 a = new ye5();

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class a implements mp70<j5k.a.AbstractC3094a> {
        public static final a a = new a();
        public static final f7r b = f7r.b("arch");
        public static final f7r c = f7r.b("libraryName");
        public static final f7r d = f7r.b("buildId");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.a.AbstractC3094a abstractC3094a = (j5k.a.AbstractC3094a) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, abstractC3094a.a());
            np70Var2.add(c, abstractC3094a.c());
            np70Var2.add(d, abstractC3094a.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class b implements mp70<j5k.a> {
        public static final b a = new b();
        public static final f7r b = f7r.b("pid");
        public static final f7r c = f7r.b(SystemState.PROPERTY_KEY_PROCESS_NAME);
        public static final f7r d = f7r.b("reasonCode");
        public static final f7r e = f7r.b("importance");
        public static final f7r f = f7r.b("pss");
        public static final f7r g = f7r.b("rss");
        public static final f7r h = f7r.b("timestamp");
        public static final f7r i = f7r.b("traceFile");
        public static final f7r j = f7r.b("buildIdMappingForArch");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.a aVar = (j5k.a) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, aVar.c());
            np70Var2.add(c, aVar.d());
            np70Var2.add(d, aVar.f());
            np70Var2.add(e, aVar.b());
            np70Var2.add(f, aVar.e());
            np70Var2.add(g, aVar.g());
            np70Var2.add(h, aVar.h());
            np70Var2.add(i, aVar.i());
            np70Var2.add(j, aVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class c implements mp70<j5k.c> {
        public static final c a = new c();
        public static final f7r b = f7r.b("key");
        public static final f7r c = f7r.b("value");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.c cVar = (j5k.c) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, cVar.a());
            np70Var2.add(c, cVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class d implements mp70<j5k> {
        public static final d a = new d();
        public static final f7r b = f7r.b("sdkVersion");
        public static final f7r c = f7r.b("gmpAppId");
        public static final f7r d = f7r.b("platform");
        public static final f7r e = f7r.b("installationUuid");
        public static final f7r f = f7r.b("firebaseInstallationId");
        public static final f7r g = f7r.b("firebaseAuthenticationToken");
        public static final f7r h = f7r.b("appQualitySessionId");
        public static final f7r i = f7r.b("buildVersion");
        public static final f7r j = f7r.b("displayVersion");
        public static final f7r k = f7r.b("session");
        public static final f7r l = f7r.b("ndkPayload");
        public static final f7r m = f7r.b("appExitInfo");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k j5kVar = (j5k) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, j5kVar.k());
            np70Var2.add(c, j5kVar.g());
            np70Var2.add(d, j5kVar.j());
            np70Var2.add(e, j5kVar.h());
            np70Var2.add(f, j5kVar.f());
            np70Var2.add(g, j5kVar.e());
            np70Var2.add(h, j5kVar.b());
            np70Var2.add(i, j5kVar.c());
            np70Var2.add(j, j5kVar.d());
            np70Var2.add(k, j5kVar.l());
            np70Var2.add(l, j5kVar.i());
            np70Var2.add(m, j5kVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class e implements mp70<j5k.d> {
        public static final e a = new e();
        public static final f7r b = f7r.b("files");
        public static final f7r c = f7r.b("orgId");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.d dVar = (j5k.d) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, dVar.a());
            np70Var2.add(c, dVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class f implements mp70<j5k.d.b> {
        public static final f a = new f();
        public static final f7r b = f7r.b("filename");
        public static final f7r c = f7r.b("contents");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.d.b bVar = (j5k.d.b) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, bVar.b());
            np70Var2.add(c, bVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class g implements mp70<j5k.e.a> {
        public static final g a = new g();
        public static final f7r b = f7r.b("identifier");
        public static final f7r c = f7r.b("version");
        public static final f7r d = f7r.b("displayVersion");
        public static final f7r e = f7r.b("organization");
        public static final f7r f = f7r.b("installationUuid");
        public static final f7r g = f7r.b("developmentPlatform");
        public static final f7r h = f7r.b("developmentPlatformVersion");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.e.a aVar = (j5k.e.a) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, aVar.d());
            np70Var2.add(c, aVar.g());
            np70Var2.add(d, aVar.c());
            np70Var2.add(e, aVar.f());
            np70Var2.add(f, aVar.e());
            np70Var2.add(g, aVar.a());
            np70Var2.add(h, aVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class h implements mp70<j5k.e.a.AbstractC3096a> {
        public static final h a = new h();
        public static final f7r b = f7r.b("clsId");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            ((j5k.e.a.AbstractC3096a) obj).getClass();
            np70Var.add(b, (Object) null);
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class i implements mp70<j5k.e.c> {
        public static final i a = new i();
        public static final f7r b = f7r.b("arch");
        public static final f7r c = f7r.b("model");
        public static final f7r d = f7r.b("cores");
        public static final f7r e = f7r.b("ram");
        public static final f7r f = f7r.b("diskSpace");
        public static final f7r g = f7r.b("simulator");
        public static final f7r h = f7r.b("state");
        public static final f7r i = f7r.b("manufacturer");
        public static final f7r j = f7r.b("modelClass");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.e.c cVar = (j5k.e.c) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, cVar.a());
            np70Var2.add(c, cVar.e());
            np70Var2.add(d, cVar.b());
            np70Var2.add(e, cVar.g());
            np70Var2.add(f, cVar.c());
            np70Var2.add(g, cVar.i());
            np70Var2.add(h, cVar.h());
            np70Var2.add(i, cVar.d());
            np70Var2.add(j, cVar.f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class j implements mp70<j5k.e> {
        public static final j a = new j();
        public static final f7r b = f7r.b("generator");
        public static final f7r c = f7r.b("identifier");
        public static final f7r d = f7r.b("appQualitySessionId");
        public static final f7r e = f7r.b("startedAt");
        public static final f7r f = f7r.b("endedAt");
        public static final f7r g = f7r.b("crashed");
        public static final f7r h = f7r.b(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        public static final f7r i = f7r.b("user");
        public static final f7r j = f7r.b(O6.F);
        public static final f7r k = f7r.b("device");
        public static final f7r l = f7r.b("events");
        public static final f7r m = f7r.b("generatorType");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.e eVar = (j5k.e) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, eVar.f());
            np70Var2.add(c, eVar.h().getBytes(j5k.a));
            np70Var2.add(d, eVar.b());
            np70Var2.add(e, eVar.j());
            np70Var2.add(f, eVar.d());
            np70Var2.add(g, eVar.l());
            np70Var2.add(h, eVar.a());
            np70Var2.add(i, eVar.k());
            np70Var2.add(j, eVar.i());
            np70Var2.add(k, eVar.c());
            np70Var2.add(l, eVar.e());
            np70Var2.add(m, eVar.g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class k implements mp70<j5k.e.d.a> {
        public static final k a = new k();
        public static final f7r b = f7r.b("execution");
        public static final f7r c = f7r.b("customAttributes");
        public static final f7r d = f7r.b("internalKeys");
        public static final f7r e = f7r.b(L2.g);
        public static final f7r f = f7r.b("currentProcessDetails");
        public static final f7r g = f7r.b("appProcessDetails");
        public static final f7r h = f7r.b("uiOrientation");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.e.d.a aVar = (j5k.e.d.a) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, aVar.e());
            np70Var2.add(c, aVar.d());
            np70Var2.add(d, aVar.f());
            np70Var2.add(e, aVar.b());
            np70Var2.add(f, aVar.c());
            np70Var2.add(g, aVar.a());
            np70Var2.add(h, aVar.g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class l implements mp70<j5k.e.d.a.b.AbstractC3098a> {
        public static final l a = new l();
        public static final f7r b = f7r.b("baseAddress");
        public static final f7r c = f7r.b("size");
        public static final f7r d = f7r.b("name");
        public static final f7r e = f7r.b("uuid");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.e.d.a.b.AbstractC3098a abstractC3098a = (j5k.e.d.a.b.AbstractC3098a) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, abstractC3098a.a());
            np70Var2.add(c, abstractC3098a.c());
            np70Var2.add(d, abstractC3098a.b());
            String d2 = abstractC3098a.d();
            np70Var2.add(e, d2 != null ? d2.getBytes(j5k.a) : null);
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class m implements mp70<j5k.e.d.a.b> {
        public static final m a = new m();
        public static final f7r b = f7r.b("threads");
        public static final f7r c = f7r.b(OkListenerKt.KEY_EXCEPTION);
        public static final f7r d = f7r.b("appExitInfo");
        public static final f7r e = f7r.b("signal");
        public static final f7r f = f7r.b("binaries");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.e.d.a.b bVar = (j5k.e.d.a.b) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, bVar.e());
            np70Var2.add(c, bVar.c());
            np70Var2.add(d, bVar.a());
            np70Var2.add(e, bVar.d());
            np70Var2.add(f, bVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class n implements mp70<j5k.e.d.a.b.AbstractC3099b> {
        public static final n a = new n();
        public static final f7r b = f7r.b("type");
        public static final f7r c = f7r.b("reason");
        public static final f7r d = f7r.b(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS);
        public static final f7r e = f7r.b("causedBy");
        public static final f7r f = f7r.b("overflowCount");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.e.d.a.b.AbstractC3099b abstractC3099b = (j5k.e.d.a.b.AbstractC3099b) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, abstractC3099b.e());
            np70Var2.add(c, abstractC3099b.d());
            np70Var2.add(d, abstractC3099b.b());
            np70Var2.add(e, abstractC3099b.a());
            np70Var2.add(f, abstractC3099b.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class o implements mp70<j5k.e.d.a.b.c> {
        public static final o a = new o();
        public static final f7r b = f7r.b("name");
        public static final f7r c = f7r.b("code");
        public static final f7r d = f7r.b(RTCStatsConstants.KEY_ADDRESS);

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.e.d.a.b.c cVar = (j5k.e.d.a.b.c) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, cVar.c());
            np70Var2.add(c, cVar.b());
            np70Var2.add(d, cVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class p implements mp70<j5k.e.d.a.b.AbstractC3100d> {
        public static final p a = new p();
        public static final f7r b = f7r.b("name");
        public static final f7r c = f7r.b("importance");
        public static final f7r d = f7r.b(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS);

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.e.d.a.b.AbstractC3100d abstractC3100d = (j5k.e.d.a.b.AbstractC3100d) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, abstractC3100d.c());
            np70Var2.add(c, abstractC3100d.b());
            np70Var2.add(d, abstractC3100d.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class q implements mp70<j5k.e.d.a.b.AbstractC3100d.AbstractC3101a> {
        public static final q a = new q();
        public static final f7r b = f7r.b("pc");
        public static final f7r c = f7r.b("symbol");
        public static final f7r d = f7r.b(X3.i.b);
        public static final f7r e = f7r.b(SignalingProtocol.KEY_OFFSET);
        public static final f7r f = f7r.b("importance");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.e.d.a.b.AbstractC3100d.AbstractC3101a abstractC3101a = (j5k.e.d.a.b.AbstractC3100d.AbstractC3101a) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, abstractC3101a.d());
            np70Var2.add(c, abstractC3101a.e());
            np70Var2.add(d, abstractC3101a.a());
            np70Var2.add(e, abstractC3101a.c());
            np70Var2.add(f, abstractC3101a.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class r implements mp70<j5k.e.d.a.c> {
        public static final r a = new r();
        public static final f7r b = f7r.b(SystemState.PROPERTY_KEY_PROCESS_NAME);
        public static final f7r c = f7r.b("pid");
        public static final f7r d = f7r.b("importance");
        public static final f7r e = f7r.b("defaultProcess");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.e.d.a.c cVar = (j5k.e.d.a.c) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, cVar.c());
            np70Var2.add(c, cVar.b());
            np70Var2.add(d, cVar.a());
            np70Var2.add(e, cVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class s implements mp70<j5k.e.d.c> {
        public static final s a = new s();
        public static final f7r b = f7r.b(X3.j.Y);
        public static final f7r c = f7r.b("batteryVelocity");
        public static final f7r d = f7r.b("proximityOn");
        public static final f7r e = f7r.b(X3.i.n);
        public static final f7r f = f7r.b("ramUsed");
        public static final f7r g = f7r.b("diskUsed");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.e.d.c cVar = (j5k.e.d.c) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, cVar.a());
            np70Var2.add(c, cVar.b());
            np70Var2.add(d, cVar.f());
            np70Var2.add(e, cVar.d());
            np70Var2.add(f, cVar.e());
            np70Var2.add(g, cVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class t implements mp70<j5k.e.d> {
        public static final t a = new t();
        public static final f7r b = f7r.b("timestamp");
        public static final f7r c = f7r.b("type");
        public static final f7r d = f7r.b(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        public static final f7r e = f7r.b("device");
        public static final f7r f = f7r.b("log");
        public static final f7r g = f7r.b("rollouts");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.e.d dVar = (j5k.e.d) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, dVar.e());
            np70Var2.add(c, dVar.f());
            np70Var2.add(d, dVar.a());
            np70Var2.add(e, dVar.b());
            np70Var2.add(f, dVar.c());
            np70Var2.add(g, dVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class u implements mp70<j5k.e.d.AbstractC3104d> {
        public static final u a = new u();
        public static final f7r b = f7r.b(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            np70Var.add(b, ((j5k.e.d.AbstractC3104d) obj).a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class v implements mp70<j5k.e.d.AbstractC3105e> {
        public static final v a = new v();
        public static final f7r b = f7r.b("rolloutVariant");
        public static final f7r c = f7r.b("parameterKey");
        public static final f7r d = f7r.b("parameterValue");
        public static final f7r e = f7r.b("templateVersion");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.e.d.AbstractC3105e abstractC3105e = (j5k.e.d.AbstractC3105e) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, abstractC3105e.c());
            np70Var2.add(c, abstractC3105e.a());
            np70Var2.add(d, abstractC3105e.b());
            np70Var2.add(e, abstractC3105e.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class w implements mp70<j5k.e.d.AbstractC3105e.b> {
        public static final w a = new w();
        public static final f7r b = f7r.b("rolloutId");
        public static final f7r c = f7r.b("variantId");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.e.d.AbstractC3105e.b bVar = (j5k.e.d.AbstractC3105e.b) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, bVar.a());
            np70Var2.add(c, bVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class x implements mp70<j5k.e.d.f> {
        public static final x a = new x();
        public static final f7r b = f7r.b("assignments");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            np70Var.add(b, ((j5k.e.d.f) obj).a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class y implements mp70<j5k.e.AbstractC3106e> {
        public static final y a = new y();
        public static final f7r b = f7r.b("platform");
        public static final f7r c = f7r.b("version");
        public static final f7r d = f7r.b("buildVersion");
        public static final f7r e = f7r.b("jailbroken");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            j5k.e.AbstractC3106e abstractC3106e = (j5k.e.AbstractC3106e) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, abstractC3106e.b());
            np70Var2.add(c, abstractC3106e.c());
            np70Var2.add(d, abstractC3106e.a());
            np70Var2.add(e, abstractC3106e.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class z implements mp70<j5k.e.f> {
        public static final z a = new z();
        public static final f7r b = f7r.b("identifier");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            np70Var.add(b, ((j5k.e.f) obj).a());
        }
    }

    @Override // xsna.gzi
    public final void configure(cjp<?> cjpVar) {
        d dVar = d.a;
        cjpVar.registerEncoder(j5k.class, dVar);
        cjpVar.registerEncoder(uk5.class, dVar);
        j jVar = j.a;
        cjpVar.registerEncoder(j5k.e.class, jVar);
        cjpVar.registerEncoder(bl5.class, jVar);
        g gVar = g.a;
        cjpVar.registerEncoder(j5k.e.a.class, gVar);
        cjpVar.registerEncoder(cl5.class, gVar);
        h hVar = h.a;
        cjpVar.registerEncoder(j5k.e.a.AbstractC3096a.class, hVar);
        cjpVar.registerEncoder(dl5.class, hVar);
        z zVar = z.a;
        cjpVar.registerEncoder(j5k.e.f.class, zVar);
        cjpVar.registerEncoder(ul5.class, zVar);
        y yVar = y.a;
        cjpVar.registerEncoder(j5k.e.AbstractC3106e.class, yVar);
        cjpVar.registerEncoder(tl5.class, yVar);
        i iVar = i.a;
        cjpVar.registerEncoder(j5k.e.c.class, iVar);
        cjpVar.registerEncoder(el5.class, iVar);
        t tVar = t.a;
        cjpVar.registerEncoder(j5k.e.d.class, tVar);
        cjpVar.registerEncoder(fl5.class, tVar);
        k kVar = k.a;
        cjpVar.registerEncoder(j5k.e.d.a.class, kVar);
        cjpVar.registerEncoder(gl5.class, kVar);
        m mVar = m.a;
        cjpVar.registerEncoder(j5k.e.d.a.b.class, mVar);
        cjpVar.registerEncoder(hl5.class, mVar);
        p pVar = p.a;
        cjpVar.registerEncoder(j5k.e.d.a.b.AbstractC3100d.class, pVar);
        cjpVar.registerEncoder(ll5.class, pVar);
        q qVar = q.a;
        cjpVar.registerEncoder(j5k.e.d.a.b.AbstractC3100d.AbstractC3101a.class, qVar);
        cjpVar.registerEncoder(ml5.class, qVar);
        n nVar = n.a;
        cjpVar.registerEncoder(j5k.e.d.a.b.AbstractC3099b.class, nVar);
        cjpVar.registerEncoder(jl5.class, nVar);
        b bVar = b.a;
        cjpVar.registerEncoder(j5k.a.class, bVar);
        cjpVar.registerEncoder(wk5.class, bVar);
        a aVar = a.a;
        cjpVar.registerEncoder(j5k.a.AbstractC3094a.class, aVar);
        cjpVar.registerEncoder(xk5.class, aVar);
        o oVar = o.a;
        cjpVar.registerEncoder(j5k.e.d.a.b.c.class, oVar);
        cjpVar.registerEncoder(kl5.class, oVar);
        l lVar = l.a;
        cjpVar.registerEncoder(j5k.e.d.a.b.AbstractC3098a.class, lVar);
        cjpVar.registerEncoder(il5.class, lVar);
        c cVar = c.a;
        cjpVar.registerEncoder(j5k.c.class, cVar);
        cjpVar.registerEncoder(yk5.class, cVar);
        r rVar = r.a;
        cjpVar.registerEncoder(j5k.e.d.a.c.class, rVar);
        cjpVar.registerEncoder(nl5.class, rVar);
        s sVar = s.a;
        cjpVar.registerEncoder(j5k.e.d.c.class, sVar);
        cjpVar.registerEncoder(ol5.class, sVar);
        u uVar = u.a;
        cjpVar.registerEncoder(j5k.e.d.AbstractC3104d.class, uVar);
        cjpVar.registerEncoder(pl5.class, uVar);
        x xVar = x.a;
        cjpVar.registerEncoder(j5k.e.d.f.class, xVar);
        cjpVar.registerEncoder(sl5.class, xVar);
        v vVar = v.a;
        cjpVar.registerEncoder(j5k.e.d.AbstractC3105e.class, vVar);
        cjpVar.registerEncoder(ql5.class, vVar);
        w wVar = w.a;
        cjpVar.registerEncoder(j5k.e.d.AbstractC3105e.b.class, wVar);
        cjpVar.registerEncoder(rl5.class, wVar);
        e eVar = e.a;
        cjpVar.registerEncoder(j5k.d.class, eVar);
        cjpVar.registerEncoder(zk5.class, eVar);
        f fVar = f.a;
        cjpVar.registerEncoder(j5k.d.b.class, fVar);
        cjpVar.registerEncoder(al5.class, fVar);
    }
}
