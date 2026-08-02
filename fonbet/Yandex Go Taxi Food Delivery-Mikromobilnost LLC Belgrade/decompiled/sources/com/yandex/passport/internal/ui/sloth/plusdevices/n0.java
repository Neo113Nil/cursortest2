package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.sloth.ui.SlothUiWish;

/* loaded from: classes2.dex */
public final class n0 implements p0 {
    public final SlothUiWish a;

    public n0(SlothUiWish slothUiWish) {
        this.a = slothUiWish;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && this.a == ((n0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlothExternalUiWish(externalWish=" + this.a + ')';
    }
}
