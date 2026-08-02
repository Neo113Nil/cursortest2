package com.yandex.passport.common.ui.compose.theme;

import defpackage.unr0;

/* loaded from: classes8.dex */
public final class b {
    public final boolean a;

    public b(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a == ((b) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("DarkMode(isDark="), this.a, ')');
    }
}
