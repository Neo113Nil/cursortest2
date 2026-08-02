package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import xsna.bl90;

/* loaded from: classes10.dex */
public final class qg1 {
    public final xv a;
    public final m63 b;
    public final og1 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public boolean g;

    public qg1(Looper looper, xv xvVar, og1 og1Var) {
        this(new CopyOnWriteArraySet(), looper, xvVar, og1Var);
    }

    public final void a() {
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.a.hasMessages(0)) {
            m63 m63Var = this.b;
            m63Var.getClass();
            l63 a = m63.a();
            Message obtainMessage = m63Var.a.obtainMessage(0);
            a.a = obtainMessage;
            Handler handler = m63Var.a;
            obtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(obtainMessage);
            a.a();
        }
        boolean isEmpty = this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (isEmpty) {
            while (!this.e.isEmpty()) {
                ((Runnable) this.e.peekFirst()).run();
                this.e.removeFirst();
            }
        }
    }

    public qg1(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, xv xvVar, og1 og1Var) {
        this.a = xvVar;
        this.d = copyOnWriteArraySet;
        this.c = og1Var;
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = ((j63) xvVar).a(looper, new bl90(this, 1));
    }

    public final boolean a(Message message) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            pg1 pg1Var = (pg1) it.next();
            og1 og1Var = this.c;
            if (!pg1Var.d && pg1Var.c) {
                ew0 a = pg1Var.b.a();
                pg1Var.b = new dw0();
                pg1Var.c = false;
                og1Var.a(pg1Var.a, a);
            }
            if (this.b.a.hasMessages(0)) {
                return true;
            }
        }
        return true;
    }

    public static void a(CopyOnWriteArraySet copyOnWriteArraySet, int i, ng1 ng1Var) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            pg1 pg1Var = (pg1) it.next();
            if (!pg1Var.d) {
                if (i != -1) {
                    pg1Var.b.a(i);
                }
                pg1Var.c = true;
                ng1Var.invoke(pg1Var.a);
            }
        }
    }

    public final void a(final int i, final ng1 ng1Var) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: xsna.raz0
            @Override // java.lang.Runnable
            public final void run() {
                yads.qg1.a(copyOnWriteArraySet, i, ng1Var);
            }
        });
    }
}
