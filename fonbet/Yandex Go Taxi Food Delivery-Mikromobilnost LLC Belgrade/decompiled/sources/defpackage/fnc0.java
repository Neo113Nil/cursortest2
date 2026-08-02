package defpackage;

import com.apollographql.apollo3.api.a;
import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class fnc0 implements b70 {
    public static final fnc0 a = new fnc0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        uhc0 uhc0Var = (uhc0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(uhc0Var.c());
        if (uhc0Var.b() != null) {
            List list = wmc0.a;
            wmc0.d(bfxVar, cVar, uhc0Var.b());
        }
        if (uhc0Var.a() != null) {
            List list2 = zkc0.a;
            zkc0.d(bfxVar, cVar, uhc0Var.a());
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        tmc0 tmc0Var;
        j70 j70Var = cVar.a;
        wkc0 wkc0Var = null;
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        if (str == null) {
            ny61.r("__typename was not found");
            return null;
        }
        if (a.a(a.b("IconPlaqueNotification"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            tmc0Var = wmc0.c(xdxVar, cVar);
        } else {
            tmc0Var = null;
        }
        if (a.a(a.b("CounterPlaqueNotification"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            wkc0Var = zkc0.c(xdxVar, cVar);
        }
        return new uhc0(str, tmc0Var, wkc0Var);
    }
}
