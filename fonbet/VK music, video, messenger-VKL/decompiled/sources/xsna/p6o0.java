package xsna;

import com.vk.im.engine.models.LongPollType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: TaskLongPollHistoryMessagesCompositeImpl.kt */
/* loaded from: classes2.dex */
public final class p6o0 implements o6o0 {
    public final q6o0 a;
    public final jx5 b;

    public p6o0(q6o0 q6o0Var, jx5 jx5Var) {
        this.a = q6o0Var;
        this.b = jx5Var;
        LongPollType longPollType = LongPollType.MESSAGES;
    }

    @Override // xsna.o6o0
    public final a400 a(w2w w2wVar, v400 v400Var, Long l) {
        jx5 jx5Var = this.b;
        ReentrantLock reentrantLock = jx5Var.a;
        a400 a400Var = null;
        if (reentrantLock.isLocked()) {
            reentrantLock.lock();
            while (!jx5Var.d) {
                try {
                    jx5Var.b.await();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            a400 a400Var2 = jx5Var.c;
            jx5Var.c = null;
            reentrantLock.unlock();
            a400Var = a400Var2;
        }
        if (a400Var == null) {
            return this.a.a(w2wVar, v400Var, l);
        }
        L l2 = L.a;
        l2.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return a400Var;
        }
        L.u(l2, L.LogType.d, new Object[]{"TaskLongPollHistoryMessagesComposite: skip getdiff execution due to parallel task executed just now"});
        return a400Var;
    }
}
