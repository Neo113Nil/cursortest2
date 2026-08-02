package com.yandex.go.masstransit.sdk.core.design.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kr00;
import defpackage.ly3;
import defpackage.m410;
import defpackage.n410;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/core/design/slot/dto/MasstransitSlotItemDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/core/design/slot/dto/f", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MasstransitSlotItemDto {
    public static final f Companion = new f();
    public static final i3y[] f;
    public final n410 a;
    public final MasstransitSlotItemSizeDto b;
    public final k c;
    public final List d;
    public final List e;

    static {
        c cVar = MasstransitSlotItemBodyDto.Companion;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new kr00(25)), null, kotlin.a.b(lazyThreadSafetyMode, new kr00(26)), kotlin.a.b(lazyThreadSafetyMode, new kr00(27))};
    }

    public /* synthetic */ MasstransitSlotItemDto(int i, n410 n410Var, MasstransitSlotItemSizeDto masstransitSlotItemSizeDto, k kVar, List list, List list2) {
        this.a = (i & 1) == 0 ? m410.INSTANCE : n410Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = masstransitSlotItemSizeDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = kVar;
        }
        int i2 = i & 8;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.d = emptyList;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = emptyList;
        } else {
            this.e = list2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final List getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final k getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final List getE() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasstransitSlotItemDto)) {
            return false;
        }
        MasstransitSlotItemDto masstransitSlotItemDto = (MasstransitSlotItemDto) obj;
        return jl40.l(this.a, masstransitSlotItemDto.a) && this.b == masstransitSlotItemDto.b && jl40.l(this.c, masstransitSlotItemDto.c) && jl40.l(this.d, masstransitSlotItemDto.d) && jl40.l(this.e, masstransitSlotItemDto.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MasstransitSlotItemSizeDto masstransitSlotItemSizeDto = this.b;
        int hashCode2 = (hashCode + (masstransitSlotItemSizeDto == null ? 0 : masstransitSlotItemSizeDto.hashCode())) * 31;
        k kVar = this.c;
        return this.e.hashCode() + unr0.c((hashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasstransitSlotItemDto(action=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", lead=");
        sb.append(this.c);
        sb.append(", body=");
        sb.append(this.d);
        sb.append(", trail=");
        return ly3.s(sb, this.e, Extension.C_BRAKE);
    }

    public MasstransitSlotItemDto() {
        this(0);
    }

    public MasstransitSlotItemDto(int i) {
        this.a = m410.INSTANCE;
        this.b = null;
        this.c = null;
        EmptyList emptyList = EmptyList.a;
        this.d = emptyList;
        this.e = emptyList;
    }
}
