package com.yandex.go.payments.addmethod.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentJsonMessage;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/c0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddPaymentJsonMessage {
    public static final c0 Companion = new c0();
    public final String a;
    public final kotlinx.serialization.json.c b;

    public /* synthetic */ AddPaymentJsonMessage(int i, String str, kotlinx.serialization.json.c cVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new kotlinx.serialization.json.c(kotlin.collections.b.f());
        } else {
            this.b = cVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddPaymentJsonMessage)) {
            return false;
        }
        AddPaymentJsonMessage addPaymentJsonMessage = (AddPaymentJsonMessage) obj;
        return jl40.l(this.a, addPaymentJsonMessage.a) && jl40.l(this.b, addPaymentJsonMessage.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddPaymentJsonMessage(type=" + this.a + ", data=" + this.b + Extension.C_BRAKE;
    }

    public AddPaymentJsonMessage() {
        kotlinx.serialization.json.c cVar = new kotlinx.serialization.json.c(kotlin.collections.b.f());
        this.a = "";
        this.b = cVar;
    }
}
