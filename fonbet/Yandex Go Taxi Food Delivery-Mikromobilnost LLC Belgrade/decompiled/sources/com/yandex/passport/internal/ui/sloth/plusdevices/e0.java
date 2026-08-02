package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.sloth.data.SlothParams;

/* loaded from: classes2.dex */
public final class e0 implements f0 {
    public final SlothParams a;

    public e0(SlothParams slothParams) {
        this.a = slothParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && this.a.equals(((e0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SetSlothParams(slothParams=" + this.a + ')';
    }
}
