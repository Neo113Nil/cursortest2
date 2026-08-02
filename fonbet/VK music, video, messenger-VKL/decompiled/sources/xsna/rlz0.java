package xsna;

import com.google.android.gms.common.Feature;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final /* synthetic */ class rlz0 implements Comparator {
    public static final /* synthetic */ rlz0 b = new rlz0();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Feature feature = (Feature) obj2;
        Feature feature2 = (Feature) obj;
        return !feature2.b.equals(feature.b) ? feature2.b.compareTo(feature.b) : Long.compare(feature2.i(), feature.i());
    }
}
