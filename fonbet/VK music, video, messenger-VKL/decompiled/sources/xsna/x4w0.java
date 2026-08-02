package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: VkpnsPushDatabase.kt */
/* loaded from: classes5.dex */
public final class x4w0 extends Lambda implements izs<sin0, s3q0> {
    public static final x4w0 i = new x4w0(1);

    @Override // xsna.izs
    public final s3q0 invoke(sin0 sin0Var) {
        sin0 sin0Var2 = sin0Var;
        vr.d(sin0Var2, "DELETE FROM push_token WHERE `token_id` NOT IN (SELECT MAX(`token_id`) FROM `push_token` GROUP BY `package_info_id`)", "DROP INDEX IF EXISTS `index_push_token_package_info_id`", "DROP INDEX IF EXISTS `index_push_token_token`", "CREATE TABLE IF NOT EXISTS `push_token_backup` (`package_info_id` INTEGER NOT NULL, `token` TEXT NOT NULL, `project_id` TEXT NOT NULL, `created_time` INTEGER NOT NULL, `invalidate_time` INTEGER, `test_token` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`package_info_id`), FOREIGN KEY(`package_info_id`) REFERENCES `package_info`(`package_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        vr.d(sin0Var2, "CREATE INDEX IF NOT EXISTS `index_push_token_package_info_id` ON `push_token_backup` (`package_info_id`)", "CREATE INDEX IF NOT EXISTS `index_push_token_token` ON `push_token_backup` (`token`)", "INSERT INTO push_token_backup SELECT `package_info_id`, `token`, `project_id`, `created_time`, `invalidate_time`, `test_token` FROM `push_token`", "ALTER TABLE push_token RENAME to push_token_old");
        vr.d(sin0Var2, "ALTER TABLE push_token_backup RENAME to push_token", "CREATE TABLE IF NOT EXISTS `push_message_backup` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `token_package_id` INTEGER NOT NULL, `syn` INTEGER NOT NULL, `collapse_key` TEXT, `priority` TEXT NOT NULL, `ttl` INTEGER, `data` BLOB, `received_by_push_server_at` INTEGER NOT NULL, `delivery_attempts` INTEGER NOT NULL DEFAULT 0, `title` TEXT, `body` TEXT, `image` TEXT, `icon` TEXT, `color` TEXT, `channel_id` TEXT, `click_action` TEXT, FOREIGN KEY(`token_package_id`) REFERENCES `push_token`(`package_info_id`) ON UPDATE NO ACTION ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_push_message_token_package_id` ON `push_message_backup` (`token_package_id`)", "INSERT INTO push_message_backup SELECT m.id, t.package_info_id, m.syn, m.collapse_key, m.priority, m.ttl, m.data, m.received_by_push_server_at, m.delivery_attempts, m.title, m.body, m.image, m.icon, m.color, m.channel_id, m.click_action FROM push_message m INNER JOIN push_token_old t ON m.push_token_id = t.token_id");
        sin0Var2.execSQL("DROP TABLE push_message");
        sin0Var2.execSQL("ALTER TABLE push_message_backup RENAME to push_message");
        sin0Var2.execSQL("DROP TABLE push_token_old");
        return s3q0.a;
    }
}
