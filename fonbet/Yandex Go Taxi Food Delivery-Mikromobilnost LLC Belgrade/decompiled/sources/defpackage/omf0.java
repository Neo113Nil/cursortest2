package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeItemActionDto$DeeplinkActionDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeItemActionDto$PromoCodeCopyActionDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeItemActionDto$PromocodeUrlActionDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeItemActionDto$UnknownActionDto;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class omf0 extends xqt {
    public static final omf0 e = new omf0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, PromoCodeItemActionDto$UnknownActionDto.Companion.serializer(), qoi0.a(PromoCodeItemActionDto$UnknownActionDto.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(Constants.DEEPLINK, PromoCodeItemActionDto$DeeplinkActionDto.Companion.serializer(), qoi0.a(PromoCodeItemActionDto$DeeplinkActionDto.class)), new f9("clipboard_copy", PromoCodeItemActionDto$PromoCodeCopyActionDto.Companion.serializer(), qoi0.a(PromoCodeItemActionDto$PromoCodeCopyActionDto.class)), new f9("url", PromoCodeItemActionDto$PromocodeUrlActionDto.Companion.serializer(), qoi0.a(PromoCodeItemActionDto$PromocodeUrlActionDto.class)));
    }
}
