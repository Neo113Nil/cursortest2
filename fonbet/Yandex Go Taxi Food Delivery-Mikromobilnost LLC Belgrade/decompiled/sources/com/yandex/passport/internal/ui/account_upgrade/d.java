package com.yandex.passport.internal.ui.account_upgrade;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class d implements f {
    public final Throwable a;

    public d(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.a.equals(((d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("Failed(throwable="), this.a, ')');
    }
}
