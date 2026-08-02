package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.sloth.data.PicturePushState;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class d0 {
    public final String a;
    public final PicturePushState b;
    public final String c;
    public final Uid d;

    public d0(String str, PicturePushState picturePushState, String str2, Uid uid) {
        this.a = str;
        this.b = picturePushState;
        this.c = str2;
        this.d = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return jl40.l(this.a, d0Var.a) && jl40.l(this.b, d0Var.b) && jl40.l(this.c, d0Var.c) && jl40.l(this.d, d0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(trackId=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", url=");
        uw51.y(sb, this.c, ", uid=");
        return uw51.j(sb, this.d, ')');
    }
}
