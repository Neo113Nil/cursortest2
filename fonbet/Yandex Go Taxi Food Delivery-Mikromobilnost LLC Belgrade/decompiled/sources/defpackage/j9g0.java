package defpackage;

import com.ybsdk.feature.qr.payments.internal.screens.presentation.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final /* synthetic */ class j9g0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ j9g0(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        r0 r0Var;
        Object value;
        g9g0 g9g0Var;
        r0 r0Var2;
        Object value2;
        g9g0 g9g0Var2;
        r0 r0Var3;
        Object value3;
        g9g0 g9g0Var3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                d9g0 b = qca1.b((h9g0) bVar.X());
                if (b != null) {
                    pz40 Y = bVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                        s7g0 s7g0Var = new s7g0(b, 3);
                        g9g0Var = ((h9g0) value).a;
                        if (g9g0Var instanceof f9g0) {
                            g9g0Var = (g9g0) s7g0Var.invoke(g9g0Var);
                        }
                    } while (!r0Var.k(value, new h9g0(g9g0Var)));
                }
                break;
            case 1:
                d9g0 b2 = qca1.b((h9g0) bVar.X());
                if (b2 != null) {
                    pz40 Y2 = bVar.Y();
                    do {
                        r0Var2 = (r0) Y2;
                        value2 = r0Var2.getValue();
                        g9g0Var2 = ((h9g0) value2).a;
                        if (g9g0Var2 instanceof f9g0) {
                            g9g0Var2 = d9g0.c(b2, null, null, null, null, null, null, null, true, null, 49151);
                        }
                    } while (!r0Var2.k(value2, new h9g0(g9g0Var2)));
                }
                break;
            default:
                d9g0 b3 = qca1.b((h9g0) bVar.X());
                if (b3 != null) {
                    pz40 Y3 = bVar.Y();
                    do {
                        r0Var3 = (r0) Y3;
                        value3 = r0Var3.getValue();
                        g9g0Var3 = ((h9g0) value3).a;
                        if (g9g0Var3 instanceof f9g0) {
                            g9g0Var3 = d9g0.c(b3, null, null, null, null, null, null, null, false, null, 49151);
                        }
                    } while (!r0Var3.k(value3, new h9g0(g9g0Var3)));
                }
                break;
        }
        return zy11Var;
    }
}
