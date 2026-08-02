package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class iv1 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ hv1 b;

    public /* synthetic */ iv1(hv1 hv1Var, int i) {
        this.a = i;
        this.b = hv1Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        hv1 hv1Var = this.b;
        switch (i) {
            case 0:
                hv1Var.render((wv1) obj);
                break;
            case 1:
                hv1Var.render((wv1) obj);
                break;
            default:
                hv1Var.render((wv1) obj);
                break;
        }
        return zy11Var;
    }
}
