package defpackage;

import android.content.res.Resources;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.view.View;
import androidx.camera.camera2.internal.s;
import androidx.camera.core.CameraControl$OperationCanceledException;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.yandex.go.places.api.navigation.OpenNavigatorActionSubtype;
import com.yandex.go.places.models.data.entities.network.DeliveryOrderFormRoutePointDto;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$Deeplink;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$OpenDeliveryOrderForm;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$OpenMoreActionItemDto;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$OpenMoreActions;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$OpenNavigator;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$OpenTaxi;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$ShareNative;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$Unknown;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$WebCustomTabs;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$WebView;
import com.yandex.go.places.models.data.entities.network.bottom_panel.k;
import com.yandex.go.places.models.domain.entities.DeliveryRoutePointType;
import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;
import com.yandex.payment.sdk.core.data.GooglePayToken;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.ui.bind.BindGooglePayActivity;
import com.ybsdk.feature.card.internal.presentation.carddetails.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import org.bouncycastle.cms.CMSException;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.cashback.f;
import ru.yandex.taxi.plus.badge.CashbackHorizontalView;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes13.dex */
public final class pm5 implements g98, ryj0, hw31, c57, hqs, iqs, rdq0, wyt, u1d0 {
    public final /* synthetic */ int a;
    public final Object b;

    public pm5(ige igeVar) {
        this.a = 11;
        this.b = igeVar;
        try {
            s4o n = s4o.n(igeVar.b);
            zq80 zq80Var = n.b;
            m3 m3Var = n.c;
            szn sznVar = n.w;
            edb1.a(m3Var, sznVar.m(), new c06(sznVar.n(), new md6(sznVar.o().a)));
        } catch (ClassCastException e) {
            throw new CMSException("Malformed content.", e);
        } catch (IllegalArgumentException e2) {
            throw new CMSException("Malformed content.", e2);
        }
    }

    @Override // defpackage.rdq0
    public void B0() {
    }

    @Override // defpackage.wyt
    public Resources C() {
        return ((CashbackHorizontalView) this.b).getResources();
    }

    @Override // defpackage.rdq0
    public void I(bgq0 bgq0Var) {
        ((zsa) this.b).r(new cx7(20, bgq0Var));
    }

    public bq8 a() {
        return (bq8) ((b) this.b).X();
    }

    public void b(o2y0 o2y0Var, ChangeOrderNotificationActionResponse changeOrderNotificationActionResponse) {
        int i = pb9.a[changeOrderNotificationActionResponse.ordinal()];
        if (i == 1) {
            ((x280) this.b).a.a(new eq70(o2y0Var));
        } else {
            if (i == 2) {
                return;
            }
            w511.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0177 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x013e  */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fr c(k kVar, il6 il6Var) {
        int i;
        sp spVar;
        fr frVar;
        DeliveryRoutePointType deliveryRoutePointType;
        double d;
        sp spVar2;
        agi agiVar = null;
        if (kVar instanceof BottomPanelButtonActionDto$Deeplink) {
            frVar = new jp(((BottomPanelButtonActionDto$Deeplink) kVar).a);
        } else if (kVar instanceof BottomPanelButtonActionDto$ShareNative) {
            BottomPanelButtonActionDto$ShareNative bottomPanelButtonActionDto$ShareNative = (BottomPanelButtonActionDto$ShareNative) kVar;
            frVar = new xq(bottomPanelButtonActionDto$ShareNative.a, bottomPanelButtonActionDto$ShareNative.b, bottomPanelButtonActionDto$ShareNative.c, null);
        } else if (kVar instanceof BottomPanelButtonActionDto$WebView) {
            frVar = new hq(((BottomPanelButtonActionDto$WebView) kVar).a);
        } else if (kVar instanceof BottomPanelButtonActionDto$WebCustomTabs) {
            BottomPanelButtonActionDto$WebCustomTabs bottomPanelButtonActionDto$WebCustomTabs = (BottomPanelButtonActionDto$WebCustomTabs) kVar;
            frVar = new gq(bottomPanelButtonActionDto$WebCustomTabs.a, bottomPanelButtonActionDto$WebCustomTabs.b);
        } else if (kVar instanceof BottomPanelButtonActionDto$OpenTaxi) {
            frVar = new fq(((BottomPanelButtonActionDto$OpenTaxi) kVar).a);
        } else if (kVar instanceof BottomPanelButtonActionDto$OpenNavigator) {
            BottomPanelButtonActionDto$OpenNavigator bottomPanelButtonActionDto$OpenNavigator = (BottomPanelButtonActionDto$OpenNavigator) kVar;
            String str = bottomPanelButtonActionDto$OpenNavigator.a;
            String str2 = bottomPanelButtonActionDto$OpenNavigator.b;
            frVar = new dq(jl40.l(str2, "go_via") ? OpenNavigatorActionSubtype.GO_VIA_ACTION : jl40.l(str2, "go_to") ? OpenNavigatorActionSubtype.GO_TO_ACTION : OpenNavigatorActionSubtype.GO_TO_ACTION, str);
        } else {
            if (kVar instanceof BottomPanelButtonActionDto$OpenDeliveryOrderForm) {
                BottomPanelButtonActionDto$OpenDeliveryOrderForm bottomPanelButtonActionDto$OpenDeliveryOrderForm = (BottomPanelButtonActionDto$OpenDeliveryOrderForm) kVar;
                String str3 = bottomPanelButtonActionDto$OpenDeliveryOrderForm.b;
                String str4 = bottomPanelButtonActionDto$OpenDeliveryOrderForm.a;
                DeliveryOrderFormRoutePointDto deliveryOrderFormRoutePointDto = bottomPanelButtonActionDto$OpenDeliveryOrderForm.c;
                if (deliveryOrderFormRoutePointDto != null) {
                    int i2 = xd6.a[deliveryOrderFormRoutePointDto.a.ordinal()];
                    if (i2 == 1) {
                        deliveryRoutePointType = DeliveryRoutePointType.SOURCE;
                    } else {
                        if (i2 != 2) {
                            w511.b();
                            return null;
                        }
                        deliveryRoutePointType = DeliveryRoutePointType.DESTINATION;
                    }
                    String str5 = deliveryOrderFormRoutePointDto.b;
                    double[] dArr = deliveryOrderFormRoutePointDto.c;
                    if (dArr.length > 0) {
                        i = 0;
                        spVar = null;
                        d = dArr[0];
                    } else {
                        i = 0;
                        spVar = null;
                        d = 0.0d;
                    }
                    agiVar = new agi(deliveryRoutePointType, str5, new coe(1 < dArr.length ? dArr[1] : 0.0d, d), Integer.valueOf(i));
                } else {
                    i = 0;
                    spVar = null;
                }
                frVar = new cq(str3, str4, agiVar);
            } else {
                i = 0;
                spVar = null;
                if (kVar instanceof BottomPanelButtonActionDto$OpenMoreActions) {
                    BottomPanelButtonActionDto$OpenMoreActions bottomPanelButtonActionDto$OpenMoreActions = (BottomPanelButtonActionDto$OpenMoreActions) kVar;
                    List<BottomPanelButtonActionDto$OpenMoreActionItemDto> list = bottomPanelButtonActionDto$OpenMoreActions.b;
                    ArrayList arrayList = new ArrayList();
                    for (BottomPanelButtonActionDto$OpenMoreActionItemDto bottomPanelButtonActionDto$OpenMoreActionItemDto : list) {
                        fr c = c(bottomPanelButtonActionDto$OpenMoreActionItemDto.a, il6Var);
                        zp zpVar = c == null ? null : new zp(c, bottomPanelButtonActionDto$OpenMoreActionItemDto.b, ((dbv) this.b).a(bottomPanelButtonActionDto$OpenMoreActionItemDto.c));
                        if (zpVar != null) {
                            arrayList.add(zpVar);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        frVar = new aq(bottomPanelButtonActionDto$OpenMoreActions.a, arrayList);
                    }
                } else if (!(kVar instanceof BottomPanelButtonActionDto$Unknown)) {
                    w511.b();
                    return null;
                }
                frVar = null;
            }
            if (frVar != null) {
                return spVar;
            }
            String c2 = kVar.getC();
            if (c2 != null && !evu0.J(c2)) {
                ?? r3 = il6Var != null ? il6Var.a : spVar;
                if (r3 != 0 && !evu0.J(r3)) {
                    spVar2 = new sp(c2, il6Var.a);
                    if (spVar2 != null) {
                        return frVar;
                    }
                    fr[] frVarArr = new fr[2];
                    frVarArr[i] = frVar;
                    frVarArr[1] = spVar2;
                    return new yp(scc.g(frVarArr));
                }
            }
            spVar2 = spVar;
            if (spVar2 != null) {
            }
        }
        i = 0;
        spVar = null;
        if (frVar != null) {
        }
    }

    public void d(q47 q47Var) {
        dv31 dv31Var;
        dv31Var = ((ButtonsView) this.b).stateHolder;
        dv31Var.g(q47Var, false, false);
    }

    @Override // defpackage.g98
    public void e(f98 f98Var) {
        ((qu5) this.b).m.l(f98Var);
    }

    public void f(b57 b57Var) {
        ((ButtonsView) this.b).onClickListener = new s57(1, b57Var);
    }

    @Override // defpackage.g98
    public void g(rk6 rk6Var) {
        ((qu5) this.b).o = rk6Var;
    }

    @Override // defpackage.wyt
    public int getPaddingTop() {
        return ((CashbackHorizontalView) this.b).getPaddingTop();
    }

    @Override // defpackage.wyt
    public int getWidth() {
        return ((CashbackHorizontalView) this.b).getWidth();
    }

    @Override // defpackage.u1d0
    public void h(w7o w7oVar) {
        f fVar = ((g0h) this.b).a;
        if (fVar.u()) {
            fVar.r(new qu(9));
        }
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        PaymentKitError paymentKitError = (PaymentKitError) obj;
        Object obj2 = dgo.a;
        BindGooglePayActivity bindGooglePayActivity = (BindGooglePayActivity) this.b;
        ev5 a = dgo.a(((pwf) bindGooglePayActivity.getBaseComponent$paymentsdk_release()).b());
        if (a != null) {
            a.a(new f0a0(paymentKitError));
        }
        sv90 sv90Var = qv90.a;
        String paymentKitError2 = paymentKitError.toString();
        sv90Var.getClass();
        bindGooglePayActivity.reportEvent(y891.c("google_pay_token_failed", vfc.i(0, CRLReasonCodeExtension.REASON, paymentKitError2, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Не удалось получить GooglePay токен, ошибка: ".concat(paymentKitError2))));
        bindGooglePayActivity.saveActivityResultError$paymentsdk_release(paymentKitError);
        bindGooglePayActivity.finishWithResult$paymentsdk_release();
    }

    @Override // defpackage.hw31
    public n751 k(View view, n751 n751Var, iw31 iw31Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        BottomAppBar bottomAppBar = (BottomAppBar) this.b;
        z = bottomAppBar.paddingBottomSystemWindowInsets;
        if (z) {
            bottomAppBar.bottomInset = n751Var.a();
        }
        z2 = bottomAppBar.paddingLeftSystemWindowInsets;
        boolean z5 = false;
        if (z2) {
            i2 = bottomAppBar.leftInset;
            z3 = i2 != n751Var.b();
            bottomAppBar.leftInset = n751Var.b();
        } else {
            z3 = false;
        }
        z4 = bottomAppBar.paddingRightSystemWindowInsets;
        if (z4) {
            i = bottomAppBar.rightInset;
            boolean z6 = i != n751Var.c();
            bottomAppBar.rightInset = n751Var.c();
            z5 = z6;
        }
        if (!z3 && !z5) {
            return n751Var;
        }
        bottomAppBar.cancelAnimations();
        bottomAppBar.setCutoutStateAndTranslateFab();
        bottomAppBar.setActionMenuViewPosition();
        return n751Var;
    }

    @Override // defpackage.hqs
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 14:
                boolean z = th instanceof CameraControl$OperationCanceledException;
                wrb0 wrb0Var = (wrb0) this.b;
                if (z) {
                    czj0.b(null, wrb0Var);
                    return;
                } else {
                    czj0.a(wrb0Var, th);
                    return;
                }
            default:
                synchronized (((s) this.b).a) {
                    try {
                        ((s) this.b).d.r();
                        int ordinal = ((s) this.b).j.ordinal();
                        if ((ordinal == 4 || ordinal == 5 || ordinal == 6) && !(th instanceof CancellationException)) {
                            Objects.toString(((s) this.b).j);
                            sgb1.g(5, "CaptureSession");
                            ((s) this.b).m();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                GooglePayToken googlePayToken = (GooglePayToken) obj;
                Object obj3 = dgo.a;
                BindGooglePayActivity bindGooglePayActivity = (BindGooglePayActivity) obj2;
                ev5 a = dgo.a(((pwf) bindGooglePayActivity.getBaseComponent$paymentsdk_release()).b());
                if (a != null) {
                    a.a(h2b1.L);
                }
                bindGooglePayActivity.reportEvent(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Получен GooglePay токен", "google_pay_token_received"));
                bindGooglePayActivity.saveActivityResultSuccess$paymentsdk_release(googlePayToken);
                bindGooglePayActivity.finishWithResult$paymentsdk_release();
                break;
            case 14:
                czj0.b((nur) obj, (wrb0) obj2);
                break;
            default:
                break;
        }
    }

    public /* synthetic */ pm5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public pm5(CameraDevice cameraDevice) {
        this.a = 15;
        cameraDevice.getClass();
        this.b = cameraDevice;
    }

    public pm5(CameraCaptureSession cameraCaptureSession) {
        this.a = 13;
        this.b = new hh5(cameraCaptureSession);
    }
}
