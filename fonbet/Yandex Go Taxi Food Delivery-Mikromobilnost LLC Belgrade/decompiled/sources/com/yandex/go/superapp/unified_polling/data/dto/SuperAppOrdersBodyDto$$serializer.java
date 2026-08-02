package com.yandex.go.superapp.unified_polling.data.dto;

import defpackage.b0t;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/superapp/unified_polling/data/dto/SuperAppOrdersBodyDto.$serializer", "Luxs;", "Lcom/yandex/go/superapp/unified_polling/data/dto/SuperAppOrdersBodyDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/superapp/unified_polling/data/dto/SuperAppOrdersBodyDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/superapp/unified_polling/data/dto/SuperAppOrdersBodyDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class SuperAppOrdersBodyDto$$serializer implements uxs {
    public static final SuperAppOrdersBodyDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SuperAppOrdersBodyDto$$serializer superAppOrdersBodyDto$$serializer = new SuperAppOrdersBodyDto$$serializer();
        INSTANCE = superAppOrdersBodyDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.superapp.unified_polling.data.dto.SuperAppOrdersBodyDto", superAppOrdersBodyDto$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("position", false);
        pluginGeneratedSerialDescriptor.j("force_services", false);
        pluginGeneratedSerialDescriptor.j("check_after", false);
        pluginGeneratedSerialDescriptor.j("superapp_polling", true);
        pluginGeneratedSerialDescriptor.j("trackings_group_method", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SuperAppOrdersBodyDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = SuperAppOrdersBodyDto.f;
        return new KSerializer[]{b0t.a, qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n(pnz.a), z96.a, qke.n((KSerializer) i3yVarArr[4].getValue())};
    }

    @Override // defpackage.myi
    public final SuperAppOrdersBodyDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SuperAppOrdersBodyDto.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        zzs zzsVar = null;
        List list = null;
        Long l = null;
        TrackingsGroupMethodDto trackingsGroupMethodDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                zzsVar = (zzs) b.A(serialDescriptor, 0, b0t.a, zzsVar);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                l = (Long) b.s(serialDescriptor, 2, pnz.a, l);
                i |= 4;
            } else if (v == 3) {
                z2 = b.C(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                trackingsGroupMethodDto = (TrackingsGroupMethodDto) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), trackingsGroupMethodDto);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new SuperAppOrdersBodyDto(i, zzsVar, list, l, z2, trackingsGroupMethodDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SuperAppOrdersBodyDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SuperAppOrdersBodyDto.f;
        b0t b0tVar = b0t.a;
        zzs zzsVar = value.a;
        TrackingsGroupMethodDto trackingsGroupMethodDto = value.e;
        boolean z = value.d;
        b.e(serialDescriptor, 0, b0tVar, zzsVar);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        b.g(serialDescriptor, 2, pnz.a, value.c);
        if (b.F() || !z) {
            b.n(serialDescriptor, 3, z);
        }
        if (b.F() || trackingsGroupMethodDto != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), trackingsGroupMethodDto);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
