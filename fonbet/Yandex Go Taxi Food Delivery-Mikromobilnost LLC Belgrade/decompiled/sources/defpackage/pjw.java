package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionTypeDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class pjw {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = IntercityDashboardSectionTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
