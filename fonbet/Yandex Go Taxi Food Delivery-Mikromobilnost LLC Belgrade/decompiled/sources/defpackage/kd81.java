package defpackage;

import com.monetization.ads.utils.logger.model.MobileAdsNetworkResponseLog;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes7.dex */
public final class kd81 implements uxs {
    public static final kd81 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        kd81 kd81Var = new kd81();
        a = kd81Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.utils.logger.model.MobileAdsNetworkResponseLog", kd81Var, 4);
        pluginGeneratedSerialDescriptor.j(ClidProvider.TIMESTAMP, false);
        pluginGeneratedSerialDescriptor.j(AuthSdkActivity.RESPONSE_TYPE_CODE, false);
        pluginGeneratedSerialDescriptor.j("headers", false);
        pluginGeneratedSerialDescriptor.j("body", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = MobileAdsNetworkResponseLog.$childSerializers;
        return new KSerializer[]{pnz.a, qke.n(h6w.a), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        i3yVarArr = MobileAdsNetworkResponseLog.$childSerializers;
        b2.getClass();
        int i = 0;
        long j = 0;
        Integer num = null;
        Map map = null;
        String str = null;
        boolean z = true;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                j = b2.f(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                num = (Integer) b2.s(pluginGeneratedSerialDescriptor, 1, h6w.a, num);
                i |= 2;
            } else if (v == 2) {
                map = (Map) b2.s(pluginGeneratedSerialDescriptor, 2, (myi) i3yVarArr[2].getValue(), map);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b2.s(pluginGeneratedSerialDescriptor, 3, auu0.a, str);
                i |= 8;
            }
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new MobileAdsNetworkResponseLog(i, j, num, map, str, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        MobileAdsNetworkResponseLog.write$Self$mobileads_internalRelease((MobileAdsNetworkResponseLog) obj, b2, pluginGeneratedSerialDescriptor);
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
