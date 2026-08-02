package com.yandex.go.eboks.objects.data.model;

import defpackage.auu0;
import defpackage.dor;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/eboks/objects/data/model/EboksTypeStyleImage.$serializer", "Luxs;", "Lcom/yandex/go/eboks/objects/data/model/EboksTypeStyleImage;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/eboks/objects/data/model/EboksTypeStyleImage;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/eboks/objects/data/model/EboksTypeStyleImage;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class EboksTypeStyleImage$$serializer implements uxs {
    public static final EboksTypeStyleImage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        EboksTypeStyleImage$$serializer eboksTypeStyleImage$$serializer = new EboksTypeStyleImage$$serializer();
        INSTANCE = eboksTypeStyleImage$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.eboks.objects.data.model.EboksTypeStyleImage", eboksTypeStyleImage$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("tag", true);
        pluginGeneratedSerialDescriptor.j("selected_tag", true);
        pluginGeneratedSerialDescriptor.j("anchor", true);
        pluginGeneratedSerialDescriptor.j("selected_anchor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EboksTypeStyleImage$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        dor dorVar = dor.c;
        return new KSerializer[]{n, n2, qke.n(dorVar), qke.n(dorVar)};
    }

    @Override // defpackage.myi
    public final EboksTypeStyleImage deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        float[] fArr = null;
        float[] fArr2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                fArr = (float[]) b.s(serialDescriptor, 2, dor.c, fArr);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                fArr2 = (float[]) b.s(serialDescriptor, 3, dor.c, fArr2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new EboksTypeStyleImage(i, str, str2, fArr, fArr2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, EboksTypeStyleImage value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, dor.c, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, dor.c, value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
