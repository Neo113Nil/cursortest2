package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import kotlin.time.DurationUnit;
import xsna.zno;

/* compiled from: UploadFileSendQueue.kt */
/* loaded from: classes8.dex */
public final class ibq0 {
    public final mrk0 a;
    public final kq b;
    public final i100 c;
    public final PriorityQueue<a> d = new PriorityQueue<>();

    /* compiled from: UploadFileSendQueue.kt */
    public static final class a implements Comparable<a> {
        public final long b;
        public final int c;
        public final long d;
        public final dbq0 e;

        public a(long j, int i, long j2, dbq0 dbq0Var) {
            this.b = j;
            this.c = i;
            this.d = j2;
            this.e = dbq0Var;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            izs[] izsVarArr = {fbq0.b, gbq0.b, hbq0.b};
            for (int i = 0; i < 3; i++) {
                izs izsVar = izsVarArr[i];
                int b = jw5.b((Comparable) izsVar.invoke(this), (Comparable) izsVar.invoke(aVar2));
                if (b != 0) {
                    return b;
                }
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + bh10.a(shy.a(this.c, Long.hashCode(this.b) * 31, 31), 31, this.d);
        }

        public final String toString() {
            StringBuilder a = eq0.a(this.c, "Item(sendTime=", ", priority=", this.b);
            tj0.d(a, ", logTimestamp=", this.d, ", uploadFile=");
            a.append(this.e);
            a.append(")");
            return a.toString();
        }
    }

    public ibq0(mrk0 mrk0Var, kq kqVar, up70 up70Var) {
        this.a = mrk0Var;
        this.b = kqVar;
        this.c = up70Var;
    }

    public final void a(xti0 xti0Var) {
        synchronized (this.d) {
            try {
                this.c.o("UploadFileSendQueue", new yei0(xti0Var, 9));
                PriorityQueue<a> priorityQueue = this.d;
                ArrayList arrayList = new ArrayList();
                Iterator<a> it = priorityQueue.iterator();
                while (it.hasNext()) {
                    a next = it.next();
                    if (epx.f(next.e.b, xti0Var)) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    this.d.remove((a) it2.next());
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((a) it3.next()).e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long b(dbq0 dbq0Var) {
        int i = dbq0Var.f;
        if (i == 0) {
            return 0L;
        }
        int min = Math.min(i, this.a.k);
        zno.a aVar = zno.c;
        this.b.getClass();
        long f = eoo.f(System.currentTimeMillis(), DurationUnit.MILLISECONDS);
        DurationUnit durationUnit = DurationUnit.SECONDS;
        return zno.e(eoo.f(zno.l(f, durationUnit) + (r0.l * (1 << (min - 1))), durationUnit));
    }

    public final boolean c(final dbq0 dbq0Var) {
        boolean add;
        synchronized (this.d) {
            this.c.o("UploadFileSendQueue", new tfm0(dbq0Var, 6));
            final long b = b(dbq0Var);
            this.c.o("UploadFileSendQueue", new gzs() { // from class: xsna.ebq0
                @Override // xsna.gzs
                public final Object invoke() {
                    return "put: calculated sendTime= " + b + " for file " + dbq0Var.a;
                }
            });
            add = this.d.add(new a(b, 1, dbq0Var.c, dbq0Var));
        }
        return add;
    }
}
