package xsna;

import xsna.a2x0;
import xsna.e6w0;
import xsna.gm50;
import xsna.l1x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class k1x0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k1x0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                l1x0.b bVar = (l1x0.b) obj3;
                l1x0 l1x0Var = (l1x0) obj2;
                a2x0.a aVar = (a2x0.a) obj;
                int i2 = l1x0.k1;
                bVar.c.setVisibility(8);
                gm50.a.a(l1x0Var, aVar.a, new cpo0(7, bVar, l1x0Var));
                gm50.a.a(l1x0Var, aVar.b, new vyq0(bVar, 17));
                gm50.a.a(l1x0Var, aVar.c, new cis0(5, l1x0Var, bVar));
                gm50.a.a(l1x0Var, aVar.d, new f1p0(6, l1x0Var, bVar));
                break;
            default:
                ((oaw0) obj3).l.a.invoke(new e6w0.q(((dbf0) obj2).b));
                break;
        }
        return s3q0.a;
    }
}
