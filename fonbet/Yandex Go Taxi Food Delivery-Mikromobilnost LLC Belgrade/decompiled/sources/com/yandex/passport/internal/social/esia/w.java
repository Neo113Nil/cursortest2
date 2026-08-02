package com.yandex.passport.internal.social.esia;

import defpackage.jl40;

/* loaded from: classes15.dex */
public final class w implements x {
    public final EsiaBindViewModel$Result a;

    public w(EsiaBindViewModel$Result esiaBindViewModel$Result) {
        this.a = esiaBindViewModel$Result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && jl40.l(this.a, ((w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnBindingResult(result=" + this.a + ')';
    }
}
