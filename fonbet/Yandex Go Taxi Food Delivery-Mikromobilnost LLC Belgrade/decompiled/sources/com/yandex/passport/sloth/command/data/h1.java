package com.yandex.passport.sloth.command.data;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;

@gsq0
/* loaded from: classes2.dex */
public final class h1 {
    public static final g1 Companion = new g1();
    public final String a;

    public /* synthetic */ h1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, f1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1) && jl40.l(this.a, ((h1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("StorePhoneNumberData(phoneNumber="), this.a, ')');
    }
}
