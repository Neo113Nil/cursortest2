package com.yandex.div.core.view2.errors;

import com.yandex.div.DivDataTag;
import com.yandex.div.internal.KLog;
import com.yandex.div.json.ParsingException;
import com.yandex.div.logging.Severity;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import xsna.izs;
import xsna.j5g;
import xsna.mnh0;

/* compiled from: LogcatErrorDumper.kt */
/* loaded from: classes7.dex */
public final class LogcatErrorDumper {
    private final Set<Throwable> loggedErrors = new LinkedHashSet();
    private final Set<Throwable> loggedWarnings = new LinkedHashSet();

    private final String errorsToDetails(List<? extends Throwable> list) {
        return j5g.g0(list, "\n", null, null, 0, new izs<Throwable, CharSequence>() { // from class: com.yandex.div.core.view2.errors.LogcatErrorDumper$errorsToDetails$1
            @Override // xsna.izs
            public final CharSequence invoke(Throwable th) {
                if (!(th instanceof ParsingException)) {
                    return " - ".concat(mnh0.A(th));
                }
                return " - " + ((ParsingException) th).getReason() + ": " + mnh0.A(th);
            }
        }, 30);
    }

    public final void logErrors(List<? extends Throwable> list, List<? extends Throwable> list2, DivDataTag divDataTag) {
        if (list.isEmpty() && list2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.loggedErrors.add((Throwable) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (this.loggedWarnings.add((Throwable) obj2)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList.isEmpty()) {
            KLog kLog = KLog.INSTANCE;
            Severity severity = Severity.ERROR;
            if (kLog.isAtLeast(severity)) {
                kLog.print(6, "ErrorVisualMonitor", "=== DIV VISUAL ERROR MONITOR - NEW ERRORS DETECTED ===");
            }
            if (kLog.isAtLeast(severity)) {
                kLog.print(6, "ErrorVisualMonitor", errorsToDetails(arrayList));
            }
        }
        if (!arrayList2.isEmpty()) {
            KLog kLog2 = KLog.INSTANCE;
            Severity severity2 = Severity.WARNING;
            if (kLog2.isAtLeast(severity2)) {
                kLog2.print(5, "ErrorVisualMonitor", "=== DIV VISUAL ERROR MONITOR - NEW WARNINGS DETECTED ===");
            }
            if (kLog2.isAtLeast(severity2)) {
                kLog2.print(5, "ErrorVisualMonitor", errorsToDetails(arrayList2));
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return;
        }
        KLog kLog3 = KLog.INSTANCE;
        if (kLog3.isAtLeast(Severity.INFO)) {
            kLog3.print(4, "ErrorVisualMonitor", "DataTag '" + divDataTag + "'. New errors: " + arrayList.size() + ", New warnings: " + arrayList2.size() + ". Total errors: " + list.size() + ", Total warnings: " + list2.size());
        }
    }
}
