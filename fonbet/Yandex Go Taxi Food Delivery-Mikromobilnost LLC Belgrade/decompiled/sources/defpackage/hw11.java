package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.dto.response.UnavailabilityAction$Deeplink;
import com.yandex.go.dto.response.UnavailabilityAction$OpenFlexScreenAction;
import com.yandex.go.dto.response.UnavailabilityAction$OpenOrderPopupAction;
import com.yandex.go.dto.response.UnavailabilityAction$OpenSummaryAddress;
import com.yandex.go.dto.response.c2;
import com.yandex.go.dto.response.x1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class hw11 extends xqt {
    public static final hw11 e = new hw11();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, x1.INSTANCE.serializer(), qoi0.a(x1.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(Constants.DEEPLINK, UnavailabilityAction$Deeplink.Companion.serializer(), qoi0.a(UnavailabilityAction$Deeplink.class)), new f9("open_summary_address", UnavailabilityAction$OpenSummaryAddress.Companion.serializer(), qoi0.a(UnavailabilityAction$OpenSummaryAddress.class)), new f9("open_order_popup", UnavailabilityAction$OpenOrderPopupAction.Companion.serializer(), qoi0.a(UnavailabilityAction$OpenOrderPopupAction.class)), new f9("open_tariff_card", c2.INSTANCE.serializer(), qoi0.a(c2.class)), new f9("show_flex", UnavailabilityAction$OpenFlexScreenAction.Companion.serializer(), qoi0.a(UnavailabilityAction$OpenFlexScreenAction.class)));
    }
}
