package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;

/* loaded from: classes11.dex */
public final class j7p {
    public final int a;
    public final ArrayList b;

    public j7p(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final String toString() {
        p891 p891Var = new p891("FaceContour", 11);
        p891Var.f(this.a, "type");
        p891Var.j(this.b.toArray(), CRLDistributionPointsExtension.POINTS);
        return p891Var.toString();
    }
}
