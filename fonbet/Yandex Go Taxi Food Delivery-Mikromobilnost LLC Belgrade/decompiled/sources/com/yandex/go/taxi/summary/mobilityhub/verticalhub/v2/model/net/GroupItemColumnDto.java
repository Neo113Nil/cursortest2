package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/GroupItemColumnDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GroupItemColumnDto {
    public static final j Companion = new j();
    public final n a;
    public final n b;

    public /* synthetic */ GroupItemColumnDto(int i, n nVar, n nVar2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = nVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = nVar2;
        }
    }

    public GroupItemColumnDto() {
        this.a = null;
        this.b = null;
    }
}
