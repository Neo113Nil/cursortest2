package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class kpu implements b70 {
    public static final kpu a = new kpu();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        gpu gpuVar = (gpu) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(gpuVar.a);
        List list = z0e.a;
        y0e y0eVar = gpuVar.b;
        bfxVar.A1("sectionGroups");
        ep60 a2 = l80.a(b1e.a);
        ArrayList arrayList = y0eVar.a;
        bfxVar.l();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a2.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new gpu(str, z0e.c(xdxVar, cVar));
    }
}
