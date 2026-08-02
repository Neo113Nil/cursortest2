package defpackage;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.text.selection.j;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.flows.payment.kit.api.widget.PaymentKitWidget;
import com.yandex.go.chargers.surge.info.d;
import com.yandex.go.masstransit.sdk.checkout.impl.checkout.a;
import com.yandex.messaging.ui.settings.contacts.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.circle_buttons.c;
import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.ThemeStyle;

/* loaded from: classes11.dex */
public final /* synthetic */ class j9a implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ j9a(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        sh5 stateManager;
        sh5 stateManager2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.w;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                iib1.a((y7a) obj5, (b8a) obj4, (v7a) obj3, (fid) obj, vng.O(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                sib1.a((ola) obj5, (tls) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                tib1.e((CharSequence) obj5, (List) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                uib1.a((nga) obj5, (sls) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                bjb1.a(vng.O(1), (fid) obj, (sls) obj4, (f530) obj3, (CharSequence) obj5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                djb1.f(vng.O(1), (pla) obj4, (fid) obj, (tls) obj3, (oip0) obj5);
                break;
            case 6:
                ((Integer) obj2).getClass();
                d.d((gwa) obj5, (tls) obj4, (oip0) obj3, (fid) obj, vng.O(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                glb1.a((f530) obj5, (xnb) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 8:
                a aVar = (a) obj5;
                xnb xnbVar = (xnb) obj4;
                xfd xfdVar = (xfd) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    sb2.b(tka0.a.a((PaymentKitWidget) aVar.M.f.getValue()), wwg.S(-281450221, true, new i9a(12, xnbVar, xfdVar), btsVar), btsVar, 48);
                    break;
                }
            case 9:
                ((Integer) obj2).getClass();
                c.d((ztb) obj5, (tls) obj4, (tls) obj3, (fid) obj, vng.O(433));
                break;
            case 10:
                ((Integer) obj2).getClass();
                fmb1.c((f530) obj5, (exb) obj4, (tls) obj3, (fid) obj, vng.O(7));
                break;
            case 11:
                ((Integer) obj2).getClass();
                fmb1.i((f530) obj5, (fxb) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ((b) obj5).d((yde) obj4, (vde) obj3, (fid) obj, vng.O(385));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ((b) obj5).e((yde) obj4, (tls) obj3, (fid) obj, vng.O(385));
                break;
            case 14:
                ((Integer) obj2).getClass();
                ((b) obj5).b((yde) obj4, (sls) obj3, (fid) obj, vng.O(385));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ((b) obj5).a(vng.O(385), (fid) obj, (sls) obj3, (tls) obj4);
                break;
            case 16:
                ((Integer) obj2).getClass();
                ohe.a((f530) obj5, (unb) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 17:
                ArrayList arrayList = (ArrayList) obj5;
                tls tlsVar = (tls) obj4;
                sls slsVar = (sls) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    boolean k = btsVar2.k(tlsVar) | btsVar2.k(slsVar);
                    Object Q = btsVar2.Q();
                    if (k || Q == did.a) {
                        Q = new yoe(tlsVar, slsVar, 0);
                        btsVar2.o0(Q);
                    }
                    urb1.a(arrayList, (tls) Q, btsVar2, 0);
                    break;
                }
                break;
            case 18:
                ((Integer) obj2).getClass();
                androidx.compose.foundation.text.c.b((f530) obj5, (j) obj4, (androidx.compose.runtime.internal.a) obj3, (fid) obj, vng.O(385));
                break;
            case 19:
                ((Integer) obj2).getClass();
                hg21.a((qrg) obj5, (tls) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 20:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj4;
                zgf zgfVar = (zgf) obj3;
                String str = (String) obj;
                String str2 = (String) obj2;
                Set<String> M0 = kotlin.collections.a.M0(((me1) ((sae) obj5).b).b.getStringSet(str2, new nj51(0).a));
                if (!M0.contains(str)) {
                    ref$BooleanRef.element = true;
                    M0.add(str);
                    ((SharedPreferences.Editor) zgfVar.b).putStringSet(str2, M0);
                    break;
                }
                break;
            case 21:
                ((Integer) obj2).getClass();
                ((w3i) obj5).a((qkg) obj4, (String) obj3, (fid) obj, vng.O(1));
                break;
            case 22:
                mai maiVar = (mai) obj5;
                qnh qnhVar = (qnh) obj4;
                pav pavVar = (pav) obj3;
                View inflate = ((LayoutInflater) obj).inflate(hqh0.item_delivery_block_requirements, (ViewGroup) obj2, false);
                if (inflate == null) {
                    ny61.t("rootView");
                    break;
                } else {
                    AutoDividerComponentList autoDividerComponentList = (AutoDividerComponentList) inflate;
                    break;
                }
            case 23:
                ((Integer) obj2).getClass();
                qti.b((hwy0) obj5, (ThemeStyle) obj4, (androidx.compose.runtime.internal.a) obj3, (fid) obj, vng.O(393));
                break;
            case 24:
                apf apfVar = (apf) obj5;
                ig5 ig5Var = (ig5) obj4;
                wm50 wm50Var = ((jh5) obj3).a;
                String str3 = (String) obj;
                String str4 = (String) obj2;
                z22 z22Var = (z22) apfVar.b;
                FlexAdapter flexAdapter = (FlexAdapter) apfVar.c;
                String str5 = str3 == null ? "" : str3;
                String str6 = str4 != null ? str4 : "";
                boolean z = str4 != null;
                String concat = gvu0.A0(10, str6).concat("***");
                StringBuilder sb = new StringBuilder("Отправка результата нативного челленджа: ");
                sb.append("user_success = " + z + Extension.FIX_SPACE);
                sb.append("data = " + str5 + Extension.FIX_SPACE);
                sb.append("signature = ".concat(concat));
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new sz5(str5, sb.toString(), concat, z));
                if (str4 != null && str3 != null) {
                    naj najVar = (naj) ig5Var;
                    List list = najVar.g;
                    List list2 = list;
                    if (list2 != null && !list2.isEmpty() && flexAdapter != null && (stateManager2 = flexAdapter.getStateManager()) != null) {
                        bia1.j(stateManager2, list, str4);
                    }
                    List list3 = najVar.e;
                    List list4 = list3;
                    if (list4 != null && !list4.isEmpty() && flexAdapter != null && (stateManager = flexAdapter.getStateManager()) != null) {
                        bia1.j(stateManager, list3, str3);
                    }
                    apfVar.A(najVar, !(str4.length() == 0));
                    vm50 vm50Var = najVar.f;
                    if (vm50Var != null) {
                        wm50Var.dispatch(vm50Var);
                        break;
                    }
                } else {
                    naj najVar2 = (naj) ig5Var;
                    apfVar.A(najVar2, false);
                    vm50 vm50Var2 = najVar2.f;
                    if (vm50Var2 != null) {
                        wm50Var.dispatch(vm50Var2);
                        break;
                    }
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                th91.c((f530) obj5, (x7a) obj4, (sls) obj3, (fid) obj, vng.O(65));
                break;
            case 26:
                ((Integer) obj2).getClass();
                uh91.a((uoj) obj5, (f530) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                com.yx360.design.compose.atoms.snackbar.a.b((String) obj5, (xsm) obj4, (ysm) obj3, (fid) obj, vng.O(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                ltm.a((qom) obj5, (xtm) obj4, (wls) obj3, (fid) obj, vng.O(1));
                break;
            default:
                String str7 = (String) obj;
                ((tum) ((wjm) obj5).c).a((sum) obj2, ((Map) obj4).get(str7), (fq90) obj3, str7);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ j9a(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}
