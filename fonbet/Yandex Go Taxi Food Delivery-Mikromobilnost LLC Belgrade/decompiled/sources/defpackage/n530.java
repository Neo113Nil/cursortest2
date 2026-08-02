package defpackage;

import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class n530 implements wu, dez {
    public final rid a;
    public final xu b;
    public final txl c;
    public final sls w;
    public final sls x;
    public final zjr y = new zjr(xfz.b(n530.class.getSimpleName()));

    public n530(rid ridVar, xu xuVar, txl txlVar, sls slsVar, sls slsVar2) {
        this.a = ridVar;
        this.b = xuVar;
        this.c = txlVar;
        this.w = slsVar;
        this.x = slsVar2;
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.y;
    }

    @Override // defpackage.wu
    public final void b(kr krVar, pxl pxlVar, Map map) {
        StackTraceElement stackTraceElement;
        String str;
        if (!map.containsKey("dispatchStartTime")) {
            map = b.n(map, gw00.e(new Pair("dispatchStartTime", this.x.invoke())));
        }
        Map map2 = map;
        rid ridVar = this.a;
        txl txlVar = this.c;
        dw handler = ridVar.handler(krVar, txlVar);
        xu xuVar = this.b;
        if (handler != null) {
            try {
                ((dw) s8o.W(this, handler)).handle(krVar, new n6u((ywl) this.w.invoke(), pxlVar, this, txlVar, map2));
                return;
            } catch (Throwable th) {
                xuVar.k(krVar, th);
                return;
            }
        }
        xuVar.k(krVar, new IllegalArgumentException("Unsupported action"));
        String type = ErrorTypes.ACTION_HANDLER_NOT_FOUND.getType();
        i3y a = xfz.a(new Pair("locator", "ModularActionDispatcher.dispatch"), new Pair("actionType", krVar.getClass().getSimpleName()));
        zjr zjrVar = this.y;
        s7s0 s7s0Var = zjrVar.c.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        tjr tjrVar = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str);
        }
        i3y a2 = xfz.a(new Pair("errorType", type));
        zjrVar.d(FlexLogLevel.ERROR, "Failed to dispatch action: action handler not found", xfz.c(a, a2), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
    }
}
