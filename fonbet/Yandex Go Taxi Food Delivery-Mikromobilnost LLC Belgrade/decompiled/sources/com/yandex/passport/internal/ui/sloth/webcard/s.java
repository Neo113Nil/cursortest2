package com.yandex.passport.internal.ui.sloth.webcard;

import com.yandex.passport.sloth.data.SlothParams;

/* loaded from: classes2.dex */
public final class s implements u {
    public final SlothParams a;

    public s(SlothParams slothParams) {
        this.a = slothParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.a.equals(((s) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SetSlothParams(slothParams=" + this.a + ')';
    }
}
