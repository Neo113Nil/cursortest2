package com.yandex.go.suggest.impl.view.divkit.custom_view.map_item;

import com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemViewProperties;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties.SuggestMapItemBbox.$serializer", "Luxs;", "Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties$SuggestMapItemBbox;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties$SuggestMapItemBbox;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties$SuggestMapItemBbox;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class SuperappSuggestMapItemViewProperties$SuggestMapItemBbox$$serializer implements uxs {
    public static final SuperappSuggestMapItemViewProperties$SuggestMapItemBbox$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SuperappSuggestMapItemViewProperties$SuggestMapItemBbox$$serializer superappSuggestMapItemViewProperties$SuggestMapItemBbox$$serializer = new SuperappSuggestMapItemViewProperties$SuggestMapItemBbox$$serializer();
        INSTANCE = superappSuggestMapItemViewProperties$SuggestMapItemBbox$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemViewProperties.SuggestMapItemBbox", superappSuggestMapItemViewProperties$SuggestMapItemBbox$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("bottomLeftCoordinate", false);
        pluginGeneratedSerialDescriptor.j("topRightCoordinate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SuperappSuggestMapItemViewProperties$SuggestMapItemBbox$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        SuperappSuggestMapItemViewProperties$SuggestMapLocation$$serializer superappSuggestMapItemViewProperties$SuggestMapLocation$$serializer = SuperappSuggestMapItemViewProperties$SuggestMapLocation$$serializer.INSTANCE;
        return new KSerializer[]{superappSuggestMapItemViewProperties$SuggestMapLocation$$serializer, superappSuggestMapItemViewProperties$SuggestMapLocation$$serializer};
    }

    @Override // defpackage.myi
    public final SuperappSuggestMapItemViewProperties.SuggestMapItemBbox deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        SuperappSuggestMapItemViewProperties.SuggestMapLocation suggestMapLocation = null;
        SuperappSuggestMapItemViewProperties.SuggestMapLocation suggestMapLocation2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                suggestMapLocation = (SuperappSuggestMapItemViewProperties.SuggestMapLocation) b.A(serialDescriptor, 0, SuperappSuggestMapItemViewProperties$SuggestMapLocation$$serializer.INSTANCE, suggestMapLocation);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                suggestMapLocation2 = (SuperappSuggestMapItemViewProperties.SuggestMapLocation) b.A(serialDescriptor, 1, SuperappSuggestMapItemViewProperties$SuggestMapLocation$$serializer.INSTANCE, suggestMapLocation2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new SuperappSuggestMapItemViewProperties.SuggestMapItemBbox(i, suggestMapLocation, suggestMapLocation2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SuperappSuggestMapItemViewProperties.SuggestMapItemBbox value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        SuperappSuggestMapItemViewProperties$SuggestMapLocation$$serializer superappSuggestMapItemViewProperties$SuggestMapLocation$$serializer = SuperappSuggestMapItemViewProperties$SuggestMapLocation$$serializer.INSTANCE;
        b.e(serialDescriptor, 0, superappSuggestMapItemViewProperties$SuggestMapLocation$$serializer, value.a);
        b.e(serialDescriptor, 1, superappSuggestMapItemViewProperties$SuggestMapLocation$$serializer, value.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
