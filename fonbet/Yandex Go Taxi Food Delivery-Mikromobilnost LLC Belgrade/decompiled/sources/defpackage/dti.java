package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.DeliveryTariffsCommentRedirectionsExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class dti implements uxs {
    public static final dti a;
    private static final SerialDescriptor descriptor;

    static {
        dti dtiVar = new dti();
        a = dtiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.DeliveryTariffsCommentRedirectionsExperiment", dtiVar, 3);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("tariff_rules", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = DeliveryTariffsCommentRedirectionsExperiment.e;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = DeliveryTariffsCommentRedirectionsExperiment.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Map map = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new DeliveryTariffsCommentRedirectionsExperiment(i, list, map, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        DeliveryTariffsCommentRedirectionsExperiment deliveryTariffsCommentRedirectionsExperiment = (DeliveryTariffsCommentRedirectionsExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = DeliveryTariffsCommentRedirectionsExperiment.e;
        if (b.F() || deliveryTariffsCommentRedirectionsExperiment.b) {
            b.n(serialDescriptor, 0, deliveryTariffsCommentRedirectionsExperiment.b);
        }
        if (b.F() || !jl40.l(deliveryTariffsCommentRedirectionsExperiment.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), deliveryTariffsCommentRedirectionsExperiment.c);
        }
        if (b.F() || !jl40.l(deliveryTariffsCommentRedirectionsExperiment.d, EmptyList.a)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), deliveryTariffsCommentRedirectionsExperiment.d);
        }
        b.c(serialDescriptor);
    }
}
