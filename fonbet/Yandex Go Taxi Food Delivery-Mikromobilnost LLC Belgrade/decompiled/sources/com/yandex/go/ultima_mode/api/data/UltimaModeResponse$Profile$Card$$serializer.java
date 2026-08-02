package com.yandex.go.ultima_mode.api.data;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.SlotItemDto$$serializer;
import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/ultima_mode/api/data/UltimaModeResponse.Profile.Card.$serializer", "Luxs;", "Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse$Profile$Card;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse$Profile$Card;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse$Profile$Card;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "go-client-android.features.ultima_mode:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class UltimaModeResponse$Profile$Card$$serializer implements uxs {
    public static final UltimaModeResponse$Profile$Card$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        UltimaModeResponse$Profile$Card$$serializer ultimaModeResponse$Profile$Card$$serializer = new UltimaModeResponse$Profile$Card$$serializer();
        INSTANCE = ultimaModeResponse$Profile$Card$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.ultima_mode.api.data.UltimaModeResponse.Profile.Card", ultimaModeResponse$Profile$Card$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("progress_bar", true);
        pluginGeneratedSerialDescriptor.j("plus", true);
        pluginGeneratedSerialDescriptor.j("concierge", true);
        pluginGeneratedSerialDescriptor.j("mode_switcher", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UltimaModeResponse$Profile$Card$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(UltimaModeResponse$Title$$serializer.INSTANCE);
        KSerializer n2 = qke.n(UltimaModeResponse$Subtitle$$serializer.INSTANCE);
        KSerializer n3 = qke.n(UltimaModeResponse$ProgressBar$$serializer.INSTANCE);
        SlotItemDto$$serializer slotItemDto$$serializer = SlotItemDto$$serializer.INSTANCE;
        return new KSerializer[]{n, n2, n3, qke.n(slotItemDto$$serializer), qke.n(slotItemDto$$serializer), qke.n(slotItemDto$$serializer)};
    }

    @Override // defpackage.myi
    public final UltimaModeResponse.Profile.Card deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        UltimaModeResponse.Title title = null;
        UltimaModeResponse.Subtitle subtitle = null;
        UltimaModeResponse.ProgressBar progressBar = null;
        SlotItemDto slotItemDto = null;
        SlotItemDto slotItemDto2 = null;
        SlotItemDto slotItemDto3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    title = (UltimaModeResponse.Title) b.s(serialDescriptor, 0, UltimaModeResponse$Title$$serializer.INSTANCE, title);
                    i |= 1;
                    break;
                case 1:
                    subtitle = (UltimaModeResponse.Subtitle) b.s(serialDescriptor, 1, UltimaModeResponse$Subtitle$$serializer.INSTANCE, subtitle);
                    i |= 2;
                    break;
                case 2:
                    progressBar = (UltimaModeResponse.ProgressBar) b.s(serialDescriptor, 2, UltimaModeResponse$ProgressBar$$serializer.INSTANCE, progressBar);
                    i |= 4;
                    break;
                case 3:
                    slotItemDto = (SlotItemDto) b.s(serialDescriptor, 3, SlotItemDto$$serializer.INSTANCE, slotItemDto);
                    i |= 8;
                    break;
                case 4:
                    slotItemDto2 = (SlotItemDto) b.s(serialDescriptor, 4, SlotItemDto$$serializer.INSTANCE, slotItemDto2);
                    i |= 16;
                    break;
                case 5:
                    slotItemDto3 = (SlotItemDto) b.s(serialDescriptor, 5, SlotItemDto$$serializer.INSTANCE, slotItemDto3);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new UltimaModeResponse.Profile.Card(i, title, subtitle, progressBar, slotItemDto, slotItemDto2, slotItemDto3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, UltimaModeResponse.Profile.Card value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, UltimaModeResponse$Title$$serializer.INSTANCE, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, UltimaModeResponse$Subtitle$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, UltimaModeResponse$ProgressBar$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, SlotItemDto$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, SlotItemDto$$serializer.INSTANCE, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, SlotItemDto$$serializer.INSTANCE, value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
