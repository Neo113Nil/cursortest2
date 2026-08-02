package defpackage;

import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeStatusDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class jnf0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PromoCodeStatusDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
