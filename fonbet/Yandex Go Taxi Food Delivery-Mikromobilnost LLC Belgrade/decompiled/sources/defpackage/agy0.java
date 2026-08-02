package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Lagy0;", "", "<init>", "()V", "", "b", "Ljava/lang/String;", "INSERT_TEMPLATE_USAGE_QUERY_TEMPLATE", "c", "DELETE_ALL_TEMPLATE_USAGES_QUERY", "d", "DELETE_TEMPLATE_USAGE_BY_CARD_ID_QUERY_TEMPLATE", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class agy0 {
    public static final agy0 a = new agy0();

    /* renamed from: b, reason: from kotlin metadata */
    public static final String INSERT_TEMPLATE_USAGE_QUERY_TEMPLATE = "INSERT OR IGNORE INTO `template_usages` (`card_id`,`template_id`) VALUES (?,?)";

    /* renamed from: c, reason: from kotlin metadata */
    public static final String DELETE_ALL_TEMPLATE_USAGES_QUERY = "DELETE FROM template_usages";

    /* renamed from: d, reason: from kotlin metadata */
    public static final String DELETE_TEMPLATE_USAGE_BY_CARD_ID_QUERY_TEMPLATE = "DELETE FROM template_usages WHERE card_id = ?";

    private agy0() {
    }
}
