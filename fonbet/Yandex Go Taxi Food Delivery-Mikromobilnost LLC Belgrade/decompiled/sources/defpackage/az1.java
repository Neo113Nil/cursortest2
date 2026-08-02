package defpackage;

import com.yandex.go.taxi.order.models.api.objects.AltpinCardItemDto$ActionButtons;
import com.yandex.go.taxi.order.models.api.objects.AltpinCardItemDto$Text;
import com.yandex.go.taxi.order.models.api.objects.d;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class az1 extends xqt {
    public static final az1 e = new az1();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, d.INSTANCE.serializer(), qoi0.a(d.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("action_buttons", AltpinCardItemDto$ActionButtons.Companion.serializer(), qoi0.a(AltpinCardItemDto$ActionButtons.class)), new f9("text", AltpinCardItemDto$Text.Companion.serializer(), qoi0.a(AltpinCardItemDto$Text.class)));
    }
}
