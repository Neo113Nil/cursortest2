package defpackage;

import androidx.compose.foundation.gestures.z;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.circle_input.a;

/* loaded from: classes5.dex */
public final class lvb implements PointerInputEventHandler {
    public final /* synthetic */ double a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ w6u c;
    public final /* synthetic */ tls d;
    public final /* synthetic */ oz40 e;
    public final /* synthetic */ px40 f;
    public final /* synthetic */ px40 g;

    public lvb(double d, tls tlsVar, w6u w6uVar, tls tlsVar2, oz40 oz40Var, px40 px40Var, px40 px40Var2) {
        this.a = d;
        this.b = tlsVar;
        this.c = w6uVar;
        this.d = tlsVar2;
        this.e = oz40Var;
        this.f = px40Var;
        this.g = px40Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        final double d = this.a;
        final tls tlsVar = this.b;
        final w6u w6uVar = this.c;
        final tls tlsVar2 = this.d;
        final oz40 oz40Var = this.e;
        final px40 px40Var = this.f;
        final px40 px40Var2 = this.g;
        Object f = z.f(hwd0Var, null, null, new tls() { // from class: kvb
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                double d2 = a.d(((wu60) oz40Var.getValue()).a, ((wu60) obj).a);
                px40 px40Var3 = px40Var;
                px40Var3.setDoubleValue(d2);
                double doubleValue = px40Var3.getDoubleValue();
                double d3 = d;
                if (doubleValue < d3) {
                    px40Var3.setDoubleValue(d3);
                }
                double doubleValue2 = px40Var3.getDoubleValue() / 360.0d;
                tlsVar.invoke(Double.valueOf(doubleValue2));
                ((lvc0) w6uVar).a(9);
                px40Var2.setDoubleValue(px40Var3.getDoubleValue());
                tlsVar2.invoke(Double.valueOf(doubleValue2));
                return zy11.a;
            }
        }, continuation, 7);
        return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : zy11.a;
    }
}
