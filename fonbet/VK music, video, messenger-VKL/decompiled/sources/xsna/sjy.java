package xsna;

import com.vk.log.L;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xsna.jjy;
import xsna.oxc0;
import xsna.wjy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class sjy implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sjy(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Finally extract failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                wdp0 wdp0Var = (wdp0) this.c;
                kjy kjyVar = (sek) this.d;
                wjy.a aVar = (wjy.a) this.e;
                jjy.a aVar2 = (jjy.a) obj;
                lti ltiVar = aVar2.a;
                if (wdp0Var != null) {
                    kjyVar = crx0.G(kjyVar, wdp0Var);
                }
                ReentrantReadWriteLock reentrantReadWriteLock = ltiVar.n;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    readLock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    ltiVar.c = kjyVar;
                    s3q0 s3q0Var = s3q0.a;
                    while (i < readHoldCount) {
                        readLock.lock();
                        i++;
                    }
                    writeLock.unlock();
                    if (aVar.b) {
                        q5m.a().getClass();
                    }
                    L.e("KNET-INIT", "Knet updated");
                    return aVar2;
                } catch (Throwable th) {
                    while (i < readHoldCount) {
                        readLock.lock();
                        i++;
                    }
                    writeLock.unlock();
                    throw th;
                }
            default:
                oxc0.a aVar3 = (oxc0.a) obj;
                ihb ihbVar = new ihb((String) this.c, (String) this.d, (Set) this.e, 7);
                aVar3.getClass();
                ihbVar.invoke(aVar3);
                return new oxc0(aVar3.a, aVar3.b, aVar3.c);
        }
    }
}
