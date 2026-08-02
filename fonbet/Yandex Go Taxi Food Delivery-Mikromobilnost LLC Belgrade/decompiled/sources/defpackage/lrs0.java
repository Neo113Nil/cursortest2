package defpackage;

import com.yandex.go.slot.dto.SlotItemSizeDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class lrs0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SlotItemSizeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
