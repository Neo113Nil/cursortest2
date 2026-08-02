package defpackage;

import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class ne30 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ me30 b;

    public /* synthetic */ ne30(me30 me30Var, int i) {
        this.a = i;
        this.b = me30Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        me30 me30Var = this.b;
        switch (i) {
            case 0:
                me30Var.za((y91) obj);
                break;
            case 1:
                me30Var.d1((e040) obj);
                break;
            default:
                Pair pair = (Pair) obj;
                me30Var.r1((h111) pair.c(), (e040) pair.f());
                break;
        }
        return zy11Var;
    }
}
