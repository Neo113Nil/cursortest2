package com.yandex.plus.home.repository.api.model.webconfig;

import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements uxs {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration.PayButton", bVar, 4);
        pluginGeneratedSerialDescriptor.j("trialText", false);
        pluginGeneratedSerialDescriptor.j("noTrialText", false);
        pluginGeneratedSerialDescriptor.j("textColor", false);
        pluginGeneratedSerialDescriptor.j(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = SubscriptionConfiguration.PayButton.$childSerializers;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[2].getValue(), qke.n((KSerializer) i3yVarArr[3].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = SubscriptionConfiguration.PayButton.$childSerializers;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        PlusThemedColor plusThemedColor = null;
        PlusThemedColor plusThemedColor2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                plusThemedColor = (PlusThemedColor) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), plusThemedColor);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                plusThemedColor2 = (PlusThemedColor) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), plusThemedColor2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new SubscriptionConfiguration.PayButton(i, str, str2, plusThemedColor, plusThemedColor2, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        SubscriptionConfiguration.PayButton.write$Self$plus_home_domain_repository_api_release((SubscriptionConfiguration.PayButton) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
