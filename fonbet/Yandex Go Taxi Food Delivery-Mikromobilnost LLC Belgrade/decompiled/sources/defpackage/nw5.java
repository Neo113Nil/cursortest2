package defpackage;

import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final class nw5 extends u5e0 {
    public final zjr d;

    public nw5() {
        super(new ow5());
        this.d = new zjr(xfz.b("BindingMethodParser"));
    }

    @Override // defpackage.u5e0
    public final Object b(sbx sbxVar, String str, c cVar) {
        StackTraceElement stackTraceElement;
        String str2;
        String type = ErrorTypes.DIVKIT_UNSUPPORTED_BINDING_METHOD.getType();
        i3y a = xfz.a(new Pair("locator", "BindingMethodParser.parse"), new Pair("bindingMethodType", str));
        zjr zjrVar = this.d;
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
            if (valueOf == null || (str2 = valueOf.toString()) == null) {
                str2 = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str2);
        }
        i3y a2 = xfz.a(new Pair("errorType", type));
        zjrVar.d(FlexLogLevel.WARNING, "BindingMethod is unsupported", xfz.c(a, a2), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
        return new g0x0();
    }

    @Override // defpackage.u5e0
    public final Object c(sbx sbxVar, b bVar, Throwable th) {
        StackTraceElement stackTraceElement;
        String str;
        b bVar2;
        String type = ErrorTypes.DIVKIT_CORRUPTED_BINDING_METHOD.getType();
        i3y a = xfz.a(new Pair("locator", "BindingMethodParser.parse"), new Pair("cause", th), xfz.d((!(bVar instanceof c) || (bVar2 = (b) ((c) bVar).get("type")) == null) ? null : qcx.n(bVar2).a(), "animationType"), xfz.d(th.getMessage(), DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION));
        zjr zjrVar = this.d;
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
            Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str);
        }
        zjrVar.d(FlexLogLevel.ERROR, "BindingMethod is corrupted", xfz.c(a, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
        return new g0x0();
    }
}
