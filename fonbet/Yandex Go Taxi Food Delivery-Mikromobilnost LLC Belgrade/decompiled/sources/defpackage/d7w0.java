package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class d7w0 {
    public final BoundingBox a;
    public final List b;

    public d7w0(BoundingBox boundingBox, List list) {
        this.a = boundingBox;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7w0)) {
            return false;
        }
        d7w0 d7w0Var = (d7w0) obj;
        return this.a.equals(d7w0Var.a) && this.b.equals(d7w0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Candidate(bbox=" + this.a + ", kinds=" + this.b + Extension.C_BRAKE;
    }
}
