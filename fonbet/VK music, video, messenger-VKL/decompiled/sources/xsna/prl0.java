package xsna;

import com.huawei.hms.health.aacg;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.vk.core.serialize.Serializer;
import com.vk.story.impl.domain.interactor.cache.StoriesCacheManager;
import com.vk.voip.ui.members.VoipDataProvider;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class prl0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ prl0(int i, Object obj, Object obj2) {
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
        List aaba;
        switch (this.b) {
            case 0:
                StoriesCacheManager storiesCacheManager = (StoriesCacheManager) this.c;
                StoriesCacheManager.StoriesCache storiesCache = (StoriesCacheManager.StoriesCache) this.d;
                storiesCacheManager.getClass();
                try {
                    storiesCacheManager.c.await();
                    ReentrantReadWriteLock reentrantReadWriteLock = storiesCacheManager.a;
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
                    FileOutputStream fileOutputStream = new FileOutputStream(storiesCacheManager.b);
                    try {
                        byte[] bArr = new byte[8];
                        ByteBuffer.wrap(bArr).putInt(storiesCacheManager.d);
                        fileOutputStream.write(bArr);
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                        fileOutputStream.write(Serializer.b.e(storiesCache));
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
            case 1:
                return new it80(((VoipDataProvider) this.c).a((String) this.d));
            default:
                aaba = aacg.aaba((HealthKitApiInvoker) this.c, (String) this.d);
                return aaba;
        }
    }
}
