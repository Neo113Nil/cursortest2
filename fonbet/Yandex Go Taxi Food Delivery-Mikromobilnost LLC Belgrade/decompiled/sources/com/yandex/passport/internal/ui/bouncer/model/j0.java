package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.sloth.data.SlothParams;

/* loaded from: classes2.dex */
public final class j0 implements n0 {
    public final SlothParams a;

    public j0(SlothParams slothParams) {
        this.a = slothParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.a.equals(((j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StartSloth(slothParams=" + this.a + ')';
    }
}
