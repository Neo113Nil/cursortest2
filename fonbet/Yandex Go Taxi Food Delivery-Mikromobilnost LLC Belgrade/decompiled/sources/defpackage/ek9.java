package defpackage;

import com.yandex.go.chargers.order.data.model.ChargersActiveOrderBannerDecorationDto$Animation;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderBannerDecorationDto$Image;
import com.yandex.go.chargers.order.data.model.r;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class ek9 extends xqt {
    public static final ek9 e = new ek9();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, r.INSTANCE.serializer(), qoi0.a(r.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("image", ChargersActiveOrderBannerDecorationDto$Image.Companion.serializer(), qoi0.a(ChargersActiveOrderBannerDecorationDto$Image.class)), new f9("animation", ChargersActiveOrderBannerDecorationDto$Animation.Companion.serializer(), qoi0.a(ChargersActiveOrderBannerDecorationDto$Animation.class)));
    }
}
