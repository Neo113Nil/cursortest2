package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class gb9 implements b70 {
    public static final gb9 a = new gb9();
    public static final List b = Collections.singletonList("changeVoluntaryAgreementStatus");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("changeVoluntaryAgreementStatus");
        l80.a(fb9.a).a(bfxVar, cVar, ((db9) obj).a);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        cb9 cb9Var = null;
        while (xdxVar.h2(b) == 0) {
            cb9Var = (cb9) l80.a(fb9.a).b(xdxVar, cVar);
        }
        return new db9(cb9Var);
    }
}
