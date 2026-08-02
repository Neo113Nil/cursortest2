package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.flex.main_screen.shared_data.SectionStatus;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.MainSidePager;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.payments.yangopay.ui.YangoPayWidgetView;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import flex.logger.FlexLogLevel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.banners.model.d;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.perf.screen.ScreenPerformanceState;
import ru.yandex.taxi.promotions.model.Promotion;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.h;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final /* synthetic */ class ga1 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ ga1(fva0 fva0Var, String str, PerformanceAnalytics$Type performanceAnalytics$Type, long j) {
        this.a = 9;
        this.b = fva0Var;
        this.c = str;
        this.w = performanceAnalytics$Type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        u6r u6rVar;
        T t;
        ScreenPerformanceState d;
        Object obj2;
        StackTraceElement stackTraceElement;
        String str;
        String num;
        StackTraceElement stackTraceElement2;
        String num2;
        int i = this.a;
        final int i2 = 0;
        final int i3 = 1;
        Uri uri = null;
        uri = null;
        uri = null;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.w;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ha1 ha1Var = (ha1) obj5;
                tls tlsVar = (tls) obj4;
                Intent intent = (Intent) obj3;
                Uri uri2 = (Uri) obj;
                if (ha1Var.a(uri2)) {
                    String str2 = (String) a.R(uri2.getPathSegments());
                    if (str2 != null && !evu0.J(str2)) {
                        List list = ha1Var.c.a;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (((h0h) it.next()).c(str2)) {
                                }
                            }
                        }
                    }
                    uri = ha1Var.b.b(uri2);
                }
                if (uri != null) {
                    tlsVar.invoke(intent.setData(uri));
                } else {
                    tlsVar.invoke(intent);
                }
                return zy11Var;
            case 1:
                jpb jpbVar = (jpb) obj5;
                String str3 = (String) obj4;
                Map map = (Map) obj3;
                w3j0 w3j0Var = (w3j0) obj;
                if (jpbVar != null) {
                    w3j0Var.a.put("time_since_app_launch_sec_cached", wwg.q(jpbVar.b));
                }
                w3j0Var.d("time_source", str3);
                LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((SectionStatus) entry.getValue()).getRawValue());
                }
                w3j0Var.a.put("sections", linkedHashMap);
                return w3j0Var;
            case 2:
                ((d) obj5).u.remove(((Promotion) obj4).getB(), (pzt0) obj3);
                return zy11Var;
            case 3:
                tol tolVar = (tol) obj5;
                bpl bplVar = ((dee) obj3).a;
                tls tlsVar2 = (tls) obj4;
                ((Boolean) obj).getClass();
                if (tolVar != null) {
                    tolVar.a(bplVar);
                }
                if (tlsVar2 != null) {
                    tlsVar2.invoke(bplVar.getDivView());
                }
                return zy11Var;
            case 4:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj5;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                tls tlsVar3 = (tls) obj4;
                if (!jl40.l(obj, ref$ObjectRef.element) || !ref$BooleanRef.element) {
                    ref$ObjectRef.element = obj;
                    ref$BooleanRef.element = true;
                    tlsVar3.invoke(obj);
                }
                return zy11Var;
            case 5:
                com.yandex.go.flex.main_screen.data.network.d dVar = (com.yandex.go.flex.main_screen.data.network.d) obj5;
                xir xirVar = (xir) obj4;
                hd7 hd7Var = (hd7) obj3;
                Object obj6 = (b) obj;
                if (obj6 instanceof c) {
                    return new c(kotlin.collections.b.o((Map) obj6, new Pair("finalsuggest", qcx.m(((xnt) dVar.a).a(q6r.a(xirVar.b, hd7Var.d), q6r.Companion.serializer())))));
                }
                return obj6;
            case 6:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj5;
                com.yandex.go.flex.main_screen.data.network.d dVar2 = (com.yandex.go.flex.main_screen.data.network.d) obj4;
                hd7 hd7Var2 = (hd7) obj3;
                b bVar = (b) obj;
                if (bVar instanceof c) {
                    try {
                        u6rVar = (u6r) ((xnt) dVar2.a).d(bVar, u6r.Companion.serializer());
                    } catch (Throwable th) {
                        xby.t(jst.e, "MainScreenFlexInterceptor", th, null, 10);
                        u6rVar = null;
                    }
                    if (u6rVar != null) {
                        udq0.P(u6rVar.m, dVar2.f, hd7Var2);
                        t = u6rVar;
                    } else {
                        t = 0;
                    }
                    ref$ObjectRef2.element = t;
                }
                return null;
            case 7:
                com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.a aVar = (com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.a) obj5;
                MainSidePager mainSidePager = (MainSidePager) obj4;
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) obj3;
                float floatValue = ((Float) obj).floatValue();
                a941 a941Var = aVar.e;
                if (a941Var == null) {
                    a941Var = (floatValue > 0.01f || mainSidePager.getOverlayPhase() > 0.01f) ? aVar.b(mainSidePager) : null;
                }
                aVar.d.a(mainSidePager.getOverlayPhase() > 0.0f || floatValue > 0.0f);
                sls slsVar = aVar.j;
                if (slsVar != null) {
                    slsVar.invoke();
                }
                if (a941Var != null) {
                    if (floatValue >= 0.99f && !ref$BooleanRef2.element) {
                        ref$BooleanRef2.element = true;
                        a941Var.d();
                        b941 b941Var = aVar.f;
                        if (b941Var != null) {
                            x841 x841Var = b941Var.b;
                            if (!x841Var.c) {
                                x841Var.c = true;
                                x841Var.a.i("wallet", false);
                                x841Var.b.i(Screen.WALLET);
                            }
                        }
                    } else if (floatValue <= 0.01f && ref$BooleanRef2.element) {
                        ref$BooleanRef2.element = false;
                        a941Var.c();
                        b941 b941Var2 = aVar.f;
                        if (b941Var2 != null) {
                            x841 x841Var2 = b941Var2.b;
                            if (x841Var2.c) {
                                x841Var2.c = false;
                                x841Var2.a.d("wallet");
                                x841Var2.b.i(Screen.MAIN_V4);
                            }
                        }
                    }
                }
                return zy11Var;
            case 8:
                fx60 fx60Var = (fx60) obj5;
                sls slsVar2 = (sls) obj4;
                sls slsVar3 = (sls) obj3;
                if (((Result) obj).getValue() instanceof Result.Failure) {
                    slsVar2.invoke();
                } else {
                    ((com.yandex.go.splash.domain.b) fx60Var.b).a(new c82(3, slsVar3));
                }
                return zy11Var;
            case 9:
                fva0 fva0Var = (fva0) obj5;
                ((Long) obj).getClass();
                fva0Var.d((String) obj4, ((PerformanceAnalytics$Type) obj3).getAnalyticsName());
                fva0Var.d.getClass();
                return zy11Var;
            case 10:
                ru.yandex.taxi.perf.screen.c cVar = (ru.yandex.taxi.perf.screen.c) obj4;
                cwa0 cwa0Var = (cwa0) obj3;
                if (!((xy20) ((yy20) obj5)).a.contains((String) obj)) {
                    tn5 tn5Var = (tn5) cVar.d.get(cwa0Var.a);
                    if (tn5Var == null || (d = tn5Var.d()) == null || d.compareTo(ScreenPerformanceState.FIRST_CONTENTFUL_PAINT) < 0) {
                        cVar.d(cwa0Var);
                    }
                }
                return zy11Var;
            case 11:
                String str4 = (String) obj5;
                ogd0 ogd0Var = (ogd0) obj4;
                add0 add0Var = (add0) obj3;
                b5d0 b5d0Var = ogd0Var.b;
                if (b5d0Var == null) {
                    kbs.j("Parameter PlusImageLoader is required for ", qoi0.a(ngd0.class), 33);
                    return null;
                }
                v7d0 v7d0Var = ogd0Var.a;
                if (v7d0Var == null) {
                    kbs.j("Parameter PlusPay is required for ", qoi0.a(ngd0.class), 33);
                    return null;
                }
                am2 am2Var = ogd0Var.c;
                com.yandex.plus.pay.internal.di.d dVar3 = ((com.yandex.plus.pay.internal.b) add0Var).b;
                bdd0 b = dVar3.b();
                Context context = b.i;
                yo40 yo40Var = new yo40(new com.yandex.plus.resources.core.a(context, dVar3.b().e));
                mdd0 mdd0Var = b.x;
                n0p n0pVar = new n0p(str4, mdd0Var, b5d0Var, v7d0Var, add0Var, b, yo40Var, new hzk(context, mdd0Var), am2Var);
                final am2 am2Var2 = new am2();
                am2Var2.a = n0pVar;
                am2Var2.b = kotlin.a.a(new sls() { // from class: v3m
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = i2;
                        am2 am2Var3 = am2Var2;
                        switch (i4) {
                            case 0:
                                n0p n0pVar2 = (n0p) am2Var3.a;
                                return new com.yandex.plus.pay.ui.core.internal.config.a(n0pVar2.e, n0pVar2.b);
                            default:
                                n0p n0pVar3 = (n0p) am2Var3.a;
                                return new com.yandex.plus.pay.ui.core.internal.common.a(n0pVar3.f.k.h, (com.yandex.plus.pay.ui.core.internal.config.a) ((i3y) am2Var3.b).getValue(), n0pVar3.d);
                        }
                    }
                });
                am2Var2.c = kotlin.a.a(new sls() { // from class: v3m
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = i3;
                        am2 am2Var3 = am2Var2;
                        switch (i4) {
                            case 0:
                                n0p n0pVar2 = (n0p) am2Var3.a;
                                return new com.yandex.plus.pay.ui.core.internal.config.a(n0pVar2.e, n0pVar2.b);
                            default:
                                n0p n0pVar3 = (n0p) am2Var3.a;
                                return new com.yandex.plus.pay.ui.core.internal.common.a(n0pVar3.f.k.h, (com.yandex.plus.pay.ui.core.internal.config.a) ((i3y) am2Var3.b).getValue(), n0pVar3.d);
                        }
                    }
                });
                o370 o370Var = new o370(new oo2(n0pVar, am2Var2, new com.yandex.plus.pay.ui.core.internal.di.b(n0pVar)));
                ((Map) pgd0.c.b.getValue()).put(str4, o370Var);
                return new mgd0(o370Var);
            case 12:
                sze0 sze0Var = (sze0) obj4;
                fef fefVar = (fef) obj3;
                ServiceLevel.HighlightedTariffs.HighlightedPrice highlightedPrice = (ServiceLevel.HighlightedTariffs.HighlightedPrice) obj;
                Iterator it2 = ((yal0) obj5).b.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (jl40.l(((ServiceLevel) obj2).f, highlightedPrice.getA())) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ServiceLevel serviceLevel = (ServiceLevel) obj2;
                if (serviceLevel != null) {
                    return new Pair(highlightedPrice.getA(), new pju(highlightedPrice.getC() ? sze0Var.i(serviceLevel, fefVar) : "", highlightedPrice.getD(), highlightedPrice.getB()));
                }
                return null;
            case 13:
                ((Integer) obj).getClass();
                yrk0.a((wrk0) obj5, (rvo) obj4, (View) obj3);
                return zy11Var;
            case 14:
                imm0 imm0Var = (imm0) obj5;
                ArrayList arrayList = (ArrayList) obj3;
                d6x d6xVar = (d6x) obj;
                u4x u4xVar = imm0Var.b;
                zjr zjrVar = imm0Var.c;
                v5x v5xVar = ((gmm0) obj4).a;
                f5x a = u4xVar.a(v5xVar, d6xVar);
                String str5 = v5xVar.a;
                boolean z = a instanceof e5x;
                String str6 = "No line info";
                EmptyList emptyList = EmptyList.a;
                tjr tjrVar = tjr.d;
                if (z) {
                    String p = oyr.p("Scenario '", str5, "' successfully completed");
                    i3y a2 = kotlin.a.a(hmm0.a);
                    s7s0 s7s0Var = zjrVar.c.a;
                    if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                        String fileName = stackTraceElement2.getFileName();
                        str = fileName != null ? fileName : "No file info";
                        String methodName = stackTraceElement2.getMethodName();
                        int lineNumber = stackTraceElement2.getLineNumber();
                        Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                        if (valueOf != null && (num2 = valueOf.toString()) != null) {
                            str6 = num2;
                        }
                        tjrVar = new tjr(str, methodName, str6);
                    }
                    zjrVar.d(FlexLogLevel.DEBUG, p, a2, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
                    e5x e5xVar = (e5x) a;
                    arrayList.addAll(e5xVar.b);
                    return e5xVar.a;
                }
                if (!(a instanceof d5x)) {
                    w511.b();
                    return null;
                }
                i3y a3 = xfz.a(new Pair("scenarioName", str5), xfz.d(((d5x) a).a().getMessage(), DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION));
                s7s0 s7s0Var2 = zjrVar.c.a;
                if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName2 = stackTraceElement.getFileName();
                    str = fileName2 != null ? fileName2 : "No file info";
                    String methodName2 = stackTraceElement.getMethodName();
                    int lineNumber2 = stackTraceElement.getLineNumber();
                    Integer valueOf2 = lineNumber2 > 0 ? Integer.valueOf(lineNumber2) : null;
                    if (valueOf2 != null && (num = valueOf2.toString()) != null) {
                        str6 = num;
                    }
                    tjrVar = new tjr(str, methodName2, str6);
                }
                zjrVar.d(FlexLogLevel.DEBUG, "Failed to play Jason scenario", a3, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
                return d6xVar;
            case 15:
                yk ykVar = (yk) obj3;
                Throwable th2 = (Throwable) obj;
                ((d8) obj5).invoke(th2);
                kotlinx.coroutines.channels.a aVar2 = ((vcs0) obj4).c;
                aVar2.m(th2, false);
                while (true) {
                    Object b2 = oi9.b(aVar2.g());
                    if (b2 == null) {
                        return zy11Var;
                    }
                    ykVar.invoke(b2, th2);
                }
            case 16:
                c230 c230Var = (c230) obj5;
                SlideableModalView slideableModalView = ((h) obj4).d;
                SlideableModalView slideableModalView2 = (SlideableModalView) obj3;
                t1w t1wVar = (t1w) obj;
                View view = (View) c230Var.c.invoke();
                if (view == null) {
                    view = slideableModalView.getCardContentView();
                }
                if (slideableModalView.get_cardMode() == SlideableModalView.CardMode.FULLSCREEN) {
                    slideableModalView2.setTopSystemWindowInset(t1wVar.b);
                } else {
                    slideableModalView2.setPadding(slideableModalView2.getPaddingLeft(), t1wVar.b, slideableModalView2.getPaddingRight(), slideableModalView2.getPaddingBottom());
                }
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (c230Var.a || !t1wVar.f) ? ((Number) c230Var.d.getValue()).intValue() + t1wVar.g : view.getPaddingBottom());
                return zy11Var;
            case 17:
                oju0 oju0Var = (oju0) obj5;
                ((yg20) s8o.W(oju0Var, (yg20) obj4)).b(oju0Var, (ygz) obj3, (peo) obj);
                return zy11Var;
            case 18:
                kku0.l((kku0) obj5, (String) obj4, (Collection) obj3);
                return zy11Var;
            case 19:
                String str7 = (String) obj4;
                Collection collection = (Collection) obj3;
                ull0 T0 = ((oll0) obj).T0((String) obj5);
                try {
                    T0.g1(1, str7);
                    Iterator it3 = collection.iterator();
                    int i4 = 2;
                    while (it3.hasNext()) {
                        T0.g1(i4, (String) it3.next());
                        i4++;
                    }
                    T0.q();
                    T0.close();
                    return zy11Var;
                } catch (Throwable th3) {
                    T0.close();
                    throw th3;
                }
            case 20:
                ogd0 ogd0Var2 = (ogd0) obj;
                ogd0Var2.a = (v7d0) obj5;
                ogd0Var2.b = (b5d0) obj4;
                ogd0Var2.c = ffx.y(new ph41(i3, (n4u0) obj3));
                return ogd0Var2;
            default:
                YangoPayWidgetView yangoPayWidgetView = new YangoPayWidgetView(((ViewGroup) obj).getContext(), (pav) obj5, (z0a0) obj4, (u0a0) obj3);
                yangoPayWidgetView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return yangoPayWidgetView;
        }
    }

    public /* synthetic */ ga1(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    public /* synthetic */ ga1(Object obj, Object obj2, tls tlsVar, int i) {
        this.a = i;
        this.b = obj;
        this.w = obj2;
        this.c = tlsVar;
    }
}
