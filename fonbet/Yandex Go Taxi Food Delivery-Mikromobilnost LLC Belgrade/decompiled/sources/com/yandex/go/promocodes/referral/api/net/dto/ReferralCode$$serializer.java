package com.yandex.go.promocodes.referral.api.net.dto;

import com.yandex.go.promocodes.referral.api.net.dto.ReferralCode;
import defpackage.auu0;
import defpackage.gef;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.ief;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import defpackage.z96;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/promocodes/referral/api/net/dto/ReferralCode.$serializer", "Luxs;", "Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class ReferralCode$$serializer implements uxs {
    public static final ReferralCode$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ReferralCode$$serializer referralCode$$serializer = new ReferralCode$$serializer();
        INSTANCE = referralCode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.promocodes.referral.api.net.dto.ReferralCode", referralCode$$serializer, 12);
        pluginGeneratedSerialDescriptor.j("promocode", true);
        pluginGeneratedSerialDescriptor.j("rides_left", true);
        pluginGeneratedSerialDescriptor.j("descr", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_MESSAGE, true);
        pluginGeneratedSerialDescriptor.j("is_error", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        pluginGeneratedSerialDescriptor.j("banner", true);
        pluginGeneratedSerialDescriptor.j("overrides", true);
        pluginGeneratedSerialDescriptor.j("referral_service", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("attributed_title", true);
        pluginGeneratedSerialDescriptor.j("description_items", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ReferralCode$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ReferralCode.m;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), h6w.a, auu0Var, qke.n(auu0Var), z96.a, qke.n(gef.a), qke.n(ReferralCode$PromoBanner$$serializer.INSTANCE), ReferralOverrides$$serializer.INSTANCE, i3yVarArr[8].getValue(), qke.n(auu0Var), qke.n(w7s.a), qke.n((KSerializer) i3yVarArr[11].getValue())};
    }

    @Override // defpackage.myi
    public final ReferralCode deserialize(Decoder decoder) {
        boolean z;
        int i;
        boolean z2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ReferralCode.m;
        b.getClass();
        List list = null;
        FormattedText formattedText = null;
        String str = null;
        ReferralService referralService = null;
        boolean z3 = true;
        ReferralOverrides referralOverrides = null;
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        String str3 = null;
        String str4 = null;
        boolean z4 = false;
        ief iefVar = null;
        ReferralCode.PromoBanner promoBanner = null;
        while (z3) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z3 = false;
                case 0:
                    z = z3;
                    i = i3;
                    str2 = (String) b.s(serialDescriptor, 0, auu0.a, str2);
                    i2 |= 1;
                    z3 = z;
                    i3 = i;
                case 1:
                    z2 = z3;
                    i3 = b.h(serialDescriptor, 1);
                    i2 |= 2;
                    z3 = z2;
                case 2:
                    z2 = z3;
                    str3 = b.k(serialDescriptor, 2);
                    i2 |= 4;
                    z3 = z2;
                case 3:
                    z = z3;
                    i = i3;
                    str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                    i2 |= 8;
                    z3 = z;
                    i3 = i;
                case 4:
                    z2 = z3;
                    z4 = b.C(serialDescriptor, 4);
                    i2 |= 16;
                    z3 = z2;
                case 5:
                    z = z3;
                    i = i3;
                    iefVar = (ief) b.s(serialDescriptor, 5, gef.a, iefVar);
                    i2 |= 32;
                    z3 = z;
                    i3 = i;
                case 6:
                    z = z3;
                    i = i3;
                    promoBanner = (ReferralCode.PromoBanner) b.s(serialDescriptor, 6, ReferralCode$PromoBanner$$serializer.INSTANCE, promoBanner);
                    i2 |= 64;
                    z3 = z;
                    i3 = i;
                case 7:
                    z = z3;
                    i = i3;
                    referralOverrides = (ReferralOverrides) b.A(serialDescriptor, 7, ReferralOverrides$$serializer.INSTANCE, referralOverrides);
                    i2 |= 128;
                    z3 = z;
                    i3 = i;
                case 8:
                    z = z3;
                    i = i3;
                    referralService = (ReferralService) b.A(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), referralService);
                    i2 |= 256;
                    z3 = z;
                    i3 = i;
                case 9:
                    z = z3;
                    i = i3;
                    str = (String) b.s(serialDescriptor, 9, auu0.a, str);
                    i2 |= 512;
                    z3 = z;
                    i3 = i;
                case 10:
                    z = z3;
                    i = i3;
                    formattedText = (FormattedText) b.s(serialDescriptor, 10, w7s.a, formattedText);
                    i2 |= 1024;
                    z3 = z;
                    i3 = i;
                case 11:
                    z = z3;
                    i = i3;
                    list = (List) b.s(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), list);
                    i2 |= 2048;
                    z3 = z;
                    i3 = i;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ReferralCode(i2, str2, i3, str3, str4, z4, iefVar, promoBanner, referralOverrides, referralService, str, formattedText, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ReferralCode value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ReferralCode.m;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || value.b != 0) {
            b.A(1, value.b, serialDescriptor);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e) {
            b.n(serialDescriptor, 4, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, gef.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, ReferralCode$PromoBanner$$serializer.INSTANCE, value.g);
        }
        if (b.F() || !jl40.l(value.h, ReferralOverrides.f)) {
            b.e(serialDescriptor, 7, ReferralOverrides$$serializer.INSTANCE, value.h);
        }
        if (b.F() || value.i != ReferralService.UNKNOWN) {
            b.e(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), value.i);
        }
        if (b.F() || value.j != null) {
            b.g(serialDescriptor, 9, auu0.a, value.j);
        }
        if (b.F() || value.k != null) {
            b.g(serialDescriptor, 10, w7s.a, value.k);
        }
        if (b.F() || !jl40.l(value.l, EmptyList.a)) {
            b.g(serialDescriptor, 11, (KSerializer) i3yVarArr[11].getValue(), value.l);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
