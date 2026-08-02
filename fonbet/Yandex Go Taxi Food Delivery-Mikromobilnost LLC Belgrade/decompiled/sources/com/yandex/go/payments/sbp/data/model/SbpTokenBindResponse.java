package com.yandex.go.payments.sbp.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/sbp/data/model/SbpTokenBindResponse;", "", "Companion", "$serializer", "com/yandex/go/payments/sbp/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SbpTokenBindResponse {
    public static final c Companion = new c();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ SbpTokenBindResponse(int i, String str, String str2, String str3) {
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
            this.c = "";
        } else {
            this.c = str3;
        }
    }

    public SbpTokenBindResponse() {
        this.a = null;
        this.b = null;
        this.c = "";
    }
}
