package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.gsq0;
import defpackage.qje;
import defpackage.wlc;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CommandDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/m", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CommandDto {
    public static final m Companion = new m();
    public final String a;
    public final wlc b;

    public /* synthetic */ CommandDto(int i, String str, wlc wlcVar) {
        if (2 != (i & 2)) {
            qje.Z(i, 2, CommandDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = wlcVar;
    }

    public CommandDto(String str, wlc wlcVar) {
        this.a = str;
        this.b = wlcVar;
    }
}
