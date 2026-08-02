package xsna;

import androidx.compose.ui.draganddrop.DragAndDropNode;

/* compiled from: DragAndDropNode.kt */
/* loaded from: classes11.dex */
public final class mfo {
    public static final boolean a(DragAndDropNode dragAndDropNode, long j) {
        if (!dragAndDropNode.b.o) {
            return false;
        }
        androidx.compose.ui.node.c cVar = itl.f(dragAndDropNode).G.c;
        if (!cVar.Y.o) {
            return false;
        }
        long D = cVar.D(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (D >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (D & 4294967295L));
        long j2 = dragAndDropNode.s;
        float f = ((int) (j2 >> 32)) + intBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f2;
    }
}
