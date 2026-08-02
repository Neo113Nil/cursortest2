package com.yandex.passport.internal.ui.sloth.webcard;

import com.yandex.passport.sloth.ui.SlothUiWish;

/* loaded from: classes2.dex */
public final class d0 implements f0 {
    public final SlothUiWish a;

    public d0(SlothUiWish slothUiWish) {
        this.a = slothUiWish;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && this.a == ((d0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlothExternalUiWish(externalWish=" + this.a + ')';
    }
}
