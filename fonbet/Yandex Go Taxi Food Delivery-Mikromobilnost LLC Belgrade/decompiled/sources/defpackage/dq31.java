package defpackage;

import android.os.Process;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class dq31 extends Thread {
    public final l2f a;
    public final df5 b;
    public volatile String c;

    public dq31(l2f l2fVar) {
        super("ViewPoolThread");
        this.a = l2fVar;
        this.b = new df5(new PriorityQueue(32));
        setPriority(5);
    }

    public final void a() {
        bq31 bq31Var = (bq31) this.b.poll();
        if (bq31Var == null) {
            try {
                setPriority(3);
                bq31Var = (bq31) this.b.take();
            } finally {
                setPriority(5);
            }
        }
        this.c = bq31Var.b;
        bq31Var.run();
        this.c = null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.myTid();
        this.a.getClass();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
