package com.yandex.passport.data.models;

import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* loaded from: classes8.dex */
public final class b {
    public final u a;
    public final u b;
    public final List c;

    public b(u uVar, u uVar2, List list) {
        this.a = uVar;
        this.b = uVar2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b) && jl40.l(this.c, bVar.c);
    }

    public final int hashCode() {
        u uVar = this.a;
        int hashCode = (uVar == null ? 0 : uVar.hashCode()) * 31;
        u uVar2 = this.b;
        int hashCode2 = (hashCode + (uVar2 == null ? 0 : uVar2.hashCode())) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppSpecification(amVersion=");
        sb.append(this.a);
        sb.append(", appVersion=");
        sb.append(this.b);
        sb.append(", appId=");
        return unr0.t(sb, this.c, ')');
    }
}
