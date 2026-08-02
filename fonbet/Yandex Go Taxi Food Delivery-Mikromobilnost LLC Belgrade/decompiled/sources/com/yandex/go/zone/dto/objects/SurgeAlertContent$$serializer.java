package com.yandex.go.zone.dto.objects;

import com.adjust.sdk.Constants;
import defpackage.auu0;
import defpackage.jl40;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/SurgeAlertContent.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/SurgeAlertContent;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/SurgeAlertContent;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/SurgeAlertContent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes15.dex */
public final /* synthetic */ class SurgeAlertContent$$serializer implements uxs {
    public static final SurgeAlertContent$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SurgeAlertContent$$serializer surgeAlertContent$$serializer = new SurgeAlertContent$$serializer();
        INSTANCE = surgeAlertContent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.SurgeAlertContent", surgeAlertContent$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("balance", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, true);
        pluginGeneratedSerialDescriptor.j("action_button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SurgeAlertContent$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{SurgeAlertContentBalance$$serializer.INSTANCE, SurgeAlertContentTitle$$serializer.INSTANCE, auu0.a, SurgeBlizzardContentActionButton$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final SurgeAlertContent deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        SurgeAlertContentBalance surgeAlertContentBalance = null;
        SurgeAlertContentTitle surgeAlertContentTitle = null;
        String str = null;
        SurgeBlizzardContentActionButton surgeBlizzardContentActionButton = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                surgeAlertContentBalance = (SurgeAlertContentBalance) b.A(serialDescriptor, 0, SurgeAlertContentBalance$$serializer.INSTANCE, surgeAlertContentBalance);
                i |= 1;
            } else if (v == 1) {
                surgeAlertContentTitle = (SurgeAlertContentTitle) b.A(serialDescriptor, 1, SurgeAlertContentTitle$$serializer.INSTANCE, surgeAlertContentTitle);
                i |= 2;
            } else if (v == 2) {
                str = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                surgeBlizzardContentActionButton = (SurgeBlizzardContentActionButton) b.A(serialDescriptor, 3, SurgeBlizzardContentActionButton$$serializer.INSTANCE, surgeBlizzardContentActionButton);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new SurgeAlertContent(i, surgeAlertContentBalance, surgeAlertContentTitle, str, surgeBlizzardContentActionButton);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SurgeAlertContent value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, new SurgeAlertContentBalance(0))) {
            b.e(serialDescriptor, 0, SurgeAlertContentBalance$$serializer.INSTANCE, value.a);
        }
        if (b.F() || !jl40.l(value.b, new SurgeAlertContentTitle(0))) {
            b.e(serialDescriptor, 1, SurgeAlertContentTitle$$serializer.INSTANCE, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || !jl40.l(value.d, new SurgeBlizzardContentActionButton(0))) {
            b.e(serialDescriptor, 3, SurgeBlizzardContentActionButton$$serializer.INSTANCE, value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
