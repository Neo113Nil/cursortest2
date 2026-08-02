package defpackage;

import com.ybsdk.feature.pfm.internal.ui.b;
import java.util.LinkedHashMap;
import java.util.Set;
import ru.yandex.taxi.logistics.explicit_comment_courier.analytics.DeliveryExplicitCommentAnalytics$PopupButton;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.DeliveryExplicitCommentCourierFlowType;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.ShowAlertInteractor$AnalyticsTrigger;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.a;

/* loaded from: classes13.dex */
public final /* synthetic */ class dpf implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ dpf(boolean z, uu21 uu21Var, oz40 oz40Var, dur durVar, yur yurVar, sls slsVar) {
        this.a = 1;
        this.b = z;
        this.w = uu21Var;
        this.x = oz40Var;
        this.y = durVar;
        this.z = yurVar;
        this.c = slsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        boolean z = this.b;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.w;
        switch (i) {
            case 0:
                j4n j4nVar = (j4n) obj5;
                String str = (String) obj2;
                sls slsVar = (sls) obj;
                zch zchVar = (zch) j4nVar.w;
                zchVar.getClass();
                LinkedHashMap i2 = zch.i((akl0) obj4, (ShowAlertInteractor$AnalyticsTrigger) obj3);
                i2.put("button", DeliveryExplicitCommentAnalytics$PopupButton.CANCEL.getValue());
                zchVar.l("PersonalStatePopupSuggest.Tapped", i2);
                if (!z) {
                    z8i z8iVar = (z8i) ((a9i) j4nVar.z).get();
                    ((pep0) z8iVar.E.l).f(new wyo0(1, z8iVar), new r8i(str, DeliveryExplicitCommentCourierFlowType.REGULAR, ((t8i) j4nVar.a).c), hxx.a);
                    break;
                } else {
                    slsVar.invoke();
                    break;
                }
            case 1:
                uu21 uu21Var = (uu21) obj5;
                m3u0 m3u0Var = (m3u0) obj4;
                dur durVar = (dur) obj3;
                yur yurVar = (yur) obj2;
                sls slsVar2 = (sls) obj;
                if (z && uu21Var != null) {
                    if (((Boolean) m3u0Var.getValue()).booleanValue()) {
                        dur.b(durVar);
                    } else {
                        yur.b(yurVar);
                    }
                    slsVar2.invoke();
                    break;
                }
                break;
            case 2:
                b bVar = (b) obj5;
                String str2 = (String) obj2;
                Set set = (Set) obj4;
                Set set2 = (Set) obj3;
                String str3 = (String) obj;
                if (z) {
                    bVar.x0(str2, set, set2, str3);
                    break;
                }
                break;
            case 3:
                b bVar2 = (b) obj5;
                dbb0 dbb0Var = (dbb0) obj4;
                Set set3 = (Set) obj3;
                Set set4 = (Set) obj;
                String str4 = (String) obj2;
                if (z) {
                    bVar2.x0(((bbb0) dbb0Var).d, set3, set4, str4);
                    break;
                }
                break;
            default:
                a aVar = (a) obj5;
                a6o0 a6o0Var = (a6o0) obj4;
                CharSequence charSequence = (CharSequence) obj3;
                zzs zzsVar = (zzs) obj2;
                ScootersErrorCode scootersErrorCode = (ScootersErrorCode) obj;
                m950 m950Var = (m950) aVar.I.get();
                boolean z2 = this.b;
                aVar.D(m950Var, new k9n0(a6o0Var, charSequence, z2, zzsVar, scootersErrorCode), new han0(aVar, a6o0Var, charSequence, z2, zzsVar, scootersErrorCode));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ dpf(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        this.a = i;
        this.w = obj;
        this.x = obj2;
        this.y = obj3;
        this.b = z;
        this.z = obj4;
        this.c = obj5;
    }

    public /* synthetic */ dpf(boolean z, b bVar, dbb0 dbb0Var, Set set, Set set2, String str) {
        this.a = 3;
        this.b = z;
        this.w = bVar;
        this.x = dbb0Var;
        this.y = set;
        this.c = set2;
        this.z = str;
    }

    public /* synthetic */ dpf(boolean z, b bVar, String str, Set set, Set set2, String str2) {
        this.a = 2;
        this.b = z;
        this.w = bVar;
        this.z = str;
        this.x = set;
        this.y = set2;
        this.c = str2;
    }
}
