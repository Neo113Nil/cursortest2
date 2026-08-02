package com.yandex.go.ridetech.locationsdk.experiment.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.wrp0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/ridetech/locationsdk/experiment/dto/SelectSourceDto;", "Lcom/yandex/go/ridetech/locationsdk/experiment/dto/i;", "Companion", "$serializer", "com/yandex/go/ridetech/locationsdk/experiment/dto/h", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SelectSourceDto extends i {
    public static final h Companion = new h();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wrp0(13)), null};
    public final List a;
    public final boolean b;

    public /* synthetic */ SelectSourceDto(int i, boolean z, List list) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    @Override // com.yandex.go.ridetech.locationsdk.experiment.dto.i
    public final Type a() {
        return Type.SELECT_SOURCE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectSourceDto)) {
            return false;
        }
        SelectSourceDto selectSourceDto = (SelectSourceDto) obj;
        return jl40.l(this.a, selectSourceDto.a) && this.b == selectSourceDto.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.o(this.a, "SelectSourceDto(sources=", ", startWithLastKnown=", Extension.C_BRAKE, this.b);
    }

    public SelectSourceDto() {
        this.a = EmptyList.a;
        this.b = false;
    }
}
