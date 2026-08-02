package xsna;

import sun.misc.Unsafe;
import xsna.je;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class ke {
    public static /* synthetic */ boolean a(Unsafe unsafe, je jeVar, long j, je.k kVar, je.k kVar2) {
        while (!unsafe.compareAndSwapObject(jeVar, j, kVar, kVar2)) {
            if (unsafe.getObject(jeVar, j) != kVar) {
                return false;
            }
        }
        return true;
    }
}
