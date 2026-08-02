package com.yandex.passport.internal.ui.social;

/* loaded from: classes2.dex */
public final class r extends s {
    public final com.yandex.passport.internal.ui.base.l a;

    public r(com.yandex.passport.internal.ui.base.l lVar) {
        this.a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.a == ((r) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowActivityData(showActivityInfo=" + this.a + ')';
    }
}
