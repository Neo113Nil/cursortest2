package xsna;

import androidx.annotation.NonNull;

/* compiled from: WorkDatabase_AutoMigration_22_23_Impl.java */
/* loaded from: classes.dex */
public final class ivx0 extends hm20 {
    @Override // xsna.hm20
    public final void b(@NonNull sin0 sin0Var) {
        sin0Var.execSQL("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
