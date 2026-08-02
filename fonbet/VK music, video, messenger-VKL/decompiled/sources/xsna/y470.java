package xsna;

import xsna.q630;

/* compiled from: NodeCoordinator.kt */
/* loaded from: classes11.dex */
public final class y470 {
    public static final q630.c a(htl htlVar, int i) {
        q630.c cVar = htlVar.z().g;
        if (cVar == null || (cVar.e & i) == 0) {
            return null;
        }
        while (cVar != null) {
            int i2 = cVar.d;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return cVar;
            }
            cVar = cVar.g;
        }
        return null;
    }
}
