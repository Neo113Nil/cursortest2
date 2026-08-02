package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/slot/dto/SettingsModalContentItemDto$Slot", "Lcom/yandex/go/slot/dto/o;", "Companion", "$serializer", "com/yandex/go/slot/dto/l", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SettingsModalContentItemDto$Slot extends o {
    public static final l Companion = new l();
    public final SlotItemDto a;

    public SettingsModalContentItemDto$Slot(int i, SlotItemDto slotItemDto) {
        if ((i & 1) == 0) {
            this.a = new SlotItemDto(0);
        } else {
            this.a = slotItemDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SettingsModalContentItemDto$Slot) && jl40.l(this.a, ((SettingsModalContentItemDto$Slot) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Slot(slot=" + this.a + Extension.C_BRAKE;
    }

    public SettingsModalContentItemDto$Slot() {
        this.a = new SlotItemDto(0);
    }
}
