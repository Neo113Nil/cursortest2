package com.yandex.go.dto.response;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/dto/response/Action$Charity", "Lcom/yandex/go/dto/response/q1;", "Companion", "$serializer", "com/yandex/go/dto/response/k", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Action$Charity extends q1 {
    public static final k Companion = new k();
    public final String a;
    public final String b;

    public Action$Charity(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.CHARITY;
    }

    public Action$Charity() {
        this.a = "";
        this.b = "";
    }
}
