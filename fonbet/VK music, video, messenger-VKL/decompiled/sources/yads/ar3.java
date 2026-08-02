package yads;

import com.yandex.mobile.ads.common.AdError;
import xsna.epx;

/* loaded from: classes10.dex */
public final class ar3 implements AdError {
    public final String a;

    public ar3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar3) && epx.f(this.a, ((ar3) obj).a);
    }

    @Override // com.yandex.mobile.ads.common.AdError
    public final String getDescription() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xsna.zr.a("YandexAdError(description=", this.a, ")");
    }
}
