package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class f7p implements h7p {
    public final BoundingBox a;

    public f7p(BoundingBox boundingBox) {
        this.a = boundingBox;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f7p) && jl40.l(this.a, ((f7p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRoute(routeBoundaryBox=" + this.a + Extension.C_BRAKE;
    }
}
