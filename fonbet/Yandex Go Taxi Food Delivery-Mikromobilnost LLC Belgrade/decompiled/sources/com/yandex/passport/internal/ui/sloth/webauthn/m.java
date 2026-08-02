package com.yandex.passport.internal.ui.sloth.webauthn;

import com.yandex.passport.sloth.data.SlothParams;

/* loaded from: classes2.dex */
public final class m implements n {
    public final SlothParams a;

    public m(SlothParams slothParams) {
        this.a = slothParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.a.equals(((m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SetSlothParams(params=" + this.a + ')';
    }
}
