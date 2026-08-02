package com.yandex.passport.internal.ui.sloth.webauthn;

import com.yandex.passport.sloth.ui.SlothUiWish;

/* loaded from: classes2.dex */
public final class t implements v {
    public final SlothUiWish a;

    public t(SlothUiWish slothUiWish) {
        this.a = slothUiWish;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.a == ((t) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlothExternalUiWish(externalWish=" + this.a + ')';
    }
}
