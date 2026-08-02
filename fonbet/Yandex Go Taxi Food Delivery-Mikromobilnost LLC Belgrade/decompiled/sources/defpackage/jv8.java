package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.animation.e;
import androidx.compose.animation.i;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.yb.analytics.ChangeToYbWalletAnalytics$Button;
import com.ybsdk.feature.cashback.impl.entities.CashbackSelectorCategoryEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items.b;

/* loaded from: classes3.dex */
public final /* synthetic */ class jv8 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ jv8(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        rbv image$lambda$0;
        int i = 4;
        switch (this.a) {
            case 0:
                ((nyh) obj).a();
                return zy11.a;
            case 1:
                return zy11.a;
            case 2:
                int i2 = b.a;
                return zy11.a;
            case 3:
                return new pbv((String) obj, (ccv) null, rev.m, new ccv(ayg0.ybsdk_cashback_item_placeholder), (vfv) null, 50);
            case 4:
                ccv ccvVar = new ccv(vxg0.ybsdk_account_placeholder_gray);
                rev revVar = rev.o;
                return new pbv((dcv) ccvVar, (dcv) new ccv(vxg0.ybsdk_account_placeholder_gray), (tev) revVar, (vfv) h2b1.G, (String) obj, false);
            case 5:
                return new pbv((String) obj, (ccv) null, rev.h, new ccv(ayg0.ybsdk_ic_cashback_icon), (vfv) null, 50);
            case 6:
                image$lambda$0 = CashbackSelectorCategoryEntity.image$lambda$0((String) obj);
                return image$lambda$0;
            case 7:
                return new pbv((String) obj, (ccv) null, rev.n, (dcv) null, (vfv) null, 58);
            case 8:
                return new pbv((String) obj, (ccv) null, rev.n, (dcv) null, (vfv) null, 58);
            case 9:
                return new pbv((String) obj, (ccv) null, rev.n, (dcv) null, (vfv) null, 58);
            case 10:
                wj00 b = ((y3x) obj).b();
                String p = b.p("method");
                String p2 = b.p("redirect_url");
                List e = b.e("trusted_urls");
                ArrayList arrayList = new ArrayList();
                if (e != null) {
                    Iterator it = ((ArrayList) e).iterator();
                    while (it.hasNext()) {
                        tyj0 d = mbb1.d((y3x) it.next(), new of11(i));
                        if (d.c()) {
                            arrayList.add(d.a());
                        }
                    }
                }
                return new p89(p, p2, arrayList);
            case 11:
                y3x y3xVar = (y3x) obj;
                return new s89(y3xVar.b().p("method"), y3xVar.b().o("digits"), y3xVar.b().p("card_system"), y3xVar.b().p("card_suffix"));
            case 12:
                wj00 b2 = ((y3x) obj).b();
                return new u89(b2.p("method"), b2.p("verification_id"), b2.p("authorize_currency"), b2.h("authorize_amount_format"), b2.p("binding_id"));
            case 13:
                wj00 b3 = ((y3x) obj).b();
                return new v89(b3.p("method"), b3.p("url"));
            case 14:
                wj00 b4 = ((y3x) obj).b();
                return new w89(b4.p("method"), b4.p("form_url"), b4.p("qrc_id"));
            case 15:
                wj00 b5 = ((y3x) obj).b();
                return new x89(b5.p("method"), b5.p("verification_id"), b5.h("masked_phone_for_sms"), b5.h("deny_resend_until"), b5.p("binding_id"));
            case 16:
                wj00 b6 = ((y3x) obj).b();
                String p3 = b6.p("method");
                String p4 = b6.p("web_url");
                List e2 = b6.e("trusted_urls");
                ArrayList arrayList2 = new ArrayList();
                if (e2 != null) {
                    Iterator it2 = ((ArrayList) e2).iterator();
                    while (it2.hasNext()) {
                        tyj0 d2 = mbb1.d((y3x) it2.next(), new of11(i));
                        if (d2.c()) {
                            arrayList2.add(d2.a());
                        }
                    }
                }
                return new y89(p3, p4, arrayList2);
            case 17:
                return UUID.randomUUID().toString();
            case 18:
                return ((TaxiOrder) obj).i.e();
            case 19:
                return ((ChangeToYbWalletAnalytics$Button) obj).getButtonName();
            case 20:
                return new TextView((Context) obj);
            case 21:
                ((TextView) obj).setText("");
                return zy11.a;
            case 22:
                return hi91.d((f530) obj, false, null, 3);
            case 23:
                ((mda) obj).a.r(new ew9(25));
                return zy11.a;
            case 24:
                ((mda) obj).a.r(new ew9(26));
                return zy11.a;
            case 25:
                ((mda) obj).a.r(new ew9(24));
                return zy11.a;
            case 26:
                ((rur) obj).b(false);
                return zy11.a;
            case 27:
                i iVar = new i(v2o.a, ymo.a);
                ujs0 ujs0Var = new ujs0(false, new mq5(18));
                ((e) obj).getClass();
                iVar.d = ujs0Var;
                return iVar;
            case 28:
                return qoi0.a(((dw9) obj).getClass());
            default:
                kw9 kw9Var = (kw9) obj;
                lw9 lw9Var = kw9Var.a;
                lw9Var.j(dpb.a);
                lw9Var.Q(kw9Var.b, true);
                return zy11.a;
        }
    }
}
