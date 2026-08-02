package com.yandex.plus.home.feature.webviews.internalapi.subscription;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError;
import defpackage.auu0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements uxs {
    public static final e a;
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError.NoProductsByTarget", eVar, 6);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_MESSAGE, false);
        pluginGeneratedSerialDescriptor.j("place", false);
        pluginGeneratedSerialDescriptor.j("storyId", false);
        pluginGeneratedSerialDescriptor.j("targetId", false);
        pluginGeneratedSerialDescriptor.j(ErrorResponseData.JSON_ERROR_MESSAGE, false);
        pluginGeneratedSerialDescriptor.j("paymentMethod", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), auu0Var, qke.n(auu0Var), auu0Var};
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
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new SubscriptionInfoError.NoProductsByTarget(i, str, str2, str3, str4, str5, str6, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        SubscriptionInfoError.NoProductsByTarget.write$Self$plus_home_feature_webviews_release((SubscriptionInfoError.NoProductsByTarget) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
