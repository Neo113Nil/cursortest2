package com.yandex.go.masstransit.sdk.trains.impl.search;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.tc01;
import defpackage.tse0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/search/TrainStationSuggestsResponseDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/trains/impl/search/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TrainStationSuggestsResponseDto {
    public static final c Companion = new c();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tc01(0))};
    public final List a;

    public /* synthetic */ TrainStationSuggestsResponseDto(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrainStationSuggestsResponseDto) && jl40.l(this.a, ((TrainStationSuggestsResponseDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("TrainStationSuggestsResponseDto(suggests=", Extension.C_BRAKE, this.a);
    }

    public TrainStationSuggestsResponseDto() {
        this.a = EmptyList.a;
    }
}
