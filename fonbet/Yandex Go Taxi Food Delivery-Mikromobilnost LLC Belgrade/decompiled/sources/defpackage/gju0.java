package defpackage;

import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u001e\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0014\u0010\u000b\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0014\u0010\r\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0002\"\u0014\u0010\u000f\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0002\"\u0014\u0010\u0011\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0002\"\u0014\u0010\u0013\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0002\"\u0014\u0010\u0015\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0002\"\u0014\u0010\u0017\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0002\"\u0014\u0010\u0019\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0002\"\u0014\u0010\u001b\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0002\"\u0014\u0010\u001d\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0002¨\u0006\u001e"}, d2 = {"", "a", "Ljava/lang/String;", "REPLACE_CARD", "b", "DELETE_CARDS", "c", "DELETE_CARDS_IDS", "d", "SELECT_TEMPLATES_BY_HASHES", "e", "INSERT_TEMPLATE", "f", "DELETE_UNUSED_TEMPLATES", "g", "DELETE_UNUSED_TEMPLATE_REFERENCES", "h", "DELETE_TEMPLATES", CoreConstants.PushMessage.SERVICE_TYPE, "INSERT_TEMPLATE_USAGE", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "DELETE_TEMPLATE_USAGES", "k", "DELETE_TEMPLATE_USAGES_BY_CARD_IDS", "l", "REPLACE_RAW_JSON", "m", "DELETE_RAW_JSON_BY_IDS", "n", "SELECT_RAW_JSONS_BY_IDS", "div-storage_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class gju0 {
    public static final String a = "INSERT OR REPLACE INTO cards VALUES (?, ?, ?, ?)";
    public static final String b = "DELETE FROM cards";
    public static final String c = "DELETE FROM cards WHERE layout_id IN ";
    public static final String d = "\n    SELECT t.template_hash, t.template_data\n    FROM templates AS t\n    WHERE t.template_hash in\n";
    public static final String e = "INSERT OR IGNORE INTO templates VALUES (?, ?)";
    public static final String f = "\n    DELETE FROM templates\n    WHERE template_hash NOT IN\n        (SELECT DISTINCT template_hash FROM template_references)\n    ";
    public static final String g = "\n    DELETE FROM template_references\n    WHERE group_id NOT IN\n        (SELECT group_id FROM cards)\n    ";
    public static final String h = "DELETE FROM templates";
    public static final String i = "INSERT OR IGNORE INTO template_references VALUES (?, ?, ?)";
    public static final String j = "DELETE FROM template_references";
    public static final String k = "\n    DELETE FROM template_references WHERE group_id IN\n";
    public static final String l = "INSERT OR REPLACE INTO raw_json VALUES (?, ?)";
    public static final String m = "DELETE FROM raw_json WHERE raw_json_id IN";
    public static final String n = "\n    SELECT raw_json_id, raw_json_data\n    FROM raw_json\n    WHERE raw_json_id IN\n";
}
