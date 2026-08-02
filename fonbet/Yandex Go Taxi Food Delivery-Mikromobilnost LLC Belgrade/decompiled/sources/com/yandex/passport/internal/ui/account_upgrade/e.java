package com.yandex.passport.internal.ui.account_upgrade;

import com.yandex.passport.sloth.data.SlothParams;

/* loaded from: classes2.dex */
public final class e implements f {
    public final SlothParams a;

    public e(SlothParams slothParams) {
        this.a = slothParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.a.equals(((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StartSloth(slothParams=" + this.a + ')';
    }
}
