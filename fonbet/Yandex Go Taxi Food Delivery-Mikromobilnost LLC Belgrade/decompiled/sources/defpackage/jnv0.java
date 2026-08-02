package defpackage;

import java.util.Collections;
import java.util.List;
import ru.yandex.taxi.communications.model.ConfigurationType;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

/* loaded from: classes10.dex */
public abstract class jnv0 {
    public static final List a = Collections.singletonList(SummaryPromotionsResponse.DisplayOnType.SUMMARY);
    public static final umv0 b = new umv0(SummaryPromotionsResponse.b, false);
    public static final List c = scc.g(ConfigurationType.LIST, ConfigurationType.TOOLTIP, ConfigurationType.DIALOGUE);
}
