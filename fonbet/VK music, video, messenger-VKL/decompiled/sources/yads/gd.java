package yads;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class gd implements p11 {
    public final qb2 a;
    public final List b = a();
    public hd c;

    public gd(qb2 qb2Var) {
        this.a = qb2Var;
    }

    public final void a(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                qd qdVar = (qd) ((jd) it.next());
                if (qdVar.a(scheme, host)) {
                    qdVar.a();
                    return;
                }
            }
        } catch (URISyntaxException unused) {
        }
    }

    @Override // yads.p11
    public final void a(int i) {
        int[] iArr = {-12, -6, -11, -2};
        for (int i2 = 0; i2 < 4; i2++) {
            if (i == iArr[i2]) {
                hd hdVar = this.c;
                if (hdVar != null) {
                    ng0.a(((bd) hdVar).a.a);
                    return;
                }
                return;
            }
        }
    }

    public final List a() {
        return Collections.singletonList(new qd("noInterestAd", new fd(this)));
    }
}
