package com.yandex.go.masstransit.sdk.core.design.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kr00;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/core/design/slot/dto/MasstransitSlotItemBodyDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/core/design/slot/dto/c", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MasstransitSlotItemBodyDto {
    public static final c Companion = new c();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kr00(22)), null};
    public final List a;
    public final MasstransitSlotItemBodyPropertiesDto b;

    public /* synthetic */ MasstransitSlotItemBodyDto(int i, List list, MasstransitSlotItemBodyPropertiesDto masstransitSlotItemBodyPropertiesDto) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = new MasstransitSlotItemBodyPropertiesDto(0);
        } else {
            this.b = masstransitSlotItemBodyPropertiesDto;
        }
    }

    /* renamed from: a, reason: from getter */
    public final List getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasstransitSlotItemBodyDto)) {
            return false;
        }
        MasstransitSlotItemBodyDto masstransitSlotItemBodyDto = (MasstransitSlotItemBodyDto) obj;
        return jl40.l(this.a, masstransitSlotItemBodyDto.a) && jl40.l(this.b, masstransitSlotItemBodyDto.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MasstransitSlotItemBodyDto(lines=" + this.a + ", properties=" + this.b + Extension.C_BRAKE;
    }

    public MasstransitSlotItemBodyDto() {
        MasstransitSlotItemBodyPropertiesDto masstransitSlotItemBodyPropertiesDto = new MasstransitSlotItemBodyPropertiesDto(0);
        this.a = EmptyList.a;
        this.b = masstransitSlotItemBodyPropertiesDto;
    }
}
