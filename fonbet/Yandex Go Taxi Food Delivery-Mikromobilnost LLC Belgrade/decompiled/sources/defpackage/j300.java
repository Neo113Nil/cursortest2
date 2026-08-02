package defpackage;

import com.apollographql.apollo3.api.a;
import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class j300 implements b70 {
    public static final j300 a = new j300();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        c300 c300Var = (c300) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(c300Var.a);
        b300 b300Var = c300Var.b;
        if (b300Var != null) {
            i300.d(bfxVar, cVar, b300Var);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        j70 j70Var = cVar.a;
        b300 b300Var = null;
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        if (str == null) {
            ny61.r("__typename was not found");
            return null;
        }
        if (a.a(a.b("DecoratedTextReferencePartHighlight"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            b300Var = i300.c(xdxVar, cVar);
        }
        return new c300(str, b300Var);
    }
}
