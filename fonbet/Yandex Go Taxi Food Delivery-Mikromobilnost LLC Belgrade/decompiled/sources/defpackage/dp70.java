package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.multimodal_route.api.MultimodalRouteType;
import com.yandex.go.taxi.order.change.common.notification.ChangeOrderItemNotification;
import com.yandex.go.taxi.order.delegates.a;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.AltpinCardInfo;
import com.yandex.go.taxi.order.models.api.objects.MapObject;
import com.yandex.go.taxi.order.models.api.objects.MapObjectAction$OpenPointAAlternative;
import com.yandex.go.taxi.order.models.api.objects.b0;
import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;
import com.yandex.go.yb.b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.altpins.AltpinSourceModalViewEntryPoint;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.f;

/* loaded from: classes14.dex */
public final class dp70 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ dp70(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        MapObject mapObject;
        switch (this.a) {
            case 0:
                fq70 fq70Var = (fq70) obj;
                f fVar = this.b;
                fVar.getClass();
                c21 c21Var = sy60.Q2;
                if (fq70Var instanceof dq70) {
                    o2y0 o2y0Var = ((dq70) fq70Var).a;
                    if (o2y0Var.b().V().R) {
                        fVar.x0(o2y0Var);
                        OrderFragment orderFragment = fVar.p1;
                        if (orderFragment != null) {
                            orderFragment.showChat(o2y0Var, false);
                        }
                    }
                } else {
                    b02 b02Var = null;
                    if (fq70Var instanceof aq70) {
                        aq70 aq70Var = (aq70) fq70Var;
                        fVar.Y(aq70Var.a, aq70Var.b, null);
                    } else if (fq70Var instanceof zp70) {
                        TaxiOrder b = ((zp70) fq70Var).a.b();
                        AltpinSourceModalViewEntryPoint altpinSourceModalViewEntryPoint = AltpinSourceModalViewEntryPoint.PUSH;
                        b3t b3tVar = (b3t) fVar.n0.get();
                        b3tVar.getClass();
                        List list = b.V().s;
                        Set set = b.l.b0;
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                mapObject = (MapObject) it.next();
                                if (!set.contains(mapObject.a) && (mapObject.f instanceof MapObjectAction$OpenPointAAlternative)) {
                                }
                            } else {
                                mapObject = null;
                            }
                        }
                        if (mapObject != null) {
                            b0 b0Var = mapObject.f;
                            MapObjectAction$OpenPointAAlternative mapObjectAction$OpenPointAAlternative = b0Var instanceof MapObjectAction$OpenPointAAlternative ? (MapObjectAction$OpenPointAAlternative) b0Var : null;
                            if (mapObjectAction$OpenPointAAlternative != null) {
                                wy1 wy1Var = b3tVar.a;
                                AltpinCardInfo altpinCardInfo = mapObjectAction$OpenPointAAlternative.a;
                                wy1Var.getClass();
                                lz1 a = wy1.a(altpinCardInfo);
                                if (a != null) {
                                    String str = b.a;
                                    b3tVar.b.getClass();
                                    b02Var = new b02(str, vo00.a(mapObject), a, altpinSourceModalViewEntryPoint);
                                }
                            }
                        }
                        if (b02Var != null) {
                            fVar.E((m950) fVar.x1.getValue(), b02Var, c21Var, hxx.a);
                        } else {
                            xz1 xz1Var = (xz1) fVar.o0.get();
                            xz1Var.getClass();
                            Context context = xz1Var.a;
                            ChangeOrderItemNotification changeOrderItemNotification = new ChangeOrderItemNotification(context, "AltpinSourceErrorNotification", context.getString(kyh0.altpin_a_driving_notification_fail_primary), xz1Var.a.getString(kyh0.altpin_a_driving_notification_fail_secondary), new nb9(f1h0.ic_failed_change), ChangeOrderNotificationActionResponse.NONE);
                            xz1Var.b.e(changeOrderItemNotification);
                            changeOrderItemNotification.setExpiresListener(new wz1(0, xz1Var));
                            changeOrderItemNotification.startExpiresTimer(5000L);
                        }
                    } else if (fq70Var instanceof eq70) {
                        o2y0 o2y0Var2 = ((eq70) fq70Var).a;
                        if (o2y0Var2.b().V().R && ((Boolean) ((s350) fVar.x0.get()).a.c()).booleanValue()) {
                            OrderFragment orderFragment2 = fVar.p1;
                            if (orderFragment2 != null && fVar.getLifecycle().w.a(Lifecycle.State.STARTED)) {
                                orderFragment2.showChat(o2y0Var2, true);
                            }
                        } else {
                            ((a) fVar.U).c(o2y0Var2.b(), null);
                        }
                    } else if (fq70Var instanceof yp70) {
                        fVar.q0(((yp70) fq70Var).a);
                    } else if (fq70Var instanceof cq70) {
                        fVar.E((m950) fVar.J0.get(), new iu40(((cq70) fq70Var).a, MultimodalRouteType.TaxiTransport.getValue()), new mo30(7, fVar), new jxx(false));
                    } else if (fq70Var instanceof bq70) {
                        if (!fVar.v((m950) fVar.B1.getValue())) {
                            fVar.A((m950) fVar.B1.getValue(), ((bq70) fq70Var).a, c21Var);
                        }
                    } else if (fq70Var instanceof sp70) {
                        o2y0 o2y0Var3 = ((sp70) fq70Var).a;
                        fVar.W(o2y0Var3, o2y0Var3.b().h.b, null);
                    } else if (fq70Var instanceof wp70) {
                        fVar.n0(((wp70) fq70Var).a);
                    } else if (fq70Var instanceof xp70) {
                        xp70 xp70Var = (xp70) fq70Var;
                        boolean z = xp70Var.b;
                        o2y0 o2y0Var4 = xp70Var.a;
                        if (z) {
                            fVar.m0(o2y0Var4);
                        } else {
                            fVar.p0(o2y0Var4);
                        }
                    } else if (fq70Var instanceof tp70) {
                        fVar.k0(((tp70) fq70Var).a);
                    } else if (fq70Var instanceof vp70) {
                        vp70 vp70Var = (vp70) fq70Var;
                        fVar.l0(vp70Var.a, vp70Var.b, fVar.G, "OrderControllerEvent");
                    } else if (fq70Var instanceof up70) {
                        up70 up70Var = (up70) fq70Var;
                        ((b) fVar.a0.get()).b(up70Var.a, up70Var.b, up70Var.c);
                    } else {
                        jst.e.m("TaxiOrder.Navigation").a(20, "OrderControllerCompatFragmentRouter", new IllegalStateException("Unknown event"), String.format("Unknown order controller event %s", Arrays.copyOf(new Object[]{fq70Var}, 1)));
                    }
                }
                break;
            case 1:
                this.b.h0();
                break;
            default:
                o2y0 o2y0Var5 = (o2y0) obj;
                f fVar2 = this.b;
                if (fVar2.u() && o2y0Var5 != null) {
                    fVar2.y0(o2y0Var5);
                    fVar2.d0(o2y0Var5).f();
                }
                break;
        }
        return zy11.a;
    }
}
