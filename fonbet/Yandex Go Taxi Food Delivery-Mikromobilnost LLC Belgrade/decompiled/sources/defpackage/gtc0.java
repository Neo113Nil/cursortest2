package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.core.graphql.type.HORIZONTAL_RULE;
import com.yandex.plus.core.graphql.type.VERTICAL_RULE;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class gtc0 implements b70 {
    public static final gtc0 a = new gtc0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        msc0 msc0Var = (msc0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(msc0Var.a);
        List list = ztc0.a;
        xtc0 xtc0Var = msc0Var.b;
        bfxVar.A1("displayRules");
        ytc0 ytc0Var = ytc0.a;
        foe foeVar2 = l80.a;
        wtc0 wtc0Var = xtc0Var.a;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            ytc0Var.a(bfxVar, cVar, wtc0Var);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            ytc0Var.a(ek00Var2, cVar, wtc0Var);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1("opacity");
        om60 om60Var = l80.k;
        om60Var.a(bfxVar, cVar, xtc0Var.b);
        bfxVar.A1("horizontalRule");
        foe foeVar3 = foe.c;
        HORIZONTAL_RULE horizontal_rule = xtc0Var.c;
        if (horizontal_rule == null) {
            bfxVar.k2();
        } else {
            foeVar3.a(bfxVar, cVar, horizontal_rule);
        }
        bfxVar.A1("verticalRule");
        foe foeVar4 = foe.j;
        VERTICAL_RULE vertical_rule = xtc0Var.d;
        if (vertical_rule == null) {
            bfxVar.k2();
        } else {
            foeVar4.a(bfxVar, cVar, vertical_rule);
        }
        bfxVar.A1("widthFix");
        om60Var.a(bfxVar, cVar, xtc0Var.e);
        bfxVar.A1("widthType");
        bfxVar.r0(xtc0Var.f.getRawValue());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new msc0(str, ztc0.c(xdxVar, cVar));
    }
}
