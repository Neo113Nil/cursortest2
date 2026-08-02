package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.CancellationSignal;
import android.view.View;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.u;
import androidx.concurrent.futures.b;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.yandex.go.address.models.Address;
import com.yandex.go.destination_picker.ChooseAddressMode;
import com.yandex.go.navigator.rate_route.RateRouteModalView;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.w;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.PaymentChange;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowNotification;
import com.yandex.go.taxi.order.ui.status.OrderStatusModalView;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.images.DefaultImageUrlProvider;
import com.yandex.mapkit.layers.TileFormat;
import com.yandex.mapkit.map.CreateTileDataSource;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.TileDataSourceBuilder;
import com.yandex.mapkit.tiles.DefaultUrlProvider;
import com.yandex.passport.sloth.ui.dependencies.m;
import defpackage.eg3;
import defpackage.evu0;
import defpackage.gh60;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import ru.yandex.taxi.design.SliderButtonView;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutModalView;
import ru.yandex.taxi.net.taxi.dto.objects.Dialog;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.overdraft.ChangePaymentModalView;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import ru.yandextaxi.flutter_yandex_mapkit.models.Layer;

/* loaded from: classes6.dex */
public final /* synthetic */ class f83 implements dx4, iy60, smh, CreateTileDataSource, eze, vdj, rdj, pdj, Map.MapReadyCallback, eps0, q3l0, el7, aa3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ f83(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.x = obj3;
        this.w = obj4;
    }

    @Override // defpackage.eze
    public void a(int i) {
        MtCheckoutModalView.renderCounter$lambda$0$0((MtCheckoutModalView) this.b, (wye) this.c, (q8j0) this.x, (ld30) this.w, i);
    }

    @Override // defpackage.aa3
    public euy apply(Object obj) {
        e1x0 e1x0Var = (e1x0) this.b;
        CameraDevice cameraDevice = (CameraDevice) this.c;
        oyq0 oyq0Var = (oyq0) this.x;
        List list = (List) this.w;
        if (e1x0Var.u.a) {
            Iterator it = e1x0Var.b.a().iterator();
            while (it.hasNext()) {
                ((e1x0) ((b1x0) it.next())).n();
            }
        }
        e1x0.o();
        synchronized (e1x0Var.a) {
            try {
                if (e1x0Var.l) {
                    return new hiv(1, new CancellationException("Opener is disabled"));
                }
                u uVar = e1x0Var.b;
                synchronized (uVar.b) {
                    uVar.e.add(e1x0Var);
                }
                gl7 r = jx81.r(new f83(e1x0Var, list, new sr4(cameraDevice), oyq0Var, 14));
                e1x0Var.g = r;
                ni91.a(r, new c1x0(e1x0Var), geb1.b());
                return ni91.g(e1x0Var.g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.vdj
    public AlertDialog b(FragmentActivity fragmentActivity) {
        int i = this.a;
        Object obj = this.w;
        Object obj2 = this.x;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 6:
                sd30 sd30Var = (sd30) obj2;
                op70 op70Var = (op70) obj;
                AlertDialog cancelableOnTouchOutside = new AlertDialog(fragmentActivity).setCancelable(false).setCancelableOnTouchOutside(false);
                ((rp70) obj4).getClass();
                int i2 = qp70.a[((DriveState) obj3).ordinal()];
                return cancelableOnTouchOutside.setMessage((i2 == 1 || i2 == 2) ? kyh0.order_cancel_driver_found : i2 != 3 ? kyh0.order_cancel_message : kyh0.order_cancel_driver_transporting).setPositiveButton(kyh0.common_yes, sd30Var).setNegativeButton(kyh0.common_no, op70Var);
            default:
                DriveState driveState = (DriveState) obj3;
                rp70 rp70Var = (rp70) obj2;
                h2r h2rVar = (h2r) obj;
                AlertDialog alertDialog = new AlertDialog(fragmentActivity);
                if (!((TaxiOrder) obj4).D() && (driveState == DriveState.DRIVING || driveState == DriveState.WAITING)) {
                    alertDialog.setDismissOnFragmentDetach(false);
                }
                int i3 = kyh0.order_cancel_fail;
                rp70Var.getClass();
                alertDialog.setMessage(i3);
                alertDialog.setPositiveButton(kyh0.common_ok, new sf30(28, h2rVar));
                return alertDialog;
        }
    }

    @Override // com.yandex.mapkit.map.CreateTileDataSource
    public void createTileDataSource(TileDataSourceBuilder tileDataSourceBuilder) {
        TileFormat tileFormat;
        Layer layer = (Layer) this.b;
        DefaultUrlProvider defaultUrlProvider = (DefaultUrlProvider) this.c;
        DefaultImageUrlProvider defaultImageUrlProvider = (DefaultImageUrlProvider) this.x;
        Projection projection = (Projection) this.w;
        ru.yandextaxi.flutter_yandex_mapkit.models.TileFormat format = layer.getFormat();
        format.getClass();
        int i = u4z0.a[format.ordinal()];
        if (i == 1) {
            tileFormat = TileFormat.PNG;
        } else if (i == 2) {
            tileFormat = TileFormat.JPG;
        } else if (i == 3) {
            tileFormat = TileFormat.VECTOR2;
        } else if (i == 4) {
            tileFormat = TileFormat.VECTOR3;
        } else {
            if (i != 5) {
                w511.b();
                return;
            }
            tileFormat = TileFormat.GEO_JSON;
        }
        tileDataSourceBuilder.setTileFormat(tileFormat);
        tileDataSourceBuilder.setTileUrlProvider(defaultUrlProvider);
        tileDataSourceBuilder.setImageUrlProvider(defaultImageUrlProvider);
        tileDataSourceBuilder.setProjection(projection);
    }

    @Override // defpackage.smh
    public List d(int i, xzz0 xzz0Var, int[] iArr) {
        int i2;
        omh omhVar = (omh) this.b;
        String str = (String) this.c;
        int[] iArr2 = (int[]) this.x;
        Point point = (Point) this.w;
        int i3 = iArr2[i];
        int access$4100 = vmh.access$4100(xzz0Var, point != null ? point.x : omhVar.e, point != null ? point.y : omhVar.f, omhVar.h);
        piv pivVar = ImmutableList.b;
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i4 = 0; i4 < xzz0Var.a; i4++) {
            a aVar2 = xzz0Var.d[i4];
            int i5 = aVar2.u;
            int i6 = (i5 == -1 || (i2 = aVar2.v) == -1) ? -1 : i5 * i2;
            aVar.a(new umh(i, xzz0Var, i4, omhVar, iArr[i4], str, i3, access$4100 == Integer.MAX_VALUE || (i6 != -1 && i6 <= access$4100)));
        }
        return aVar.g();
    }

    @Override // defpackage.q3l0
    public o3l0 e(ou ouVar) {
        egl0 egl0Var = (egl0) this.b;
        return new egl0(egl0Var.a, egl0Var.b, (String) this.c, (hgl0) this.x, egl0Var.x, new iik0(15, (vlr) this.w));
    }

    @Override // defpackage.pdj
    public qdj f(tdj tdjVar, Activity activity, zch zchVar) {
        int i = this.a;
        Object obj = this.w;
        Object obj2 = this.x;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 9:
                return zchVar.h(tdjVar, new ChangePaymentModalView(activity, null, 0, 6, null).withData(tdjVar).withOnPaymentChanged((qpo) obj4).withOnPayLater(new ud30(11, (PaymentChange.Reason) obj3, (o2y0) obj2, (xx90) obj)));
            default:
                final t8u0 t8u0Var = (t8u0) obj4;
                final o2y0 o2y0Var = (o2y0) obj3;
                final OrderStatusWindowNotification orderStatusWindowNotification = (OrderStatusWindowNotification) obj;
                m mVar = t8u0Var.a;
                mVar.getClass();
                orderStatusWindowNotification.getClass();
                pho phoVar = (pho) mVar.a;
                q5z.h(phoVar);
                x770 x770Var = new x770(phoVar);
                lg21 lg21Var = (lg21) mVar.j;
                q5z.h(lg21Var);
                p370 p370Var = new p370(lg21Var, (zrm) obj2);
                xdf xdfVar = (xdf) mVar.d;
                q5z.h(xdfVar);
                k7x0 k7x0Var = (k7x0) mVar.i;
                q5z.h(k7x0Var);
                pav pavVar = (pav) mVar.e;
                q5z.h(pavVar);
                oxu0 oxu0Var = (oxu0) mVar.h;
                q5z.h(oxu0Var);
                tt2 tt2Var = (tt2) mVar.b;
                q5z.h(tt2Var);
                o8a0 o8a0Var = (o8a0) mVar.g;
                q5z.h(o8a0Var);
                m880 m880Var = new m880(o2y0Var, x770Var, p370Var, xdfVar, k7x0Var, pavVar, oxu0Var, tt2Var, orderStatusWindowNotification, o8a0Var);
                pdc pdcVar = (pdc) mVar.c;
                q5z.h(pdcVar);
                z0a0 z0a0Var = (z0a0) mVar.f;
                q5z.h(z0a0Var);
                OrderStatusModalView orderStatusModalView = new OrderStatusModalView(activity, m880Var, pdcVar, z0a0Var);
                orderStatusModalView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.taxi.order.ui.status.StatusOrderDialogFactory$createDialog$1$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        if (evu0.J(OrderStatusWindowNotification.this.e) || !eg3.f(OrderStatusWindowNotification.this, o2y0Var.c())) {
                            return;
                        }
                        gh60 gh60Var = t8u0Var.b;
                        String str = o2y0Var.b().a;
                        String str2 = OrderStatusWindowNotification.this.e;
                        Set M0 = kotlin.collections.a.M0(gh60Var.a.n(str));
                        M0.add(str2);
                        gh60Var.a.t(str, M0);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                    }
                });
                return zchVar.h(tdjVar, orderStatusModalView);
        }
    }

    @Override // defpackage.el7
    public Object j(b bVar) {
        String str;
        d1x0 d1x0Var = (d1x0) this.b;
        List list = (List) this.c;
        sr4 sr4Var = (sr4) this.x;
        oyq0 oyq0Var = (oyq0) this.w;
        synchronized (d1x0Var.a) {
            try {
                synchronized (d1x0Var.a) {
                    synchronized (d1x0Var.a) {
                        try {
                            List list2 = d1x0Var.j;
                            if (list2 != null) {
                                androidx.camera.core.impl.a.a(list2);
                                d1x0Var.j = null;
                            }
                        } finally {
                        }
                    }
                    androidx.camera.core.impl.a.b(list);
                    d1x0Var.j = list;
                }
                d6z.y("The openCaptureSessionCompleter can only set once!", d1x0Var.h == null);
                d1x0Var.h = bVar;
                pm5 pm5Var = (pm5) sr4Var.b;
                pm5Var.getClass();
                SessionConfiguration sessionConfiguration = oyq0Var.a.a;
                sessionConfiguration.getClass();
                try {
                    ((CameraDevice) pm5Var.b).createCaptureSession(sessionConfiguration);
                    str = "openCaptureSession[session=" + d1x0Var + "]";
                } catch (CameraAccessException e) {
                    throw new CameraAccessExceptionCompat(e);
                }
            } finally {
            }
        }
        return str;
    }

    @Override // defpackage.rdj
    public void k(AlertDialog alertDialog) {
        final rp70 rp70Var = (rp70) this.b;
        final TaxiOrder taxiOrder = (TaxiOrder) this.c;
        Dialog dialog = (Dialog) this.x;
        at20 at20Var = (at20) this.w;
        rp70Var.getClass();
        Dialog.a a = dialog.a(Dialog.Action.GO_TO_EDIT_DESTINATION);
        final Dialog.a a2 = dialog.a(Dialog.Action.BACK_TO_DRIVING_SCREEN);
        final int i = 0;
        final Dialog.a aVar = new Dialog.a(0);
        if (a == null && a2 == null) {
            alertDialog.setMainActionButton(rp70Var.a(aVar), new Runnable() { // from class: mp70
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            TaxiOrder taxiOrder2 = taxiOrder;
                            rp70 rp70Var2 = rp70Var;
                            Dialog.a aVar2 = aVar;
                            synchronized (taxiOrder2) {
                                taxiOrder2.l = taxiOrder2.l.I();
                            }
                            rp70Var2.d.d(taxiOrder2.a, aVar2.a);
                            return;
                        default:
                            TaxiOrder taxiOrder3 = taxiOrder;
                            rp70 rp70Var3 = rp70Var;
                            Dialog.a aVar3 = aVar;
                            synchronized (taxiOrder3) {
                                taxiOrder3.l = taxiOrder3.l.I();
                            }
                            rp70Var3.d.d(taxiOrder3.a, aVar3.a);
                            return;
                    }
                }
            }, (String) null);
            return;
        }
        if (a != null) {
            alertDialog.setPositiveButton(rp70Var.a(a), new l9(taxiOrder, rp70Var, a, at20Var, 21));
        }
        if (a2 != null) {
            final int i2 = 1;
            alertDialog.setNegativeButton(rp70Var.a(a2), new Runnable() { // from class: mp70
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            TaxiOrder taxiOrder2 = taxiOrder;
                            rp70 rp70Var2 = rp70Var;
                            Dialog.a aVar2 = a2;
                            synchronized (taxiOrder2) {
                                taxiOrder2.l = taxiOrder2.l.I();
                            }
                            rp70Var2.d.d(taxiOrder2.a, aVar2.a);
                            return;
                        default:
                            TaxiOrder taxiOrder3 = taxiOrder;
                            rp70 rp70Var3 = rp70Var;
                            Dialog.a aVar3 = a2;
                            synchronized (taxiOrder3) {
                                taxiOrder3.l = taxiOrder3.l.I();
                            }
                            rp70Var3.d.d(taxiOrder3.a, aVar3.a);
                            return;
                    }
                }
            });
        }
    }

    @Override // defpackage.dx4
    public void o(ru.yandex.taxi.search.view.a aVar, pv0 pv0Var) {
        int i = this.a;
        int i2 = 0;
        Object obj = this.w;
        Object obj2 = this.x;
        Object obj3 = this.c;
        k83 k83Var = (k83) this.b;
        ModalViewOrigin modalViewOrigin = (ModalViewOrigin) obj3;
        switch (i) {
            case 0:
                t621 t621Var = (t621) obj2;
                k83Var.A((m950) k83Var.I.get(), new vzi(t621Var.a, (Address) k83Var.J.c().b.get(t621Var.b), t621Var.b, new arb(k83.U(modalViewOrigin), ChooseAddressMode.STOP, modalViewOrigin), RouteSelectorOpenReason.ADDRESS), new j83(i2, (e83) obj));
                break;
            default:
                k83Var.A((m950) k83Var.I.get(), new rzi(((s80) obj2).a, tyi.a, pv0Var, new arb(k83.U(modalViewOrigin), ChooseAddressMode.STOP, modalViewOrigin), RouteSelectorOpenReason.ADDRESS), new j83(i2, (e83) obj));
                break;
        }
    }

    @Override // defpackage.iy60
    public void onFailure(Exception exc) {
        CredentialProviderPlayServicesImpl.onClearCredential$lambda$4((CredentialProviderPlayServicesImpl) this.b, (CancellationSignal) this.c, (Executor) this.x, (c9f) this.w, exc);
    }

    @Override // com.yandex.mapkit.map.Map.MapReadyCallback
    public void onMapReady() {
        RateRouteModalView.renderMapView$lambda$0$0((RateRouteModalView) this.b, (List) this.c, (List) this.x, (TaxiMapView) this.w);
    }

    @Override // defpackage.eps0
    public void p(int i, long j) {
        SliderButtonView sliderButtonView = (SliderButtonView) this.b;
        w wVar = (w) this.c;
        ibk0 ibk0Var = (ibk0) this.x;
        wrs0 wrs0Var = (wrs0) this.w;
        sliderButtonView.showProgressState();
        wVar.S.a(ibk0Var, wrs0Var);
    }
}
