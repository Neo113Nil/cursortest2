package com.yandex.passport.data.network;

import com.yandex.passport.common.account.MasterToken;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class qc implements com.yandex.passport.data.network.core.q {
    public final MasterToken a;
    public final String b;
    public final String c;
    public final com.yandex.passport.data.models.g d;

    public qc(MasterToken masterToken, String str, String str2, com.yandex.passport.data.models.g gVar) {
        this.a = masterToken;
        this.b = str;
        this.c = str2;
        this.d = gVar;
    }

    @Override // com.yandex.passport.data.network.core.q
    public final String a() {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc)) {
            return false;
        }
        qc qcVar = (qc) obj;
        return jl40.l(this.a, qcVar.a) && this.b.equals(qcVar.b) && jl40.l(this.c, qcVar.c) && this.d.equals(qcVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(this.d.a) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Params(masterToken=" + this.a + ", trackId=" + this.b + ", flowId=" + this.c + ", environment=" + this.d + ')';
    }
}
