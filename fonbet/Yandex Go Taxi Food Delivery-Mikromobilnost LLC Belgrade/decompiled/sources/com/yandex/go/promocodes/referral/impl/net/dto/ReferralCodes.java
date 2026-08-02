package com.yandex.go.promocodes.referral.impl.net.dto;

import com.yandex.go.promocodes.referral.api.net.dto.ReferralCode;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.vci0;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/referral/impl/net/dto/ReferralCodes;", "", "Companion", "com/yandex/go/promocodes/referral/impl/net/dto/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ReferralCodes {
    public static final d Companion = new d();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vci0(4))};
    public static final ReferralCodes c = new ReferralCodes(EmptyList.a);
    public static final ReferralCodes d = new ReferralCodes(Collections.singletonList(ReferralCode.o));
    public final List a;

    public /* synthetic */ ReferralCodes(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReferralCodes) && jl40.l(this.a, ((ReferralCodes) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("ReferralCodes(referralCodes=", Extension.C_BRAKE, this.a);
    }

    public ReferralCodes(List list) {
        this.a = list;
    }

    public ReferralCodes() {
        this(EmptyList.a);
    }
}
