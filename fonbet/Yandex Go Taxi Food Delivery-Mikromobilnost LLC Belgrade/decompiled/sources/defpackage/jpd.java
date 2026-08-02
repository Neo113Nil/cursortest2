package defpackage;

import com.yandex.plus.pay.data.mb.dto.CompositeOfferDto$StructureType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class jpd {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CompositeOfferDto$StructureType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
