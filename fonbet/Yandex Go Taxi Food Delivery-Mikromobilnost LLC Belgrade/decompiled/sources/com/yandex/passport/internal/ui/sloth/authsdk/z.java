package com.yandex.passport.internal.ui.sloth.authsdk;

import com.yandex.passport.sloth.ui.SlothUiWish;

/* loaded from: classes2.dex */
public final class z implements b0 {
    public final SlothUiWish a;

    public z(SlothUiWish slothUiWish) {
        this.a = slothUiWish;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.a == ((z) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlothExternalUiWish(externalWish=" + this.a + ')';
    }
}
