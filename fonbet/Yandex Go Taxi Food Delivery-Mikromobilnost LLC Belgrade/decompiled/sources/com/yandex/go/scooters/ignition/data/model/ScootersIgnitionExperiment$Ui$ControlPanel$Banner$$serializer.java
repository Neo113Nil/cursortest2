package com.yandex.go.scooters.ignition.data.model;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
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
import defpackage.w7s;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment.Ui.ControlPanel.Banner.$serializer", "Luxs;", "Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$ControlPanel$Banner;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$ControlPanel$Banner;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$ControlPanel$Banner;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ScootersIgnitionExperiment$Ui$ControlPanel$Banner$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ScootersIgnitionExperiment$Ui$ControlPanel$Banner$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScootersIgnitionExperiment$Ui$ControlPanel$Banner$$serializer scootersIgnitionExperiment$Ui$ControlPanel$Banner$$serializer = new ScootersIgnitionExperiment$Ui$ControlPanel$Banner$$serializer();
        INSTANCE = scootersIgnitionExperiment$Ui$ControlPanel$Banner$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment.Ui.ControlPanel.Banner", scootersIgnitionExperiment$Ui$ControlPanel$Banner$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        pluginGeneratedSerialDescriptor.j("promotion_id", true);
        pluginGeneratedSerialDescriptor.j("action_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScootersIgnitionExperiment$Ui$ControlPanel$Banner$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ScootersIgnitionExperiment.Ui.ControlPanel.Banner.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, w7s.a, auu0Var, qke.n(ScootersIgnitionExperiment$Ui$ControlPanel$Badge$$serializer.INSTANCE), auu0Var, i3yVarArr[5].getValue()};
    }

    @Override // defpackage.myi
    public final ScootersIgnitionExperiment.Ui.ControlPanel.Banner deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersIgnitionExperiment.Ui.ControlPanel.Banner.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        FormattedText formattedText = null;
        String str2 = null;
        ScootersIgnitionExperiment.Ui.ControlPanel.Badge badge = null;
        String str3 = null;
        ScootersIgnitionExperiment.Ui.ControlPanel.ActionType actionType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    badge = (ScootersIgnitionExperiment.Ui.ControlPanel.Badge) b.s(serialDescriptor, 3, ScootersIgnitionExperiment$Ui$ControlPanel$Badge$$serializer.INSTANCE, badge);
                    i |= 8;
                    break;
                case 4:
                    str3 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    actionType = (ScootersIgnitionExperiment.Ui.ControlPanel.ActionType) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), actionType);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ScootersIgnitionExperiment.Ui.ControlPanel.Banner(i, str, formattedText, str2, badge, str3, actionType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScootersIgnitionExperiment.Ui.ControlPanel.Banner value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersIgnitionExperiment.Ui.ControlPanel.Banner.g;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, ScootersIgnitionExperiment$Ui$ControlPanel$Badge$$serializer.INSTANCE, value.d);
        }
        if (b.F() || !jl40.l(value.e, "")) {
            b.o(serialDescriptor, 4, value.e);
        }
        if (b.F() || value.f != ScootersIgnitionExperiment.Ui.ControlPanel.ActionType.PROMOTION) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
