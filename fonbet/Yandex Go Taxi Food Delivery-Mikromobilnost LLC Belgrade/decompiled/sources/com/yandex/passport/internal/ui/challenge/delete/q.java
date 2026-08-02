package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.sloth.data.SlothParams;

/* loaded from: classes2.dex */
public final class q implements r {
    public final SlothParams a;

    public q(SlothParams slothParams) {
        this.a = slothParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.a.equals(((q) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Sloth(slothParams=" + this.a + ')';
    }
}
