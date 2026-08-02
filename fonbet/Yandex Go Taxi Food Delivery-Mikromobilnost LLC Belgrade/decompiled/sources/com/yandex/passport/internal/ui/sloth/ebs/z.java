package com.yandex.passport.internal.ui.sloth.ebs;

import com.yandex.passport.sloth.data.SlothParams;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class z implements c0 {
    public final EbsProcessState a;
    public final SlothParams b;

    public z(EbsProcessState ebsProcessState, SlothParams slothParams) {
        this.a = ebsProcessState;
        this.b = slothParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.a.equals(zVar.a) && jl40.l(this.b, zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SetEbsProcessState(newState=" + this.a + ", params=" + this.b + ')';
    }
}
