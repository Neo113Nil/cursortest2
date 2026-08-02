package sg.bigo.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4217a2;
import com.ironsource.Gc;
import com.ironsource.Z3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.ai.i;
import sg.bigo.ads.ai.j;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.ai.l;
import sg.bigo.ads.an.m;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.au.a;
import sg.bigo.ads.bh.d;
import sg.bigo.ads.bh.e;
import sg.bigo.ads.bj.h;
import sg.bigo.ads.c;
import sg.bigo.ads.ch.d;
import sg.bigo.ads.cl.a;
import sg.bigo.ads.cl.e;
import sg.bigo.ads.cl.f;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.cv.c;
import sg.bigo.ads.df.g;

/* loaded from: classes9.dex */
public class BigoAdSdk {
    private static sg.bigo.ads.cl.a d;
    private static volatile a e;
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private static final AtomicBoolean c = new AtomicBoolean(false);
    private static final CopyOnWriteArrayList<InitListener> f = new CopyOnWriteArrayList<>();
    private static final List<Pair<String, String>> g = new ArrayList();

    /* renamed from: sg.bigo.ads.BigoAdSdk$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ConsentOptions.values().length];
            a = iArr;
            try {
                iArr[ConsentOptions.GDPR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ConsentOptions.CCPA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ConsentOptions.LGPD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ConsentOptions.COPPA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface InitListener {
        void onInitialized();
    }

    public static void addExtraHost(@Nullable final String str, @Nullable final String str2) {
        d.a(1, new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.3
            @Override // java.lang.Runnable
            public final void run() {
                if (BigoAdSdk.d == null || !BigoAdSdk.a.get()) {
                    BigoAdSdk.g.add(Pair.create(str, str2));
                } else {
                    BigoAdSdk.d.a(str, str2);
                }
            }
        });
    }

    @Nullable
    public static String getBidderToken() {
        String str;
        String str2;
        if (!a.get()) {
            str = "BigoAdSdk";
            str2 = "Please initialize SDK before get bidder token.";
        } else {
            if (d != null) {
                if (sg.bigo.ads.bg.b.g()) {
                    sg.bigo.ads.bg.b.h();
                    c.set(true);
                }
                if (c.compareAndSet(true, false)) {
                    sg.bigo.ads.cl.a aVar = d;
                    f fVar = aVar.g;
                    if (fVar == null) {
                        fVar = new f();
                        aVar.g = fVar;
                    }
                    if (fVar.a != null) {
                        synchronized (f.class) {
                            fVar.a = null;
                        }
                    }
                }
                sg.bigo.ads.cl.a aVar2 = d;
                if (aVar2.e == null) {
                    return null;
                }
                f fVar2 = aVar2.g;
                if (fVar2 == null) {
                    fVar2 = new f();
                    aVar2.g = fVar2;
                }
                sg.bigo.ads.cl.d dVar = aVar2.e;
                f.b = true;
                j jVar = k.a;
                int w = jVar != null ? jVar.w() : 0;
                return w != 1 ? w != 2 ? fVar2.a(dVar) : (fVar2.a == null || fVar2.c == 0 || System.currentTimeMillis() - fVar2.c > 300000) ? fVar2.b(dVar) : fVar2.a(dVar) : fVar2.b(dVar);
            }
            str = "BigoAdSdk";
            str2 = "Error to get bidder token with empty controller.";
        }
        sg.bigo.ads.bn.a.a(0, str, str2);
        return null;
    }

    @NonNull
    public static String getHashId() {
        return "62b1a26";
    }

    @NonNull
    public static String getSDKVersion() {
        return "50900";
    }

    @NonNull
    public static String getSDKVersionName() {
        return "5.9.0";
    }

    public static void initialize(@NonNull final Context context, @NonNull AdConfig adConfig, @Nullable InitListener initListener) {
        boolean z = a.get();
        boolean z2 = !z;
        if (z) {
            sg.bigo.ads.bn.a.a(2, 5, "", "Bigo Ads SDK init had been invoked.");
        }
        if (sg.bigo.ads.cl.c.a().b.get() == -1) {
            sg.bigo.ads.bn.a.a(2, 5, "", "Bigo Ads SDK wait to initing due to empty config.");
            z2 = true;
        }
        if (!z2) {
            sg.bigo.ads.bn.a.a(2, 5, "", "Avoid initializing Bigo Ads SDK repeatedly.");
            if (initListener != null) {
                initListener.onInitialized();
                return;
            }
            return;
        }
        if (initListener != null) {
            f.add(initListener);
        }
        m.a(context);
        m.a(adConfig);
        Context applicationContext = context.getApplicationContext();
        m.a(applicationContext);
        if (b.getAndSet(true)) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean isDebug = adConfig.isDebug();
        sg.bigo.ads.bx.a.a((int) (System.currentTimeMillis() / 1000));
        sg.bigo.ads.bw.b.a = applicationContext;
        sg.bigo.ads.bg.b.a(applicationContext);
        sg.bigo.ads.ar.a.a().a(applicationContext);
        u.a(isDebug);
        final String extra = adConfig.getExtra(AdConfig.EXTRA_KEY_HOST_RULES);
        final sg.bigo.ads.cl.a aVar = new sg.bigo.ads.cl.a(applicationContext, adConfig);
        d = aVar;
        final Runnable runnable = new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.1
            @Override // java.lang.Runnable
            public final void run() {
                BigoAdSdk.a.set(true);
                BigoAdSdk.b.set(false);
                BigoAdSdk.a(extra);
                BigoAdSdk.c(context);
                Iterator it = BigoAdSdk.f.iterator();
                while (it.hasNext()) {
                    InitListener initListener2 = (InitListener) it.next();
                    if (initListener2 != null) {
                        initListener2.onInitialized();
                    }
                }
                BigoAdSdk.f.clear();
                if (c.a.a().isEmpty()) {
                    return;
                }
                d.a(3, new Runnable() { // from class: sg.bigo.ads.c.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        sg.bigo.ads.da.b.c(a.c());
                        a.b();
                    }
                });
            }
        };
        final Context context2 = aVar.a;
        d.a(1, new Runnable() { // from class: sg.bigo.ads.cl.a.5
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject a2 = sg.bigo.ads.a.b.a(context2);
                sg.bigo.ads.a a3 = BigoAdSdk.a(context2);
                long currentTimeMillis = System.currentTimeMillis();
                a3.c = a2;
                if (a2 != null) {
                    try {
                        a2.put("anti_info_update_millis", currentTimeMillis);
                    } catch (JSONException unused) {
                    }
                }
                sg.bigo.ads.a.a = currentTimeMillis;
                a3.c(context2);
                a.this.l.set(true);
                a.this.a();
            }
        });
        aVar.j = elapsedRealtime;
        aVar.e.a = adConfig;
        aVar.g = new f();
        d.a(new sg.bigo.ads.bh.a() { // from class: sg.bigo.ads.cl.a.6
            @Override // sg.bigo.ads.bh.a
            public final void a(Throwable th) {
                sg.bigo.ads.da.b.a(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 10100, Log.getStackTraceString(th));
            }
        });
        d.a(3, new Runnable() { // from class: sg.bigo.ads.cl.a.7
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.ch.d dVar;
                final a aVar2 = a.this;
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                HashMap hashMap = new HashMap();
                d dVar2 = aVar2.e;
                dVar2.d = dVar2.b.getPackageName();
                dVar2.e = sg.bigo.ads.common.utils.d.a(dVar2.b);
                dVar2.f = sg.bigo.ads.common.utils.d.b(dVar2.b);
                dVar2.g = sg.bigo.ads.bz.b.b(dVar2.b);
                dVar2.h = r.d(Build.MANUFACTURER);
                dVar2.i = r.d(Build.MODEL);
                dVar2.j = sg.bigo.ads.bz.b.d(dVar2.b);
                Point d2 = sg.bigo.ads.common.utils.f.d(dVar2.b);
                dVar2.k = d2.x + "x" + d2.y;
                float a2 = sg.bigo.ads.common.utils.f.a(dVar2.b);
                dVar2.l = (int) (10.0f * a2);
                if (a2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    dVar2.m = Math.round(d2.x / a2) + "x" + Math.round(d2.y / a2);
                }
                PackageInfo e2 = sg.bigo.ads.common.utils.d.e(dVar2.b, "com.google.android.gms");
                if (e2 != null) {
                    dVar2.n = e2.versionName;
                }
                dVar2.o = sg.bigo.ads.bz.b.f(dVar2.b);
                dVar2.p = sg.bigo.ads.bz.a.a();
                dVar2.q = sg.bigo.ads.bz.a.b();
                dVar2.r = q.b(dVar2.b);
                dVar2.t = sg.bigo.ads.common.utils.d.f(dVar2.b, dVar2.d);
                dVar2.s = sg.bigo.ads.by.a.a();
                dVar2.u = sg.bigo.ads.common.utils.d.c(dVar2.b);
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                hashMap.put("1", String.valueOf(elapsedRealtime4));
                String.valueOf(elapsedRealtime4);
                sg.bigo.ads.a a3 = BigoAdSdk.a(aVar2.a);
                if (r.a((CharSequence) a3.b)) {
                    a3.b = aVar2.e.a.getAppKey();
                }
                long elapsedRealtime5 = SystemClock.elapsedRealtime();
                long elapsedRealtime6 = SystemClock.elapsedRealtime() - elapsedRealtime3;
                hashMap.put("2", String.valueOf(elapsedRealtime6));
                String.valueOf(elapsedRealtime6);
                if (TextUtils.equals(aVar2.e.a.getAppKey(), a3.b)) {
                    aVar2.d.a.b(aVar2.a);
                    aVar2.b.b(aVar2.a);
                    aVar2.c.b(aVar2.a);
                }
                long elapsedRealtime7 = SystemClock.elapsedRealtime();
                long elapsedRealtime8 = SystemClock.elapsedRealtime() - elapsedRealtime5;
                hashMap.put("3", String.valueOf(elapsedRealtime8));
                String.valueOf(elapsedRealtime8);
                aVar2.b.C();
                h.a().a(aVar2.b.K());
                sg.bigo.ads.au.a.a(aVar2.a, new a.InterfaceC2433a() { // from class: sg.bigo.ads.cl.a.9
                    @Override // sg.bigo.ads.au.a.InterfaceC2433a
                    public final void a() {
                        sg.bigo.ads.au.a.b("tb_addata", "end_time < " + System.currentTimeMillis(), null);
                        u.a();
                    }

                    @Override // sg.bigo.ads.au.a.InterfaceC2433a
                    public final void a(String str) {
                        sg.bigo.ads.da.b.a(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 10101, str);
                    }
                });
                long elapsedRealtime9 = SystemClock.elapsedRealtime();
                long elapsedRealtime10 = SystemClock.elapsedRealtime() - elapsedRealtime7;
                hashMap.put("4", String.valueOf(elapsedRealtime10));
                String.valueOf(elapsedRealtime10);
                final sg.bigo.ads.df.d a4 = sg.bigo.ads.df.d.a();
                Context context3 = aVar2.a;
                sg.bigo.ads.api.core.r rVar = aVar2.b.a;
                sg.bigo.ads.ck.e eVar = new sg.bigo.ads.ck.e(aVar2.d);
                a4.e = context3;
                if (!a4.b.getAndSet(true)) {
                    a4.c = rVar;
                    a4.d = eVar;
                    if (rVar.a) {
                        sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.df.d.3
                            public AnonymousClass3() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                Set set = d.this.a;
                                g gVar = g.a.a;
                                set.addAll(g.a(0L, d.this.c));
                                d.this.c();
                            }
                        });
                    }
                }
                sg.bigo.ads.da.c a5 = sg.bigo.ads.da.c.a();
                Context context4 = aVar2.a;
                sg.bigo.ads.db.a aVar3 = aVar2.b.c;
                sg.bigo.ads.ck.g gVar = new sg.bigo.ads.ck.g(aVar2.e, aVar2.d);
                d dVar3 = aVar2.e;
                if (!a5.c.getAndSet(true)) {
                    a5.a = aVar3;
                    a5.d = dVar3;
                    a5.b = new sg.bigo.ads.dc.b(context4, aVar3, gVar, dVar3);
                }
                sg.bigo.ads.cq.b a6 = sg.bigo.ads.cq.b.a();
                Context context5 = aVar2.a;
                sg.bigo.ads.cr.a aVar4 = aVar2.b.g;
                sg.bigo.ads.ck.b bVar = new sg.bigo.ads.ck.b(aVar2.e, aVar2.d);
                sg.bigo.ads.ck.d dVar4 = new sg.bigo.ads.ck.d(aVar2.e, aVar2.d);
                d dVar5 = aVar2.e;
                a6.d = aVar4;
                a6.e = context5;
                a6.f = bVar;
                a6.g = dVar4;
                a6.h = dVar5;
                if (!a6.b.getAndSet(true)) {
                    sg.bigo.ads.cr.a aVar5 = a6.d;
                    if (aVar5 == null || !aVar5.d) {
                        a6.a = new sg.bigo.ads.cs.a(context5, aVar4, bVar, dVar5);
                    } else {
                        a6.c = new sg.bigo.ads.cs.j(a6.e, aVar5, a6.f, a6.g, a6.h);
                    }
                }
                sg.bigo.ads.common.form.b a7 = sg.bigo.ads.common.form.b.a();
                sg.bigo.ads.ck.c cVar = new sg.bigo.ads.ck.c(aVar2.e, aVar2.d);
                a7.a.set(true);
                a7.b = cVar;
                sg.bigo.ads.da.a.a().a = new sg.bigo.ads.ck.f(aVar2.e, aVar2.d);
                sg.bigo.ads.ci.e eVar2 = aVar2.b;
                sg.bigo.ads.az.a aVar6 = eVar2.b;
                l n = eVar2.n();
                sg.bigo.ads.core.player.b.a().a(aVar2.e, aVar2.a, aVar6, n.a(12));
                if (n.a(15)) {
                    sg.bigo.ads.bz.b.i(aVar2.a);
                }
                long elapsedRealtime11 = SystemClock.elapsedRealtime();
                long elapsedRealtime12 = SystemClock.elapsedRealtime() - elapsedRealtime9;
                hashMap.put(CampaignEx.CLICKMODE_ON, String.valueOf(elapsedRealtime12));
                String.valueOf(elapsedRealtime12);
                sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.cl.a.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        sg.bigo.ads.cv.c cVar2;
                        cVar2 = c.a.a;
                        a aVar7 = a.this;
                        cVar2.a(aVar7.a, aVar7.b.J());
                    }
                });
                long elapsedRealtime13 = SystemClock.elapsedRealtime();
                long elapsedRealtime14 = SystemClock.elapsedRealtime() - elapsedRealtime11;
                hashMap.put("6", String.valueOf(elapsedRealtime14));
                String.valueOf(elapsedRealtime14);
                sg.bigo.ads.cm.a.a(aVar2.a, aVar2);
                sg.bigo.ads.bz.b.g(aVar2.a);
                aVar2.m.a();
                aVar2.d.a(8000L, "[sdk init]");
                long elapsedRealtime15 = SystemClock.elapsedRealtime() - elapsedRealtime13;
                hashMap.put(Gc.e, String.valueOf(elapsedRealtime15));
                String.valueOf(elapsedRealtime15);
                if (k.a.x()) {
                    dVar = d.a.a;
                    dVar.a(aVar2.d, aVar2.e, aVar2.b, aVar2.c, aVar2.f);
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
                a.a(a.this, 0, hashMap);
            }
        });
        e.a(new sg.bigo.ads.bh.a() { // from class: sg.bigo.ads.cl.a.8
            @Override // sg.bigo.ads.bh.a
            public final void a(Throwable th) {
                String name = Thread.currentThread().getName();
                if (name.contains("ReportNet") || name.contains("Stat-Worker")) {
                    return;
                }
                sg.bigo.ads.da.b.a(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 10100, Log.getStackTraceString(th));
            }
        });
    }

    public static boolean isInitialized() {
        return a.get();
    }

    public static boolean isOffice() {
        return true;
    }

    public static void setUserConsent(@NonNull final Context context, @NonNull final ConsentOptions consentOptions, final boolean z) {
        if (!sg.bigo.ads.bw.b.a()) {
            sg.bigo.ads.bw.b.a = context.getApplicationContext();
        }
        if (!sg.bigo.ads.bg.b.a()) {
            sg.bigo.ads.bg.b.a(context.getApplicationContext());
        }
        sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.c.1
            /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                String valueOf;
                String str;
                String str2;
                String str3;
                Context context2 = context;
                ConsentOptions consentOptions2 = consentOptions;
                boolean z2 = z;
                int i = AnonymousClass3.a[consentOptions2.ordinal()];
                if (i == 1) {
                    valueOf = String.valueOf(sg.bigo.ads.bw.a.q());
                    str = "lgpd";
                } else if (i == 2) {
                    valueOf = String.valueOf(sg.bigo.ads.bw.a.p());
                    str = "ccpa";
                } else if (i == 3) {
                    valueOf = String.valueOf(sg.bigo.ads.bw.a.r());
                    str = "coppa";
                } else {
                    if (i != 4) {
                        str3 = "";
                        str2 = str3;
                        a aVar = new a(str3, str2, !z2 ? "1" : "2", f.b ? "1" : "0", !sg.bigo.ads.bg.b.e(context2) ? String.valueOf(sg.bigo.ads.bg.b.c(context2)) : C4217a2.f, sg.bigo.ads.bg.b.b(context2), sg.bigo.ads.bg.b.d(context2));
                        if (BigoAdSdk.isInitialized()) {
                            a.a(aVar);
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(a.b(aVar));
                        hashMap.put("user_consent_event", jSONArray.toString());
                        hashMap.put("uuid", sg.bigo.ads.bw.a.t());
                        sg.bigo.ads.da.b.c(hashMap);
                        return;
                    }
                    valueOf = String.valueOf(sg.bigo.ads.bw.a.o());
                    str = "gdpr";
                }
                str2 = valueOf;
                str3 = str;
                a aVar2 = new a(str3, str2, !z2 ? "1" : "2", f.b ? "1" : "0", !sg.bigo.ads.bg.b.e(context2) ? String.valueOf(sg.bigo.ads.bg.b.c(context2)) : C4217a2.f, sg.bigo.ads.bg.b.b(context2), sg.bigo.ads.bg.b.d(context2));
                if (BigoAdSdk.isInitialized()) {
                }
            }
        });
        if (consentOptions == ConsentOptions.GDPR) {
            sg.bigo.ads.bw.a.a(z);
            if (sg.bigo.ads.bg.b.e(context)) {
                return;
            }
        }
        a(context, consentOptions, z);
    }

    @NonNull
    public static a a(@NonNull Context context) {
        if (e == null) {
            e = new a(context);
        }
        if (!e.e) {
            e.b(context);
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(@NonNull Context context) {
        boolean a2;
        if (!sg.bigo.ads.bw.b.a()) {
            sg.bigo.ads.bw.b.a = context.getApplicationContext();
        }
        if (!sg.bigo.ads.bg.b.a()) {
            sg.bigo.ads.bg.b.a(context.getApplicationContext());
        }
        if (sg.bigo.ads.bg.b.e(context)) {
            a2 = i.a();
        } else {
            i.c();
            a2 = sg.bigo.ads.bw.a.n() != 2;
        }
        a(context, ConsentOptions.GDPR, a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a.C2453a<sg.bigo.ads.api.b> a(final sg.bigo.ads.api.b bVar, sg.bigo.ads.ce.c cVar) {
        String str;
        bVar.g.f = System.currentTimeMillis();
        sg.bigo.ads.ce.a aVar = new sg.bigo.ads.ce.a(cVar);
        if (!a.get()) {
            aVar.a(0, 1000, 0, "Please initialize SDK before request ads.", new Pair<>(bVar, null));
            return null;
        }
        c(d.a);
        final sg.bigo.ads.cl.a aVar2 = d;
        if (r.a((CharSequence) aVar2.e.a.getAppKey())) {
            aVar.a(0, Z3.i, 10000, "App id cannot be empty, please pass the id when initializing bigo sdk.", (String) new Pair(bVar, null));
            return null;
        }
        sg.bigo.ads.api.core.c b2 = bVar.b();
        if (b2 != null) {
            aVar.a(0, b2.a, b2.b, b2.c, (String) new Pair(bVar, null));
            return null;
        }
        int i = 0;
        Object[] objArr = 0;
        if (!sg.bigo.ads.bw.a.s()) {
            final a.C2453a<sg.bigo.ads.api.b> c2453a = new a.C2453a<>(bVar, aVar, objArr == true ? 1 : 0);
            sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.cl.a.11
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    if (bVar.g()) {
                        ((sg.bigo.ads.api.b) c2453a.a).b(0);
                        a.a(a.this, c2453a);
                    } else {
                        a.this.m.b();
                        a.this.f.a(new e.a() { // from class: sg.bigo.ads.cl.a.11.1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // sg.bigo.ads.cl.e.a
                            public final void a(int i2) {
                                a.a(a.this, 1, (Map) null);
                                ((sg.bigo.ads.api.b) c2453a.a).b(i2);
                                AnonymousClass11 anonymousClass11 = AnonymousClass11.this;
                                a.a(a.this, c2453a);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // sg.bigo.ads.cl.e.a
                            public final void a(int i2, int i3, String str2) {
                                ((sg.bigo.ads.api.b) c2453a.a).b(i2);
                                if (a.this.b.O()) {
                                    AnonymousClass11 anonymousClass11 = AnonymousClass11.this;
                                    a.a(a.this, c2453a);
                                } else {
                                    AnonymousClass11 anonymousClass112 = AnonymousClass11.this;
                                    a.this.a(c2453a, 1008, i3, str2);
                                }
                            }
                        }, 1);
                    }
                }
            });
            return c2453a;
        }
        String str2 = "Missing CCPA consent";
        if (sg.bigo.ads.bw.a.o() == 2) {
            str = "Missing GDPR consent";
            i = 1;
        } else {
            str = "Missing CCPA consent";
        }
        if (sg.bigo.ads.bw.a.q() == 2) {
            i++;
            str = "Missing LGPD consent";
        }
        if (sg.bigo.ads.bw.a.p() == 2) {
            i++;
        } else {
            str2 = str;
        }
        if (sg.bigo.ads.bw.a.r() == 2) {
            i++;
            str2 = "Missing COPPA consent";
        }
        if (i > 1) {
            str2 = "Missing user consent";
        }
        aVar.a(0, 1001, 800, str2, (String) new Pair(bVar, null));
        return null;
    }

    private static void a(final Context context, @NonNull final ConsentOptions consentOptions, boolean z) {
        boolean a2 = a(consentOptions, z);
        if (z || !a2) {
            return;
        }
        sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.2
            @Override // java.lang.Runnable
            public final void run() {
                int n = sg.bigo.ads.bw.a.n();
                sg.bigo.ads.bn.a.a(2, 5, "", "Revoking user consent...The cached data of user will be deleted now.");
                sg.bigo.ads.dc.b bVar = sg.bigo.ads.da.c.a().b;
                if (bVar != null) {
                    bVar.c.f();
                }
                sg.bigo.ads.cq.b a3 = sg.bigo.ads.cq.b.a();
                sg.bigo.ads.cs.a aVar = a3.a;
                if (aVar != null) {
                    aVar.b.e();
                }
                sg.bigo.ads.cs.j jVar = a3.c;
                if (jVar != null) {
                    jVar.c.g();
                    jVar.b.g();
                }
                sg.bigo.ads.df.d a4 = sg.bigo.ads.df.d.a();
                a4.e = context.getApplicationContext();
                sg.bigo.ads.bh.d.a(a4.f);
                a4.a.clear();
                final sg.bigo.ads.core.player.b a5 = sg.bigo.ads.core.player.b.a();
                final Context applicationContext = context.getApplicationContext();
                Runnable anonymousClass5 = new Runnable() { // from class: sg.bigo.ads.core.player.b.5
                    final /* synthetic */ Context a;

                    public AnonymousClass5(final Context applicationContext2) {
                        r2 = applicationContext2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        h hVar;
                        if (b.this.c != null) {
                            sg.bigo.ads.ay.b bVar2 = b.this.c;
                            sg.bigo.ads.ba.b.a();
                            bVar2.a.clear();
                            bVar2.c.clear();
                            bVar2.b.clear();
                            bVar2.d.clear();
                        }
                        if (b.this.i != null) {
                            b.this.i.clear();
                        }
                        if (b.this.j != null) {
                            b.this.j.clear();
                        }
                        if (b.this.k != null) {
                            b.this.k.clear();
                        }
                        Context context2 = r2;
                        hVar = h.a.a;
                        hVar.e(context2);
                    }
                };
                if (sg.bigo.ads.bh.d.a()) {
                    anonymousClass5.run();
                } else {
                    sg.bigo.ads.bh.d.a(1, anonymousClass5);
                }
                BigoAdSdk.a(consentOptions);
                sg.bigo.ads.bw.a.c(n);
            }
        });
    }

    public static /* synthetic */ void a(final String str) {
        sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.4
            @Override // java.lang.Runnable
            public final void run() {
                if (BigoAdSdk.d != null) {
                    for (Pair pair : BigoAdSdk.g) {
                        BigoAdSdk.d.a((String) pair.first, (String) pair.second);
                    }
                    Map<String, String> b2 = sg.bigo.ads.common.utils.c.b(str, "all");
                    if (!sg.bigo.ads.common.utils.l.a(b2)) {
                        for (Map.Entry<String, String> entry : b2.entrySet()) {
                            BigoAdSdk.d.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                BigoAdSdk.g.clear();
            }
        });
    }

    public static /* synthetic */ boolean a(ConsentOptions consentOptions) {
        return a(consentOptions, false);
    }

    private static boolean a(@NonNull ConsentOptions consentOptions, boolean z) {
        boolean z2;
        int i = z ? 1 : 2;
        int i2 = AnonymousClass5.a[consentOptions.ordinal()];
        if (i2 == 1) {
            if (i != sg.bigo.ads.bw.a.o()) {
                sg.bigo.ads.bw.a.d(i);
                z2 = true;
            }
            z2 = false;
        } else if (i2 == 2) {
            if (i != sg.bigo.ads.bw.a.p()) {
                sg.bigo.ads.bw.a.e(i);
                z2 = true;
            }
            z2 = false;
        } else if (i2 != 3) {
            if (i2 == 4 && i != sg.bigo.ads.bw.a.r()) {
                sg.bigo.ads.bw.a.g(i);
                z2 = true;
            }
            z2 = false;
        } else {
            if (i != sg.bigo.ads.bw.a.q()) {
                sg.bigo.ads.bw.a.f(i);
                z2 = true;
            }
            z2 = false;
        }
        if (z2) {
            c.set(true);
        }
        return z2;
    }
}
