package com.ybsdk.common.entities;

import com.ybsdk.core.utils.text.Text;
import defpackage.dzh0;
import defpackage.k4o;
import defpackage.nbv;
import defpackage.rbv;
import defpackage.txg0;
import defpackage.unr0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/common/entities/SupportStateEntity;", "", "Lrbv;", "icon", "Lcom/ybsdk/core/utils/text/Text;", "textDescription", "<init>", "(Ljava/lang/String;ILrbv;Lcom/ybsdk/core/utils/text/Text;)V", "Lrbv;", "getIcon", "()Lrbv;", "Lcom/ybsdk/core/utils/text/Text;", "getTextDescription", "()Lcom/ybsdk/core/utils/text/Text;", "AVAILABLE", "HAS_UNREAD_MESSAGES", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SupportStateEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SupportStateEntity[] $VALUES;
    public static final SupportStateEntity AVAILABLE = new SupportStateEntity("AVAILABLE", 0, new nbv(txg0.ybsdk_ic_support_v2, null), unr0.h(Text.Companion, dzh0.ybsdk_dashboard_action_contact_support_title));
    public static final SupportStateEntity HAS_UNREAD_MESSAGES = new SupportStateEntity("HAS_UNREAD_MESSAGES", 1, new nbv(txg0.ybsdk_ic_support_with_badge_v2, null), new Text.Resource(dzh0.ybsdk_dashboard_content_description_support_button_has_messages));
    private final rbv icon;
    private final Text textDescription;

    private static final /* synthetic */ SupportStateEntity[] $values() {
        return new SupportStateEntity[]{AVAILABLE, HAS_UNREAD_MESSAGES};
    }

    static {
        SupportStateEntity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SupportStateEntity(String str, int i, rbv rbvVar, Text text) {
        this.icon = rbvVar;
        this.textDescription = text;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SupportStateEntity valueOf(String str) {
        return (SupportStateEntity) Enum.valueOf(SupportStateEntity.class, str);
    }

    public static SupportStateEntity[] values() {
        return (SupportStateEntity[]) $VALUES.clone();
    }

    public final rbv getIcon() {
        return this.icon;
    }

    public final Text getTextDescription() {
        return this.textDescription;
    }
}
