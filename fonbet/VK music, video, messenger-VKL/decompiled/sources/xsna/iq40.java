package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.voip.dto.call_member.CallMemberId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xsna.wmi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class iq40 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iq40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((jq40) obj).G().d(o25.a().c());
            case 1:
                t6g0 t6g0Var = t6g0.b;
                return t6g0.b().C0((UserId) obj);
            case 2:
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
                    aVar.b(arrayList);
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
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((CallMemberId) it.next()).b);
                }
                return linkedHashSet;
        }
    }
}
