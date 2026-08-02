package defpackage;

import com.yandex.go.taxi.order.models.api.response.ModalItemDto$DefaultItem;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$RobotaxiItem;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$ShareOrderItem;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$StepsInstructionsItem;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class az20 extends xqt {
    public static final az20 e = new az20();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, ModalItemDto$DefaultItem.Companion.serializer(), qoi0.a(ModalItemDto$DefaultItem.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("default", ModalItemDto$DefaultItem.Companion.serializer(), qoi0.a(ModalItemDto$DefaultItem.class)), new f9("steps_instruction", ModalItemDto$StepsInstructionsItem.Companion.serializer(), qoi0.a(ModalItemDto$StepsInstructionsItem.class)), new f9("share_order", ModalItemDto$ShareOrderItem.Companion.serializer(), qoi0.a(ModalItemDto$ShareOrderItem.class)), new f9("robotaxi", ModalItemDto$RobotaxiItem.Companion.serializer(), qoi0.a(ModalItemDto$RobotaxiItem.class)));
    }
}
