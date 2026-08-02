package com.yandex.passport.sloth.data;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class b0 extends h {
    public final String a;
    public final Uid b;
    public final SlothTheme c;
    public final PushType w;

    public b0(String str, Uid uid, SlothTheme slothTheme, PushType pushType) {
        super(SlothMode.WebUrlPush);
        this.a = str;
        this.b = uid;
        this.c = slothTheme;
        this.w = pushType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return jl40.l(this.a, b0Var.a) && jl40.l(this.b, b0Var.b) && this.c == b0Var.c && this.w == b0Var.w;
    }

    @Override // com.yandex.passport.sloth.data.h, com.yandex.passport.sloth.data.e
    public final SlothTheme getTheme() {
        return this.c;
    }

    @Override // com.yandex.passport.sloth.data.f
    public final Uid getUid() {
        return this.b;
    }

    public final int hashCode() {
        return this.w.hashCode() + ((this.c.hashCode() + uw51.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebUrlPush(url=");
        uw51.y(sb, this.a, ", uid=");
        sb.append(this.b);
        sb.append(", theme=");
        sb.append(this.c);
        sb.append(", pushType=");
        sb.append(this.w);
        sb.append(')');
        return sb.toString();
    }
}
