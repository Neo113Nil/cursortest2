package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class mqz implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mqz(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String str = (String) this.d;
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 3);
                qgi0.q(tgi0Var, str);
                t4g t4gVar = new t4g(this.c);
                sgi0<t4g> sgi0Var = ngi0.g;
                qcy<Object> qcyVar = qgi0.a[25];
                tgi0Var.a(sgi0Var, t4gVar);
                return s3q0.a;
            case 1:
                ((n9e) this.d).invoke(new rbt0(this.c, 50, 0, 16, EmptyList.b));
                return s3q0.a;
            default:
                return ((LayoutInflater) this.d).inflate(this.c, (ViewGroup) obj, false);
        }
    }
}
