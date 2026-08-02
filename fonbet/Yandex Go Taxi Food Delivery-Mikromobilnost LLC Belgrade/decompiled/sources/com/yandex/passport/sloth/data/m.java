package com.yandex.passport.sloth.data;

import com.yandex.passport.common.core.Uid;
import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class m extends c0 implements f {
    public final Uid a;
    public final String b;

    public m(Uid uid, String str) {
        super(SlothMode.AuthQrWithoutQrSlider);
        this.a = uid;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return jl40.l(this.a, mVar.a) && jl40.l(this.b, mVar.b);
    }

    @Override // com.yandex.passport.sloth.data.f
    public final Uid getUid() {
        return this.a;
    }

    public final int hashCode() {
        Uid uid = this.a;
        return this.b.hashCode() + ((uid == null ? 0 : uid.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthQrWithoutQrSlider(uid=");
        sb.append(this.a);
        sb.append(", browserName=");
        return b64.p(sb, this.b, ')');
    }
}
