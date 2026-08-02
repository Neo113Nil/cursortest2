package xsna;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xsna.hov;
import xsna.wmi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o58 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.s {
    public final /* synthetic */ Object b;

    public /* synthetic */ o58(Object obj) {
        this.b = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (s3q0) ((n58) this.b).invoke(obj);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        String str = (String) this.b;
        try {
            ReentrantReadWriteLock.ReadLock readLock = wmi0.b.readLock();
            readLock.lock();
            try {
                wmi0.a aVar = wmi0.d;
                if (aVar == null) {
                    aVar = null;
                }
                ArrayList n = aVar.n(str);
                Serializer.StreamParcelable streamParcelable = n != null ? (Serializer.StreamParcelable) j5g.b0(0, n) : null;
                readLock.unlock();
                if (rVar.h()) {
                    return;
                }
                rVar.onNext(new hov.a(streamParcelable));
                rVar.onComplete();
            } catch (Throwable th) {
                readLock.unlock();
                throw th;
            }
        } catch (Exception e) {
            if (rVar.h()) {
                return;
            }
            rVar.onError(e);
        }
    }
}
