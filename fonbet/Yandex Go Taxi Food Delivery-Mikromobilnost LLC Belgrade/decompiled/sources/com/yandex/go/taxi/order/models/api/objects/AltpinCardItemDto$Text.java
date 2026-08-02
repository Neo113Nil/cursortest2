package com.yandex.go.taxi.order.models.api.objects;

import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/objects/AltpinCardItemDto$Text", "Lcom/yandex/go/taxi/order/models/api/objects/e;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AltpinCardItemDto$Text extends e {
    public static final c Companion = new c();
    public final SlotItemDto a;

    public AltpinCardItemDto$Text(int i, SlotItemDto slotItemDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = slotItemDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AltpinCardItemDto$Text) && jl40.l(this.a, ((AltpinCardItemDto$Text) obj).a);
    }

    public final int hashCode() {
        SlotItemDto slotItemDto = this.a;
        if (slotItemDto == null) {
            return 0;
        }
        return slotItemDto.hashCode();
    }

    public final String toString() {
        return "Text(slot=" + this.a + Extension.C_BRAKE;
    }

    public AltpinCardItemDto$Text() {
        this.a = null;
    }
}
