package com.yandex.go.preorder.source.altpins;

import com.yandex.go.preorder.source.altpins.Alternatives;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.jxi;
import defpackage.jy1;
import defpackage.nor;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/preorder/source/altpins/Alternatives.PinStateDto.$serializer", "Luxs;", "Lcom/yandex/go/preorder/source/altpins/Alternatives$PinStateDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/preorder/source/altpins/Alternatives$PinStateDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/preorder/source/altpins/Alternatives$PinStateDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class Alternatives$PinStateDto$$serializer implements uxs {
    public static final Alternatives$PinStateDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Alternatives$PinStateDto$$serializer alternatives$PinStateDto$$serializer = new Alternatives$PinStateDto$$serializer();
        INSTANCE = alternatives$PinStateDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.preorder.source.altpins.Alternatives.PinStateDto", alternatives$PinStateDto$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("text_with_chevron", true);
        pluginGeneratedSerialDescriptor.j("should_swap_texts", true);
        pluginGeneratedSerialDescriptor.j("anchored", true);
        pluginGeneratedSerialDescriptor.j("draw_bullet", true);
        pluginGeneratedSerialDescriptor.j("hint", true);
        pluginGeneratedSerialDescriptor.j("icon_state", true);
        pluginGeneratedSerialDescriptor.j("scale", true);
        pluginGeneratedSerialDescriptor.j(IssuingDistributionPointExtension.POINT, true);
        pluginGeneratedSerialDescriptor.j("amount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Alternatives$PinStateDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        KSerializer n3 = qke.n(jy1.e);
        KSerializer n4 = qke.n(Alternatives$PointDto$$serializer.INSTANCE);
        KSerializer n5 = qke.n(h6w.a);
        z96 z96Var = z96.a;
        return new KSerializer[]{n, z96Var, z96Var, z96Var, z96Var, n2, n3, nor.a, n4, n5};
    }

    @Override // defpackage.myi
    public final Alternatives.PinStateDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        float f = 0.0f;
        Integer num = null;
        boolean z = true;
        Alternatives.PointDto pointDto = null;
        int i = 0;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        String str2 = null;
        q0 q0Var = null;
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
                    z2 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    z3 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z4 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z5 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) b.s(serialDescriptor, 5, auu0.a, str2);
                    i |= 32;
                    break;
                case 6:
                    q0Var = (q0) b.s(serialDescriptor, 6, jy1.e, q0Var);
                    i |= 64;
                    break;
                case 7:
                    f = b.y(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    pointDto = (Alternatives.PointDto) b.s(serialDescriptor, 8, Alternatives$PointDto$$serializer.INSTANCE, pointDto);
                    i |= 256;
                    break;
                case 9:
                    num = (Integer) b.s(serialDescriptor, 9, h6w.a, num);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new Alternatives.PinStateDto(i, str, z2, z3, z4, z5, str2, q0Var, f, pointDto, num);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Alternatives.PinStateDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || value.b) {
            b.n(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c) {
            b.n(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d) {
            b.n(serialDescriptor, 3, value.d);
        }
        if (b.F() || value.e) {
            b.n(serialDescriptor, 4, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, auu0.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, jy1.e, value.g);
        }
        if (b.F() || Float.compare(value.h, 1.0f) != 0) {
            b.z(serialDescriptor, 7, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, Alternatives$PointDto$$serializer.INSTANCE, value.i);
        }
        if (b.F() || value.j != null) {
            b.g(serialDescriptor, 9, h6w.a, value.j);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
