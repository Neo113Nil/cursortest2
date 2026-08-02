package defpackage;

import com.yandex.go.slot.dto.SlotDividerDto$Card;
import com.yandex.go.slot.dto.SlotDividerDto$CardBottom;
import com.yandex.go.slot.dto.SlotDividerDto$CardTop;
import com.yandex.go.slot.dto.SlotDividerDto$GroupTitle;
import com.yandex.go.slot.dto.SlotDividerDto$Line;
import com.yandex.go.slot.dto.SlotDividerDto$LineSlot;
import com.yandex.go.slot.dto.SlotDividerDto$SpacerVertical;
import com.yandex.go.slot.dto.SlotDividerDto$Unknown;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class lqs0 extends xqt {
    public static final lqs0 e = new lqs0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, SlotDividerDto$Unknown.Companion.serializer(), qoi0.a(SlotDividerDto$Unknown.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("line", SlotDividerDto$Line.Companion.serializer(), qoi0.a(SlotDividerDto$Line.class)), new f9("line_slot", SlotDividerDto$LineSlot.Companion.serializer(), qoi0.a(SlotDividerDto$LineSlot.class)), new f9("card", SlotDividerDto$Card.Companion.serializer(), qoi0.a(SlotDividerDto$Card.class)), new f9("card_top", SlotDividerDto$CardTop.Companion.serializer(), qoi0.a(SlotDividerDto$CardTop.class)), new f9("card_bottom", SlotDividerDto$CardBottom.Companion.serializer(), qoi0.a(SlotDividerDto$CardBottom.class)), new f9("group_title", SlotDividerDto$GroupTitle.Companion.serializer(), qoi0.a(SlotDividerDto$GroupTitle.class)), new f9("spacer_vertical", SlotDividerDto$SpacerVertical.Companion.serializer(), qoi0.a(SlotDividerDto$SpacerVertical.class)));
    }
}
