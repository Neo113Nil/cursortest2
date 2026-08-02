package xsna;

import androidx.compose.foundation.text.selection.Direction;
import com.unity3d.services.UnityAdsConstants;
import xsna.obi0;

/* compiled from: MultiWidgetSelectionDelegate.kt */
/* loaded from: classes11.dex */
public final class y640 {
    public static final Direction a(Direction direction, Direction direction2, odi0 odi0Var, long j, obi0.a aVar) {
        if (aVar != null) {
            int compare = odi0Var.f.compare(Long.valueOf(aVar.c), Long.valueOf(j));
            Direction direction3 = compare < 0 ? Direction.BEFORE : compare > 0 ? Direction.AFTER : Direction.ON;
            if (direction3 != null) {
                return direction3;
            }
        }
        return pdi0.a(direction, direction2);
    }

    public static final int b(long j, ljo0 ljo0Var) {
        int i = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        m540 m540Var = ljo0Var.b;
        return intBitsToFloat >= m540Var.e ? ljo0Var.a.a.c.length() : m540Var.h(j);
    }
}
