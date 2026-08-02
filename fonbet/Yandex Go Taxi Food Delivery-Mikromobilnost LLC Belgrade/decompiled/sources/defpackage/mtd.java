package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class mtd implements b70 {
    public static final mtd a = new mtd();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        etd etdVar = (etd) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(etdVar.a);
        List list = ypd.a;
        ypd.d(bfxVar, cVar, etdVar.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new etd(str, ypd.c(xdxVar, cVar));
    }
}
