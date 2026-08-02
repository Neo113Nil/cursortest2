package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.unr0;
import java.util.List;

/* loaded from: classes2.dex */
public final class c0 implements n0 {
    public final List a;

    public c0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && this.a.equals(((c0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("ShowChooseMaster(masterAccounts="), this.a, ')');
    }
}
