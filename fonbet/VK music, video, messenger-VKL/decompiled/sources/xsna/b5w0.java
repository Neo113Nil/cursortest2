package xsna;

import androidx.annotation.NonNull;

/* compiled from: VkpnsPushDatabase_AutoMigration_6_7_Impl.java */
/* loaded from: classes5.dex */
public final class b5w0 extends hm20 {
    @Override // xsna.hm20
    public final void b(@NonNull sin0 sin0Var) {
        sin0Var.execSQL("ALTER TABLE `push_message` ADD COLUMN `click_action_type` TEXT DEFAULT NULL");
    }
}
