package yads;

import com.ironsource.adapters.yandex.YandexConstants;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.MapBuilder;
import xsna.ttp0;

/* loaded from: classes10.dex */
public final class n9 {
    public final bc a = new bc();
    public final ch2 b = new ch2();
    public final du2 c = new du2();

    public final gp2 a(g9 g9Var) {
        String str;
        boolean z;
        gp2 gp2Var = new gp2((Map) null, 3);
        if (g9Var != null) {
            Map map = g9Var.g;
            this.a.getClass();
            HashMap hashMap = new HashMap();
            if (!ttp0.g(hashMap)) {
                hashMap = null;
            }
            if (hashMap == null) {
                hashMap = new LinkedHashMap();
            }
            if (map != null) {
                String str2 = (String) map.get(YandexConstants.ADAPTER_NETWORK_NAME_KEY);
                String str3 = (String) map.get(YandexConstants.ADAPTER_VERSION_KEY);
                String str4 = (String) map.get(YandexConstants.ADAPTER_NETWORK_SDK_VERSION_KEY);
                if (str2 != null) {
                    hashMap.put(YandexConstants.ADAPTER_NETWORK_NAME_KEY, str2);
                }
                if (str3 != null) {
                    hashMap.put(YandexConstants.ADAPTER_VERSION_KEY, str3);
                }
                if (str4 != null) {
                    hashMap.put(YandexConstants.ADAPTER_NETWORK_SDK_VERSION_KEY, str4);
                }
            }
            this.b.getClass();
            zg2 zg2Var = (zg2) bh2.a.getValue();
            if (zg2Var != null) {
                int ordinal = zg2Var.ordinal();
                if (ordinal == 0) {
                    str = PluginErrorDetails.Platform.FLUTTER;
                } else if (ordinal == 1) {
                    str = "react-native";
                } else {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = PluginErrorDetails.Platform.UNITY;
                }
            } else {
                str = map != null ? (String) map.get("plugin_type") : null;
            }
            String str5 = map != null ? (String) map.get("plugin_version") : null;
            MapBuilder mapBuilder = new MapBuilder();
            if (str != null) {
                mapBuilder.put("plugin_type", str);
            }
            if (str5 != null) {
                mapBuilder.put("plugin_version", str5);
            }
            MapBuilder h = mapBuilder.h();
            String str6 = g9Var.l;
            du2 du2Var = this.c;
            du2Var.getClass();
            HashMap hashMap2 = new HashMap();
            if (!ttp0.g(hashMap2)) {
                hashMap2 = null;
            }
            if (hashMap2 == null) {
                hashMap2 = new LinkedHashMap();
            }
            hx2 hx2Var = du2Var.a;
            hx2Var.getClass();
            synchronized (hx2.j) {
                z = hx2Var.g;
            }
            hashMap2.put("app_ad_analytics_enabled", Boolean.valueOf(z));
            gp2Var.a.putAll(hashMap);
            gp2Var.a.putAll(h);
            gp2Var.a(str6, "preload_type");
            gp2Var.a.putAll(hashMap2);
        }
        String str7 = g9Var != null ? g9Var.h : null;
        if (str7 != null && str7.length() != 0) {
            gp2Var.a("openbidding", "integration_type");
        }
        return gp2Var;
    }
}
