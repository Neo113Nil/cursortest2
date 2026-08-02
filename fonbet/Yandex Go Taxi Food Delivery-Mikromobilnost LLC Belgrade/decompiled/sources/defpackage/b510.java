package defpackage;

import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemTrailDto$ButtonDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemTrailDto$IconSpotDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.s;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class b510 extends xqt {
    public static final b510 e = new b510();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, s.INSTANCE.serializer(), qoi0.a(s.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("button", MasstransitSlotItemTrailDto$ButtonDto.Companion.serializer(), qoi0.a(MasstransitSlotItemTrailDto$ButtonDto.class)), new f9("icon_spot", MasstransitSlotItemTrailDto$IconSpotDto.Companion.serializer(), qoi0.a(MasstransitSlotItemTrailDto$IconSpotDto.class)));
    }
}
