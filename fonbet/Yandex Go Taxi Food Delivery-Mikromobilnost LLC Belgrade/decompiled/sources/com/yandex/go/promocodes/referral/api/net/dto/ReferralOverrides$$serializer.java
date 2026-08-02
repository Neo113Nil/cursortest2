package com.yandex.go.promocodes.referral.api.net.dto;

import com.yandex.go.promocodes.referral.api.net.dto.ReferralOverrides;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/promocodes/referral/api/net/dto/ReferralOverrides.$serializer", "Luxs;", "Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralOverrides;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralOverrides;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralOverrides;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class ReferralOverrides$$serializer implements uxs {
    public static final ReferralOverrides$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ReferralOverrides$$serializer referralOverrides$$serializer = new ReferralOverrides$$serializer();
        INSTANCE = referralOverrides$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.promocodes.referral.api.net.dto.ReferralOverrides", referralOverrides$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("referral_screen", true);
        pluginGeneratedSerialDescriptor.j("promocode_screen", true);
        pluginGeneratedSerialDescriptor.j("order_card", true);
        pluginGeneratedSerialDescriptor.j(PolicyMappingsExtension.MAP, true);
        pluginGeneratedSerialDescriptor.j("order_banner", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ReferralOverrides$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(ReferralOverrides$ReferralScreen$$serializer.INSTANCE), qke.n(ReferralOverrides$PromocodeScreen$$serializer.INSTANCE), qke.n(ReferralOverrides$OrderCard$$serializer.INSTANCE), qke.n(ReferralOverrides$Map$$serializer.INSTANCE), qke.n(ReferralOverrides$OrderBanner$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final ReferralOverrides deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        ReferralOverrides.ReferralScreen referralScreen = null;
        ReferralOverrides.PromocodeScreen promocodeScreen = null;
        ReferralOverrides.OrderCard orderCard = null;
        ReferralOverrides.Map map = null;
        ReferralOverrides.OrderBanner orderBanner = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                referralScreen = (ReferralOverrides.ReferralScreen) b.s(serialDescriptor, 0, ReferralOverrides$ReferralScreen$$serializer.INSTANCE, referralScreen);
                i |= 1;
            } else if (v == 1) {
                promocodeScreen = (ReferralOverrides.PromocodeScreen) b.s(serialDescriptor, 1, ReferralOverrides$PromocodeScreen$$serializer.INSTANCE, promocodeScreen);
                i |= 2;
            } else if (v == 2) {
                orderCard = (ReferralOverrides.OrderCard) b.s(serialDescriptor, 2, ReferralOverrides$OrderCard$$serializer.INSTANCE, orderCard);
                i |= 4;
            } else if (v == 3) {
                map = (ReferralOverrides.Map) b.s(serialDescriptor, 3, ReferralOverrides$Map$$serializer.INSTANCE, map);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                orderBanner = (ReferralOverrides.OrderBanner) b.s(serialDescriptor, 4, ReferralOverrides$OrderBanner$$serializer.INSTANCE, orderBanner);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new ReferralOverrides(i, referralScreen, promocodeScreen, orderCard, map, orderBanner);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ReferralOverrides value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, ReferralOverrides$ReferralScreen$$serializer.INSTANCE, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, ReferralOverrides$PromocodeScreen$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, ReferralOverrides$OrderCard$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, ReferralOverrides$Map$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, ReferralOverrides$OrderBanner$$serializer.INSTANCE, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
