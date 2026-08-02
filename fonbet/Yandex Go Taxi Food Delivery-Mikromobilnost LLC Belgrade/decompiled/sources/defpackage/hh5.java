package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Bundle;
import android.util.Size;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersDiscountsButtonV2;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersDiscountsOpenReasonV2;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersDiscountsTabIdV2;
import com.yandex.go.chargers.discounts.api.ChargersDiscountsListEntryPoint;
import com.yandex.go.chargers.discounts.list.ui.ChargersDiscountsListUiState$Content$DiscountsTabType;
import com.yandex.go.chargers.offer.data.api.ChargersOfferKeyDto;
import com.yandex.go.chargers.order.active.ChargersActiveOrderModalView;
import com.yandex.payment.sdk.core.camerascanner.CardScanData;
import com.yandex.payment.sdk.core.camerascanner.CardScannerError;
import com.yandex.payment.sdk.ui.CardInput$State;
import com.yandex.payment.sdk.ui.bind.BindCardActivity;
import com.yandex.payment.sdk.ui.view.Default3DSWebView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ru.yandex.logistics.care.ui.n;

/* loaded from: classes4.dex */
public final class hh5 implements c190, b88, on8, r89, mlr, hqs, i88, vs7, wda, f3u {
    public final /* synthetic */ int a;
    public final Object b;

    public hh5(dne0 dne0Var) {
        this.a = 21;
        this.b = dne0Var.a("ru.yandex.taxi.cashback.onboarding.CASHBACK_TOOLTIP_PREFERENCES");
    }

    public static void g(hh5 hh5Var, ChargersAnalytics$ChargersDiscountsButtonV2 chargersAnalytics$ChargersDiscountsButtonV2, String str, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        em9 em9Var = (em9) hh5Var.b;
        String str2 = (chargersAnalytics$ChargersDiscountsButtonV2 == ChargersAnalytics$ChargersDiscountsButtonV2.DiscountDetails || chargersAnalytics$ChargersDiscountsButtonV2 == ChargersAnalytics$ChargersDiscountsButtonV2.CumulativeDiscount) ? str : null;
        String str3 = chargersAnalytics$ChargersDiscountsButtonV2 == ChargersAnalytics$ChargersDiscountsButtonV2.DiscountToggle ? str : null;
        HashMap w = b64.w(em9Var);
        w.put("button", chargersAnalytics$ChargersDiscountsButtonV2.getEventValue());
        if (str2 != null) {
            w.put("tapped_discount_id", str2);
        }
        if (str3 != null) {
            w.put("enabled_discount_id", str3);
        }
        em9Var.a.a("Chargers.DiscountsAndPromocodes.Tapped", w, 2, new HashMap());
    }

    @Override // defpackage.f3u
    public Iterator D() {
        return ((Iterable) this.b).iterator();
    }

    @Override // defpackage.wda
    public void a(uda udaVar) {
        ((ChargersActiveOrderModalView) this.b).onTabChanged(udaVar);
    }

    @Override // defpackage.on8
    public void b(nn8 nn8Var) {
        ((qu5) this.b).l.l(nn8Var);
    }

    @Override // defpackage.r89
    public void c() {
        n891.n(new l95(20, this));
    }

    @Override // defpackage.b88
    public void d(Context context, qq31 qq31Var) {
        qq31Var.invoke(new Default3DSWebView(context, ((pwf) ((BindCardActivity) this.b).getBaseComponent$paymentsdk_release()).c()));
    }

    public void e(ChargersDiscountsListEntryPoint chargersDiscountsListEntryPoint, String str, ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType, boolean z, List list, String str2, String str3, LinkedHashMap linkedHashMap) {
        ChargersAnalytics$ChargersDiscountsOpenReasonV2 chargersAnalytics$ChargersDiscountsOpenReasonV2;
        ChargersAnalytics$ChargersDiscountsTabIdV2 chargersAnalytics$ChargersDiscountsTabIdV2;
        em9 em9Var = (em9) this.b;
        int i = fu9.a[chargersDiscountsListEntryPoint.ordinal()];
        if (i == 1) {
            chargersAnalytics$ChargersDiscountsOpenReasonV2 = ChargersAnalytics$ChargersDiscountsOpenReasonV2.Discovery;
        } else if (i == 2) {
            chargersAnalytics$ChargersDiscountsOpenReasonV2 = ChargersAnalytics$ChargersDiscountsOpenReasonV2.Offer;
        } else if (i == 3) {
            chargersAnalytics$ChargersDiscountsOpenReasonV2 = ChargersAnalytics$ChargersDiscountsOpenReasonV2.Deeplink;
        } else if (i == 4) {
            chargersAnalytics$ChargersDiscountsOpenReasonV2 = ChargersAnalytics$ChargersDiscountsOpenReasonV2.Feedback;
        } else {
            if (i != 5) {
                w511.b();
                return;
            }
            chargersAnalytics$ChargersDiscountsOpenReasonV2 = ChargersAnalytics$ChargersDiscountsOpenReasonV2.MainScreenOfferNotch;
        }
        int i2 = chargersDiscountsListUiState$Content$DiscountsTabType == null ? -1 : fu9.b[chargersDiscountsListUiState$Content$DiscountsTabType.ordinal()];
        if (i2 == -1) {
            chargersAnalytics$ChargersDiscountsTabIdV2 = null;
        } else if (i2 == 1) {
            chargersAnalytics$ChargersDiscountsTabIdV2 = ChargersAnalytics$ChargersDiscountsTabIdV2.Rental;
        } else if (i2 == 2) {
            chargersAnalytics$ChargersDiscountsTabIdV2 = ChargersAnalytics$ChargersDiscountsTabIdV2.Partners;
        } else {
            if (i2 != 3) {
                w511.b();
                return;
            }
            chargersAnalytics$ChargersDiscountsTabIdV2 = ChargersAnalytics$ChargersDiscountsTabIdV2.Tasks;
        }
        HashMap w = b64.w(em9Var);
        w.put("open_reason", chargersAnalytics$ChargersDiscountsOpenReasonV2.getEventValue());
        w.put("trace_id", str);
        if (str2 != null) {
            w.put("deeplink_value", str2);
        }
        if (chargersAnalytics$ChargersDiscountsTabIdV2 != null) {
            w.put("tab_id", chargersAnalytics$ChargersDiscountsTabIdV2.getEventValue());
        }
        w.put("limit_exceeded", Boolean.valueOf(z));
        w.put("discount_id", list);
        if (str3 != null) {
            w.put("cumulative_discount", str3);
        }
        if (linkedHashMap != null) {
            w.put("task_state", linkedHashMap);
        }
        em9Var.a.a("Chargers.DiscountsAndPromocodes.Shown", w, 3, new HashMap());
    }

    @Override // defpackage.vs7
    public void f(CardScanData cardScanData) {
        mh8 mh8Var = (mh8) this.b;
        CardInput$State cardInput$State = mh8Var.c;
        if (cardInput$State == CardInput$State.CARD_NUMBER || cardInput$State == CardInput$State.CARD_NUMBER_VALID) {
            mh8Var.d.setExternalPreparedNumber(cardScanData.getPan());
        }
    }

    @Override // defpackage.vs7
    public void h(CardScannerError cardScannerError) {
    }

    public iib i() {
        a2w a2wVar = (a2w) ((b2w) this.b).b.a.getValue();
        return new iib(a2wVar.a, a2wVar.b);
    }

    public void j(tb9 tb9Var, boolean z) {
        pj pjVar = (pj) this.b;
        String str = tb9Var.a;
        String str2 = tb9Var.b;
        String str3 = z ? "success" : "failed";
        String analyticName = tb9Var.c.getAnalyticName();
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("order_id", str);
        }
        if (str2 != null) {
            hashMap.put("change_id", str2);
        }
        hashMap.put(TarifficatorScenarioActivity.RESULT_KEY, str3);
        if (analyticName != null) {
            hashMap.put("source", analyticName);
        }
        pjVar.a.a("ChangeOrderPolling.Result", hashMap, 1, new HashMap());
    }

    public void k(tb9 tb9Var) {
        pj pjVar = (pj) this.b;
        String str = tb9Var.a;
        String str2 = tb9Var.b;
        String analyticName = tb9Var.c.getAnalyticName();
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("order_id", str);
        }
        if (str2 != null) {
            hashMap.put("change_id", str2);
        }
        if (analyticName != null) {
            hashMap.put("source", analyticName);
        }
        pjVar.a.a("ChangeOrderPolling.Start", hashMap, 1, new HashMap());
    }

    @Override // defpackage.r89
    public void l(wx90 wx90Var) {
    }

    @Override // defpackage.mlr
    public void m(Object obj, String str) {
        Bundle bundle = (Bundle) this.b;
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Bundle) {
            bundle.putBundle(str, (Bundle) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        } else {
            bundle.putString(str, String.valueOf(obj));
        }
    }

    public void n(no7 no7Var) {
        ye0 oq8Var;
        n nVar = (n) this.b;
        if (no7Var instanceof do7) {
            do7 do7Var = (do7) no7Var;
            oq8Var = new nq8(do7Var.a, do7Var.b, jzz.f(do7Var.c));
        } else if (no7Var instanceof mo7) {
            mo7 mo7Var = (mo7) no7Var;
            oq8Var = new lq8(mo7Var.a, mo7Var.e, mo7Var.b, jzz.f(mo7Var.c), mo7Var.d);
        } else if (no7Var instanceof fo7) {
            fo7 fo7Var = (fo7) no7Var;
            oq8Var = new pq8(fo7Var.a, fo7Var.b, jzz.f(fo7Var.c));
        } else if (no7Var instanceof eo7) {
            eo7 eo7Var = (eo7) no7Var;
            oq8Var = new eq8(eo7Var.a, eo7Var.b, jzz.f(eo7Var.c));
        } else if (no7Var instanceof ho7) {
            ho7 ho7Var = (ho7) no7Var;
            oq8Var = new fq8(ho7Var.a, ho7Var.b, jzz.f(ho7Var.c));
        } else if (no7Var instanceof ko7) {
            ko7 ko7Var = (ko7) no7Var;
            oq8Var = new ir8(ko7Var.a, ko7Var.b, jzz.f(ko7Var.c));
        } else if (no7Var instanceof lo7) {
            lo7 lo7Var = (lo7) no7Var;
            oq8Var = new iq8(lo7Var.a, lo7Var.b, jzz.f(lo7Var.c));
        } else if (no7Var instanceof io7) {
            io7 io7Var = (io7) no7Var;
            oq8Var = new kq8(io7Var.a, io7Var.b, jzz.f(io7Var.c));
        } else if (no7Var instanceof go7) {
            go7 go7Var = (go7) no7Var;
            oq8Var = new qq8(go7Var.a, go7Var.b, jzz.f(go7Var.c));
        } else if (!(no7Var instanceof jo7)) {
            w511.b();
            return;
        } else {
            jo7 jo7Var = (jo7) no7Var;
            oq8Var = new oq8(jo7Var.a, jo7Var.b, jzz.f(jo7Var.c));
        }
        nVar.e.k(oq8Var);
    }

    @Override // defpackage.vs7
    public void onCancel() {
    }

    @Override // defpackage.hqs
    public void onFailure(Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 12:
                czj0.a((wrb0) obj, th);
                break;
            default:
                czj0.a((wrb0) obj, th);
                break;
        }
    }

    @Override // defpackage.hqs
    public void onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 12:
                czj0.b(null, (wrb0) obj2);
                break;
            default:
                czj0.b(null, (wrb0) obj2);
                break;
        }
    }

    @Override // defpackage.f3u
    public Object q(Object obj) {
        return (ChargersOfferKeyDto) obj;
    }

    @Override // defpackage.r89
    public void s(anh anhVar) {
        n891.n(new lu5(4, this, anhVar));
    }

    public String toString() {
        switch (this.a) {
            case 14:
                return "aspect ratio: -1 resolution: " + ((Size) this.b);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.mlr
    public Object w(String str) {
        Object obj = ((Bundle) this.b).get(str);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public /* synthetic */ hh5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public hh5(CameraCaptureSession cameraCaptureSession) {
        this.a = 11;
        cameraCaptureSession.getClass();
        this.b = cameraCaptureSession;
    }

    public hh5(Size size) {
        this.a = 14;
        size.getClass();
        this.b = size;
    }
}
