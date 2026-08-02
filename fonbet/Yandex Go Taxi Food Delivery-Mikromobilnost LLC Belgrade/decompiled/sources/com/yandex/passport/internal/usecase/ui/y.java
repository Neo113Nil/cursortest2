package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.entities.Filter;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class y {
    public final String a;
    public final Environment b;
    public final Filter c;

    public y(String str, Environment environment, Filter filter) {
        this.a = str;
        this.b = environment;
        this.c = filter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return jl40.l(this.a, yVar.a) && this.b == yVar.b && jl40.l(this.c, yVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Params(parentName=" + this.a + ", parentEnvironment=" + this.b + ", filter=" + this.c + ')';
    }
}
