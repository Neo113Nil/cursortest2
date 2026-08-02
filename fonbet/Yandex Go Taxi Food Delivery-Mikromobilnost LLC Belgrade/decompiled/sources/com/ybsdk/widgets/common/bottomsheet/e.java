package com.ybsdk.widgets.common.bottomsheet;

import defpackage.jl40;
import defpackage.ly3;
import defpackage.sls;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class e implements d {
    public final Integer a;
    public final Integer b;
    public final sls c;

    public e(Integer num, Integer num2, sls slsVar, int i) {
        num = (i & 1) != 0 ? null : num;
        num2 = (i & 2) != 0 ? null : num2;
        this.a = num;
        this.b = num2;
        this.c = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return jl40.l(this.a, eVar.a) && jl40.l(this.b, eVar.b) && this.c.equals(eVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return this.c.hashCode() + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomView(topPadding=");
        sb.append(this.a);
        sb.append(", bottomPadding=");
        sb.append(this.b);
        sb.append(", viewProvider=");
        return ly3.r(sb, this.c, Extension.C_BRAKE);
    }
}
