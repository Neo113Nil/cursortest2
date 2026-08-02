package defpackage;

import com.yandex.plus.pay.data.mb.dto.CompositeOfferDto$LegalInfo$Item$Type;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class iod {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CompositeOfferDto$LegalInfo$Item$Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
