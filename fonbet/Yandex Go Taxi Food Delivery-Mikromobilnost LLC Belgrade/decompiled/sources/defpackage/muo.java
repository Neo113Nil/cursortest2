package defpackage;

import com.yandex.go.explorer.impl.ui.map.l;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class muo implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ muo(l lVar, int i) {
        this.a = i;
        this.b = lVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        l lVar = this.b;
        switch (i) {
            case 0:
                lVar.B = cvo.a(lVar.B, false, null, (Set) obj, 0, 11);
                lVar.Kg();
                break;
            default:
                lVar.B = cvo.a(lVar.B, false, null, null, ((Number) obj).intValue(), 7);
                lVar.Kg();
                break;
        }
        return zy11Var;
    }
}
