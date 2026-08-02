package com.yandex.plus.home.repository.api.model.webconfig;

import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements uxs {
    public static final j a;
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        a = jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration.Subscription", jVar, 7);
        pluginGeneratedSerialDescriptor.j("features", false);
        pluginGeneratedSerialDescriptor.j("isSilentPaymentEnabled", false);
        pluginGeneratedSerialDescriptor.j("buttonType", false);
        pluginGeneratedSerialDescriptor.j("paymentMethod", false);
        pluginGeneratedSerialDescriptor.j("widgetType", false);
        pluginGeneratedSerialDescriptor.j("targetId", false);
        pluginGeneratedSerialDescriptor.j("acquisitionParams", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = SubscriptionConfiguration.Subscription.$childSerializers;
        return new KSerializer[]{i3yVarArr[0].getValue(), z96.a, i3yVarArr[2].getValue(), i3yVarArr[3].getValue(), i3yVarArr[4].getValue(), auu0.a, qke.n(k.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = SubscriptionConfiguration.Subscription.$childSerializers;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        List list = null;
        SubscriptionConfiguration.Subscription.ButtonType buttonType = null;
        SubscriptionConfiguration.Subscription.PaymentMethod paymentMethod = null;
        SubscriptionConfiguration.Subscription.WidgetType widgetType = null;
        String str = null;
        SubscriptionConfiguration.Subscription.AcquisitionParams acquisitionParams = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    z2 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    buttonType = (SubscriptionConfiguration.Subscription.ButtonType) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), buttonType);
                    i |= 4;
                    break;
                case 3:
                    paymentMethod = (SubscriptionConfiguration.Subscription.PaymentMethod) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), paymentMethod);
                    i |= 8;
                    break;
                case 4:
                    widgetType = (SubscriptionConfiguration.Subscription.WidgetType) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), widgetType);
                    i |= 16;
                    break;
                case 5:
                    str = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    acquisitionParams = (SubscriptionConfiguration.Subscription.AcquisitionParams) b.s(serialDescriptor, 6, k.a, acquisitionParams);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new SubscriptionConfiguration.Subscription(i, list, z2, buttonType, paymentMethod, widgetType, str, acquisitionParams, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        SubscriptionConfiguration.Subscription.write$Self$plus_home_domain_repository_api_release((SubscriptionConfiguration.Subscription) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
