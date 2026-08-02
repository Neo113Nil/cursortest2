package defpackage;

import androidx.compose.material3.p;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.xplat.common.PollingError;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.common.c;
import com.yandex.xplat.payment.sdk.NetworkServiceError;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation.MobileProvidersListFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation.MobilePaymentSelectContactFragment;
import com.ybsdk.widgets.common.bottomsheet.daychoosers.MonthDayChooserView;
import com.ybsdk.widgets.common.g;
import io.appmetrica.analytics.rtm.internal.Constants;
import jason.statham.tools.a;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes6.dex */
public final /* synthetic */ class ps20 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ ps20(ou20 ou20Var) {
        this.a = 6;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        g render$lambda$16$lambda$11;
        g render$lambda$13$lambda$8;
        zy11 saveClickAction$lambda$0;
        zy11 onDaySelectCallback$lambda$1;
        Iterable iterable;
        int i = 3;
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                if (!((Boolean) obj).booleanValue()) {
                    break;
                } else {
                    break;
                }
            case 3:
                wj00 b = ((y3x) obj).b();
                String p = b.p(ACSPConstants.STATUS);
                int o = b.o(AuthSdkActivity.RESPONSE_TYPE_CODE);
                String p2 = b.p("req_id");
                String h = b.h(Constants.KEY_MESSAGE);
                Integer g = b.g("subcode");
                b.h("substatus");
                break;
            case 4:
                render$lambda$16$lambda$11 = MobilePaymentSelectContactFragment.render$lambda$16$lambda$11((g) obj);
                break;
            case 5:
                render$lambda$13$lambda$8 = MobileProvidersListFragment.render$lambda$13$lambda$8((g) obj);
                break;
            case 6:
                PaymentProviderEntity paymentProviderEntity = (PaymentProviderEntity) obj;
                du20 du20Var = new du20(paymentProviderEntity);
                Text.Constant i2 = g8e.i(Text.Companion, paymentProviderEntity.getName());
                ThemedImageUrlEntity logo = paymentProviderEntity.getLogo();
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                tyj0 tyj0Var = (tyj0) obj;
                boolean c = tyj0Var.c();
                YSError ySError = tyj0Var.b;
                if (!c) {
                    c.b(ySError);
                    if (!(ySError instanceof NetworkServiceError) || !((NetworkServiceError) ySError).i()) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 10:
                YSError ySError2 = (YSError) obj;
                if (!(ySError2 instanceof PollingError)) {
                    break;
                } else {
                    break;
                }
            case 11:
                wj00 b2 = ((y3x) obj).b();
                String p3 = b2.p(ACSPConstants.STATUS);
                b2.h(AuthSdkActivity.RESPONSE_TYPE_CODE);
                b2.h(Constants.KEY_MESSAGE);
                break;
            case 12:
                ((mw20) obj).e();
                break;
            case 13:
                int i3 = p.b;
                break;
            case 14:
                f.v((mnq0) obj);
                break;
            case 15:
                kgx[] kgxVarArr = f.a;
                androidx.compose.ui.semantics.g gVar = d.y;
                zy11 zy11Var = zy11.a;
                ((mnq0) obj).a(gVar, zy11Var);
                break;
            case 16:
                ((Integer) obj).getClass();
                twt0 twt0Var = wx20.a;
                break;
            case 17:
                saveClickAction$lambda$0 = MonthDayChooserView.saveClickAction$lambda$0((x630) obj);
                break;
            case 18:
                onDaySelectCallback$lambda$1 = MonthDayChooserView.onDaySelectCallback$lambda$1((String) obj);
                break;
            case 19:
                z770 z770Var = (z770) obj;
                hdu hduVar = z770Var.a.c;
                if (hduVar != null) {
                    a870 a870Var = z770Var.b;
                    ((c0g) a870Var.D).getClass();
                    rfa0 a = new sfa0().a(((c0g) a870Var.D).I2().a.c(), ((c0g) a870Var.D).I2().a.e());
                    k6x k6xVar = a870Var.H.a;
                    if (k6xVar.a()) {
                        d6x d = a.d(k6xVar.b(), (r5x) hduVar.a, dwl.a(a), (s6x) hduVar.b);
                        if (!d.equals(k6xVar.b())) {
                            k6xVar.e(d);
                        }
                    }
                }
                b870 b870Var = z770Var.a;
                n6u n6uVar = b870Var.b;
                n530 n530Var = n6uVar.c;
                kr krVar = b870Var.a.b;
                pxl pxlVar = n6uVar.b;
                Map f = b.f();
                if (krVar != null) {
                    n530Var.b(krVar, pxlVar, f);
                }
                z770Var.b.r(new qu(9));
                break;
            case 20:
                xby.d.h("MosmetroOtp", "Error while exchange OTP for Mosmetro", (Throwable) obj);
                break;
            case 21:
                xby.d.h("MosmetroOtp", "Error while init OTP for Mosmetro", (Throwable) obj);
                break;
            case 22:
                ((kc30) obj).a();
                break;
            case 23:
                ((jd30) obj).onClose();
                break;
            case 24:
                ((jd30) obj).c();
                break;
            case 25:
                ((nd30) obj).m();
                break;
            case 26:
                wy30 wy30Var = (wy30) obj;
                if (!(wy30Var instanceof ty30)) {
                    if (!(wy30Var instanceof vy30)) {
                        if (!(wy30Var instanceof sy30)) {
                            if (!(wy30Var instanceof uy30)) {
                                w511.b();
                                break;
                            } else {
                                iterable = EmptyList.a;
                            }
                        } else {
                            iterable = kotlin.collections.a.J0(kotlin.collections.a.A0(((sy30) wy30Var).c(), 3));
                        }
                    } else {
                        iterable = kotlin.collections.a.J0(kotlin.collections.a.A0(((vy30) wy30Var).c, 3));
                    }
                } else {
                    iterable = kotlin.collections.a.J0(kotlin.collections.a.A0(((ty30) wy30Var).c, 3));
                }
                break;
            case 27:
                break;
            case 28:
                x8d.a.getClass();
                u6y.b((u6y) obj, null, x8d.d, 3);
                break;
            default:
                ru.yandex.taxi.masstransit.d.Q(((b010) obj).a, oq30.a);
                break;
        }
        return zy11.a;
    }

    public /* synthetic */ ps20(int i) {
        this.a = i;
    }
}
