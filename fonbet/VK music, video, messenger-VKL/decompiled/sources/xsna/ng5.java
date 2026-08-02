package xsna;

import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ng5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ izs d;

    public /* synthetic */ ng5(int i, List list, izs izsVar) {
        this.b = i;
        this.c = list;
        this.d = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        nvy nvyVar = (nvy) obj;
        switch (this.b) {
            case 0:
                List list = this.c;
                nvyVar.e(list.size(), null, new rg5(list, 0), new jai(2039820996, new sg5(list, this.d), true));
                break;
            default:
                List list2 = this.c;
                nvy.c(nvyVar, list2.size(), null, new jai(645305279, new a6v(1, list2, this.d), true), 6);
                break;
        }
        return s3q0.a;
    }
}
