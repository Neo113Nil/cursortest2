package defpackage;

import android.location.LocationManager;
import androidx.core.location.LocationListenerCompat;
import androidx.core.location.j;
import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.banners.model.g;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final /* synthetic */ class hn2 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ hn2(on2 on2Var, h3y h3yVar, ey2 ey2Var, h3y h3yVar2) {
        this.a = 0;
        this.b = on2Var;
        this.c = h3yVar;
        this.x = ey2Var;
        this.w = h3yVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sls
    public final Object invoke() {
        Object failure;
        yvf0 yvf0Var;
        StackTraceElement stackTraceElement;
        String str;
        String num;
        StackTraceElement stackTraceElement2;
        String num2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.x;
        Object obj2 = this.w;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                on2 on2Var = (on2) obj4;
                OkHttpClient okHttpClient = (OkHttpClient) on2Var.j.getValue();
                bgo bgoVar = (nxf0) on2Var.i.getValue();
                gxf0 gxf0Var = (gxf0) ((h3y) obj3).get();
                p8w[] p8wVarArr = {on2Var.h, (ey2) obj, on2Var.g, ((h3y) obj2).get()};
                OkHttpClient.a b = okHttpClient.b();
                ((qot) gxf0Var).a(b, null);
                for (int i2 = 0; i2 < 4; i2++) {
                    b.a(p8wVarArr[i2]);
                }
                if (bgoVar != null) {
                    b.d(bgoVar);
                }
                return new OkHttpClient(b);
            case 1:
                is4 is4Var = (is4) obj4;
                qu4 qu4Var = (qu4) obj3;
                b7 b7Var = (b7) obj2;
                duc ducVar = (duc) obj;
                iu4 iu4Var = qu4Var.a;
                return new c(is4Var, iu4Var.b(), new yvi0(qu4Var), iu4Var.l, iu4Var.j, (g) iu4Var.H.getValue(), b7Var, iu4Var.t, ducVar, qu4Var.i, qu4Var.j, qu4Var.k, qu4Var.l, iu4Var.i);
            case 2:
                tls tlsVar = (tls) obj4;
                sls slsVar = (sls) obj;
                try {
                    j.b((LocationManager) obj3, (LocationListenerCompat) obj2);
                    slsVar.invoke();
                    failure = zy11Var;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    tlsVar.invoke(a);
                }
                return zy11Var;
            case 3:
                ra00 ra00Var = (ra00) obj4;
                h3y h3yVar = (h3y) obj2;
                h3y h3yVar2 = (h3y) obj;
                ic00 ic00Var = ((kc00) ((jc00) ((h3y) obj3).get())).a;
                ic00Var.getClass();
                if (ic00Var instanceof hc00) {
                    yvf0Var = ra00Var.e;
                } else {
                    ((mn51) h3yVar.get()).getClass();
                    ((i3a) h3yVar2.get()).getClass();
                    ra00Var.b.getClass();
                    ra00Var.a.getClass();
                    yvf0Var = ra00Var.d;
                }
                return (g60) yvf0Var.get();
            default:
                ze11 ze11Var = (ze11) obj4;
                d6x d6xVar = (d6x) obj3;
                wu wuVar = (wu) obj2;
                pxl pxlVar = (pxl) obj;
                LinkedHashMap linkedHashMap = ze11Var.c;
                zjr zjrVar = ze11Var.b;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Pair pair = new Pair(entry.getKey(), entry.getValue());
                    le11 le11Var = (le11) pair.getSecond();
                    f5x a2 = ze11Var.a.a(le11Var.b(), d6xVar);
                    boolean z = a2 instanceof e5x;
                    String str2 = "No line info";
                    EmptyList emptyList = EmptyList.a;
                    tjr tjrVar = tjr.d;
                    if (z) {
                        Object obj5 = ((e5x) a2).c;
                        if (!(obj5 instanceof Boolean)) {
                            String type = ErrorTypes.JS_SCENARIO_TRIGGER_NONBOOLEAN_RESULT.getType();
                            i3y a3 = xfz.a(xfz.d(obj5 != null ? obj5.getClass().getSimpleName() : null, "unexpectedResult"), new Pair("triggerConditionName", le11Var.b().a));
                            s7s0 s7s0Var = zjrVar.c.a;
                            if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                                String fileName = stackTraceElement.getFileName();
                                str = fileName != null ? fileName : "No file info";
                                String methodName = stackTraceElement.getMethodName();
                                int lineNumber = stackTraceElement.getLineNumber();
                                Integer valueOf = Integer.valueOf(lineNumber);
                                if (lineNumber <= 0) {
                                    valueOf = null;
                                }
                                if (valueOf != null && (num = valueOf.toString()) != null) {
                                    str2 = num;
                                }
                                tjrVar = new tjr(str, methodName, str2);
                            }
                            tjr tjrVar2 = tjrVar;
                            zjrVar.d(FlexLogLevel.ERROR, "Trigger condition returns non-boolean result", xfz.c(a3, xfz.a(new Pair("errorType", type))), emptyList, tjrVar2.a, tjrVar2.b, tjrVar2.c);
                        } else if (((Boolean) obj5).booleanValue()) {
                            wuVar.b(le11Var.a(), pxlVar, b.f());
                        }
                    } else {
                        if (!(a2 instanceof d5x)) {
                            w511.b();
                            return null;
                        }
                        String type2 = ErrorTypes.JS_SCENARIO_TRIGGER_CONDITION_FAILED.getType();
                        d5x d5xVar = (d5x) a2;
                        ze11 ze11Var2 = ze11Var;
                        i3y a4 = xfz.a(new Pair("triggerConditionName", le11Var.b().a), new Pair("cause", d5xVar.a()), new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, d5xVar.a().getMessage()));
                        s7s0 s7s0Var2 = zjrVar.c.a;
                        if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                            String fileName2 = stackTraceElement2.getFileName();
                            str = fileName2 != null ? fileName2 : "No file info";
                            String methodName2 = stackTraceElement2.getMethodName();
                            int lineNumber2 = stackTraceElement2.getLineNumber();
                            Integer valueOf2 = Integer.valueOf(lineNumber2);
                            if (lineNumber2 <= 0) {
                                valueOf2 = null;
                            }
                            if (valueOf2 != null && (num2 = valueOf2.toString()) != null) {
                                str2 = num2;
                            }
                            tjrVar = new tjr(str, methodName2, str2);
                        }
                        tjr tjrVar3 = tjrVar;
                        zjrVar.d(FlexLogLevel.ERROR, "Trigger condition check failed with error", xfz.c(a4, xfz.a(new Pair("errorType", type2))), emptyList, tjrVar3.a, tjrVar3.b, tjrVar3.c);
                        ze11Var = ze11Var2;
                    }
                }
                return zy11Var;
        }
    }

    public /* synthetic */ hn2(h3y h3yVar, ra00 ra00Var, h3y h3yVar2, h3y h3yVar3) {
        this.a = 3;
        this.c = h3yVar;
        this.b = ra00Var;
        this.w = h3yVar2;
        this.x = h3yVar3;
    }

    public /* synthetic */ hn2(y6f0 y6f0Var, tls tlsVar, LocationManager locationManager, LocationListenerCompat locationListenerCompat, sls slsVar) {
        this.a = 2;
        this.b = tlsVar;
        this.c = locationManager;
        this.w = locationListenerCompat;
        this.x = slsVar;
    }

    public /* synthetic */ hn2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }
}
