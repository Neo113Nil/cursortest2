package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class he4 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ de4 b;

    public /* synthetic */ he4(de4 de4Var, int i) {
        this.a = i;
        this.b = de4Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        de4 de4Var = this.b;
        switch (i) {
            case 0:
                de4Var.setVisible(((Boolean) obj).booleanValue());
                break;
            default:
                de4Var.updateBadgeText((String) obj);
                break;
        }
        return zy11Var;
    }
}
