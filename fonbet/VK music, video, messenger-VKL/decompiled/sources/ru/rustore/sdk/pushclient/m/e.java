package ru.rustore.sdk.pushclient.m;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImplKt;
import com.vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration;
import com.vk.push.core.filedatastore.migration.PreferenceDataStoreMigration;
import java.util.Collections;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference2Impl;
import xsna.axy0;
import xsna.bpn0;
import xsna.cfy0;
import xsna.dyc0;
import xsna.e43;
import xsna.fpf0;
import xsna.fvk;
import xsna.i7f0;
import xsna.izs;
import xsna.k5z0;
import xsna.niy0;
import xsna.qcy;
import xsna.uyc0;
import xsna.vyc0;
import xsna.x0g0;
import xsna.zxc0;

/* loaded from: classes9.dex */
public final class e {
    public static final e a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static final i7f0 c;
    public static final i7f0 d;
    public static final dyc0 e;
    public static final i7f0 f;
    public static final i7f0 g;
    public static final dyc0 h;
    public static final i7f0 i;
    public static final i7f0 j;

    public static final class a extends Lambda implements izs<Context, fvk<uyc0>> {
        public static final a i = new a();

        public a() {
            super(1);
        }

        @Override // xsna.izs
        public final fvk<uyc0> invoke(Context context) {
            e.a.getClass();
            return e.h.getValue(context, e.b[5]);
        }
    }

    public static final class b extends Lambda implements izs<uyc0, niy0.a> {
        public static final b i = new b();

        public b() {
            super(1);
        }

        @Override // xsna.izs
        public final niy0.a invoke(uyc0 uyc0Var) {
            uyc0 uyc0Var2 = uyc0Var;
            Object b = uyc0Var2.b(new uyc0.a("master_host_pub"));
            Object b2 = uyc0Var2.b(new uyc0.a("master_host_package"));
            if (b == null || b2 == null) {
                return null;
            }
            return new niy0.a((String) b2, (String) b);
        }
    }

    public static final class c extends Lambda implements izs<CorruptionException, uyc0> {
        public static final c i = new c();

        public c() {
            super(1);
        }

        @Override // xsna.izs
        public final uyc0 invoke(CorruptionException corruptionException) {
            return vyc0.a(new uyc0.b[0]);
        }
    }

    public static final class d extends Lambda implements izs<Context, fvk<uyc0>> {
        public static final d i = new d();

        public d() {
            super(1);
        }

        @Override // xsna.izs
        public final fvk<uyc0> invoke(Context context) {
            e.a.getClass();
            return e.h.getValue(context, e.b[5]);
        }
    }

    /* renamed from: ru.rustore.sdk.pushclient.m.e$e, reason: collision with other inner class name */
    public static final class C2406e extends Lambda implements izs<uyc0, niy0.b> {
        public static final C2406e i = new C2406e();

        public C2406e() {
            super(1);
        }

        @Override // xsna.izs
        public final niy0.b invoke(uyc0 uyc0Var) {
            String str = (String) uyc0Var.b(new uyc0.a("master_default_host"));
            if (str != null) {
                return new niy0.b(str);
            }
            return null;
        }
    }

    public static final class f extends Lambda implements izs<uyc0, axy0.a> {
        public static final f i = new f();

        public f() {
            super(1);
        }

        @Override // xsna.izs
        public final axy0.a invoke(uyc0 uyc0Var) {
            Boolean bool = (Boolean) uyc0Var.b(new uyc0.a("test_mode_enabled"));
            return new axy0.a(bool != null ? bool.booleanValue() : false);
        }
    }

    public static final class g extends Lambda implements izs<uyc0, k5z0.a> {
        public static final g i = new g();

        public g() {
            super(1);
        }

        @Override // xsna.izs
        public final k5z0.a invoke(uyc0 uyc0Var) {
            Integer num = (Integer) uyc0Var.b(new uyc0.a("last_notification_id"));
            if (num != null) {
                return new k5z0.a(num.intValue());
            }
            return null;
        }
    }

    public static final class h extends Lambda implements izs<Context, fvk<uyc0>> {
        public static final h i = new h();

        public h() {
            super(1);
        }

        @Override // xsna.izs
        public final fvk<uyc0> invoke(Context context) {
            e.a.getClass();
            return e.e.getValue(context, e.b[2]);
        }
    }

    public static final class i extends Lambda implements izs<uyc0, cfy0.a> {
        public static final i i = new i();

        public i() {
            super(1);
        }

        @Override // xsna.izs
        public final cfy0.a invoke(uyc0 uyc0Var) {
            String str = (String) uyc0Var.b(new uyc0.a("push_token"));
            if (str != null) {
                return new cfy0.a(str);
            }
            return null;
        }
    }

    public static final class j extends Lambda implements izs<Context, fvk<uyc0>> {
        public static final j i = new j();

        public j() {
            super(1);
        }

        @Override // xsna.izs
        public final fvk<uyc0> invoke(Context context) {
            e.a.getClass();
            return e.e.getValue(context, e.b[2]);
        }
    }

    public static final class k extends Lambda implements izs<uyc0, cfy0.b> {
        public static final k i = new k();

        public k() {
            super(1);
        }

        @Override // xsna.izs
        public final cfy0.b invoke(uyc0 uyc0Var) {
            uyc0 uyc0Var2 = uyc0Var;
            String str = (String) uyc0Var2.b(new uyc0.a("last_delivered_push_token"));
            if (str == null) {
                return null;
            }
            Boolean bool = (Boolean) uyc0Var2.b(new uyc0.a("push_token_delivered_to_client_app"));
            return new cfy0.b(str, bool != null ? bool.booleanValue() : false);
        }
    }

    public static final class l extends Lambda implements izs<CorruptionException, uyc0> {
        public static final l i = new l();

        public l() {
            super(1);
        }

        @Override // xsna.izs
        public final uyc0 invoke(CorruptionException corruptionException) {
            return vyc0.a(new uyc0.b[0]);
        }
    }

    static {
        PropertyReference2Impl propertyReference2Impl = new PropertyReference2Impl(e.class, "modeDataStore", "getModeDataStore(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;");
        fpf0.a.getClass();
        b = new qcy[]{propertyReference2Impl, new PropertyReference2Impl(e.class, "notificationIdFileDataStore", "getNotificationIdFileDataStore(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;"), new PropertyReference2Impl(e.class, "pushTokenPrefsDataStore", "getPushTokenPrefsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"), new PropertyReference2Impl(e.class, "pushTokenDataStore", "getPushTokenDataStore$client_release(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;"), new PropertyReference2Impl(e.class, "pushTokenDeliveryDataStore", "getPushTokenDeliveryDataStore$client_release(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;"), new PropertyReference2Impl(e.class, "arbiterDataStoreForMigration", "getArbiterDataStoreForMigration(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"), new PropertyReference2Impl(e.class, "arbiterDataStore", "getArbiterDataStore$client_release(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;"), new PropertyReference2Impl(e.class, "defaultMasterHostStore", "getDefaultMasterHostStore$client_release(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;")};
        a = new e();
        bpn0 bpn0Var = ru.rustore.sdk.pushclient.m.h.v;
        c = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_client_sdk_mode", axy0.a.b, new PreferenceDataStoreMigration(null, "vkpns_client_sdk_mode", f.i, 1, null), (CrashReporterRepository) bpn0Var.getValue(), false, false, null, 112, null);
        d = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_notification_id", k5z0.a.b, new PreferenceDataStoreMigration(null, "vkpns_notification_id", g.i, 1, null), (CrashReporterRepository) bpn0Var.getValue(), false, false, null, 112, null);
        e = zxc0.b("vkpns_client_sdk", new x0g0(l.i));
        f = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_push_token", cfy0.a.b, new PreferenceDataStoreByKeyMigration("vkpns_client_sdk", Collections.singletonList(new uyc0.a("push_token")), h.i, i.i), (CrashReporterRepository) bpn0Var.getValue(), false, false, null, 112, null);
        g = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_push_token_delivery", cfy0.b.c, new PreferenceDataStoreByKeyMigration("vkpns_client_sdk", e43.l(new uyc0.a("push_token_delivered_to_client_app"), new uyc0.a("last_delivered_push_token")), j.i, k.i), (CrashReporterRepository) bpn0Var.getValue(), false, false, null, 112, null);
        h = zxc0.b("vkpns_client_sdk_arbiter", new x0g0(c.i));
        i = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_client_sdk_arbiter", niy0.a.c, new PreferenceDataStoreByKeyMigration("vkpns_client_sdk_arbiter", e43.l(new uyc0.a("master_host_pub"), new uyc0.a("master_host_package")), a.i, b.i), (CrashReporterRepository) bpn0Var.getValue(), true, false, null, 96, null);
        j = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_client_default_master_host", niy0.b.b, new PreferenceDataStoreByKeyMigration("vkpns_client_sdk_arbiter", Collections.singletonList(new uyc0.a("master_default_host")), d.i, C2406e.i), (CrashReporterRepository) bpn0Var.getValue(), false, false, null, 112, null);
    }
}
