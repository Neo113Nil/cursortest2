package defpackage;

import com.yandex.mapkit.transport.masstransit.Route;
import java.util.Comparator;

/* loaded from: classes12.dex */
public final class ed5 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Double.valueOf(((Route) obj).getMetadata().getWeight().getTime().getValue()).compareTo(Double.valueOf(((Route) obj2).getMetadata().getWeight().getTime().getValue()));
    }
}
