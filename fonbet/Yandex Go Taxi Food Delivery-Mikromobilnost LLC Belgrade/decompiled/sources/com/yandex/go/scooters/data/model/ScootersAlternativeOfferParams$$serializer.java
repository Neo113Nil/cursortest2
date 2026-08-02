package com.yandex.go.scooters.data.model;

import defpackage.auu0;
import defpackage.b0t;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
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
import ru.yandex.taxi.scooters.data.model.CreateOfferType;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/data/model/ScootersAlternativeOfferParams.$serializer", "Luxs;", "Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferParams;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferParams;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferParams;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersAlternativeOfferParams$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ScootersAlternativeOfferParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScootersAlternativeOfferParams$$serializer scootersAlternativeOfferParams$$serializer = new ScootersAlternativeOfferParams$$serializer();
        INSTANCE = scootersAlternativeOfferParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.data.model.ScootersAlternativeOfferParams", scootersAlternativeOfferParams$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("offer_id", false);
        pluginGeneratedSerialDescriptor.j("vehicles", false);
        pluginGeneratedSerialDescriptor.j("offer_type", true);
        pluginGeneratedSerialDescriptor.j("user_position", true);
        pluginGeneratedSerialDescriptor.j("open_reason", true);
        pluginGeneratedSerialDescriptor.j("payment_methods", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScootersAlternativeOfferParams$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ScootersAlternativeOfferParams.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n(b0t.a), qke.n(auu0Var), i3yVarArr[5].getValue()};
    }

    @Override // defpackage.myi
    public final ScootersAlternativeOfferParams deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersAlternativeOfferParams.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        CreateOfferType createOfferType = null;
        zzs zzsVar = null;
        String str2 = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    createOfferType = (CreateOfferType) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), createOfferType);
                    i |= 4;
                    break;
                case 3:
                    zzsVar = (zzs) b.s(serialDescriptor, 3, b0t.a, zzsVar);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ScootersAlternativeOfferParams(i, str, list, createOfferType, zzsVar, str2, list2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScootersAlternativeOfferParams value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersAlternativeOfferParams.g;
        String str = value.a;
        String str2 = value.e;
        zzs zzsVar = value.d;
        CreateOfferType createOfferType = value.c;
        b.o(serialDescriptor, 0, str);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        if (b.F() || createOfferType != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), createOfferType);
        }
        if (b.F() || zzsVar != null) {
            b.g(serialDescriptor, 3, b0t.a, zzsVar);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 4, auu0.a, str2);
        }
        b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), value.f);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
