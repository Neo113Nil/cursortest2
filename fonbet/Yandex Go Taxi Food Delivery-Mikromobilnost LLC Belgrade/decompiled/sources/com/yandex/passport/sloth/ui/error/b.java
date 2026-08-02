package com.yandex.passport.sloth.ui.error;

import com.yandex.passport.sloth.ui.z0;

/* loaded from: classes2.dex */
public final class b implements c {
    public final z0 a;

    public b(z0 z0Var) {
        this.a = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a.equals(((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SendUiEvent(event=" + this.a + ')';
    }
}
