package defpackage;

import com.yandex.go.chargers.discounts.ChargersDiscountsAnalyticsProxy$TaskState;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class eu9 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ChargersDiscountsAnalyticsProxy$TaskState.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
