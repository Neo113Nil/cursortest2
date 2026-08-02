package defpackage;

import com.yandex.delivery.mapper.model.Expansion;
import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Details$State;

/* loaded from: classes10.dex */
public final class djz {
    public final k7x0 a;

    public djz(k7x0 k7x0Var) {
        this.a = k7x0Var;
    }

    public static LogisticsOrderTracking$Details$State a(Expansion expansion) {
        int i = expansion == null ? -1 : cjz.c[expansion.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return LogisticsOrderTracking$Details$State.Expanded;
            }
            if (i == 2) {
                return LogisticsOrderTracking$Details$State.Collapsed;
            }
            if (i != 3) {
                w511.b();
                return null;
            }
        }
        return LogisticsOrderTracking$Details$State.Anchored;
    }
}
