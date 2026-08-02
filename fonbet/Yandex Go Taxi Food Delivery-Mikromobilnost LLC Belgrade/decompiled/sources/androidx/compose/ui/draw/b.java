package androidx.compose.ui.draw;

import defpackage.bs6;
import defpackage.c1y;
import defpackage.fwi;
import defpackage.hvn;
import defpackage.jvh;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes10.dex */
public final class b implements fwi {
    public bs6 a = hvn.a;
    public jvh b;

    public final jvh a(final tls tlsVar) {
        return b(new tls() { // from class: androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                c1y c1yVar = (c1y) obj;
                tls.this.invoke(c1yVar);
                c1yVar.a();
                return zy11.a;
            }
        });
    }

    public final jvh b(tls tlsVar) {
        jvh jvhVar = new jvh();
        jvhVar.a = tlsVar;
        this.b = jvhVar;
        return jvhVar;
    }

    @Override // defpackage.fwi
    public final float getDensity() {
        return this.a.getDensity().getDensity();
    }

    @Override // defpackage.fwi
    public final float u0() {
        return this.a.getDensity().u0();
    }
}
