package xsna;

import com.vk.design.demo.presentation.nav.ScreenKey;
import xsna.h3m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class n3m implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ n3m(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new h3m.b((ScreenKey) obj));
                break;
            default:
                tho0 tho0Var = (tho0) obj;
                this.c.invoke(tho0.a(tho0Var, brm0.y(tho0Var.a.c, "\n", " ")));
                break;
        }
        return s3q0.a;
    }
}
