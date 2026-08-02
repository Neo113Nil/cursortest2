package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import flex.logger.FlexLogLevel;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes9.dex */
public final class pol0 extends t {
    public final zjr D;

    public pol0(pey peyVar) {
        super(peyVar, true);
        this.D = new zjr(xfz.b("SafeEngineLifecycleRegistry"));
    }

    @Override // androidx.lifecycle.t
    public final void g(Lifecycle.Event event) {
        StackTraceElement stackTraceElement;
        String str;
        Integer valueOf;
        String num;
        StackTraceElement stackTraceElement2;
        String num2;
        Lifecycle.State state = this.w;
        Lifecycle.State state2 = Lifecycle.State.INITIALIZED;
        String str2 = "No line info";
        EmptyList emptyList = EmptyList.a;
        zjr zjrVar = this.D;
        tjr tjrVar = tjr.d;
        if (state == state2 && event.compareTo(Lifecycle.Event.ON_STOP) >= 0) {
            i3y a = xfz.a(new Pair(ClidProvider.STATE, this.w), new Pair(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, event));
            s7s0 s7s0Var = zjrVar.c.a;
            if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                String fileName = stackTraceElement2.getFileName();
                str = fileName != null ? fileName : "No file info";
                String methodName = stackTraceElement2.getMethodName();
                int lineNumber = stackTraceElement2.getLineNumber();
                valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                if (valueOf != null && (num2 = valueOf.toString()) != null) {
                    str2 = num2;
                }
                tjrVar = new tjr(str, methodName, str2);
            }
            zjrVar.d(FlexLogLevel.DEBUG, "Incorrect lifecycle event handled: tried to destroy engine before correct initialization. This may happen when called `detachFromContainer()` right after `attachToContainer()`.", a, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
            return;
        }
        Lifecycle.State state3 = this.w;
        if (state3 != Lifecycle.State.DESTROYED) {
            super.g(event);
            return;
        }
        i3y a2 = xfz.a(new Pair(ClidProvider.STATE, state3), new Pair(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, event));
        s7s0 s7s0Var2 = zjrVar.c.a;
        if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName2 = stackTraceElement.getFileName();
            str = fileName2 != null ? fileName2 : "No file info";
            String methodName2 = stackTraceElement.getMethodName();
            int lineNumber2 = stackTraceElement.getLineNumber();
            valueOf = lineNumber2 > 0 ? Integer.valueOf(lineNumber2) : null;
            if (valueOf != null && (num = valueOf.toString()) != null) {
                str2 = num;
            }
            tjrVar = new tjr(str, methodName2, str2);
        }
        zjrVar.d(FlexLogLevel.DEBUG, "Incorrect lifecycle event handled: tried to modify state after engine destruction. This could happen when engine obtains commands despite its destruction or was not detached from container.", a2, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
    }
}
