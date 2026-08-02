package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class w {
    public final Uid a;

    public w(Uid uid) {
        this.a = uid;
    }

    public final Uid a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && jl40.l(this.a, ((w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Params(masterUid=" + this.a + ", accountsSnapshot=null)";
    }
}
