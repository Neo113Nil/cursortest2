package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.api.PassportSocialProviderCode;
import com.yandex.passport.common.core.Environment;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class k {
    public final Environment a;
    public final String b;
    public final PassportSocialProviderCode c;

    public k(Environment environment, String str, PassportSocialProviderCode passportSocialProviderCode) {
        this.a = environment;
        this.b = str;
        this.c = passportSocialProviderCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && jl40.l(this.b, kVar.b) && this.c == kVar.c;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        PassportSocialProviderCode passportSocialProviderCode = this.c;
        return b + (passportSocialProviderCode == null ? 0 : passportSocialProviderCode.hashCode());
    }

    public final String toString() {
        return "Params(environment=" + this.a + ", socialTaskId=" + this.b + ", socialCode=" + this.c + ')';
    }
}
