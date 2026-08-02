package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.ecomm.orders.impl.order.domain.OrderIsEmptyException;
import com.vk.ecomm.orders.impl.order.presentation.mvi.d;
import com.vk.ecomm.orders.impl.order.presentation.mvi.state.OrderError;
import com.vk.log.L;
import org.json.JSONException;
import xsna.c5e0;
import xsna.ube0;
import xsna.x660;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class c2y implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c2y(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                ((ayo) this.c).invoke(obj);
                break;
            case 1:
                ((defpackage.y) this.c).invoke(obj);
                break;
            case 2:
                ((rlh) this.c).invoke(obj);
                break;
            case 3:
                ((rlh) this.c).invoke(obj);
                break;
            case 4:
                ((pps) this.c).invoke(obj);
                break;
            case 5:
                ((rlh) this.c).invoke(obj);
                break;
            case 6:
                ((dam) this.c).invoke(obj);
                break;
            case 7:
                ((rlh) this.c).invoke(obj);
                break;
            case 8:
                ((rlh) this.c).invoke(obj);
                break;
            case 9:
                ((t7f) this.c).invoke(obj);
                break;
            case 10:
                ((dam) this.c).invoke(obj);
                break;
            case 11:
                ((w910) this.c).invoke(obj);
                break;
            case 12:
                ((x660.a) this.c).invoke(obj);
                break;
            case 13:
                ((rlh) this.c).invoke(obj);
                break;
            case 14:
                kr60 kr60Var = (kr60) this.c;
                Throwable th = (Throwable) obj;
                L.i(th);
                kr60Var.c(new yo60.g.a(th));
                break;
            case 15:
                ((rj60) this.c).invoke(obj);
                break;
            case 16:
                ((gf2) this.c).invoke(obj);
                break;
            case 17:
                com.vk.ecomm.orders.impl.order.presentation.mvi.g gVar = (com.vk.ecomm.orders.impl.order.presentation.mvi.g) this.c;
                Throwable th2 = (Throwable) obj;
                ((qu80) gVar.h.getValue()).getClass();
                gVar.e(new d.a.C0992a((((th2 instanceof VKApiException) && (th2.getCause() instanceof JSONException)) || (((z = th2 instanceof VKApiExecutionException)) && ((VKApiExecutionException) th2).s() == 7) || (th2 instanceof OrderIsEmptyException)) ? OrderError.AccessDenied : (z && h03.a(th2)) ? OrderError.Internet : OrderError.Unknown));
                break;
            case 18:
                ((rj60) this.c).invoke(obj);
                break;
            case 19:
                l6c0 l6c0Var = (l6c0) this.c;
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                l6c0Var.c(x4c0.a);
                break;
            case 20:
                ((pps) this.c).invoke(obj);
                break;
            case 21:
                ((rj60) this.c).invoke(obj);
                break;
            case 22:
                ((c5e0.b) this.c).invoke(obj);
                break;
            case 23:
                ((ube0.a) this.c).invoke(obj);
                break;
            case 24:
                ((defpackage.y) this.c).invoke(obj);
                break;
            case 25:
                ((eoh) this.c).invoke(obj);
                break;
            case 26:
                ((t3b) this.c).invoke(obj);
                break;
            case 27:
                ((ymi0) this.c).invoke(obj);
                break;
            case 28:
                ((fyi0) this.c).invoke(obj);
                break;
            default:
                ((rj60) this.c).invoke(obj);
                break;
        }
    }
}
