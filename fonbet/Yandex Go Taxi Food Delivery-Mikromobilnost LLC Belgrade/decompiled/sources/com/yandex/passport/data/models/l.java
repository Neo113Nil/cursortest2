package com.yandex.passport.data.models;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class l {
    public final String a;
    public final boolean b;
    public final boolean c;

    public l(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return jl40.l(this.a, lVar.a) && this.b == lVar.b && this.c == lVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneNumberValidationResult(formattedPhoneNumber=");
        sb.append(this.a);
        sb.append(", validForCall=");
        sb.append(this.b);
        sb.append(", validForFlashCall=");
        return unr0.u(sb, this.c, ')');
    }
}
