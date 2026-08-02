package xsna;

import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem$ChangeBackground$Background;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: CallParticipantsFeatureStateToViewModelTransformer.kt */
/* loaded from: classes7.dex */
public final class i89 {
    public final com.vk.voip.b a;
    public final gdp b;
    public final c79 c;

    public i89(com.vk.voip.b bVar, v19 v19Var) {
        this.a = bVar;
        gdp gdpVar = new gdp();
        this.b = gdpVar;
        this.c = new c79(bVar, gdpVar);
    }

    public final void a(Set set, ArrayList arrayList, Map map, Set set2, boolean z) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            whr0 whr0Var = (whr0) map.get(str);
            if (whr0Var != null) {
                boolean contains = set2.contains(str);
                sew0 sew0Var = whr0Var.b;
                String str2 = whr0Var.q;
                if (str2 == null) {
                    str2 = whr0Var.e();
                }
                this.b.getClass();
                CharSequence a = gdp.a(str2);
                CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background = CallSettingsItem$ChangeBackground$Background.RECTANGLE;
                if (z) {
                    callSettingsItem$ChangeBackground$Background = CallSettingsItem$ChangeBackground$Background.DEFAULT;
                }
                arrayList.add(new CallSettingsItem.f(str, contains, sew0Var, a, callSettingsItem$ChangeBackground$Background));
            }
        }
    }
}
