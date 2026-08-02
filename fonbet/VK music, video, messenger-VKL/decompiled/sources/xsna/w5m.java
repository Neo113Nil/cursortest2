package xsna;

import android.content.Context;
import android.os.Build;
import com.vk.stat.scheme.SchemeStat$TypeAppStarts;
import com.vk.toggle.features.CoreFeatures;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: DeviceConcentrator.kt */
/* loaded from: classes11.dex */
public final class w5m implements dyp<SchemeStat$TypeAppStarts> {
    @Override // xsna.dyp
    public final SchemeStat$TypeAppStarts a(SchemeStat$TypeAppStarts schemeStat$TypeAppStarts) {
        String str;
        SchemeStat$TypeAppStarts.DeviceAdsIdType deviceAdsIdType;
        CoreFeatures coreFeatures = CoreFeatures.STAT_DEVICE_ADS_ID;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures)) {
            mgn0 mgn0Var = dgn0.a;
            mgn0 mgn0Var2 = dgn0.a;
            if (mgn0Var2 == null) {
                mgn0Var2 = null;
            }
            qhn0 qhn0Var = mgn0Var2.h;
            List list = qhn0Var != null ? (List) qhn0Var.a.getValue() : null;
            if (list == null) {
                list = EmptyList.b;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String deviceId = ((rgn0) it.next()).getDeviceId();
                if (deviceId != null) {
                    deviceAdsIdType = SchemeStat$TypeAppStarts.DeviceAdsIdType.GAID;
                    str = deviceId;
                    break;
                }
            }
        }
        str = null;
        deviceAdsIdType = null;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String d = b6m.d(context);
        String str2 = Build.BRAND;
        String str3 = Build.MODEL;
        Context context2 = e43.a;
        Context context3 = context2 != null ? context2 : null;
        HashSet hashSet = iah0.a;
        return SchemeStat$TypeAppStarts.a(schemeStat$TypeAppStarts, null, null, null, null, null, null, d, str, deviceAdsIdType, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(fnj.b(context3)), null, -3969, -1, 786431);
    }
}
