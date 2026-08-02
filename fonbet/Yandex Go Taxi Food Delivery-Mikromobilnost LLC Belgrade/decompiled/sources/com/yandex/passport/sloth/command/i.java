package com.yandex.passport.sloth.command;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;

@gsq0
/* loaded from: classes2.dex */
public final class i {
    public static final h Companion = new h();
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ i(int i, int i2, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, g.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && jl40.l(this.b, iVar.b) && jl40.l(this.c, iVar.c) && jl40.l(this.d, iVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsRequest(version=");
        sb.append(this.a);
        sb.append(", message=");
        sb.append(this.b);
        sb.append(", requestId=");
        sb.append(this.c);
        sb.append(", data=");
        return b64.p(sb, this.d, ')');
    }
}
