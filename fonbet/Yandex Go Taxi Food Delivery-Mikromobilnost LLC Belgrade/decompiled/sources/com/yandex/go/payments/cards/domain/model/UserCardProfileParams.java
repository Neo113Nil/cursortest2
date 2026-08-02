package com.yandex.go.payments.cards.domain.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.zzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/domain/model/UserCardProfileParams;", "", "Companion", "$serializer", "com/yandex/go/payments/cards/domain/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UserCardProfileParams {
    public static final a Companion = new a();
    public final zzs a;
    public final String b;
    public final Integer c;

    public /* synthetic */ UserCardProfileParams(int i, zzs zzsVar, String str, Integer num) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = zzsVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCardProfileParams)) {
            return false;
        }
        UserCardProfileParams userCardProfileParams = (UserCardProfileParams) obj;
        return jl40.l(this.a, userCardProfileParams.a) && jl40.l(this.b, userCardProfileParams.b) && jl40.l(this.c, userCardProfileParams.c);
    }

    public final int hashCode() {
        zzs zzsVar = this.a;
        int hashCode = (zzsVar == null ? 0 : zzsVar.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserCardProfileParams(geoPoint=");
        sb.append(this.a);
        sb.append(", countryCode=");
        sb.append(this.b);
        sb.append(", regionId=");
        return oo31.j(sb, this.c, Extension.C_BRAKE);
    }

    public UserCardProfileParams(zzs zzsVar, Integer num, String str) {
        this.a = zzsVar;
        this.b = str;
        this.c = num;
    }

    public UserCardProfileParams() {
        this(null, null, null);
    }
}
