package xsna;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import xsna.i11;

/* compiled from: VideoAdPixelTracker.kt */
/* loaded from: classes6.dex */
public abstract class rzr0 {
    public final gzs<Integer> a;
    public final zi0 b;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final CopyOnWriteArrayList<i11> e = new CopyOnWriteArrayList<>();
    public final PriorityQueue<i11.d.b> f;

    public rzr0(gzs<Integer> gzsVar, zi0 zi0Var) {
        this.a = gzsVar;
        this.b = zi0Var;
        final yh3 yh3Var = new yh3(this);
        this.f = new PriorityQueue<>(11, new Comparator() { // from class: xsna.qzr0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Number) yh3.this.invoke(obj, obj2)).intValue();
            }
        });
    }

    public static boolean H(i11.d dVar, int i) {
        if (dVar instanceof i11.d.a) {
            return true;
        }
        if (!(dVar instanceof i11.d.c)) {
            return false;
        }
        i11.d.c cVar = (i11.d.c) dVar;
        int i2 = cVar.c;
        boolean z = cVar.d;
        if (!z || i < i2) {
            return !z && i < i2;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList2 = this.c;
            ArrayList arrayList3 = this.d;
            if (!hasNext) {
                w8m0 w8m0Var = new w8m0(1);
                g5g.L(arrayList3, w8m0Var);
                g5g.L(arrayList2, w8m0Var);
                return;
            }
            i11 i11Var = (i11) it.next();
            if (i11Var instanceof i11.d.b) {
                this.f.add(i11Var);
            } else {
                boolean z = i11Var instanceof i11.d;
                if (z && ((i11.d) i11Var).c()) {
                    arrayList3.add(i11Var);
                } else if (!z || ((i11.d) i11Var).c()) {
                    this.e.add(i11Var);
                } else {
                    arrayList2.add(i11Var);
                }
            }
        }
    }

    public final void F() {
        zi0 zi0Var = this.b;
        if (zi0Var.a) {
            zi0Var.a = false;
            Iterator<i11> it = this.e.iterator();
            while (it.hasNext()) {
                i11 next = it.next();
                if (next instanceof i11.b) {
                    O(next);
                }
            }
        }
    }

    public final void G() {
        zi0 zi0Var = this.b;
        if (zi0Var.a) {
            return;
        }
        zi0Var.a = true;
        Iterator<i11> it = this.e.iterator();
        while (it.hasNext()) {
            i11 next = it.next();
            if (next instanceof i11.c) {
                O(next);
            }
        }
    }

    public final void I() {
        zi0 zi0Var = this.b;
        if (zi0Var.c) {
            return;
        }
        zi0Var.c = true;
        Iterator<i11> it = this.e.iterator();
        while (it.hasNext()) {
            i11 next = it.next();
            if (next instanceof i11.a) {
                O(next);
            }
        }
    }

    public final void J() {
        zi0 zi0Var = this.b;
        if (zi0Var.b) {
            zi0Var.b = false;
            Iterator<i11> it = this.e.iterator();
            while (it.hasNext()) {
                i11 next = it.next();
                if (next instanceof i11.e) {
                    O(next);
                }
            }
        }
    }

    public final void K() {
        zi0 zi0Var = this.b;
        if (zi0Var.b) {
            return;
        }
        zi0Var.b = true;
        Iterator<i11> it = this.e.iterator();
        while (it.hasNext()) {
            i11 next = it.next();
            if (next instanceof i11.f) {
                O(next);
            }
        }
    }

    public final void L() {
        zi0 zi0Var = this.b;
        if (zi0Var.d) {
            zi0Var.d = false;
            Iterator<i11> it = this.e.iterator();
            while (it.hasNext()) {
                i11 next = it.next();
                if (next instanceof i11.g) {
                    O(next);
                }
            }
        }
    }

    public final void M(long j) {
        PriorityQueue<i11.d.b> priorityQueue = this.f;
        if (priorityQueue.isEmpty()) {
            return;
        }
        int intValue = this.a.invoke().intValue();
        while (!priorityQueue.isEmpty()) {
            Long l = priorityQueue.peek().d;
            if ((l == null ? 1 : epx.h(j, l.longValue())) < 0) {
                return;
            }
            i11.d.b remove = priorityQueue.remove();
            Long l2 = remove.d;
            int i = remove.a;
            int i2 = remove.b;
            if (l2 == null) {
                priorityQueue.add(new i11.d.b(i, i2, remove.c, Long.valueOf(Math.max(TimeUnit.SECONDS.toMillis(i), 50L) + j)));
            } else if (intValue >= i2 && l2.longValue() <= j) {
                O(remove);
            }
        }
    }

    public final void N(long j, long j2) {
        ArrayList arrayList = this.d;
        Integer num = null;
        for (Object a0 = j5g.a0(arrayList); a0 != null; a0 = (i11.d) j5g.a0(arrayList)) {
            i11.d dVar = (i11.d) a0;
            if (j < Math.max((j2 / 100) * dVar.b(), 50L)) {
                return;
            }
            if (num == null) {
                num = this.a.invoke();
            }
            if (H(dVar, num.intValue())) {
                O((i11) a0);
            }
            g5g.H(arrayList);
        }
    }

    public abstract void O(i11 i11Var);

    public final void P(long j) {
        ArrayList arrayList = this.c;
        Integer num = null;
        for (Object a0 = j5g.a0(arrayList); a0 != null; a0 = (i11.d) j5g.a0(arrayList)) {
            i11.d dVar = (i11.d) a0;
            if (j < Math.max(TimeUnit.SECONDS.toMillis(dVar.b()), 50L)) {
                return;
            }
            if (num == null) {
                num = this.a.invoke();
            }
            if (H(dVar, num.intValue())) {
                O((i11) a0);
            }
            g5g.H(arrayList);
        }
    }

    public void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
        I();
    }
}
