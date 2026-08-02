package com.yandex.passport.sloth.command.data;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;

@gsq0
/* loaded from: classes2.dex */
public final class i {
    public static final h Companion = new h();
    public final String a;
    public final String b;

    public /* synthetic */ i(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, g.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return jl40.l(this.a, iVar.a) && jl40.l(this.b, iVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinishWithItemData(item=");
        sb.append(this.a);
        sb.append(", params=");
        return b64.p(sb, this.b, ')');
    }
}
