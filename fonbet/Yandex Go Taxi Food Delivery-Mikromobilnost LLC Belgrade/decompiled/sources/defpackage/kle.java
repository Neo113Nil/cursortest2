package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.delivery.models.data.experiment.SkipAlertCondition;

/* loaded from: classes9.dex */
public final /* synthetic */ class kle implements uxs {
    public static final kle a;
    private static final SerialDescriptor descriptor;

    static {
        kle kleVar = new kle();
        a = kleVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.models.data.experiment.ContinueWithRequirementAlertCondition", kleVar, 2);
        pluginGeneratedSerialDescriptor.j(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, true);
        pluginGeneratedSerialDescriptor.j("skip_alert_condition", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, mle.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = mle.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        SkipAlertCondition skipAlertCondition = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                skipAlertCondition = (SkipAlertCondition) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), skipAlertCondition);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new mle(i, str, skipAlertCondition);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mle mleVar = (mle) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = mle.c;
        if (b.F() || !jl40.l(mleVar.a, "")) {
            b.o(serialDescriptor, 0, mleVar.a);
        }
        if (b.F() || mleVar.b != SkipAlertCondition.NEVER) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), mleVar.b);
        }
        b.c(serialDescriptor);
    }
}
