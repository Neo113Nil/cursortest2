package xsna;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.hardware.Sensor;
import android.os.Trace;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.utils.log.Logger;
import com.vk.billing.PurchasesManagerComponent;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.device.store.AppStore;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.story.api.di.StoriesComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.data.InAppUpdatesConfig;
import com.vk.toggle.internal.ToggleManager;
import com.vk.toggle.internal.a;
import com.vk.video.focus.impl.di.VideoFocusComponentImpl;
import com.vkontakte.android.VKApplication;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.InitializedLazyImpl;
import xsna.gex0;
import xsna.mgn0;
import xsna.nb3;
import xsna.onl;
import xsna.thn0;
import xsna.vz2;
import xsna.xgx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class vwk implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vwk(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        gex0 gex0Var;
        Class cls;
        final mgn0 mgn0Var;
        bpn0 bpn0Var;
        boolean z;
        switch (this.b) {
            case 0:
                return ((wwk) this.c).b.invoke();
            case 1:
                return ((k1q) this.c).a().compileStatement("SELECT event_name FROM events WHERE event_name=? AND user_id=? AND session_id=?");
            case 2:
                return ((SessionManagementComponent) this.c).J2();
            case 3:
                return ((VkClientMultiAccountComponent) m7m.a(((nx50) this.c).b).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
            case 4:
                Sensor sensor = (Sensor) ((h9e0) this.c).d.getValue();
                return Float.valueOf(sensor != null ? sensor.getMaximumRange() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            case 5:
                bhl0 bhl0Var = (bhl0) this.c;
                Trace.beginSection(ndp0.f("lazy StorageManager.keyValueStorageManager"));
                try {
                    rey reyVar = new rey(bhl0Var.B().b());
                    bhl0Var.z(reyVar);
                    return reyVar;
                } finally {
                    Trace.endSection();
                }
            case 6:
                final VKApplication vKApplication = (VKApplication) this.c;
                VKApplication.a aVar = VKApplication.c;
                nb3 nb3Var = nb3.a;
                vx2.a.getClass();
                final gex0.a aVar2 = new gex0.a(String.valueOf(vx2.b));
                io.reactivex.rxjava3.internal.operators.observable.t tVar = new io.reactivex.rxjava3.internal.operators.observable.t(new r7r0(vKApplication));
                qfx0 qfx0Var = qfx0.d;
                nb3Var.getClass();
                gex0 gex0Var2 = gex0.b;
                final vz2.a aVar3 = (vz2.a) nb3.i.getValue();
                final nb3.f fVar = nb3.f;
                LinkedHashMap linkedHashMap = uyj.a;
                int i = 19;
                if (gex0.c.compareAndSet(false, true)) {
                    asu0.a.getClass();
                    Future submit = asu0.h().submit(new Callable() { // from class: xsna.eex0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            PrivateFiles.a b;
                            boolean B = q6r0.f().B();
                            boolean m = BuildInfo.m();
                            o2l.a.getClass();
                            boolean z2 = B || (!m && o2l.b("__dbg_webview", false));
                            gex0.a aVar4 = gex0.a.this;
                            String str = aVar4.a;
                            String str2 = aVar4.b;
                            String str3 = BuildInfo.d;
                            String valueOf = String.valueOf(BuildInfo.e);
                            Context context = vKApplication;
                            mgn0.c cVar = new mgn0.c(str, str2, str3, valueOf, dy2.h(context, null));
                            mgn0.f fVar2 = new mgn0.f(z2, aVar4.c, aVar4.d, aVar4.e, new d13("WebAppCore"), aVar4.c, TimeUnit.SECONDS.toMillis(15L), new iex0(), 118288);
                            Object obj = fVar;
                            if (obj == null) {
                                obj = new kex0();
                            }
                            jex0 jex0Var = new jex0();
                            Application application = (Application) context;
                            b = e8r.a.b(r8, PrivateSubdir.SUPERAPP.h(), true);
                            File file = b.a;
                            InitializedLazyImpl initializedLazyImpl = new InitializedLazyImpl(obj);
                            InitializedLazyImpl initializedLazyImpl2 = new InitializedLazyImpl(jex0Var);
                            mgn0.b bVar = (mgn0.b) ku2.a.getValue();
                            qhn0 qhn0Var = new qhn0(new bpn0(new aq0(9)));
                            boolean s = BuildInfo.s();
                            ApplicationInfo applicationInfo = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128);
                            if (file == null) {
                                file = new File(application.getCacheDir(), "/superapp/");
                            }
                            vz2 vz2Var = aVar3;
                            vz2 vz2Var2 = vz2Var == null ? null : vz2Var;
                            int i2 = mgn0.a.b;
                            mgn0.d dVar = new mgn0.d();
                            String obj2 = drm0.p0(String.valueOf(applicationInfo.metaData.get("sak_version"))).toString();
                            if (bVar == null) {
                                mgn0.b.a aVar5 = new mgn0.b.a();
                                bVar = new mgn0.b(aVar5.a, aVar5.b, aVar5.c, aVar5.d);
                            }
                            return new mgn0(application, file, cVar, vz2Var2, fVar2, dVar, obj2, qhn0Var, bVar, initializedLazyImpl, initializedLazyImpl2, s);
                        }
                    });
                    gfx0 gfx0Var = gfx0.a;
                    ifx0 ifx0Var = new ifx0(new bpn0(new eu2(i)));
                    vdx0 vdx0Var = vdx0.a;
                    wdx0 wdx0Var = wdx0.b;
                    k0x k0xVar = k0x.d;
                    sgn0 sgn0Var = sgn0.a;
                    udx0 udx0Var = new udx0();
                    new bpn0(new vv8(15));
                    tgn0 tgn0Var = tgn0.a;
                    rex0 rex0Var = rex0.a;
                    efx0 efx0Var = efx0.a;
                    sex0 sex0Var = sex0.a;
                    gnl gnlVar = new gnl(((SessionManagementComponent) ((k7m) m7m.f(gex0Var2)).a(fpf0.a(SessionManagementComponent.class))).J2());
                    tyx tyxVar = tyx.k;
                    wex0 wex0Var = wex0.a;
                    gex0Var = gex0Var2;
                    cls = VkClientMultiAccountComponent.class;
                    cfx0 cfx0Var = new cfx0(((PurchasesManagerComponent) ((k7m) m7m.f(gex0Var)).a(fpf0.a(PurchasesManagerComponent.class))).J7());
                    qex0 qex0Var = qex0.a;
                    mgn0Var = (mgn0) submit.get();
                    mgn0 mgn0Var2 = wgn0.a;
                    wgn0.a = mgn0Var;
                    mgn0 mgn0Var3 = dgn0.a;
                    if (dgn0.a == null) {
                        dgn0.a = mgn0Var;
                    }
                    h9n0 h9n0Var = h9n0.d;
                    h9n0Var.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    wrk.a(new p8m(0), new wuj(), new m8r(new xxg0(mgn0Var.a), 2));
                    s3q0 s3q0Var = s3q0.a;
                    h9n0Var.f("initDITime", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    Application application = mgn0Var.a;
                    jgn0.a = mgn0Var;
                    Preference preference = Preference.a;
                    preference.getClass();
                    Preference.w(application);
                    Preference.h = v790.a.a(application);
                    mgn0.f fVar2 = mgn0Var.e;
                    fVar2.getClass();
                    sjp.a = false;
                    bpn0 bpn0Var2 = jgn0.e;
                    ExecutorService executorService = (ExecutorService) bpn0Var2.getValue();
                    if (uz70.c()) {
                        bpn0Var = bpn0Var2;
                    } else {
                        bpn0Var = bpn0Var2;
                        int i2 = 2;
                        b61 b61Var = new b61(application, executorService, new xv8(i2), new myc0(), new com.vk.movika.sdk.base.ui.v(i2));
                        application = application;
                        uz70.b(preference, b61Var);
                    }
                    hzg0 hzg0Var = pjp.a;
                    pjp.b(application, (ExecutorService) bpn0Var.getValue(), false);
                    qex0.c = fVar2.a;
                    Logger logger = fVar2.f;
                    if (logger != null) {
                        xgx0.a.getClass();
                        xgx0.e().a.add(new xgx0.b(logger));
                    }
                    c63 c63Var = c63.a;
                    Application application2 = (Application) application.getApplicationContext();
                    if (!c63.k) {
                        application2.registerComponentCallbacks(new d63());
                        application2.registerActivityLifecycleCallbacks(new h63());
                        c63.k = true;
                    }
                    z = false;
                    if (wgn0.b.compareAndSet(false, true)) {
                        e370.d = qfx0Var;
                        e370.b = gfx0Var;
                        e370.c = ifx0Var;
                        e370.i = udx0Var;
                        e370.e = vdx0Var;
                        e370.f = wdx0Var;
                        e370.g = sgn0Var;
                        e370.h = k0xVar;
                        e370.x = tgn0Var;
                        e370.j = rex0Var;
                        e370.k = efx0Var;
                        e370.l = sex0Var;
                        e370.m = gnlVar;
                        e370.p = tyxVar;
                        e370.n = wex0Var;
                        e370.o = cfx0Var;
                        e370.y = qex0Var;
                    }
                    if (b0h0.a()) {
                        myc0.h(vhv0.a(), dgn0.f().getDefault(), null, new vgn0(mgn0Var, null), 2);
                    } else {
                        ((mgn0.h) mgn0Var.j.getValue()).a().execute(new Runnable() { // from class: xsna.ugn0
                            @Override // java.lang.Runnable
                            public final void run() {
                                List list;
                                mgn0 mgn0Var4 = mgn0.this;
                                qhn0 qhn0Var = mgn0Var4.h;
                                if (qhn0Var == null || (list = (List) qhn0Var.a.getValue()) == null) {
                                    return;
                                }
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    ((rgn0) it.next()).init(mgn0Var4.a);
                                }
                            }
                        });
                    }
                    io.reactivex.rxjava3.disposables.c cVar = wgn0.c;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    mgn0 mgn0Var4 = wgn0.a;
                    if (mgn0Var4 == null) {
                        mgn0Var4 = null;
                    }
                    wgn0.c = ((com.vk.toggle.anonymous.a) mgn0Var4.i.e.getValue()).k().a.b0(a.c.class).a0(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new c620(new rej(3), 1));
                    if (dgn0.a == null) {
                        dgn0.a = mgn0Var;
                    }
                } else {
                    gex0Var = gex0Var2;
                    cls = VkClientMultiAccountComponent.class;
                    z = false;
                    mgn0Var = null;
                }
                ((CacheComponent) ((k7m) m7m.f(gex0Var)).a(fpf0.a(CacheComponent.class))).yc().c(new lex0());
                zex0 zex0Var = new zex0(((StoriesComponent) ((k7m) m7m.f(gex0Var)).a(fpf0.a(StoriesComponent.class))).w());
                y6l y6lVar = y6l.a;
                afx0 afx0Var = afx0.a;
                dex0 dex0Var = dex0.b;
                gqo gqoVar = gqo.b;
                InAppUpdatesConfig l = com.vk.toggle.d.l();
                ro roVar = new ro();
                boolean z2 = z;
                int i3 = BuildInfo.e;
                String str = l.g;
                if (BuildInfo.n() && !dy2.i(AppStore.RUSTORE.j())) {
                    l5m l5mVar = new l5m(null, null, 3);
                    l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.RUSTORE_LOST_USER.h(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 3, null);
                    l5mVar.q();
                }
                int i4 = 3;
                onl onlVar = new onl(new onl.a(i3, vKApplication, str, new tmu0(1), tVar, (!l.e || BuildInfo.t() || pmr0.b(vKApplication) || BuildInfo.b()) ? z2 : true, new r63(19), new fex0(l, vKApplication, roVar), l.f, roVar, new gex0.b()));
                zdx0 zdx0Var = new zdx0();
                mgn0 mgn0Var5 = wgn0.a;
                e370.q = zex0Var;
                e370.r = afx0Var;
                e370.s = dex0Var;
                e370.w = y6lVar;
                e370.t = gqoVar;
                e370.u = onlVar;
                e370.v = zdx0Var;
                m3q0.a = new yfb();
                m3q0.b = new thn0((thn0.g) thn0.g.getValue(), new thn0.e(new thn0.h(24, 24, 6.0f), new thn0.h(36, 36, 6.0f)), thn0.i, new thn0.h(24, 24, 6.0f), new thn0.h(36, 36, 18.0f), (thn0.d) thn0.h.getValue());
                m3q0.c = new com.vk.superapp.ui.uniwidgets.config.a();
                if (mgn0Var != null) {
                    o25.a().b0(new hex0(mgn0Var));
                }
                bpn0 bpn0Var3 = ku2.a;
                boolean z3 = BuildInfo.s() || BuildInfo.t();
                AtomicBoolean atomicBoolean = ou2.a;
                mgn0.b bVar = (mgn0.b) ku2.a.getValue();
                asu0.a.getClass();
                ExecutorService n = asu0.n();
                com.vk.toggle.anonymous.a aVar4 = (com.vk.toggle.anonymous.a) bVar.e.getValue();
                int i5 = 0;
                if (ou2.a.compareAndSet(false, true)) {
                    boolean z4 = bVar.b;
                    b1v b1vVar = bVar.c;
                    lu2 lu2Var = new lu2(i5);
                    ju2 ju2Var = new ju2(z4, b1vVar, lu2Var);
                    bpn0 bpn0Var4 = new bpn0(new mu2(vKApplication, i5));
                    h9n0 h9n0Var2 = h9n0.d;
                    aVar4.c = new ToggleManager.c(rl3.y0(new String[]{"sak_vk_ru_v2_android", "vkc_tracer_perf_sdk_start", "vkc_sdk_session_management"}), n, new sej(1));
                    int i6 = 0;
                    aVar4.l(new ToggleManager.b(bpn0Var4, z4, new InitializedLazyImpl(-1L), "", new bpn0(new gu2(i6, ju2Var, aVar4)), lu2Var, new bpn0(new hu2(i6)), new InitializedLazyImpl(Boolean.FALSE), new rej(4)));
                    if (z3) {
                        aVar4.y(false);
                    } else {
                        wdx0 wdx0Var2 = e370.f;
                        if (wdx0Var2 == null) {
                            wdx0Var2 = null;
                        }
                        aVar4.y(wdx0Var2.k());
                    }
                } else if (z3) {
                    aVar4.y(false);
                } else {
                    wdx0 wdx0Var3 = e370.f;
                    if (wdx0Var3 == null) {
                        wdx0Var3 = null;
                    }
                    aVar4.y(wdx0Var3.k());
                }
                SakFeatures.b.getClass();
                io.reactivex.rxjava3.internal.operators.observable.y yVar = SakFeatures.c.g;
                h45 h45Var = new h45(new lak0(1));
                yVar.getClass();
                ver0.a(new io.reactivex.rxjava3.internal.operators.observable.i0(yVar, h45Var).K().subscribe(new iaj(new haj(i4), i4)));
                coe0 coe0Var = coe0.b;
                coe0.c = BuildInfo.s();
                h5i0.a = new cnj0();
                gsp.a = new bpn0(new y0f(17));
                if (((VkClientMultiAccountComponent) ((k7m) m7m.f(gex0Var)).a(fpf0.a(cls))).getExperiments().a()) {
                    asu0.h().execute(new i250(1));
                }
                return s3q0.a;
            default:
                nwy nwyVar = ((VideoFocusComponentImpl) this.c).b;
                qcy<Object> qcyVar = VideoFocusComponentImpl.c[1];
                return new vls0((yfs) nwyVar.c());
        }
    }
}
