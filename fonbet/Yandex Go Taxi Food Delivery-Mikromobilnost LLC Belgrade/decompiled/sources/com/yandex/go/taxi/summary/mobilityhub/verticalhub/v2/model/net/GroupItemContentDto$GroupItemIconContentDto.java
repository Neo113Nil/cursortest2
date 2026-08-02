package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/GroupItemContentDto$GroupItemIconContentDto", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/n;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GroupItemContentDto$GroupItemIconContentDto extends n {
    public static final k Companion = new k();
    public final String a;
    public final String b;

    public GroupItemContentDto$GroupItemIconContentDto(int i, String str, String str2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public GroupItemContentDto$GroupItemIconContentDto() {
        this.a = "";
        this.b = null;
    }
}
