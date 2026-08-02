package com.yandex.passport.user_id;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;

@gsq0
/* loaded from: classes2.dex */
public final class h implements p {
    public static final g Companion = new g();
    public final String a;
    public final String b;

    public /* synthetic */ h(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, f.a.getDescriptor());
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
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return jl40.l(this.a, hVar.a) && jl40.l(this.b, hVar.b);
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
