package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: StepsDetailInfo.kt */
/* loaded from: classes18.dex */
public final class s0l0 {
    public final int a;
    public final float b;
    public final String c;
    public final boolean d;
    public final long e;
    public final long f;

    /* compiled from: StepsDetailInfo.kt */
    public static final class a {
        public static ArrayList a(List list) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    s0l0 s0l0Var = (s0l0) it.next();
                    x9y x9yVar = new x9y();
                    x9yVar.n("steps", Integer.valueOf(s0l0Var.a));
                    x9yVar.n("distance", Integer.valueOf((int) (s0l0Var.b * 1000)));
                    x9yVar.o("source_id", s0l0Var.c);
                    x9yVar.m(Boolean.valueOf(s0l0Var.d), "is_manual");
                    x9yVar.n("from_ts", Long.valueOf(s0l0Var.e));
                    x9yVar.n("to_ts", Long.valueOf(s0l0Var.f));
                    arrayList.add(x9yVar);
                }
            }
            return arrayList;
        }
    }

    public s0l0(int i, float f, String str, boolean z, long j, long j2) {
        this.a = i;
        this.b = f;
        this.c = str;
        this.d = z;
        this.e = j;
        this.f = j2;
    }
}
