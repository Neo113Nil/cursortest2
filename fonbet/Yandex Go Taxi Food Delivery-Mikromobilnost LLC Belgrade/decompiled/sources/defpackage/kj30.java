package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class kj30 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ ij30 b;

    public /* synthetic */ kj30(ij30 ij30Var, int i) {
        this.a = i;
        this.b = ij30Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ij30 ij30Var = this.b;
        switch (i) {
            case 0:
                ij30Var.render((df30) obj);
                break;
            default:
                ij30Var.Cd((h111) obj);
                break;
        }
        return zy11Var;
    }
}
