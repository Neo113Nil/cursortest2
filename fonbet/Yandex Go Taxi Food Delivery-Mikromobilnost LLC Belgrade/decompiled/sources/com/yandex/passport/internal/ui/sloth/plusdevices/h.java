package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.sloth.data.SlothParams;

/* loaded from: classes2.dex */
public final class h extends i {
    public final SlothParams a;

    public h(SlothParams slothParams) {
        this.a = slothParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.a.equals(((h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowManagingPlusDevicesSloth(params=" + this.a + ')';
    }
}
