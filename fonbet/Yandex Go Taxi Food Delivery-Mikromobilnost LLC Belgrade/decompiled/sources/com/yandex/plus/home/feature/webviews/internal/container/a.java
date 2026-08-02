package com.yandex.plus.home.feature.webviews.internal.container;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.plus.core.config.Environment;
import com.yandex.plus.core.debug.panel.api.data.DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey;
import com.yandex.plus.core.debug.panel.internal.presentation.controller.DebugPanelViewControllerImpl;
import com.yandex.plus.home.api.lifecycle.ActivityLifecycle;
import com.yandex.plus.home.feature.webviews.internal.container.factory.b;
import com.yandex.plus.home.feature.webviews.internal.d;
import com.yandex.plus.home.feature.webviews.internal.home.PlusHomeWebView;
import com.yandex.plus.home.feature.webviews.internal.simple.SimpleWebViewLayout;
import com.yandex.plus.home.feature.webviews.internal.smart.PlusSmartWebView;
import com.yandex.plus.home.feature.webviews.internal.stories.list.WebStoriesContainer;
import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$ModalHeightType;
import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$WebViewFormat;
import com.yandex.plus.home.feature.webviews.internal.uri.c;
import com.yandex.plus.log.api.LogPriority;
import defpackage.a3d0;
import defpackage.a5u0;
import defpackage.abe;
import defpackage.apf;
import defpackage.aq41;
import defpackage.b64;
import defpackage.bb1;
import defpackage.bvf0;
import defpackage.bxs;
import defpackage.bzd0;
import defpackage.c60;
import defpackage.cjw0;
import defpackage.cxs;
import defpackage.dje;
import defpackage.dtt;
import defpackage.dwg;
import defpackage.e3n;
import defpackage.eje;
import defpackage.el11;
import defpackage.emh0;
import defpackage.f89;
import defpackage.gje;
import defpackage.gym;
import defpackage.h8;
import defpackage.hds0;
import defpackage.hs6;
import defpackage.hsd0;
import defpackage.hwg;
import defpackage.i0h;
import defpackage.ifs0;
import defpackage.ik0;
import defpackage.ike;
import defpackage.iy20;
import defpackage.j2n;
import defpackage.j4n;
import defpackage.jl40;
import defpackage.jln;
import defpackage.jse;
import defpackage.k450;
import defpackage.kqd0;
import defpackage.lld0;
import defpackage.mum;
import defpackage.n751;
import defpackage.nvg0;
import defpackage.ny61;
import defpackage.o0h;
import defpackage.o501;
import defpackage.op31;
import defpackage.opu;
import defpackage.ow31;
import defpackage.ozg;
import defpackage.p130;
import defpackage.pgz;
import defpackage.q130;
import defpackage.q230;
import defpackage.qv10;
import defpackage.qvg;
import defpackage.qzg;
import defpackage.r130;
import defpackage.rkd0;
import defpackage.rr41;
import defpackage.rzg;
import defpackage.rzs0;
import defpackage.scc;
import defpackage.sgs;
import defpackage.sls;
import defpackage.szg;
import defpackage.szs0;
import defpackage.t23;
import defpackage.t2h;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tv41;
import defpackage.u1w;
import defpackage.ul60;
import defpackage.unr0;
import defpackage.uu60;
import defpackage.uv41;
import defpackage.uzs0;
import defpackage.v8e;
import defpackage.v920;
import defpackage.v9h0;
import defpackage.vg;
import defpackage.vk41;
import defpackage.vv41;
import defpackage.vvq0;
import defpackage.w511;
import defpackage.wio;
import defpackage.wk41;
import defpackage.wv41;
import defpackage.xkf;
import defpackage.y2d0;
import defpackage.y4a0;
import defpackage.y4u0;
import defpackage.ycc;
import defpackage.yld0;
import defpackage.ys31;
import defpackage.z2d0;
import defpackage.zsz0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes2.dex */
public final class a implements b {
    public final Environment A;
    public final sls B;
    public final sls C;
    public final sls D;
    public final sls E;
    public final sls F;
    public final sls G;
    public final sls H;
    public final sls I;
    public ike K;
    public final FrameLayout M;
    public final View N;
    public final rr41 O;
    public PlusHomeWebView P;
    public final Context a;
    public final ActivityLifecycle b;
    public final y2d0 c;
    public final com.yandex.plus.home.feature.webviews.internal.container.factory.a d;
    public final com.yandex.plus.home.feature.webviews.internal.container.factory.b e;
    public final ik0 f;
    public final rzs0 g;
    public final j4n h;
    public final v920 i;
    public final c j;
    public final Integer k;
    public final com.yandex.plus.home.payment.google.a l;
    public final o501 m;
    public final c60 n;
    public final int o;
    public final int p;
    public final kqd0 q;
    public final abe r;
    public final o0h s;
    public final t2h t;
    public final k450 u;
    public final ys31 v;
    public final pgz w;
    public final sls x;
    public final sls y;
    public final sls z;
    public final n0 J = com.yandex.plus.home.common.utils.c.a();
    public final r0 L = bvf0.c(null);

    public a(Context context, ActivityLifecycle activityLifecycle, y2d0 y2d0Var, com.yandex.plus.home.feature.webviews.internal.container.factory.a aVar, com.yandex.plus.home.feature.webviews.internal.container.factory.b bVar, ik0 ik0Var, rzs0 rzs0Var, j4n j4nVar, v920 v920Var, c cVar, Integer num, com.yandex.plus.home.payment.google.a aVar2, o501 o501Var, c60 c60Var, int i, int i2, kqd0 kqd0Var, abe abeVar, o0h o0hVar, t2h t2hVar, k450 k450Var, ys31 ys31Var, rkd0 rkd0Var, sls slsVar, sls slsVar2, sls slsVar3, Environment environment, wv41 wv41Var, wv41 wv41Var2, wv41 wv41Var3, wv41 wv41Var4, wv41 wv41Var5, wv41 wv41Var6, wv41 wv41Var7, wv41 wv41Var8, final jse jseVar) {
        this.a = context;
        this.b = activityLifecycle;
        this.c = y2d0Var;
        this.d = aVar;
        this.e = bVar;
        this.f = ik0Var;
        this.g = rzs0Var;
        this.h = j4nVar;
        this.i = v920Var;
        this.j = cVar;
        this.k = num;
        this.l = aVar2;
        this.m = o501Var;
        this.n = c60Var;
        this.o = i;
        this.p = i2;
        this.q = kqd0Var;
        this.r = abeVar;
        this.s = o0hVar;
        this.t = t2hVar;
        this.u = k450Var;
        this.v = ys31Var;
        this.w = rkd0Var;
        this.x = slsVar;
        this.y = slsVar2;
        this.z = slsVar3;
        this.A = environment;
        this.B = wv41Var;
        this.C = wv41Var2;
        this.D = wv41Var3;
        this.E = wv41Var4;
        this.F = wv41Var5;
        this.G = wv41Var6;
        this.H = wv41Var7;
        this.I = wv41Var8;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.plus.home.feature.webviews.internal.container.WebViewsControllerImpl$webViewsContainer$1$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                a.this.K = qv10.e(jseVar);
                final a aVar3 = a.this;
                FrameLayout frameLayout2 = aVar3.M;
                if (!frameLayout2.isLaidOut() || frameLayout2.isLayoutRequested()) {
                    frameLayout2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.webviews.internal.container.WebViewsControllerImpl$setupWebViewInsets$$inlined$doOnLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                            view.removeOnLayoutChangeListener(this);
                            if (!a.c(a.this, view)) {
                                r0 r0Var = a.this.L;
                                r0Var.getClass();
                                r0Var.m(null, u1w.e);
                                return;
                            }
                            t23 t23Var = new t23();
                            uv41 uv41Var = new uv41(a.this);
                            t23.a aVar4 = new t23.a();
                            aVar4.c();
                            aVar4.b();
                            t23Var.a.put(uv41Var, aVar4);
                            t23Var.a(view);
                        }
                    });
                } else if (a.c(aVar3, frameLayout2)) {
                    t23 t23Var = new t23();
                    uv41 uv41Var = new uv41(aVar3);
                    t23.a aVar4 = new t23.a();
                    aVar4.c();
                    aVar4.b();
                    t23Var.a.put(uv41Var, aVar4);
                    t23Var.a(frameLayout2);
                } else {
                    r0 r0Var = aVar3.L;
                    r0Var.getClass();
                    r0Var.m(null, u1w.e);
                }
                a aVar5 = a.this;
                ys31 ys31Var2 = aVar5.v;
                FrameLayout frameLayout3 = aVar5.M;
                a5u0 a5u0Var = new a5u0(e3n.e(ys31Var2.a), ys31Var2.b, ys31Var2.c, frameLayout3, new el11(23, aVar5));
                a5u0Var.a(y4u0.a);
                ys31Var2.d.put(frameLayout3, a5u0Var);
                a aVar6 = a.this;
                View view = aVar6.N;
                bb1.L(view.findViewById(v9h0.plus_sdk_btn_debug_panel), new aq41(2, aVar6));
                if (aVar6.A == Environment.TESTING) {
                    view.setVisibility(0);
                    aVar6.M.addView(view);
                } else {
                    ike ikeVar = aVar6.K;
                    if (ikeVar != null) {
                        tje.N(ikeVar, null, null, new WebViewsControllerImpl$setupNativeDebugPanelButton$2(aVar6, null), 3);
                    }
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                a aVar3 = a.this;
                ys31 ys31Var2 = aVar3.v;
                a5u0 a5u0Var = (a5u0) ys31Var2.d.remove(aVar3.M);
                if (a5u0Var != null) {
                    a5u0Var.f = true;
                }
                ike ikeVar = a.this.K;
                if (ikeVar != null) {
                    bvf0.j(ikeVar, null);
                }
                a.this.K = null;
            }
        });
        this.M = frameLayout;
        this.N = LayoutInflater.from(context).inflate(emh0.plus_sdk_button_debug_panel, (ViewGroup) frameLayout, false);
        if (y2d0Var instanceof y2d0) {
            this.O = new rr41(Deeplink$WebViewFormat.CARD);
        } else {
            w511.b();
            throw null;
        }
    }

    public static final boolean c(a aVar, View view) {
        aVar.getClass();
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        n751 a = op31.a(view);
        if (a == null) {
            return false;
        }
        u1w g = a.a.g(519);
        boolean z = (view.getHeight() > (view.getRootView().getHeight() - g.b) - g.d) || (view.getWidth() > (view.getRootView().getWidth() - g.a) - g.c);
        pgz pgzVar = aVar.w;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebViewsControllerImpl", "PlusWebViewContainer: isOverlappedBySystemElements=" + z);
        }
        return z;
    }

    public static final void d(a aVar) {
        ycc.A((LinkedList) aVar.O.c);
        FrameLayout frameLayout = aVar.M;
        int childCount = frameLayout.getChildCount();
        int j = aVar.j();
        if (childCount <= j) {
            aVar.P = null;
            aVar.J.g(a3d0.b);
            return;
        }
        frameLayout.removeViewAt(childCount - j);
        KeyEvent.Callback childAt = frameLayout.getChildAt(frameLayout.getChildCount() - aVar.j());
        dje djeVar = childAt instanceof dje ? (dje) childAt : null;
        if (djeVar != null) {
            djeVar.onHasStoppedBeingOverlapped();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.yandex.plus.home.feature.webviews.internal.container.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [eje] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(a aVar, ozg ozgVar, String str, String str2, Map map, u1w u1wVar, q230 q230Var, dtt dttVar, ContinuationImpl continuationImpl) {
        WebViewsControllerImpl$openPlusHomeWebView$1 webViewsControllerImpl$openPlusHomeWebView$1;
        int i;
        String str3;
        boolean z;
        iy20 iy20Var;
        Deeplink$WebViewFormat deeplink$WebViewFormat;
        String str4;
        sgs sgsVar;
        boolean z2;
        int i2;
        u1w u1wVar2;
        com.yandex.plus.home.feature.webviews.internal.container.factory.a aVar2;
        Map map2;
        aVar.getClass();
        if (continuationImpl instanceof WebViewsControllerImpl$openPlusHomeWebView$1) {
            webViewsControllerImpl$openPlusHomeWebView$1 = (WebViewsControllerImpl$openPlusHomeWebView$1) continuationImpl;
            int i3 = webViewsControllerImpl$openPlusHomeWebView$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                webViewsControllerImpl$openPlusHomeWebView$1.label = i3 - Integer.MIN_VALUE;
                Object obj = webViewsControllerImpl$openPlusHomeWebView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewsControllerImpl$openPlusHomeWebView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(aVar.c instanceof y2d0)) {
                        w511.b();
                        return null;
                    }
                    Deeplink$WebViewFormat q = aVar.O.q(null);
                    iy20 v = aVar.v(q, (int) aVar.a.getResources().getDimension(nvg0.plus_sdk_mu_4), q230Var);
                    sgs k = aVar.r.k(u1wVar, q, false);
                    boolean booleanValue = ((Boolean) aVar.B.invoke()).booleanValue();
                    boolean booleanValue2 = ((Boolean) aVar.F.invoke()).booleanValue();
                    str3 = str;
                    com.yandex.plus.home.feature.webviews.internal.uri.a a = aVar.s.a(booleanValue, str3, str2, map, k, dttVar);
                    com.yandex.plus.home.feature.webviews.internal.container.factory.a aVar3 = aVar.d;
                    webViewsControllerImpl$openPlusHomeWebView$1.L$0 = null;
                    webViewsControllerImpl$openPlusHomeWebView$1.L$1 = str3;
                    webViewsControllerImpl$openPlusHomeWebView$1.L$2 = str2;
                    webViewsControllerImpl$openPlusHomeWebView$1.L$3 = map;
                    webViewsControllerImpl$openPlusHomeWebView$1.L$4 = u1wVar;
                    webViewsControllerImpl$openPlusHomeWebView$1.L$5 = null;
                    webViewsControllerImpl$openPlusHomeWebView$1.L$6 = null;
                    webViewsControllerImpl$openPlusHomeWebView$1.L$7 = q;
                    webViewsControllerImpl$openPlusHomeWebView$1.L$8 = v;
                    webViewsControllerImpl$openPlusHomeWebView$1.L$9 = k;
                    webViewsControllerImpl$openPlusHomeWebView$1.L$10 = null;
                    webViewsControllerImpl$openPlusHomeWebView$1.L$11 = aVar3;
                    webViewsControllerImpl$openPlusHomeWebView$1.I$0 = 0;
                    webViewsControllerImpl$openPlusHomeWebView$1.Z$0 = booleanValue;
                    webViewsControllerImpl$openPlusHomeWebView$1.Z$1 = booleanValue2;
                    webViewsControllerImpl$openPlusHomeWebView$1.label = 1;
                    Object a2 = a.a(ozgVar, webViewsControllerImpl$openPlusHomeWebView$1);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z = booleanValue2;
                    obj = a2;
                    iy20Var = v;
                    deeplink$WebViewFormat = q;
                    str4 = str2;
                    sgsVar = k;
                    z2 = booleanValue;
                    i2 = 0;
                    u1wVar2 = u1wVar;
                    aVar2 = aVar3;
                    map2 = map;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = webViewsControllerImpl$openPlusHomeWebView$1.Z$1;
                    z2 = webViewsControllerImpl$openPlusHomeWebView$1.Z$0;
                    i2 = webViewsControllerImpl$openPlusHomeWebView$1.I$0;
                    com.yandex.plus.home.feature.webviews.internal.container.factory.a aVar4 = (com.yandex.plus.home.feature.webviews.internal.container.factory.a) webViewsControllerImpl$openPlusHomeWebView$1.L$11;
                    sgs sgsVar2 = (sgs) webViewsControllerImpl$openPlusHomeWebView$1.L$9;
                    ?? r9 = (eje) webViewsControllerImpl$openPlusHomeWebView$1.L$8;
                    Deeplink$WebViewFormat deeplink$WebViewFormat2 = (Deeplink$WebViewFormat) webViewsControllerImpl$openPlusHomeWebView$1.L$7;
                    u1w u1wVar3 = (u1w) webViewsControllerImpl$openPlusHomeWebView$1.L$4;
                    Map map3 = (Map) webViewsControllerImpl$openPlusHomeWebView$1.L$3;
                    String str5 = (String) webViewsControllerImpl$openPlusHomeWebView$1.L$2;
                    str3 = (String) webViewsControllerImpl$openPlusHomeWebView$1.L$1;
                    kotlin.b.b(obj);
                    z = z3;
                    aVar2 = aVar4;
                    sgsVar = sgsVar2;
                    u1wVar2 = u1wVar3;
                    map2 = map3;
                    iy20Var = r9;
                    deeplink$WebViewFormat = deeplink$WebViewFormat2;
                    str4 = str5;
                }
                PlusHomeWebView a3 = aVar2.a(z2, z, (ozg) obj, sgsVar, new jln(9, aVar.J), str3, map2, u1wVar2, deeplink$WebViewFormat, str4, i2 == 0, aVar);
                aVar.P = a3;
                aVar.u(iy20Var, a3);
                return zy11.a;
            }
        }
        webViewsControllerImpl$openPlusHomeWebView$1 = new WebViewsControllerImpl$openPlusHomeWebView$1(aVar, continuationImpl);
        Object obj2 = webViewsControllerImpl$openPlusHomeWebView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewsControllerImpl$openPlusHomeWebView$1.label;
        if (i != 0) {
        }
        PlusHomeWebView a32 = aVar2.a(z2, z, (ozg) obj2, sgsVar, new jln(9, aVar.J), str3, map2, u1wVar2, deeplink$WebViewFormat, str4, i2 == 0, aVar);
        aVar.P = a32;
        aVar.u(iy20Var, a32);
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0134, code lost:
    
        if (r1 == r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(a aVar, qzg qzgVar, String str, String str2, Map map, u1w u1wVar, dtt dttVar, q230 q230Var, boolean z, ContinuationImpl continuationImpl) {
        WebViewsControllerImpl$openSimpleWebView$1 webViewsControllerImpl$openSimpleWebView$1;
        int i;
        Deeplink$WebViewFormat q;
        eje v;
        boolean z2;
        i0h i0hVar;
        u1w u1wVar2;
        boolean z3;
        String str3;
        aVar.getClass();
        if (continuationImpl instanceof WebViewsControllerImpl$openSimpleWebView$1) {
            webViewsControllerImpl$openSimpleWebView$1 = (WebViewsControllerImpl$openSimpleWebView$1) continuationImpl;
            int i2 = webViewsControllerImpl$openSimpleWebView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewsControllerImpl$openSimpleWebView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webViewsControllerImpl$openSimpleWebView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewsControllerImpl$openSimpleWebView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    q = aVar.O.q(qzgVar.c);
                    v = aVar.v(q, (int) aVar.a.getResources().getDimension(nvg0.plus_sdk_mu_2), q230Var);
                    boolean booleanValue = ((Boolean) aVar.E.invoke()).booleanValue();
                    com.yandex.plus.home.feature.webviews.internal.uri.a a = aVar.s.a(booleanValue, str, str2, map, new sgs(0, 0, 0, 0), dttVar);
                    webViewsControllerImpl$openSimpleWebView$1.L$0 = null;
                    webViewsControllerImpl$openSimpleWebView$1.L$1 = str;
                    webViewsControllerImpl$openSimpleWebView$1.L$2 = null;
                    webViewsControllerImpl$openSimpleWebView$1.L$3 = null;
                    webViewsControllerImpl$openSimpleWebView$1.L$4 = u1wVar;
                    webViewsControllerImpl$openSimpleWebView$1.L$5 = null;
                    webViewsControllerImpl$openSimpleWebView$1.L$6 = null;
                    webViewsControllerImpl$openSimpleWebView$1.L$7 = q;
                    webViewsControllerImpl$openSimpleWebView$1.L$8 = v;
                    webViewsControllerImpl$openSimpleWebView$1.L$9 = a;
                    z2 = z;
                    webViewsControllerImpl$openSimpleWebView$1.Z$0 = z2;
                    webViewsControllerImpl$openSimpleWebView$1.Z$1 = booleanValue;
                    webViewsControllerImpl$openSimpleWebView$1.label = 1;
                    Object d = a.d(qzgVar, webViewsControllerImpl$openSimpleWebView$1);
                    if (d != coroutineSingletons) {
                        i0hVar = a;
                        u1wVar2 = u1wVar;
                        z3 = booleanValue;
                        str3 = str;
                        obj = d;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    aVar.o(Uri.parse((String) obj));
                    return zy11.a;
                }
                boolean z4 = webViewsControllerImpl$openSimpleWebView$1.Z$1;
                boolean z5 = webViewsControllerImpl$openSimpleWebView$1.Z$0;
                i0hVar = (i0h) webViewsControllerImpl$openSimpleWebView$1.L$9;
                v = (eje) webViewsControllerImpl$openSimpleWebView$1.L$8;
                q = (Deeplink$WebViewFormat) webViewsControllerImpl$openSimpleWebView$1.L$7;
                u1w u1wVar3 = (u1w) webViewsControllerImpl$openSimpleWebView$1.L$4;
                String str4 = (String) webViewsControllerImpl$openSimpleWebView$1.L$1;
                kotlin.b.b(obj);
                z3 = z4;
                u1wVar2 = u1wVar3;
                str3 = str4;
                z2 = z5;
                eje ejeVar = v;
                Deeplink$WebViewFormat deeplink$WebViewFormat = q;
                qzg qzgVar2 = (qzg) obj;
                if (z2) {
                    ik0 ik0Var = aVar.f;
                    opu opuVar = new opu((z2d0) ik0Var.n, (lld0) ik0Var.h);
                    i0h i0hVar2 = i0hVar;
                    boolean z6 = z3;
                    String str5 = str3;
                    aVar.u(ejeVar, new SimpleWebViewLayout((Context) ik0Var.a, new com.yandex.plus.home.feature.webviews.internal.simple.a(qzgVar2, str5, (bzd0) ik0Var.i, z6, (c) ik0Var.c, aVar, (v920) ik0Var.b, i0hVar2, (jse) ik0Var.k, (wio) ik0Var.f, new y4a0((sls) ik0Var.g), (hsd0) ik0Var.j, (uu60) ik0Var.l, (ul60) ik0Var.m), (vg) ik0Var.e, (lld0) ik0Var.h, new zsz0(qzgVar2.d, qzgVar2.e, qzgVar2.f, qzgVar2.g), null, opuVar, (ow31) ik0Var.o, new ifs0(z6, e3n.e(((bzd0) ik0Var.i).b), str3, (wio) ik0Var.f, (hsd0) ik0Var.j, (c) ik0Var.d, (pgz) ik0Var.p, (jse) ik0Var.k), aVar, deeplink$WebViewFormat, u1wVar2));
                    return zy11.a;
                }
                c cVar = aVar.j;
                webViewsControllerImpl$openSimpleWebView$1.L$0 = null;
                webViewsControllerImpl$openSimpleWebView$1.L$1 = null;
                webViewsControllerImpl$openSimpleWebView$1.L$2 = null;
                webViewsControllerImpl$openSimpleWebView$1.L$3 = null;
                webViewsControllerImpl$openSimpleWebView$1.L$4 = null;
                webViewsControllerImpl$openSimpleWebView$1.L$5 = null;
                webViewsControllerImpl$openSimpleWebView$1.L$6 = null;
                webViewsControllerImpl$openSimpleWebView$1.L$7 = null;
                webViewsControllerImpl$openSimpleWebView$1.L$8 = null;
                webViewsControllerImpl$openSimpleWebView$1.L$9 = null;
                webViewsControllerImpl$openSimpleWebView$1.L$10 = null;
                webViewsControllerImpl$openSimpleWebView$1.Z$0 = z2;
                webViewsControllerImpl$openSimpleWebView$1.Z$1 = z3;
                webViewsControllerImpl$openSimpleWebView$1.label = 2;
                obj = cVar.b(qzgVar2, webViewsControllerImpl$openSimpleWebView$1);
            }
        }
        webViewsControllerImpl$openSimpleWebView$1 = new WebViewsControllerImpl$openSimpleWebView$1(aVar, continuationImpl);
        Object obj2 = webViewsControllerImpl$openSimpleWebView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewsControllerImpl$openSimpleWebView$1.label;
        if (i != 0) {
        }
        eje ejeVar2 = v;
        Deeplink$WebViewFormat deeplink$WebViewFormat2 = q;
        qzg qzgVar22 = (qzg) obj2;
        if (z2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(a aVar, rzg rzgVar, String str, String str2, Map map, u1w u1wVar, dtt dttVar, ContinuationImpl continuationImpl) {
        WebViewsControllerImpl$openSmartWebView$1 webViewsControllerImpl$openSmartWebView$1;
        int i;
        r130 r130Var;
        u1w u1wVar2;
        Deeplink$WebViewFormat deeplink$WebViewFormat;
        eje ejeVar;
        boolean z;
        sgs sgsVar;
        zsz0 zsz0Var;
        String str3;
        boolean z2;
        rzs0 rzs0Var;
        r130 q130Var;
        aVar.getClass();
        if (continuationImpl instanceof WebViewsControllerImpl$openSmartWebView$1) {
            webViewsControllerImpl$openSmartWebView$1 = (WebViewsControllerImpl$openSmartWebView$1) continuationImpl;
            int i2 = webViewsControllerImpl$openSmartWebView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewsControllerImpl$openSmartWebView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webViewsControllerImpl$openSmartWebView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewsControllerImpl$openSmartWebView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rr41 rr41Var = aVar.O;
                    Deeplink$WebViewFormat deeplink$WebViewFormat2 = rzgVar.b;
                    Integer num = rzgVar.d;
                    Deeplink$WebViewFormat q = rr41Var.q(deeplink$WebViewFormat2);
                    int dimension = (int) aVar.a.getResources().getDimension(nvg0.plus_sdk_mu_4);
                    int i3 = aVar.o;
                    int i4 = aVar.p;
                    Deeplink$ModalHeightType deeplink$ModalHeightType = rzgVar.c;
                    int i5 = deeplink$ModalHeightType == null ? -1 : tv41.c[deeplink$ModalHeightType.ordinal()];
                    if (i5 == -1) {
                        r130Var = null;
                    } else if (i5 == 1) {
                        if (num != null) {
                            q130Var = new q130(num.intValue());
                            r130Var = q130Var;
                        }
                        q130Var = null;
                        r130Var = q130Var;
                    } else {
                        if (i5 != 2) {
                            w511.b();
                            return null;
                        }
                        if (num != null) {
                            q130Var = new p130(num.intValue());
                            r130Var = q130Var;
                        }
                        q130Var = null;
                        r130Var = q130Var;
                    }
                    iy20 v = aVar.v(q, dimension, new q230(i3, i4, r130Var, rzgVar.f, rzgVar.g));
                    zsz0 zsz0Var2 = new zsz0(rzgVar.h, rzgVar.i, rzgVar.j, rzgVar.k);
                    sgs k = aVar.r.k(u1wVar, q, zsz0Var2.a);
                    boolean booleanValue = ((Boolean) aVar.C.invoke()).booleanValue();
                    boolean booleanValue2 = ((Boolean) aVar.G.invoke()).booleanValue();
                    com.yandex.plus.home.feature.webviews.internal.uri.a a = aVar.s.a(booleanValue, str, str2, map, k, dttVar);
                    rzs0 rzs0Var2 = aVar.g;
                    webViewsControllerImpl$openSmartWebView$1.L$0 = null;
                    webViewsControllerImpl$openSmartWebView$1.L$1 = str;
                    webViewsControllerImpl$openSmartWebView$1.L$2 = null;
                    webViewsControllerImpl$openSmartWebView$1.L$3 = null;
                    webViewsControllerImpl$openSmartWebView$1.L$4 = u1wVar;
                    webViewsControllerImpl$openSmartWebView$1.L$5 = null;
                    webViewsControllerImpl$openSmartWebView$1.L$6 = q;
                    webViewsControllerImpl$openSmartWebView$1.L$7 = v;
                    webViewsControllerImpl$openSmartWebView$1.L$8 = zsz0Var2;
                    webViewsControllerImpl$openSmartWebView$1.L$9 = k;
                    webViewsControllerImpl$openSmartWebView$1.L$10 = null;
                    webViewsControllerImpl$openSmartWebView$1.L$11 = rzs0Var2;
                    webViewsControllerImpl$openSmartWebView$1.Z$0 = booleanValue;
                    webViewsControllerImpl$openSmartWebView$1.Z$1 = booleanValue2;
                    webViewsControllerImpl$openSmartWebView$1.label = 1;
                    Object b = a.b(rzgVar, webViewsControllerImpl$openSmartWebView$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    u1wVar2 = u1wVar;
                    deeplink$WebViewFormat = q;
                    ejeVar = v;
                    z = booleanValue2;
                    sgsVar = k;
                    zsz0Var = zsz0Var2;
                    str3 = str;
                    z2 = booleanValue;
                    obj = b;
                    rzs0Var = rzs0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = webViewsControllerImpl$openSmartWebView$1.Z$1;
                    boolean z4 = webViewsControllerImpl$openSmartWebView$1.Z$0;
                    rzs0 rzs0Var3 = (rzs0) webViewsControllerImpl$openSmartWebView$1.L$11;
                    sgs sgsVar2 = (sgs) webViewsControllerImpl$openSmartWebView$1.L$9;
                    zsz0 zsz0Var3 = (zsz0) webViewsControllerImpl$openSmartWebView$1.L$8;
                    ejeVar = (eje) webViewsControllerImpl$openSmartWebView$1.L$7;
                    Deeplink$WebViewFormat deeplink$WebViewFormat3 = (Deeplink$WebViewFormat) webViewsControllerImpl$openSmartWebView$1.L$6;
                    u1w u1wVar3 = (u1w) webViewsControllerImpl$openSmartWebView$1.L$4;
                    String str4 = (String) webViewsControllerImpl$openSmartWebView$1.L$1;
                    kotlin.b.b(obj);
                    z = z3;
                    z2 = z4;
                    rzs0Var = rzs0Var3;
                    sgsVar = sgsVar2;
                    zsz0Var = zsz0Var3;
                    deeplink$WebViewFormat = deeplink$WebViewFormat3;
                    u1wVar2 = u1wVar3;
                    str3 = str4;
                }
                mum mumVar = new mum(aVar.J);
                z2d0 z2d0Var = rzs0Var.A;
                v920 v920Var = rzs0Var.b;
                cjw0 cjw0Var = rzs0Var.s;
                d dVar = rzs0Var.l;
                com.yandex.plus.home.feature.webviews.internal.settings.domain.b bVar = rzs0Var.j;
                opu opuVar = new opu(z2d0Var, rzs0Var.r);
                Context context = rzs0Var.a;
                com.yandex.plus.home.auth.b bVar2 = rzs0Var.c;
                y4a0 y4a0Var = new y4a0(rzs0Var.e);
                jse jseVar = rzs0Var.f;
                eje ejeVar2 = ejeVar;
                jse jseVar2 = rzs0Var.g;
                jse jseVar3 = rzs0Var.h;
                com.yandex.plus.home.feature.webviews.internalapi.bridge.a aVar2 = rzs0Var.z;
                rzs0 rzs0Var4 = rzs0Var;
                aVar.u(ejeVar2, new PlusSmartWebView(context, new yld0(cjw0Var, (rzg) obj, bVar2, y4a0Var, jseVar, jseVar3, jseVar2, aVar2, rzs0Var.i, bVar, mumVar, rzs0Var.k, v920Var, aVar, rzs0Var.m, dVar, rzs0Var.o, rzs0Var.q, rzs0Var.v, rzs0Var.p, new com.yandex.plus.home.feature.webviews.internal.c(dVar, aVar2), rzs0Var.t, rzs0Var.u, str3, z2, z, rzs0Var.w, rzs0Var.y, rzs0Var.C, rzs0Var.x), rzs0Var4.d, deeplink$WebViewFormat, rzs0Var4.r, zsz0Var, null, opuVar, rzs0Var4.B, u1wVar2, sgsVar, new uzs0(z2, z, e3n.e(rzs0Var4.C.b), new szs0(aVar, v920Var, cjw0Var, rzs0Var4.p, rzs0Var4.i, bVar, rzs0Var4.k, rzs0Var4.v, rzs0Var4.q, rzs0Var4.m, rzs0Var4.n, dVar, rzs0Var4.D, rzs0Var4.h, rzs0Var4.f, rzs0Var4.g), new com.yandex.plus.home.feature.webviews.internal.uri.b(rzs0Var4.c), new j2n(4, rzs0Var4), rzs0Var4.n, rzs0Var4.f), aVar));
                return zy11.a;
            }
        }
        webViewsControllerImpl$openSmartWebView$1 = new WebViewsControllerImpl$openSmartWebView$1(aVar, continuationImpl);
        Object obj2 = webViewsControllerImpl$openSmartWebView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewsControllerImpl$openSmartWebView$1.label;
        if (i != 0) {
        }
        mum mumVar2 = new mum(aVar.J);
        z2d0 z2d0Var2 = rzs0Var.A;
        v920 v920Var2 = rzs0Var.b;
        cjw0 cjw0Var2 = rzs0Var.s;
        d dVar2 = rzs0Var.l;
        com.yandex.plus.home.feature.webviews.internal.settings.domain.b bVar3 = rzs0Var.j;
        opu opuVar2 = new opu(z2d0Var2, rzs0Var.r);
        Context context2 = rzs0Var.a;
        com.yandex.plus.home.auth.b bVar22 = rzs0Var.c;
        y4a0 y4a0Var2 = new y4a0(rzs0Var.e);
        jse jseVar4 = rzs0Var.f;
        eje ejeVar22 = ejeVar;
        jse jseVar22 = rzs0Var.g;
        jse jseVar32 = rzs0Var.h;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.a aVar22 = rzs0Var.z;
        rzs0 rzs0Var42 = rzs0Var;
        aVar.u(ejeVar22, new PlusSmartWebView(context2, new yld0(cjw0Var2, (rzg) obj2, bVar22, y4a0Var2, jseVar4, jseVar32, jseVar22, aVar22, rzs0Var.i, bVar3, mumVar2, rzs0Var.k, v920Var2, aVar, rzs0Var.m, dVar2, rzs0Var.o, rzs0Var.q, rzs0Var.v, rzs0Var.p, new com.yandex.plus.home.feature.webviews.internal.c(dVar2, aVar22), rzs0Var.t, rzs0Var.u, str3, z2, z, rzs0Var.w, rzs0Var.y, rzs0Var.C, rzs0Var.x), rzs0Var42.d, deeplink$WebViewFormat, rzs0Var42.r, zsz0Var, null, opuVar2, rzs0Var42.B, u1wVar2, sgsVar, new uzs0(z2, z, e3n.e(rzs0Var42.C.b), new szs0(aVar, v920Var2, cjw0Var2, rzs0Var42.p, rzs0Var42.i, bVar3, rzs0Var42.k, rzs0Var42.v, rzs0Var42.q, rzs0Var42.m, rzs0Var42.n, dVar2, rzs0Var42.D, rzs0Var42.h, rzs0Var42.f, rzs0Var42.g), new com.yandex.plus.home.feature.webviews.internal.uri.b(rzs0Var42.c), new j2n(4, rzs0Var42), rzs0Var42.n, rzs0Var42.f), aVar));
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r13v11, types: [i0h] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0173 -> B:10:0x0182). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(final a aVar, List list, String str, String str2, Map map, u1w u1wVar, q230 q230Var, dtt dttVar, ContinuationImpl continuationImpl) {
        WebViewsControllerImpl$openWebStoriesList$1 webViewsControllerImpl$openWebStoriesList$1;
        int i;
        Object obj;
        final Map map2;
        q230 q230Var2;
        boolean z;
        CoroutineSingletons coroutineSingletons;
        com.yandex.plus.home.feature.webviews.internal.uri.a aVar2;
        final u1w u1wVar2;
        com.yandex.plus.home.feature.webviews.internal.container.factory.b bVar;
        Iterator it;
        ArrayList arrayList;
        boolean z2;
        int i2;
        int i3;
        final String str3;
        final String str4;
        boolean z3;
        boolean z4;
        aVar.getClass();
        if (continuationImpl instanceof WebViewsControllerImpl$openWebStoriesList$1) {
            webViewsControllerImpl$openWebStoriesList$1 = (WebViewsControllerImpl$openWebStoriesList$1) continuationImpl;
            int i4 = webViewsControllerImpl$openWebStoriesList$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                webViewsControllerImpl$openWebStoriesList$1.label = i4 - Integer.MIN_VALUE;
                Object obj2 = webViewsControllerImpl$openWebStoriesList$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewsControllerImpl$openWebStoriesList$1.label;
                if (i != 0) {
                    obj = null;
                    kotlin.b.b(obj2);
                    sgs k = aVar.r.k(u1wVar, Deeplink$WebViewFormat.FULL, false);
                    boolean booleanValue = ((Boolean) aVar.D.invoke()).booleanValue();
                    boolean booleanValue2 = ((Boolean) aVar.H.invoke()).booleanValue();
                    com.yandex.plus.home.feature.webviews.internal.uri.a a = aVar.s.a(booleanValue, str, str2, map, k, dttVar);
                    com.yandex.plus.home.feature.webviews.internal.container.factory.b bVar2 = aVar.e;
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                    map2 = map;
                    q230Var2 = q230Var;
                    z = booleanValue2;
                    coroutineSingletons = coroutineSingletons2;
                    aVar2 = a;
                    u1wVar2 = u1wVar;
                    bVar = bVar2;
                    it = list2.iterator();
                    arrayList = arrayList2;
                    z2 = booleanValue;
                    i2 = 0;
                    i3 = 0;
                    str3 = str;
                    str4 = str2;
                    z3 = z;
                    z4 = z2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z5 = webViewsControllerImpl$openWebStoriesList$1.Z$3;
                    boolean z6 = webViewsControllerImpl$openWebStoriesList$1.Z$2;
                    int i5 = webViewsControllerImpl$openWebStoriesList$1.I$1;
                    int i6 = webViewsControllerImpl$openWebStoriesList$1.I$0;
                    boolean z7 = webViewsControllerImpl$openWebStoriesList$1.Z$1;
                    boolean z8 = webViewsControllerImpl$openWebStoriesList$1.Z$0;
                    Collection collection = (Collection) webViewsControllerImpl$openWebStoriesList$1.L$17;
                    com.yandex.plus.home.feature.webviews.internal.container.factory.b bVar3 = (com.yandex.plus.home.feature.webviews.internal.container.factory.b) webViewsControllerImpl$openWebStoriesList$1.L$16;
                    wk41 wk41Var = (wk41) webViewsControllerImpl$openWebStoriesList$1.L$15;
                    it = (Iterator) webViewsControllerImpl$openWebStoriesList$1.L$12;
                    ?? r5 = (Collection) webViewsControllerImpl$openWebStoriesList$1.L$11;
                    ?? r13 = (i0h) webViewsControllerImpl$openWebStoriesList$1.L$8;
                    q230 q230Var3 = (q230) webViewsControllerImpl$openWebStoriesList$1.L$5;
                    u1w u1wVar3 = (u1w) webViewsControllerImpl$openWebStoriesList$1.L$4;
                    Map map3 = (Map) webViewsControllerImpl$openWebStoriesList$1.L$3;
                    String str5 = (String) webViewsControllerImpl$openWebStoriesList$1.L$2;
                    String str6 = (String) webViewsControllerImpl$openWebStoriesList$1.L$1;
                    kotlin.b.b(obj2);
                    u1w u1wVar4 = u1wVar3;
                    WebViewsControllerImpl$openWebStoriesList$1 webViewsControllerImpl$openWebStoriesList$12 = webViewsControllerImpl$openWebStoriesList$1;
                    CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                    boolean z9 = z6;
                    bVar = bVar3;
                    wk41 wk41Var2 = wk41Var;
                    q230 q230Var4 = q230Var3;
                    str3 = str6;
                    boolean z10 = z8;
                    Object obj3 = obj2;
                    ArrayList arrayList3 = r5;
                    i2 = i5;
                    z = z7;
                    str4 = str5;
                    i3 = i6;
                    map2 = map3;
                    com.yandex.plus.home.feature.webviews.internal.uri.a aVar3 = r13;
                    szg szgVar = (szg) obj3;
                    collection.add(new wk41(szgVar, wk41Var2.b, wk41Var2.c));
                    bVar = bVar;
                    z3 = z5;
                    u1wVar2 = u1wVar4;
                    aVar2 = aVar3;
                    q230Var2 = q230Var4;
                    z2 = z10;
                    arrayList = arrayList3;
                    z4 = z9;
                    webViewsControllerImpl$openWebStoriesList$1 = webViewsControllerImpl$openWebStoriesList$12;
                    coroutineSingletons = coroutineSingletons3;
                    obj = null;
                    if (it.hasNext()) {
                        boolean z11 = z3;
                        wk41 wk41Var3 = (wk41) it.next();
                        z9 = z4;
                        szg szgVar2 = wk41Var3.a;
                        Object obj4 = obj;
                        webViewsControllerImpl$openWebStoriesList$1.L$0 = obj4;
                        webViewsControllerImpl$openWebStoriesList$1.L$1 = str3;
                        webViewsControllerImpl$openWebStoriesList$1.L$2 = str4;
                        webViewsControllerImpl$openWebStoriesList$1.L$3 = map2;
                        webViewsControllerImpl$openWebStoriesList$1.L$4 = u1wVar2;
                        webViewsControllerImpl$openWebStoriesList$1.L$5 = q230Var2;
                        webViewsControllerImpl$openWebStoriesList$1.L$6 = obj4;
                        webViewsControllerImpl$openWebStoriesList$1.L$7 = obj4;
                        webViewsControllerImpl$openWebStoriesList$1.L$8 = aVar2;
                        webViewsControllerImpl$openWebStoriesList$1.L$9 = obj4;
                        webViewsControllerImpl$openWebStoriesList$1.L$10 = obj4;
                        webViewsControllerImpl$openWebStoriesList$1.L$11 = arrayList;
                        webViewsControllerImpl$openWebStoriesList$1.L$12 = it;
                        webViewsControllerImpl$openWebStoriesList$1.L$13 = obj4;
                        webViewsControllerImpl$openWebStoriesList$1.L$14 = obj4;
                        webViewsControllerImpl$openWebStoriesList$1.L$15 = wk41Var3;
                        webViewsControllerImpl$openWebStoriesList$1.L$16 = bVar;
                        webViewsControllerImpl$openWebStoriesList$1.L$17 = arrayList;
                        webViewsControllerImpl$openWebStoriesList$1.Z$0 = z2;
                        webViewsControllerImpl$openWebStoriesList$1.Z$1 = z;
                        webViewsControllerImpl$openWebStoriesList$1.I$0 = i3;
                        webViewsControllerImpl$openWebStoriesList$1.I$1 = i2;
                        webViewsControllerImpl$openWebStoriesList$1.I$2 = 0;
                        webViewsControllerImpl$openWebStoriesList$1.Z$2 = z9;
                        webViewsControllerImpl$openWebStoriesList$1.Z$3 = z11;
                        webViewsControllerImpl$openWebStoriesList$1.label = 1;
                        Object c = aVar2.c(szgVar2, webViewsControllerImpl$openWebStoriesList$1);
                        webViewsControllerImpl$openWebStoriesList$12 = webViewsControllerImpl$openWebStoriesList$1;
                        CoroutineSingletons coroutineSingletons4 = coroutineSingletons;
                        if (c == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                        obj3 = c;
                        coroutineSingletons3 = coroutineSingletons4;
                        wk41Var2 = wk41Var3;
                        arrayList3 = arrayList;
                        z5 = z11;
                        z10 = z2;
                        q230Var4 = q230Var2;
                        aVar3 = aVar2;
                        u1wVar4 = u1wVar2;
                        collection = arrayList3;
                        szg szgVar3 = (szg) obj3;
                        collection.add(new wk41(szgVar3, wk41Var2.b, wk41Var2.c));
                        bVar = bVar;
                        z3 = z5;
                        u1wVar2 = u1wVar4;
                        aVar2 = aVar3;
                        q230Var2 = q230Var4;
                        z2 = z10;
                        arrayList = arrayList3;
                        z4 = z9;
                        webViewsControllerImpl$openWebStoriesList$1 = webViewsControllerImpl$openWebStoriesList$12;
                        coroutineSingletons = coroutineSingletons3;
                        obj = null;
                        if (it.hasNext()) {
                            final boolean z12 = z4;
                            final boolean z13 = z3;
                            final String str7 = (String) aVar.x.invoke();
                            final gym gymVar = new gym(aVar.J);
                            final WebViewsControllerImpl$openWebStoriesList$webView$2 webViewsControllerImpl$openWebStoriesList$webView$2 = new WebViewsControllerImpl$openWebStoriesList$webView$2(0, aVar, a.class, "onNativePaySuccess", "onNativePaySuccess()V", 0);
                            final WebViewsControllerImpl$openWebStoriesList$webView$3 webViewsControllerImpl$openWebStoriesList$webView$3 = new WebViewsControllerImpl$openWebStoriesList$webView$3(0, aVar, a.class, "onHostPaySuccess", "onHostPaySuccess()V", 0);
                            bVar.getClass();
                            final com.yandex.plus.home.feature.webviews.internal.container.factory.b bVar4 = bVar;
                            aVar.u(new iy20(q230Var2, 0), new WebStoriesContainer(bVar.p, new tls() { // from class: cqu0
                                @Override // defpackage.tls
                                public final Object invoke(Object obj5) {
                                    wk41 wk41Var4 = (wk41) obj5;
                                    return b.this.a(z12, z13, wk41Var4.a, wk41Var4.c, str7, gymVar, str3, str4, map2, webViewsControllerImpl$openWebStoriesList$webView$2, webViewsControllerImpl$openWebStoriesList$webView$3, false, u1wVar2, false, aVar);
                                }
                            }, new vk41(arrayList, bVar4.c), aVar));
                            return zy11.a;
                        }
                    }
                }
            }
        }
        webViewsControllerImpl$openWebStoriesList$1 = new WebViewsControllerImpl$openWebStoriesList$1(aVar, continuationImpl);
        Object obj22 = webViewsControllerImpl$openWebStoriesList$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewsControllerImpl$openWebStoriesList$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(a aVar, szg szgVar, String str, String str2, Map map, String str3, u1w u1wVar, q230 q230Var, dtt dttVar, ContinuationImpl continuationImpl) {
        WebViewsControllerImpl$openWebStoriesView$1 webViewsControllerImpl$openWebStoriesView$1;
        int i;
        iy20 iy20Var;
        boolean z;
        String str4;
        boolean z2;
        String str5;
        Map map2;
        u1w u1wVar2;
        com.yandex.plus.home.feature.webviews.internal.container.factory.b bVar;
        String str6;
        aVar.getClass();
        if (continuationImpl instanceof WebViewsControllerImpl$openWebStoriesView$1) {
            webViewsControllerImpl$openWebStoriesView$1 = (WebViewsControllerImpl$openWebStoriesView$1) continuationImpl;
            int i2 = webViewsControllerImpl$openWebStoriesView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewsControllerImpl$openWebStoriesView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webViewsControllerImpl$openWebStoriesView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewsControllerImpl$openWebStoriesView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    iy20 iy20Var2 = new iy20(q230Var, 0);
                    sgs k = aVar.r.k(u1wVar, Deeplink$WebViewFormat.FULL, false);
                    boolean booleanValue = ((Boolean) aVar.D.invoke()).booleanValue();
                    boolean booleanValue2 = ((Boolean) aVar.H.invoke()).booleanValue();
                    com.yandex.plus.home.feature.webviews.internal.uri.a a = aVar.s.a(booleanValue, str, str2, map, k, dttVar);
                    com.yandex.plus.home.feature.webviews.internal.container.factory.b bVar2 = aVar.e;
                    webViewsControllerImpl$openWebStoriesView$1.L$0 = null;
                    webViewsControllerImpl$openWebStoriesView$1.L$1 = str;
                    webViewsControllerImpl$openWebStoriesView$1.L$2 = str2;
                    webViewsControllerImpl$openWebStoriesView$1.L$3 = map;
                    webViewsControllerImpl$openWebStoriesView$1.L$4 = str3;
                    webViewsControllerImpl$openWebStoriesView$1.L$5 = u1wVar;
                    webViewsControllerImpl$openWebStoriesView$1.L$6 = null;
                    webViewsControllerImpl$openWebStoriesView$1.L$7 = null;
                    webViewsControllerImpl$openWebStoriesView$1.L$8 = iy20Var2;
                    webViewsControllerImpl$openWebStoriesView$1.L$9 = null;
                    webViewsControllerImpl$openWebStoriesView$1.L$10 = null;
                    webViewsControllerImpl$openWebStoriesView$1.L$11 = bVar2;
                    webViewsControllerImpl$openWebStoriesView$1.Z$0 = booleanValue;
                    webViewsControllerImpl$openWebStoriesView$1.Z$1 = booleanValue2;
                    webViewsControllerImpl$openWebStoriesView$1.label = 1;
                    Object c = a.c(szgVar, webViewsControllerImpl$openWebStoriesView$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    iy20Var = iy20Var2;
                    obj = c;
                    z = booleanValue2;
                    str4 = str3;
                    z2 = booleanValue;
                    str5 = str;
                    map2 = map;
                    u1wVar2 = u1wVar;
                    bVar = bVar2;
                    str6 = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = webViewsControllerImpl$openWebStoriesView$1.Z$1;
                    z2 = webViewsControllerImpl$openWebStoriesView$1.Z$0;
                    com.yandex.plus.home.feature.webviews.internal.container.factory.b bVar3 = (com.yandex.plus.home.feature.webviews.internal.container.factory.b) webViewsControllerImpl$openWebStoriesView$1.L$11;
                    iy20Var = (iy20) webViewsControllerImpl$openWebStoriesView$1.L$8;
                    u1w u1wVar3 = (u1w) webViewsControllerImpl$openWebStoriesView$1.L$5;
                    String str7 = (String) webViewsControllerImpl$openWebStoriesView$1.L$4;
                    Map map3 = (Map) webViewsControllerImpl$openWebStoriesView$1.L$3;
                    String str8 = (String) webViewsControllerImpl$openWebStoriesView$1.L$2;
                    String str9 = (String) webViewsControllerImpl$openWebStoriesView$1.L$1;
                    kotlin.b.b(obj);
                    map2 = map3;
                    str6 = str8;
                    z = z3;
                    bVar = bVar3;
                    u1wVar2 = u1wVar3;
                    str4 = str7;
                    str5 = str9;
                }
                aVar.u(iy20Var, bVar.a(z2, z, (szg) obj, str4, (String) aVar.x.invoke(), new gym(aVar.J), str5, str6, map2, new WebViewsControllerImpl$openWebStoriesView$webView$1(0, aVar, a.class, "onNativePaySuccess", "onNativePaySuccess()V", 0), new WebViewsControllerImpl$openWebStoriesView$webView$2(0, aVar, a.class, "onHostPaySuccess", "onHostPaySuccess()V", 0), true, u1wVar2, true, aVar));
                return zy11.a;
            }
        }
        webViewsControllerImpl$openWebStoriesView$1 = new WebViewsControllerImpl$openWebStoriesView$1(aVar, continuationImpl);
        Object obj2 = webViewsControllerImpl$openWebStoriesView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewsControllerImpl$openWebStoriesView$1.label;
        if (i != 0) {
        }
        aVar.u(iy20Var, bVar.a(z2, z, (szg) obj2, str4, (String) aVar.x.invoke(), new gym(aVar.J), str5, str6, map2, new WebViewsControllerImpl$openWebStoriesView$webView$1(0, aVar, a.class, "onNativePaySuccess", "onNativePaySuccess()V", 0), new WebViewsControllerImpl$openWebStoriesView$webView$2(0, aVar, a.class, "onHostPaySuccess", "onHostPaySuccess()V", 0), true, u1wVar2, true, aVar));
        return zy11.a;
    }

    public final int j() {
        Object obj;
        h8 h8Var = new h8(3, this.M);
        if (h8Var.hasNext()) {
            Object next = h8Var.next();
            while (h8Var.hasNext()) {
                next = h8Var.next();
            }
            obj = next;
        } else {
            obj = null;
        }
        return jl40.l(obj, this.N) ? 2 : 1;
    }

    public final void k() {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.w;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebViewsControllerImpl", "closeTopDeeplink(): stackSize=" + this.M.getChildCount());
        }
        dje l = l();
        if (l != null) {
            l.hide();
        }
    }

    public final dje l() {
        Object next;
        FrameLayout frameLayout = this.M;
        h8 h8Var = new h8(3, frameLayout);
        if (h8Var.hasNext()) {
            next = h8Var.next();
            while (h8Var.hasNext()) {
                next = h8Var.next();
            }
        } else {
            next = null;
        }
        KeyEvent.Callback callback = (View) next;
        if (frameLayout.getChildCount() <= 1 || !jl40.l(callback, this.N)) {
            if (callback instanceof dje) {
                return (dje) callback;
            }
            return null;
        }
        KeyEvent.Callback childAt = frameLayout.getChildAt(frameLayout.getChildCount() - 2);
        if (childAt instanceof dje) {
            return (dje) childAt;
        }
        return null;
    }

    public final void m(tls tlsVar) {
        ike ikeVar = this.K;
        if (ikeVar != null) {
            tje.N(ikeVar, null, null, new WebViewsControllerImpl$getMultipleContents$1(this, tlsVar, null), 3);
        } else {
            tlsVar.invoke(new Uri[0]);
        }
    }

    public final boolean n() {
        Object next;
        FrameLayout frameLayout = this.M;
        if (frameLayout.getChildCount() != 1) {
            return false;
        }
        h8 h8Var = new h8(3, frameLayout);
        if (h8Var.hasNext()) {
            next = h8Var.next();
            while (h8Var.hasNext()) {
                next = h8Var.next();
            }
        } else {
            next = null;
        }
        return jl40.l(next, this.N);
    }

    public final void o(Uri uri) {
        this.t.a(uri);
        if (this.M.getChildCount() == 0 || n()) {
            this.J.g(a3d0.b);
        }
    }

    public final void p(u1w u1wVar, vvq0 vvq0Var) {
        hds0 hds0Var = new hds0();
        j4n j4nVar = this.h;
        el11 el11Var = (el11) j4nVar.x;
        Context context = (Context) j4nVar.a;
        apf apfVar = new apf(el11Var, context, "plus_sdk_logs_%s.txt");
        j4nVar.K();
        jse jseVar = (jse) j4nVar.y;
        v8e v8eVar = new v8e(10, j4nVar);
        f89 f89Var = new f89(17, j4nVar, vvq0Var, u1wVar);
        hs6 hs6Var = new hs6(this, v8eVar, jseVar, apfVar);
        f89Var.invoke(hs6Var);
        r0 r0Var = hs6Var.c;
        u1w u1wVar2 = hs6Var.d;
        new xkf();
        new bxs();
        j4n j4nVar2 = new j4n();
        j4nVar2.a = r0Var;
        j4nVar2.b = this;
        j4nVar2.c = v8eVar;
        j4nVar2.x = qv10.e(jseVar);
        ArrayList<qvg> arrayList = hs6Var.a;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (qvg qvgVar : arrayList) {
            DebugPanelInfoItem$DebugPanelGeneralInfo$FieldKey debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey = qvgVar.a;
            arrayList2.add(new cxs(debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey.name(), debugPanelInfoItem$DebugPanelGeneralInfo$FieldKey.name() + '\n' + qvgVar.b));
        }
        j4nVar2.y = arrayList2;
        ArrayList arrayList3 = hs6Var.b;
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
        j4nVar2.z = arrayList4;
        j4nVar2.w = bvf0.c(new dwg(arrayList2, arrayList4));
        u(hds0Var, new hwg(new DebugPanelViewControllerImpl(context, j4nVar2, u1wVar2, jseVar, apfVar)));
    }

    public final void q(Collection collection, tls tlsVar) {
        if (!((Boolean) this.I.invoke()).booleanValue()) {
            tlsVar.invoke(kotlin.collections.b.f());
            return;
        }
        ike ikeVar = this.K;
        if (ikeVar != null) {
            tje.N(ikeVar, null, null, new WebViewsControllerImpl$requestPermissions$1(collection, this, tlsVar, null), 3);
        } else {
            tlsVar.invoke(kotlin.collections.b.f());
        }
    }

    public final boolean r() {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.w;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebViewsControllerImpl", "routeBack(): stackSize=" + this.M.getChildCount());
        }
        dje l = l();
        return l != null && l.onBackPressed();
    }

    public final void s(vvq0 vvq0Var) {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.w;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebViewsControllerImpl", "routeToDebugPanel(" + vvq0Var + ')');
        }
        u1w u1wVar = (u1w) this.L.getValue();
        if (u1wVar == null) {
            u1wVar = u1w.e;
        }
        p(u1wVar, vvq0Var);
    }

    public final void t(String str, String str2, String str3) {
        Object failure;
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.w;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebViewsControllerImpl", b64.p(b64.v("routeToNativeSharing(", str, Extension.FIX_SPACE, str2, Extension.FIX_SPACE), str3, ')'));
        }
        k450 k450Var = this.u;
        k450Var.getClass();
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(str3);
            intent.putExtra("android.intent.extra.TITLE", str);
            intent.putExtra("android.intent.extra.TEXT", str2);
            Intent createChooser = Intent.createChooser(intent, null);
            createChooser.addFlags(SelfTester_JCP.IMITA);
            k450Var.a.startActivity(createChooser);
            failure = Boolean.TRUE;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer] */
    public final void u(eje ejeVar, gje gjeVar) {
        gje gjeVar2;
        final SimpleContentViewContainer simpleContentViewContainer;
        dje l;
        boolean z = ejeVar instanceof iy20;
        Context context = this.a;
        boolean z2 = true;
        FrameLayout frameLayout = this.M;
        if (z) {
            iy20 iy20Var = (iy20) ejeVar;
            int i = iy20Var.b;
            q230 q230Var = iy20Var.a;
            if (frameLayout.getChildCount() != 0 && !n()) {
                LinkedList linkedList = (LinkedList) this.O.c;
                if (((Deeplink$WebViewFormat) kotlin.collections.a.S(scc.f(linkedList) - 1, linkedList)) != Deeplink$WebViewFormat.FULL) {
                    z2 = false;
                }
            }
            ?? modalContentViewContainer = new ModalContentViewContainer(context, i, this.k, q230Var, z2, gjeVar, new WebViewsControllerImpl$showWebViewContainer$viewContainer$1(0, this, a.class, "onWebViewContainerHidden", "onWebViewContainerHidden()V", 0));
            gjeVar2 = gjeVar;
            simpleContentViewContainer = modalContentViewContainer;
        } else {
            gjeVar2 = gjeVar;
            if (!(ejeVar instanceof hds0)) {
                w511.b();
                return;
            }
            simpleContentViewContainer = new SimpleContentViewContainer(context, true, gjeVar, new WebViewsControllerImpl$showWebViewContainer$viewContainer$2(0, this, a.class, "onWebViewContainerHidden", "onWebViewContainerHidden()V", 0));
        }
        if (frameLayout.getChildCount() != 0 && (l = l()) != null) {
            l.onHasStartedBeingOverlapped();
        }
        final vv41 vv41Var = new vv41(simpleContentViewContainer);
        simpleContentViewContainer.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.plus.home.feature.webviews.internal.container.WebViewsControllerImpl$showWebViewContainer$attachStateChangeListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                a.this.b.a(vv41Var);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                a.this.b.d(vv41Var);
            }
        });
        frameLayout.addView(simpleContentViewContainer);
        if (!simpleContentViewContainer.isLaidOut() || simpleContentViewContainer.isLayoutRequested()) {
            simpleContentViewContainer.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.webviews.internal.container.WebViewsControllerImpl$showWebViewContainer$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    ((dje) simpleContentViewContainer).show();
                }
            });
        } else {
            simpleContentViewContainer.show();
        }
        if (gjeVar2 instanceof hwg) {
            return;
        }
        this.N.bringToFront();
    }

    public final iy20 v(Deeplink$WebViewFormat deeplink$WebViewFormat, int i, q230 q230Var) {
        int i2 = tv41.b[deeplink$WebViewFormat.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return new iy20(q230Var, i);
            }
            w511.b();
            return null;
        }
        if (this.c instanceof y2d0) {
            return new iy20(q230Var, 0);
        }
        w511.b();
        return null;
    }

    public final boolean w(Uri uri) {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.w;
        boolean e = pgzVar.e(logPriority);
        kqd0 kqd0Var = this.q;
        if (e) {
            StringBuilder sb = new StringBuilder("tryRouteToTreasury(");
            sb.append(uri);
            sb.append(", isTreasuryAdapterExist=");
            pgzVar.a(logPriority, "WebViewsControllerImpl", unr0.u(sb, kqd0Var != null, ')'));
        }
        if (kqd0Var != null) {
            return !(kqd0Var.a(uri.toString()) instanceof Result.Failure);
        }
        return false;
    }
}
