package com.yandex.passport.data.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes15.dex */
public final class r3 {
    public static final q3 Companion = new q3();
    public static final KSerializer[] b = {com.yandex.passport.common.url.b.Companion.serializer()};
    public final String a;

    public /* synthetic */ r3(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, p3.a.getDescriptor());
            throw null;
        }
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3) && jl40.l(this.a, ((r3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Tag(url=" + ((Object) com.yandex.passport.common.url.b.l(this.a)) + ')';
    }
}
