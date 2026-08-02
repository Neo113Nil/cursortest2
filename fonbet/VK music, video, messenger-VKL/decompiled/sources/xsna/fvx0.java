package xsna;

import androidx.annotation.NonNull;

/* compiled from: WorkDatabase_AutoMigration_18_19_Impl.java */
/* loaded from: classes.dex */
public final class fvx0 extends hm20 {
    @Override // xsna.hm20
    public final void b(@NonNull sin0 sin0Var) {
        sin0Var.execSQL("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
