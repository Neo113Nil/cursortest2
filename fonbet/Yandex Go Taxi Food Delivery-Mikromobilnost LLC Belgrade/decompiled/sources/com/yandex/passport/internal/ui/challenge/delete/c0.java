package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.sloth.ui.SlothUiWish;

/* loaded from: classes2.dex */
public final class c0 implements d0 {
    public final SlothUiWish a;

    public c0(SlothUiWish slothUiWish) {
        this.a = slothUiWish;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && this.a == ((c0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlothUiWish(externalWish=" + this.a + ')';
    }
}
