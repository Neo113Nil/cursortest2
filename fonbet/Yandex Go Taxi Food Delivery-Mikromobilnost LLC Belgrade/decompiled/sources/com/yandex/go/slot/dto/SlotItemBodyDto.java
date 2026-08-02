package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.tqs0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/slot/dto/SlotItemBodyDto;", "", "Companion", "$serializer", "com/yandex/go/slot/dto/c2", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SlotItemBodyDto {
    public static final c2 Companion = new c2();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tqs0(0)), null};
    public final List a;
    public final SlotItemBodyPropertiesDto b;

    public /* synthetic */ SlotItemBodyDto(int i, List list, SlotItemBodyPropertiesDto slotItemBodyPropertiesDto) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = new SlotItemBodyPropertiesDto(0);
        } else {
            this.b = slotItemBodyPropertiesDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotItemBodyDto)) {
            return false;
        }
        SlotItemBodyDto slotItemBodyDto = (SlotItemBodyDto) obj;
        return jl40.l(this.a, slotItemBodyDto.a) && jl40.l(this.b, slotItemBodyDto.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SlotItemBodyDto(lines=" + this.a + ", properties=" + this.b + Extension.C_BRAKE;
    }

    public SlotItemBodyDto(List list, SlotItemBodyPropertiesDto slotItemBodyPropertiesDto) {
        this.a = list;
        this.b = slotItemBodyPropertiesDto;
    }

    public SlotItemBodyDto() {
        this(EmptyList.a, new SlotItemBodyPropertiesDto(0));
    }
}
