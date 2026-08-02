package com.yandex.go.safety.center.lost_item.network;

import com.yandex.go.safety.center.lost_item.network.LostItemsApiResponse;
import defpackage.gef;
import defpackage.ief;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/safety/center/lost_item/network/LostItemsApiResponse.$serializer", "Luxs;", "Lcom/yandex/go/safety/center/lost_item/network/LostItemsApiResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/safety/center/lost_item/network/LostItemsApiResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/safety/center/lost_item/network/LostItemsApiResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class LostItemsApiResponse$$serializer implements uxs {
    public static final LostItemsApiResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LostItemsApiResponse$$serializer lostItemsApiResponse$$serializer = new LostItemsApiResponse$$serializer();
        INSTANCE = lostItemsApiResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.safety.center.lost_item.network.LostItemsApiResponse", lostItemsApiResponse$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("modal", false);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LostItemsApiResponse$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{LostItemsApiResponse$Modal$$serializer.INSTANCE, qke.n(gef.a)};
    }

    @Override // defpackage.myi
    public final LostItemsApiResponse deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        LostItemsApiResponse.Modal modal = null;
        ief iefVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                modal = (LostItemsApiResponse.Modal) b.A(serialDescriptor, 0, LostItemsApiResponse$Modal$$serializer.INSTANCE, modal);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                iefVar = (ief) b.s(serialDescriptor, 1, gef.a, iefVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new LostItemsApiResponse(i, modal, iefVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LostItemsApiResponse value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        LostItemsApiResponse$Modal$$serializer lostItemsApiResponse$Modal$$serializer = LostItemsApiResponse$Modal$$serializer.INSTANCE;
        LostItemsApiResponse.Modal modal = value.a;
        ief iefVar = value.b;
        b.e(serialDescriptor, 0, lostItemsApiResponse$Modal$$serializer, modal);
        if (b.F() || iefVar != null) {
            b.g(serialDescriptor, 1, gef.a, iefVar);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
