package com.yandex.passport.internal.flags.presentation;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class l0 implements n0 {
    public final com.yandex.passport.internal.flags.g a;
    public final String b;

    public l0(com.yandex.passport.internal.flags.g gVar, String str) {
        this.a = gVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.a.equals(l0Var.a) && jl40.l(this.b, l0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnFlagEdited(flag=");
        sb.append(this.a);
        sb.append(", inputValue=");
        return b64.p(sb, this.b, ')');
    }
}
