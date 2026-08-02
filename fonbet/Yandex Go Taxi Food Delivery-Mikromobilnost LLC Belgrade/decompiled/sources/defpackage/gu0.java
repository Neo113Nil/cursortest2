package defpackage;

import com.yandex.go.taxi.intercity.dashboard.api.data.entity.AddressDto$Clarification;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.AddressDto$Coordinates;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.c;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.d;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class gu0 extends xqt {
    public static final gu0 e = new gu0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, d.INSTANCE.serializer(), qoi0.a(d.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("coordinates", AddressDto$Coordinates.Companion.serializer(), qoi0.a(AddressDto$Coordinates.class)), new f9("clarification", AddressDto$Clarification.Companion.serializer(), qoi0.a(AddressDto$Clarification.class)), new f9("current_a", c.INSTANCE.serializer(), qoi0.a(c.class)));
    }
}
