package com.yandex.passport.data.network;

import defpackage.unr0;
import java.util.List;

/* loaded from: classes8.dex */
public final class l0 implements n0 {
    public final List a;

    public l0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && this.a.equals(((l0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("Empty(cookies="), this.a, ')');
    }
}
