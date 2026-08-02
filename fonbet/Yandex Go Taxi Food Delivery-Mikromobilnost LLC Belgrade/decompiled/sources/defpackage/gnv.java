package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseStatusTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final /* synthetic */ class gnv implements uxs {
    public static final gnv a;
    private static final SerialDescriptor descriptor;

    static {
        gnv gnvVar = new gnv();
        a = gnvVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("PURCHASE_PRODUCT_RESULT", gnvVar, 5);
        pluginGeneratedSerialDescriptor.j("trackId", false);
        pluginGeneratedSerialDescriptor.j("purchaseType", false);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, false);
        pluginGeneratedSerialDescriptor.j("errorType", false);
        pluginGeneratedSerialDescriptor.j(ErrorResponseData.JSON_ERROR_MESSAGE, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = inv.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = inv.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        PurchaseTypeDto purchaseTypeDto = null;
        PurchaseStatusTypeDto purchaseStatusTypeDto = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                purchaseTypeDto = (PurchaseTypeDto) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), purchaseTypeDto);
                i |= 2;
            } else if (v == 2) {
                purchaseStatusTypeDto = (PurchaseStatusTypeDto) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), purchaseStatusTypeDto);
                i |= 4;
            } else if (v == 3) {
                str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str3 = (String) b.s(serialDescriptor, 4, auu0.a, str3);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new inv(i, str, purchaseTypeDto, purchaseStatusTypeDto, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        inv invVar = (inv) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = inv.f;
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 0, auu0Var, invVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), invVar.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), invVar.c);
        b.g(serialDescriptor, 3, auu0Var, invVar.d);
        b.g(serialDescriptor, 4, auu0Var, invVar.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
