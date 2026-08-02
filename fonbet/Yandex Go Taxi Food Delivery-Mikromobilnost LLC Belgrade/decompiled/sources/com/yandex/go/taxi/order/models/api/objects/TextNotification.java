package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import defpackage.vfy;
import defpackage.wh60;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/TextNotification;", "Lwh60;", "Lvfy;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/q1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TextNotification implements wh60, vfy {
    public static final q1 Companion = new q1();
    public final String a;
    public final int b;

    public /* synthetic */ TextNotification(int i, String str, int i2) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = 1;
        } else {
            this.b = i2;
        }
    }

    @Override // defpackage.vfy
    /* renamed from: a, reason: from getter */
    public final int getB() {
        return this.b;
    }

    public TextNotification() {
        this.a = null;
        this.b = 1;
    }
}
