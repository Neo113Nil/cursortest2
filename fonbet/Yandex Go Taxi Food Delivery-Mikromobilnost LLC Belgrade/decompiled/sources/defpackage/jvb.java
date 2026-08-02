package defpackage;

import androidx.compose.foundation.gestures.i;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.circle_input.a;

/* loaded from: classes5.dex */
public final class jvb implements PointerInputEventHandler {
    public final /* synthetic */ sls a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ px40 c;
    public final /* synthetic */ double d;
    public final /* synthetic */ tls e;
    public final /* synthetic */ w6u f;
    public final /* synthetic */ oz40 g;
    public final /* synthetic */ px40 h;

    public jvb(sls slsVar, tls tlsVar, px40 px40Var, double d, tls tlsVar2, w6u w6uVar, oz40 oz40Var, px40 px40Var2) {
        this.a = slsVar;
        this.b = tlsVar;
        this.c = px40Var;
        this.d = d;
        this.e = tlsVar2;
        this.f = w6uVar;
        this.g = oz40Var;
        this.h = px40Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        ic0 ic0Var = new ic0(13, this.a);
        tls tlsVar = this.b;
        final px40 px40Var = this.c;
        n8a n8aVar = new n8a(20, tlsVar, px40Var);
        bgc bgcVar = new bgc(12);
        final double d = this.d;
        final tls tlsVar2 = this.e;
        final w6u w6uVar = this.f;
        final oz40 oz40Var = this.g;
        final px40 px40Var2 = this.h;
        Object g = i.g(hwd0Var, ic0Var, n8aVar, bgcVar, new wls() { // from class: ivb
            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                double d2 = a.d(((wu60) oz40Var.getValue()).a, ((zvd0) obj).c);
                px40 px40Var3 = px40Var;
                px40Var3.setDoubleValue(d2);
                px40 px40Var4 = px40Var2;
                double abs = Math.abs(px40Var4.getDoubleValue() - px40Var3.getDoubleValue());
                double doubleValue = px40Var3.getDoubleValue();
                double d3 = d;
                if (doubleValue < d3) {
                    px40Var3.setDoubleValue(d3);
                }
                if (abs > 180.0d) {
                    if (px40Var3.getDoubleValue() < 180.0d || d3 >= 180.0d) {
                        d3 = 360.0d;
                    }
                    px40Var3.setDoubleValue(d3);
                }
                tlsVar2.invoke(Double.valueOf(px40Var3.getDoubleValue() / 360.0d));
                if (m810.a(px40Var3.getDoubleValue()) % 12 == 0) {
                    double doubleValue2 = px40Var3.getDoubleValue();
                    if (0.1d <= doubleValue2 && doubleValue2 <= 359.9d) {
                        ((lvc0) w6uVar).a(9);
                    }
                }
                px40Var4.setDoubleValue(px40Var3.getDoubleValue());
                return zy11.a;
            }
        }, continuation);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : zy11.a;
    }
}
