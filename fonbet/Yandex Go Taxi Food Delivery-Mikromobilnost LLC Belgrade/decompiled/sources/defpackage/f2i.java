package defpackage;

import com.yandex.go.eboks.objects.experiments.EboksObjectsParamsExperiment;

/* loaded from: classes5.dex */
public final class f2i implements v7p {
    public final /* synthetic */ int a;
    public final n3w b;
    public final n3w c;

    public /* synthetic */ f2i(n3w n3wVar, n3w n3wVar2, int i) {
        this.a = i;
        this.b = n3wVar;
        this.c = n3wVar2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        n3w n3wVar = this.c;
        n3w n3wVar2 = this.b;
        switch (i) {
            case 0:
                return new e2i((l2i) n3wVar2.a, (i2i) n3wVar.a);
            case 1:
                return new bin((dhn) n3wVar2.a, (EboksObjectsParamsExperiment) n3wVar.a);
            case 2:
                return new pfe0((ofe0) n3wVar2.a, (qfe0) n3wVar.a);
            case 3:
                return new jzz();
            case 4:
                return new a201(5, (an01) n3wVar2.a, (th01) n3wVar.a);
            default:
                w030 w030Var = (w030) n3wVar2.a;
                rg11 rg11Var = (rg11) n3wVar.a;
                if (w030Var == null) {
                    w030Var = rg11Var.b;
                }
                q5z.i(w030Var);
                return w030Var;
        }
    }
}
