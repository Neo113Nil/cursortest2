package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class pwe implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ qwe b;

    public /* synthetic */ pwe(qwe qweVar, int i) {
        this.a = i;
        this.b = qweVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        qwe qweVar = this.b;
        switch (i) {
            case 0:
                qwe.Kg(qweVar, (List) obj);
                break;
            default:
                qwe.Kg(qweVar, (List) obj);
                break;
        }
        return zy11Var;
    }
}
