package defpackage;

import com.yandex.go.taxi.order.models.api.response.Chevron;
import com.yandex.go.taxi.order.models.api.response.CompanionHeader;
import com.yandex.go.taxi.order.models.api.response.TravelCompanion;
import com.yandex.go.taxi.order.models.api.response.d;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes14.dex */
public final class bd11 {
    public final k7x0 a;

    public bd11(k7x0 k7x0Var) {
        this.a = k7x0Var;
    }

    public final ad11 a(TravelCompanion travelCompanion, boolean z) {
        List list;
        CompanionHeader companionHeader = travelCompanion.a;
        String str = companionHeader.a.a;
        String str2 = companionHeader.b.a;
        String str3 = companionHeader.e;
        String a = str3.length() == 0 ? "" : ((m7x0) this.a).a(str3);
        CompanionHeader.Animation animation = companionHeader.f;
        CompanionHeader.AnimationSettings animationSettings = companionHeader.g;
        zc11 zc11Var = new zc11(animation, animationSettings, animationSettings.a == null || z);
        Chevron chevron = companionHeader.d;
        d dVar = (chevron == null || (list = chevron.a) == null) ? null : (d) a.R(list);
        Long l = companionHeader.a.c;
        return new ad11(str, str2, a, zc11Var, dVar, l != null ? Long.valueOf(System.currentTimeMillis() + l.longValue()) : null);
    }
}
