package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$CarouselSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$CommentSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$DueSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionTypeDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.h0;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.w;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class jjw extends lnt {
    public static final jjw f = new jjw();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, h0.INSTANCE.serializer(), qoi0.a(h0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto = IntercityDashboardSectionTypeDto.HEADER;
        f9 f9Var = new f9((String) h().invoke(intercityDashboardSectionTypeDto), w.INSTANCE.serializer(), qoi0.a(w.class));
        IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto2 = IntercityDashboardSectionTypeDto.ADDRESS_SELECTOR;
        f9 f9Var2 = new f9((String) h().invoke(intercityDashboardSectionTypeDto2), IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity.Companion.serializer(), qoi0.a(IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity.class));
        IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto3 = IntercityDashboardSectionTypeDto.DUE_SELECTOR;
        f9 f9Var3 = new f9((String) h().invoke(intercityDashboardSectionTypeDto3), IntercityDashboardSectionDto$DueSelectorSectionDtoIntercity.Companion.serializer(), qoi0.a(IntercityDashboardSectionDto$DueSelectorSectionDtoIntercity.class));
        IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto4 = IntercityDashboardSectionTypeDto.TARIFF_SELECTOR;
        f9 f9Var4 = new f9((String) h().invoke(intercityDashboardSectionTypeDto4), IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.Companion.serializer(), qoi0.a(IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.class));
        IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto5 = IntercityDashboardSectionTypeDto.CAROUSEL;
        f9 f9Var5 = new f9((String) h().invoke(intercityDashboardSectionTypeDto5), IntercityDashboardSectionDto$CarouselSectionDtoIntercity.Companion.serializer(), qoi0.a(IntercityDashboardSectionDto$CarouselSectionDtoIntercity.class));
        IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto6 = IntercityDashboardSectionTypeDto.SEATS_SELECTOR;
        f9 f9Var6 = new f9((String) h().invoke(intercityDashboardSectionTypeDto6), IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.Companion.serializer(), qoi0.a(IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.class));
        IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto7 = IntercityDashboardSectionTypeDto.COMMENT_SELECTOR;
        return Arrays.asList(f9Var, f9Var2, f9Var3, f9Var4, f9Var5, f9Var6, new f9((String) h().invoke(intercityDashboardSectionTypeDto7), IntercityDashboardSectionDto$CommentSelectorSectionDtoIntercity.Companion.serializer(), qoi0.a(IntercityDashboardSectionDto$CommentSelectorSectionDtoIntercity.class)));
    }

    @Override // defpackage.n4o
    public final KSerializer g() {
        return IntercityDashboardSectionTypeDto.Companion.serializer();
    }
}
