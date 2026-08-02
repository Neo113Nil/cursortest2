package com.yandex.go.preorder.source.altpins;

import com.adjust.sdk.Constants;
import com.yandex.go.preorder.source.altpins.Alternatives;
import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class c extends xqt {
    public static final c e = new c();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, Alternatives.CommonOptionLegacyDto.Companion.serializer(), qoi0.a(Alternatives.CommonOptionLegacyDto.class));
    }

    @Override // defpackage.h9
    public final String e() {
        return "display_group";
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("tariff_selector", Alternatives.TariffSelectorOptionDto.Companion.serializer(), qoi0.a(Alternatives.TariffSelectorOptionDto.class)), new f9("alt_create_yandex_card", Alternatives.CreateYandexCardOptionDto.Companion.serializer(), qoi0.a(Alternatives.CreateYandexCardOptionDto.class)), new f9("marketplace", Alternatives.MarketplaceOptionDto.Companion.serializer(), qoi0.a(Alternatives.MarketplaceOptionDto.class)), new f9("alt_payment_method", Alternatives.AltPaymentMethodOptionDto.Companion.serializer(), qoi0.a(Alternatives.AltPaymentMethodOptionDto.class)), new f9(Constants.DEEPLINK, Alternatives.DeeplinkOptionDto.Companion.serializer(), qoi0.a(Alternatives.DeeplinkOptionDto.class)), new f9("combo", Alternatives.ComboOptionDto.Companion.serializer(), qoi0.a(Alternatives.ComboOptionDto.class)), new f9("altpin_a", Alternatives.AltpinAOptionDto.Companion.serializer(), qoi0.a(Alternatives.AltpinAOptionDto.class)), new f9("altpin_b", Alternatives.AltpinBOptionDto.Companion.serializer(), qoi0.a(Alternatives.AltpinBOptionDto.class)), new f9("multimodal", Alternatives.MultimodalOptionDto.Companion.serializer(), qoi0.a(Alternatives.MultimodalOptionDto.class)), new f9("plus_promo", Alternatives.PlusPromoOptionDto.Companion.serializer(), qoi0.a(Alternatives.PlusPromoOptionDto.class)), new f9("multiclass", Alternatives.MulticlassOptionDto.Companion.serializer(), qoi0.a(Alternatives.MulticlassOptionDto.class)), new f9("requirement_option", Alternatives.RequirementOptionDto.Companion.serializer(), qoi0.a(Alternatives.RequirementOptionDto.class)), new f9("plus_subscription", Alternatives.PlusSubscriptionOptionDto.Companion.serializer(), qoi0.a(Alternatives.PlusSubscriptionOptionDto.class)), new f9("plus_dummy_subscription", Alternatives.PlusDummySubscriptionOptionDto.Companion.serializer(), qoi0.a(Alternatives.PlusDummySubscriptionOptionDto.class)));
    }
}
