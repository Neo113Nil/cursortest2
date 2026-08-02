package defpackage;

import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b(\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006\"\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0006\"\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006\"\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006\"\u0014\u0010\u0015\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006\"\u0014\u0010\u0017\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006\"\u0014\u0010\u0019\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006\"\u0014\u0010\u001b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006\"\u0014\u0010\u001d\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006\"\u0014\u0010\u001f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006\"\u0014\u0010!\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u0006\"\u0014\u0010#\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u0006\"\u0014\u0010%\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\u0006\"\u0014\u0010'\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\u0006\"\u0014\u0010)\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010\u0006\"\u0014\u0010+\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010\u0006¨\u0006,"}, d2 = {"", "a", CA20Status.STATUS_USER_I, "DB_VERSION", "", "b", "Ljava/lang/String;", "TABLE_CARDS", "c", "TABLE_TEMPLATES", "d", "TABLE_TEMPLATE_REFERENCES", "e", "TABLE_RAW_JSON", "f", "COLUMN_LAYOUT_ID", "g", "COLUMN_CARD_DATA", "h", "COLUMN_CARD_GROUP_ID", CoreConstants.PushMessage.SERVICE_TYPE, "COLUMN_CARD_ID", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "COLUMN_CARD_METADATA", "k", "COLUMN_GROUP_ID", "l", "COLUMN_TEMPLATE_ID", "m", "COLUMN_TEMPLATE_HASH", "n", "COLUMN_TEMPLATE_DATA", "o", "COLUMN_RAW_JSON_ID", "p", "COLUMN_RAW_JSON_DATA", "q", "CREATE_TABLE_CARDS", "r", "CREATE_TABLE_TEMPLATES", "s", "CREATE_TABLE_TEMPLATE_REFERENCES", "t", "CREATE_TABLE_RAW_JSON", "div-storage_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class kju0 {
    public static final int a = 3;
    public static final String b = "cards";
    public static final String c = "templates";
    public static final String d = "template_references";
    public static final String e = "raw_json";
    public static final String f = "layout_id";
    public static final String g = "card_data";
    public static final String h = "group_id";
    public static final String i = "card_id";
    public static final String j = "metadata";
    public static final String k = "group_id";
    public static final String l = "template_id";
    public static final String m = "template_hash";
    public static final String n = "template_data";
    public static final String o = "raw_json_id";
    public static final String p = "raw_json_data";
    public static final String q = "\n    CREATE TABLE IF NOT EXISTS cards(\n    layout_id TEXT NOT NULL PRIMARY KEY,\n    card_data BLOB NULLABLE,\n    metadata BLOB NULLABLE,\n    group_id TEXT NOT NULL)";
    public static final String r = "\n    CREATE TABLE IF NOT EXISTS templates(\n    template_hash TEXT NOT NULL PRIMARY KEY,\n    template_data BLOB NULLABLE)";
    public static final String s = "\n    CREATE TABLE IF NOT EXISTS template_references(\n    group_id TEXT NOT NULL,\n    template_id TEXT NOT NULL,\n    template_hash TEXT NOT NULL,\n    PRIMARY KEY(group_id, template_id))";
    public static final String t = "\n    CREATE TABLE IF NOT EXISTS raw_json(\n    raw_json_id TEXT NOT NULL PRIMARY KEY,\n    raw_json_data BLOB NULLABLE)";
}
