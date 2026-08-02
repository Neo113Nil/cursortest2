package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class fg30 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg30 b;

    public /* synthetic */ fg30(dg30 dg30Var, int i) {
        this.a = i;
        this.b = dg30Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        dg30 dg30Var = this.b;
        switch (i) {
            case 0:
                dg30Var.w0(((Boolean) obj).booleanValue());
                break;
            default:
                dg30Var.Z0(((zs7) obj).a.getZoom());
                break;
        }
        return zy11Var;
    }
}
