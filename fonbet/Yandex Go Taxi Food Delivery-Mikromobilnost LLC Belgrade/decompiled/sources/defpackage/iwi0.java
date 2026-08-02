package defpackage;

import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final class iwi0 extends u5e0 {
    public final zjr d;

    public iwi0(urd urdVar) {
        super(urdVar);
        this.d = new zjr(xfz.b("RemoteTrackerParser"));
    }

    public static Pair d(sbx sbxVar) {
        w1m w1mVar = (w1m) bvf0.A(sbxVar).c(qoi0.a(w1m.class));
        u1m u1mVar = w1mVar != null ? w1mVar.a : null;
        e7j0 e7j0Var = (e7j0) bvf0.A(sbxVar).c(qoi0.a(e7j0.class));
        return new Pair(u1mVar, e7j0Var != null ? e7j0Var.a : null);
    }

    @Override // defpackage.u5e0
    public final Object b(sbx sbxVar, String str, c cVar) {
        StackTraceElement stackTraceElement;
        String str2;
        Pair d = d(sbxVar);
        String type = ErrorTypes.REMOTE_TRACKER_UNSUPPORTED.getType();
        i3y a = xfz.a(new Pair("locator", "RemoteTrackerParser"), xfz.d(str, "trackerType"));
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
        zjrVar.d(FlexLogLevel.ERROR, "Remote tracker type is unsupported", xfz.c(a, a2), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
        return new jvi0();
    }

    @Override // defpackage.u5e0
    public final Object c(sbx sbxVar, b bVar, Throwable th) {
        StackTraceElement stackTraceElement;
        String str;
        b bVar2;
        Pair d = d(sbxVar);
        c cVar = bVar instanceof c ? (c) bVar : null;
        String a = (cVar == null || (bVar2 = (b) cVar.get("type")) == null) ? null : qcx.n(bVar2).a();
        String type = ErrorTypes.REMOTE_TRACKER_DECODING_FAILED.getType();
        i3y a2 = xfz.a(new Pair("locator", "RemoteTrackerParser"), new Pair("cause", th), xfz.d(th.getMessage(), DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION), xfz.d(a, "trackerType"));
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
        zjrVar.d(FlexLogLevel.ERROR, "Remote tracker parsing failed", xfz.c(a2, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
        return new jvi0();
    }
}
