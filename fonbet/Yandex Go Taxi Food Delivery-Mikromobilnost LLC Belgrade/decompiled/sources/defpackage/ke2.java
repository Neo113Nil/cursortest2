package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.a;
import ru.yandex.taxi.masstransit.stoproute.router.ComposableSingletons$MtStopRouteRouterKt;

/* loaded from: classes14.dex */
public final class ke2 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ oz40 c;

    public /* synthetic */ ke2(int i, oz40 oz40Var, int i2) {
        this.a = i2;
        this.b = i;
        this.c = oz40Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.b;
        oz40 oz40Var = this.c;
        switch (i) {
            case 0:
                g8w g8wVar = (g8w) obj;
                if (!(g8wVar instanceof jxe0)) {
                    if ((g8wVar instanceof kxe0) || (g8wVar instanceof ixe0)) {
                        oz40Var.setValue(Boolean.FALSE);
                        break;
                    }
                } else {
                    oz40Var.setValue(Boolean.TRUE);
                    Object i3 = a.i(i2, continuation);
                    if (i3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                }
                break;
            default:
                int i4 = ((dtr0) obj).a;
                if (i4 != -2) {
                    if (i4 == i2) {
                        ComposableSingletons$MtStopRouteRouterKt composableSingletons$MtStopRouteRouterKt = ComposableSingletons$MtStopRouteRouterKt.a;
                        oz40Var.setValue(Boolean.TRUE);
                        break;
                    }
                } else {
                    ComposableSingletons$MtStopRouteRouterKt composableSingletons$MtStopRouteRouterKt2 = ComposableSingletons$MtStopRouteRouterKt.a;
                    oz40Var.setValue(Boolean.FALSE);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
