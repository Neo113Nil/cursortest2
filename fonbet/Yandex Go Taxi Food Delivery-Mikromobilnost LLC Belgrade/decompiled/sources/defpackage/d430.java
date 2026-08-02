package defpackage;

import com.yandex.go.places.organization.card.impl.data.entities.network.card.ModeContext$Delivery;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class d430 extends xqt {
    public static final d430 e = new d430();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, b.INSTANCE.serializer(), qoi0.a(b.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("delivery_envoy", ModeContext$Delivery.Companion.serializer(), qoi0.a(ModeContext$Delivery.class)));
    }
}
