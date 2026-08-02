package defpackage;

import androidx.compose.ui.semantics.f;
import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.clarify_address.a;
import com.yandex.go.navigator.navigation.e;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$FoundModalCloseReason;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$PhotoPickUpSourceScreen;
import com.yandex.go.pickup_from_photo.navigation.c;
import com.yandex.xplat.payment.sdk.AvailableMethods;
import com.yandex.xplat.payment.sdk.PaymentMethod;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.qr.api.QrReaderContentCameraPermission;
import com.ybsdk.feature.qr.api.QrReaderLogoImage;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderFragment;
import com.ybsdk.rconfig.configs.QrRulesErrorContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes13.dex */
public final /* synthetic */ class cbg0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ cbg0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        rbv entity$lambda$0;
        stz0 renderToolbarWithTsarButton$lambda$30;
        rbv onViewCreated$lambda$18$lambda$12$lambda$11;
        rbv imageModel$lambda$0;
        rbv entity$lambda$02;
        int i = this.a;
        int i2 = 28;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return new pbv((dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (tev) rev.o, (vfv) h2b1.G, (String) obj, false);
            case 1:
                return new pbv((String) obj, (ccv) null, rev.o, (dcv) null, (vfv) null, 58);
            case 2:
                entity$lambda$0 = QrReaderContentCameraPermission.toEntity$lambda$0((String) obj);
                return entity$lambda$0;
            case 3:
                renderToolbarWithTsarButton$lambda$30 = QrReaderFragment.renderToolbarWithTsarButton$lambda$30((stz0) obj);
                return renderToolbarWithTsarButton$lambda$30;
            case 4:
                onViewCreated$lambda$18$lambda$12$lambda$11 = QrReaderFragment.onViewCreated$lambda$18$lambda$12$lambda$11((String) obj);
                return onViewCreated$lambda$18$lambda$12$lambda$11;
            case 5:
                imageModel$lambda$0 = QrReaderLogoImage.toImageModel$lambda$0((String) obj);
                return imageModel$lambda$0;
            case 6:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 7:
                return new pbv((String) obj, (ccv) null, rev.m, (dcv) null, (vfv) null, 58);
            case 8:
                return ((Deeplink) obj).getParsedUri().toString();
            case 9:
                entity$lambda$02 = QrRulesErrorContent.toEntity$lambda$0((String) obj);
                return entity$lambda$02;
            case 10:
                ((f010) obj).getClass();
                return zy11Var;
            case 11:
                return ssa1.b(((wj1) obj).a);
            case 12:
                return ssa1.b(((wj1) obj).a);
            case 13:
                return new pbv((dcv) null, (dcv) null, (tev) rev.o, (vfv) h2b1.G, (String) obj, false);
            case 14:
                return new pbv((dcv) null, (dcv) null, (tev) rev.f, (vfv) h2b1.G, (String) obj, false);
            case 15:
                return new pbv((String) obj, new ccv(txg0.ybsdk_ic_yb_placeholder), rev.o, new ccv(txg0.ybsdk_ic_yb_placeholder), new ufv(5.0f, 5.0f, 5.0f, 5.0f, true), 32);
            case 16:
                return ((p530) obj).a;
            case 17:
                e.R(((ze50) obj).a);
                return zy11Var;
            case 18:
                f.q((mnq0) obj, true);
                return zy11Var;
            case 19:
                f.q((mnq0) obj, false);
                return zy11Var;
            case 20:
                x9i0 x9i0Var = (x9i0) obj;
                return new AvailableMethods(x9i0Var.d, x9i0Var.c, x9i0Var.b, xga1.f(x9i0Var, "sbp_qr"), xga1.f(x9i0Var, "sbp_token"), false);
            case 21:
                wj00 b = ((y3x) obj).b();
                String p = b.p(ACSPConstants.STATUS);
                Boolean f = b.f("google_pay_supported");
                boolean booleanValue = f != null ? f.booleanValue() : false;
                Boolean f2 = b.f("apple_pay_supported");
                boolean booleanValue2 = f2 != null ? f2.booleanValue() : false;
                List<y3x> arrayList = new ArrayList();
                List e = b.e("payment_methods");
                if (e != null) {
                    arrayList = e;
                }
                List arrayList2 = new ArrayList();
                List e2 = b.e("enabled_payment_methods");
                if (e2 != null) {
                    arrayList2 = e2;
                }
                ArrayList arrayList3 = new ArrayList();
                for (y3x y3xVar : arrayList) {
                    PaymentMethod.Companion.getClass();
                    arrayList3.add(mbb1.d(y3xVar, new bd90(13)).d());
                }
                ArrayList arrayList4 = new ArrayList();
                n53 n53Var = new n53(0);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    kyn kynVar = (kyn) mbb1.d((y3x) it.next(), new urm(i2)).d();
                    wj00 wj00Var = kynVar.b;
                    if (wj00Var != null) {
                        wj00Var.b.put("method", new ktu0(kynVar.a));
                        n53Var.b.add(wj00Var);
                    }
                    arrayList4.add(kynVar);
                }
                return new x9i0(p, booleanValue, booleanValue2, arrayList3, arrayList4, (String) it00.b.a.a.invoke(n53Var));
            case 22:
                cnb0 cnb0Var = ((anb0) obj).a;
                cnb0Var.I.d(pmb0.a, cnb0Var.J);
                return zy11Var;
            case 23:
                ((anb0) obj).a.r(new dia0(i2));
                return zy11Var;
            case 24:
                f.v((mnq0) obj);
                return zy11Var;
            case 25:
                mnq0 mnq0Var = (mnq0) obj;
                f.v(mnq0Var);
                f.w(mnq0Var, 0.0f);
                return zy11Var;
            case 26:
                mnq0 mnq0Var2 = (mnq0) obj;
                f.v(mnq0Var2);
                f.w(mnq0Var2, 2.0f);
                return zy11Var;
            case 27:
                c cVar = ((rob0) obj).a;
                cVar.G.d(PhotoPickUpAnalytics$FoundModalCloseReason.Map);
                ((a) cVar.K).c(true, AddressClarificationReason.Map);
                cVar.U();
                return zy11Var;
            case 28:
                c cVar2 = ((rob0) obj).a;
                cVar2.G.h(PhotoPickUpAnalytics$PhotoPickUpSourceScreen.FoundModal);
                cVar2.E((cnb0) cVar2.T.getValue(), zy11Var, new qob0(null, cVar2), hxx.a);
                return zy11Var;
            default:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
        }
    }
}
