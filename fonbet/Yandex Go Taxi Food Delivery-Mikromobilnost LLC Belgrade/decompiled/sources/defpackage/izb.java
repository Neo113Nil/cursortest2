package defpackage;

import com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings;
import com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$SummarySettings;
import com.yandex.go.pickuppoints.impl.g;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class izb extends xqt {
    public static final izb e = new izb();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, g.INSTANCE.serializer(), qoi0.a(g.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("clarify", ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings.Companion.serializer(), qoi0.a(ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings.class)), new f9("summary", ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$SummarySettings.Companion.serializer(), qoi0.a(ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$SummarySettings.class)));
    }
}
