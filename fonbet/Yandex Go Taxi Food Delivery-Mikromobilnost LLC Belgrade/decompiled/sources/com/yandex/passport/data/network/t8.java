package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/data/network/t8;", "", "Companion", "com/yandex/passport/data/network/r8", "com/yandex/passport/data/network/s8", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class t8 {
    public static final s8 Companion = new s8();
    public final String a;
    public final String b;

    public /* synthetic */ t8(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8)) {
            return false;
        }
        t8 t8Var = (t8) obj;
        return jl40.l(this.a, t8Var.a) && jl40.l(this.b, t8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SsoConfigDTO(appId=");
        sb.append(this.a);
        sb.append(", fingerprint=");
        return b64.p(sb, this.b, ')');
    }

    public t8() {
        this.a = "";
        this.b = "";
    }
}
