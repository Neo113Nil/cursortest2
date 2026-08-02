package defpackage;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;
import java.util.function.Consumer;
import ru.yandex.taxi.order.OrderFragment;

/* loaded from: classes15.dex */
public final /* synthetic */ class gw70 implements aa3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ gw70(enw0 enw0Var, dnw0 dnw0Var, int i, s84 s84Var, onw0 onw0Var) {
        this.b = enw0Var;
        this.c = dnw0Var;
        this.a = i;
        this.w = s84Var;
        this.x = onw0Var;
    }

    @Override // defpackage.aa3
    public euy apply(Object obj) {
        enw0 enw0Var = (enw0) this.b;
        dnw0 dnw0Var = (dnw0) this.c;
        s84 s84Var = (s84) this.w;
        onw0 onw0Var = (onw0) this.x;
        Surface surface = (Surface) obj;
        enw0Var.getClass();
        surface.getClass();
        try {
            dnw0Var.d();
            snw0 snw0Var = new snw0(surface, this.a, enw0Var.g.f(), s84Var, onw0Var);
            snw0Var.D.b.c(new cnw0(dnw0Var, 1), geb1.b());
            d6z.y("Consumer can only be linked once.", dnw0Var.r == null);
            dnw0Var.r = snw0Var;
            return ni91.f(snw0Var);
        } catch (DeferrableSurface.SurfaceClosedException e) {
            return new hiv(1, e);
        }
    }

    public /* synthetic */ gw70(OrderFragment orderFragment, o2y0 o2y0Var, RouteChangeType routeChangeType, int i, Consumer consumer) {
        this.b = orderFragment;
        this.c = o2y0Var;
        this.w = routeChangeType;
        this.a = i;
        this.x = consumer;
    }
}
