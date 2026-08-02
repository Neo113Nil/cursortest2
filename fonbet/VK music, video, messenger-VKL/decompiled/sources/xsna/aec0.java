package xsna;

/* compiled from: PostingDatabase_AutoMigration_2_3_Impl.kt */
/* loaded from: classes4.dex */
public final class aec0 extends hm20 {
    @Override // xsna.hm20
    public final void a(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "ALTER TABLE `posting_draft` ADD COLUMN `open_for_all_date` INTEGER DEFAULT NULL");
    }
}
