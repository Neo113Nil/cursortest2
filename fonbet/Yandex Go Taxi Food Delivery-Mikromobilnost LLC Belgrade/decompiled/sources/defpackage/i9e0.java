package defpackage;

import com.yandex.go.taxi.order.models.api.response.PopupModalImage$Default;
import com.yandex.go.taxi.order.models.api.response.PopupModalImage$DriverAvatar;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class i9e0 extends xqt {
    public static final i9e0 e = new i9e0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, PopupModalImage$Default.Companion.serializer(), qoi0.a(PopupModalImage$Default.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("default", PopupModalImage$Default.Companion.serializer(), qoi0.a(PopupModalImage$Default.class)), new f9("driver_avatar", PopupModalImage$DriverAvatar.Companion.serializer(), qoi0.a(PopupModalImage$DriverAvatar.class)));
    }
}
