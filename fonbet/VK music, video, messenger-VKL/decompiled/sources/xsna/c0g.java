package xsna;

import com.vk.toggle.b;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: ColdStartImportantToggles.kt */
/* loaded from: classes11.dex */
public final class c0g {
    public final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    public final HashMap<String, Integer> b = new HashMap<>();
    public final Stack<String> c = new Stack<>();
    public volatile int d;

    public final void a(b.d dVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.a;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            String obj = dVar.c.toString();
            int length = obj != null ? obj.length() : 0;
            this.b.put(dVar.b.toString(), Integer.valueOf(length));
            this.c.push(dVar.b.toString());
            this.d += length;
            s3q0 s3q0Var = s3q0.a;
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }
}
