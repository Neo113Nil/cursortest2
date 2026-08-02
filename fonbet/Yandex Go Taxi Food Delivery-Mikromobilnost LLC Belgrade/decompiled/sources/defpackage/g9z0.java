package defpackage;

import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton;
import com.yandex.go.taxi.order.models.api.response.n8;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class g9z0 extends xqt {
    public static final g9z0 e = new g9z0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, n8.INSTANCE.serializer(), qoi0.a(n8.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("single", TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton.Companion.serializer(), qoi0.a(TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton.class)));
    }
}
