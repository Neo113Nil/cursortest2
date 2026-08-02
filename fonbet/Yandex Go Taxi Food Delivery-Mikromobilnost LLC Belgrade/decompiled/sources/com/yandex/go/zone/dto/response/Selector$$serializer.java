package com.yandex.go.zone.dto.response;

import com.yandex.go.zone.dto.response.Selector;
import defpackage.auu0;
import defpackage.c7v;
import defpackage.jxi;
import defpackage.n7v;
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
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/response/Selector.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/response/Selector;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/response/Selector;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/response/Selector;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class Selector$$serializer implements uxs {
    public static final Selector$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Selector$$serializer selector$$serializer = new Selector$$serializer();
        INSTANCE = selector$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.response.Selector", selector$$serializer, 8);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("tooltip", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("price_icon", true);
        pluginGeneratedSerialDescriptor.j("is_hidden", true);
        pluginGeneratedSerialDescriptor.j("hidden_percent", true);
        pluginGeneratedSerialDescriptor.j("highlighted_eta", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Selector$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        c7v c7vVar = c7v.a;
        return new KSerializer[]{n, n2, qke.n(c7vVar), qke.n(c7vVar), qke.n(c7vVar), z96.a, nor.a, qke.n(Selector$HighlightedEtaDto$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final Selector deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Selector selector = null;
        int i = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        n7v n7vVar = null;
        n7v n7vVar2 = null;
        n7v n7vVar3 = null;
        Selector.HighlightedEtaDto highlightedEtaDto = null;
        float f = 0.0f;
        boolean z2 = true;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    n7vVar = (n7v) b.s(serialDescriptor, 2, c7v.a, n7vVar);
                    i |= 4;
                    break;
                case 3:
                    n7vVar2 = (n7v) b.s(serialDescriptor, 3, c7v.a, n7vVar2);
                    i |= 8;
                    break;
                case 4:
                    n7vVar3 = (n7v) b.s(serialDescriptor, 4, c7v.a, n7vVar3);
                    i |= 16;
                    break;
                case 5:
                    z = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    f = b.y(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    highlightedEtaDto = (Selector.HighlightedEtaDto) b.s(serialDescriptor, 7, Selector$HighlightedEtaDto$$serializer.INSTANCE, highlightedEtaDto);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return selector;
            }
            selector = null;
        }
        b.c(serialDescriptor);
        return new Selector(i, str, str2, n7vVar, n7vVar2, n7vVar3, z, f, highlightedEtaDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Selector value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, c7v.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, c7v.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, c7v.a, value.e);
        }
        if (b.F() || value.f) {
            b.n(serialDescriptor, 5, value.f);
        }
        if (b.F() || Float.compare(value.g, 0.0f) != 0) {
            b.z(serialDescriptor, 6, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, Selector$HighlightedEtaDto$$serializer.INSTANCE, value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
