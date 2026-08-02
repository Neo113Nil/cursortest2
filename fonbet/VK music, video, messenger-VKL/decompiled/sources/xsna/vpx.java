package xsna;

import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: InvalidationTracker.android.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class vpx extends FunctionReferenceImpl implements izs<Set<? extends Integer>, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(Set<? extends Integer> set) {
        Set<String> set2;
        Set<? extends Integer> set3 = set;
        androidx.room.e eVar = (androidx.room.e) this.receiver;
        ReentrantLock reentrantLock = eVar.e;
        reentrantLock.lock();
        try {
            List<androidx.room.h> O0 = j5g.O0(eVar.d.values());
            reentrantLock.unlock();
            for (androidx.room.h hVar : O0) {
                int[] iArr = hVar.b;
                int length = iArr.length;
                if (length != 0) {
                    int i = 0;
                    if (length != 1) {
                        SetBuilder setBuilder = new SetBuilder();
                        int length2 = iArr.length;
                        int i2 = 0;
                        while (i < length2) {
                            int i3 = i2 + 1;
                            if (set3.contains(Integer.valueOf(iArr[i]))) {
                                setBuilder.add(hVar.c[i2]);
                            }
                            i++;
                            i2 = i3;
                        }
                        set2 = setBuilder.d();
                    } else {
                        set2 = set3.contains(Integer.valueOf(iArr[0])) ? hVar.d : EmptySet.b;
                    }
                } else {
                    set2 = EmptySet.b;
                }
                if (!set2.isEmpty()) {
                    hVar.a.a(set2);
                }
            }
            return s3q0.a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
