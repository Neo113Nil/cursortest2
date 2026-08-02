package com.yandex.go.places.models.data.entities.network;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.z411;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/TriggerActionDto;", "", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/d0", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TriggerActionDto {
    public static final d0 Companion = new d0();
    public static final i3y[] c;
    public final TriggerDto a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new z411(25)), kotlin.a.b(lazyThreadSafetyMode, new z411(26))};
    }

    public /* synthetic */ TriggerActionDto(int i, TriggerDto triggerDto, List list) {
        this.a = (i & 1) == 0 ? TriggerDto.UNKNOWN : triggerDto;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TriggerActionDto)) {
            return false;
        }
        TriggerActionDto triggerActionDto = (TriggerActionDto) obj;
        return this.a == triggerActionDto.a && jl40.l(this.b, triggerActionDto.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggerActionDto(trigger=" + this.a + ", actions=" + this.b + Extension.C_BRAKE;
    }

    public TriggerActionDto() {
        this.a = TriggerDto.UNKNOWN;
        this.b = EmptyList.a;
    }
}
