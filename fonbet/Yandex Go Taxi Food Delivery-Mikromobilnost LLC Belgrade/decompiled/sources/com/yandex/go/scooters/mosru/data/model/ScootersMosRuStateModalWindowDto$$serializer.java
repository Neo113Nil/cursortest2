package com.yandex.go.scooters.mosru.data.model;

import com.yandex.go.scooters.mosru.data.model.ScootersMosRuStateModalWindowDto;
import defpackage.auu0;
import defpackage.jl40;
import defpackage.jxi;
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
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/mosru/data/model/ScootersMosRuStateModalWindowDto.$serializer", "Luxs;", "Lcom/yandex/go/scooters/mosru/data/model/ScootersMosRuStateModalWindowDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/mosru/data/model/ScootersMosRuStateModalWindowDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/mosru/data/model/ScootersMosRuStateModalWindowDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersMosRuStateModalWindowDto$$serializer implements uxs {
    public static final ScootersMosRuStateModalWindowDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScootersMosRuStateModalWindowDto$$serializer scootersMosRuStateModalWindowDto$$serializer = new ScootersMosRuStateModalWindowDto$$serializer();
        INSTANCE = scootersMosRuStateModalWindowDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.mosru.data.model.ScootersMosRuStateModalWindowDto", scootersMosRuStateModalWindowDto$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("primary_button", true);
        pluginGeneratedSerialDescriptor.j("secondary_button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScootersMosRuStateModalWindowDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        w7s w7sVar = w7s.a;
        KSerializer n2 = qke.n(w7sVar);
        KSerializer n3 = qke.n(w7sVar);
        KSerializer n4 = qke.n(auu0Var);
        ScootersMosRuStateModalWindowDto$ScootersMosRuStateActionItemDto$$serializer scootersMosRuStateModalWindowDto$ScootersMosRuStateActionItemDto$$serializer = ScootersMosRuStateModalWindowDto$ScootersMosRuStateActionItemDto$$serializer.INSTANCE;
        return new KSerializer[]{n, w7sVar, n2, n3, n4, scootersMosRuStateModalWindowDto$ScootersMosRuStateActionItemDto$$serializer, qke.n(scootersMosRuStateModalWindowDto$ScootersMosRuStateActionItemDto$$serializer)};
    }

    @Override // defpackage.myi
    public final ScootersMosRuStateModalWindowDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        String str2 = null;
        ScootersMosRuStateModalWindowDto.ScootersMosRuStateActionItemDto scootersMosRuStateActionItemDto = null;
        ScootersMosRuStateModalWindowDto.ScootersMosRuStateActionItemDto scootersMosRuStateActionItemDto2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                    i |= 2;
                    break;
                case 2:
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText2);
                    i |= 4;
                    break;
                case 3:
                    formattedText3 = (FormattedText) b.s(serialDescriptor, 3, w7s.a, formattedText3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                    i |= 16;
                    break;
                case 5:
                    scootersMosRuStateActionItemDto = (ScootersMosRuStateModalWindowDto.ScootersMosRuStateActionItemDto) b.A(serialDescriptor, 5, ScootersMosRuStateModalWindowDto$ScootersMosRuStateActionItemDto$$serializer.INSTANCE, scootersMosRuStateActionItemDto);
                    i |= 32;
                    break;
                case 6:
                    scootersMosRuStateActionItemDto2 = (ScootersMosRuStateModalWindowDto.ScootersMosRuStateActionItemDto) b.s(serialDescriptor, 6, ScootersMosRuStateModalWindowDto$ScootersMosRuStateActionItemDto$$serializer.INSTANCE, scootersMosRuStateActionItemDto2);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ScootersMosRuStateModalWindowDto(i, str, formattedText, formattedText2, formattedText3, str2, scootersMosRuStateActionItemDto, scootersMosRuStateActionItemDto2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScootersMosRuStateModalWindowDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || !jl40.l(value.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, w7s.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, w7s.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        if (b.F() || !jl40.l(value.f, new ScootersMosRuStateModalWindowDto.ScootersMosRuStateActionItemDto(0))) {
            b.e(serialDescriptor, 5, ScootersMosRuStateModalWindowDto$ScootersMosRuStateActionItemDto$$serializer.INSTANCE, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, ScootersMosRuStateModalWindowDto$ScootersMosRuStateActionItemDto$$serializer.INSTANCE, value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
