package com.yandex.go.zone.dto.objects;

import androidx.media3.exoplayer.offline.DownloadService;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/TariffInfoGroupDefinition.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/TariffInfoGroupDefinition;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/TariffInfoGroupDefinition;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/TariffInfoGroupDefinition;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class TariffInfoGroupDefinition$$serializer implements uxs {
    public static final TariffInfoGroupDefinition$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TariffInfoGroupDefinition$$serializer tariffInfoGroupDefinition$$serializer = new TariffInfoGroupDefinition$$serializer();
        INSTANCE = tariffInfoGroupDefinition$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition", tariffInfoGroupDefinition$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j(DownloadService.KEY_REQUIREMENTS, true);
        pluginGeneratedSerialDescriptor.j("grouping_type", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("presentation", true);
        pluginGeneratedSerialDescriptor.j("bubble", true);
        pluginGeneratedSerialDescriptor.j("images", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TariffInfoGroupDefinition$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = TariffInfoGroupDefinition.i;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), qke.n(auu0Var), qke.n(auu0Var), qke.n(TariffInfoGroupDefinitionPresentation$$serializer.INSTANCE), qke.n(TariffInfoGroupDefinitionBubble$$serializer.INSTANCE), qke.n(TariffInfoGroupDefinitionImages$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final TariffInfoGroupDefinition deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TariffInfoGroupDefinition.i;
        b.getClass();
        TariffInfoGroupDefinition tariffInfoGroupDefinition = null;
        boolean z = true;
        TariffInfoGroupDefinitionImages tariffInfoGroupDefinitionImages = null;
        String str = null;
        List list = null;
        TariffGroupDefinitionType tariffGroupDefinitionType = null;
        String str2 = null;
        String str3 = null;
        TariffInfoGroupDefinitionPresentation tariffInfoGroupDefinitionPresentation = null;
        TariffInfoGroupDefinitionBubble tariffInfoGroupDefinitionBubble = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    tariffGroupDefinitionType = (TariffGroupDefinitionType) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), tariffGroupDefinitionType);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) b.s(serialDescriptor, 4, auu0.a, str3);
                    i |= 16;
                    break;
                case 5:
                    tariffInfoGroupDefinitionPresentation = (TariffInfoGroupDefinitionPresentation) b.s(serialDescriptor, 5, TariffInfoGroupDefinitionPresentation$$serializer.INSTANCE, tariffInfoGroupDefinitionPresentation);
                    i |= 32;
                    break;
                case 6:
                    tariffInfoGroupDefinitionBubble = (TariffInfoGroupDefinitionBubble) b.s(serialDescriptor, 6, TariffInfoGroupDefinitionBubble$$serializer.INSTANCE, tariffInfoGroupDefinitionBubble);
                    i |= 64;
                    break;
                case 7:
                    tariffInfoGroupDefinitionImages = (TariffInfoGroupDefinitionImages) b.s(serialDescriptor, 7, TariffInfoGroupDefinitionImages$$serializer.INSTANCE, tariffInfoGroupDefinitionImages);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return tariffInfoGroupDefinition;
            }
            tariffInfoGroupDefinition = null;
        }
        b.c(serialDescriptor);
        return new TariffInfoGroupDefinition(i, str, list, tariffGroupDefinitionType, str2, str3, tariffInfoGroupDefinitionPresentation, tariffInfoGroupDefinitionBubble, tariffInfoGroupDefinitionImages);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TariffInfoGroupDefinition value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TariffInfoGroupDefinition.i;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || value.c != TariffGroupDefinitionType.UNKNOWN) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, TariffInfoGroupDefinitionPresentation$$serializer.INSTANCE, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, TariffInfoGroupDefinitionBubble$$serializer.INSTANCE, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, TariffInfoGroupDefinitionImages$$serializer.INSTANCE, value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
