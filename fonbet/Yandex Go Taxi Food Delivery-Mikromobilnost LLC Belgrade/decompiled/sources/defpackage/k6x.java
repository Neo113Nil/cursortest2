package defpackage;

import android.os.Looper;
import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class k6x {
    public final zjr a = new zjr(xfz.b(k6x.class.getSimpleName()));
    public d6x b = new d6x(w6x.a, t6x.a);
    public final ArrayList c = new ArrayList();
    public boolean d;
    public d6x e;

    public final boolean a() {
        StackTraceElement stackTraceElement;
        String str;
        boolean isCurrentThread = Looper.getMainLooper().isCurrentThread();
        if (!isCurrentThread) {
            String type = ErrorTypes.JS_UPDATE_NON_MAIN_THREAD.getType();
            i3y a = xfz.a(new Pair("locator", "JasonStateStore.update()"), new Pair("currentThreadName", Thread.currentThread().getName()));
            zjr zjrVar = this.a;
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
            tjr tjrVar2 = tjrVar;
            zjrVar.d(FlexLogLevel.ERROR, "JasonStatham must be used on main thread", xfz.c(a, a2), EmptyList.a, tjrVar2.a, tjrVar2.b, tjrVar2.c);
        }
        return isCurrentThread;
    }

    public final d6x b() {
        d6x d6xVar = this.e;
        return d6xVar == null ? this.b : d6xVar;
    }

    public final j6x c(i6x i6xVar) {
        if (!a()) {
            return new qir(20);
        }
        this.c.add(i6xVar);
        i6xVar.a(this.b);
        return new e89(3, this, i6xVar);
    }

    public final d6x d(tls tlsVar) {
        if (!a()) {
            return b();
        }
        d6x d6xVar = (d6x) tlsVar.invoke(b());
        return jl40.l(d6xVar, b()) ? b() : e(d6xVar);
    }

    public final d6x e(d6x d6xVar) {
        StackTraceElement stackTraceElement;
        String str;
        if (this.d) {
            this.e = d6xVar;
        } else {
            if (!jl40.l(this.b, d6xVar)) {
                this.d = true;
                this.b = d6xVar;
                Iterator it = a.J0(this.c).iterator();
                while (it.hasNext()) {
                    try {
                        ((i6x) it.next()).a(this.b);
                    } catch (Throwable th) {
                        String type = ErrorTypes.JS_STATE_STORE_OBSERVER_NOTIFY_FAILED.getType();
                        i3y a = xfz.a(xfz.d(th.getMessage(), "responseMessage"));
                        zjr zjrVar = this.a;
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
                        zjrVar.d(FlexLogLevel.WARNING, "JasonState update failed: observer threw exception while processing new state", xfz.c(a, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
                    }
                }
                this.d = false;
            }
            d6x d6xVar2 = this.e;
            if (d6xVar2 != null) {
                this.e = null;
                e(d6xVar2);
            }
        }
        return this.b;
    }
}
