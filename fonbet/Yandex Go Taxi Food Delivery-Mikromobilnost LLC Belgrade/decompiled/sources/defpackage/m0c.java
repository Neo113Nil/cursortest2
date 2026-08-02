package defpackage;

import flex.engine.a;
import flex.logger.FlexLogLevel;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public final class m0c implements dw {
    public final ryl a;

    public m0c(int i) {
        i3y i3yVar = ryl.c;
        this.a = ck91.b();
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        StackTraceElement stackTraceElement;
        String str;
        ryl rylVar = this.a;
        ConcurrentHashMap concurrentHashMap = rylVar.b;
        Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            a aVar = ((uyl) it.next()).c;
            if (!aVar.j0) {
                aVar.i();
            }
        }
        concurrentHashMap.clear();
        zjr zjrVar = rylVar.a;
        i3y b = ryl.b(rylVar, null, null, 3);
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
        zjrVar.d(FlexLogLevel.DEBUG, "Storage cleaned", b, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
    }

    public m0c() {
        this(0);
    }
}
