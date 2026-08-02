package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.lqi0;
import defpackage.oyr;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/RequiredBalance;", "", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/d0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RequiredBalance {
    public static final d0 Companion = new d0();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lqi0(27)), null};
    public final String a;
    public final ComparisonType b;
    public final String c;

    public /* synthetic */ RequiredBalance(int i, String str, ComparisonType comparisonType, String str2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = ComparisonType.UNKNOWN;
        } else {
            this.b = comparisonType;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequiredBalance)) {
            return false;
        }
        RequiredBalance requiredBalance = (RequiredBalance) obj;
        return jl40.l(this.a, requiredBalance.a) && this.b == requiredBalance.b && jl40.l(this.c, requiredBalance.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequiredBalance(currency=");
        sb.append(this.a);
        sb.append(", comparisonType=");
        sb.append(this.b);
        sb.append(", amountAsDecimal=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public RequiredBalance() {
        ComparisonType comparisonType = ComparisonType.UNKNOWN;
        this.a = "";
        this.b = comparisonType;
        this.c = null;
    }
}
