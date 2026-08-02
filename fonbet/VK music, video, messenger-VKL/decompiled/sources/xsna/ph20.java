package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.O6;
import com.ironsource.Z3;
import com.ironsource.mediationsdk.demandOnly.e;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.polls.Poll;
import com.vk.im.engine.lifecycle.di.ImEngineLifecycleComponent;
import com.vk.im.engine.models.EngineInvalidateSource;
import com.vk.im.engine.models.credentials.UserCredentials;
import com.vk.im.log.LogLevel;
import com.vk.story.api.di.StoriesComponent;
import com.vk.toggle.data.BannerScheduleLocation;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.VKApplication;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.i2w;
import xsna.ihl0;

/* compiled from: MessengerInitializerTask.kt */
/* loaded from: classes11.dex */
public final class ph20 implements gzs<s3q0> {
    public final Context b;
    public final rq6 c;
    public final VKApplication.h0 d;
    public final bpn0 e = new bpn0(new fb8(this, 3));
    public pzv f;

    /* compiled from: MessengerInitializerTask.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        public a() {
            new ArrayList();
        }
    }

    /* compiled from: MessengerInitializerTask.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<Float> {
        public b(Object obj) {
            super(0, obj, com.vk.stories.b.class, "getPublishAspectRatio", "getPublishAspectRatio()F", 0);
        }

        @Override // xsna.gzs
        public final Float invoke() {
            ((com.vk.stories.b) this.receiver).getClass();
            return Float.valueOf(0.5625f);
        }
    }

    /* compiled from: MessengerInitializerTask.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<SharedPreferences> {
        @Override // xsna.gzs
        public final SharedPreferences invoke() {
            return Preference.j();
        }
    }

    public ph20(Context context, rq6 rq6Var, VKApplication.h0 h0Var) {
        this.b = context;
        this.c = rq6Var;
        this.d = h0Var;
        new bpn0(new rwe(4));
    }

    public final void a() {
        if (this.f == null) {
            throw new IllegalStateException("Messenger must be initialized by calling invoke()");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x01a1, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0178, code lost:
    
        if (r2 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x08ff, code lost:
    
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        com.vk.metrics.eventtracking.b bVar;
        l26 l26Var;
        l26 l26Var2;
        a1w a1wVar;
        a1w a1wVar2;
        UserCredentials userCredentials;
        bpn0 bpn0Var = new bpn0(new c(0, Preference.a, Preference.class, "getDefault", "getDefault()Landroid/content/SharedPreferences;", 0));
        com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
        cau0 cau0Var = new cau0((h360) this.d.invoke());
        Context context = this.b;
        Context context2 = this.b;
        x8w x8wVar = new x8w(context2);
        int i = 8;
        lu2 lu2Var = new lu2(i);
        qy8 qy8Var = new qy8(bpn0Var, i);
        int i2 = 6;
        eu2 eu2Var = new eu2(i2);
        bb3 bb3Var = new bb3(i2);
        asu0.a.getClass();
        p9w p9wVar = new p9w(context2, asu0.o());
        r63 r63Var = new r63(i2);
        hu2 hu2Var = new hu2(7);
        s63 s63Var = new s63(i);
        sw1 sw1Var = new sw1(13);
        bpn0 bpn0Var2 = new bpn0(new dr6(i2));
        bpn0 bpn0Var3 = new bpn0(new er6(3));
        bpn0 bpn0Var4 = new bpn0(new mb3(9));
        bpn0 bpn0Var5 = new bpn0(new ihg(4));
        bpn0 bpn0Var6 = new bpn0(new s65(6));
        bpn0 bpn0Var7 = new bpn0(new c24(5));
        bpn0 bpn0Var8 = new bpn0(new l67(3));
        bpn0 bpn0Var9 = new bpn0(new jbw(3));
        mb8 mb8Var = new mb8(5);
        int i3 = 4;
        sz2 sz2Var = new sz2(this, i3);
        fat fatVar = new fat(this, i3);
        qew qewVar = new qew();
        h360 h360Var = (h360) this.d.invoke();
        gat gatVar = new gat(this, 5);
        ab3 ab3Var = new ab3(6);
        ImFeatures imFeatures = ImFeatures.NEW_CONTACT_NOTIFICATION;
        imFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(imFeatures);
        aq0 aq0Var = new aq0(10);
        com.vk.metrics.eventtracking.b bVar3 = com.vk.metrics.eventtracking.b.a;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        int i4 = 8;
        Peer.Unknown unknown = Peer.Unknown.e;
        vv8 vv8Var = new vv8(3);
        Integer valueOf = Integer.valueOf(Z3.j);
        bib bibVar = new bib(o25.a());
        fpo a3 = bibVar.a();
        ie70 b2 = com.vk.toggle.d.j0.b();
        if (b2 != null) {
            bVar = bVar3;
            l26Var = (l26) b2.a.get(BannerScheduleLocation.CHAT_LIST);
        } else {
            bVar = bVar3;
        }
        l26Var = b2 != null ? (l26) b2.a.get(BannerScheduleLocation.NOTIFICATIONS) : null;
        bje0 b3 = i2w.b(l26Var);
        if (b3 == null) {
            b3 = bje0.c;
        }
        bje0 bje0Var = b3;
        if (b2 != null) {
            l26Var2 = (l26) b2.a.get(BannerScheduleLocation.CHAT);
        }
        l26Var2 = b2 != null ? (l26) b2.a.get(BannerScheduleLocation.NOTIFICATIONS) : null;
        bje0 b4 = i2w.b(l26Var2);
        if (b4 == null) {
            b4 = bje0.c;
        }
        bje0 bje0Var2 = b4;
        vdw vdwVar = vdw.a;
        int i5 = 3;
        com.vk.metrics.eventtracking.b bVar4 = bVar;
        sbw sbwVar = new sbw(bVar4, o25.a(), cau0Var, new jhg(this, i5), new g3j(this, i5));
        ihl0.a aVar = new ihl0.a(a3, unknown);
        bay bayVar = new bay();
        j2w j2wVar = new j2w();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(h360Var.g().i);
        x3w x3wVar = new x3w(context, a3, unknown, fatVar, mb8Var, new g58(2), new m66(x8wVar, 5), new n66(p9wVar, 4), new t03(i4), lu2Var, qy8Var, eu2Var, bb3Var, sw1Var, vv8Var, ab3Var, bibVar);
        boolean m = BuildInfo.m();
        f53 f53Var = new f53(context, i4);
        sq6 sq6Var = new sq6(7);
        c13 c13Var = new c13(i4);
        r30 r30Var = new r30(h360Var, 5);
        knf knfVar = new knf(i4);
        lnf lnfVar = new lnf(6);
        p03 p03Var = new p03(5);
        q03 q03Var = new q03(7);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long millis2 = timeUnit2.toMillis(12L);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long millis3 = timeUnit3.toMillis(10L);
        long millis4 = timeUnit2.toMillis(2L);
        long millis5 = timeUnit3.toMillis(10L);
        TimeUnit timeUnit4 = TimeUnit.MILLISECONDS;
        long millis6 = timeUnit4.toMillis(750L);
        TimeUnit timeUnit5 = TimeUnit.DAYS;
        int i6 = 1;
        this.f = new pzv(x3wVar, f53Var, sq6Var, fatVar, x8wVar, p9wVar, bVar4, cau0Var, sz2Var, qewVar, aVar, bayVar, millis2, millis3, millis4, millis5, millis6, timeUnit5.toMillis(1L), timeUnit5.toMillis(7L), timeUnit2.toMillis(24L), Collections.singletonList(333L), timeUnit3.toMillis(5L), timeUnit2.toMillis(2L), timeUnit2.toMillis(1L), timeUnit5.toMillis(1L), timeUnit3.toMillis(15L), timeUnit5.toMillis(1L), timeUnit.toMillis(30L), timeUnit3.toMillis(15L), timeUnit.toMillis(10L), timeUnit3.toMillis(2L), new rq6(5), timeUnit5.toMillis(1L), timeUnit4.toMillis(160L), timeUnit5.toMillis(1L), s63Var, r63Var, hu2Var, new sq6(6), false, sbwVar, LogLevel.VERBOSE, new c13(7), new jnf(3), e43.l("jpg", "png", "gif", "heic", "heif", "webp"), rl3.I(new String[]{"a6p", CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, "acr", "action", "air", MBridgeConstans.DYNAMIC_VIEW_WX_APP, "awk", "bak", O6.e, "cgi", "cmd", "com", "csh", "dek", "dld", "ds", "ebm", "esh", "exe", "ezs", "fky", "frs", "fxp", "gadget", "hms", "hta", "icd", "inx", "ipf", "isu", "jar", "js", "jse", "jsx", "kix", "mcr", "mem", "mp3", "mpx", UcumUtils.UCUM_MILLISECODS, "msi", "mst", "obs", "paf", "pex", "pif", "prc", "prg", "pvd", "pwc", "pyo", "qpx", "rbx", "reg", "rgs", "rox", "rpj", "scar", O6.A0, "script", "sct", "shb", "shs", "spr", "tlb", "tms", "u3p", "udf", "vb", "vbe", "vbs", "vbscript", "wcm", "wpk", "ws", "wsf", "xqt", "hprof", !BuildInfo.t() ? "apk" : null}), c13Var, j2wVar, bpn0Var2, bpn0Var3, bpn0Var4, bpn0Var5, bpn0Var6, bpn0Var7, bpn0Var8, bpn0Var9, r30Var, millis, timeUnit5.toMillis(1L), knfVar, lnfVar, bje0Var2, bje0Var, e43.l(1, 3, 10, 30), e43.l(1, 3, 10, 30, 60, 90), a2, m, p03Var, q03Var, pn00.k(new Pair(1, 21), new Pair(Integer.valueOf(IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED), 51117), new Pair(464, 16263), new Pair(367, 12467), new Pair(138, 4275), new Pair(1073, 53098), new Pair(198, 6329), new Pair(valueOf, 50456), new Pair(363, 12296), new Pair(valueOf, 50459), new Pair(515, 18164), new Pair(Integer.valueOf(CommonGatewayClient.CODE_599), 21560), new Pair(388, 13312), new Pair(4, 134), new Pair(584, 20952), new Pair(Integer.valueOf(e.a.i), 56896), new Pair(570, 20465), new Pair(346, 11607), new Pair(1078, 53320), new Pair(1086, 53647)), pn00.k(new Pair(76116, 2), new Pair(92727, 1981), new Pair(92729, 1981), new Pair(79194, 1679), new Pair(79179, 1679), new Pair(58273, 1194), new Pair(77711, 1646), new Pair(75293, 1593), new Pair(76475, 1618)), timeUnit5.toMillis(1L), gatVar, aq0Var);
        VKApplication.a aVar2 = VKApplication.c;
        p870 w = ((StoriesComponent) m7m.e().a(fpf0.a(StoriesComponent.class))).w();
        ce60.b.getClass();
        p870 f = p870.f();
        pzv pzvVar = this.f;
        io.reactivex.rxjava3.internal.operators.observable.j1 b0 = wjs0.b.b0(fyr0.class);
        final qh20 qh20Var = qh20.b;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = b0.U(new io.reactivex.rxjava3.functions.l() { // from class: xsna.mh20
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj) {
                return (VideoFile) izs.this.invoke(obj);
            }
        });
        io.reactivex.rxjava3.internal.operators.observable.j1 b02 = ysg0.b.a.b0(zrb0.class);
        final rh20 rh20Var = rh20.b;
        io.reactivex.rxjava3.internal.operators.observable.j1 U2 = b02.U(new io.reactivex.rxjava3.functions.l() { // from class: xsna.nh20
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj) {
                return (Poll) izs.this.invoke(obj);
            }
        });
        io.reactivex.rxjava3.internal.operators.observable.g0 g0Var = io.reactivex.rxjava3.internal.operators.observable.g0.b;
        int i7 = 0;
        if (i2w.b) {
            a1wVar2 = i2w.c;
            if (a1wVar2 == null) {
                a1wVar = null;
                a1wVar2 = a1wVar;
                userCredentials = a1wVar;
            } else {
                userCredentials = 0;
            }
        } else {
            i2w.d = pzvVar;
            i2w.c = new a1w(pzvVar, "ImEngine");
            pzv pzvVar2 = i2w.d;
            if (pzvVar2 == null) {
                pzvVar2 = null;
            }
            pzvVar2.getClass();
            i2w.e = ply.a();
            c63 c63Var = c63.a;
            c63.a(new l2w());
            a1w a1wVar3 = i2w.c;
            if (a1wVar3 == null) {
                a1wVar3 = null;
            }
            new io.reactivex.rxjava3.internal.operators.mixed.l(new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar3.l.a().b0(p680.class), new dej(new v1w(0))), new d2w(new fml(i6), i7)).subscribe();
            a1w a1wVar4 = i2w.c;
            if (a1wVar4 == null) {
                a1wVar4 = null;
            }
            io.reactivex.rxjava3.internal.operators.observable.x1 k0 = a1wVar4.l.a().b0(u180.class).U(new x1w(new p58(1), i7)).k0();
            final y1w y1wVar = new y1w();
            io.reactivex.rxjava3.internal.operators.observable.o2 t0 = new io.reactivex.rxjava3.internal.operators.observable.i0(k0, new io.reactivex.rxjava3.functions.m() { // from class: xsna.z1w
                @Override // io.reactivex.rxjava3.functions.m
                public final boolean test(Object obj) {
                    return ((Boolean) y1w.this.invoke(obj)).booleanValue();
                }
            }).t0(1L);
            final a2w a2wVar = new a2w();
            t0.subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.b2w
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    a2w.this.invoke(obj);
                }
            });
            new io.reactivex.rxjava3.internal.operators.observable.i0(k0, new ca4(new ba4(1), 1)).t0(1L).subscribe(new c2w(new da4(4), 0));
            new io.reactivex.rxjava3.internal.operators.observable.i0(k0, new bej(new aej(1), 1)).t0(1L).subscribe(new w1w(new ipo(2), 0));
            c63.a(new k2w());
            U2.subscribe(new f2w(new e2w(0), 0));
            U.subscribe(new kos(new g2w(0), 1));
            final pej pejVar = new pej(i6);
            int[] iArr = {100, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE};
            for (int i8 = 0; i8 < 2; i8++) {
                w.b(iArr[i8], new bd70() { // from class: xsna.q870
                    @Override // xsna.bd70
                    public final void x0(int i9, int i10, Object obj) {
                        owi.a(r870.b, 100L, new n0(21, obj, izs.this));
                    }
                });
            }
            s3q0 s3q0Var = s3q0.a;
            final zbj zbjVar = new zbj(1);
            int[] iArr2 = {Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 108};
            for (int i9 = 0; i9 < 2; i9++) {
                w.b(iArr2[i9], new bd70() { // from class: xsna.q870
                    @Override // xsna.bd70
                    public final void x0(int i92, int i10, Object obj) {
                        owi.a(r870.b, 100L, new n0(21, obj, izs.this));
                    }
                });
            }
            s3q0 s3q0Var2 = s3q0.a;
            final u1w u1wVar = new u1w();
            bd70 bd70Var = new bd70() { // from class: xsna.oh20
                @Override // xsna.bd70
                public final void x0(int i10, int i11, Object obj) {
                    Photo photo = (Photo) obj;
                    if (i10 == 130 || i10 == 131) {
                        yzs.this.invoke(Integer.valueOf(photo.c), photo.e, Boolean.valueOf(i10 == 130));
                    }
                }
            };
            f.b(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, bd70Var);
            f.b(130, bd70Var);
            a1wVar = null;
            userCredentials = 0;
            itg0.i(7, new io.reactivex.rxjava3.internal.operators.mixed.o(new io.reactivex.rxjava3.internal.operators.observable.y(g0Var.a0(asu0.a.c()), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new wjr(new xv8(3), i6)), null, null, null);
            pzv pzvVar3 = i2w.d;
            if (pzvVar3 == null) {
                pzvVar3 = null;
            }
            pzvVar3.l().a().a0(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new i2w.a());
            i2w.b = true;
            a1wVar2 = i2w.c;
        }
        q1w.a = a1wVar2;
        q1w.b = new a1w(pzv.a(this.f, null, null, 0L, null, new c24(i7), -1, -8388609, Integer.MAX_VALUE), "AdminImEngine");
        g2v.a = new bpn0(new bg6(this, 5));
        m6r0 f2 = q6r0.f();
        if (!f2.A()) {
            f2 = userCredentials;
        }
        if (f2 != null) {
            UserId y = f2.y();
            String k = f2.k();
            String str = k == null ? "" : k;
            String v = f2.v();
            userCredentials = new UserCredentials(f2.l(), f2.x(), y, str, v == null ? "" : v);
        }
        VKApplication.a aVar3 = VKApplication.c;
        ((ImEngineLifecycleComponent) m7m.e().a(fpf0.a(ImEngineLifecycleComponent.class))).N().a(userCredentials, EngineInvalidateSource.START);
        if (userCredentials != 0) {
            c4g0.x(this.b);
        }
    }

    @Override // xsna.gzs
    public final /* bridge */ /* synthetic */ s3q0 invoke() {
        c();
        return s3q0.a;
    }
}
