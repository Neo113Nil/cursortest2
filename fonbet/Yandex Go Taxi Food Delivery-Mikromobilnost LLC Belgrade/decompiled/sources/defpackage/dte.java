package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.a;
import java.util.HashMap;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes13.dex */
public final /* synthetic */ class dte implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ dte(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 1;
        a aVar = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).e = new dte(aVar, i2);
                g6d.a.getClass();
                ((agd) yfdVar).g = g6d.b;
                break;
            default:
                n3h n3hVar = aVar.I;
                o61 o61Var = aVar.J;
                ote oteVar = (ote) obj;
                if (!(oteVar instanceof kte)) {
                    if (!(oteVar instanceof lte)) {
                        if (!(oteVar instanceof nte)) {
                            if (!(oteVar instanceof mte)) {
                                if (oteVar instanceof jte) {
                                    aVar.r(new qu(9));
                                    break;
                                }
                            } else {
                                String str = ((mte) oteVar).a;
                                o61Var.getClass();
                                HashMap hashMap = new HashMap();
                                hashMap.put(Constants.DEEPLINK, str);
                                o61Var.a.a("B2BAccountFlow.HireDriverButton.Clicked", hashMap, 1, new HashMap());
                                n3hVar.a(Uri.parse(str), DeeplinkSource.UNSPECIFIED);
                                aVar.r(new qu(9));
                                break;
                            }
                        } else {
                            String str2 = ((nte) oteVar).a;
                            o61Var.getClass();
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(Constants.DEEPLINK, str2);
                            o61Var.a.a("B2BAccountFlow.RestoreAccessButton.Clicked", hashMap2, 1, new HashMap());
                            n3hVar.a(Uri.parse(str2), DeeplinkSource.UNSPECIFIED);
                            aVar.r(new qu(9));
                            break;
                        }
                    } else {
                        o61Var.getClass();
                        o61Var.a.a("B2BAccountFlow.EmployeeAccessInfoButton.Clicked", new HashMap(), 1, new HashMap());
                        aVar.A((m950) aVar.M.get(), ((lte) oteVar).a, sy60.Q2);
                        break;
                    }
                } else {
                    o61Var.getClass();
                    o61Var.a.a("B2BAccountFlow.AttachCompanyButton.Clicked", new HashMap(), 1, new HashMap());
                    aVar.r(new foc(18));
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
