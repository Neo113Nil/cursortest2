package com.yandex.go.payments.shared.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/data/model/AccountDetails;", "", "Companion", "com/yandex/go/payments/shared/data/model/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AccountDetails {
    public static final d Companion = new d();
    public static final AccountDetails d = new AccountDetails(null, null, 7);
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ AccountDetails(String str, int i, String str2, boolean z) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public AccountDetails() {
        this(null, null, 7);
    }

    public AccountDetails(String str, String str2, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? "" : str2;
        this.a = str;
        this.b = str2;
        this.c = false;
    }
}
