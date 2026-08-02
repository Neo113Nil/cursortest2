package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class aws implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ xvs b;

    public /* synthetic */ aws(xvs xvsVar, int i) {
        this.a = i;
        this.b = xvsVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        xvs xvsVar = this.b;
        switch (i) {
            case 0:
                xvsVar.render((fws) obj);
                break;
            case 1:
                xvsVar.render((fws) obj);
                break;
            default:
                xvsVar.render((fws) obj);
                break;
        }
        return zy11Var;
    }
}
