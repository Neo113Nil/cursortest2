package defpackage;

import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final class imm0 implements dw, dez {
    public final k6x a;
    public final u4x b;
    public final zjr c = new zjr(xfz.b(imm0.class.getSimpleName()));

    public imm0(k6x k6xVar, u4x u4xVar) {
        this.a = k6xVar;
        this.b = u4xVar;
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.c;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        StackTraceElement stackTraceElement;
        String str;
        String num;
        StackTraceElement stackTraceElement2;
        String num2;
        Object obj;
        StackTraceElement stackTraceElement3;
        String str2;
        tjr tjrVar;
        kr krVar2;
        gmm0 gmm0Var = (gmm0) krVar;
        pxl pxlVar = n6uVar.b;
        ArrayList arrayList = new ArrayList();
        this.a.d(new ga1(14, this, gmm0Var, arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g5x g5xVar = (g5x) it.next();
            String str3 = g5xVar.a;
            boolean equals = str3.equals("dispatch-effect");
            String str4 = "No line info";
            EmptyList emptyList = EmptyList.a;
            zjr zjrVar = this.c;
            tjr tjrVar2 = tjr.d;
            if (equals) {
                try {
                    String str5 = (String) g5xVar.b;
                    Map map = gmm0Var.b;
                    if (map != null && (krVar2 = (kr) map.get(str5)) != null) {
                        n6uVar.c.b(krVar2, pxlVar, n6uVar.e);
                    }
                    Map map2 = gmm0Var.b;
                    if (map2 == null || (obj = map2.keySet()) == null) {
                        obj = EmptySet.a;
                    }
                    String type = ErrorTypes.JS_SCENARIO_MISSING_EFFECT.getType();
                    i3y a = xfz.a(new Pair("eventName", str3), new Pair("existingEffects", obj));
                    s7s0 s7s0Var = zjrVar.c.a;
                    if (Boolean.FALSE.booleanValue() && (stackTraceElement3 = (StackTraceElement) j73.G(0, new Throwable().getStackTrace())) != null) {
                        String fileName = stackTraceElement3.getFileName();
                        if (fileName == null) {
                            fileName = "No file info";
                        }
                        String methodName = stackTraceElement3.getMethodName();
                        int lineNumber = stackTraceElement3.getLineNumber();
                        Integer valueOf = Integer.valueOf(lineNumber);
                        if (lineNumber <= 0) {
                            valueOf = null;
                        }
                        if (valueOf == null || (str2 = valueOf.toString()) == null) {
                            str2 = "No line info";
                        }
                        tjrVar = new tjr(fileName, methodName, str2);
                    } else {
                        tjrVar = tjrVar2;
                    }
                    zjrVar.d(FlexLogLevel.ERROR, "Effect for event is missing", xfz.c(a, xfz.a(new Pair("errorType", type))), emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
                } catch (Exception e) {
                    String p = oyr.p("Failed dispatching of effect after script '", gmm0Var.a.a, "'");
                    i3y a2 = xfz.a(xfz.d(e.getMessage(), DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION));
                    s7s0 s7s0Var2 = zjrVar.c.a;
                    if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                        String fileName2 = stackTraceElement2.getFileName();
                        str = fileName2 != null ? fileName2 : "No file info";
                        String methodName2 = stackTraceElement2.getMethodName();
                        int lineNumber2 = stackTraceElement2.getLineNumber();
                        Integer valueOf2 = lineNumber2 > 0 ? Integer.valueOf(lineNumber2) : null;
                        if (valueOf2 != null && (num2 = valueOf2.toString()) != null) {
                            str4 = num2;
                        }
                        tjrVar2 = new tjr(str, methodName2, str4);
                    }
                    tjr tjrVar3 = tjrVar2;
                    zjrVar.d(FlexLogLevel.DEBUG, p, a2, emptyList, tjrVar3.a, tjrVar3.b, tjrVar3.c);
                }
            } else {
                String type2 = ErrorTypes.JS_SCENARIO_UNEXPECTED_EVENT.getType();
                i3y a3 = xfz.a(new Pair("eventName", str3), new Pair("expectedEvent", "Expecting dispatch-effect event"));
                s7s0 s7s0Var3 = zjrVar.c.a;
                if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName3 = stackTraceElement.getFileName();
                    str = fileName3 != null ? fileName3 : "No file info";
                    String methodName3 = stackTraceElement.getMethodName();
                    int lineNumber3 = stackTraceElement.getLineNumber();
                    Integer valueOf3 = Integer.valueOf(lineNumber3);
                    if (lineNumber3 <= 0) {
                        valueOf3 = null;
                    }
                    if (valueOf3 != null && (num = valueOf3.toString()) != null) {
                        str4 = num;
                    }
                    tjrVar2 = new tjr(str, methodName3, str4);
                }
                tjr tjrVar4 = tjrVar2;
                zjrVar.d(FlexLogLevel.WARNING, "Unexpected event", xfz.c(a3, xfz.a(new Pair("errorType", type2))), emptyList, tjrVar4.a, tjrVar4.b, tjrVar4.c);
            }
        }
    }
}
