package com.yandex.go.taxi.order.chat.api.data.model;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/chat/api/data/model/OrderChatParams;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/chat/api/data/model/d", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderChatParams {
    public static final d Companion = new d();
    public final String a;
    public final String b;
    public final String c;
    public final PostMessage d;

    public /* synthetic */ OrderChatParams(int i, String str, String str2, String str3, PostMessage postMessage) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, OrderChatParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = postMessage;
    }

    public final String toString() {
        StringBuilder v = b64.v("OrderChatParams(launchId='", this.a, "', orderId='", this.b, "', newestMessageId=");
        v.append(this.c);
        v.append(", newMessage=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public OrderChatParams(String str, String str2, String str3, PostMessage postMessage) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = postMessage;
    }
}
