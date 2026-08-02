package com.yandex.passport.internal.methods.requester;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.k2;
import com.yandex.passport.internal.upgrader.UpgradeStatusRequestType;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class c {
    public final k2 a;
    public final UpgradeStatusRequestType b;

    public c(PassportUidImpl passportUidImpl, UpgradeStatusRequestType upgradeStatusRequestType) {
        this.a = passportUidImpl;
        this.b = upgradeStatusRequestType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return jl40.l(this.a, cVar.a) && this.b == cVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Params(passportUid=" + this.a + ", requestType=" + this.b + ')';
    }
}
