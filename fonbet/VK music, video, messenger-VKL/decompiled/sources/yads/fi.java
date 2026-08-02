package yads;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import xsna.pn00;

/* loaded from: classes10.dex */
public final class fi {
    public final jp2 a;
    public final boolean b;

    public fi(jp2 jp2Var, boolean z) {
        this.a = jp2Var;
        this.b = z;
    }

    public final void a(ArrayList arrayList) {
        Iterator it;
        Map map;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            oc2 oc2Var = (oc2) it2.next();
            if (this.b) {
                Lazy lazy = of.a;
                lf lfVar = oc2Var.a;
                it = it2;
                Pair pair = new Pair(new Thread("ApplicationExitInfoDetails"), new StackTraceElement[]{new StackTraceElement("ExitInfo", "timestamp", ((SimpleDateFormat) of.a.getValue()).format(new Date(lfVar.a)), 0), new StackTraceElement("ExitInfo", "description", lfVar.b, 0), new StackTraceElement("Memory", "pss", of.a(lfVar.f), 0), new StackTraceElement("Memory", "rss", of.a(lfVar.g), 0), new StackTraceElement("Process", "name", lfVar.h, 0), new StackTraceElement("Process", "pid", String.valueOf(lfVar.e), 0), new StackTraceElement("Process", "importance", String.valueOf(lfVar.d), 0), new StackTraceElement("Process", "uid", String.valueOf(lfVar.j), 0), new StackTraceElement("Process", "status", String.valueOf(lfVar.i), 0)});
                map = pn00.o(oc2Var.b, new Pair((Thread) pair.d(), (StackTraceElement[]) pair.g()));
            } else {
                it = it2;
                map = oc2Var.b;
            }
            this.a.reportAnr(map);
            it2 = it;
        }
    }
}
