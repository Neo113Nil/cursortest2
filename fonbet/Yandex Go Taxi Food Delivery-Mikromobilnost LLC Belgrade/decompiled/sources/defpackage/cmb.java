package defpackage;

import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenElementDto$DirectionSelectorScreenElementDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenElementDto$NumericInputScreenElementDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenElementDto$StopSelectorScreenElementDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.d;
import com.yandex.go.masstransit.sdk.client_api.data.dto.h;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class cmb extends xqt {
    public static final cmb e = new cmb();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, h.INSTANCE.serializer(), qoi0.a(h.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("numeric_input", CheckoutScreenElementDto$NumericInputScreenElementDto.Companion.serializer(), qoi0.a(CheckoutScreenElementDto$NumericInputScreenElementDto.class)), new f9("stop_selector", CheckoutScreenElementDto$StopSelectorScreenElementDto.Companion.serializer(), qoi0.a(CheckoutScreenElementDto$StopSelectorScreenElementDto.class)), new f9("divider", d.INSTANCE.serializer(), qoi0.a(d.class)), new f9("direction_selector", CheckoutScreenElementDto$DirectionSelectorScreenElementDto.Companion.serializer(), qoi0.a(CheckoutScreenElementDto$DirectionSelectorScreenElementDto.class)));
    }
}
