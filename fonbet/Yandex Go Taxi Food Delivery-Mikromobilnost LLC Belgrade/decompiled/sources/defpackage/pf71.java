package defpackage;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import yads.vd2;

/* loaded from: classes7.dex */
public final class pf71 {
    public final gl81 a;
    public final yu81 b;
    public final ch71 c;

    public pf71() {
        gl81 gl81Var = new gl81();
        yu81 yu81Var = new yu81();
        ch71 ch71Var = new ch71();
        this.a = gl81Var;
        this.b = yu81Var;
        this.c = ch71Var;
    }

    public final hn71 a(nl61 nl61Var) {
        String str;
        hn71 hn71Var = new hn71(3, (HashMap) null);
        if (nl61Var != null) {
            Map map = nl61Var.b;
            this.a.getClass();
            HashMap hashMap = new HashMap();
            if (!ym11.h(hashMap)) {
                hashMap = null;
            }
            if (hashMap == null) {
                hashMap = new LinkedHashMap();
            }
            if (map != null) {
                String str2 = (String) map.get("adapter_network_name");
                String str3 = (String) map.get("adapter_version");
                String str4 = (String) map.get("adapter_network_sdk_version");
                if (str2 != null) {
                    hashMap.put("adapter_network_name", str2);
                }
                if (str3 != null) {
                    hashMap.put("adapter_version", str3);
                }
                if (str4 != null) {
                    hashMap.put("adapter_network_sdk_version", str4);
                }
            }
            this.b.getClass();
            vd2 vd2Var = (vd2) fs81.a.getValue();
            if (vd2Var != null) {
                int ordinal = vd2Var.ordinal();
                if (ordinal == 0) {
                    str = PluginErrorDetails.Platform.FLUTTER;
                } else if (ordinal == 1) {
                    str = "react-native";
                } else {
                    if (ordinal != 2) {
                        w511.b();
                        return null;
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
            MapBuilder j = mapBuilder.j();
            String str6 = nl61Var.e;
            ch71 ch71Var = this.c;
            ch71Var.getClass();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = ym11.h(hashMap2) ? hashMap2 : null;
            if (hashMap3 == null) {
                hashMap3 = new LinkedHashMap();
            }
            a081 a081Var = ch71Var.a;
            synchronized (a081.f) {
                a081Var.getClass();
            }
            hashMap3.put("app_ad_analytics_enabled", Boolean.TRUE);
            ((Map) hn71Var.b).putAll(hashMap);
            ((Map) hn71Var.b).putAll(j);
            hn71Var.j(str6, "preload_type");
            ((Map) hn71Var.b).putAll(hashMap3);
        }
        return hn71Var;
    }
}
