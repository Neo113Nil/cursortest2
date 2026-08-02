package com.yandex.passport.internal.ui.sloth.ebs;

import defpackage.oyr;

/* loaded from: classes2.dex */
public final class a0 implements c0 {
    public final int a;

    public a0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.a == ((a0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("SetResultCode(resultCode="), this.a, ')');
    }
}
