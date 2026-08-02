package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;

@imi0
/* loaded from: classes10.dex */
public final class ei2 {
    public static final di2 Companion = new di2();
    public static final KSerializer[] b = {new xsna.yk3(hi2.a)};
    public final List a;

    public /* synthetic */ ei2(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            xsna.sp.x(i, 1, ci2.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ei2) && epx.f(this.a, ((ei2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xsna.wq.c("PrefetchedMediationData(mediationPrefetchAdapters=", ")", this.a);
    }

    public ei2(List list) {
        this.a = list;
    }
}
