package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class gkm implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ ekm b;

    public /* synthetic */ gkm(ekm ekmVar, int i) {
        this.a = i;
        this.b = ekmVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ekm ekmVar = this.b;
        switch (i) {
            case 0:
                ekmVar.render((hmm) obj);
                break;
            case 1:
                ekmVar.render((hmm) obj);
                break;
            case 2:
                ekmVar.render((hmm) obj);
                break;
            case 3:
                ekmVar.render((hmm) obj);
                break;
            case 4:
                ekmVar.render((hmm) obj);
                break;
            case 5:
                ekmVar.render((hmm) obj);
                break;
            default:
                ekmVar.render((hmm) obj);
                break;
        }
        return zy11Var;
    }
}
