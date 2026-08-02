package xsna;

import com.ironsource.X3;
import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Consumer;
import one.video.calls.sdk_private.aF;

/* compiled from: SendRequestQueue.java */
/* loaded from: classes8.dex */
public final class gjy0 {
    public final Clock a;
    public final aF b;
    public final ConcurrentLinkedDeque c = new ConcurrentLinkedDeque();
    public final ConcurrentLinkedDeque d = new ConcurrentLinkedDeque();
    public final Object e = new Object();
    public Instant f;
    public volatile boolean g;

    public gjy0(Clock clock, aF aFVar) {
        this.a = clock;
        this.b = aFVar;
    }

    public final List<ihy0> a() {
        List<ihy0> list = (List) this.d.pollFirst();
        if (list != null) {
            return list;
        }
        Object[] objArr = {new fhy0()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return Collections.unmodifiableList(arrayList);
    }

    public final Optional<ejy0> b(int i) {
        if (i <= 0) {
            return Optional.empty();
        }
        try {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ejy0 ejy0Var = (ejy0) it.next();
                if (ejy0Var.a() <= i) {
                    it.remove();
                    return Optional.of(ejy0Var);
                }
            }
            return Optional.empty();
        } catch (ConcurrentModificationException e) {
            if (this.g) {
                return Optional.empty();
            }
            throw e;
        }
    }

    public final void c(ihy0 ihy0Var, Consumer<ihy0> consumer) {
        boolean z = ihy0Var instanceof ehy0;
        ConcurrentLinkedDeque concurrentLinkedDeque = this.c;
        if (!z || concurrentLinkedDeque.stream().filter(new v030(1)).filter(new fjy0()).count() < 256) {
            concurrentLinkedDeque.addLast(new fny0(ihy0Var, consumer));
        }
    }

    public final void d(boolean z) {
        this.g = true;
        this.c.clear();
        this.d.clear();
        if (z) {
            synchronized (this.e) {
                this.f = null;
            }
        }
    }

    public final String toString() {
        return "SendRequestQueue[" + this.b + X3.j.e;
    }
}
