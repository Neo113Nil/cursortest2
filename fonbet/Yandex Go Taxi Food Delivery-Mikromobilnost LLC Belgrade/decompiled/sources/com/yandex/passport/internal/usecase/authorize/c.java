package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.credentials.CredentialProvider;
import com.yandex.passport.internal.entities.Code;
import com.yandex.passport.internal.util.p;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class c implements m {
    public final Code a;
    public final String b;
    public final CredentialProvider c;
    public final AnalyticsFromValue d;
    public final Environment e;

    public c(Code code, String str, CredentialProvider credentialProvider, AnalyticsFromValue analyticsFromValue) {
        this.a = code;
        this.b = str;
        this.c = credentialProvider;
        this.d = analyticsFromValue;
        this.e = p.u(code.m302getEnvironment());
    }

    @Override // com.yandex.passport.internal.usecase.authorize.m
    public final AnalyticsFromValue a() {
        return this.d;
    }

    @Override // com.yandex.passport.internal.usecase.authorize.m
    public final long b() {
        return 0L;
    }

    public final Code c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final CredentialProvider e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return jl40.l(this.a, cVar.a) && jl40.l(this.b, cVar.b) && jl40.l(this.c, cVar.c) && jl40.l(this.d, cVar.d);
    }

    @Override // com.yandex.passport.internal.usecase.authorize.m
    public final Environment getEnvironment() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Params(code=" + this.a + ", codeVerifier=" + this.b + ", credentialsProvider=" + this.c + ", analyticsFromValue=" + this.d + ", socialCode=null)";
    }
}
