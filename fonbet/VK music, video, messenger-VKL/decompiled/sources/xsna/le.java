package xsna;

import sun.misc.Unsafe;
import xsna.je;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class le {
    public static /* synthetic */ boolean a(Unsafe unsafe, je jeVar, long j, je.d dVar, je.d dVar2) {
        while (!unsafe.compareAndSwapObject(jeVar, j, dVar, dVar2)) {
            if (unsafe.getObject(jeVar, j) != dVar) {
                return false;
            }
        }
        return true;
    }
}
