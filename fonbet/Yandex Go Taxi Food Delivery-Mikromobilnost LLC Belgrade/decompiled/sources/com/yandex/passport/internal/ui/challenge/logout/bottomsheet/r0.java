package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

/* loaded from: classes2.dex */
public final class r0 implements t0 {
    public final Exception a;

    public r0(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && this.a.equals(((r0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Exception(throwable=" + this.a + ')';
    }
}
