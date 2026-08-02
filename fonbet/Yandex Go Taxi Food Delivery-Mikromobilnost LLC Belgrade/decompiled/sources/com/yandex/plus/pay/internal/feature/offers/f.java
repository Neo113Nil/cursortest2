package com.yandex.plus.pay.internal.feature.offers;

import com.yandex.plus.pay.internal.feature.offers.PlusPayOfferDetailsConfiguration;
import com.yandex.plus.pay.internal.model.PlusPayUpsaleStep;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements uxs {
    public static final f a;
    private static final SerialDescriptor descriptor;

    static {
        f fVar = new f();
        a = fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.internal.feature.offers.PlusPayOfferDetailsConfiguration.AdditionalOffers.Offer", fVar, 5);
        pluginGeneratedSerialDescriptor.j("offerName", false);
        pluginGeneratedSerialDescriptor.j("offersBatchId", false);
        pluginGeneratedSerialDescriptor.j("positionId", false);
        pluginGeneratedSerialDescriptor.j("upsaleStep", false);
        pluginGeneratedSerialDescriptor.j("isSelected", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = PlusPayOfferDetailsConfiguration.AdditionalOffers.Offer.$childSerializers;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, i3yVarArr[3].getValue(), z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = PlusPayOfferDetailsConfiguration.AdditionalOffers.Offer.$childSerializers;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        PlusPayUpsaleStep plusPayUpsaleStep = null;
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
                str3 = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                plusPayUpsaleStep = (PlusPayUpsaleStep) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), plusPayUpsaleStep);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new PlusPayOfferDetailsConfiguration.AdditionalOffers.Offer(i, str, str2, str3, plusPayUpsaleStep, z2, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        PlusPayOfferDetailsConfiguration.AdditionalOffers.Offer.write$Self$pay_sdk_release((PlusPayOfferDetailsConfiguration.AdditionalOffers.Offer) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
