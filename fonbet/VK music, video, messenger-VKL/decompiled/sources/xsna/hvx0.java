package xsna;

import androidx.annotation.NonNull;

/* compiled from: WorkDatabase_AutoMigration_20_21_Impl.java */
/* loaded from: classes.dex */
public final class hvx0 extends hm20 {
    @Override // xsna.hm20
    public final void b(@NonNull sin0 sin0Var) {
        sin0Var.execSQL("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
