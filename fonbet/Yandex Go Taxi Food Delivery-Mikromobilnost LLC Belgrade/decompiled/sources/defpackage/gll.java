package defpackage;

import com.yandex.div.internal.core.a;
import com.yandex.div2.DivContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class gll implements ill {
    public final cxk a;
    public final tls b;
    public final tls c;
    public boolean d;
    public List e;
    public int f;

    public gll(cxk cxkVar, tls tlsVar, tls tlsVar2) {
        this.a = cxkVar;
        this.b = tlsVar;
        this.c = tlsVar2;
    }

    @Override // defpackage.ill
    public final cxk getItem() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // defpackage.ill
    public final cxk q() {
        List g;
        cxk cxkVar = this.a;
        m3k m3kVar = cxkVar.a;
        if (this.d) {
            List list = this.e;
            if (list == null) {
                rvo rvoVar = cxkVar.b;
                boolean z = m3kVar instanceof x2k;
                ?? r4 = EmptyList.a;
                if (!z && !(m3kVar instanceof n2k) && !(m3kVar instanceof l2k) && !(m3kVar instanceof s2k) && !(m3kVar instanceof o2k) && !(m3kVar instanceof t2k) && !(m3kVar instanceof p2k) && !(m3kVar instanceof j2k) && !(m3kVar instanceof r2k) && !(m3kVar instanceof y2k) && !(m3kVar instanceof v2k)) {
                    if (m3kVar instanceof i2k) {
                        DivContainer divContainer = ((i2k) m3kVar).c;
                        g = a.c(divContainer.B, divContainer.z, rvoVar);
                    } else if (m3kVar instanceof m2k) {
                        List list2 = ((m2k) m3kVar).c.y;
                        List list3 = r4;
                        if (list2 != null) {
                            list3 = list2;
                        }
                        g = a.h(list3, rvoVar);
                    } else if (m3kVar instanceof k2k) {
                        g = a.b(((k2k) m3kVar).c, rvoVar);
                    } else if (m3kVar instanceof q2k) {
                        t1l t1lVar = ((q2k) m3kVar).c;
                        g = a.c(t1lVar.t, t1lVar.r, rvoVar);
                    } else if (m3kVar instanceof w2k) {
                        g = a.g(((w2k) m3kVar).c, rvoVar);
                    } else {
                        if (!(m3kVar instanceof u2k)) {
                            w511.b();
                            return null;
                        }
                        List list4 = ((u2k) m3kVar).c.I;
                        r4 = new ArrayList();
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            m3k m3kVar2 = ((cbl) it.next()).c;
                            cxk cxkVar2 = m3kVar2 != null ? new cxk(m3kVar2, rvoVar) : null;
                            if (cxkVar2 != null) {
                                r4.add(cxkVar2);
                            }
                        }
                    }
                    list = g;
                    this.e = list;
                }
                list = r4;
                this.e = list;
            }
            if (this.f < list.size()) {
                int i = this.f;
                this.f = i + 1;
                return (cxk) list.get(i);
            }
            tls tlsVar = this.c;
            if (tlsVar != null) {
                tlsVar.invoke(m3kVar);
            }
        } else {
            tls tlsVar2 = this.b;
            if (tlsVar2 == null || ((Boolean) tlsVar2.invoke(m3kVar)).booleanValue()) {
                this.d = true;
                return cxkVar;
            }
        }
        return null;
    }
}
