package com.yandex.passport.internal.ui.sloth.ebs;

import com.yandex.passport.api.exception.PassportException;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class s0 implements z0 {
    public final PassportException a;

    public s0(PassportException passportException) {
        this.a = passportException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && jl40.l(this.a, ((s0) obj).a);
    }

    public final int hashCode() {
        PassportException passportException = this.a;
        if (passportException == null) {
            return 0;
        }
        return passportException.hashCode();
    }

    public final String toString() {
        return "EsiaBindFailed(exception=" + this.a + ')';
    }
}
