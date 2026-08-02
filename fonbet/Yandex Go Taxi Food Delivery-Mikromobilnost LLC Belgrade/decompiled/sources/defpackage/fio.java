package defpackage;

import com.yandex.go.navigator.analitycs.EvgenNavigatorAnalytics$ButtonName;
import com.yandex.go.navigator.analitycs.EvgenNavigatorAnalytics$Screen;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes12.dex */
public final class fio {
    public final pho a;

    public fio(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(EvgenNavigatorAnalytics$ButtonName evgenNavigatorAnalytics$ButtonName, boolean z, EvgenNavigatorAnalytics$Screen evgenNavigatorAnalytics$Screen, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", evgenNavigatorAnalytics$ButtonName.getEventValue());
        hashMap.put("active_route_flg", Boolean.valueOf(z));
        hashMap.put(MetaDataField.SCREEN_FIELD, evgenNavigatorAnalytics$Screen.getEventValue());
        hashMap.put(Constants.KEY_SERVICE, str);
        this.a.a("Navigator.MainScreen.Tapped", hashMap, 2, new HashMap());
    }
}
