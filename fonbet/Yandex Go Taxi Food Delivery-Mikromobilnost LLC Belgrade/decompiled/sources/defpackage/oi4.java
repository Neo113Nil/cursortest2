package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes2.dex */
public final class oi4 implements b70 {
    public static final oi4 a = new oi4();
    public static final List b = scc.g(RemoteBioParameters.X, RemoteBioParameters.Y);

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        gi4 gi4Var = (gi4) obj;
        bfxVar.A1(RemoteBioParameters.X);
        foe foeVar = l80.c;
        foeVar.a(bfxVar, cVar, Double.valueOf(gi4Var.a));
        bfxVar.A1(RemoteBioParameters.Y);
        foeVar.a(bfxVar, cVar, Double.valueOf(gi4Var.b));
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Double d = null;
        Double d2 = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                d = (Double) l80.c.b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new gi4(d.doubleValue(), d2.doubleValue());
                }
                d2 = (Double) l80.c.b(xdxVar, cVar);
            }
        }
    }
}
