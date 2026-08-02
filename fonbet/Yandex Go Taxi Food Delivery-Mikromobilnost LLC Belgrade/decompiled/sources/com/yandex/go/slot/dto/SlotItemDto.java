package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.tqs0;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/slot/dto/SlotItemDto;", "", "Companion", "$serializer", "com/yandex/go/slot/dto/f2", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SlotItemDto {
    public static final f2 Companion = new f2();
    public static final i3y[] f;
    public final b2 a;
    public final SlotItemSizeDto b;
    public final k2 c;
    public final List d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new tqs0(3)), null, kotlin.a.b(lazyThreadSafetyMode, new tqs0(4)), kotlin.a.b(lazyThreadSafetyMode, new tqs0(5))};
    }

    public /* synthetic */ SlotItemDto(int i, b2 b2Var, SlotItemSizeDto slotItemSizeDto, k2 k2Var, List list, List list2) {
        this.a = (i & 1) == 0 ? y0.INSTANCE : b2Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = slotItemSizeDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = k2Var;
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

    public static SlotItemDto a(SlotItemDto slotItemDto, ArrayList arrayList) {
        b2 b2Var = slotItemDto.a;
        SlotItemSizeDto slotItemSizeDto = slotItemDto.b;
        k2 k2Var = slotItemDto.c;
        List list = slotItemDto.e;
        slotItemDto.getClass();
        return new SlotItemDto(b2Var, slotItemSizeDto, k2Var, arrayList, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotItemDto)) {
            return false;
        }
        SlotItemDto slotItemDto = (SlotItemDto) obj;
        return jl40.l(this.a, slotItemDto.a) && this.b == slotItemDto.b && jl40.l(this.c, slotItemDto.c) && jl40.l(this.d, slotItemDto.d) && jl40.l(this.e, slotItemDto.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        SlotItemSizeDto slotItemSizeDto = this.b;
        int hashCode2 = (hashCode + (slotItemSizeDto == null ? 0 : slotItemSizeDto.hashCode())) * 31;
        k2 k2Var = this.c;
        return this.e.hashCode() + unr0.c((hashCode2 + (k2Var != null ? k2Var.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotItemDto(action=");
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

    public SlotItemDto() {
        this(0);
    }

    public SlotItemDto(b2 b2Var, SlotItemSizeDto slotItemSizeDto, k2 k2Var, List list, List list2) {
        this.a = b2Var;
        this.b = slotItemSizeDto;
        this.c = k2Var;
        this.d = list;
        this.e = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SlotItemDto(int i) {
        this(y0.INSTANCE, null, null, r4, r4);
        EmptyList emptyList = EmptyList.a;
    }
}
