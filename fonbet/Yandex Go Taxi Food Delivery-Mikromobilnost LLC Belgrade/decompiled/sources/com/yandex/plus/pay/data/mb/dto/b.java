package com.yandex.plus.pay.data.mb.dto;

import com.yandex.plus.pay.data.mb.dto.SubscriptionInfoDto;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.x0v0;
import defpackage.yjd;
import defpackage.z0v0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements uxs {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.mb.dto.SubscriptionInfoDto", bVar, 4);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("statusCode", true);
        pluginGeneratedSerialDescriptor.j("synchronizationState", true);
        pluginGeneratedSerialDescriptor.j("trust3dsInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{SubscriptionInfoDto.e[0].getValue(), qke.n(auu0.a), qke.n(d.a), qke.n(x0v0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SubscriptionInfoDto.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        SubscriptionInfoDto.SubscriptionStatusDto subscriptionStatusDto = null;
        String str = null;
        SubscriptionInfoDto.a aVar = null;
        z0v0 z0v0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                subscriptionStatusDto = (SubscriptionInfoDto.SubscriptionStatusDto) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), subscriptionStatusDto);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                aVar = (SubscriptionInfoDto.a) b.s(serialDescriptor, 2, d.a, aVar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                z0v0Var = (z0v0) b.s(serialDescriptor, 3, x0v0.a, z0v0Var);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new SubscriptionInfoDto(i, subscriptionStatusDto, str, aVar, z0v0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SubscriptionInfoDto subscriptionInfoDto = (SubscriptionInfoDto) obj;
        z0v0 z0v0Var = subscriptionInfoDto.d;
        SubscriptionInfoDto.a aVar = subscriptionInfoDto.c;
        String str = subscriptionInfoDto.b;
        SubscriptionInfoDto.SubscriptionStatusDto subscriptionStatusDto = subscriptionInfoDto.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SubscriptionInfoDto.e;
        if (b.F() || subscriptionStatusDto != SubscriptionInfoDto.SubscriptionStatusDto.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), subscriptionStatusDto);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 1, auu0.a, str);
        }
        if (b.F() || aVar != null) {
            b.g(serialDescriptor, 2, d.a, aVar);
        }
        if (b.F() || z0v0Var != null) {
            b.g(serialDescriptor, 3, x0v0.a, z0v0Var);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
