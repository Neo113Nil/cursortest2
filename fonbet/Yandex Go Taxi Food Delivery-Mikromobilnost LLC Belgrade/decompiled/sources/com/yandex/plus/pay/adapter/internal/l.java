package com.yandex.plus.pay.adapter.internal;

import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo$Item$Link$$serializer;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.psq0;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements uxs {
    public static final l a;
    private static final SerialDescriptor descriptor;

    static {
        l lVar = new l();
        a = lVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.adapter.internal.LegalInfoItemLinkImpl", lVar, 1);
        pluginGeneratedSerialDescriptor.j("actualItem", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{PlusPayLegalInfo$Item$Link$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        psq0 psq0Var = null;
        boolean z = true;
        int i = 0;
        PlusPayLegalInfo.Item.Link link = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                link = (PlusPayLegalInfo.Item.Link) b.A(serialDescriptor, 0, PlusPayLegalInfo$Item$Link$$serializer.INSTANCE, link);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new LegalInfoItemLinkImpl(i, link, psq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, PlusPayLegalInfo$Item$Link$$serializer.INSTANCE, ((LegalInfoItemLinkImpl) obj).actualItem);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
