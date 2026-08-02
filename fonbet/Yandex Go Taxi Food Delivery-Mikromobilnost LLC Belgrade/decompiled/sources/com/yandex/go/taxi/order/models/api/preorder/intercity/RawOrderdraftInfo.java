package com.yandex.go.taxi.order.models.api.preorder.intercity;

import defpackage.gsq0;
import kotlin.Metadata;
import kotlinx.serialization.json.c;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/preorder/intercity/RawOrderdraftInfo;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/preorder/intercity/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RawOrderdraftInfo {
    public static final b Companion = new b();
    public final kotlinx.serialization.json.b a;

    public /* synthetic */ RawOrderdraftInfo(int i, kotlinx.serialization.json.b bVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bVar;
        }
    }

    public RawOrderdraftInfo(c cVar) {
        this.a = cVar;
    }

    public RawOrderdraftInfo() {
        this(null);
    }
}
