package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionShowRule$SelectedTariffShowRule;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.k0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class ljw extends xqt {
    public static final ljw e = new ljw();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, k0.INSTANCE.serializer(), qoi0.a(k0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("selected_tariff", IntercityDashboardSectionShowRule$SelectedTariffShowRule.Companion.serializer(), qoi0.a(IntercityDashboardSectionShowRule$SelectedTariffShowRule.class)));
    }
}
