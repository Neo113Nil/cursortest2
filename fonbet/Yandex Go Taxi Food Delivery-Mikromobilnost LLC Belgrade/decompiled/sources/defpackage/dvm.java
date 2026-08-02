package defpackage;

import com.yandex.go.due.api.analytics.model.DueAnalyticOrigin;
import com.yandex.go.due.api.analytics.model.DueAnalyticViewType;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import kotlin.a;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes12.dex */
public final class dvm {
    public final wiq0 a;
    public final x770 b;
    public final xcv0 c;
    public final i3y d;

    public dvm(wiq0 wiq0Var, x770 x770Var, xcv0 xcv0Var) {
        this.a = wiq0Var;
        this.b = x770Var;
        this.c = xcv0Var;
        new w53(1);
        this.d = a.a(new ktm(6));
    }

    public final void a(String str, DueAnalyticViewType dueAnalyticViewType, Calendar calendar, ye0 ye0Var, DueAnalyticOrigin dueAnalyticOrigin) {
        String str2 = ye0Var.a;
        String value = dueAnalyticViewType.getValue();
        String format = ((SimpleDateFormat) this.d.getValue()).format(calendar.getTime());
        String value2 = dueAnalyticOrigin.getValue();
        pex0 m = ((k) this.a).m();
        String str3 = m != null ? m.b : null;
        HashMap hashMap = new HashMap();
        if (str3 != null) {
            hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str3);
        }
        hashMap.put("action", str2);
        hashMap.put("context", str);
        hashMap.put("view_type", value);
        this.b.a.a("Preorder.DoneButtonTapped", hashMap, 1, x4e.q(hashMap, RemoteBioParameters.TIME, format, "open_origin", value2));
    }

    public final void b(String str, DueAnalyticViewType dueAnalyticViewType) {
        String value = dueAnalyticViewType.getValue();
        pex0 m = ((k) this.a).m();
        String str2 = m != null ? m.b : null;
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str2);
        }
        this.b.a.a("Preorder.CardClosed", hashMap, 1, x4e.q(hashMap, "context", str, "view_type", value));
    }

    public final void c(String str, DueAnalyticViewType dueAnalyticViewType, DueAnalyticOrigin dueAnalyticOrigin) {
        String value = dueAnalyticViewType.getValue();
        String value2 = dueAnalyticOrigin.getValue();
        pex0 m = ((k) this.a).m();
        String str2 = m != null ? m.b : null;
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str2);
        }
        hashMap.put("context", str);
        this.b.a.a("Preorder.CardShown", hashMap, 1, x4e.q(hashMap, "view_type", value, "open_origin", value2));
    }

    public final void d(DueAnalyticViewType dueAnalyticViewType, boolean z, Calendar calendar, Double d) {
        Date time;
        String value = dueAnalyticViewType.getValue();
        pex0 m = ((k) this.a).m();
        String str = m != null ? m.b : null;
        Boolean bool = Boolean.TRUE;
        if (!z) {
            bool = null;
        }
        String format = z ? null : (calendar == null || (time = calendar.getTime()) == null) ? null : ((SimpleDateFormat) this.d.getValue()).format(time);
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
        }
        hashMap.put("view_type", value);
        if (bool != null) {
            hashMap.put("is_ondemand", bool);
        }
        if (format != null) {
            hashMap.put(RemoteBioParameters.TIME, format);
        }
        if (d != null) {
            hashMap.put("price", d);
        }
        this.b.a.a("Preorder.TimeSelected", hashMap, 1, new HashMap());
    }
}
