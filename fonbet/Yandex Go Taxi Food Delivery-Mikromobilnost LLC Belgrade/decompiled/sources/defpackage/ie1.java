package defpackage;

import com.yandex.urbanads.internal.network.a;

/* loaded from: classes2.dex */
public final class ie1 implements dw {
    public final /* synthetic */ int a;
    public final a b;

    public /* synthetic */ ie1(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                ge1 ge1Var = (ge1) krVar;
                if (!evu0.J(ge1Var.a)) {
                    aVar.d(ge1Var.a);
                    break;
                }
                break;
            default:
                te1 te1Var = (te1) krVar;
                if (!evu0.J(te1Var.a)) {
                    String str = te1Var.a;
                    Boolean bool = te1Var.b;
                    aVar.e(str, te1Var.c, bool != null ? bool.booleanValue() : true);
                    break;
                }
                break;
        }
    }
}
