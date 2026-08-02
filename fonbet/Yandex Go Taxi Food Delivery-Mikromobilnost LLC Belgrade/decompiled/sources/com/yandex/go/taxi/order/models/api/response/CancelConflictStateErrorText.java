package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/CancelConflictStateErrorText;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/r", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CancelConflictStateErrorText {
    public static final r Companion = new r();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ CancelConflictStateErrorText(int i, String str, String str2, String str3) {
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
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public CancelConflictStateErrorText() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
