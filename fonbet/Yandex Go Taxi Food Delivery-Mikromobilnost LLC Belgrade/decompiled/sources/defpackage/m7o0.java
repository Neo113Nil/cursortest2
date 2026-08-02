package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class m7o0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7o0 b;

    public /* synthetic */ m7o0(k7o0 k7o0Var, int i) {
        this.a = i;
        this.b = k7o0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        k7o0 k7o0Var = this.b;
        switch (i) {
            case 0:
                k7o0Var.g6((hfa0) obj);
                break;
            default:
                k7o0Var.render((mgo0) obj);
                break;
        }
        return zy11Var;
    }
}
