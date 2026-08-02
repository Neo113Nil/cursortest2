package com.yandex.passport.data.network;

import defpackage.jl40;
import java.util.Arrays;

/* loaded from: classes15.dex */
public final class vd implements com.yandex.passport.data.network.core.q {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final String c;
    public final byte[] d;

    public vd(com.yandex.passport.data.models.g gVar, long j, String str, byte[] bArr) {
        this.a = gVar;
        this.b = j;
        this.c = str;
        this.d = bArr;
    }

    @Override // com.yandex.passport.data.network.core.q
    public final String a() {
        return this.c;
    }

    public final byte[] b() {
        return this.d;
    }

    public final com.yandex.passport.data.models.g c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vd.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        vd vdVar = (vd) obj;
        return jl40.l(this.c, vdVar.c) && Arrays.equals(this.d, vdVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "Params(environment=" + this.a + ", locationId=" + this.b + ", masterTokenValue=" + this.c + ", avatarBody=" + Arrays.toString(this.d) + ')';
    }
}
