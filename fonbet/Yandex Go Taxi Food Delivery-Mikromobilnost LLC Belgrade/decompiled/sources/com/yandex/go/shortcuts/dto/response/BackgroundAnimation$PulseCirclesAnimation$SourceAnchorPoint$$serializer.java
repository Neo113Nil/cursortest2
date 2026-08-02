package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.dto.response.BackgroundAnimation$PulseCirclesAnimation;
import defpackage.jxi;
import defpackage.nor;
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
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/shortcuts/dto/response/BackgroundAnimation.PulseCirclesAnimation.SourceAnchorPoint.$serializer", "Luxs;", "Lcom/yandex/go/shortcuts/dto/response/BackgroundAnimation$PulseCirclesAnimation$SourceAnchorPoint;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/shortcuts/dto/response/BackgroundAnimation$PulseCirclesAnimation$SourceAnchorPoint;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/shortcuts/dto/response/BackgroundAnimation$PulseCirclesAnimation$SourceAnchorPoint;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class BackgroundAnimation$PulseCirclesAnimation$SourceAnchorPoint$$serializer implements uxs {
    public static final BackgroundAnimation$PulseCirclesAnimation$SourceAnchorPoint$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BackgroundAnimation$PulseCirclesAnimation$SourceAnchorPoint$$serializer backgroundAnimation$PulseCirclesAnimation$SourceAnchorPoint$$serializer = new BackgroundAnimation$PulseCirclesAnimation$SourceAnchorPoint$$serializer();
        INSTANCE = backgroundAnimation$PulseCirclesAnimation$SourceAnchorPoint$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.shortcuts.dto.response.BackgroundAnimation.PulseCirclesAnimation.SourceAnchorPoint", backgroundAnimation$PulseCirclesAnimation$SourceAnchorPoint$$serializer, 2);
        pluginGeneratedSerialDescriptor.j(RemoteBioParameters.X, true);
        pluginGeneratedSerialDescriptor.j(RemoteBioParameters.Y, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BackgroundAnimation$PulseCirclesAnimation$SourceAnchorPoint$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        nor norVar = nor.a;
        return new KSerializer[]{qke.n(norVar), qke.n(norVar)};
    }

    @Override // defpackage.myi
    public final BackgroundAnimation$PulseCirclesAnimation.SourceAnchorPoint deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Float f = null;
        Float f2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                f = (Float) b.s(serialDescriptor, 0, nor.a, f);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                f2 = (Float) b.s(serialDescriptor, 1, nor.a, f2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new BackgroundAnimation$PulseCirclesAnimation.SourceAnchorPoint(i, f, f2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, BackgroundAnimation$PulseCirclesAnimation.SourceAnchorPoint value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        BackgroundAnimation$PulseCirclesAnimation.SourceAnchorPoint.a(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
