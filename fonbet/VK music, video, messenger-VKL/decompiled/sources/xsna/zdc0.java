package xsna;

/* compiled from: PostingDatabase_AutoMigration_1_2_Impl.kt */
/* loaded from: classes4.dex */
public final class zdc0 extends hm20 {
    @Override // xsna.hm20
    public final void a(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "ALTER TABLE `posting_draft` ADD COLUMN `actionButton` TEXT DEFAULT NULL");
    }
}
