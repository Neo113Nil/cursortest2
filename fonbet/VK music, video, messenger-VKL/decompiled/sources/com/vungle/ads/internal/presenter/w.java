package com.vungle.ads.internal.presenter;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.PrivacyUrlError;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.p0;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.r1;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.bpn0;
import xsna.epx;
import xsna.msy;
import xsna.pn00;
import xsna.xe9;
import xsna.y57;
import xsna.z1z;

/* loaded from: classes7.dex */
public final class w {
    public final Context a;
    public final x b;
    public final h0 c;
    public final com.vungle.ads.internal.platform.f d;
    public Long e;
    public a f;
    public final Lazy g;
    public AlertDialog h;
    public final Lazy i = new bpn0(new t(this));
    public final LinkedHashMap j = new LinkedHashMap();
    public final Map k;
    public final LinkedHashMap l;
    public final Map m;
    public com.vungle.ads.internal.omsdk.b n;
    public p0 o;

    public w(Context context, r1 r1Var, h0 h0Var, com.vungle.ads.internal.platform.f fVar) {
        this.a = context;
        this.b = r1Var;
        this.c = h0Var;
        this.d = fVar;
        this.g = msy.a(LazyThreadSafetyMode.SYNCHRONIZED, new v(context));
        Boolean bool = Boolean.TRUE;
        this.k = pn00.k(new Pair("video.mute", bool), new Pair("video.unmute", bool));
        this.l = new LinkedHashMap();
        this.m = pn00.k(new Pair(8, bool), new Pair(9, bool), new Pair(10, bool));
        this.o = new p0(context, h0Var);
    }

    public final com.vungle.ads.internal.util.s a() {
        return (com.vungle.ads.internal.util.s) this.i.getValue();
    }

    public final com.vungle.ads.internal.network.r b() {
        return (com.vungle.ads.internal.network.r) this.g.getValue();
    }

    public final void c() {
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.k()) {
            PrivacyManager.INSTANCE.getClass();
            if ("unknown".equals(PrivacyManager.b())) {
                d();
            }
        }
        a aVar = this.f;
        if (aVar != null) {
            aVar.a("start", null, ((r1) this.b).q());
        }
        this.e = Long.valueOf(System.currentTimeMillis());
    }

    public final void d() {
        PrivacyManager.INSTANCE.getClass();
        PrivacyManager.a("opted_out_by_timeout", "vungle_modal", null);
        if (!(this.a instanceof Activity)) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.c("NativeAdPresenter", "We can not show GDPR dialog with application context.");
            return;
        }
        z1z z1zVar = new z1z(this, 3);
        ConfigManager.INSTANCE.getClass();
        String j = ConfigManager.j();
        String i = ConfigManager.i();
        String g = ConfigManager.g();
        String h = ConfigManager.h();
        Context context = this.a;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, ((Activity) context).getApplicationInfo().theme));
        if (j != null && j.length() != 0) {
            builder.setTitle(j);
        }
        if (i != null && i.length() != 0) {
            builder.setMessage(i);
        }
        builder.setPositiveButton(g, z1zVar);
        builder.setNegativeButton(h, z1zVar);
        builder.setCancelable(false);
        AlertDialog create = builder.create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.ugz0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                com.vungle.ads.internal.presenter.w.a(com.vungle.ads.internal.presenter.w.this, dialogInterface);
            }
        });
        this.h = create;
        create.show();
    }

    public final void a(a aVar) {
        this.f = aVar;
    }

    public final void a(String str, String str2, String str3) {
        boolean a;
        List b;
        a aVar;
        boolean z = com.vungle.ads.internal.util.u.a;
        StringBuilder a2 = xe9.a("processCommand: action=", str, " event=", str2, " value=");
        a2.append(str3);
        com.vungle.ads.internal.util.t.a("NativeAdPresenter", a2.toString());
        int hashCode = str.hashCode();
        if (hashCode != -511324706) {
            if (hashCode != 3566511) {
                if (hashCode == 1427818632 && str.equals("download")) {
                    a("tpat", "clickUrl", (String) null);
                    a("tpat", "cta_url", str3);
                    com.vungle.ads.internal.model.i k = this.c.k();
                    String str4 = k != null ? k.f : null;
                    boolean a3 = com.vungle.ads.internal.util.l.a(str4, str3, this.a, a(), new u(str4, this));
                    a aVar2 = this.f;
                    if (aVar2 != null) {
                        aVar2.a("open", "adClick", ((r1) this.b).q());
                    }
                    if (!a3 || (aVar = this.f) == null) {
                        return;
                    }
                    aVar.a("open", "adLeftApplication", ((r1) this.b).q());
                    return;
                }
            } else if (str.equals("tpat")) {
                if (str2 != null && str2.length() != 0) {
                    Object obj = this.k.get(str2);
                    Boolean bool = Boolean.TRUE;
                    if (!epx.f(obj, bool) && epx.f(this.j.get(str2), bool)) {
                        com.vungle.ads.internal.util.t.a("NativeAdPresenter", "Ignore this already fired TPAT: " + str2);
                        return;
                    }
                    this.j.put(str2, bool);
                    int hashCode2 = str2.hashCode();
                    if (hashCode2 == -2125915830) {
                        if (str2.equals("checkpoint.0")) {
                            b = this.c.b(str2, ((com.vungle.ads.internal.platform.c) this.d).e(), String.valueOf(((com.vungle.ads.internal.platform.c) this.d).k()));
                        }
                        b = h0.a(this.c, str2, (String) null, 6);
                    } else if (hashCode2 == -747709511) {
                        if (str2.equals("video.length")) {
                            b = h0.a(this.c, str2, str3, 4);
                        }
                        b = h0.a(this.c, str2, (String) null, 6);
                    } else {
                        if (hashCode2 == 1082060480 && str2.equals("cta_url")) {
                            b = str3 != null ? Collections.singletonList(str3) : null;
                        }
                        b = h0.a(this.c, str2, (String) null, 6);
                    }
                    if (b != null && !b.isEmpty()) {
                        Iterator it = b.iterator();
                        while (it.hasNext()) {
                            b().a(new com.vungle.ads.internal.network.p((String) it.next()).b(str2).a(a()).a(), false);
                        }
                    } else {
                        new TpatError(Sdk.SDKError.Reason.INVALID_TPAT_KEY, y57.a("Empty urls for tpat: ", str2, " value=", str3)).setLogEntry$vungle_ads_release(a()).logErrorNoReturnValue$vungle_ads_release();
                    }
                    if (str2.equals("checkpoint.0")) {
                        AnalyticsClient.a(AnalyticsClient.INSTANCE, new m2(Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), a(), 4);
                        a aVar3 = this.f;
                        if (aVar3 != null) {
                            aVar3.a("adViewed", null, ((r1) this.b).q());
                            return;
                        }
                        return;
                    }
                    return;
                }
                new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key").setLogEntry$vungle_ads_release(a()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
        } else if (str.equals("openPrivacy")) {
            AnalyticsClient.a(AnalyticsClient.INSTANCE, new m2(Sdk.SDKMetric.SDKMetricType.PRIVACY_URL_OPENED), a(), 4);
            if (str3 != null) {
                if (com.vungle.ads.internal.util.n.a(str3)) {
                    a = com.vungle.ads.internal.util.l.a(null, str3, this.a, a(), null);
                    if (a) {
                        a aVar4 = this.f;
                        if (aVar4 != null) {
                            aVar4.a("open", "adLeftApplication", ((r1) this.b).q());
                            return;
                        }
                        return;
                    }
                    new PrivacyUrlError(str3).setLogEntry$vungle_ads_release(a()).logErrorNoReturnValue$vungle_ads_release();
                    return;
                }
                new PrivacyUrlError(str3).setLogEntry$vungle_ads_release(a()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            return;
        }
        com.vungle.ads.internal.util.t.c("NativeAdPresenter", "Unknown native ad action: ".concat(str));
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent != null) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("NativeAdPresenter", "user interaction on Native ad");
            this.o.a(motionEvent);
        }
    }

    public static final void a(w wVar, DialogInterface dialogInterface, int i) {
        String value;
        if (i == -2) {
            value = PrivacyConsent.OPT_OUT.getValue();
        } else if (i != -1) {
            value = "opted_out_by_timeout";
        } else {
            value = PrivacyConsent.OPT_IN.getValue();
        }
        PrivacyManager.INSTANCE.getClass();
        PrivacyManager.a(value, "vungle_modal", null);
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.k() && "unknown".equals(PrivacyManager.b())) {
            wVar.d();
        }
    }

    public static final void a(w wVar, DialogInterface dialogInterface) {
        wVar.h = null;
    }

    public final void a(View view, String str) {
        boolean C = this.c.C();
        if (str.length() <= 0 || !C) {
            return;
        }
        String a = ((com.vungle.ads.internal.omsdk.c) msy.a(LazyThreadSafetyMode.SYNCHRONIZED, new s(this.a)).getValue()).a();
        if (a != null) {
            com.vungle.ads.internal.omsdk.b bVar = new com.vungle.ads.internal.omsdk.b(str, a, ((r1) this.b).t());
            bVar.a(view);
            this.n = bVar;
        }
    }

    public final void a(int i, Map map) {
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("NativeAdPresenter", "onOMEvent: event=" + i + " value=" + map);
        Object obj = this.m.get(Integer.valueOf(i));
        Boolean bool = Boolean.TRUE;
        if (!epx.f(obj, bool) && epx.f(this.l.get(Integer.valueOf(i)), bool)) {
            com.vungle.ads.internal.util.t.a("NativeAdPresenter", "Ignore this already fired om event: " + i);
        }
        this.l.put(Integer.valueOf(i), bool);
        switch (i) {
            case 1:
                com.vungle.ads.internal.omsdk.b bVar = this.n;
                if (bVar != null) {
                    bVar.d();
                    break;
                }
                break;
            case 2:
                com.vungle.ads.internal.omsdk.b bVar2 = this.n;
                if (bVar2 != null) {
                    bVar2.c();
                    break;
                }
                break;
            case 3:
                com.vungle.ads.internal.omsdk.b bVar3 = this.n;
                if (bVar3 != null) {
                    bVar3.b();
                    break;
                }
                break;
            case 4:
                Object obj2 = map != null ? map.get("OM_KEY_DURATION") : null;
                Number number = obj2 instanceof Number ? (Number) obj2 : null;
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float floatValue = number != null ? number.floatValue() : 0.0f;
                Object obj3 = map != null ? map.get("OM_KEY_VOLUME") : null;
                Number number2 = obj3 instanceof Number ? (Number) obj3 : null;
                if (number2 != null) {
                    f = number2.floatValue();
                }
                com.vungle.ads.internal.omsdk.b bVar4 = this.n;
                if (bVar4 != null) {
                    bVar4.a(floatValue, f);
                    break;
                }
                break;
            case 5:
            case 6:
            case 7:
                com.vungle.ads.internal.omsdk.b bVar5 = this.n;
                if (bVar5 != null) {
                    bVar5.a(i);
                    break;
                }
                break;
            case 8:
                com.vungle.ads.internal.omsdk.b bVar6 = this.n;
                if (bVar6 != null) {
                    bVar6.e();
                    break;
                }
                break;
            case 9:
                com.vungle.ads.internal.omsdk.b bVar7 = this.n;
                if (bVar7 != null) {
                    bVar7.a(true);
                    break;
                }
                break;
            case 10:
                com.vungle.ads.internal.omsdk.b bVar8 = this.n;
                if (bVar8 != null) {
                    bVar8.a(false);
                    break;
                }
                break;
            case 11:
                com.vungle.ads.internal.omsdk.b bVar9 = this.n;
                if (bVar9 != null) {
                    bVar9.a();
                    break;
                }
                break;
        }
    }
}
