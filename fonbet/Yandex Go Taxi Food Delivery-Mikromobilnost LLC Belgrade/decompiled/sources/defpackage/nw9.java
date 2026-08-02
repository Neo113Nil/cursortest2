package defpackage;

import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsTypeDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class nw9 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ChargersDiscountsTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
