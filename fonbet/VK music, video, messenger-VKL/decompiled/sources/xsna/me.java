package xsna;

import sun.misc.Unsafe;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class me {
    public static /* synthetic */ boolean a(Unsafe unsafe, je jeVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(jeVar, j, obj, obj2)) {
            if (unsafe.getObject(jeVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
