package androidx.room;

import defpackage.er60;
import defpackage.tls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class InvalidationTracker$implementation$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Set set = (Set) obj;
        d dVar = (d) this.receiver;
        ReentrantLock reentrantLock = dVar.e;
        reentrantLock.lock();
        try {
            List J0 = kotlin.collections.a.J0(dVar.d.values());
            reentrantLock.unlock();
            Iterator it = J0.iterator();
            while (it.hasNext()) {
                ((er60) it.next()).a(set);
            }
            return zy11.a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
