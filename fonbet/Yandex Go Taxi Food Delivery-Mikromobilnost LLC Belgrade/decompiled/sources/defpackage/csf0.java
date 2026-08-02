package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import androidx.core.app.s0;
import androidx.lifecycle.g0;
import androidx.recyclerview.widget.RecyclerView;
import coil3.c;
import com.yandex.go.analytics.realtime.experiments.InAppRealtimeAnalyticsExperiment;
import com.yandex.go.coroutines.h;
import com.yandex.go.flex.common.data.bdui.RawResponseBody$State;
import com.yandex.go.rida.header.ui.RidaHeaderView;
import com.yandex.quark.configuration.Language;
import com.yandex.quark.lite.b;
import com.yandex.quark.lite.setup.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import core.flex.ui.OrientationAwareRecyclerView;
import defpackage.hst;
import defpackage.jl40;
import defpackage.jst;
import defpackage.ogp0;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.builders.SetBuilder;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.r0;
import org.json.JSONObject;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.routestats.api.RouteStatsApi;
import ru.yandex.taxi.routestats.prefetch.m;

/* loaded from: classes9.dex */
public final /* synthetic */ class csf0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ csf0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        File filesDir;
        File cacheDir;
        Object value;
        SetBuilder setBuilder;
        Result.Failure failure;
        Object obj;
        int L;
        Pair pair;
        Pair pair2;
        m631 m631Var;
        int i = this.a;
        boolean z = true;
        z = true;
        int i2 = 11;
        int i3 = 2;
        int i4 = 4;
        int i5 = 0;
        Object obj2 = null;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ((dsf0) obj3).a.getSharedPreferences("promotions", 0);
            case 1:
                return new JSONObject(((wtf0) obj3).b).toString();
            case 2:
                ofa0 ofa0Var = (ofa0) obj3;
                ofa0Var.getClass();
                z5g z5gVar = new z5g();
                z5gVar.a = i5m.b(new g3p(new y5g(ofa0Var, i3), new y5g(ofa0Var, i5), i4));
                z5gVar.b = i5m.b(b2g0.a);
                t6i t6iVar = new t6i(z5gVar.a, z5gVar.b, i5m.b(new qsn(new y5g(ofa0Var, z ? 1 : 0), i2)), 28);
                z5gVar.c = t6iVar;
                z5gVar.d = i5m.b(new zof0(t6iVar, 16));
                z5gVar.e = i5m.b(new n4g0(z5gVar.c, 3));
                return z5gVar;
            case 3:
                return ((dne0) ((tig0) obj3).a).a("quark_prefs");
            case 4:
                ru2 ru2Var = (ru2) obj3;
                ru2Var.getClass();
                hst hstVar = jst.e;
                ke00 a = hstVar.b.a();
                if (a != null && a.b(10)) {
                    a.a(10, null, null, "Creating QUARK instance...", hstVar.a);
                }
                Context context = (Context) ru2Var.g;
                String str = ((xgg0) ru2Var.i).a;
                if (str.equals("com.yandex.go")) {
                    str = null;
                }
                String concat = str != null ? "quark_".concat(str) : null;
                if (concat != null) {
                    filesDir = new File(context.getFilesDir(), concat);
                    filesDir.mkdirs();
                } else {
                    filesDir = context.getFilesDir();
                }
                if (concat != null) {
                    cacheDir = new File(context.getCacheDir(), concat);
                    cacheDir.mkdirs();
                } else {
                    cacheDir = context.getCacheDir();
                }
                as90 as90Var = new as90(String.valueOf(filesDir), String.valueOf(cacheDir));
                String a2 = ((kb20) ru2Var.a).a();
                String str2 = a2 == null ? "" : a2;
                if (a2 != null && !evu0.J(a2)) {
                    z = false;
                }
                raj rajVar = new raj(str2, z, false);
                String str3 = ((xgg0) ru2Var.i).b;
                ((rs2) ru2Var.c).getClass();
                cs1 cs1Var = new cs1(((xgg0) ru2Var.i).a, ((kb20) ru2Var.a).b());
                Language language = Language.Russian;
                ((xiy0) ru2Var.h).getClass();
                a aVar = new a((Context) ru2Var.g, new ahg0(as90Var, rajVar, str3, "5.89.0", cs1Var, language, new dsu(((xiy0) ru2Var.h).a)));
                fqt fqtVar = (fqt) ru2Var.d;
                aVar.n = new xc90(fqtVar);
                aVar.o = new xc90(fqtVar);
                g4h g4hVar = new g4h();
                Context context2 = (Context) ru2Var.g;
                u9j0 u9j0Var = new u9j0(context2, new gp50(10, context2));
                e4h e4hVar = g4hVar.b;
                ArrayList o0 = kotlin.collections.a.o0(bnt.b, "tel");
                synchronized (e4hVar) {
                    e4hVar.a = o0;
                    a4h a4hVar = e4hVar.A;
                    ul2 f = a4hVar.f(o0);
                    synchronized (a4hVar) {
                        a4hVar.d = f;
                        a4hVar.e(f);
                    }
                    if (!o0.isEmpty()) {
                        Iterator it = o0.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (cvu0.x((String) it.next(), "musicsdk", false)) {
                                    r0 r0Var = e4hVar.y;
                                    do {
                                        value = r0Var.getValue();
                                        setBuilder = new SetBuilder();
                                        setBuilder.addAll((Set) value);
                                        setBuilder.add(new jlw0("music_sdk_client"));
                                        setBuilder.add(new jlw0("music_sdk_recommendations"));
                                    } while (!r0Var.k(value, setBuilder.b()));
                                }
                            }
                        }
                    }
                }
                e4hVar.b((bnt) ru2Var.e);
                e4hVar.b(u9j0Var);
                aVar.e.add(g4hVar);
                aVar.e.add((doh) ((opt) ru2Var.f).a.getValue());
                aVar.l = new sb20(new zeh(new brt(ru2Var), new brt(ru2Var)));
                syj0 a3 = aVar.a();
                if (a3 instanceof lyj0) {
                    obj2 = (b) ((lyj0) a3).a;
                    hst hstVar2 = jst.e;
                    ke00 a4 = hstVar2.b.a();
                    if (a4 != null && a4.b(10)) {
                        a4.a(10, null, null, "QUARK instance created", hstVar2.a);
                    }
                } else {
                    if (a3 instanceof jyj0) {
                        jhg0 jhg0Var = (jhg0) ((jyj0) a3).a;
                        hst hstVar3 = jst.e;
                        ke00 a5 = hstVar3.b.a();
                        if (a5 != null && a5.b(15)) {
                            a5.a(15, null, null, g8e.o("Can't create QUARK instance: ", jhg0Var.b), hstVar3.a);
                        }
                        throw new ExceptionInInitializerError(jhg0Var.b);
                    }
                    w511.b();
                }
                return obj2;
            case 5:
                bai0 bai0Var = (bai0) obj3;
                if (bai0Var.d.get() != RawResponseBody$State.TERMINAL) {
                    try {
                        obj = bai0Var.b.string();
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    return new Result(obj);
                }
                failure = new Result.Failure(new IllegalStateException("response body is consumed"));
                obj = failure;
                return new Result(obj);
            case 6:
                return (InAppRealtimeAnalyticsExperiment) ((com.yandex.go.analytics.realtime.a) obj3).a.c();
            case 7:
                InAppRealtimeAnalyticsExperiment.Configuration configuration = ((InAppRealtimeAnalyticsExperiment) ((hei0) obj3).a.c()).c;
                if (configuration == null) {
                    return null;
                }
                float f2 = configuration.e;
                o430 o430Var = e3n.b;
                return new fei0(f2, kp50.U(configuration.f, DurationUnit.MILLISECONDS));
            case 8:
                return new com.yandex.go.image.internal.coil.cache.a((h) obj3);
            case 9:
                return (sci0) ((c) obj3).a.e.getValue();
            case 10:
                hpj0 hpj0Var = (hpj0) obj3;
                gpj0 gpj0Var = hpj0.Companion;
                return new cwi0(hpj0Var.b, hpj0Var.c, hpj0Var.d);
            case 11:
                auj0 auj0Var = (auj0) obj3;
                ClassLoader classLoader = auj0Var.c;
                r1r r1rVar = auj0Var.w;
                ArrayList<URL> list = Collections.list(classLoader.getResources(""));
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    if (jl40.l(url.getProtocol(), "file")) {
                        String str4 = oq90.b;
                        pair2 = new Pair(r1rVar, sms.e(new File(url.toURI())));
                    } else {
                        pair2 = null;
                    }
                    if (pair2 != null) {
                        arrayList.add(pair2);
                    }
                }
                ArrayList list2 = Collections.list(classLoader.getResources("META-INF/MANIFEST.MF"));
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    String url2 = ((URL) it2.next()).toString();
                    if (cvu0.x(url2, "jar:file:", false) && (L = evu0.L("!", url2, 6)) != -1) {
                        String str5 = oq90.b;
                        pair = new Pair(t1a1.f(sms.e(new File(URI.create(url2.substring(4, L)))), r1rVar, new nqi0(i2)), auj0.y);
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                return kotlin.collections.a.m0(arrayList2, arrayList);
            case 12:
                return new lgx(((v0k0) obj3).g, 2);
            case 13:
                q5k0 q5k0Var = (q5k0) obj3;
                ViewStub viewStub = (ViewStub) q5k0Var.a.requireViewById(g7h0.header_container);
                RidaHeaderView ridaHeaderView = new RidaHeaderView(q5k0Var.a, null, 0, 0, 14, null);
                ru.yandex.taxi.design.utils.c.w(viewStub, ridaHeaderView);
                ridaHeaderView.setZ(viewStub.getZ());
                Object tag = viewStub.getTag(hgh0.content_container_level);
                if (tag != null) {
                    ridaHeaderView.setTag(hgh0.content_container_level, tag);
                }
                ru.yandex.taxi.design.utils.c.D(ridaHeaderView.getLayoutParams().width, tje.r(jug0.rida_header_height, ridaHeaderView.getContext()), ridaHeaderView);
                return ridaHeaderView;
            case 14:
                return ((Callable) obj3).call();
            case 15:
                return gwk0.h(((yal0) obj3).c);
            case 16:
                on2 on2Var = ((m) obj3).a;
                on2Var.getClass();
                return (RouteStatsApi) on2Var.a(GoApiName.TaxiV3, RouteStatsApi.class);
            case 17:
                return (dw) ((h3y) ((yzg) obj3).b).get();
            case 18:
                g1m0 g1m0Var = (g1m0) obj3;
                m2m0 m2m0Var = g1m0Var.a;
                Object obj4 = g1m0Var.w;
                if (obj4 != null) {
                    return m2m0Var.b(g1m0Var, obj4);
                }
                ny61.g("Value should be initialized");
                return null;
            case 19:
                z1m0 z1m0Var = g0.a;
                ks31 ks31Var = ls31.b;
                return (d2m0) rms.j((rs31) obj3, new y1m0(), 4).a.B(qoi0.a(d2m0.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
            case 20:
                j2m0 j2m0Var = (j2m0) obj3;
                j2m0Var.getLifecycle().a(new yii0(j2m0Var));
                return zy11.a;
            case 21:
                return ((com.yandex.go.benefits_center.benefits.sdk.descriptors.a) obj3).b;
            case 22:
                final com.yandex.go.screenshot_screencast_tracker.impl.trackers.h hVar = (com.yandex.go.screenshot_screencast_tracker.impl.trackers.h) obj3;
                final Handler handler = new Handler(Looper.getMainLooper());
                return new ContentObserver(handler) { // from class: com.yandex.go.screenshot_screencast_tracker.impl.trackers.ScreenshotTracker$contentObserver$2$1
                    @Override // android.database.ContentObserver
                    public void onChange(boolean selfChange, Uri uri) {
                        String path;
                        if (uri == null || (path = uri.getPath()) == null) {
                            return;
                        }
                        ogp0 ogp0Var = (ogp0) h.this.c.get();
                        if (jl40.l(ogp0Var.a(), path)) {
                            jst.e.getClass();
                            return;
                        }
                        ogp0Var.b(path);
                        hst hstVar4 = jst.e;
                        uri.toString();
                        hstVar4.getClass();
                        h.this.h.g(uri);
                    }
                };
            case 23:
                return new ior(rzo.A((View) obj3));
            case 24:
                View view = ((com.yandex.go.blur.view.internal.scrim.b) obj3).d;
                return new ior(view != null ? rzo.A(view) : ior.a(0.0f, 0.0f));
            case 25:
                return (AppAnalyticsReporter) ((com.ybsdk.feature.passport.impl.a) obj3).b.getValue();
            case 26:
                return new s0(((fvp0) obj3).a);
            case 27:
                int0 int0Var = (int0) obj3;
                OrientationAwareRecyclerView orientationAwareRecyclerView = (OrientationAwareRecyclerView) int0Var.a;
                l070 l070Var = (l070) int0Var.b;
                RecyclerView.Adapter adapter = (RecyclerView.Adapter) int0Var.c;
                l70 l70Var = (l70) int0Var.d;
                orientationAwareRecyclerView.removeOnScrollListener(l070Var);
                adapter.unregisterAdapterDataObserver(l70Var);
                return zy11.a;
            case 28:
                e89 e89Var = (e89) obj3;
                ((j89) e89Var.b).h.remove((c6q0) e89Var.c);
                return zy11.a;
            default:
                cnr0 cnr0Var = (cnr0) obj3;
                if (cnr0Var != null && (m631Var = (m631) cnr0Var.b(qoi0.a(m631.class))) != null) {
                    obj2 = m631Var.a;
                }
                return obj2 == null ? kotlin.collections.b.f() : obj2;
        }
    }
}
