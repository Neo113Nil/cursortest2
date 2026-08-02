package yads;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import xsna.e43;

/* loaded from: classes10.dex */
public final class od implements p11 {
    public final dd a;
    public final List b = b();
    public pd c;
    public String d;

    public od(dd ddVar) {
        this.a = ddVar;
    }

    public final void a() {
        pd pdVar = this.c;
        if (pdVar != null) {
            vc vcVar = (vc) pdVar;
            vcVar.a.b.a();
            ng0.a(vcVar.a.a);
        }
    }

    public final List b() {
        return e43.l(new qd("adtuneRendered", new nd(this)), new qd("adtuneClosed", new ld(this)), new qd("openOptOut", new md(this)));
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
            pd pdVar = this.c;
            if (pdVar != null) {
                ((vc) pdVar).a.c.a(str);
            }
        } catch (URISyntaxException unused) {
            a();
        }
    }

    @Override // yads.p11
    public final void a(int i) {
        int[] iArr = {-12, -6, -11, -2};
        for (int i2 = 0; i2 < 4; i2++) {
            if (i == iArr[i2]) {
                a();
                return;
            }
        }
    }
}
