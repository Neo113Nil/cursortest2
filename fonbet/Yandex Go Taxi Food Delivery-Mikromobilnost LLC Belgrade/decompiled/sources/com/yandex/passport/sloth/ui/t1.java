package com.yandex.passport.sloth.ui;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class t1 implements y1 {
    public final String a;

    public t1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1) && jl40.l(this.a, ((t1) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("OnPhoneNumber(phoneNumber="), this.a, ')');
    }
}
