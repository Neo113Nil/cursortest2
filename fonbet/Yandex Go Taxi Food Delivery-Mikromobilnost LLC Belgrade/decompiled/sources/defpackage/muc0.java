package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class muc0 implements b70 {
    public static final muc0 a = new muc0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        huc0 huc0Var = (huc0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(huc0Var.a);
        List list = mnc0.a;
        lnc0 lnc0Var = huc0Var.b;
        bfxVar.A1("widgetId");
        om60 om60Var = l80.i;
        om60Var.a(bfxVar, cVar, lnc0Var.a);
        bfxVar.A1("widgetGroupId");
        om60Var.a(bfxVar, cVar, lnc0Var.b);
        bfxVar.A1("type");
        bfxVar.r0(lnc0Var.c.getRawValue());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new huc0(str, mnc0.c(xdxVar, cVar));
    }
}
