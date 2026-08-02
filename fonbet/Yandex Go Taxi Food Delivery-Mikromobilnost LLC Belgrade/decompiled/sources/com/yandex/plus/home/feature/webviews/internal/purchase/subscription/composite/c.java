package com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite;

import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionInfo;
import com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError;
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
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements uxs {
    public static final c a;
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionInfo.Stories", cVar, 4);
        pluginGeneratedSerialDescriptor.j(ConfigConstants.CONFIG, false);
        pluginGeneratedSerialDescriptor.j("products", false);
        pluginGeneratedSerialDescriptor.j("error", false);
        pluginGeneratedSerialDescriptor.j("storyId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = CompositeSubscriptionInfo.Stories.$childSerializers;
        return new KSerializer[]{qke.n(com.yandex.plus.home.repository.api.model.webconfig.a.a), i3yVarArr[1].getValue(), qke.n((KSerializer) i3yVarArr[2].getValue()), auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = CompositeSubscriptionInfo.Stories.$childSerializers;
        b.getClass();
        boolean z = true;
        int i = 0;
        SubscriptionConfiguration subscriptionConfiguration = null;
        List list = null;
        SubscriptionInfoError subscriptionInfoError = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                subscriptionConfiguration = (SubscriptionConfiguration) b.s(serialDescriptor, 0, com.yandex.plus.home.repository.api.model.webconfig.a.a, subscriptionConfiguration);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                subscriptionInfoError = (SubscriptionInfoError) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), subscriptionInfoError);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new CompositeSubscriptionInfo.Stories(i, subscriptionConfiguration, list, subscriptionInfoError, str, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        CompositeSubscriptionInfo.Stories.write$Self$plus_home_feature_webviews_release((CompositeSubscriptionInfo.Stories) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
