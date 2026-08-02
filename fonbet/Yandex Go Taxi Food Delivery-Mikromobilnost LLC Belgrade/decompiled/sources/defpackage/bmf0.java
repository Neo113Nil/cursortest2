package defpackage;

import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeDecorationIdDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class bmf0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PromoCodeDecorationIdDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
