package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class jjj implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ dsy c;

    public /* synthetic */ jjj(dsy dsyVar, int i) {
        this.b = i;
        this.c = dsyVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                List<xqy> f = this.c.i().f();
                ArrayList arrayList = new ArrayList(c5g.u(f, 10));
                Iterator<T> it = f.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((xqy) it.next()).getIndex()));
                }
                return arrayList;
            default:
                return Boolean.valueOf(this.c.g() == 0);
        }
    }
}
