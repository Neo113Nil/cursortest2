package com.yandex.passport.internal.ui.bouncer.chooser;

import defpackage.jl40;

/* loaded from: classes15.dex */
public final class b0 {
    public final z a;

    public b0(z zVar) {
        this.a = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && jl40.l(this.a, ((b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnItemSelected(item=" + this.a + ')';
    }
}
