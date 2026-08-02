package defpackage;

import androidx.media3.exoplayer.offline.DownloadService;
import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.yandex.go.sql.BaseDatabaseHelper;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.experiments.storage.StoredExperimentsDatabase_Impl;

/* loaded from: classes9.dex */
public final class mku0 extends p2l {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ RoomDatabase e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mku0(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.e = workDatabase_Impl;
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }

    @Override // defpackage.p2l
    public final void d(oll0 oll0Var) {
        switch (this.d) {
            case 0:
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `stored_experiments` (`source` TEXT NOT NULL, `name` TEXT NOT NULL, `version` TEXT, `value` TEXT NOT NULL, `last_update` INTEGER NOT NULL, PRIMARY KEY(`source`, `name`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                vez0.s(oll0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6bd279f093d175fdd6391c7858a65c64')");
                break;
            default:
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                vez0.s(oll0Var, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                vez0.s(oll0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
                break;
        }
    }

    @Override // defpackage.p2l
    public final void e(oll0 oll0Var) {
        switch (this.d) {
            case 0:
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `stored_experiments`");
                break;
            default:
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `Dependency`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `WorkSpec`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `WorkTag`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `SystemIdInfo`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `WorkName`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `WorkProgress`");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS `Preference`");
                break;
        }
    }

    @Override // defpackage.p2l
    public final void i() {
        int i = this.d;
    }

    @Override // defpackage.p2l
    public final void j(oll0 oll0Var) {
        int i = this.d;
        RoomDatabase roomDatabase = this.e;
        switch (i) {
            case 0:
                ((StoredExperimentsDatabase_Impl) roomDatabase).L0(oll0Var);
                break;
            default:
                vez0.s(oll0Var, "PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) roomDatabase).L0(oll0Var);
                break;
        }
    }

    @Override // defpackage.p2l
    public final void k() {
        int i = this.d;
    }

    @Override // defpackage.p2l
    public final void l(oll0 oll0Var) {
        switch (this.d) {
            case 0:
                sub1.d(oll0Var);
                break;
            default:
                sub1.d(oll0Var);
                break;
        }
    }

    @Override // defpackage.p2l
    public final kne0 m(oll0 oll0Var) {
        switch (this.d) {
            case 0:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("source", new p5x0(1, "source", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
                linkedHashMap.put("name", new p5x0(2, "name", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
                linkedHashMap.put("version", new p5x0(0, "version", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
                linkedHashMap.put("value", new p5x0(0, "value", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
                s5x0 s5x0Var = new s5x0("stored_experiments", linkedHashMap, smw0.p(linkedHashMap, "last_update", new p5x0(0, "last_update", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1)), new LinkedHashSet());
                s5x0 d = gkb1.d(oll0Var, "stored_experiments");
                if (!s5x0Var.equals(d)) {
                    break;
                } else {
                    break;
                }
            default:
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("work_spec_id", new p5x0(1, "work_spec_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
                LinkedHashSet p = smw0.p(linkedHashMap2, "prerequisite_id", new p5x0(2, "prerequisite_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
                p.add(new q5x0("WorkSpec", Collections.singletonList("work_spec_id"), "CASCADE", Collections.singletonList("id"), "CASCADE"));
                p.add(new q5x0("WorkSpec", Collections.singletonList("prerequisite_id"), "CASCADE", Collections.singletonList("id"), "CASCADE"));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new r5x0("index_Dependency_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
                linkedHashSet.add(new r5x0("index_Dependency_prerequisite_id", false, Collections.singletonList("prerequisite_id"), Collections.singletonList("ASC")));
                s5x0 s5x0Var2 = new s5x0("Dependency", linkedHashMap2, p, linkedHashSet);
                s5x0 d2 = gkb1.d(oll0Var, "Dependency");
                if (!s5x0Var2.equals(d2)) {
                    break;
                } else {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put("id", new p5x0(1, "id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
                    linkedHashMap3.put(ClidProvider.STATE, new p5x0(0, ClidProvider.STATE, BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                    linkedHashMap3.put("worker_class_name", new p5x0(0, "worker_class_name", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
                    linkedHashMap3.put("input_merger_class_name", new p5x0(0, "input_merger_class_name", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
                    linkedHashMap3.put("input", new p5x0(0, "input", "BLOB", null, true, 1));
                    linkedHashMap3.put("output", new p5x0(0, "output", "BLOB", null, true, 1));
                    linkedHashMap3.put("initial_delay", new p5x0(0, "initial_delay", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                    linkedHashMap3.put("interval_duration", new p5x0(0, "interval_duration", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                    linkedHashMap3.put("flex_duration", new p5x0(0, "flex_duration", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                    linkedHashMap3.put("run_attempt_count", new p5x0(0, "run_attempt_count", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                    linkedHashMap3.put("backoff_policy", new p5x0(0, "backoff_policy", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                    linkedHashMap3.put("backoff_delay_duration", new p5x0(0, "backoff_delay_duration", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                    linkedHashMap3.put("last_enqueue_time", new p5x0(0, "last_enqueue_time", BaseDatabaseHelper.TYPE_INTEGER, "-1", true, 1));
                    linkedHashMap3.put("minimum_retention_duration", new p5x0(0, "minimum_retention_duration", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                    linkedHashMap3.put("schedule_requested_at", new p5x0(0, "schedule_requested_at", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                    linkedHashMap3.put("run_in_foreground", new p5x0(0, "run_in_foreground", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                    linkedHashMap3.put("out_of_quota_policy", new p5x0(0, "out_of_quota_policy", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                    linkedHashMap3.put("period_count", new p5x0(0, "period_count", BaseDatabaseHelper.TYPE_INTEGER, "0", true, 1));
                    linkedHashMap3.put("generation", new p5x0(0, "generation", BaseDatabaseHelper.TYPE_INTEGER, "0", true, 1));
                    linkedHashMap3.put("next_schedule_time_override", new p5x0(0, "next_schedule_time_override", BaseDatabaseHelper.TYPE_INTEGER, "9223372036854775807", true, 1));
                    linkedHashMap3.put("next_schedule_time_override_generation", new p5x0(0, "next_schedule_time_override_generation", BaseDatabaseHelper.TYPE_INTEGER, "0", true, 1));
                    linkedHashMap3.put(DownloadService.KEY_STOP_REASON, new p5x0(0, DownloadService.KEY_STOP_REASON, BaseDatabaseHelper.TYPE_INTEGER, "-256", true, 1));
                    linkedHashMap3.put("trace_tag", new p5x0(0, "trace_tag", BaseDatabaseHelper.TYPE_TEXT, null, false, 1));
                    linkedHashMap3.put("backoff_on_system_interruptions", new p5x0(0, "backoff_on_system_interruptions", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
                    linkedHashMap3.put("required_network_type", new p5x0(0, "required_network_type", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                    linkedHashMap3.put("required_network_request", new p5x0(0, "required_network_request", "BLOB", "x''", true, 1));
                    linkedHashMap3.put("requires_charging", new p5x0(0, "requires_charging", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                    linkedHashMap3.put("requires_device_idle", new p5x0(0, "requires_device_idle", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                    linkedHashMap3.put("requires_battery_not_low", new p5x0(0, "requires_battery_not_low", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                    linkedHashMap3.put("requires_storage_not_low", new p5x0(0, "requires_storage_not_low", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                    linkedHashMap3.put("trigger_content_update_delay", new p5x0(0, "trigger_content_update_delay", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                    linkedHashMap3.put("trigger_max_content_delay", new p5x0(0, "trigger_max_content_delay", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                    LinkedHashSet p2 = smw0.p(linkedHashMap3, "content_uri_triggers", new p5x0(0, "content_uri_triggers", "BLOB", null, true, 1));
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    linkedHashSet2.add(new r5x0("index_WorkSpec_schedule_requested_at", false, Collections.singletonList("schedule_requested_at"), Collections.singletonList("ASC")));
                    linkedHashSet2.add(new r5x0("index_WorkSpec_last_enqueue_time", false, Collections.singletonList("last_enqueue_time"), Collections.singletonList("ASC")));
                    s5x0 s5x0Var3 = new s5x0("WorkSpec", linkedHashMap3, p2, linkedHashSet2);
                    s5x0 d3 = gkb1.d(oll0Var, "WorkSpec");
                    if (!s5x0Var3.equals(d3)) {
                        break;
                    } else {
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        linkedHashMap4.put("tag", new p5x0(1, "tag", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
                        LinkedHashSet p3 = smw0.p(linkedHashMap4, "work_spec_id", new p5x0(2, "work_spec_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
                        p3.add(new q5x0("WorkSpec", Collections.singletonList("work_spec_id"), "CASCADE", Collections.singletonList("id"), "CASCADE"));
                        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                        linkedHashSet3.add(new r5x0("index_WorkTag_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
                        s5x0 s5x0Var4 = new s5x0("WorkTag", linkedHashMap4, p3, linkedHashSet3);
                        s5x0 d4 = gkb1.d(oll0Var, "WorkTag");
                        if (!s5x0Var4.equals(d4)) {
                            break;
                        } else {
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            linkedHashMap5.put("work_spec_id", new p5x0(1, "work_spec_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
                            linkedHashMap5.put("generation", new p5x0(2, "generation", BaseDatabaseHelper.TYPE_INTEGER, "0", true, 1));
                            LinkedHashSet p4 = smw0.p(linkedHashMap5, "system_id", new p5x0(0, "system_id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
                            p4.add(new q5x0("WorkSpec", Collections.singletonList("work_spec_id"), "CASCADE", Collections.singletonList("id"), "CASCADE"));
                            s5x0 s5x0Var5 = new s5x0("SystemIdInfo", linkedHashMap5, p4, new LinkedHashSet());
                            s5x0 d5 = gkb1.d(oll0Var, "SystemIdInfo");
                            if (!s5x0Var5.equals(d5)) {
                                break;
                            } else {
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                linkedHashMap6.put("name", new p5x0(1, "name", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
                                LinkedHashSet p5 = smw0.p(linkedHashMap6, "work_spec_id", new p5x0(2, "work_spec_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
                                p5.add(new q5x0("WorkSpec", Collections.singletonList("work_spec_id"), "CASCADE", Collections.singletonList("id"), "CASCADE"));
                                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                                linkedHashSet4.add(new r5x0("index_WorkName_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
                                s5x0 s5x0Var6 = new s5x0("WorkName", linkedHashMap6, p5, linkedHashSet4);
                                s5x0 d6 = gkb1.d(oll0Var, "WorkName");
                                if (!s5x0Var6.equals(d6)) {
                                    break;
                                } else {
                                    LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                    linkedHashMap7.put("work_spec_id", new p5x0(1, "work_spec_id", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
                                    LinkedHashSet p6 = smw0.p(linkedHashMap7, "progress", new p5x0(0, "progress", "BLOB", null, true, 1));
                                    p6.add(new q5x0("WorkSpec", Collections.singletonList("work_spec_id"), "CASCADE", Collections.singletonList("id"), "CASCADE"));
                                    s5x0 s5x0Var7 = new s5x0("WorkProgress", linkedHashMap7, p6, new LinkedHashSet());
                                    s5x0 d7 = gkb1.d(oll0Var, "WorkProgress");
                                    if (!s5x0Var7.equals(d7)) {
                                        break;
                                    } else {
                                        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                                        linkedHashMap8.put("key", new p5x0(1, "key", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
                                        s5x0 s5x0Var8 = new s5x0("Preference", linkedHashMap8, smw0.p(linkedHashMap8, "long_value", new p5x0(0, "long_value", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1)), new LinkedHashSet());
                                        s5x0 d8 = gkb1.d(oll0Var, "Preference");
                                        if (!s5x0Var8.equals(d8)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
        }
        return new kne0(true, (String) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mku0(StoredExperimentsDatabase_Impl storedExperimentsDatabase_Impl) {
        super(1, "6bd279f093d175fdd6391c7858a65c64", "9f17bebc655b6a44d7a3f03d7359eb47");
        this.e = storedExperimentsDatabase_Impl;
    }
}
