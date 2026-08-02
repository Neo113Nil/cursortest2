package xsna;

import android.os.SystemClock;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.network.eventhub.api.Message;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: RateLimitedMessageQueue.kt */
/* loaded from: classes3.dex */
public final class cxe0 {
    public final pzp a;
    public final fgh b;
    public final ReentrantLock c;
    public final Condition d;
    public final PriorityQueue<Message> e;
    public final AtomicBoolean f;
    public ExecutorService g;
    public Message h;
    public boolean i;

    public cxe0(pzp pzpVar, fgh fghVar) {
        this.a = pzpVar;
        this.b = fghVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.c = reentrantLock;
        this.d = reentrantLock.newCondition();
        this.e = new PriorityQueue<>();
        this.f = new AtomicBoolean(false);
    }

    public final void a(Message message) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (message.equals(this.h) && this.i) {
                this.i = false;
                return;
            }
            this.e.add(message);
            this.d.signal();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void b(Message message) {
        pzp pzpVar;
        Message.Priority priority = message.c;
        Message.Priority priority2 = Message.Priority.URGENT;
        fgh fghVar = this.b;
        if (priority == priority2 || (pzpVar = this.a) == null) {
            if (((Boolean) fghVar.invoke(message)).booleanValue()) {
                return;
            }
            Thread.sleep(200L);
            return;
        }
        ReentrantLock reentrantLock = pzpVar.b;
        ArrayDeque<Long> arrayDeque = pzpVar.c;
        wwe0 wwe0Var = pzpVar.a;
        reentrantLock.lock();
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            while (!arrayDeque.isEmpty() && elapsedRealtime - ((Number) j5g.X(arrayDeque)).longValue() > wwe0Var.b) {
                arrayDeque.removeFirst();
            }
            long max = arrayDeque.size() < wwe0Var.a ? 0L : Math.max(0L, wwe0Var.b - (elapsedRealtime - ((Long) j5g.X(arrayDeque)).longValue()));
            reentrantLock.unlock();
            if (max > 0) {
                message.toString();
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"RateLimitedMessageQueue", "Rate limiting: waiting " + max + "ms before sending message " + message});
                }
                while (max > 0) {
                    if (Thread.currentThread().isInterrupted()) {
                        return;
                    }
                    ReentrantLock reentrantLock2 = this.c;
                    reentrantLock2.lock();
                    try {
                        Message peek = this.e.peek();
                        boolean z = (peek != null ? peek.c : null) == Message.Priority.URGENT;
                        reentrantLock2.unlock();
                        if (z) {
                            a(message);
                            return;
                        } else {
                            long min = Math.min(max, 50L);
                            Thread.sleep(min);
                            max -= min;
                        }
                    } finally {
                        reentrantLock2.unlock();
                    }
                }
            }
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            if (!((Boolean) fghVar.invoke(message)).booleanValue()) {
                Thread.sleep(200L);
                return;
            }
            reentrantLock.lock();
            try {
                arrayDeque.addLast(Long.valueOf(SystemClock.elapsedRealtime()));
                s3q0 s3q0Var = s3q0.a;
            } finally {
                reentrantLock.unlock();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Message c() throws InterruptedException {
        PriorityQueue<Message> priorityQueue = this.e;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        while (priorityQueue.isEmpty()) {
            try {
                this.d.await();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        Message poll = priorityQueue.poll();
        this.h = poll;
        this.i = false;
        reentrantLock.unlock();
        return poll;
    }
}
