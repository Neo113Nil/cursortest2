package defpackage;

import com.google.android.gms.common.Feature;

/* loaded from: classes11.dex */
public abstract class f491 {
    public static final Feature a;
    public static final Feature[] b;

    static {
        Feature feature = new Feature("auth_blockstore", 3L);
        Feature feature2 = new Feature("blockstore_data_transfer", 1L);
        Feature feature3 = new Feature("blockstore_notify_app_restore", 1L);
        Feature feature4 = new Feature("blockstore_store_bytes_with_options", 2L);
        Feature feature5 = new Feature("blockstore_is_end_to_end_encryption_available", 1L);
        Feature feature6 = new Feature("blockstore_enable_cloud_backup", 1L);
        Feature feature7 = new Feature("blockstore_delete_bytes", 2L);
        Feature feature8 = new Feature("blockstore_retrieve_bytes_with_options", 3L);
        Feature feature9 = new Feature("auth_clear_restore_credential", 1L);
        a = feature9;
        b = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9, new Feature("auth_create_restore_credential", 1L), new Feature("auth_get_restore_credential", 1L)};
    }
}
