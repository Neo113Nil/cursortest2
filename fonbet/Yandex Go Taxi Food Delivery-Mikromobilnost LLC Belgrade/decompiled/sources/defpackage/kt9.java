package defpackage;

import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountTypeDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class kt9 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ChargersDiscountTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
