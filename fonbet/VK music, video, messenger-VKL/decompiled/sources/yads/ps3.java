package yads;

import com.yandex.mobile.ads.common.ImpressionData;
import xsna.epx;

/* loaded from: classes10.dex */
public final class ps3 implements ImpressionData {
    public final j5 a;

    public ps3(j5 j5Var) {
        this.a = j5Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ps3) && epx.f(((ps3) obj).a, this.a);
    }

    @Override // com.yandex.mobile.ads.common.ImpressionData
    public final String getRawData() {
        return this.a.b;
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
