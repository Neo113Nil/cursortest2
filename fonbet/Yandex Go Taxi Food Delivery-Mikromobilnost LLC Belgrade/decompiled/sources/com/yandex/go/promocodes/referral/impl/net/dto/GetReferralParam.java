package com.yandex.go.promocodes.referral.impl.net.dto;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/referral/impl/net/dto/GetReferralParam;", "", "Companion", "$serializer", "com/yandex/go/promocodes/referral/impl/net/dto/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetReferralParam {
    public static final a Companion = new a();
    public final String a;
    public final boolean b;

    public /* synthetic */ GetReferralParam(int i, String str, boolean z) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, GetReferralParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = true;
        } else {
            this.b = z;
        }
    }

    public GetReferralParam(String str) {
        this.a = str;
        this.b = true;
    }
}
