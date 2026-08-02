package com.yandex.plus.home.repository.api.model.webconfig;

import com.yandex.plus.core.data.common.ColorPair;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sfc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements uxs {
    public static final d a;
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration.PayInfo", dVar, 4);
        pluginGeneratedSerialDescriptor.j("legalInfo", false);
        pluginGeneratedSerialDescriptor.j("oneClickLegalInfo", false);
        pluginGeneratedSerialDescriptor.j("textColor", false);
        pluginGeneratedSerialDescriptor.j(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = SubscriptionConfiguration.PayInfo.$childSerializers;
        return new KSerializer[]{qke.n(f.a), qke.n(h.a), sfc.a, i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = SubscriptionConfiguration.PayInfo.$childSerializers;
        b.getClass();
        boolean z = true;
        int i = 0;
        SubscriptionConfiguration.PayInfo.LegalInfo legalInfo = null;
        SubscriptionConfiguration.PayInfo.OneClickLegalInfo oneClickLegalInfo = null;
        ColorPair colorPair = null;
        PlusThemedColor plusThemedColor = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                legalInfo = (SubscriptionConfiguration.PayInfo.LegalInfo) b.s(serialDescriptor, 0, f.a, legalInfo);
                i |= 1;
            } else if (v == 1) {
                oneClickLegalInfo = (SubscriptionConfiguration.PayInfo.OneClickLegalInfo) b.s(serialDescriptor, 1, h.a, oneClickLegalInfo);
                i |= 2;
            } else if (v == 2) {
                colorPair = (ColorPair) b.A(serialDescriptor, 2, sfc.a, colorPair);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                plusThemedColor = (PlusThemedColor) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), plusThemedColor);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new SubscriptionConfiguration.PayInfo(i, legalInfo, oneClickLegalInfo, colorPair, plusThemedColor, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        SubscriptionConfiguration.PayInfo.write$Self$plus_home_domain_repository_api_release((SubscriptionConfiguration.PayInfo) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
