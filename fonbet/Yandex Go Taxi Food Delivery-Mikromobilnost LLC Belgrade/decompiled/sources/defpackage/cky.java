package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class cky implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ dky b;

    public /* synthetic */ cky(dky dkyVar, int i) {
        this.a = i;
        this.b = dkyVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        dky dkyVar = this.b;
        switch (i) {
            case 0:
                dky.Kg(dkyVar, (kj) obj);
                break;
            default:
                dky.Kg(dkyVar, (kj) obj);
                break;
        }
        return zy11Var;
    }
}
