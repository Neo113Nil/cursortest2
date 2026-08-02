package defpackage;

import com.yandex.go.taxi.order.models.api.cancel.DetailedCancelNotification;
import com.yandex.go.taxi.order.models.api.cancel.l0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class aj1 extends xqt {
    public static final aj1 e = new aj1();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, l0.INSTANCE.serializer(), qoi0.a(l0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("detailed_popup", DetailedCancelNotification.Companion.serializer(), qoi0.a(DetailedCancelNotification.class)));
    }
}
