package xsna;

import android.content.Context;
import com.vk.push.core.filedatastore.FileDataStore;
import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImplKt;
import com.vk.push.core.filedatastore.migration.PreferenceDataStoreMigration;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.uyc0;
import xsna.v55;

/* compiled from: DataStore.kt */
/* loaded from: classes5.dex */
public final class pvk {
    public static final /* synthetic */ qcy<Object>[] a;
    public static final i7f0 b;

    /* compiled from: DataStore.kt */
    public static final class a extends Lambda implements izs<uyc0, v55.a> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final v55.a invoke(uyc0 uyc0Var) {
            Map<uyc0.a<?>, Object> a = uyc0Var.a();
            ArrayList arrayList = new ArrayList(a.size());
            for (Map.Entry<uyc0.a<?>, Object> entry : a.entrySet()) {
                String str = entry.getKey().a;
                Object value = entry.getValue();
                String str2 = value instanceof String ? (String) value : null;
                if (str2 == null) {
                    str2 = "";
                }
                q2z.a(str, str2, arrayList);
            }
            return new v55.a(pn00.s(arrayList));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(pvk.class, "plainAuthDataStore", "getPlainAuthDataStore(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;", 1);
        fpf0.a.getClass();
        a = new qcy[]{propertyReference1Impl};
        b = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_plain_auth", v55.a.b, new PreferenceDataStoreMigration(null, "plain_auth", a.i, 1, null), null, false, false, null, 120, null);
    }

    public static final FileDataStore<v55.a> a(Context context) {
        return (FileDataStore) b.getValue(context, a[0]);
    }
}
