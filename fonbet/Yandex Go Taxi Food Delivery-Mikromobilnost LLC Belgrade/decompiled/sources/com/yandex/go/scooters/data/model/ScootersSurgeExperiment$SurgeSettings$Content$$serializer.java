package com.yandex.go.scooters.data.model;

import com.yandex.go.scooters.data.model.ScootersSurgeExperiment;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/data/model/ScootersSurgeExperiment.SurgeSettings.Content.$serializer", "Luxs;", "Lcom/yandex/go/scooters/data/model/ScootersSurgeExperiment$SurgeSettings$Content;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/data/model/ScootersSurgeExperiment$SurgeSettings$Content;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/data/model/ScootersSurgeExperiment$SurgeSettings$Content;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ScootersSurgeExperiment$SurgeSettings$Content$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ScootersSurgeExperiment$SurgeSettings$Content$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScootersSurgeExperiment$SurgeSettings$Content$$serializer scootersSurgeExperiment$SurgeSettings$Content$$serializer = new ScootersSurgeExperiment$SurgeSettings$Content$$serializer();
        INSTANCE = scootersSurgeExperiment$SurgeSettings$Content$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.data.model.ScootersSurgeExperiment.SurgeSettings.Content", scootersSurgeExperiment$SurgeSettings$Content$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("button", true);
        pluginGeneratedSerialDescriptor.j("main_section", true);
        pluginGeneratedSerialDescriptor.j("default_description_section", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScootersSurgeExperiment$SurgeSettings$Content$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ScootersSurgeExperiment.SurgeSettings.Content.f;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, w7sVar, auu0.a, i3yVarArr[3].getValue(), i3yVarArr[4].getValue()};
    }

    @Override // defpackage.myi
    public final ScootersSurgeExperiment.SurgeSettings.Content deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersSurgeExperiment.SurgeSettings.Content.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        List list2 = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
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
                list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list2 = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new ScootersSurgeExperiment.SurgeSettings.Content(i, str, list, list2, formattedText, formattedText2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScootersSurgeExperiment.SurgeSettings.Content value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersSurgeExperiment.SurgeSettings.Content.f;
        if (b.F() || !jl40.l(value.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, value.a);
        }
        if (b.F() || !jl40.l(value.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(value.d, emptyList)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        }
        if (b.F() || !jl40.l(value.e, emptyList)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
