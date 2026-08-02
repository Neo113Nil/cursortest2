package xsna;

import androidx.annotation.NonNull;

/* compiled from: WorkDatabase_AutoMigration_17_18_Impl.java */
/* loaded from: classes.dex */
public final class evx0 extends hm20 {
    @Override // xsna.hm20
    public final void b(@NonNull sin0 sin0Var) {
        sin0Var.execSQL("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        sin0Var.execSQL("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
