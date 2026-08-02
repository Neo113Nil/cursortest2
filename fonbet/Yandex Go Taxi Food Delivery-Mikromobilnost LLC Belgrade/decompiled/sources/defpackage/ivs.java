package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class ivs implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ fvs b;

    public /* synthetic */ ivs(fvs fvsVar, int i) {
        this.a = i;
        this.b = fvsVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        fvs fvsVar = this.b;
        switch (i) {
            case 0:
                fvsVar.render((svs) obj);
                break;
            default:
                fvsVar.render((svs) obj);
                break;
        }
        return zy11Var;
    }
}
