package com.yandex.go.explorer.impl.data.models;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/explorer/impl/data/models/CellItemDto;", "", "Companion", "$serializer", "com/yandex/go/explorer/impl/data/models/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CellItemDto {
    public static final a Companion = new a();
    public final String a;
    public final long b;

    public /* synthetic */ CellItemDto(long j, int i, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, CellItemDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CellItemDto)) {
            return false;
        }
        CellItemDto cellItemDto = (CellItemDto) obj;
        return jl40.l(this.a, cellItemDto.a) && this.b == cellItemDto.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("CellItemDto(id=", this.a, ", unlockedAt=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
