package com.yandex.passport.data.network;

import com.yandex.passport.common.account.MasterToken;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class ia implements com.yandex.passport.data.network.core.q {
    public final MasterToken a;
    public final String b;
    public final com.yandex.passport.data.models.g c;

    public ia(MasterToken masterToken, String str, com.yandex.passport.data.models.g gVar) {
        this.a = masterToken;
        this.b = str;
        this.c = gVar;
    }

    @Override // com.yandex.passport.data.network.core.q
    public final String a() {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia)) {
            return false;
        }
        ia iaVar = (ia) obj;
        return jl40.l(this.a, iaVar.a) && this.b.equals(iaVar.b) && this.c.equals(iaVar.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Params(masterToken=" + this.a + ", installId=" + this.b + ", environment=" + this.c + ')';
    }
}
