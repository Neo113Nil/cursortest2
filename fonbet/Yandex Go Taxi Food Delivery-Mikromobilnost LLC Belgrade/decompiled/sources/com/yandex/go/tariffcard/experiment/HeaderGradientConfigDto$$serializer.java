package com.yandex.go.tariffcard.experiment;

import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/tariffcard/experiment/HeaderGradientConfigDto.$serializer", "Luxs;", "Lcom/yandex/go/tariffcard/experiment/HeaderGradientConfigDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/tariffcard/experiment/HeaderGradientConfigDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/tariffcard/experiment/HeaderGradientConfigDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class HeaderGradientConfigDto$$serializer implements uxs {
    public static final HeaderGradientConfigDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HeaderGradientConfigDto$$serializer headerGradientConfigDto$$serializer = new HeaderGradientConfigDto$$serializer();
        INSTANCE = headerGradientConfigDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.tariffcard.experiment.HeaderGradientConfigDto", headerGradientConfigDto$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("segments", true);
        pluginGeneratedSerialDescriptor.j("top_gradient", true);
        pluginGeneratedSerialDescriptor.j("bottom_gradient", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HeaderGradientConfigDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = HeaderGradientConfigDto.e;
        GradientDto$$serializer gradientDto$$serializer = GradientDto$$serializer.INSTANCE;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), qke.n(gradientDto$$serializer), qke.n(gradientDto$$serializer)};
    }

    @Override // defpackage.myi
    public final HeaderGradientConfigDto deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = HeaderGradientConfigDto.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        GradientTypeDto gradientTypeDto = null;
        Map map = null;
        GradientDto gradientDto = null;
        GradientDto gradientDto2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                gradientTypeDto = (GradientTypeDto) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), gradientTypeDto);
                i |= 1;
            } else if (v == 1) {
                map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                i |= 2;
            } else if (v == 2) {
                gradientDto = (GradientDto) b.s(serialDescriptor, 2, GradientDto$$serializer.INSTANCE, gradientDto);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                gradientDto2 = (GradientDto) b.s(serialDescriptor, 3, GradientDto$$serializer.INSTANCE, gradientDto2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new HeaderGradientConfigDto(i, gradientTypeDto, map, gradientDto, gradientDto2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, HeaderGradientConfigDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        HeaderGradientConfigDto.b(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
