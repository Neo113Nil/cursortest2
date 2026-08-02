package com.yandex.go.eboks.objects.data.model;

import defpackage.b0t;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.nor;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uc4;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/eboks/objects/data/model/EboksObjectsParams.$serializer", "Luxs;", "Lcom/yandex/go/eboks/objects/data/model/EboksObjectsParams;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/eboks/objects/data/model/EboksObjectsParams;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/eboks/objects/data/model/EboksObjectsParams;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class EboksObjectsParams$$serializer implements uxs {
    public static final EboksObjectsParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        EboksObjectsParams$$serializer eboksObjectsParams$$serializer = new EboksObjectsParams$$serializer();
        INSTANCE = eboksObjectsParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.eboks.objects.data.model.EboksObjectsParams", eboksObjectsParams$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("user_location", false);
        pluginGeneratedSerialDescriptor.j("bbox", false);
        pluginGeneratedSerialDescriptor.j("zoom", false);
        pluginGeneratedSerialDescriptor.j("known_types", false);
        pluginGeneratedSerialDescriptor.j("actions", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EboksObjectsParams$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = EboksObjectsParams.f;
        return new KSerializer[]{b0t.a, uc4.Companion.serializer(), nor.a, i3yVarArr[3].getValue(), qke.n((KSerializer) i3yVarArr[4].getValue())};
    }

    @Override // defpackage.myi
    public final EboksObjectsParams deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = EboksObjectsParams.f;
        b.getClass();
        int i = 0;
        zzs zzsVar = null;
        uc4 uc4Var = null;
        List list = null;
        List list2 = null;
        float f = 0.0f;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                zzsVar = (zzs) b.A(serialDescriptor, 0, b0t.a, zzsVar);
                i |= 1;
            } else if (v == 1) {
                uc4Var = (uc4) b.A(serialDescriptor, 1, uc4.Companion.serializer(), uc4Var);
                i |= 2;
            } else if (v == 2) {
                f = b.y(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list2 = (List) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new EboksObjectsParams(i, zzsVar, uc4Var, f, list, list2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, EboksObjectsParams value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = EboksObjectsParams.f;
        b.e(serialDescriptor, 0, b0t.a, value.a);
        b.e(serialDescriptor, 1, uc4.Companion.serializer(), value.b);
        b.z(serialDescriptor, 2, value.c);
        b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
