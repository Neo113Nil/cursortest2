package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class a180 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ u080 b;

    public /* synthetic */ a180(u080 u080Var, int i) {
        this.a = i;
        this.b = u080Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        u080 u080Var = this.b;
        switch (i) {
            case 0:
                u080Var.s8(((Number) obj).floatValue());
                break;
            default:
                u080Var.A3((ry1) obj);
                break;
        }
        return zy11Var;
    }
}
