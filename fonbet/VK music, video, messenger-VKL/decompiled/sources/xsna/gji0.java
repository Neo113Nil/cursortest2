package xsna;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import one.video.streaming.tools.TimeMachine;

/* compiled from: SendStream.java */
/* loaded from: classes8.dex */
public final class gji0 implements Comparable<gji0> {
    public final l190 b;
    public final int c;
    public final int f;
    public int h;
    public boolean i;
    public final TimeMachine j;
    public final PriorityQueue d = new PriorityQueue();
    public final PriorityQueue e = new PriorityQueue();
    public final int g = 1;

    /* compiled from: SendStream.java */
    public static class a implements Comparable<a> {
        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            aVar.getClass();
            return 0;
        }

        public final String toString() {
            return "0:(0:0)/0/0";
        }
    }

    public gji0(TimeMachine timeMachine, int i, AtomicLong atomicLong, int i2) {
        this.j = timeMachine;
        this.c = i;
        this.b = new l190(timeMachine, atomicLong);
        this.f = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(gji0 gji0Var) {
        long j = this.f;
        long j2 = gji0Var.f;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{ id=");
        sb.append(this.c);
        sb.append(" prio=");
        sb.append(this.f);
        sb.append(" mustEncrypt=");
        sb.append(this.i);
        sb.append(" dataBytesSent=0 retransmitBytesSent=0 sendDropSN=");
        sb.append(this.h);
        sb.append(" minNonTransmittedSN=0 speculativeRetransmitIdx=");
        sb.append(this.g);
        sb.append(" q: ");
        PriorityQueue priorityQueue = this.d;
        if (!priorityQueue.isEmpty()) {
            a[] aVarArr = (a[]) priorityQueue.toArray(new a[priorityQueue.size()]);
            Arrays.sort(aVarArr);
            for (a aVar : aVarArr) {
                sb.append(aVar);
                sb.append(" ");
            }
        }
        sb.append(" fr: ");
        PriorityQueue priorityQueue2 = this.e;
        if (!priorityQueue2.isEmpty()) {
            a[] aVarArr2 = (a[]) priorityQueue2.toArray(new a[priorityQueue2.size()]);
            Arrays.sort(aVarArr2);
            for (a aVar2 : aVarArr2) {
                sb.append(aVar2);
                sb.append(" ");
            }
        }
        sb.append("; buffer: ");
        sb.append(this.b);
        sb.append(" }");
        return sb.toString();
    }
}
