package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.map_object.x;
import ru.yandex.taxi.common_models.net.map_object.y;

/* loaded from: classes8.dex */
public final class jpm0 implements xsd0 {
    public final /* synthetic */ int a;
    public final rxn0 b;

    public /* synthetic */ jpm0(rxn0 rxn0Var, int i) {
        this.a = i;
        this.b = rxn0Var;
    }

    @Override // defpackage.xsd0
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        rxn0 rxn0Var = this.b;
        switch (i) {
            case 0:
                qxn0 a = rxn0Var.a();
                if (a == null) {
                    return zy11Var;
                }
                pm00 pm00Var = (pm00) wsd0Var;
                return a.a(new wxn0(pm00Var.a(), pm00Var.getPosition(), ((y) pm00Var.getAction()).a, ((y) pm00Var.getAction()).c), (ContinuationImpl) continuation);
            default:
                x xVar = (x) wsd0Var.getAction();
                qxn0 a2 = rxn0Var.a();
                if (a2 == null) {
                    return zy11Var;
                }
                pm00 pm00Var2 = (pm00) wsd0Var;
                return a2.a(new xxn0(pm00Var2.a(), pm00Var2.getPosition(), new r7p0(xVar.a, xVar.b)), (ContinuationImpl) continuation);
        }
    }
}
