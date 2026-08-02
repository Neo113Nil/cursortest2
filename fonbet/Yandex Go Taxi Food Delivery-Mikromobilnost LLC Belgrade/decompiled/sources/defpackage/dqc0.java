package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class dqc0 implements b70 {
    public static final dqc0 a = new dqc0();
    public static final List b = Collections.singletonList("plaque");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("plaque");
        eqc0 eqc0Var = eqc0.a;
        foe foeVar = l80.a;
        ep60 ep60Var = new ep60(eqc0Var, true);
        bqc0 bqc0Var = ((aqc0) obj).a;
        if (bqc0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, bqc0Var);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        bqc0 bqc0Var = null;
        while (xdxVar.h2(b) == 0) {
            eqc0 eqc0Var = eqc0.a;
            foe foeVar = l80.a;
            ep60 ep60Var = new ep60(eqc0Var, true);
            if (xdxVar.peek() == JsonReader$Token.NULL) {
                xdxVar.skipValue();
                b2 = null;
            } else {
                b2 = ep60Var.b(xdxVar, cVar);
            }
            bqc0Var = (bqc0) b2;
        }
        return new aqc0(bqc0Var);
    }
}
