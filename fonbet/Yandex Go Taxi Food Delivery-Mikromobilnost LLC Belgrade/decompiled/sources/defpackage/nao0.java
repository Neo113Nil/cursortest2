package defpackage;

import android.content.Context;
import android.location.LocationListener;
import android.view.ViewGroup;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.i;
import com.yandex.go.scooters.b;
import com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2.ScootersTariffItemViewImplV2;
import com.yandex.go.scooters.qr.ui.ScootersQrModalView;
import com.yandex.go.scooters.zones.info.a;
import com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.views.SuperAppMapSearchbarView;
import com.yandex.messaging.data.e;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.payment.sdk.core.data.PersonalInfo;
import com.yandex.payment.sdk.ui.common.c;
import ru.yandex.taxi.favorites.rides.settings_modal.ui.SettingsModalView;
import ru.yandex.taxi.scooters.presentation.share_location.domain.d;

/* loaded from: classes13.dex */
public final /* synthetic */ class nao0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nao0(zlq0 zlq0Var, tls tlsVar) {
        this.a = 23;
        this.c = zlq0Var;
        this.b = tlsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        bys prefixSelectorButtonsAdapter_delegate$lambda$0;
        zy11 prefixSelectorButtonsAdapter_delegate$lambda$0$0$0$0$0;
        zy11 bindSelection$lambda$0;
        q9r0 adapter_delegate$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((tls) obj2).invoke(new tao0(((yao0) obj).j));
                break;
            case 1:
                ((tls) obj2).invoke(new ojo0(s3b1.k((ajo0) obj)));
                break;
            case 2:
                ((b) obj2).S((yko0) obj);
                break;
            case 3:
                ((b) obj2).U(((clo0) obj).a, null);
                break;
            case 4:
                ((b) obj2).U((pxm0) obj, null);
                break;
            case 5:
                prefixSelectorButtonsAdapter_delegate$lambda$0 = ScootersQrModalView.prefixSelectorButtonsAdapter_delegate$lambda$0((ScootersQrModalView) obj2, (Context) obj);
                break;
            case 6:
                prefixSelectorButtonsAdapter_delegate$lambda$0$0$0$0$0 = ScootersQrModalView.prefixSelectorButtonsAdapter_delegate$lambda$0$0$0$0$0((ScootersQrModalView) obj2, (String) obj);
                break;
            case 7:
                ((d) obj2).c.removeUpdates((LocationListener) obj);
                break;
            case 8:
                ((f28) obj2).r(new iin0(29, (r0o0) obj));
                break;
            case 9:
                ((tls) obj2).invoke(new f1p0(((j1p0) obj).b));
                break;
            case 10:
                ((tls) obj2).invoke(new i2p0(((l2p0) obj).j));
                break;
            case 11:
                bindSelection$lambda$0 = ScootersTariffItemViewImplV2.bindSelection$lambda$0((ScootersTariffItemViewImplV2) obj2, (i5p0) obj);
                break;
            case 12:
                a aVar = (a) obj2;
                aVar.A((m950) aVar.I.get(), new oap0(((u9p0) obj).a), sy60.Q2);
                break;
            case 13:
                ((tls) obj2).invoke((pep0) obj);
                break;
            case 14:
                ((hhp0) obj).getClass();
                ((tls) obj2).invoke(ghp0.a);
                break;
            case 15:
                ((tls) obj2).invoke(((zjp0) obj).e);
                break;
            case 16:
                ylp0 ylp0Var = (ylp0) obj2;
                ylp0Var.e = true;
                ulp0 ulp0Var = ylp0Var.d;
                ulp0Var.a.setValue(ulp0Var, ulp0.b[0], Boolean.TRUE);
                ((Runnable) obj).run();
                break;
            case 17:
                ((e) obj2).a.unregisterOnSharedPreferenceChangeListener((upp0) obj);
                break;
            case 18:
                vxp0 vxp0Var = (vxp0) obj;
                ViewGroup.LayoutParams layoutParams = ((SuperAppMapSearchbarView) obj2).getLayoutParams();
                float f = layoutParams != null ? layoutParams.height : 0;
                if (f <= 0.0f) {
                    f = vxp0Var.b.getHeight();
                }
                break;
            case 19:
                ((tls) obj2).invoke(((w9q0) obj).c);
                break;
            case 20:
                c cVar = (c) obj2;
                zbq0 zbq0Var = (zbq0) obj;
                PersonalInfo personalInfo = zbq0Var.A;
                boolean isDebug = ((PaymentSdkEnvironment) ((pwf) zbq0Var.b).n.get()).getIsDebug();
                cn90 b = np90.b();
                if (b != null) {
                    np90.c(cVar.c.a, b, personalInfo, isDebug);
                    break;
                }
                break;
            case 21:
                i iVar = (i) obj2;
                long j = ((k6w) ((oz40) obj).getValue()).a;
                ckq0 g = iVar.g();
                long j2 = 9205357640488583168L;
                if (g != null) {
                    Handle f2 = iVar.f();
                    int i2 = f2 == null ? -1 : ykq0.a[f2.ordinal()];
                    if (i2 != -1) {
                        if (i2 == 1) {
                            j2 = rx91.f(iVar, j, g.a);
                        } else if (i2 == 2) {
                            j2 = rx91.f(iVar, j, g.b);
                        } else if (i2 == 3) {
                            ny61.r("SelectionContainer does not support cursor");
                            break;
                        } else {
                            w511.b();
                            break;
                        }
                    }
                }
                break;
            case 22:
                bfq0 bfq0Var = (bfq0) obj2;
                d8q0 d8q0Var = (d8q0) obj;
                int i3 = (bfq0Var.a && bfq0Var.b) ? 0 : 1;
                u1n.m(d8q0Var.b, bfq0Var.f);
                ((hf5) d8q0Var.c.get()).b(i3 != 0 ? bfq0Var.e : null, bfq0Var.d, scc.h(i3 != 0 ? bfq0Var.c : null));
                break;
            case 23:
                zlq0 zlq0Var = (zlq0) obj;
                tls tlsVar = (tls) obj2;
                Object obj3 = zlq0Var.d ? zlq0Var.c : null;
                if (obj3 != null) {
                    tlsVar.invoke(obj3);
                    break;
                }
                break;
            case 24:
                ((uwl0) obj2).invoke(((z8r0) ((n70) obj).Z()).a);
                break;
            case 25:
                adapter_delegate$lambda$0 = SettingsModalView.adapter_delegate$lambda$0((bts0) obj2, (SettingsModalView) obj);
                break;
            case 26:
                n70 n70Var = (n70) obj;
                ((wls) obj2).invoke(((g9r0) n70Var.Z()).a, Boolean.valueOf(((g9r0) n70Var.Z()).e));
                break;
            case 27:
                com.yandex.go.navigator.user_placemark.c cVar2 = ((com.yandex.go.navigator.settings.c) obj2).H;
                boolean z = !((wr21) obj).b;
                cVar2.a.u("USER_PLACEMARK_TOGGLE", z);
                qv10.B(z, cVar2.c, null);
                break;
            case 28:
                ((gdr0) obj2).Q(((edr0) obj).a);
                break;
            default:
                com.yandex.go.settings.domain.a aVar2 = (com.yandex.go.settings.domain.a) obj2;
                aVar2.l.a(true);
                aVar2.a.X((u8r0) obj, false, true);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ nao0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
