package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.f;
import androidx.compose.ui.tooling.ComposeViewAdapter;
import com.yandex.go.chargers.offer.ui.compose.ui.component.a;
import com.yandex.go.chargers.subscription.presentation.landing.c;
import com.yandex.go.chargers.surge.info.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.boj0;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.lhg;
import defpackage.oz40;
import defpackage.pw91;
import defpackage.qkg;
import defpackage.tgg;
import defpackage.wls;
import defpackage.zrb1;
import defpackage.zy11;
import kotlin.jvm.internal.Ref$IntRef;
import ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.e;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes11.dex */
public final /* synthetic */ class i9a implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i9a(tls tlsVar, unb unbVar) {
        this.a = 28;
        this.b = tlsVar;
        this.c = unbVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 WrapPreview$lambda$0;
        int i = this.a;
        o430 o430Var = did.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.a((vr60) obj4, (tls) obj3, (fid) obj, vng.O(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                nib1.a((gea) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                oib1.b((wea) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                oib1.c((vea) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                u691.d((ffa) obj4, (f530) obj3, (fid) obj, vng.O(49));
                break;
            case 5:
                ((Integer) obj2).getClass();
                qib1.b((iga) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                cjb1.a((qja) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                c.c((yta) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                mjb1.a((wua) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                d.a((gwa) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                njb1.a((qxa) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                gkb1.c((CharSequence) obj4, (tn9) obj3, (fid) obj, vng.O(1));
                break;
            case 12:
                xnb xnbVar = (xnb) obj4;
                xfd xfdVar = (xfd) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    glb1.a(null, xnbVar, ((bgd) xfdVar).a, btsVar, 0);
                    break;
                }
            case 13:
                ((Integer) obj2).getClass();
                m791.a((hob) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                m791.f((ypu) obj4, (ovi0) obj3, (fid) obj, vng.O(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                m791.c((lpb) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 16:
                final boj0 boj0Var = (boj0) obj4;
                final e eVar = (e) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    qti.a((hwy0) boj0Var.x, wwg.S(-1674530219, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj5, Object obj6) {
                            fid fidVar3 = (fid) obj5;
                            int intValue3 = ((Integer) obj6).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                oz40 b = f.b(e.this.z, btsVar3);
                                boj0 boj0Var2 = boj0Var;
                                tgg tggVar = (tgg) boj0Var2.y;
                                qkg qkgVar = (qkg) b.getValue();
                                f530 u = pw91.u(androidx.compose.ui.input.nestedscroll.b.a(c530.a, zrb1.f(btsVar3), null), pw91.o(btsVar3), 14);
                                lhg lhgVar = (lhg) boj0Var2.w;
                                boolean e = btsVar3.e(lhgVar);
                                Object Q = btsVar3.Q();
                                if (e || Q == did.a) {
                                    ChooseProfile$getView$1$1$1$1$1$1$1 chooseProfile$getView$1$1$1$1$1$1$1 = new ChooseProfile$getView$1$1$1$1$1$1$1(2, lhgVar, lhg.class, "onShown", "onShown(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", 0);
                                    btsVar3.o0(chooseProfile$getView$1$1$1$1$1$1$1);
                                    Q = chooseProfile$getView$1$1$1$1$1$1$1;
                                }
                                tggVar.a(qkgVar, u, 6.0f, 0L, true, false, (wls) Q, btsVar3, 16802176, 40);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar2), btsVar2, 56);
                    break;
                }
            case 17:
                ((Integer) obj2).getClass();
                fmb1.a((dxb) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 18:
                fxb fxbVar = (fxb) obj4;
                tls tlsVar = (tls) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    gz6 gz6Var = new gz6(fxbVar.d, fxbVar.c);
                    boolean k = btsVar3.k(tlsVar);
                    Object Q = btsVar3.Q();
                    if (k || Q == o430Var) {
                        Q = new fv9(20, tlsVar);
                        btsVar3.o0(Q);
                    }
                    d17.d(null, false, null, gz6Var, null, (sls) Q, wwg.S(1173055155, true, new ywb(fxbVar, r6 ? 1 : 0), btsVar3), btsVar3, 1572864, 23);
                    break;
                }
            case 19:
                yxb yxbVar = (yxb) obj4;
                tls tlsVar2 = (tls) obj3;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    btsVar4.Y();
                    break;
                } else {
                    pvi0 b = mja1.b(yxbVar.f, new jfv(AppColor$Palette.Text), 4);
                    String str = yxbVar.g;
                    boolean k2 = btsVar4.k(tlsVar2);
                    Object Q2 = btsVar4.Q();
                    if (k2 || Q2 == o430Var) {
                        Q2 = new fv9(26, tlsVar2);
                        btsVar4.o0(Q2);
                    }
                    gmb1.b(null, b, str, (sls) Q2, btsVar4, 0);
                    break;
                }
            case 20:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj3;
                int i2 = ref$IntRef.element;
                ref$IntRef.element = i2 + 1;
                ((fse[]) obj4)[i2] = (dse) obj2;
                break;
            case 21:
                pav pavVar = (pav) obj4;
                vqb vqbVar = (vqb) obj3;
                View inflate = ((LayoutInflater) obj).inflate(ruh0.complaint_item, (ViewGroup) obj2, false);
                GoLinearLayout goLinearLayout = (GoLinearLayout) inflate;
                int i3 = l6h0.complaint_text;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, inflate);
                if (robotoTextView != null) {
                    i3 = l6h0.complaint_trailing_image;
                    GoImageView goImageView = (GoImageView) cma1.O(i3, inflate);
                    if (goImageView != null) {
                        break;
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                break;
            case 22:
                tdj0 tdj0Var = (tdj0) obj4;
                f530 f530Var = (f530) obj3;
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                uad uadVar = uad.a;
                bts btsVar5 = (bts) fidVar5;
                if (!btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    btsVar5.Y();
                    break;
                } else {
                    au2 au2Var = tdj0Var.b;
                    if (au2Var != null) {
                        btsVar5.e0(662461597);
                        sya1.a(au2Var, f530Var, null, tdj0Var.c, btsVar5, 48, 4);
                        btsVar5.t(false);
                        break;
                    } else {
                        btsVar5.e0(662461596);
                        btsVar5.t(false);
                        break;
                    }
                }
            case 23:
                ((Integer) obj2).getClass();
                rhd.a((pey) obj4, (wls) obj3, (fid) obj, vng.O(1));
                break;
            case 24:
                WrapPreview$lambda$0 = ComposeViewAdapter.WrapPreview$lambda$0((ComposeViewAdapter) obj4, (wls) obj3, (fid) obj, ((Integer) obj2).intValue());
                break;
            case 25:
                ((Integer) obj2).getClass();
                ppb1.a((evd) obj4, (sls) obj3, (fid) obj, vng.O(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                com.yandex.messaging.ui.main.telemessenger.connection.a.b((Integer) obj4, (ysm) obj3, (fid) obj, vng.O(1));
                break;
            case 27:
                String str2 = (String) obj4;
                oae oaeVar = (oae) obj3;
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (!btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    btsVar6.Y();
                    break;
                } else {
                    cib1.d(str2, null, oaeVar.f, null, 0, 0, btsVar6, 0, 58);
                    break;
                }
            case 28:
                tls tlsVar3 = (tls) obj3;
                unb unbVar = (unb) obj4;
                fid fidVar7 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (!btsVar7.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    btsVar7.Y();
                    break;
                } else {
                    boolean k3 = btsVar7.k(tlsVar3) | btsVar7.e(unbVar);
                    Object Q3 = btsVar7.Q();
                    if (k3 || Q3 == o430Var) {
                        Q3 = new jhd(11, tlsVar3, unbVar);
                        btsVar7.o0(Q3);
                    }
                    xqb1.b(null, (sls) Q3, btsVar7, 0, 1);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                ((zje) obj4).a((yje) obj3, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ i9a(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ i9a(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = obj2;
    }
}
