package defpackage;

import com.yandex.go.slot.dto.BottomModalContentItemDto$DividerLine;
import com.yandex.go.slot.dto.BottomModalContentItemDto$Slot;
import com.yandex.go.slot.dto.BottomModalContentItemDto$SpacerVertical;
import com.yandex.go.slot.dto.i;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class pc6 extends xqt {
    public static final pc6 e = new pc6();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, i.INSTANCE.serializer(), qoi0.a(i.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("slot", BottomModalContentItemDto$Slot.Companion.serializer(), qoi0.a(BottomModalContentItemDto$Slot.class)), new f9("spacer_vertical", BottomModalContentItemDto$SpacerVertical.Companion.serializer(), qoi0.a(BottomModalContentItemDto$SpacerVertical.class)), new f9("divider", BottomModalContentItemDto$DividerLine.Companion.serializer(), qoi0.a(BottomModalContentItemDto$DividerLine.class)));
    }
}
