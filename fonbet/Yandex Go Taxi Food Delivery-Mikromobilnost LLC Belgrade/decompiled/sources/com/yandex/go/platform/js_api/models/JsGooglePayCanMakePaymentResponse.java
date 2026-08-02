package com.yandex.go.platform.js_api.models;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/platform/js_api/models/JsGooglePayCanMakePaymentResponse;", "", "Companion", "$serializer", "com/yandex/go/platform/js_api/models/j", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class JsGooglePayCanMakePaymentResponse {
    public static final j Companion = new j();
    public final boolean a;

    public /* synthetic */ JsGooglePayCanMakePaymentResponse(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            qje.Z(i, 1, JsGooglePayCanMakePaymentResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public JsGooglePayCanMakePaymentResponse() {
        this.a = false;
    }
}
