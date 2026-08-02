package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Recomposer$State;
import androidx.compose.runtime.c;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.go.dynamic.api.DynamicFeature;
import com.yandex.go.dynamic.impl.b;
import com.yandex.go.flex.common.extensions.shortcut_shimmer.ShortcutShimmeringDrawable;
import com.yandex.go.mob.HostMobSupportedApiNames;
import com.yandex.go.payments.cards.ui.LoyaltyProgramView;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.i0;
import com.yandex.passport.api.v1;
import com.yandex.passport.internal.credentials.Credentials;
import com.yandex.passport.internal.properties.n;
import core.flex.ui.OrientationAwareRecyclerView;
import flex.engine.a;
import flex.logger.FlexLogLevel;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.am.n0;
import ru.yandex.taxi.am.o0;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.logistics.sdk.deliveries.api.source.DeliveryStub$C2CStub;
import ru.yandex.taxi.logistics.sdk.deliveries.api.source.DeliveryStub$MarketStub;
import ru.yandex.taxi.perf.screen.PerformanceScreenName;

/* loaded from: classes9.dex */
public final /* synthetic */ class kn2 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kn2(u02 u02Var, jo90 jo90Var, Locale locale) {
        this.a = 17;
        this.b = jo90Var;
        this.c = locale;
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x081f  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        String str2;
        StackTraceElement stackTraceElement;
        String str3;
        zjr zjrVar;
        tjr tjrVar;
        StackTraceElement stackTraceElement2;
        String str4;
        tjr tjrVar2;
        s6o s6oVar;
        ywl ywlVar;
        View view;
        ViewGroup viewGroup;
        StackTraceElement stackTraceElement3;
        String str5;
        tjr tjrVar3;
        StackTraceElement stackTraceElement4;
        String num;
        StackTraceElement stackTraceElement5;
        String str6;
        tjr tjrVar4;
        RecyclerView.e layoutManager;
        boolean z = true;
        int i = 0;
        switch (this.a) {
            case 0:
                on2 on2Var = (on2) this.b;
                lb7 lb7Var = (lb7) this.c;
                s0k0 s0k0Var = (s0k0) obj;
                s0k0Var.a(bvf0.o(on2Var.a.a(), xg10.a));
                s0k0Var.d.add(new dmt(new ck(on2Var, 4), new ck(on2Var, 3), lb7Var));
                return s0k0Var;
            case 1:
                az4 az4Var = (az4) this.b;
                try {
                    az4Var.b.invoke(this.c, obj);
                } catch (Throwable th) {
                    az4Var.w.a(new ple(az4Var.a, 0), th);
                }
                return zy11.a;
            case 2:
                return ((ie7) this.b).d.a((Map) this.c, (InputStream) obj);
            case 3:
                lb7 lb7Var2 = (lb7) this.b;
                lb7Var2.c = (c) this.c;
                return new wgd(0, lb7Var2);
            case 4:
                List list = (List) this.b;
                Set set = (Set) this.c;
                isi isiVar = (isi) obj;
                if (isiVar instanceof DeliveryStub$C2CStub) {
                    List<hfi> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (hfi hfiVar : list2) {
                            DeliveryStub$C2CStub deliveryStub$C2CStub = (DeliveryStub$C2CStub) isiVar;
                            if (!jl40.l(hfiVar.e(), deliveryStub$C2CStub.getDeliveryId()) || hfiVar.n() < deliveryStub$C2CStub.getRevision()) {
                            }
                        }
                    }
                    z = false;
                } else {
                    if (!(isiVar instanceof DeliveryStub$MarketStub)) {
                        w511.b();
                        return null;
                    }
                    z = set.contains(((DeliveryStub$MarketStub) isiVar).getOriginalOrderId());
                }
                return Boolean.valueOf(z);
            case 5:
                dyj dyjVar = (dyj) this.b;
                lxj lxjVar = (lxj) this.c;
                synchronized (dyjVar) {
                    lxjVar.d();
                }
                return zy11.a;
            case 6:
                a aVar = (a) this.b;
                seu seuVar = aVar.c;
                ViewGroup viewGroup2 = (ViewGroup) this.c;
                e3m e3mVar = (e3m) obj;
                zy11 zy11Var = zy11.a;
                EmptyList emptyList = EmptyList.a;
                zjr zjrVar2 = aVar.N;
                tjr tjrVar5 = tjr.d;
                if (e3mVar instanceof a3m) {
                    i3y a = kotlin.a.a(eyl.a);
                    s7s0 s7s0Var = zjrVar2.c.a;
                    if (Boolean.FALSE.booleanValue() && (stackTraceElement5 = (StackTraceElement) unr0.j(0)) != null) {
                        String fileName = stackTraceElement5.getFileName();
                        if (fileName == null) {
                            fileName = "No file info";
                        }
                        String methodName = stackTraceElement5.getMethodName();
                        int lineNumber = stackTraceElement5.getLineNumber();
                        Integer valueOf = Integer.valueOf(lineNumber);
                        if (lineNumber <= 0) {
                            valueOf = null;
                        }
                        if (valueOf == null || (str6 = valueOf.toString()) == null) {
                            str6 = "No line info";
                        }
                        tjrVar4 = new tjr(fileName, methodName, str6);
                    } else {
                        tjrVar4 = tjrVar5;
                    }
                    zjrVar2.d(FlexLogLevel.DEBUG, "Applying idle document state", a, emptyList, tjrVar4.a, tjrVar4.b, tjrVar4.c);
                    viewGroup2.removeAllViews();
                } else {
                    if (!(e3mVar instanceof b3m)) {
                        if (e3mVar instanceof c3m) {
                            c3m c3mVar = (c3m) e3mVar;
                            ywl ywlVar2 = c3mVar.d;
                            if (ywlVar2 != null) {
                                aVar.B(aVar.u(ywlVar2), null);
                                str = "No line info";
                            } else {
                                View view2 = aVar.h0;
                                if (view2 != null) {
                                    viewGroup2.removeView(view2);
                                }
                                View view3 = aVar.i0;
                                if (view3 != null) {
                                    viewGroup2.removeView(view3);
                                }
                                xzl xzlVar = c3mVar.b;
                                if (xzlVar == null) {
                                    str = "No line info";
                                    z = false;
                                } else {
                                    ywl ywlVar3 = xzlVar.a;
                                    mjm0 mjm0Var = ywlVar3.b;
                                    see seeVar = ywlVar3.a;
                                    pjm0 v = aVar.v(mjm0Var, viewGroup2);
                                    gfe s = aVar.s(seeVar, viewGroup2, null, true);
                                    if (v != null) {
                                        view = v.ensureCreatedView(viewGroup2);
                                        viewGroup = v.a(view);
                                    } else {
                                        view = null;
                                        viewGroup = null;
                                    }
                                    if (view != null) {
                                        str = "No line info";
                                        if (viewGroup2.indexOfChild(view) == -1) {
                                            a.e(view, viewGroup2);
                                        }
                                    } else {
                                        str = "No line info";
                                    }
                                    if (viewGroup != null) {
                                        viewGroup2 = viewGroup;
                                    }
                                    boolean z2 = true;
                                    aVar.t(s, viewGroup2, true);
                                    if (mjm0Var != null && v != null) {
                                        v.onUpdateState(new ew2(mjm0Var, ywlVar3.c, z2));
                                    }
                                    s.onUpdateState(new nie(c3mVar.a, c3mVar.c, seeVar, ywlVar3.c, true));
                                    z = false;
                                }
                            }
                            str2 = "No file info";
                            if (!z) {
                                String p = oyr.p("Failed to apply document state (", qoi0.a(e3mVar.getClass()).d(), Extension.C_BRAKE);
                                i3y a2 = kotlin.a.a(dyl.a);
                                s7s0 s7s0Var2 = zjrVar2.c.a;
                                if (Boolean.FALSE.booleanValue() && (stackTraceElement4 = (StackTraceElement) unr0.j(0)) != null) {
                                    String fileName2 = stackTraceElement4.getFileName();
                                    String str7 = fileName2 == null ? str2 : fileName2;
                                    String methodName2 = stackTraceElement4.getMethodName();
                                    int lineNumber2 = stackTraceElement4.getLineNumber();
                                    Integer valueOf2 = lineNumber2 > 0 ? Integer.valueOf(lineNumber2) : null;
                                    tjrVar5 = new tjr(str7, methodName2, (valueOf2 == null || (num = valueOf2.toString()) == null) ? str : num);
                                }
                                tjr tjrVar6 = tjrVar5;
                                zjrVar2.d(FlexLogLevel.DEBUG, p, a2, emptyList, tjrVar6.a, tjrVar6.b, tjrVar6.c);
                            }
                            return zy11Var;
                        }
                        str = "No line info";
                        if (e3mVar instanceof z2m) {
                            z2m z2mVar = (z2m) e3mVar;
                            n530 n530Var = aVar.G;
                            xzl xzlVar2 = z2mVar.b;
                            u1m u1mVar = z2mVar.c;
                            azl azlVar = z2mVar.d;
                            uwl uwlVar = (xzlVar2 == null || (ywlVar = xzlVar2.a) == null) ? null : ywlVar.d;
                            if (xzlVar2 == null || !xzlVar2.d) {
                                str2 = "No file info";
                                i3y a3 = xfz.a(new Pair(ErrorResponseData.JSON_ERROR_MESSAGE, azlVar.a()), new Pair("errorType", azlVar.b()));
                                s7s0 s7s0Var3 = zjrVar2.c.a;
                                if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                                    String fileName3 = stackTraceElement.getFileName();
                                    if (fileName3 == null) {
                                        fileName3 = str2;
                                    }
                                    String methodName3 = stackTraceElement.getMethodName();
                                    int lineNumber3 = stackTraceElement.getLineNumber();
                                    Integer valueOf3 = Integer.valueOf(lineNumber3);
                                    if (lineNumber3 <= 0) {
                                        valueOf3 = null;
                                    }
                                    if (valueOf3 == null || (str3 = valueOf3.toString()) == null) {
                                        str3 = str;
                                    }
                                    zjrVar = zjrVar2;
                                    tjrVar = new tjr(fileName3, methodName3, str3);
                                } else {
                                    zjrVar = zjrVar2;
                                    tjrVar = tjrVar5;
                                }
                                uwl uwlVar2 = uwlVar;
                                FlexLogLevel flexLogLevel = FlexLogLevel.DEBUG;
                                String str8 = tjrVar.a;
                                String str9 = tjrVar.c;
                                String str10 = tjrVar.b;
                                zjrVar2 = zjrVar;
                                zjrVar2.d(flexLogLevel, "Applying failed document state", a3, emptyList, str8, str10, str9);
                                if (xzlVar2 != null) {
                                    if ((uwlVar2 != null ? uwlVar2.c : null) != null) {
                                        rzo.p(n530Var, uwlVar2.c, new pxl(xzlVar2.a.c));
                                    }
                                }
                                try {
                                    s6oVar = (s6o) aVar.a0.getValue();
                                } catch (Throwable th2) {
                                    jaa1.b(u1mVar);
                                    seuVar.getClass();
                                    String concat = "Failed to render ".concat(z2m.class.getSimpleName());
                                    i3y a4 = xfz.a(new Pair(ErrorResponseData.JSON_ERROR_MESSAGE, th2.getMessage()));
                                    s7s0 s7s0Var4 = zjrVar2.c.a;
                                    if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                                        String fileName4 = stackTraceElement2.getFileName();
                                        if (fileName4 == null) {
                                            fileName4 = str2;
                                        }
                                        String methodName4 = stackTraceElement2.getMethodName();
                                        int lineNumber4 = stackTraceElement2.getLineNumber();
                                        Integer valueOf4 = Integer.valueOf(lineNumber4);
                                        if (lineNumber4 <= 0) {
                                            valueOf4 = null;
                                        }
                                        if (valueOf4 == null || (str4 = valueOf4.toString()) == null) {
                                            str4 = str;
                                        }
                                        tjrVar2 = new tjr(fileName4, methodName4, str4);
                                    } else {
                                        tjrVar2 = tjrVar5;
                                    }
                                    zjrVar2.d(FlexLogLevel.DEBUG, concat, a4, emptyList, tjrVar2.a, tjrVar2.b, tjrVar2.c);
                                }
                                if (s6oVar instanceof baw0) {
                                    aVar.D(((baw0) s6oVar).b(), zwl.c);
                                    ((baw0) s6oVar).a(azlVar);
                                } else if (s6oVar instanceof mao) {
                                    View ensureCreatedView = ((mao) s6oVar).ensureCreatedView(viewGroup2);
                                    aVar.i0 = ensureCreatedView;
                                    z = true;
                                    if (!(viewGroup2.getChildCount() == 1 && jl40.l(viewGroup2.getChildAt(0), ensureCreatedView))) {
                                        viewGroup2.removeAllViewsInLayout();
                                        a.e(ensureCreatedView, viewGroup2);
                                    }
                                    ((mao) s6oVar).onDocumentError(azlVar);
                                    ((mao) s6oVar).onUpdateState(zy11Var);
                                } else {
                                    if (s6oVar != null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    viewGroup2.removeAllViews();
                                    z = false;
                                }
                            } else {
                                d3m d3mVar = aVar.m0;
                                if (aVar.r0) {
                                    if (jl40.l(d3mVar != null ? d3mVar.c : null, u1mVar)) {
                                        rzo.p(n530Var, uwlVar != null ? uwlVar.f : null, new pxl(xzlVar2.a.c));
                                    }
                                } else if (d3mVar != null) {
                                    aVar.f(d3mVar, viewGroup2);
                                }
                                str2 = "No file info";
                            }
                            z = true;
                        } else {
                            str2 = "No file info";
                            if (!(e3mVar instanceof d3m)) {
                                w511.b();
                                return null;
                            }
                            z = aVar.f((d3m) e3mVar, viewGroup2);
                        }
                        if (!z) {
                        }
                        return zy11Var;
                    }
                    b3m b3mVar = (b3m) e3mVar;
                    ywl ywlVar4 = b3mVar.d;
                    u1m u1mVar2 = b3mVar.c;
                    if (ywlVar4 != null) {
                        aVar.B(aVar.u(ywlVar4), null);
                    } else {
                        i3y a5 = xfz.a(new Pair("documentQuery", u1mVar2.a));
                        s7s0 s7s0Var5 = zjrVar2.c.a;
                        if (Boolean.FALSE.booleanValue() && (stackTraceElement3 = (StackTraceElement) unr0.j(0)) != null) {
                            String fileName5 = stackTraceElement3.getFileName();
                            if (fileName5 == null) {
                                fileName5 = "No file info";
                            }
                            String methodName5 = stackTraceElement3.getMethodName();
                            int lineNumber5 = stackTraceElement3.getLineNumber();
                            Integer valueOf5 = Integer.valueOf(lineNumber5);
                            if (lineNumber5 <= 0) {
                                valueOf5 = null;
                            }
                            if (valueOf5 == null || (str5 = valueOf5.toString()) == null) {
                                str5 = "No line info";
                            }
                            tjrVar3 = new tjr(fileName5, methodName5, str5);
                        } else {
                            tjrVar3 = tjrVar5;
                        }
                        zjrVar2.d(FlexLogLevel.DEBUG, "Applying loading document state", a5, emptyList, tjrVar3.a, tjrVar3.b, tjrVar3.c);
                        z = false;
                    }
                }
                str = "No line info";
                str2 = "No file info";
                if (!z) {
                }
                return zy11Var;
            case 7:
                d0m d0mVar = (d0m) this.b;
                tls tlsVar = (tls) this.c;
                acx acxVar = (acx) obj;
                acxVar.d = true;
                acxVar.c = true;
                acxVar.b = false;
                acxVar.g = true;
                kotlinx.serialization.modules.a aVar2 = new kotlinx.serialization.modules.a();
                bvf0.b0(aVar2);
                aVar2.g(qoi0.a(ywl.class), d0mVar.a);
                aVar2.g(qoi0.a(u1m.class), d0mVar.b);
                aVar2.g(qoi0.a(see.class), d0mVar.d);
                aVar2.g(qoi0.a(mjm0.class), d0mVar.e);
                aVar2.g(qoi0.a(cnr0.class), d0mVar.g);
                aVar2.g(qoi0.a(q370.class), d0mVar.h);
                aVar2.g(qoi0.a(uwl.class), d0mVar.c);
                aVar2.g(qoi0.a(kr.class), d0mVar.f);
                aVar2.g(qoi0.a(wwl.class), d0mVar.i);
                Iterator it = d0mVar.j.iterator();
                while (it.hasNext()) {
                    ((r1m) it.next()).extendDocumentParser(aVar2);
                }
                tlsVar.invoke(aVar2);
                acxVar.n = aVar2.a();
                return zy11.a;
            case 8:
                oju0 oju0Var = (oju0) this.b;
                u1m u1mVar3 = (u1m) this.c;
                wzl wzlVar = (wzl) ((s0j0) obj).a;
                if (wzlVar instanceof uzl) {
                    oju0Var.b(new v0m(u1mVar3, ((uzl) wzlVar).a));
                }
                return zy11.a;
            case 9:
                b bVar = (b) this.b;
                DynamicFeature dynamicFeature = (DynamicFeature) this.c;
                bVar.getClass();
                return bvf0.c(b.n(dynamicFeature));
            case 10:
                ((tls) this.b).invoke(((wjp) this.c).a());
                return zy11.a;
            case 11:
                ru.yandex.taxi.perf.screen.a aVar3 = (ru.yandex.taxi.perf.screen.a) this.b;
                xes xesVar = (xes) this.c;
                yes yesVar = (yes) obj;
                if (yesVar != null) {
                    wes wesVar = (wes) xesVar;
                    rua0 rua0Var = aVar3.e;
                    if (yesVar.a() != 0.0d) {
                        PerformanceScreenName c = wesVar.c();
                        String d = wesVar.d();
                        String a6 = wesVar.a();
                        String b = wesVar.b();
                        double a7 = yesVar.a();
                        rua0Var.getClass();
                        String p2 = oyr.p("Perf.Screen.", c.getAnalyticsName(), ".HitchTimeRatio");
                        i d2 = ((j) rua0Var.a).d(p2);
                        d2.d("id", d);
                        d2.d("intent_reason", a6);
                        d2.d("intent_source_screen", b);
                        d2.a(a7, "value");
                        d2.m();
                        rua0Var.b.getClass();
                        czf0.a((long) a7, p2);
                    }
                    PerformanceScreenName c2 = wesVar.c();
                    String d3 = wesVar.d();
                    String a8 = wesVar.a();
                    String b2 = wesVar.b();
                    int b3 = yesVar.b();
                    rua0Var.getClass();
                    String p3 = oyr.p("Perf.Screen.", c2.getAnalyticsName(), ".MaxHitchDuration");
                    i d4 = ((j) rua0Var.a).d(p3);
                    d4.d("id", d3);
                    d4.d("intent_reason", a8);
                    d4.d("intent_source_screen", b2);
                    d4.b(b3, "value");
                    d4.m();
                    rua0Var.b.getClass();
                    czf0.a(b3, p3);
                }
                return zy11.a;
            case 12:
                ((g6u) this.b).b.removeCallbacks((iy2) this.c);
                return zy11.a;
            case 13:
                sau sauVar = (sau) this.b;
                tau tauVar = (tau) this.c;
                rau rauVar = (rau) sauVar.Dg();
                tauVar.getClass();
                rauVar.setLogoBitmap((Bitmap) obj, true);
                return zy11.a;
            case 14:
                List<Pair> list3 = (List) this.b;
                d6x d6xVar = (d6x) this.c;
                d6x d6xVar2 = (d6x) obj;
                for (Pair pair : list3) {
                    List list4 = (List) pair.getFirst();
                    d6xVar2 = jason.statham.tools.a.d(d6xVar2, eja1.q(list4), (j5x) pair.getSecond(), bb1.K(d6xVar, eja1.q(list4)));
                }
                return d6xVar2;
            case 15:
                kvj0 kvj0Var = (kvj0) this.b;
                yuf0 yuf0Var = (yuf0) this.c;
                int i2 = kvj0Var.w;
                ConcurrentHashMap concurrentHashMap = ((gm20) obj).c;
                concurrentHashMap.put("response_code", Integer.valueOf(i2));
                yuf0Var.getClass();
                if (i2 / 100 != 2 && i2 != 304 && i2 != 301 && i2 != 302) {
                    concurrentHashMap.put("error_domain", "DomainError");
                    concurrentHashMap.put("error_description", "Received error HTTP code");
                }
                return zy11.a;
            case 16:
                File file = (File) this.b;
                y6f0 y6f0Var = (y6f0) this.c;
                zy11 zy11Var2 = zy11.a;
                if (jl40.l((String) obj, file.getName())) {
                    kotlinx.coroutines.channels.b.c(y6f0Var, zy11Var2);
                }
                return zy11Var2;
            case 17:
                jo90 jo90Var = (jo90) this.b;
                Locale locale = (Locale) this.c;
                v1 v1Var = (v1) obj;
                xl51 xl51Var = jo90Var.d;
                im51 im51Var = jo90Var.c;
                KPassportEnvironment kPassportEnvironment = KPassportEnvironment.PRODUCTION;
                i3y i3yVar = w0p.b;
                ((n) v1Var).a.put(kPassportEnvironment.b(), new Credentials(((String[]) i3yVar.getValue())[0], ((String[]) i3yVar.getValue())[1]));
                vot votVar = jo90Var.e;
                com.yandex.mob.b bVar2 = (com.yandex.mob.b) votVar.a.get();
                on90 on90Var = new on90(HostMobSupportedApiNames.AM_MOBILEPROXY.getApiName(), HostMobSupportedApiNames.WEBAM.getApiName());
                String str11 = votVar.b.a().a;
                Regex regex = com.yandex.mob.am.c.a;
                xn90.a.getClass();
                try {
                    com.yandex.mob.am.c.d(bVar2, on90Var, o430.E, v1Var, str11);
                } catch (Throwable unused) {
                }
                n nVar = (n) v1Var;
                nVar.e = jo90Var.b;
                xl51Var.getClass();
                nVar.f = xl51Var.a(xl51Var.d);
                nVar.g = xl51Var.a(xl51Var.e);
                nVar.j = locale;
                im51Var.getClass();
                nVar.m = true;
                nVar.n = false;
                nVar.i = null;
                nVar.h = j73.d0(new i0[]{new n0(jo90Var), new o0(jo90Var)});
                return zy11.a;
            case 18:
                return new LoyaltyProgramView(((ViewGroup) obj).getContext(), (rxz) this.b, (hba0) this.c);
            case 19:
                final wla0 wla0Var = (wla0) this.b;
                final hyi hyiVar = (hyi) this.c;
                final l1o l1oVar = (l1o) obj;
                return new okx() { // from class: ula0
                    @Override // defpackage.okx
                    public final v0x a(Object obj2) {
                        return new ila0(wla0.this.b, hyiVar.a, l1oVar.d);
                    }
                };
            case 20:
                ((qle0) this.b).b.d((oll0) obj, (nle0) this.c);
                return zy11.a;
            case 21:
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
                String str12 = (String) obj;
                i5i0 i5i0Var = ((b5i0) this.c).x;
                if (i5i0Var.d != -1) {
                    int length = str12.length();
                    int i3 = i5i0Var.d;
                    if (length > i3) {
                        str12 = gvu0.A0(i3, str12).concat("...(cut)");
                    }
                }
                linkedHashMap.put("-stack", str12);
                return zy11.a;
            case 22:
                bud budVar = (bud) this.b;
                iz40 iz40Var = (iz40) this.c;
                budVar.z(obj);
                if (iz40Var != null) {
                    iz40Var.a(obj);
                }
                return zy11.a;
            case 23:
                androidx.compose.runtime.j jVar = (androidx.compose.runtime.j) this.b;
                Throwable th3 = (Throwable) this.c;
                Throwable th4 = (Throwable) obj;
                synchronized (jVar.c) {
                    if (th3 != null) {
                        if (th4 != null) {
                            try {
                                r10 = th4 instanceof CancellationException ? null : th4;
                                if (r10 != null) {
                                    ljo.a(th3, r10);
                                }
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                        r10 = th3;
                    }
                    jVar.e = r10;
                    jVar.u.l(Recomposer$State.ShutDown);
                }
                return zy11.a;
            case 24:
                kvj0 kvj0Var2 = (kvj0) this.b;
                w2j0 w2j0Var = (w2j0) this.c;
                int i4 = kvj0Var2.w;
                ConcurrentHashMap concurrentHashMap2 = ((ek7) obj).c;
                concurrentHashMap2.put("response_code", Integer.valueOf(i4));
                String a9 = kvj0Var2.y.a("X-YaTraceId");
                if (a9 != null) {
                    concurrentHashMap2.put("trace_id", a9);
                }
                w2j0Var.getClass();
                if (i4 / 100 != 2 && i4 != 304 && i4 != 301 && i4 != 302) {
                    concurrentHashMap2.put("error_domain", "DomainError");
                    concurrentHashMap2.put("error_description", "Received error HTTP code");
                }
                return zy11.a;
            case 25:
                Object obj2 = (u0x) kotlin.collections.a.S(((OrientationAwareRecyclerView) ((nfh) this.b).b).getChildAdapterPosition((View) obj), ((cfx) this.c).f());
                if (obj2 instanceof a2t0) {
                    return (a2t0) obj2;
                }
                return null;
            case 26:
                cfx cfxVar = (cfx) this.b;
                OrientationAwareRecyclerView orientationAwareRecyclerView = (OrientationAwareRecyclerView) this.c;
                String str13 = (String) obj;
                Iterator it2 = cfxVar.f().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object obj3 = (u0x) it2.next();
                        if (!(obj3 instanceof s7u) || !jl40.l(((s7u) obj3).getItemId(), str13)) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i == -1 || (layoutManager = orientationAwareRecyclerView.getLayoutManager()) == null) {
                    return null;
                }
                return layoutManager.X(i);
            case 27:
                u0x u0xVar = (u0x) kotlin.collections.a.S(((OrientationAwareRecyclerView) ((nfh) this.b).b).getChildAdapterPosition((View) obj), ((flex.engine.section.c) this.c).J.w);
                if (u0xVar instanceof aul) {
                    return (aul) u0xVar;
                }
                return null;
            case 28:
                nd90 nd90Var = (nd90) this.b;
                nn11 nn11Var = (nn11) this.c;
                kotlinx.serialization.modules.a aVar4 = new kotlinx.serialization.modules.a();
                aVar4.g(qoi0.a(fd90.class), nd90Var);
                aVar4.g(qoi0.a(un11.class), nn11Var);
                ((acx) obj).n = aVar4.a();
                return zy11.a;
            default:
                ShortcutShimmeringDrawable shortcutShimmeringDrawable = (ShortcutShimmeringDrawable) this.b;
                View view4 = (View) this.c;
                long longValue = ((Long) obj).longValue();
                if (longValue != 0) {
                    shortcutShimmeringDrawable.getPaint().setGradientWidth(tje.u((int) longValue, view4.getContext()));
                }
                return zy11.a;
        }
    }

    public /* synthetic */ kn2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
