package com.yandex.go.payments.cards.data.model;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/data/model/BindingRequest;", "", "Companion", "$serializer", "com/yandex/go/payments/cards/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BindingRequest {
    public static final c Companion = new c();
    public final String a;
    public final String b;
    public final int c;

    public /* synthetic */ BindingRequest(int i, int i2, String str, String str2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, BindingRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
    }

    public BindingRequest(String str, int i) {
        this.a = str;
        this.b = JCP.DIGEST_SHA512;
        this.c = i;
    }
}
