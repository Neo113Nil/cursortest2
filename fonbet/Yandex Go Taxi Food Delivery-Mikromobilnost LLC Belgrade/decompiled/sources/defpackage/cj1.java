package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.taxi.order.models.api.cancel.AfterCancelPopupButton$Action$Deeplink;
import com.yandex.go.taxi.order.models.api.cancel.r;
import com.yandex.go.taxi.order.models.api.cancel.s;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class cj1 extends xqt {
    public static final cj1 e = new cj1();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, s.INSTANCE.serializer(), qoi0.a(s.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("to_summary", r.INSTANCE.serializer(), qoi0.a(r.class)), new f9(Constants.DEEPLINK, AfterCancelPopupButton$Action$Deeplink.Companion.serializer(), qoi0.a(AfterCancelPopupButton$Action$Deeplink.class)));
    }
}
