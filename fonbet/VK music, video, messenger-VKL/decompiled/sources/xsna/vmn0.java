package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: SwipeableV2.kt */
/* loaded from: classes17.dex */
public final class vmn0 {
    public static final Object a(Map map, float f, boolean z) {
        if (map.isEmpty()) {
            throw new IllegalArgumentException("The anchors were empty when trying to find the closest anchor");
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
            float f2 = z ? floatValue - f : f - floatValue;
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f2 = Float.POSITIVE_INFINITY;
            }
            do {
                Object next2 = it.next();
                float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                float f3 = z ? floatValue2 - f : f - floatValue2;
                if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f3 = Float.POSITIVE_INFINITY;
                }
                if (Float.compare(f2, f3) > 0) {
                    next = next2;
                    f2 = f3;
                }
            } while (it.hasNext());
        }
        return ((Map.Entry) next).getKey();
    }
}
