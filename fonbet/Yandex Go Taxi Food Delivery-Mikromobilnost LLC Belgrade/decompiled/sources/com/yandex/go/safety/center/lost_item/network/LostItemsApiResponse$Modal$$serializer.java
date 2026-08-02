package com.yandex.go.safety.center.lost_item.network;

import com.yandex.go.safety.center.lost_item.network.LostItemsApiResponse;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/safety/center/lost_item/network/LostItemsApiResponse.Modal.$serializer", "Luxs;", "Lcom/yandex/go/safety/center/lost_item/network/LostItemsApiResponse$Modal;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/safety/center/lost_item/network/LostItemsApiResponse$Modal;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/safety/center/lost_item/network/LostItemsApiResponse$Modal;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class LostItemsApiResponse$Modal$$serializer implements uxs {
    public static final LostItemsApiResponse$Modal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LostItemsApiResponse$Modal$$serializer lostItemsApiResponse$Modal$$serializer = new LostItemsApiResponse$Modal$$serializer();
        INSTANCE = lostItemsApiResponse$Modal$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.safety.center.lost_item.network.LostItemsApiResponse.Modal", lostItemsApiResponse$Modal$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("header", true);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, false);
        pluginGeneratedSerialDescriptor.j("bullets", true);
        pluginGeneratedSerialDescriptor.j("button", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LostItemsApiResponse$Modal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = LostItemsApiResponse.Modal.f;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{qke.n(LostItemsApiResponse$Modal$Header$$serializer.INSTANCE), w7sVar, w7sVar, i3yVarArr[3].getValue(), LostItemsApiResponse$Modal$Button$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final LostItemsApiResponse.Modal deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = LostItemsApiResponse.Modal.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        LostItemsApiResponse.Modal.Header header = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        List list = null;
        LostItemsApiResponse.Modal.Button button = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                header = (LostItemsApiResponse.Modal.Header) b.s(serialDescriptor, 0, LostItemsApiResponse$Modal$Header$$serializer.INSTANCE, header);
                i |= 1;
            } else if (v == 1) {
                formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                i |= 2;
            } else if (v == 2) {
                formattedText2 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText2);
                i |= 4;
            } else if (v == 3) {
                list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                button = (LostItemsApiResponse.Modal.Button) b.A(serialDescriptor, 4, LostItemsApiResponse$Modal$Button$$serializer.INSTANCE, button);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new LostItemsApiResponse.Modal(i, header, formattedText, formattedText2, list, button);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LostItemsApiResponse.Modal value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = LostItemsApiResponse.Modal.f;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, LostItemsApiResponse$Modal$Header$$serializer.INSTANCE, value.a);
        }
        w7s w7sVar = w7s.a;
        FormattedText formattedText = value.b;
        List list = value.d;
        b.e(serialDescriptor, 1, w7sVar, formattedText);
        b.e(serialDescriptor, 2, w7sVar, value.c);
        if (b.F() || !jl40.l(list, EmptyList.a)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), list);
        }
        b.e(serialDescriptor, 4, LostItemsApiResponse$Modal$Button$$serializer.INSTANCE, value.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
