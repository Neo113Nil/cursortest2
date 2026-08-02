package com.yandex.go.promocodes.base.impl.promo_codes.data.api;

import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.activation.PromoCodeActivationRequestDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.activation.PromoCodeActivationResponseDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.deactivation.PromoCodeDeactivationRequestDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.list.PromoCodeListRequestDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.list.PromoCodeListResponseDto;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\u0004j\u0002`\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/promo_codes/data/api/PromoCodesApi;", "", "Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/list/PromoCodeListRequestDto;", "param", "Lcmt;", "Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/list/PromoCodeListResponseDto;", "c", "(Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/list/PromoCodeListRequestDto;)Lcmt;", "Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/activation/PromoCodeActivationRequestDto;", "Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/activation/PromoCodeActivationResponseDto;", "a", "(Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/activation/PromoCodeActivationRequestDto;)Lcmt;", "Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/deactivation/PromoCodeDeactivationRequestDto;", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "b", "(Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/deactivation/PromoCodeDeactivationRequestDto;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface PromoCodesApi {
    @s490("couponactivate")
    cmt<PromoCodeActivationResponseDto> a(@q76 PromoCodeActivationRequestDto param);

    @s490("coupondeactivate")
    cmt<zy11> b(@q76 PromoCodeDeactivationRequestDto param);

    @s490("couponlist")
    cmt<PromoCodeListResponseDto> c(@q76 PromoCodeListRequestDto param);
}
