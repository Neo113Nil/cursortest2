package defpackage;

import com.monetization.ads.utils.logger.model.MobileAdsNetworkRequestLog;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes7.dex */
public final class i381 implements uxs {
    public static final i381 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        i381 i381Var = new i381();
        a = i381Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.utils.logger.model.MobileAdsNetworkRequestLog", i381Var, 5);
        pluginGeneratedSerialDescriptor.j(ClidProvider.TIMESTAMP, false);
        pluginGeneratedSerialDescriptor.j("method", false);
        pluginGeneratedSerialDescriptor.j("url", false);
        pluginGeneratedSerialDescriptor.j("headers", false);
        pluginGeneratedSerialDescriptor.j("body", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = MobileAdsNetworkRequestLog.$childSerializers;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{pnz.a, auu0Var, auu0Var, qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        i3yVarArr = MobileAdsNetworkRequestLog.$childSerializers;
        b2.getClass();
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        Map map = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                j = b2.f(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str = b2.k(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str2 = b2.k(pluginGeneratedSerialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                map = (Map) b2.s(pluginGeneratedSerialDescriptor, 3, (myi) i3yVarArr[3].getValue(), map);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str3 = (String) b2.s(pluginGeneratedSerialDescriptor, 4, auu0.a, str3);
                i |= 16;
            }
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new MobileAdsNetworkRequestLog(i, j, str, str2, map, str3, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        MobileAdsNetworkRequestLog.write$Self$mobileads_internalRelease((MobileAdsNetworkRequestLog) obj, b2, pluginGeneratedSerialDescriptor);
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
