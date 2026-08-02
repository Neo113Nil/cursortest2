package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class lec implements b70 {
    public static final lec a = new lec();
    public static final List b = scc.g("color", "location");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        zdc zdcVar = (zdc) obj;
        bfxVar.A1("color");
        l80.a(mec.a).a(bfxVar, cVar, zdcVar.a);
        bfxVar.A1("location");
        l80.c.a(bfxVar, cVar, Double.valueOf(zdcVar.b));
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        aec aecVar = null;
        Double d = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                aecVar = (aec) l80.a(mec.a).b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new zdc(aecVar, d.doubleValue());
                }
                d = (Double) l80.c.b(xdxVar, cVar);
            }
        }
    }
}
