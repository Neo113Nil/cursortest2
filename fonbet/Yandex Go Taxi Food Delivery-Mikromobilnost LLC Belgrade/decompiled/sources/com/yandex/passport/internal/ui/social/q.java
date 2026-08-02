package com.yandex.passport.internal.ui.social;

import com.yandex.passport.internal.ui.EventError;

/* loaded from: classes2.dex */
public final class q extends s {
    public final EventError a;

    public q(EventError eventError) {
        this.a = eventError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.a.equals(((q) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(eventError=" + this.a + ')';
    }
}
