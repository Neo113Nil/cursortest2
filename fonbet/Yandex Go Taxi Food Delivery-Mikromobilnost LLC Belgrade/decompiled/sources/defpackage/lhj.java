package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.semantics.f;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.action.DivExpressionResolverImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.contentcontroller.DivkitContentControllerFactory;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.promocodes.d;
import com.yandex.xplat.common.PollingError;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import com.yandex.xplat.payment.sdk.NetworkServiceError;
import com.ybsdk.feature.savings.internal.views.diffrate.DiffRateCalendarView;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.design.DividerAwareComponent;

/* loaded from: classes13.dex */
public final /* synthetic */ class lhj implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ lhj(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 calendarAdapter$lambda$0;
        Uri resolveUrl_gIAlu_s$lambda$8$lambda$7;
        String resolveString_gIAlu_s$lambda$2$lambda$1;
        Integer valueOf;
        kr krVar;
        int i = this.a;
        int i2 = 21;
        int i3 = 12;
        int i4 = 1;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return mbb1.d((y3x) obj, new ej40(28));
            case 1:
                wj00 b = ((y3x) obj).b();
                return new uhj(b.p(ACSPConstants.STATUS), b.h("status_code"), b.h("status_desc"));
            case 2:
                YSError ySError = (YSError) obj;
                return ySError instanceof PollingError ? zmx.c(new NetworkServiceError(ExternalErrorKind.network, ExternalErrorTrigger.internal_sdk, (Integer) null, g8e.o("Polling failed, error: ", ySError.getMessage()), (String) null, 48).h(ExternalErrorTrigger.diehard)) : zmx.c(ySError);
            case 3:
                y3x y3xVar = (y3x) obj;
                uhj uhjVar = (uhj) mbb1.d(y3xVar, new lhj(i4)).d();
                return new whj(uhjVar.a, uhjVar.b, uhjVar.c, y3xVar.b().h("status_3ds"));
            case 4:
                calendarAdapter$lambda$0 = DiffRateCalendarView.calendarAdapter$lambda$0((pf7) obj);
                return calendarAdapter$lambda$0;
            case 5:
                ((dpj) obj).R0();
                return zy11Var;
            case 6:
                ((dpj) obj).w0();
                return zy11Var;
            case 7:
                qrj qrjVar = (qrj) obj;
                switch (qrjVar.a) {
                    case 0:
                        ((rrj) qrjVar.b).r(new lhj(i3));
                        return zy11Var;
                    default:
                        ((d) qrjVar.b).r(new gdf0(19));
                        return zy11Var;
                }
            case 8:
                qrj qrjVar2 = (qrj) obj;
                switch (qrjVar2.a) {
                    case 0:
                        ((rrj) qrjVar2.b).r(new lhj(11));
                        return zy11Var;
                    default:
                        ((d) qrjVar2.b).r(new gdf0(18));
                        return zy11Var;
                }
            case 9:
                trf0 trf0Var = (trf0) obj;
                trf0Var.a.r(new gdf0(trf0Var.b));
                return zy11Var;
            case 10:
                ((trf0) obj).a.r(new gdf0(i2));
                return zy11Var;
            case 11:
                trf0 trf0Var2 = (trf0) obj;
                trf0Var2.a.r(new gdf0(trf0Var2.b));
                return zy11Var;
            case 12:
                ((trf0) obj).a.r(new gdf0(i2));
                return zy11Var;
            case 13:
                return new JSONObject((String) obj);
            case 14:
                resolveUrl_gIAlu_s$lambda$8$lambda$7 = DivExpressionResolverImpl.resolveUrl_gIAlu_s$lambda$8$lambda$7((Uri) obj);
                return resolveUrl_gIAlu_s$lambda$8$lambda$7;
            case 15:
                return (String) obj;
            case 16:
                resolveString_gIAlu_s$lambda$2$lambda$1 = DivExpressionResolverImpl.resolveString_gIAlu_s$lambda$2$lambda$1((String) obj);
                return resolveString_gIAlu_s$lambda$2$lambda$1;
            case 17:
                valueOf = Integer.valueOf(((Integer) obj).intValue());
                return valueOf;
            case 18:
                n70 n70Var = (n70) obj;
                n70Var.W(new ns3(n70Var, 7));
                return zy11Var;
            case 19:
                View view = new View(((ViewGroup) obj).getContext());
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, tje.u(40, view.getContext())));
                view.setFocusable(false);
                view.setImportantForAccessibility(4);
                return view;
            case 20:
                return new zc6((View) obj, 1);
            case 21:
                DividerAwareComponent dividerAwareComponent = new DividerAwareComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                dividerAwareComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, tje.v(dividerAwareComponent.getContext(), 0.5f)));
                return dividerAwareComponent;
            case 22:
                return new ca1((DividerAwareComponent) obj, i3);
            case 23:
                f.d((mnq0) obj);
                return zy11Var;
            case 24:
                f.d((mnq0) obj);
                return zy11Var;
            case 25:
                ViewGroup viewGroup = (ViewGroup) obj;
                DividerAwareComponent dividerAwareComponent2 = new DividerAwareComponent(viewGroup.getContext(), null, 0, 6, null);
                int r = tje.r(jtg0.detailed_price_block_divider_margin, viewGroup.getContext());
                dividerAwareComponent2.setPadding(dividerAwareComponent2.getPaddingLeft(), r, dividerAwareComponent2.getPaddingRight(), dividerAwareComponent2.getPaddingBottom());
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, r);
                dividerAwareComponent2.setLayoutParams(marginLayoutParams);
                return dividerAwareComponent2;
            case 26:
                CardDivider cardDivider = (CardDivider) obj;
                ca1 ca1Var = new ca1(cardDivider, 13);
                cardDivider.setTag(qoi0.a(b7o0.class));
                return ca1Var;
            case 27:
                return new t5r0((DividerAwareComponent) obj, 1);
            case 28:
                krVar = DivkitContentControllerFactory.get$lambda$0((Uri) obj);
                return krVar;
            default:
                return null;
        }
    }
}
