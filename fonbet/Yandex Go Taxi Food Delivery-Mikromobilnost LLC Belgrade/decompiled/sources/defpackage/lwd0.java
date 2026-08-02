package defpackage;

import com.yandex.go.taxi.summary.map.clarify_source_point.experiments.PointsVisiblePriorityDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class lwd0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PointsVisiblePriorityDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
