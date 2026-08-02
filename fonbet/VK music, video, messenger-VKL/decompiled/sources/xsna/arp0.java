package xsna;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
import xsna.tf6;

/* compiled from: TrimPathContent.java */
/* loaded from: classes12.dex */
public final class arp0 implements gfj, tf6.a {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final ShapeTrimPath.Type c;
    public final hqr d;
    public final hqr e;
    public final hqr f;

    public arp0(com.airbnb.lottie.model.layer.a aVar, ShapeTrimPath shapeTrimPath) {
        this.a = shapeTrimPath.e;
        this.c = shapeTrimPath.a;
        hqr j = shapeTrimPath.b.j();
        this.d = j;
        hqr j2 = shapeTrimPath.c.j();
        this.e = j2;
        hqr j3 = shapeTrimPath.d.j();
        this.f = j3;
        aVar.h(j);
        aVar.h(j2);
        aVar.h(j3);
        j.a(this);
        j2.a(this);
        j3.a(this);
    }

    public final void d(tf6.a aVar) {
        this.b.add(aVar);
    }

    @Override // xsna.tf6.a
    public final void i() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((tf6.a) arrayList.get(i)).i();
            i++;
        }
    }

    @Override // xsna.gfj
    public final void b(List<gfj> list, List<gfj> list2) {
    }
}
