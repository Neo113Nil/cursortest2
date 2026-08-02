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
import defpackage.z96;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.data.model.CreateOfferType;
import ru.yandex.taxi.scooters.data.model.ScootersCard;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/data/model/CreateOffersV1Params.$serializer", "Luxs;", "Lcom/yandex/go/scooters/data/model/CreateOffersV1Params;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/data/model/CreateOffersV1Params;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/data/model/CreateOffersV1Params;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class CreateOffersV1Params$$serializer implements uxs {
    public static final int $stable = 0;
    public static final CreateOffersV1Params$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CreateOffersV1Params$$serializer createOffersV1Params$$serializer = new CreateOffersV1Params$$serializer();
        INSTANCE = createOffersV1Params$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.data.model.CreateOffersV1Params", createOffersV1Params$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("vehicles", false);
        pluginGeneratedSerialDescriptor.j("user_position", false);
        pluginGeneratedSerialDescriptor.j("user_destination", true);
        pluginGeneratedSerialDescriptor.j("payment_methods", false);
        pluginGeneratedSerialDescriptor.j("insurance_type", true);
        pluginGeneratedSerialDescriptor.j("offer_type", true);
        pluginGeneratedSerialDescriptor.j("scooters_card", false);
        pluginGeneratedSerialDescriptor.j("open_reason", true);
        pluginGeneratedSerialDescriptor.j("source", true);
        pluginGeneratedSerialDescriptor.j("instant_start", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CreateOffersV1Params$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = CreateOffersV1Params.k;
        b0t b0tVar = b0t.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), b0tVar, qke.n(b0tVar), i3yVarArr[3].getValue(), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[5].getValue()), i3yVarArr[6].getValue(), qke.n(auu0Var), qke.n(auu0Var), z96.a};
    }

    @Override // defpackage.myi
    public final CreateOffersV1Params deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = CreateOffersV1Params.k;
        b.getClass();
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        List list = null;
        zzs zzsVar = null;
        zzs zzsVar2 = null;
        List list2 = null;
        String str3 = null;
        CreateOfferType createOfferType = null;
        ScootersCard scootersCard = null;
        boolean z2 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    zzsVar = (zzs) b.A(serialDescriptor, 1, b0t.a, zzsVar);
                    i |= 2;
                    break;
                case 2:
                    zzsVar2 = (zzs) b.s(serialDescriptor, 2, b0t.a, zzsVar2);
                    i |= 4;
                    break;
                case 3:
                    list2 = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) b.s(serialDescriptor, 4, auu0.a, str3);
                    i |= 16;
                    break;
                case 5:
                    createOfferType = (CreateOfferType) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), createOfferType);
                    i |= 32;
                    break;
                case 6:
                    scootersCard = (ScootersCard) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), scootersCard);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) b.s(serialDescriptor, 7, auu0.a, str2);
                    i |= 128;
                    break;
                case 8:
                    str = (String) b.s(serialDescriptor, 8, auu0.a, str);
                    i |= 256;
                    break;
                case 9:
                    z2 = b.C(serialDescriptor, 9);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new CreateOffersV1Params(i, list, zzsVar, zzsVar2, list2, str3, createOfferType, scootersCard, str2, str, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CreateOffersV1Params value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = CreateOffersV1Params.k;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        List list = value.a;
        boolean z = value.j;
        String str = value.i;
        String str2 = value.h;
        CreateOfferType createOfferType = value.f;
        String str3 = value.e;
        zzs zzsVar = value.c;
        b.e(serialDescriptor, 0, kSerializer, list);
        b0t b0tVar = b0t.a;
        b.e(serialDescriptor, 1, b0tVar, value.b);
        if (b.F() || zzsVar != null) {
            b.g(serialDescriptor, 2, b0tVar, zzsVar);
        }
        b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 4, auu0.a, str3);
        }
        if (b.F() || createOfferType != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), createOfferType);
        }
        b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), value.g);
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 7, auu0.a, str2);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 8, auu0.a, str);
        }
        if (b.F() || z) {
            b.n(serialDescriptor, 9, z);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
