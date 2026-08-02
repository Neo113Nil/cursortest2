package xsna;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Stat.kt */
/* loaded from: classes11.dex */
public abstract class irk0 {
    public static final ktr a = new ktr();
    public static final g2w b = new g2w(1);

    /* compiled from: Stat.kt */
    public static final class a {
        public final dti a;
        public final List<eta0> b;
        public final qo c;
        public final vhk0 d;
        public final apl e;
        public final long f = TimeUnit.HOURS.toMillis(12);
        public long g = 33000;
        public long h;
        public long i;
        public double j;
        public boolean k;

        public a(dti dtiVar, List list, qo qoVar, vhk0 vhk0Var, apl aplVar, pu2 pu2Var, tb3 tb3Var, ib3 ib3Var, jb3 jb3Var, boolean z) {
            this.a = dtiVar;
            this.b = list;
            this.c = qoVar;
            this.d = vhk0Var;
            this.e = aplVar;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.h = timeUnit.toMillis(120L);
            this.i = timeUnit.toMillis(45L);
        }
    }

    public abstract void a(rrk0 rrk0Var, boolean z, boolean z2, Long l);
}
