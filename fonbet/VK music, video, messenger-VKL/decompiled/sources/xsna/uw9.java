package xsna;

import android.content.Context;
import com.vk.api.generated.notifications.dto.NotificationsEditRedesignSettingResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsEditRedesignSettingsSectionSettingsIdDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingOptionsDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.pushes.NotificationUtils;
import com.vk.stat.scheme.CommonMarketStat$TypeAutofillInfo;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketViewCheckout;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import xsna.aw9;
import xsna.cf70;
import xsna.hzp0;
import xsna.px9;
import xsna.vzi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class uw9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ uw9(Object obj, boolean z, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
        this.e = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                mzp0 mzp0Var = (mzp0) this.d;
                vw9 vw9Var = (vw9) this.e;
                Throwable th = (Throwable) obj;
                L.i(th);
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                if (!this.c) {
                    vw9Var.T(new px9.e.c(th));
                }
                return s3q0.a;
            case 1:
                w8c w8cVar = (w8c) this.d;
                z4c z4cVar = (z4c) this.e;
                com.vk.ecomm.cart.impl.checkout.feature.state.f fVar = (com.vk.ecomm.cart.impl.checkout.feature.state.f) obj;
                if (this.c) {
                    UserId userId = w8cVar.b;
                    SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.MARKET_ITEM;
                    long j = -userId.b;
                    SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(type, null, Long.valueOf(j), null, null, null, 58, null);
                    Long valueOf = Long.valueOf(j);
                    Map k = pn00.k(new Pair("name", CommonMarketStat$TypeAutofillInfo.NAME), new Pair("surname", CommonMarketStat$TypeAutofillInfo.SURNAME), new Pair("user_phone", CommonMarketStat$TypeAutofillInfo.USER_PHONE), new Pair("delivery_options", CommonMarketStat$TypeAutofillInfo.DELIVERY_TYPE), new Pair("service_delivery_point", CommonMarketStat$TypeAutofillInfo.DELIVERY_POINT), new Pair("city_id", CommonMarketStat$TypeAutofillInfo.CITY), new Pair("street_home", CommonMarketStat$TypeAutofillInfo.ADDRESS));
                    HashMap d = fVar.d(false);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : d.entrySet()) {
                        String str = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (k.containsKey(str) && value != null) {
                            if (value instanceof String) {
                                if (((CharSequence) value).length() > 0) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            } else if ((value instanceof Integer) && !value.equals(0)) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        CommonMarketStat$TypeAutofillInfo commonMarketStat$TypeAutofillInfo = (CommonMarketStat$TypeAutofillInfo) k.get((String) ((Map.Entry) it.next()).getKey());
                        if (commonMarketStat$TypeAutofillInfo != null) {
                            arrayList.add(commonMarketStat$TypeAutofillInfo);
                        }
                    }
                    new hzp0.g0(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketView.a.b(null, null, null, new CommonMarketStat$TypeMarketViewCheckout(valueOf, arrayList), 31), null).a();
                    mzp0 mzp0Var2 = z4cVar.f;
                    if (mzp0Var2 != null) {
                        mzp0Var2.c(false);
                    }
                }
                z4cVar.T(new aw9.b(fVar, false));
                return s3q0.a;
            case 2:
                qe70 qe70Var = (qe70) this.d;
                f4z f4zVar = qe70Var.o;
                jf70 jf70Var = (jf70) this.e;
                NotificationsNotificationSettingRedesignDto d2 = ((NotificationsEditRedesignSettingResponseDto) obj).d();
                if (d2 != null) {
                    NotificationsNotificationSettingOptionsDto j2 = d2.j();
                    boolean z = !epx.f(j2 != null ? j2.e() : null, NotificationsEditRedesignSettingsSectionSettingsIdDto.NO_TEXT.i());
                    boolean z2 = this.c;
                    if (!z2) {
                        f4zVar.b(vzi0.c.a);
                    }
                    if (z2) {
                        qe70Var.U(jf70Var, d2.j());
                    }
                    Context context = e43.a;
                    NotificationUtils.l(context != null ? context : null, NotificationUtils.Type.b(jf70Var.d), z);
                    qe70Var.T(new cf70.o(d2));
                } else {
                    f4zVar.b(vzi0.a.a);
                }
                return s3q0.a;
            case 3:
                com.vk.voip.ui.sessionrooms.dialog.model.a aVar = (com.vk.voip.ui.sessionrooms.dialog.model.a) this.d;
                a.c cVar = (a.c) this.e;
                return aVar.d(this.c, cVar, cVar.c, (Pair) obj, null);
            default:
                nnq0 nnq0Var = (nnq0) this.d;
                uu50 uu50Var = (uu50) this.e;
                if (this.c) {
                    wmq0.B(nnq0Var, uu50Var, CommunityProfileContentItem.State.ERROR, null, 4);
                } else {
                    wmq0.B(nnq0Var, uu50Var, null, CommunityProfileContentItem.State.ERROR, 2);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ uw9(nnq0 nnq0Var, uu50 uu50Var, boolean z) {
        this.b = 4;
        this.d = nnq0Var;
        this.e = uu50Var;
        this.c = z;
    }

    public /* synthetic */ uw9(boolean z, Object obj, Object obj2, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
        this.e = obj2;
    }
}
