package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class gu60 implements b70 {
    public static final gu60 a = new gu60();
    public static final List b = Collections.singletonList("externalCompositeOffers");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("externalCompositeOffers");
        l80.a(hu60.a).a(bfxVar, cVar, ((cu60) obj).a);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        du60 du60Var = null;
        while (xdxVar.h2(b) == 0) {
            du60Var = (du60) l80.a(hu60.a).b(xdxVar, cVar);
        }
        return new cu60(du60Var);
    }
}
