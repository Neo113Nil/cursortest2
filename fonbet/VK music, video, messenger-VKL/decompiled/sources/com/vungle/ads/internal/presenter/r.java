package com.vungle.ads.internal.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.AdConfig;
import com.vungle.ads.IndexHtmlError;
import com.vungle.ads.InvalidCTAUrl;
import com.vungle.ads.MraidTemplateError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.PrivacyUrlError;
import com.vungle.ads.TpatError;
import com.vungle.ads.VungleError;
import com.vungle.ads.WebViewError;
import com.vungle.ads.WebViewRenderProcessUnresponsive;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.c1;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.model.p1;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.p0;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.u1;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlinx.serialization.json.JsonObject;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import xsna.air;
import xsna.arm0;
import xsna.bpn0;
import xsna.de;
import xsna.ds4;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.j5g;
import xsna.j8y;
import xsna.msy;
import xsna.pn00;
import xsna.pzl;
import xsna.s1v;
import xsna.s3q0;
import xsna.vq3;
import xsna.wc2;
import xsna.wcy;
import xsna.zr;

/* loaded from: classes7.dex */
public final class r implements com.vungle.ads.internal.ui.view.o, com.vungle.ads.internal.ui.view.p {
    public static final Map z = pn00.k(new Pair("checkpoint.0", Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), new Pair("clickUrl", Sdk.SDKMetric.SDKMetricType.AD_CLICK_EVENT));
    public final com.vungle.ads.internal.ui.view.k a;
    public final h0 b;
    public final i3 c;
    public final com.vungle.ads.internal.ui.z d;
    public Executor e;
    public final com.vungle.ads.internal.omsdk.e f;
    public final com.vungle.ads.internal.platform.f g;
    public long h;
    public a i;
    public boolean j;
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final AtomicBoolean l = new AtomicBoolean(false);
    public Long m;
    public String n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;
    public z s;
    public y t;
    public final Lazy u;
    public final Lazy v;
    public boolean w;
    public final Lazy x;
    public long y;

    public r(com.vungle.ads.internal.ui.view.k kVar, h0 h0Var, i3 i3Var, com.vungle.ads.internal.ui.z zVar, com.vungle.ads.internal.executor.j jVar, com.vungle.ads.internal.omsdk.e eVar, com.vungle.ads.internal.platform.f fVar) {
        this.a = kVar;
        this.b = h0Var;
        this.c = i3Var;
        this.d = zVar;
        this.e = jVar;
        this.f = eVar;
        this.g = fVar;
        Context context = kVar.getContext();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.o = msy.a(lazyThreadSafetyMode, new n(context));
        this.p = msy.a(lazyThreadSafetyMode, new o(kVar.getContext()));
        this.q = msy.a(lazyThreadSafetyMode, new p(kVar.getContext()));
        this.r = msy.a(lazyThreadSafetyMode, new q(kVar.getContext()));
        this.u = new bpn0(m.a);
        this.v = new bpn0(new g(this));
        this.x = new bpn0(new d(this));
    }

    public static final void e(r rVar) {
        String b = rVar.c.b();
        List list = null;
        com.vungle.ads.internal.network.m a = ((VungleApiClient) rVar.o.getValue()).a(new p1(list, rVar.m, rVar.b.e(), b, rVar.n, (c1) null, 67));
        if (a != null) {
            a.a(new j(rVar));
            return;
        }
        boolean z2 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("MRAIDPresenter", "Invalid ri call.");
        StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Error RI API for placement: ");
        a2.append(rVar.c.b());
        new NetworkUnreachable(a2.toString()).setLogEntry$vungle_ads_release(rVar.b()).logErrorNoReturnValue$vungle_ads_release();
    }

    public final com.vungle.ads.internal.network.r c() {
        return (com.vungle.ads.internal.network.r) this.r.getValue();
    }

    public final void d() {
        if (this.w) {
            this.a.a("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    public final void f() {
        this.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z2;
        int a;
        a aVar;
        IndexHtmlError indexHtmlError;
        int settings;
        this.k.set(false);
        AdConfig j = this.b.j();
        if (j != null && (settings = j.getSettings()) > 0) {
            this.w = (settings & 2) == 2;
        }
        AdConfig j2 = this.b.j();
        Integer valueOf = j2 != null ? Integer.valueOf(j2.getAdOrientation()) : null;
        this.a.setOrientation((valueOf != null && valueOf.intValue() == 0) ? 7 : (valueOf != null && valueOf.intValue() == 1) ? 6 : 4);
        this.f.a();
        this.d.a((com.vungle.ads.internal.ui.view.o) this);
        this.d.a((com.vungle.ads.internal.ui.view.p) this);
        this.d.b(false);
        if (!this.b.G()) {
            String str5 = this.b.i;
            File file = str5 != null ? new File(str5) : null;
            if (file == null || !file.exists()) {
                Sdk.SDKError.Reason reason = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD;
                StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Fail to load html ");
                a2.append(file != null ? file.getPath() : null);
                indexHtmlError = new IndexHtmlError(reason, a2.toString());
            } else {
                this.a.a(this.d, this.b.v());
                com.vungle.ads.internal.ui.view.k kVar = this.a;
                StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("file://");
                a3.append(file.getPath());
                kVar.a(a3.toString());
                indexHtmlError = null;
            }
            if (indexHtmlError != null) {
                indexHtmlError.setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                a aVar2 = this.i;
                if (aVar2 != null) {
                    aVar2.a(indexHtmlError, this.c.a);
                }
                a();
                return;
            }
        }
        this.m = Long.valueOf(System.currentTimeMillis());
        z zVar = this.s;
        this.n = zVar != null ? ((u1) zVar).r() : null;
        z zVar2 = this.s;
        if (zVar2 == null || (str = ((u1) zVar2).q()) == null) {
            str = "";
        }
        z zVar3 = this.s;
        if (zVar3 == null || (str2 = ((u1) zVar3).n()) == null) {
            str2 = "";
        }
        z zVar4 = this.s;
        if (zVar4 == null || (str3 = ((u1) zVar4).p()) == null) {
            str3 = "";
        }
        z zVar5 = this.s;
        if (zVar5 == null || (str4 = ((u1) zVar5).o()) == null) {
            str4 = "";
        }
        this.b.a(str, str2, str3, str4);
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.k()) {
            PrivacyManager.INSTANCE.getClass();
            if ("unknown".equals(PrivacyManager.b())) {
                z2 = true;
                this.d.a(z2, ConfigManager.j(), ConfigManager.i(), ConfigManager.g(), ConfigManager.h());
                if (z2) {
                    PrivacyManager.INSTANCE.getClass();
                    PrivacyManager.a("opted_out_by_timeout", "vungle_modal", "");
                }
                a = this.b.a(Boolean.valueOf(this.c.j()));
                if (a <= 0) {
                    ((com.vungle.ads.internal.util.o) this.u.getValue()).a(new vq3(this, 16), a);
                } else {
                    this.w = true;
                }
                aVar = this.i;
                if (aVar == null) {
                    aVar.a("start", null, this.c.b());
                    return;
                }
                return;
            }
        }
        z2 = false;
        this.d.a(z2, ConfigManager.j(), ConfigManager.i(), ConfigManager.g(), ConfigManager.h());
        if (z2) {
        }
        a = this.b.a(Boolean.valueOf(this.c.j()));
        if (a <= 0) {
        }
        aVar = this.i;
        if (aVar == null) {
        }
    }

    public final void h() {
        Long l = this.m;
        if (l != null) {
            List b = this.b.b("ad.close", String.valueOf(System.currentTimeMillis() - l.longValue()), String.valueOf(((com.vungle.ads.internal.platform.c) this.g).k()));
            if (b != null) {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.p pVar = new com.vungle.ads.internal.network.p((String) it.next());
                    pVar.i = "ad.close";
                    pVar.j = b();
                    c().a(pVar.a(), false);
                }
            }
        }
    }

    public static final void c(r rVar) {
        rVar.h();
    }

    public final void a(a aVar) {
        this.i = aVar;
    }

    public final com.vungle.ads.internal.util.s b() {
        return (com.vungle.ads.internal.util.s) this.v.getValue();
    }

    public static final void d(r rVar) {
        rVar.w = true;
    }

    public final void a(z zVar) {
        this.s = zVar;
    }

    public final void a(com.vungle.ads.internal.ui.k kVar) {
        this.t = kVar;
    }

    public final void a(int i) {
        long j;
        AdSession adSession;
        a aVar;
        boolean z2 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("MRAIDPresenter", "detach()");
        boolean z3 = (i & 1) != 0;
        boolean z4 = (i & 2) != 0;
        com.vungle.ads.internal.ui.z zVar = this.d;
        zVar.q = null;
        zVar.o = null;
        if (!z3 && z4 && !this.k.getAndSet(true) && (aVar = this.i) != null) {
            aVar.a(TtmlNode.END, null, this.c.a);
        }
        com.vungle.ads.internal.omsdk.e eVar = this.f;
        if (!eVar.b || (adSession = eVar.c) == null) {
            j = 0;
        } else {
            adSession.finish();
            j = com.vungle.ads.internal.omsdk.e.d;
        }
        eVar.b = false;
        eVar.c = null;
        this.a.a(j);
    }

    public final void e() {
        a(new WebViewRenderProcessUnresponsive("fatal=true"), true, null);
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent != null) {
            boolean z2 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("MRAIDPresenter", "user interaction");
            this.h = System.currentTimeMillis();
            ((p0) this.x.getValue()).a(motionEvent);
        }
    }

    public final void a() {
        if (com.vungle.ads.internal.util.y.a()) {
            this.e.execute(new ds4(this, 7));
        } else {
            h();
        }
        com.vungle.ads.internal.util.y.a(new e(this));
    }

    public final void a(String str) {
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new h(this));
        m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
        m2Var.c = 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        analyticsClient.a(m2Var, b(), str);
        analyticsClient.c(Sdk.SDKError.Reason.INLINE_INSTALL_ERROR, String.valueOf(str), b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0270, code lost:
    
        if (r19.h != 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0273, code lost:
    
        r2 = java.lang.System.currentTimeMillis() - r19.h;
        r4 = com.vungle.ads.internal.ConfigManager.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x027c, code lost:
    
        if (r4 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x027e, code lost:
    
        r4 = r4.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0280, code lost:
    
        if (r4 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0282, code lost:
    
        r4 = r4.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0284, code lost:
    
        if (r4 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0286, code lost:
    
        r6 = r4.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0292, code lost:
    
        if (r2 <= r6) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x028b, code lost:
    
        r6 = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0294, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0296, code lost:
    
        if (r16 == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0298, code lost:
    
        r19.h = 0;
        com.vungle.ads.internal.AnalyticsClient.a(com.vungle.ads.internal.AnalyticsClient.INSTANCE, new com.vungle.ads.internal.m2(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT), b(), 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02ad, code lost:
    
        r19.h = 0;
        r0 = com.vungle.ads.internal.util.l.a(r11, r0, r19.a.getContext(), b(), new com.vungle.ads.internal.presenter.f(r11, r19));
        r2 = r19.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02c6, code lost:
    
        if (r2 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02c8, code lost:
    
        r2.a("open", "adClick", r19.c.b());
        r2 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02d3, code lost:
    
        if (r0 == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02d5, code lost:
    
        r0 = r19.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02d7, code lost:
    
        if (r0 == null) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02d9, code lost:
    
        r0.a("open", "adLeftApplication", r19.c.b());
        r0 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0267, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0217, code lost:
    
        if (r20.equals("useCustomPrivacy") == false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0221, code lost:
    
        if (r20.equals("openNonMraid") == false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x060b, code lost:
    
        if (r20.equals("action") == false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r20.equals("useCustomClose") == false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020d, code lost:
    
        if (r20.equals("open") == false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0225, code lost:
    
        r0 = r19.b.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x022b, code lost:
    
        if (r0 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x022d, code lost:
    
        r11 = r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0231, code lost:
    
        r0 = com.vungle.ads.internal.util.r.a("url", r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0239, code lost:
    
        if (com.vungle.ads.internal.util.n.a(r0) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x023b, code lost:
    
        new com.vungle.ads.InvalidCTAUrl(xsna.air.b(')', "Invalid CTA Url (", r0)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0251, code lost:
    
        com.vungle.ads.internal.ConfigManager.INSTANCE.getClass();
        r2 = com.vungle.ads.internal.ConfigManager.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0258, code lost:
    
        if (r2 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x025a, code lost:
    
        r2 = r2.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x025c, code lost:
    
        if (r2 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x025e, code lost:
    
        r2 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0260, code lost:
    
        if (r2 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0262, code lost:
    
        r2 = r2.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0269, code lost:
    
        if (r2 == false) goto L116;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str, JsonObject jsonObject) {
        int i;
        Integer m;
        Object failure;
        Object obj;
        boolean a;
        List a2;
        Sdk.SDKError.Reason reason;
        String str2 = null;
        Map map = null;
        switch (str.hashCode()) {
            case -1988620632:
                if (str.equals("detectBlackScreen")) {
                    String a3 = com.vungle.ads.internal.util.r.a("samplingFactor", jsonObject);
                    if (a3 != null && (m = arm0.m(10, a3)) != null) {
                        Integer num = m.intValue() > 0 ? m : null;
                        if (num != null) {
                            i = num.intValue();
                            this.d.a(i);
                            break;
                        }
                    }
                    i = 100;
                    this.d.a(i);
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case -1912374177:
                if (str.equals("successfulView")) {
                    a aVar = this.i;
                    if (aVar != null) {
                        aVar.a("successfulView", null, this.c.b());
                        s3q0 s3q0Var = s3q0.a;
                    }
                    if (this.c.j()) {
                        ConfigManager.INSTANCE.getClass();
                        if (ConfigManager.o() && !this.l.getAndSet(true)) {
                            this.e.execute(new wc2(this, 23));
                            break;
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z22 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case -1422950858:
                break;
            case -735200587:
                if (str.equals("actionWithValue")) {
                    String a4 = com.vungle.ads.internal.util.r.a(NotificationCompat.CATEGORY_EVENT, jsonObject);
                    String a5 = com.vungle.ads.internal.util.r.a("value", jsonObject);
                    if (HandleInvocationsFromAdViewer.KEY_VIDEO_LENGTH.equalsIgnoreCase(a4)) {
                        if (a5 != null) {
                            try {
                                obj = Long.valueOf(Long.parseLong(a5));
                            } catch (Throwable th) {
                                failure = new Result.Failure(th);
                            }
                        } else {
                            obj = null;
                        }
                        failure = obj;
                        Long l = (Long) (failure instanceof Result.Failure ? null : failure);
                        this.y = l != null ? l.longValue() : 0L;
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case -660787472:
                if (str.equals("consentAction")) {
                    String a6 = com.vungle.ads.internal.util.r.a(NotificationCompat.CATEGORY_EVENT, jsonObject);
                    PrivacyConsent privacyConsent = PrivacyConsent.OPT_OUT;
                    String value = epx.f(a6, privacyConsent.getValue()) ? privacyConsent.getValue() : PrivacyConsent.OPT_IN.getValue();
                    PrivacyManager.INSTANCE.getClass();
                    PrivacyManager.a(value, "vungle_modal", null);
                    break;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z2222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case -649897046:
                if (str.equals("openAppStore")) {
                    com.vungle.ads.internal.model.i c = this.b.c();
                    String a7 = c != null ? c.a() : null;
                    String a8 = com.vungle.ads.internal.util.r.a("url", jsonObject);
                    if (!com.vungle.ads.internal.util.n.a(a8)) {
                        new InvalidCTAUrl(air.b(')', "Invalid InlineInstall Url (", a8)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                    }
                    this.h = System.currentTimeMillis();
                    boolean a9 = com.vungle.ads.internal.util.l.a(a7, null, this.a.getContext(), b(), new f(a7, this));
                    if (a9) {
                        r16 = a9;
                    } else {
                        if (a8 == null || a8.length() == 0) {
                            a("url: " + a8 + ", message: url is null/empty");
                        } else {
                            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(a8));
                            intent.setPackage("com.android.vending");
                            if (!(this.a.getContext() instanceof Activity)) {
                                intent.addFlags(268435456);
                            }
                            if (intent.resolveActivity(this.a.getContext().getPackageManager()) == null) {
                                a("url: " + a8 + ", message: play store not installed");
                            } else {
                                y yVar = this.t;
                                Pair a10 = yVar != null ? ((com.vungle.ads.internal.ui.k) yVar).a(intent) : new Pair(Boolean.FALSE, null);
                                boolean booleanValue = ((Boolean) a10.d()).booleanValue();
                                String str3 = (String) a10.g();
                                if (!booleanValue) {
                                    a("url: " + a8 + ", message: " + str3);
                                } else {
                                    String a11 = com.iab.omid.library.vungle.d.a("url: ", a8);
                                    m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
                                    m2Var.c = 1L;
                                    AnalyticsClient.INSTANCE.a(m2Var, b(), a11);
                                    r16 = true;
                                }
                            }
                        }
                    }
                    if (r16) {
                        a aVar2 = this.i;
                        if (aVar2 != null) {
                            aVar2.a("open", "adClick", this.c.b());
                            s3q0 s3q0Var2 = s3q0.a;
                        }
                        a aVar3 = this.i;
                        if (aVar3 != null) {
                            aVar3.a("open", "adLeftApplication", this.c.b());
                            s3q0 s3q0Var3 = s3q0.a;
                            break;
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z22222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case -568000867:
                if (str.equals("pingUrl")) {
                    String a12 = com.vungle.ads.internal.util.r.a("requestType", jsonObject);
                    String upperCase = a12 != null ? a12.toUpperCase(Locale.ROOT) : null;
                    if (!j5g.P(e43.l("GET", "POST"), upperCase)) {
                        new TpatError(Sdk.SDKError.Reason.TPAT_ERROR, zr.a("Invalid request type: ", upperCase, ". Only 'GET' and 'POST' are supported")).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                        break;
                    } else {
                        String a13 = com.vungle.ads.internal.util.r.a("url", jsonObject);
                        String a14 = com.vungle.ads.internal.util.r.a("requestData", jsonObject);
                        boolean parseBoolean = Boolean.parseBoolean(com.vungle.ads.internal.util.r.a(SignalingTransport.URL_TYPE_RETRY, jsonObject));
                        String a15 = com.vungle.ads.internal.util.r.a("headers", jsonObject);
                        if (a15 != null) {
                            try {
                                j8y.a aVar4 = j8y.d;
                                de deVar = aVar4.b;
                                int i2 = wcy.c;
                                map = (Map) aVar4.a(s1v.p(deVar, fpf0.g(wcy.a.a(fpf0.d(String.class)), wcy.a.a(fpf0.d(String.class)))), a15);
                            } catch (Exception unused) {
                                new TpatError(Sdk.SDKError.Reason.TPAT_ERROR, com.iab.omid.library.vungle.d.a("Failed to decode header: ", a15)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                                return true;
                            }
                        }
                        if (!com.vungle.ads.internal.util.z.a(a13)) {
                            new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "URL is missing in params from a template for generic tpat").setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                            break;
                        } else if (a13 != null) {
                            com.vungle.ads.internal.network.p a16 = new com.vungle.ads.internal.network.p(a13).a(map).a(a14).a(parseBoolean).b("pingUrl").a(b());
                            if (epx.f(upperCase, "GET")) {
                                a16.b();
                            } else {
                                a16.c();
                            }
                            s3q0 s3q0Var4 = s3q0.a;
                            c().a(a16.a(), false);
                            break;
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case -511324706:
                if (str.equals("openPrivacy")) {
                    AnalyticsClient.a(AnalyticsClient.INSTANCE, new m2(Sdk.SDKMetric.SDKMetricType.PRIVACY_URL_OPENED), b(), 4);
                    String a17 = com.vungle.ads.internal.util.r.a("url", jsonObject);
                    if (!(a17 == null || a17.length() == 0) && com.vungle.ads.internal.util.n.a(a17)) {
                        a = com.vungle.ads.internal.util.l.a(null, a17, this.a.getContext(), b(), null);
                        if (a) {
                            a aVar5 = this.i;
                            if (aVar5 != null) {
                                aVar5.a("open", "adLeftApplication", this.c.b());
                                s3q0 s3q0Var5 = s3q0.a;
                                break;
                            }
                        } else {
                            new PrivacyUrlError(a17).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                            break;
                        }
                    } else {
                        if (a17 == null) {
                            a17 = "nonePrivacyUrl";
                        }
                        new PrivacyUrlError(a17).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z2222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case -418575596:
                break;
            case -348095344:
                break;
            case 3417674:
                break;
            case 3566511:
                if (str.equals("tpat")) {
                    String a18 = com.vungle.ads.internal.util.r.a(NotificationCompat.CATEGORY_EVENT, jsonObject);
                    if (a18 != null && a18.length() != 0) {
                        Sdk.SDKMetric.SDKMetricType sDKMetricType = (Sdk.SDKMetric.SDKMetricType) z.get(a18);
                        if (sDKMetricType != null) {
                            AnalyticsClient.a(AnalyticsClient.INSTANCE, new m2(sDKMetricType), b(), 4);
                        }
                        if (a18.equals("checkpoint.0")) {
                            a2 = this.b.b(a18, ((com.vungle.ads.internal.platform.c) this.g).e(), String.valueOf(((com.vungle.ads.internal.platform.c) this.g).k()));
                        } else if (a18.equals("video.length")) {
                            a2 = h0.a(this.b, a18, String.valueOf(this.y), 4);
                        } else {
                            a2 = h0.a(this.b, a18, (String) null, 6);
                        }
                        if (a2 != null) {
                            Iterator it = a2.iterator();
                            while (it.hasNext()) {
                                c().a(new com.vungle.ads.internal.network.p((String) it.next()).b(a18).a(b()).a(), false);
                            }
                            s3q0 s3q0Var6 = s3q0.a;
                        }
                        if (a18.equals("checkpoint.0") && !this.j) {
                            this.j = true;
                            a aVar6 = this.i;
                            if (aVar6 != null) {
                                aVar6.a("adViewed", null, this.c.b());
                                s3q0 s3q0Var7 = s3q0.a;
                            }
                            Handler handler = com.vungle.ads.internal.util.y.a;
                            com.vungle.ads.internal.util.y.a(new i(this));
                            break;
                        }
                    } else {
                        new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key").setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z22222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case 94756344:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)) {
                    a();
                    break;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case 96784904:
                if (str.equals("error")) {
                    String a19 = com.vungle.ads.internal.util.r.a("code", jsonObject);
                    boolean parseBoolean2 = Boolean.parseBoolean(com.vungle.ads.internal.util.r.a("fatal", jsonObject));
                    String a20 = com.vungle.ads.internal.util.r.a("errorMessage", jsonObject);
                    if (parseBoolean2) {
                        reason = Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR;
                    } else {
                        reason = Sdk.SDKError.Reason.MRAID_ERROR;
                    }
                    String b = pzl.b(a19, " : ", a20);
                    MraidTemplateError mraidTemplateError = new MraidTemplateError(reason, b);
                    Handler handler2 = com.vungle.ads.internal.util.y.a;
                    com.vungle.ads.internal.util.y.a(new k(this, mraidTemplateError, parseBoolean2, b));
                    break;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z2222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case 133423073:
                if (str.equals("setOrientationProperties")) {
                    String a21 = com.vungle.ads.internal.util.r.a("forceOrientation", jsonObject);
                    if (a21 != null && a21.length() != 0) {
                        String lowerCase = a21.toLowerCase(Locale.ENGLISH);
                        if (lowerCase.equals(X3.i.C)) {
                            this.a.setOrientation(6);
                            break;
                        } else if (lowerCase.equals(X3.i.D)) {
                            this.a.setOrientation(7);
                            break;
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z22222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case 592314818:
                if (str.equals("updateSignals")) {
                    String a22 = com.vungle.ads.internal.util.r.a("signals", jsonObject);
                    if (a22 != null && a22.length() != 0) {
                        ((com.vungle.ads.internal.signals.j) this.q.getValue()).b(a22);
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z222222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case 1496446614:
                if (str.equals("getAvailableDiskSpace")) {
                    try {
                        Context context = this.a.getContext();
                        File noBackupFilesDir = context.getNoBackupFilesDir();
                        PathProvider pathProvider = (PathProvider) this.p.getValue();
                        String path = noBackupFilesDir.getPath();
                        pathProvider.getClass();
                        long a23 = PathProvider.a(path);
                        long a24 = com.vungle.ads.internal.util.z.a(context);
                        Handler handler3 = com.vungle.ads.internal.util.y.a;
                        com.vungle.ads.internal.util.y.a(new l(this, a23, a24));
                        break;
                    } catch (Exception e) {
                        boolean z3 = com.vungle.ads.internal.util.u.a;
                        StringBuilder a25 = com.iab.omid.library.vungle.internal.l.a("Failed to get available disk space: ");
                        a25.append(e.getMessage());
                        com.vungle.ads.internal.util.t.b("MRAIDPresenter", a25.toString());
                        return true;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z2222222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
            case 1614272768:
                break;
            default:
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", str)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z22222222222222 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: ".concat(str));
                break;
        }
        return true;
    }

    public final void a(boolean z2, String str) {
        if (z2) {
            WebViewError webViewError = new WebViewError(str);
            webViewError.setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
            a aVar = this.i;
            if (aVar != null) {
                aVar.a(webViewError, this.c.a);
            }
            a();
        }
    }

    public final void a(VungleError vungleError, boolean z2, String str) {
        boolean z3 = com.vungle.ads.internal.util.u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("handleWebViewException: ");
        a.append(vungleError.getLocalizedMessage());
        a.append(", fatal: ");
        a.append(z2);
        a.append(", errorMsg: ");
        a.append(str);
        com.vungle.ads.internal.util.t.b("MRAIDPresenter", a.toString());
        vungleError.setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
        if (z2) {
            a aVar = this.i;
            if (aVar != null) {
                aVar.a(vungleError, this.c.a);
            }
            a();
        }
    }
}
