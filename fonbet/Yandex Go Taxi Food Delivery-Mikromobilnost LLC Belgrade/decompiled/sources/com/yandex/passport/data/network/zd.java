package com.yandex.passport.data.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes8.dex */
public final class zd {
    public static final yd Companion = new yd();
    public static final KSerializer[] c = {null, com.yandex.passport.common.url.b.Companion.serializer()};
    public final String a;
    public final String b;

    public /* synthetic */ zd(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, xd.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd)) {
            return false;
        }
        zd zdVar = (zd) obj;
        return jl40.l(this.a, zdVar.a) && jl40.l(this.b, zdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Result(status=" + this.a + ", avatarUrl=" + ((Object) com.yandex.passport.common.url.b.l(this.b)) + ')';
    }
}
