package com.yandex.passport.internal.report.diary;

import com.yandex.passport.internal.ui.router.RoadSign;

/* loaded from: classes8.dex */
public final class i implements j {
    public final RoadSign a;

    public i(RoadSign roadSign) {
        this.a = roadSign;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.a == ((i) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TypeRoadSign(sign=" + this.a + ')';
    }
}
