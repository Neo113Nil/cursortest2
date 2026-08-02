package xsna;

import com.vk.design.demo.presentation.components.ThemeType;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class z1m implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ wh50 d;

    public /* synthetic */ z1m(izs izsVar, wh50 wh50Var, int i) {
        this.b = i;
        this.c = izsVar;
        this.d = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tho0 tho0Var = (tho0) obj;
                String g = xqm0.g(tho0Var.a.c);
                if (g.length() <= 140) {
                    tho0 a = tho0.a(tho0Var, g);
                    wh50 wh50Var = this.d;
                    wh50Var.setValue(a);
                    this.c.invoke(((tho0) wh50Var.getValue()).a.c);
                }
                break;
            default:
                this.d.setValue(Boolean.FALSE);
                this.c.invoke((ThemeType) obj);
                break;
        }
        return s3q0.a;
    }
}
