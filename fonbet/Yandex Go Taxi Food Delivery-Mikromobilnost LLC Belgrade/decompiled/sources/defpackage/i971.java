package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.c;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.internal.a;
import com.monetization.ads.base.webview.HtmlWebViewClientListener;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.experiments.Experiment;
import com.yandex.div.core.view2.Div2View;
import com.yandex.mobile.ads.common.analytics.AdAnalyticsStartupListener;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import yads.eq0;
import yads.f5;
import yads.f92;
import yads.fv1;
import yads.im2;
import yads.jk3;
import yads.t92;

/* loaded from: classes7.dex */
public final class i971 implements AdAnalyticsStartupListener, k771, cv81, zc81, bj81, ri81, ng61, fy81, h3v0, HtmlWebViewClientListener, nvb1, pui0, muy, wx60 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ i971(me0 me0Var) {
        this.a = 26;
        int i = 0;
        s491 s491Var = new s491(me0Var, i);
        id91 b = rb91.b(new a991(s491Var, i));
        int i2 = 1;
        id91 b2 = rb91.b(new s491(me0Var, i2));
        id91 b3 = rb91.b(new a991(s491Var, i2));
        id91 b4 = rb91.b(new cr71(b, b2, b3, rb91.b(new e591(s491Var, i2)), 17));
        id91 b5 = rb91.b(new e591(s491Var, i));
        this.b = rb91.b(new y491(rb91.b(new p891(8, b4, rb91.b(new cr71(s491Var, b5, b3, new y491(b5, i), 20)), b5)), i2));
    }

    public void A(fv1 fv1Var, String str) {
        E(unr0.p("notifyErrorEvent(", JSONObject.quote(fv1Var.b), Extension.FIX_SPACE, JSONObject.quote(str), Extension.C_BRAKE));
    }

    public void B(o671... o671VarArr) {
        if (o671VarArr.length == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("fireChangeEvent({");
        int length = o671VarArr.length;
        String str = "";
        int i = 0;
        while (i < length) {
            o671 o671Var = o671VarArr[i];
            sb.append(str);
            sb.append(o671Var.a());
            i++;
            str = Extension.FIX_SPACE;
        }
        sb.append("})");
        E(sb.toString());
    }

    public boolean C(Object obj) {
        ia71 ia71Var = (ia71) this.b;
        View d = ia71Var.d();
        return d != null && ia71Var.c(d, obj);
    }

    public void D(Object obj) {
        ia71 ia71Var = (ia71) this.b;
        View d = ia71Var.d();
        if (d == null) {
            return;
        }
        ia71Var.e(d, obj);
        d.setVisibility(0);
    }

    public void E(String str) {
        ((t92) this.b).loadUrl("javascript: ".concat(String.format("window.mraidbridge.%s", Arrays.copyOf(new Object[]{str}, 1))));
    }

    @Override // defpackage.ri81
    public Map a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 4:
                fe81 fe81Var = (fe81) obj;
                String str = fe81Var.c.a;
                if (str == null || evu0.J(str)) {
                    str = StringUtils.UNDEFINED;
                }
                return b.i(new Pair("ad_unit_id", str), new Pair("ad_type", fe81Var.a.b));
            default:
                hn71 hn71Var = ((k781) obj).x;
                List list = hn71Var != null ? (List) hn71Var.b : null;
                if (list == null) {
                    list = EmptyList.a;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : list) {
                    String str2 = ((tz61) obj2).a;
                    Object obj3 = linkedHashMap.get(str2);
                    if (obj3 == null) {
                        obj3 = qv10.w(str2, linkedHashMap);
                    }
                    ((List) obj3).add(obj2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    Iterable iterable = (Iterable) entry.getValue();
                    ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((tz61) it.next()).b);
                    }
                    linkedHashMap2.put(key, arrayList);
                }
                return linkedHashMap2;
        }
    }

    @Override // defpackage.pui0
    public /* synthetic */ void accept(Object obj, Object obj2) {
        ((a) obj).t((PaymentDataRequest) this.b, (atx0) obj2);
    }

    @Override // defpackage.k771
    public zj71 b(km81 km81Var, int i, Object obj, jk3 jk3Var) {
        j671 j671Var = km81Var != null ? (j671) km81Var.a : null;
        return new zj71("vast_wrapper_response", new LinkedHashMap(b.n(((i971) this.b).a(), gw00.e(new Pair(ACSPConstants.STATUS, (204 == i ? im2.e : (j671Var == null || i != 200) ? im2.d : j671Var.a.b.isEmpty() ? im2.e : im2.c).b)))), (no61) null);
    }

    @Override // defpackage.cv81
    public void c() {
        l781 l781Var = (l781) this.b;
        if (l781Var != null) {
            l781Var.a.a.remove(l781Var);
            l781Var.b = null;
        }
    }

    @Override // defpackage.ng61
    public of81 d(long j) {
        return (of81) this.b;
    }

    @Override // defpackage.muy
    public /* synthetic */ void e(Object obj) {
        ((LocationCallback) obj).onLocationResult((LocationResult) this.b);
    }

    @Override // defpackage.zc81
    public Object f(XmlPullParser xmlPullParser, zy2 zy2Var) {
        Object obj = null;
        xmlPullParser.require(2, null, "CreativeExtension");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                obj = ((i291) this.b).f(xmlPullParser, zy2Var);
            }
        }
        return obj;
    }

    @Override // defpackage.h3v0
    public Task g(Object obj) {
        zm2 zm2Var = c.k;
        AtomicReference atomicReference = (AtomicReference) this.b;
        return atomicReference.get() != null ? udq0.p((ModuleInstallResponse) atomicReference.get()) : udq0.o(new ApiException(Status.RESULT_INTERNAL_ERROR));
    }

    @Override // defpackage.fy81
    public void h() {
        e eVar = (e) this.b;
        Iterator it = eVar.y.values().iterator();
        while (it.hasNext()) {
            ((om2) it.next()).disconnect();
        }
        eVar.F.I = Collections.EMPTY_SET;
    }

    @Override // defpackage.fy81
    public void i() {
        e eVar = (e) this.b;
        eVar.a.lock();
        try {
            eVar.D = new yx81(eVar, eVar.A, eVar.B, eVar.w, eVar.C, eVar.a, eVar.c);
            eVar.D.h();
            eVar.b.signalAll();
        } finally {
            eVar.a.unlock();
        }
    }

    @Override // defpackage.fy81
    public void j(int i) {
    }

    @Override // defpackage.ng61
    public long k(long j) {
        return 1L;
    }

    @Override // defpackage.fy81
    public boolean l() {
        return true;
    }

    @Override // defpackage.ng61
    public long m(long j, long j2) {
        return j2;
    }

    @Override // defpackage.ng61
    public long n(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.ng61
    public long o(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.wx60
    public void onComplete(Task task) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // com.monetization.ads.base.webview.HtmlWebViewClientListener
    public void onOverrideUrlLoading(Context context, String str) {
        ((tj61) this.b).a.onOverrideUrlLoading(context, str);
    }

    @Override // com.monetization.ads.base.webview.HtmlWebViewClientListener
    public void onPageFinished() {
        ((tj61) this.b).a.onPageFinished();
    }

    @Override // com.monetization.ads.base.webview.HtmlWebViewClientListener
    public void onReceivedError(int i) {
        ((tj61) this.b).a.onReceivedError(i);
    }

    @Override // defpackage.fy81
    public com.google.android.gms.common.api.internal.a p(com.google.android.gms.common.api.internal.a aVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // defpackage.ng61
    public long q(long j, long j2) {
        return 1L;
    }

    @Override // defpackage.fy81
    public void r(Bundle bundle) {
    }

    @Override // defpackage.fy81
    public void s(ConnectionResult connectionResult, zm2 zm2Var, boolean z) {
    }

    @Override // defpackage.nvb1
    public o3 t() {
        ekb1 ekb1Var = new ekb1();
        zzra zzraVar = e891.d() ? zzra.TYPE_THICK : zzra.TYPE_THIN;
        zzrb zzrbVar = (zzrb) this.b;
        ekb1Var.c = zzraVar;
        emb1 emb1Var = new emb1();
        emb1Var.a = zzrbVar;
        ekb1Var.e = new kmb1(emb1Var);
        return new o3(ekb1Var, 0);
    }

    @Override // defpackage.bj81
    public void u() {
        e971 e971Var = (e971) this.b;
        e971Var.a(f5.s);
        e971Var.b(f5.t, null);
    }

    @Override // defpackage.cv81
    public void v(ViewGroup viewGroup) {
        l781 l781Var = (l781) this.b;
        if (l781Var != null) {
            l781Var.a.a.add(l781Var);
        }
    }

    public Div2View w(Context context, dc81 dc81Var) {
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a = a081Var2.a(context);
        if (a != null) {
            ty61 ty61Var = a.J0;
            r3 = Boolean.valueOf((ty61Var != null ? ty61Var.a : null) != null);
        }
        Div2View div2View = new Div2View(new Div2Context(new ContextThemeWrapper(context, m0i0.Div), new ujk(new ntk(context), (gul) this.b, new com.yandex.div.state.a(), new ArrayList(), plk.a, u4l.a, kl40.x, new ArrayList(), ynk.P1, jl40.l(r3, Boolean.TRUE) ? new mml(context) : new rs81(context), new HashMap(), new yt31(), new com.yandex.div.core.expression.variables.a(), Experiment.TAP_BEACONS_ENABLED.getDefaultValue(), Experiment.VISIBILITY_BEACONS_ENABLED.getDefaultValue(), Experiment.SWIPE_OUT_BEACONS_ENABLED.getDefaultValue(), Experiment.LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED.getDefaultValue(), Experiment.IGNORE_ACTION_MENU_ITEMS_ENABLED.getDefaultValue(), Experiment.VISUAL_ERRORS_ENABLED.getDefaultValue(), Experiment.HYPHENATION_SUPPORT_ENABLED.getDefaultValue(), Experiment.ACCESSIBILITY_ENABLED.getDefaultValue(), Experiment.VIEW_POOL_ENABLED.getDefaultValue(), Experiment.VIEW_POOL_PROFILING_ENABLED.getDefaultValue(), Experiment.VIEW_POOL_OPTIMIZATION_DEBUG.getDefaultValue(), Experiment.RESOURCE_CACHE_ENABLED.getDefaultValue(), Experiment.MULTIPLE_STATE_CHANGE_ENABLED.getDefaultValue(), false, Experiment.COMPLEX_REBIND_ENABLED.getDefaultValue(), Experiment.PAGER_PAGE_CLIP_ENABLED.getDefaultValue(), Experiment.PERMANENT_DEBUG_PANEL_ENABLED.getDefaultValue(), Experiment.RENDER_EFFECT_ENABLED.getDefaultValue()), 0, null, 4, null), null, 0, 6, null);
        div2View.setTag("");
        ld71 ld71Var = dc81Var.b;
        div2View.setData(ld71Var.e, ld71Var.f);
        int i = context.getResources().getConfiguration().orientation;
        f92 f92Var = i != 1 ? i != 2 ? f92.e : f92.c : f92.d;
        div2View.setVariable("orientation", f92Var == f92.e ? "PORTRAIT".toLowerCase(Locale.ROOT) : f92Var.name().toLowerCase(Locale.ROOT));
        return div2View;
    }

    public yw71 x(CustomizableMediaView customizableMediaView, v881 v881Var, j981 j981Var) {
        ImageView imageView = new ImageView(customizableMediaView.getContext());
        if (!b9a1.a(customizableMediaView.getContext(), eq0.e)) {
            customizableMediaView.removeAllViews();
        }
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        customizableMediaView.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        return new yw71(customizableMediaView, new v871(imageView, v881Var, (d881) this.b), j981Var);
    }

    public void y() {
        ia71 ia71Var = (ia71) this.b;
        View d = ia71Var.d();
        if (d == null) {
            return;
        }
        ia71Var.a(d);
    }

    public void z(uy71 uy71Var, pj71 pj71Var, Object obj) {
        ia71 ia71Var = (ia71) this.b;
        if (ia71Var.d() == null) {
            return;
        }
        ia71Var.b(uy71Var, pj71Var, obj);
    }

    @Override // defpackage.ng61
    public long c(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.ng61
    public long b() {
        return 0L;
    }

    public /* synthetic */ i971(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public i971(rr41 rr41Var, dv81 dv81Var) {
        this.a = 8;
        s781 s781Var = (s781) rr41Var.b;
        this.b = s781Var != null ? new l781(s781Var, dv81Var) : null;
    }

    @Override // defpackage.k771
    public zj71 a(Object obj) {
        return new zj71("vast_wrapper_request", new LinkedHashMap(((i971) this.b).a()), (no61) null);
    }

    @Override // defpackage.ng61
    public long a(long j) {
        return 0L;
    }

    @Override // defpackage.ng61
    /* renamed from: a, reason: collision with other method in class */
    public boolean mo485a() {
        return true;
    }
}
