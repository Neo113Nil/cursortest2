package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MultiSpanProcessor.java */
/* loaded from: classes8.dex */
public final class e640 implements qcq {
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    public e640(ArrayList arrayList) {
        this.e = arrayList;
        this.b = new ArrayList(arrayList.size());
        this.d = new ArrayList(arrayList.size());
        this.c = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fik0 fik0Var = (fik0) it.next();
            if (fik0Var.isStartRequired()) {
                this.b.add(fik0Var);
            }
            if (fik0Var instanceof qcq) {
                qcq qcqVar = (qcq) fik0Var;
                if (qcqVar.I2()) {
                    this.c.add(qcqVar);
                }
            }
            if (fik0Var.isEndRequired()) {
                this.d.add(fik0Var);
            }
        }
    }

    @Override // xsna.qcq
    public final boolean I2() {
        return !this.c.isEmpty();
    }

    @Override // xsna.fik0
    public final v7i forceFlush() {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((fik0) it.next()).forceFlush());
        }
        return v7i.d(arrayList2);
    }

    @Override // xsna.qcq
    public final void h3(rkh0 rkh0Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((qcq) it.next()).h3(rkh0Var);
        }
    }

    @Override // xsna.fik0
    public final boolean isEndRequired() {
        return !this.d.isEmpty();
    }

    @Override // xsna.fik0
    public final boolean isStartRequired() {
        return !this.b.isEmpty();
    }

    @Override // xsna.fik0
    public final void onEnd(u7f0 u7f0Var) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((fik0) it.next()).onEnd(u7f0Var);
        }
    }

    @Override // xsna.fik0
    public final void onStart(wmj wmjVar, q7f0 q7f0Var) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((fik0) it.next()).onStart(wmjVar, q7f0Var);
        }
    }

    @Override // xsna.fik0
    public final v7i shutdown() {
        if (this.f.getAndSet(true)) {
            return v7i.e;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((fik0) it.next()).shutdown());
        }
        return v7i.d(arrayList2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSpanProcessor{spanProcessorsStart=");
        sb.append(this.b);
        sb.append(", spanProcessorsEnding=");
        sb.append(this.c);
        sb.append(", spanProcessorsEnd=");
        sb.append(this.d);
        sb.append(", spanProcessorsAll=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b('}', sb, this.e);
    }
}
