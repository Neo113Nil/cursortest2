package com.yandex.plus.pay.data.mb.dto;

import com.yandex.plus.pay.data.mb.dto.PaymentSubmitResultDto;
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
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.mb.dto.PaymentSubmitResultDto", aVar, 3);
        pluginGeneratedSerialDescriptor.j("invoiceId", true);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("statusCode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = PaymentSubmitResultDto.d;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), i3yVarArr[1].getValue(), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = PaymentSubmitResultDto.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        PaymentSubmitResultDto.StatusDto statusDto = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                statusDto = (PaymentSubmitResultDto.StatusDto) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), statusDto);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new PaymentSubmitResultDto(i, str, statusDto, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        PaymentSubmitResultDto paymentSubmitResultDto = (PaymentSubmitResultDto) obj;
        String str = paymentSubmitResultDto.c;
        PaymentSubmitResultDto.StatusDto statusDto = paymentSubmitResultDto.b;
        String str2 = paymentSubmitResultDto.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = PaymentSubmitResultDto.d;
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 0, auu0.a, str2);
        }
        if (b.F() || statusDto != PaymentSubmitResultDto.StatusDto.UNKNOWN) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), statusDto);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 2, auu0.a, str);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
