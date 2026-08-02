package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.pay.data.mb.dto.CompositeOfferDto$Vendor;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final /* synthetic */ class lod implements uxs {
    public static final lod a;
    private static final SerialDescriptor descriptor;

    static {
        lod lodVar = new lod();
        a = lodVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.mb.dto.CompositeOfferDto.Option", lodVar, 11);
        pluginGeneratedSerialDescriptor.j("additionText", true);
        pluginGeneratedSerialDescriptor.j("commonPeriod", false);
        pluginGeneratedSerialDescriptor.j("commonPrice", false);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("offerVendorType", true);
        pluginGeneratedSerialDescriptor.j("payload", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j(PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX, false);
        pluginGeneratedSerialDescriptor.j("plans", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = qod.l;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), auu0Var, gpd.a, qke.n(auu0Var), auu0Var, i3yVarArr[5].getValue(), qke.n((KSerializer) i3yVarArr[6].getValue()), qke.n(auu0Var), auu0Var, nod.a, i3yVarArr[10].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = qod.l;
        b.getClass();
        List list = null;
        pod podVar = null;
        boolean z = true;
        String str = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        ipd ipdVar = null;
        String str4 = null;
        String str5 = null;
        CompositeOfferDto$Vendor compositeOfferDto$Vendor = null;
        Map map = null;
        String str6 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr = i3yVarArr2;
                    z = false;
                    break;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    str2 = (String) b.s(serialDescriptor, 0, auu0.a, str2);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    str3 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    ipdVar = (ipd) b.A(serialDescriptor, 2, gpd.a, ipdVar);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    str5 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    compositeOfferDto$Vendor = (CompositeOfferDto$Vendor) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), compositeOfferDto$Vendor);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    map = (Map) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), map);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    str = (String) b.s(serialDescriptor, 7, auu0.a, str);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    str6 = b.k(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    podVar = (pod) b.A(serialDescriptor, 9, nod.a, podVar);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    list = (List) b.A(serialDescriptor, 10, (myi) i3yVarArr2[10].getValue(), list);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new qod(i, str2, str3, ipdVar, str4, str5, compositeOfferDto$Vendor, map, str, str6, podVar, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qod qodVar = (qod) obj;
        String str = qodVar.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = qod.l;
        if (b.F() || str != null) {
            b.g(serialDescriptor, 0, auu0.a, str);
        }
        String str2 = qodVar.b;
        String str3 = qodVar.h;
        Map map = qodVar.g;
        CompositeOfferDto$Vendor compositeOfferDto$Vendor = qodVar.f;
        String str4 = qodVar.d;
        b.o(serialDescriptor, 1, str2);
        b.e(serialDescriptor, 2, gpd.a, qodVar.c);
        if (b.F() || str4 != null) {
            b.g(serialDescriptor, 3, auu0.a, str4);
        }
        b.o(serialDescriptor, 4, qodVar.e);
        if (b.F() || compositeOfferDto$Vendor != CompositeOfferDto$Vendor.UNKNOWN) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), compositeOfferDto$Vendor);
        }
        if (b.F() || map != null) {
            b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), map);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 7, auu0.a, str3);
        }
        b.o(serialDescriptor, 8, qodVar.i);
        b.e(serialDescriptor, 9, nod.a, qodVar.j);
        b.e(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), qodVar.k);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
