package defpackage;

import com.ybsdk.core.analytics.generated.delegates.MobileServicesEvents$PaymentMobileServicesAllowContactsInitiatedType;
import com.ybsdk.core.analytics.generated.delegates.MobileServicesEvents$PaymentMobileServicesAllowContactsResultType;
import com.ybsdk.core.permissions.RequestPermissionResult;
import com.ybsdk.feature.kyc.api.KycGeoRequest;
import com.ybsdk.feature.kyc.internal.screens.photov2.b;
import com.ybsdk.feature.main.internal.screens.products.ProductsFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation.a;
import com.ybsdk.rconfig.NotificationChannels;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class mox implements qya0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mox(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void j() {
    }

    private final void k() {
    }

    private final void l() {
    }

    private final void m() {
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }

    @Override // defpackage.qya0
    public final void c(RequestPermissionResult requestPermissionResult) {
        int i = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                bVar.J = true;
                bVar.h0(requestPermissionResult.getIsGranted());
                break;
            case 1:
                com.ybsdk.feature.kyc.internal.screens.photo.b bVar2 = (com.ybsdk.feature.kyc.internal.screens.photo.b) obj;
                bVar2.N = true;
                bVar2.i0(requestPermissionResult.getIsGranted());
                if (((if8) bVar2.F).b() == KycGeoRequest.OPTIONAL) {
                    bVar2.r0();
                    break;
                }
                break;
            case 2:
                a aVar = (a) obj;
                qq7 qq7Var = aVar.J.a.L;
                MobileServicesEvents$PaymentMobileServicesAllowContactsResultType mobileServicesEvents$PaymentMobileServicesAllowContactsResultType = requestPermissionResult.getIsGranted() ? MobileServicesEvents$PaymentMobileServicesAllowContactsResultType.ALLOWED : MobileServicesEvents$PaymentMobileServicesAllowContactsResultType.DENIED;
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put("type", mobileServicesEvents$PaymentMobileServicesAllowContactsResultType.getOriginalValue());
                qq7Var.a.a("payment.mobile_services.allow_contacts.result", linkedHashMap);
                aVar.N = true;
                int i2 = mt20.a[requestPermissionResult.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3 && i2 != 4 && i2 != 5) {
                        w511.b();
                        break;
                    } else {
                        z = false;
                    }
                }
                ((me1) aVar.D).b.edit().putBoolean("phone_permission_was_disallowed", z).apply();
                if (!requestPermissionResult.getIsGranted()) {
                    aVar.e0();
                    break;
                } else {
                    aVar.p0();
                    break;
                }
                break;
            case 3:
                com.ybsdk.feature.kyc.internal.screens.photov3.b bVar3 = (com.ybsdk.feature.kyc.internal.screens.photov3.b) obj;
                bVar3.I = true;
                bVar3.f0(requestPermissionResult.getIsGranted());
                break;
            default:
                com.ybsdk.feature.main.internal.screens.products.a access$getViewModel = ProductsFragment.access$getViewModel((ProductsFragment) obj);
                access$getViewModel.getClass();
                if (!requestPermissionResult.getIsGranted()) {
                    access$getViewModel.C.X.a.a("push_notifications.permission_declined", null);
                    break;
                } else {
                    h2r h2rVar = access$getViewModel.D;
                    wt51 wt51Var = (wt51) h2rVar.b;
                    com.ybsdk.rconfig.b bVar4 = (com.ybsdk.rconfig.b) h2rVar.c;
                    List<NotificationChannels.YbNotificationChannel> channels = ((NotificationChannels) bVar4.d(bVar4.i.m).getData()).getChannels();
                    ArrayList arrayList = new ArrayList(tcc.n(channels, 10));
                    Iterator<T> it = channels.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((NotificationChannels.YbNotificationChannel) it.next()).toFeatureNotificationChanel());
                    }
                    u0a1.c(((x8g) ((com.ybsdk.feature.push.impl.a) wt51Var).a).a, arrayList);
                    break;
                }
        }
    }

    @Override // defpackage.qya0
    public final void d() {
        switch (this.a) {
            case 2:
                ((a) this.b).J.h(MobileServicesEvents$PaymentMobileServicesAllowContactsInitiatedType.IN_APP_INFO);
                break;
        }
    }

    @Override // defpackage.qya0
    public final void e() {
        switch (this.a) {
            case 2:
                ((a) this.b).J.h(MobileServicesEvents$PaymentMobileServicesAllowContactsInitiatedType.SYSTEM);
                break;
        }
    }

    @Override // defpackage.qya0
    public final void f() {
        switch (this.a) {
            case 2:
                ((a) this.b).J.h(MobileServicesEvents$PaymentMobileServicesAllowContactsInitiatedType.IN_APP_SETTINGS);
                break;
        }
    }
}
