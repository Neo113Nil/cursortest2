package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenBannerActionDto$Deeplink;
import com.yandex.go.chargers.feedback.data.g;
import com.yandex.go.chargers.feedback.data.h;
import com.yandex.go.chargers.feedback.data.i;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class mz9 extends xqt {
    public static final mz9 e = new mz9();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, i.INSTANCE.serializer(), qoi0.a(i.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("super_passes", h.INSTANCE.serializer(), qoi0.a(h.class)), new f9("chargers_dvizh_subscription", g.INSTANCE.serializer(), qoi0.a(g.class)), new f9(Constants.DEEPLINK, ChargersFeedbackScreenBannerActionDto$Deeplink.Companion.serializer(), qoi0.a(ChargersFeedbackScreenBannerActionDto$Deeplink.class)));
    }
}
