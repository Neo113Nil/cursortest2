package com.yandex.go.chargers.error.data.model;

import com.yandex.go.chargers.error.api.ChargersErrorDetailsDto;
import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/error/data/model/ChargersErrorDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/error/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersErrorDto {
    public static final a Companion = new a();
    public final ChargersErrorDetailsDto a;

    public /* synthetic */ ChargersErrorDto(int i, ChargersErrorDetailsDto chargersErrorDetailsDto) {
        if (1 == (i & 1)) {
            this.a = chargersErrorDetailsDto;
        } else {
            qje.Z(i, 1, ChargersErrorDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
