package xsna;

import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xsna.wmi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i2a implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ i2a(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                CatalogBlockVariant.a aVar = CatalogBlockVariant.Companion;
                return Boolean.FALSE;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    wmi0 wmi0Var = wmi0.a;
                    ConcurrentHashMap concurrentHashMap = wmi0.e;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.clear();
                    }
                    if (wmi0.d != null) {
                        wmi0.o(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.vmi0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ReentrantReadWriteLock reentrantReadWriteLock = wmi0.b;
                                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                                int i = 0;
                                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                                for (int i2 = 0; i2 < readHoldCount; i2++) {
                                    readLock.unlock();
                                }
                                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                                writeLock.lock();
                                try {
                                    wmi0.a aVar2 = wmi0.d;
                                    if (aVar2 == null) {
                                        aVar2 = null;
                                    }
                                    aVar2.getClass();
                                    return Integer.valueOf(aVar2.m().delete("SerializerDatabaseCache", null, null));
                                } finally {
                                    while (i < readHoldCount) {
                                        readLock.lock();
                                        i++;
                                    }
                                    writeLock.unlock();
                                }
                            }
                        }).q(wmi0.g()));
                    }
                }
                return s3q0.a;
        }
    }
}
