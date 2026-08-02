package com.yandex.passport.data.network;

import com.yandex.passport.data.models.UserInfoData;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* loaded from: classes15.dex */
public final class ba {
    public final UserInfoData a;
    public final x0 b;
    public final List c;
    public final String d;
    public final boolean e;

    public ba(UserInfoData userInfoData, x0 x0Var, List list, String str, boolean z) {
        this.a = userInfoData;
        this.b = x0Var;
        this.c = list;
        this.d = str;
        this.e = z;
    }

    public final x0 a() {
        return this.b;
    }

    public final List b() {
        return this.c;
    }

    public final UserInfoData c() {
        return this.a;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return jl40.l(this.a, baVar.a) && jl40.l(this.b, baVar.b) && jl40.l(this.c, baVar.c) && jl40.l(this.d, baVar.d) && this.e == baVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        x0 x0Var = this.b;
        int c = unr0.c((hashCode + (x0Var == null ? 0 : x0Var.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((c + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(userInfoData=");
        sb.append(this.a);
        sb.append(", completeStatus=");
        sb.append(this.b);
        sb.append(", members=");
        sb.append(this.c);
        sb.append(", xTokenClientId=");
        sb.append(this.d);
        sb.append(", xTokenNeedReset=");
        return unr0.u(sb, this.e, ')');
    }
}
