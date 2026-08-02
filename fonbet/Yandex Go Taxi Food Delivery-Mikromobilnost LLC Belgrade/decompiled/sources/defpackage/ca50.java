package defpackage;

import com.yandex.mapkit.styling.automotivenavigation.AutomotiveNavigationStyleProvider;

/* loaded from: classes12.dex */
public final /* synthetic */ class ca50 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ga50 b;

    public /* synthetic */ ca50(ga50 ga50Var, int i) {
        this.a = i;
        this.b = ga50Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        ga50 ga50Var = this.b;
        switch (i) {
            case 0:
                return new AutomotiveNavigationStyleProvider(ga50Var.a);
            case 1:
                return new fa50(ga50Var);
            case 2:
                return new ea50(ga50Var);
            case 3:
                return new da50(ga50Var);
            default:
                return ga50Var.a().balloonImageProvider();
        }
    }
}
