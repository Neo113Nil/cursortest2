package defpackage;

import com.yandex.go.taxi.order.overlay.g;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class mi70 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ mi70(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        g gVar = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((ii70) gVar.Dg()).updateBubbles((List) obj);
                break;
            case 1:
                ((ii70) gVar.Dg()).updateBubbles((List) obj);
                break;
            default:
                hxx0 hxx0Var = (hxx0) obj;
                gVar.getClass();
                List list = hxx0Var.b;
                List list2 = hxx0Var.c;
                if (!jl40.l(gVar.O, list)) {
                    gVar.O = hxx0Var.b;
                    gVar.Ng();
                }
                if (!jl40.l(gVar.P, list2)) {
                    gVar.P = list2;
                    gVar.J.g(zy11Var);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
