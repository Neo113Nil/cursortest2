package xsna;

import com.huawei.hms.health.aacm;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.huawei.hms.hihealth.options.HealthRecordUpdateOptions;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.rx.core.RxApiClient;
import xsna.wmi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class qsg0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qsg0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object lambda$execute$0;
        Void aab;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                lambda$execute$0 = ((RxApiClient) obj2).lambda$execute$0((ApiExecutableRequest) obj);
                return lambda$execute$0;
            case 1:
                String str = (String) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ReentrantReadWriteLock reentrantReadWriteLock = wmi0.b;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i2 = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    readLock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    wmi0.a aVar = wmi0.d;
                    if (aVar == null) {
                        aVar = null;
                    }
                    aVar.o(str, arrayList);
                    s3q0 s3q0Var = s3q0.a;
                    while (i2 < readHoldCount) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                    return s3q0.a;
                } catch (Throwable th) {
                    while (i2 < readHoldCount) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                    throw th;
                }
            default:
                aab = aacm.aab((HealthKitApiInvoker) obj2, (HealthRecordUpdateOptions) obj);
                return aab;
        }
    }
}
