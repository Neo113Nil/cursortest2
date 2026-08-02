package defpackage;

import android.net.Uri;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.drive.DriveSdkExperiment;
import com.yandex.go.drive.sdkintegration.domain.session.e;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.settings.email.a;
import ru.yandex.taxi.settings.main.k;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes14.dex */
public final class gn10 {
    public final h3y a;
    public final h3y b;
    public final as21 c;
    public final h3y d;
    public final h3y e;
    public final a f;
    public final h3y g;
    public final h3y h;
    public final h3y i;
    public final e j;
    public final zuj0 k;

    public gn10(h3y h3yVar, h3y h3yVar2, as21 as21Var, h3y h3yVar3, h3y h3yVar4, a aVar, h3y h3yVar5, h3y h3yVar6, h3y h3yVar7, e eVar, zuj0 zuj0Var) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = as21Var;
        this.d = h3yVar3;
        this.e = h3yVar4;
        this.f = aVar;
        this.g = h3yVar5;
        this.h = h3yVar6;
        this.i = h3yVar7;
        this.j = eVar;
        this.k = zuj0Var;
    }

    public final UiWebViewConfig a(String str, boolean z) {
        String c;
        String c2;
        oud a;
        List W;
        List list;
        h3y h3yVar = this.g;
        a aVar = this.f;
        if ((str == null || str.length() == 0) && ((c = ((h15) this.a.get()).b.c("LAST_KNOWN_SUPPORT_URL")) == null || evu0.J(c))) {
            return null;
        }
        if (str == null || str.length() == 0) {
            c2 = this.c.c("LAST_KNOWN_SUPPORT_URL");
            if (c2 == null) {
                c2 = "";
            }
        } else {
            c2 = str;
        }
        Uri parse = Uri.parse(c2);
        yu41 yu41Var = (yu41) this.d.get();
        yu41Var.getClass();
        xu41 xu41Var = new xu41(yu41Var, c2);
        xu41Var.b();
        xu41Var.c(FinishFlowStatus.ORDER_ID_FIELD_NAME);
        Uri.Builder a2 = xu41Var.a();
        otr0.c(a2, ((h) this.e.get()).Ig(), aVar.c(), ((k) h3yVar.get()).h, ((Number) aVar.f.getValue(aVar, a.i[0])).intValue() == 1);
        ((kfu) this.b.get()).getClass();
        a2.appendQueryParameter("helpType", "Yandex");
        zzs zzsVar = ((k) h3yVar.get()).i;
        if (zzsVar != null) {
            a2.appendQueryParameter("lon", String.valueOf(zzsVar.b));
            a2.appendQueryParameter("lat", String.valueOf(zzsVar.a));
        }
        kmf0 kmf0Var = (kmf0) this.h.get();
        synchronized (kmf0Var) {
            a = kmf0Var.a.a();
        }
        String str2 = a.a;
        if (str2 != null && str2.length() != 0) {
            a2.appendQueryParameter("promoCode", str2);
            a2.appendQueryParameter("couponCheckValid", String.valueOf(a.b));
            Boolean bool = a.c;
            if (bool != null) {
                a2.appendQueryParameter("couponCheckValidAny", String.valueOf(bool.booleanValue()));
            }
        }
        String b = ((g) this.i.get()).b();
        boolean z2 = (b == null || b.length() == 0) ? false : true;
        boolean equals = "http".equals(parse.getScheme());
        if (z2 && equals) {
            jst.e.k(new IllegalStateException("Insecure url scheme"), "Got http url scheme for support url to send oauth token");
        }
        if (z) {
            a2.appendQueryParameter("forceChat", "true");
        }
        e eVar = this.j;
        boolean z3 = ((DriveSdkExperiment) eVar.b.a.c()).b;
        jnt jntVar = (jnt) ((r0) eVar.b()).getValue();
        boolean z4 = (jntVar == null || jntVar.a.isEmpty()) ? false : true;
        if (z3 && z4) {
            String queryParameter = parse.getQueryParameter("services");
            if (queryParameter == null) {
                a2.appendQueryParameter("services", TariffOrderFlow.ORDER_FLOW_DRIVE_KEY);
            } else {
                W = evu0.W(queryParameter, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
                if (!W.isEmpty()) {
                    ListIterator listIterator = W.listIterator(W.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            list = kotlin.collections.a.A0(W, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list = EmptyList.a;
                if (!list.contains(TariffOrderFlow.ORDER_FLOW_DRIVE_KEY)) {
                    String encodedQuery = a2.build().getEncodedQuery();
                    String str3 = encodedQuery != null ? encodedQuery : "";
                    String concat = "services=".concat(queryParameter);
                    a2.encodedQuery(cvu0.v(str3, concat, concat.concat(",drive"), false));
                }
            }
        }
        String uri = a2.build().toString();
        String h = ((avj0) this.k).h(kyh0.feedback_title);
        CoreWebViewConfig.Companion.getClass();
        CoreWebViewConfig.a aVar2 = new CoreWebViewConfig.a();
        aVar2.b = uri;
        aVar2.c = b;
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar2.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig.setHasTitleFromWeb(true);
        uiWebViewConfig.setTitle(h);
        uiWebViewConfig.setBusinessName(null);
        uiWebViewConfig.setShouldSupportChat(z);
        return uiWebViewConfig;
    }
}
