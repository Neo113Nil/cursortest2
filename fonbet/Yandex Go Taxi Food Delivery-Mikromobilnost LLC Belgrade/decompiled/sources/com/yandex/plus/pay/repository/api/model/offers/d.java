package com.yandex.plus.pay.repository.api.model.offers;

import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.pay.repository.api.model.offers.RichText;
import defpackage.auu0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.psq0;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.xpd0;
import defpackage.yjd;
import io.appmetrica.analytics.rtm.internal.Constants;
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
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.repository.api.model.offers.RichText.Item.Icon", dVar, 4);
        pluginGeneratedSerialDescriptor.j("altText", false);
        pluginGeneratedSerialDescriptor.j("key", false);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_DATA, true);
        pluginGeneratedSerialDescriptor.j("image", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n(auu0Var), xpd0.a};
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
        PlusThemedImage plusThemedImage = null;
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
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                plusThemedImage = (PlusThemedImage) b.A(serialDescriptor, 3, xpd0.a, plusThemedImage);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new RichText.Item.Icon(i, str, str2, str3, plusThemedImage, (psq0) null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        RichText.Item.Icon.write$Self$pay_sdk_domain_repository_api_release((RichText.Item.Icon) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
