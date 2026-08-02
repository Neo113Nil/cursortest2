package com.yandex.passport.internal.rotation;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.internal.j;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class b {
    public final MasterToken a;
    public final j b;

    static {
        com.yandex.passport.common.account.b bVar = MasterToken.Companion;
    }

    public b(MasterToken masterToken, j jVar) {
        this.a = masterToken;
        this.b = jVar;
    }

    public final j a() {
        return this.b;
    }

    public final MasterToken b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RotationMasterToken(masterToken=" + this.a + ", masterCredentials=" + this.b + ')';
    }
}
