package com.yandex.passport.internal.ui.sloth.ebs;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class o0 implements z0 {
    public final String a;

    public o0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && jl40.l(this.a, ((o0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("BiometricInitializationError(error="), this.a, ')');
    }
}
