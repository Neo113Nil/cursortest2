package defpackage;

import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.dto.response.Counters;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import com.yandex.go.shortcuts.dto.response.f0;
import com.yandex.go.shortcuts.models.OfferType;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;

/* loaded from: classes13.dex */
public interface ga5 extends v0s0, a1f, e6v {
    @Override // defpackage.yyr0
    default String d() {
        return getBase().o;
    }

    @Override // defpackage.yyr0
    default String e() {
        return getBase().j;
    }

    @Override // defpackage.yyr0
    default String f() {
        return getBase().d;
    }

    @Override // defpackage.yyr0
    /* renamed from: getAction */
    default q1 getC() {
        return getBase().k;
    }

    ea5 getBase();

    @Override // defpackage.yyr0
    default BaseShortcutModel$Source getSource() {
        return getBase().e;
    }

    default OfferType getType() {
        return getBase().f;
    }

    @Override // defpackage.a1f
    default Counters h() {
        return getBase().n;
    }

    @Override // defpackage.v0s0
    default f0 i() {
        return getBase().m;
    }

    ga5 r(boolean z, ProductMode$Taxi.SectionType sectionType);

    boolean t();
}
