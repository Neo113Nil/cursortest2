package defpackage;

import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionProduct;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class gsd implements uxs {
    public static final gsd a;
    private static final SerialDescriptor descriptor;

    static {
        gsd gsdVar = new gsd();
        a = gsdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionProduct", gsdVar, 1);
        pluginGeneratedSerialDescriptor.j("offer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = CompositeSubscriptionProduct.$childSerializers;
        return new KSerializer[]{i3yVarArr[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = CompositeSubscriptionProduct.$childSerializers;
        b.getClass();
        psq0 psq0Var = null;
        boolean z = true;
        int i = 0;
        PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                plusPaySdkAdapter$CompositeOffer = (PlusPaySdkAdapter$CompositeOffer) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), plusPaySdkAdapter$CompositeOffer);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new CompositeSubscriptionProduct(i, plusPaySdkAdapter$CompositeOffer, psq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, (KSerializer) CompositeSubscriptionProduct.$childSerializers[0].getValue(), ((CompositeSubscriptionProduct) obj).offer);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
