package com.yandex.plus.home.repository.api.model.webconfig;

import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import defpackage.auu0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration", aVar, 5);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("subscription", false);
        pluginGeneratedSerialDescriptor.j("payInfo", false);
        pluginGeneratedSerialDescriptor.j("payButton", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, j.a, d.a, b.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        SubscriptionConfiguration.Subscription subscription = null;
        SubscriptionConfiguration.PayInfo payInfo = null;
        SubscriptionConfiguration.PayButton payButton = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                subscription = (SubscriptionConfiguration.Subscription) b.A(serialDescriptor, 2, j.a, subscription);
                i |= 4;
            } else if (v == 3) {
                payInfo = (SubscriptionConfiguration.PayInfo) b.A(serialDescriptor, 3, d.a, payInfo);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                payButton = (SubscriptionConfiguration.PayButton) b.A(serialDescriptor, 4, b.a, payButton);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new SubscriptionConfiguration(i, str, str2, subscription, payInfo, payButton, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        SubscriptionConfiguration.write$Self$plus_home_domain_repository_api_release((SubscriptionConfiguration) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
