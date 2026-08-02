package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.taxi.summary.models.ForceTariffSwitchForIntercityOrdersExperiment$AfterSwitchToTariffAction$Deeplink;
import java.util.Arrays;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class e2s extends wqt {
    public static final e2s INSTANCE = new e2s();
    public static final /* synthetic */ i3y e = a.b(LazyThreadSafetyMode.PUBLICATION, new v5r(15));

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("open_intercity_main", d2s.INSTANCE.serializer(), qoi0.a(d2s.class)), new f9(Constants.DEEPLINK, ForceTariffSwitchForIntercityOrdersExperiment$AfterSwitchToTariffAction$Deeplink.Companion.serializer(), qoi0.a(ForceTariffSwitchForIntercityOrdersExperiment$AfterSwitchToTariffAction$Deeplink.class)));
    }

    public final KSerializer serializer() {
        return (KSerializer) e.getValue();
    }
}
