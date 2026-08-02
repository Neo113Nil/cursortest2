package defpackage;

/* loaded from: classes.dex */
public final class f951 extends zg20 {
    public f951() {
        super(17, 18);
    }

    @Override // defpackage.zg20
    public final void a(oll0 oll0Var) {
        vez0.s(oll0Var, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        vez0.s(oll0Var, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
