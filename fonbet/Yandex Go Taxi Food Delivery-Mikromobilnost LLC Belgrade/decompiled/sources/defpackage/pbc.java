package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class pbc implements b70 {
    public static final pbc a = new pbc();
    public static final List b = Collections.singletonList("collectUserContacts");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("collectUserContacts");
        l80.a(obc.a).a(bfxVar, cVar, ((mbc) obj).a);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        lbc lbcVar = null;
        while (xdxVar.h2(b) == 0) {
            lbcVar = (lbc) l80.a(obc.a).b(xdxVar, cVar);
        }
        return new mbc(lbcVar);
    }
}
