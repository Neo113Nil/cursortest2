package defpackage;

import com.yandex.go.slot.dto.SlotItemLeadDto$Icon;
import com.yandex.go.slot.dto.SlotItemLeadDto$Image;
import com.yandex.go.slot.dto.SlotItemLeadDto$Payment;
import com.yandex.go.slot.dto.i2;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class ers0 extends xqt {
    public static final ers0 e = new ers0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, i2.INSTANCE.serializer(), qoi0.a(i2.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("icon", SlotItemLeadDto$Icon.Companion.serializer(), qoi0.a(SlotItemLeadDto$Icon.class)), new f9("image", SlotItemLeadDto$Image.Companion.serializer(), qoi0.a(SlotItemLeadDto$Image.class)), new f9("payment", SlotItemLeadDto$Payment.Companion.serializer(), qoi0.a(SlotItemLeadDto$Payment.class)));
    }
}
