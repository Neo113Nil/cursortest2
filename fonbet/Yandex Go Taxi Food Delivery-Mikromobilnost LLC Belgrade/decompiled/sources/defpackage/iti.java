package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.e;

/* loaded from: classes9.dex */
public final /* synthetic */ class iti implements uxs {
    public static final iti a;
    private static final SerialDescriptor descriptor;

    static {
        iti itiVar = new iti();
        a = itiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.DeliveryTariffsCommentRedirectionsExperiment.RuleType.D2dRule", itiVar, 1);
        pluginGeneratedSerialDescriptor.j("screens", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{e.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = e.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        jsq0 jsq0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                jsq0Var = (jsq0) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), jsq0Var);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new e(i, jsq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e eVar = (e) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = e.b;
        if (b.F() || !jl40.l(eVar.a, ksq0.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), eVar.a);
        }
        b.c(serialDescriptor);
    }
}
