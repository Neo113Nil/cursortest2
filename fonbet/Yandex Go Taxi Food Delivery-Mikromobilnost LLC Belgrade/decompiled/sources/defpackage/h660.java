package defpackage;

import com.yandex.div.internal.core.a;
import com.yandex.div2.DivContainer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes11.dex */
public final class h660 extends zmz0 {
    public kmo e;

    public h660(cxk cxkVar, int i, kmo kmoVar) {
        super(cxkVar, i);
        this.e = kmoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
    public final List b() {
        m3k m3kVar;
        cxk cxkVar = this.a;
        rvo rvoVar = cxkVar.b;
        m3k m3kVar2 = cxkVar.a;
        boolean z = m3kVar2 instanceof x2k;
        EmptyList emptyList = EmptyList.a;
        if (!z && !(m3kVar2 instanceof n2k) && !(m3kVar2 instanceof l2k) && !(m3kVar2 instanceof s2k) && !(m3kVar2 instanceof o2k) && !(m3kVar2 instanceof t2k) && !(m3kVar2 instanceof p2k) && !(m3kVar2 instanceof r2k) && !(m3kVar2 instanceof y2k) && !(m3kVar2 instanceof v2k)) {
            if (m3kVar2 instanceof i2k) {
                DivContainer divContainer = ((i2k) m3kVar2).c;
                return c(a.c(divContainer.B, divContainer.z, rvoVar));
            }
            if (m3kVar2 instanceof j2k) {
                ?? r0 = ((j2k) m3kVar2).c.q;
                if (r0 != 0) {
                    emptyList = r0;
                }
                return c(a.h(emptyList, rvoVar));
            }
            if (m3kVar2 instanceof m2k) {
                ?? r02 = ((m2k) m3kVar2).c.y;
                if (r02 != 0) {
                    emptyList = r02;
                }
                return c(a.h(emptyList, rvoVar));
            }
            if (m3kVar2 instanceof k2k) {
                return c(a.b(((k2k) m3kVar2).c, rvoVar));
            }
            if (m3kVar2 instanceof q2k) {
                t1l t1lVar = ((q2k) m3kVar2).c;
                return c(a.c(t1lVar.t, t1lVar.r, rvoVar));
            }
            if (m3kVar2 instanceof w2k) {
                return c(a.g(((w2k) m3kVar2).c, rvoVar));
            }
            if (!(m3kVar2 instanceof u2k)) {
                w511.b();
                return null;
            }
            cbl f = uml.f(((u2k) m3kVar2).c, rvoVar);
            if (f != null && (m3kVar = f.c) != null) {
                return c(Collections.singletonList(new cxk(m3kVar, rvoVar)));
            }
        }
        return emptyList;
    }

    public final ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            arrayList.add(new h660((cxk) obj, i, this.e));
            i = i2;
        }
        return arrayList;
    }
}
