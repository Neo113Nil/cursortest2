package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class a1e implements b70 {
    public static final a1e a = new a1e();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        w0e w0eVar = (w0e) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(w0eVar.a);
        List list = s1e.a;
        r1e r1eVar = w0eVar.b;
        bfxVar.A1("metaShortcuts");
        t1e t1eVar = t1e.a;
        foe foeVar2 = l80.a;
        lqy lqyVar = new lqy(new ep60(t1eVar, true));
        List list2 = r1eVar.a;
        if (list2 == null) {
            bfxVar.k2();
        } else {
            lqyVar.c(bfxVar, cVar, list2);
        }
        bfxVar.A1("shortcuts");
        lqy lqyVar2 = new lqy(new ep60(u1e.a, true));
        List list3 = r1eVar.b;
        if (list3 == null) {
            bfxVar.k2();
        } else {
            lqyVar2.c(bfxVar, cVar, list3);
        }
        bfxVar.A1("viewType");
        bfxVar.r0(r1eVar.c.getRawValue());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new w0e(str, s1e.c(xdxVar, cVar));
    }
}
