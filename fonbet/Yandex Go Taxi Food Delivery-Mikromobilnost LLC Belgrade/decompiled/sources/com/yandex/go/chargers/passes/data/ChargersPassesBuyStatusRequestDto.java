package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/passes/data/ChargersPassesBuyStatusRequestDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/passes/data/f0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersPassesBuyStatusRequestDto {
    public static final f0 Companion = new f0();
    public final String a;

    public /* synthetic */ ChargersPassesBuyStatusRequestDto(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, ChargersPassesBuyStatusRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public ChargersPassesBuyStatusRequestDto(String str) {
        this.a = str;
    }
}
