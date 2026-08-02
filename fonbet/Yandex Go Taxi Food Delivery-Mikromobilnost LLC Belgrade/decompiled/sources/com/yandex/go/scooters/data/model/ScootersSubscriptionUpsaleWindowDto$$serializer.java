package com.yandex.go.scooters.data.model;

import defpackage.auu0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.mdx;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/data/model/ScootersSubscriptionUpsaleWindowDto.$serializer", "Luxs;", "Lcom/yandex/go/scooters/data/model/ScootersSubscriptionUpsaleWindowDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/data/model/ScootersSubscriptionUpsaleWindowDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/data/model/ScootersSubscriptionUpsaleWindowDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersSubscriptionUpsaleWindowDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ScootersSubscriptionUpsaleWindowDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScootersSubscriptionUpsaleWindowDto$$serializer scootersSubscriptionUpsaleWindowDto$$serializer = new ScootersSubscriptionUpsaleWindowDto$$serializer();
        INSTANCE = scootersSubscriptionUpsaleWindowDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.data.model.ScootersSubscriptionUpsaleWindowDto", scootersSubscriptionUpsaleWindowDto$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("price_title", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("confirm_button", true);
        pluginGeneratedSerialDescriptor.j("reject_button", true);
        pluginGeneratedSerialDescriptor.j("legal_info", true);
        pluginGeneratedSerialDescriptor.j("purchase_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScootersSubscriptionUpsaleWindowDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(ScootersSubscriptionUpsaleBadgeDto$$serializer.INSTANCE);
        KSerializer n2 = qke.n(auu0.a);
        ScootersSubscriptionUpsaleButtonDto$$serializer scootersSubscriptionUpsaleButtonDto$$serializer = ScootersSubscriptionUpsaleButtonDto$$serializer.INSTANCE;
        KSerializer n3 = qke.n(scootersSubscriptionUpsaleButtonDto$$serializer);
        KSerializer n4 = qke.n(scootersSubscriptionUpsaleButtonDto$$serializer);
        KSerializer n5 = qke.n(ScootersSubscriptionLegalInfoDto$$serializer.INSTANCE);
        KSerializer n6 = qke.n(mdx.a);
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, w7sVar, w7sVar, n, n2, n3, n4, n5, n6};
    }

    @Override // defpackage.myi
    public final ScootersSubscriptionUpsaleWindowDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        ScootersSubscriptionUpsaleWindowDto scootersSubscriptionUpsaleWindowDto = null;
        boolean z = true;
        kotlinx.serialization.json.c cVar = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        ScootersSubscriptionUpsaleBadgeDto scootersSubscriptionUpsaleBadgeDto = null;
        String str = null;
        ScootersSubscriptionUpsaleButtonDto scootersSubscriptionUpsaleButtonDto = null;
        ScootersSubscriptionUpsaleButtonDto scootersSubscriptionUpsaleButtonDto2 = null;
        ScootersSubscriptionLegalInfoDto scootersSubscriptionLegalInfoDto = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                    i |= 1;
                    break;
                case 1:
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText2);
                    i |= 2;
                    break;
                case 2:
                    formattedText3 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText3);
                    i |= 4;
                    break;
                case 3:
                    scootersSubscriptionUpsaleBadgeDto = (ScootersSubscriptionUpsaleBadgeDto) b.s(serialDescriptor, 3, ScootersSubscriptionUpsaleBadgeDto$$serializer.INSTANCE, scootersSubscriptionUpsaleBadgeDto);
                    i |= 8;
                    break;
                case 4:
                    str = (String) b.s(serialDescriptor, 4, auu0.a, str);
                    i |= 16;
                    break;
                case 5:
                    scootersSubscriptionUpsaleButtonDto = (ScootersSubscriptionUpsaleButtonDto) b.s(serialDescriptor, 5, ScootersSubscriptionUpsaleButtonDto$$serializer.INSTANCE, scootersSubscriptionUpsaleButtonDto);
                    i |= 32;
                    break;
                case 6:
                    scootersSubscriptionUpsaleButtonDto2 = (ScootersSubscriptionUpsaleButtonDto) b.s(serialDescriptor, 6, ScootersSubscriptionUpsaleButtonDto$$serializer.INSTANCE, scootersSubscriptionUpsaleButtonDto2);
                    i |= 64;
                    break;
                case 7:
                    scootersSubscriptionLegalInfoDto = (ScootersSubscriptionLegalInfoDto) b.s(serialDescriptor, 7, ScootersSubscriptionLegalInfoDto$$serializer.INSTANCE, scootersSubscriptionLegalInfoDto);
                    i |= 128;
                    break;
                case 8:
                    cVar = (kotlinx.serialization.json.c) b.s(serialDescriptor, 8, mdx.a, cVar);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return scootersSubscriptionUpsaleWindowDto;
            }
            scootersSubscriptionUpsaleWindowDto = null;
        }
        b.c(serialDescriptor);
        return new ScootersSubscriptionUpsaleWindowDto(i, formattedText, formattedText2, formattedText3, scootersSubscriptionUpsaleBadgeDto, str, scootersSubscriptionUpsaleButtonDto, scootersSubscriptionUpsaleButtonDto2, scootersSubscriptionLegalInfoDto, cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScootersSubscriptionUpsaleWindowDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, value.a);
        }
        if (b.F() || !jl40.l(value.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, value.b);
        }
        if (b.F() || !jl40.l(value.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, ScootersSubscriptionUpsaleBadgeDto$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, ScootersSubscriptionUpsaleButtonDto$$serializer.INSTANCE, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, ScootersSubscriptionUpsaleButtonDto$$serializer.INSTANCE, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, ScootersSubscriptionLegalInfoDto$$serializer.INSTANCE, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, mdx.a, value.i);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
