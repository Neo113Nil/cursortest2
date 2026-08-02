package xsna;

import com.vk.media.logger.PublisherLoggerLevel;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PublisherLoggerImplL.kt */
/* loaded from: classes3.dex */
public final class axi {
    public final boolean[] a;
    public final HashSet<String> b;

    public axi(boolean[] zArr, boolean z, boolean z2) {
        this.b = new HashSet<>();
        HashSet<String> hashSet = new HashSet<>();
        if (!z) {
            hashSet.add("OKTP");
        }
        if (!z2) {
            hashSet.add("OKMP");
        }
        int length = PublisherLoggerLevel.values().length;
        this.a = zArr;
        this.b = hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axi)) {
            return false;
        }
        boolean[] zArr = this.a;
        if (zArr == null) {
            zArr = null;
        }
        axi axiVar = (axi) obj;
        boolean[] zArr2 = axiVar.a;
        return Arrays.equals(zArr, zArr2 != null ? zArr2 : null) && epx.f(this.b, axiVar.b);
    }

    public final int hashCode() {
        boolean[] zArr = this.a;
        if (zArr == null) {
            zArr = null;
        }
        int hashCode = Arrays.hashCode(zArr) * 961;
        HashSet<String> hashSet = this.b;
        return hashCode + (hashSet != null ? hashSet.hashCode() : 0);
    }
}
