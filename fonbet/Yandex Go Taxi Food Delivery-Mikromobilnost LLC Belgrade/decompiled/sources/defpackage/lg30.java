package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.masstransit.ui.routeinfo.MtFloatingButtonState;

/* loaded from: classes6.dex */
public final class lg30 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf30 b;

    public /* synthetic */ lg30(zf30 zf30Var, int i) {
        this.a = i;
        this.b = zf30Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        zf30 zf30Var = this.b;
        switch (i) {
            case 0:
                zf30Var.Y4((MtFloatingButtonState) obj);
                break;
            default:
                zf30Var.render((yh30) obj);
                break;
        }
        return zy11Var;
    }
}
