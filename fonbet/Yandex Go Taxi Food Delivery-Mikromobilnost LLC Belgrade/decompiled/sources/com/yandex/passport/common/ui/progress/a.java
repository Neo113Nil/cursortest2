package com.yandex.passport.common.ui.progress;

import defpackage.b64;

/* loaded from: classes8.dex */
public final class a implements c {
    public final long a;

    public /* synthetic */ a(int i) {
        this(0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.a == ((a) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b64.o(new StringBuilder("Default(visibilityDelay="), this.a, ')');
    }

    public a() {
        this(0);
    }

    public a(long j) {
        this.a = j;
    }
}
