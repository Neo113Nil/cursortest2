package xsna;

import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImplKt;
import com.vk.push.core.filedatastore.migration.PreferenceDataStoreMigration;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference2Impl;
import xsna.bk10;
import xsna.ijh0;
import xsna.pmy;
import xsna.pv6;
import xsna.rvk;
import xsna.sap;
import xsna.uyc0;
import xsna.v260;
import xsna.yly;

/* compiled from: DataStoreModule.kt */
/* loaded from: classes.dex */
public final class qvk {
    public static final qvk a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static final i7f0 c;
    public static final i7f0 d;
    public static final i7f0 e;
    public static final i7f0 f;
    public static final i7f0 g;
    public static final i7f0 h;
    public static final i7f0 i;
    public static final i7f0 j;

    /* compiled from: DataStoreModule.kt */
    public static final class a extends Lambda implements izs<uyc0, pv6.a> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final pv6.a invoke(uyc0 uyc0Var) {
            Boolean bool = (Boolean) uyc0Var.b(new uyc0.a("isIgnoringBatteryOptimizationsKey"));
            return new pv6.a(bool != null ? bool.booleanValue() : false);
        }
    }

    /* compiled from: DataStoreModule.kt */
    public static final class b extends Lambda implements izs<uyc0, sap.a> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final sap.a invoke(uyc0 uyc0Var) {
            Boolean bool = (Boolean) uyc0Var.b(new uyc0.a("isElectionInitializedKey"));
            return new sap.a(bool != null ? bool.booleanValue() : false);
        }
    }

    /* compiled from: DataStoreModule.kt */
    public static final class c extends Lambda implements izs<uyc0, pmy.a> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final pmy.a invoke(uyc0 uyc0Var) {
            Boolean bool = (Boolean) uyc0Var.b(new uyc0.a("firstLaunchKey"));
            return new pmy.a(bool != null ? bool.booleanValue() : true);
        }
    }

    /* compiled from: DataStoreModule.kt */
    public static final class d extends Lambda implements izs<uyc0, bk10.a> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final bk10.a invoke(uyc0 uyc0Var) {
            String str = (String) uyc0Var.b(new uyc0.a("masterHost"));
            if (str != null) {
                return new bk10.a(str);
            }
            return null;
        }
    }

    /* compiled from: DataStoreModule.kt */
    public static final class e extends Lambda implements izs<uyc0, v260.a> {
        public static final e i = new e(1);

        @Override // xsna.izs
        public final v260.a invoke(uyc0 uyc0Var) {
            Boolean bool = (Boolean) uyc0Var.b(new uyc0.a("use_network_connection_check_by_google"));
            return new v260.a(bool != null ? bool.booleanValue() : true);
        }
    }

    /* compiled from: DataStoreModule.kt */
    public static final class f extends Lambda implements izs<uyc0, ijh0.a> {
        public static final f i = new f(1);

        @Override // xsna.izs
        public final ijh0.a invoke(uyc0 uyc0Var) {
            Boolean bool = (Boolean) uyc0Var.b(new uyc0.a("isIgnoringBatteryOptimizationsKey"));
            return new ijh0.a(bool != null ? bool.booleanValue() : false);
        }
    }

    /* compiled from: DataStoreModule.kt */
    public static final class g extends Lambda implements izs<uyc0, rvk.a> {
        public static final g i = new g(1);

        @Override // xsna.izs
        public final rvk.a invoke(uyc0 uyc0Var) {
            Map<uyc0.a<?>, Object> a = uyc0Var.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<uyc0.a<?>, Object> entry : a.entrySet()) {
                if (entry.getValue() instanceof Long) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                arrayList.add(new Pair(((uyc0.a) entry2.getKey()).a, (Long) entry2.getValue()));
            }
            return new rvk.a(pn00.s(arrayList));
        }
    }

    static {
        PropertyReference2Impl propertyReference2Impl = new PropertyReference2Impl(qvk.class, "networkConnectionDataStore", "getNetworkConnectionDataStore(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;");
        fpf0.a.getClass();
        b = new qcy[]{propertyReference2Impl, new PropertyReference2Impl(qvk.class, "launchAppDataSource", "getLaunchAppDataSource(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;"), new PropertyReference2Impl(qvk.class, "masterHostDataStore", "getMasterHostDataStore(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;"), new PropertyReference2Impl(qvk.class, "electionInitDataStore", "getElectionInitDataStore(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;"), new PropertyReference2Impl(qvk.class, "batteryOptimizationDataStore", "getBatteryOptimizationDataStore(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;"), new PropertyReference2Impl(qvk.class, "synDataStore", "getSynDataStore(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;"), new PropertyReference2Impl(qvk.class, "sdkEnabledDataStore", "getSdkEnabledDataStore(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;"), new PropertyReference2Impl(qvk.class, "lastLaunchedPushServiceDataSource", "getLastLaunchedPushServiceDataSource(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;")};
        a = new qvk();
        c = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_network_connection_data", v260.a.b, new PreferenceDataStoreMigration(null, "vkpns_push_sdk_network_connection_check", e.i, 1, null), null, false, false, null, 120, null);
        d = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_push_sdk_launch_app_data", pmy.a.b, new PreferenceDataStoreMigration(null, "vkpns_push_sdk_launch_app", c.i, 1, null), null, false, false, null, 120, null);
        e = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_master_host_data", bk10.a.b, new PreferenceDataStoreMigration(null, "vkpns_push_sdk_master_info", d.i, 1, null), null, false, false, null, 120, null);
        f = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_push_sdk_election_init_data", sap.a.b, new PreferenceDataStoreMigration(null, "vkpns_push_sdk_election_init", b.i, 1, null), null, false, false, null, 120, null);
        g = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_battery_optimization_data", pv6.a.b, new PreferenceDataStoreMigration(null, "vkpns_push_sdk_battery_optimization", a.i, 1, null), null, false, false, null, 120, null);
        h = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_syn_data", rvk.a.b, new PreferenceDataStoreMigration(null, "vkpns_push_sdk", g.i, 1, null), null, false, false, null, 120, null);
        i = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_host_sdk_enabled", ijh0.a.b, new PreferenceDataStoreMigration(null, "vkpns_sdk_enabled_store", f.i, 1, null), null, false, false, null, 120, null);
        j = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_host_last_launched_push_service", yly.a.b, null, null, false, false, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null);
    }
}
