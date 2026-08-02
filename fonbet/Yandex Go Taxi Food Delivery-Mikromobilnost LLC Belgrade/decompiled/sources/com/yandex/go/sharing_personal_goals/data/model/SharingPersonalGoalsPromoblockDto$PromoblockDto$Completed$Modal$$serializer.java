package com.yandex.go.sharing_personal_goals.data.model;

import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed;
import defpackage.auu0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/sharing_personal_goals/data/model/SharingPersonalGoalsPromoblockDto.PromoblockDto.Completed.Modal.$serializer", "Luxs;", "Lcom/yandex/go/sharing_personal_goals/data/model/SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Modal;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/sharing_personal_goals/data/model/SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Modal;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/sharing_personal_goals/data/model/SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Modal;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Modal$$serializer implements uxs {
    public static final int $stable = 0;
    public static final SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Modal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Modal$$serializer sharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Modal$$serializer = new SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Modal$$serializer();
        INSTANCE = sharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Modal$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockDto.PromoblockDto.Completed.Modal", sharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Modal$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("lottie_json_url", true);
        pluginGeneratedSerialDescriptor.j("button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Modal$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        KSerializer n = qke.n(w7sVar);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{w7sVar, n, qke.n(auu0Var), qke.n(auu0Var), qke.n(SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Button$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.Modal deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        String str = null;
        String str2 = null;
        SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.Button button = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                formattedText2 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText2);
                i |= 2;
            } else if (v == 2) {
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            } else if (v == 3) {
                str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                button = (SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.Button) b.s(serialDescriptor, 4, SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Button$$serializer.INSTANCE, button);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.Modal(i, formattedText, formattedText2, str, str2, button);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.Modal value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, w7s.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Button$$serializer.INSTANCE, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
