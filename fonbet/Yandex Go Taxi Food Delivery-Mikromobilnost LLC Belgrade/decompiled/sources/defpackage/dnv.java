package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseErrorTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseStatusTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final /* synthetic */ class dnv implements uxs {
    public static final dnv a;
    private static final SerialDescriptor descriptor;

    static {
        dnv dnvVar = new dnv();
        a = dnvVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("PURCHASE_PRODUCT_RESPONSE", dnvVar, 5);
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
        i3y[] i3yVarArr = fnv.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = fnv.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        PurchaseTypeDto purchaseTypeDto = null;
        PurchaseStatusTypeDto purchaseStatusTypeDto = null;
        PurchaseErrorTypeDto purchaseErrorTypeDto = null;
        String str2 = null;
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
                purchaseErrorTypeDto = (PurchaseErrorTypeDto) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), purchaseErrorTypeDto);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new fnv(i, str, purchaseTypeDto, purchaseStatusTypeDto, purchaseErrorTypeDto, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fnv fnvVar = (fnv) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = fnv.f;
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 0, auu0Var, fnvVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), fnvVar.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), fnvVar.c);
        b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), fnvVar.d);
        b.g(serialDescriptor, 4, auu0Var, fnvVar.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
