package defpackage;

import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final /* synthetic */ class o5o implements eg90 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o5o(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.eg90
    public final void a(Exception exc) {
        StackTraceElement stackTraceElement;
        String str;
        Integer valueOf;
        String num;
        StackTraceElement stackTraceElement2;
        String num2;
        int i = this.c;
        String str2 = "No line info";
        tjr tjrVar = tjr.d;
        Object obj = this.d;
        switch (i) {
            case 0:
                zjr zjrVar = ((p5o) obj).c;
                String type = ErrorTypes.DIVKIT_DIVDATA_DECODING_ERROR.getType();
                i3y a = xfz.a(xfz.d("EquableDivDataParser.parse", "locator"), new Pair("cause", exc), xfz.d(exc.getMessage(), DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION));
                s7s0 s7s0Var = zjrVar.c.a;
                if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName = stackTraceElement.getFileName();
                    str = fileName != null ? fileName : "No file info";
                    String methodName = stackTraceElement.getMethodName();
                    int lineNumber = stackTraceElement.getLineNumber();
                    valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                    if (valueOf != null && (num = valueOf.toString()) != null) {
                        str2 = num;
                    }
                    tjrVar = new tjr(str, methodName, str2);
                }
                zjrVar.d(FlexLogLevel.ERROR, "DivData decoding error", xfz.c(a, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
                break;
            case 1:
                k6o k6oVar = (k6o) obj;
                k6oVar.b.add(exc);
                k6oVar.a.a().a(exc);
                break;
            default:
                zjr zjrVar2 = ((s231) obj).a;
                String type2 = ErrorTypes.DIVKIT_VARIABLES_DECODING_WARNING.getType();
                i3y a2 = xfz.a(new Pair("locator", "VariablesParser.getParsedVariables"), new Pair("cause", exc));
                s7s0 s7s0Var2 = zjrVar2.c.a;
                if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName2 = stackTraceElement2.getFileName();
                    str = fileName2 != null ? fileName2 : "No file info";
                    String methodName2 = stackTraceElement2.getMethodName();
                    int lineNumber2 = stackTraceElement2.getLineNumber();
                    valueOf = lineNumber2 > 0 ? Integer.valueOf(lineNumber2) : null;
                    if (valueOf != null && (num2 = valueOf.toString()) != null) {
                        str2 = num2;
                    }
                    tjrVar = new tjr(str, methodName2, str2);
                }
                zjrVar2.d(FlexLogLevel.WARNING, "DivVariable decoding warning", xfz.c(a2, xfz.a(new Pair("errorType", type2))), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
                break;
        }
    }
}
