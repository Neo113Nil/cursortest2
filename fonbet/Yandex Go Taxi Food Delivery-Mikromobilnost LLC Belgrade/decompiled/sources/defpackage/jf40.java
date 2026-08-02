package defpackage;

import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.OpenItemsModalAction;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class jf40 extends xqt {
    public static final jf40 e = new jf40();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, a.INSTANCE.serializer(), qoi0.a(a.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("open_items_modal", OpenItemsModalAction.Companion.serializer(), qoi0.a(OpenItemsModalAction.class)));
    }
}
