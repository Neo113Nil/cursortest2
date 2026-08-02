package com.yandex.passport.internal.sloth.performers.webcard;

import defpackage.jl40;
import kotlin.Result;

/* loaded from: classes15.dex */
public final class c implements f {
    public final Object a;

    public c(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && jl40.l(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        return Result.b(this.a);
    }

    public final String toString() {
        return "BeginChangePassword(result=" + ((Object) Result.c(this.a)) + ')';
    }
}
