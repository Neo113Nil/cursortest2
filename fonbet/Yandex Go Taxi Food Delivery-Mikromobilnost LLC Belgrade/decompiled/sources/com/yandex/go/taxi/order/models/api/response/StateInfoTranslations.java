package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/StateInfoTranslations;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/w7", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class StateInfoTranslations {
    public static final w7 Companion = new w7();
    public final ScreenParameters a;

    public /* synthetic */ StateInfoTranslations(int i, ScreenParameters screenParameters) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = screenParameters;
        }
    }

    /* renamed from: a, reason: from getter */
    public final ScreenParameters getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StateInfoTranslations) && jl40.l(this.a, ((StateInfoTranslations) obj).a);
    }

    public final int hashCode() {
        ScreenParameters screenParameters = this.a;
        if (screenParameters == null) {
            return 0;
        }
        return screenParameters.hashCode();
    }

    public final String toString() {
        return "StateInfoTranslations(cardParameters=" + this.a + Extension.C_BRAKE;
    }

    public StateInfoTranslations() {
        this.a = null;
    }
}
