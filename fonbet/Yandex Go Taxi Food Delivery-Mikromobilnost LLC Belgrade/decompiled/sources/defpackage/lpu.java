package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class lpu implements b70 {
    public static final lpu a = new lpu();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        hpu hpuVar = (hpu) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(hpuVar.a);
        List list = xdg.a;
        wdg wdgVar = hpuVar.b;
        bfxVar.A1("sectionGroups");
        ep60 a2 = l80.a(zdg.a);
        ArrayList arrayList = wdgVar.a;
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
        return new hpu(str, xdg.c(xdxVar, cVar));
    }
}
