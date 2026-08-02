package com.yandex.go.lootbox.impl.data.entities.network.common.gift;

import com.yandex.go.lootbox.impl.data.entities.network.common.action.b;
import com.yandex.go.lootbox.impl.data.entities.network.common.action.d;
import defpackage.auu0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.soz;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/lootbox/impl/data/entities/network/common/gift/LootBoxGiftDto.$serializer", "Luxs;", "Lcom/yandex/go/lootbox/impl/data/entities/network/common/gift/LootBoxGiftDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/lootbox/impl/data/entities/network/common/gift/LootBoxGiftDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/lootbox/impl/data/entities/network/common/gift/LootBoxGiftDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class LootBoxGiftDto$$serializer implements uxs {
    public static final LootBoxGiftDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LootBoxGiftDto$$serializer lootBoxGiftDto$$serializer = new LootBoxGiftDto$$serializer();
        INSTANCE = lootBoxGiftDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.lootbox.impl.data.entities.network.common.gift.LootBoxGiftDto", lootBoxGiftDto$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("lead_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("lootbox_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LootBoxGiftDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{w7sVar, w7sVar, auu0Var, auu0Var, soz.e};
    }

    @Override // defpackage.myi
    public final LootBoxGiftDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        String str = null;
        String str2 = null;
        b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                formattedText2 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText2);
                i |= 2;
            } else if (v == 2) {
                str = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                str2 = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                bVar = (b) b.A(serialDescriptor, 4, soz.e, bVar);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new LootBoxGiftDto(i, formattedText, formattedText2, str, str2, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LootBoxGiftDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !nzs.t(0, value.a)) {
            b.e(serialDescriptor, 0, w7s.a, value.a);
        }
        if (b.F() || !nzs.t(0, value.b)) {
            b.e(serialDescriptor, 1, w7s.a, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 3, value.d);
        }
        if (b.F() || !jl40.l(value.e, d.INSTANCE)) {
            b.e(serialDescriptor, 4, soz.e, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
