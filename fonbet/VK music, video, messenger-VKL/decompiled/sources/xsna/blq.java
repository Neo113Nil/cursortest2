package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.story.viewer.stat.data.cache.viewers.replies.RepliesCachedData;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class blq implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ blq(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ReentrantReadWriteLock.ReadLock readLock;
        int i;
        int readHoldCount;
        ReentrantReadWriteLock.WriteLock writeLock;
        switch (this.b) {
            case 0:
                throw null;
            default:
                pgm0 pgm0Var = (pgm0) this.c;
                RepliesCachedData repliesCachedData = (RepliesCachedData) this.d;
                bpn0 bpn0Var = i0q0.a;
                try {
                    pgm0Var.c.await();
                    ReentrantReadWriteLock reentrantReadWriteLock = pgm0Var.a;
                    readLock = reentrantReadWriteLock.readLock();
                    i = 0;
                    readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                    for (int i2 = 0; i2 < readHoldCount; i2++) {
                        readLock.unlock();
                    }
                    writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                } catch (InterruptedException e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(pgm0Var.b);
                    try {
                        byte[] bArr = new byte[8];
                        ByteBuffer.wrap(bArr).putInt(pgm0Var.d);
                        fileOutputStream.write(bArr);
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                        fileOutputStream.write(Serializer.b.e(repliesCachedData));
                        fileOutputStream.flush();
                        s3q0 s3q0Var = s3q0.a;
                        fileOutputStream.close();
                        return s3q0.a;
                    } finally {
                    }
                } finally {
                    while (i < readHoldCount) {
                        readLock.lock();
                        i++;
                    }
                    writeLock.unlock();
                }
        }
    }
}
