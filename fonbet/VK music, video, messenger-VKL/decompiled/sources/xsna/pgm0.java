package xsna;

import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.text.Regex;

/* compiled from: StoryStatisticsRepliesCacheManager.kt */
/* loaded from: classes6.dex */
public final class pgm0 {
    public final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    public final File b;
    public final CountDownLatch c;
    public volatile int d;

    public pgm0() {
        Regex regex = com.vk.core.files.a.a;
        this.b = new File(e43.a.getFilesDir(), "story_stat_replies.dat");
        this.c = new CountDownLatch(1);
    }

    public final void a() {
        bpn0 bpn0Var = i0q0.a;
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
            File file = this.b;
            Regex regex = com.vk.core.files.a.a;
            vhk0.b(file);
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final io.reactivex.rxjava3.internal.operators.single.f0 b() {
        return new io.reactivex.rxjava3.internal.operators.single.v(new fca(this, 2)).q(asu0.a.c());
    }
}
