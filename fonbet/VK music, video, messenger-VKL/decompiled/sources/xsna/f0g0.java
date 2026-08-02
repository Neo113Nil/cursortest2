package xsna;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* compiled from: ReorderingBufferQueue.java */
/* loaded from: classes12.dex */
public final class f0g0 {
    public final b a;
    public final ArrayDeque<xi90> b = new ArrayDeque<>();
    public final ArrayDeque<a> c = new ArrayDeque<>();
    public final PriorityQueue<a> d = new PriorityQueue<>();
    public int e = -1;

    @Nullable
    public a f;

    /* compiled from: ReorderingBufferQueue.java */
    public static final class a implements Comparable<a> {
        public long c = C.TIME_UNSET;
        public final ArrayList b = new ArrayList();

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            return Long.compare(this.c, aVar.c);
        }
    }

    /* compiled from: ReorderingBufferQueue.java */
    public interface b {
        void b(long j, xi90 xi90Var);
    }

    public f0g0(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r9 < r1.c) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, xi90 xi90Var) {
        int i;
        if (j != C.TIME_UNSET && (i = this.e) != 0) {
            PriorityQueue<a> priorityQueue = this.d;
            if (i != -1 && priorityQueue.size() >= this.e) {
                a peek = priorityQueue.peek();
                String str = y2r0.a;
            }
            ArrayDeque<xi90> arrayDeque = this.b;
            xi90 xi90Var2 = arrayDeque.isEmpty() ? new xi90() : arrayDeque.pop();
            xi90Var2.M(xi90Var.a());
            System.arraycopy(xi90Var.a, xi90Var.b, xi90Var2.a, 0, xi90Var2.a());
            a aVar = this.f;
            if (aVar != null && j == aVar.c) {
                aVar.b.add(xi90Var2);
                return;
            }
            ArrayDeque<a> arrayDeque2 = this.c;
            a aVar2 = arrayDeque2.isEmpty() ? new a() : arrayDeque2.pop();
            ArrayList arrayList = aVar2.b;
            fxc0.p(j != C.TIME_UNSET);
            fxc0.z(arrayList.isEmpty());
            aVar2.c = j;
            arrayList.add(xi90Var2);
            priorityQueue.add(aVar2);
            this.f = aVar2;
            int i2 = this.e;
            if (i2 != -1) {
                b(i2);
                return;
            }
            return;
        }
        this.a.b(j, xi90Var);
    }

    public final void b(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue<a> priorityQueue = this.d;
            if (priorityQueue.size() <= i) {
                return;
            }
            a poll = priorityQueue.poll();
            String str = y2r0.a;
            int i2 = 0;
            while (true) {
                arrayList = poll.b;
                if (i2 >= arrayList.size()) {
                    break;
                }
                this.a.b(poll.c, (xi90) arrayList.get(i2));
                this.b.push((xi90) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            a aVar = this.f;
            if (aVar != null && aVar.c == poll.c) {
                this.f = null;
            }
            this.c.push(poll);
        }
    }

    public final void c(int i) {
        fxc0.z(i >= 0);
        this.e = i;
        b(i);
    }
}
