package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class h300 implements b70 {
    public static final h300 a = new h300();
    public static final List b = Collections.singletonList("voluntaryMailingAdsAgreement");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("voluntaryMailingAdsAgreement");
        l80.a(l300.a).a(bfxVar, cVar, ((a300) obj).a);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        e300 e300Var = null;
        while (xdxVar.h2(b) == 0) {
            e300Var = (e300) l80.a(l300.a).b(xdxVar, cVar);
        }
        return new a300(e300Var);
    }
}
