package com.yandex.go.taxi.order.chat.api.data.model;

import defpackage.gsq0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/chat/api/data/model/Translation;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/chat/api/data/model/j", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Translation {
    public static final j Companion = new j();
    public final String a;
    public final String b;

    public /* synthetic */ Translation(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final String toString() {
        return unr0.p("Translation(language=", this.a, ", text=", this.b, Extension.C_BRAKE);
    }

    public Translation(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public Translation() {
        this(null, null);
    }
}
