package com.yandex.passport.sloth.data;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class l extends c0 implements f {
    public final String a;
    public final Uid b;

    public l(Uid uid, String str) {
        super(SlothMode.AuthQrWithoutQr);
        this.a = str;
        this.b = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return jl40.l(this.a, lVar.a) && jl40.l(this.b, lVar.b);
    }

    @Override // com.yandex.passport.sloth.data.f
    public final Uid getUid() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthQrWithoutQr(url=");
        uw51.y(sb, this.a, ", uid=");
        return uw51.j(sb, this.b, ')');
    }
}
