package defpackage;

import defpackage.d8i;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class l8i implements qqo {
    public final /* synthetic */ qqo a;

    public l8i(rqo rqoVar) {
        d8i.Companion.getClass();
        this.a = ((jbh) rqoVar).c(d8i.f);
    }

    @Override // defpackage.qqo
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.qqo
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final d8i b() {
        return (d8i) this.a.b();
    }

    public final kzo e(String str) {
        Object obj;
        if (b().b) {
            Iterator it = b().d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((d8i.d) obj).a, str)) {
                    break;
                }
            }
            d8i.d dVar = (d8i.d) obj;
            if (dVar != null) {
                d8i.b bVar = dVar.e;
                d8i.a aVar = dVar.f;
                String Y = d6z.Y(b(), dVar.b);
                d6z.Y(b(), dVar.c);
                String Y2 = d6z.Y(b(), dVar.d);
                String Y3 = d6z.Y(b(), bVar.a);
                String Y4 = d6z.Y(b(), bVar.b);
                String Y5 = d6z.Y(b(), bVar.c);
                String Y6 = d6z.Y(b(), bVar.d);
                String Y7 = d6z.Y(b(), bVar.e);
                Integer num = bVar.f;
                int i = bVar.g.a;
                boj0 boj0Var = new boj0(Y3, Y4, Y5, Y6, Y7, num, new m501(19));
                d6z.Y(b(), aVar.a);
                d6z.Y(b(), aVar.b);
                d6z.Y(b(), aVar.c);
                d6z.Y(b(), aVar.d);
                d6z.Y(b(), aVar.e);
                d6z.Y(b(), aVar.f);
                d6z.Y(b(), aVar.g);
                return new kzo(Y, Y2, boj0Var, dVar.g, 3);
            }
        }
        return null;
    }
}
