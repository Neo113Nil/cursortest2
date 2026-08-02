package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class nec implements b70 {
    public static final nec a = new nec();
    public static final List b = scc.g("color", "location");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bec becVar = (bec) obj;
        bfxVar.A1("color");
        l80.a(kec.a).a(bfxVar, cVar, becVar.a);
        bfxVar.A1("location");
        l80.c.a(bfxVar, cVar, Double.valueOf(becVar.b));
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        ydc ydcVar = null;
        Double d = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                ydcVar = (ydc) l80.a(kec.a).b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new bec(ydcVar, d.doubleValue());
                }
                d = (Double) l80.c.b(xdxVar, cVar);
            }
        }
    }
}
