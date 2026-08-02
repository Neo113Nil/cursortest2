package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0012"}, d2 = {"Lpfy0;", "", "<init>", "()V", "", "b", "Ljava/lang/String;", "INSERT_TEMPLATE_QUERY_TEMPLATE", "c", "DELETE_UNUSED_TEMPLATES_QUERY_TEMPLATE", "d", "DELETE_ALL_TEMPLATES_QUERY", "e", "GET_ALL_TEMPLATES_QUERY", "f", "GET_TEMPLATES_BY_CARD_ID_QUERY_TEMPLATE", "g", "GET_TEMPLATES_BY_IDS_QUERY_TEMPLATE_WITHOUT_PLACEHOLDER", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class pfy0 {
    public static final pfy0 a = new pfy0();

    /* renamed from: b, reason: from kotlin metadata */
    public static final String INSERT_TEMPLATE_QUERY_TEMPLATE = "INSERT OR IGNORE INTO `templates` (`template_id`,`template_data`) VALUES (?,?)";

    /* renamed from: c, reason: from kotlin metadata */
    public static final String DELETE_UNUSED_TEMPLATES_QUERY_TEMPLATE = "DELETE FROM templates WHERE template_id NOT IN (SELECT DISTINCT template_id FROM template_usages)";

    /* renamed from: d, reason: from kotlin metadata */
    public static final String DELETE_ALL_TEMPLATES_QUERY = "DELETE FROM templates";

    /* renamed from: e, reason: from kotlin metadata */
    public static final String GET_ALL_TEMPLATES_QUERY = "SELECT * FROM templates";

    /* renamed from: f, reason: from kotlin metadata */
    public static final String GET_TEMPLATES_BY_CARD_ID_QUERY_TEMPLATE = "SELECT templates.template_id, templates.template_data FROM templates INNER JOIN template_usages ON templates.template_id = template_usages.template_id WHERE template_usages.card_id = ?";

    /* renamed from: g, reason: from kotlin metadata */
    public static final String GET_TEMPLATES_BY_IDS_QUERY_TEMPLATE_WITHOUT_PLACEHOLDER = "SELECT template_id, template_data FROM templates WHERE template_id IN ";

    private pfy0() {
    }
}
