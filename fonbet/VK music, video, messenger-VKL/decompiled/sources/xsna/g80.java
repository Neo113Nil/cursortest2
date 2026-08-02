package xsna;

import com.vk.api.generated.superApp.dto.SuperAppActiveFeatureDto;
import com.vk.core.util.JSONSerializeStringList;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.superapp.SuperAppFeatures;
import com.vk.toggle.features.SmbFeatures;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: ActiveFeaturesHelper.kt */
/* loaded from: classes3.dex */
public final class g80 {
    public final bpn0 a = new bpn0(new n1(1));

    public final List<String> a(SuperAppFeatures.RequestName requestName) {
        HashSet hashSet = new HashSet();
        hashSet.add("sa_redesign_v5");
        hashSet.add("sa_tabbar_redesign");
        hashSet.add("sa_redesign_v6");
        hashSet.add("sa_half_tiles");
        hashSet.add("com_quick_access_managed_group");
        eqy<bek0> eqyVar = com.vk.toggle.d.a;
        SmbFeatures smbFeatures = SmbFeatures.MARKET_TILE;
        smbFeatures.getClass();
        if (com.vk.toggle.b.A.a(smbFeatures)) {
            hashSet.add(SuperAppActiveFeatureDto.SA_MARKET_TILE.i());
        }
        SuperAppFeatures.RequestName requestName2 = SuperAppFeatures.RequestName.GET_MINI_APPS_CATALOG;
        bpn0 bpn0Var = this.a;
        if (requestName != requestName2) {
            hashSet.add("sa_widget_settings_v3");
            if (requestName != SuperAppFeatures.RequestName.GET_SHOWCASE) {
                hashSet.add("sa_redesign_v4");
            }
            JSONSerializeStringList jSONSerializeStringList = ((ez50) bpn0Var.getValue()).a().b().c;
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = jSONSerializeStringList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!h80.a.contains(next)) {
                    arrayList.add(next);
                }
            }
            hashSet.addAll(arrayList);
        } else {
            if (g620.f().getExperiments().k()) {
                hashSet.add("clips_viewer");
            }
            hashSet.add("sa_assistant_mini_widget");
            hashSet.addAll(((ez50) bpn0Var.getValue()).a().b().c);
            hashSet.add("sa_widget_settings_v3");
            hashSet.add("sa_redesign_v4");
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"ActiveFeatures=" + hashSet});
        }
        return j5g.O0(hashSet);
    }
}
