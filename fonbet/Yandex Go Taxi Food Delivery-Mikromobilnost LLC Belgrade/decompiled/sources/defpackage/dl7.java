package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes10.dex */
public final class dl7 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9e b;

    public /* synthetic */ dl7(e9e e9eVar, int i) {
        this.a = i;
        this.b = e9eVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        e9e e9eVar = this.b;
        switch (i) {
            case 0:
                e9eVar.accept(obj);
                break;
            default:
                e9eVar.accept(obj);
                break;
        }
        return zy11Var;
    }
}
