package xsna;

import com.vk.dto.photo.PhotoAlbum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class bm1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ bm1(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        vjm vjmVar;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((PhotoAlbum) obj).b == this.c);
            case 1:
                xgl0 xgl0Var = (xgl0) obj;
                ArrayList g = zik0.g(xgl0Var.a().y());
                ArrayList arrayList = new ArrayList();
                Iterator it = g.iterator();
                while (it.hasNext()) {
                    bdb bdbVar = (bdb) it.next();
                    int h = pli.k(bdbVar.k).b.h();
                    long j = bdbVar.b;
                    if (h >= this.c) {
                        xgl0Var.a().f(h - 1, j);
                        arrayList.add(Long.valueOf(j));
                    }
                }
                return arrayList.isEmpty() ? jgp.b : (Map) xgl0Var.u(new beb((Collection) arrayList, false, xgl0Var));
            default:
                bdb bdbVar2 = (bdb) obj;
                vcb vcbVar = bdbVar2.j;
                vjm e = (vcbVar == null || (vjmVar = vcbVar.b) == null) ? null : vjm.e(vjmVar, 0, this.c, 1);
                return bdb.a(bdbVar2, 0, 0, 0, 0, 0, 0, null, e != null ? vcb.b(bdbVar2.j, e, 0L, 2) : null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, -257, 7);
        }
    }
}
