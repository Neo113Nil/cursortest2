package defpackage;

import com.yandex.go.settings.hidephoneinfo.experiments.InAppOnlySettingsToggleExperiment;

/* loaded from: classes13.dex */
public final /* synthetic */ class giu implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ iiu b;

    public /* synthetic */ giu(iiu iiuVar, int i) {
        this.a = i;
        this.b = iiuVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        iiu iiuVar = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                InAppOnlySettingsToggleExperiment inAppOnlySettingsToggleExperiment = ((hiu) ((agd) yfdVar).a).a;
                String Y = d6z.Y(inAppOnlySettingsToggleExperiment, inAppOnlySettingsToggleExperiment.d.b);
                agd agdVar = (agd) yfdVar;
                hiu hiuVar = (hiu) agdVar.a;
                InAppOnlySettingsToggleExperiment inAppOnlySettingsToggleExperiment2 = hiuVar.a;
                String Y2 = d6z.Y(inAppOnlySettingsToggleExperiment2, inAppOnlySettingsToggleExperiment2.d.c);
                InAppOnlySettingsToggleExperiment inAppOnlySettingsToggleExperiment3 = hiuVar.a;
                agdVar.c = new g92(2, new piu(Y, Y2, d6z.Y(inAppOnlySettingsToggleExperiment3, inAppOnlySettingsToggleExperiment3.d.d), inAppOnlySettingsToggleExperiment3.d.a));
                agdVar.e = new giu(iiuVar, 1);
                r7d.a.getClass();
                agdVar.g = r7d.b;
                return zy11Var;
            default:
                oiu oiuVar = (oiu) obj;
                if (jl40.l(oiuVar, niu.a)) {
                    iiuVar.r(new iws(29));
                    return zy11Var;
                }
                if (jl40.l(oiuVar, miu.a)) {
                    iiuVar.r(new qu(9));
                    return zy11Var;
                }
                w511.b();
                return null;
        }
    }
}
