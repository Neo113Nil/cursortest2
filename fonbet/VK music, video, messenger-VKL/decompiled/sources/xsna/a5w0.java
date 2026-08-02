package xsna;

import androidx.annotation.NonNull;

/* compiled from: VkpnsPushDatabase_AutoMigration_5_6_Impl.java */
/* loaded from: classes5.dex */
public final class a5w0 extends hm20 {
    @Override // xsna.hm20
    public final void b(@NonNull sin0 sin0Var) {
        sin0Var.execSQL("ALTER TABLE `push_message` ADD COLUMN `from` TEXT NOT NULL DEFAULT ''");
    }
}
