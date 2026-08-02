package com.yandex.messaging.ui.settings.inviteLinkInfo;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/messaging/ui/settings/inviteLinkInfo/InviteLinkType;", "", "PERMANENT", "TEMPORARY", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InviteLinkType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InviteLinkType[] $VALUES;
    public static final InviteLinkType PERMANENT;
    public static final InviteLinkType TEMPORARY;

    static {
        InviteLinkType inviteLinkType = new InviteLinkType("PERMANENT", 0);
        PERMANENT = inviteLinkType;
        InviteLinkType inviteLinkType2 = new InviteLinkType("TEMPORARY", 1);
        TEMPORARY = inviteLinkType2;
        InviteLinkType[] inviteLinkTypeArr = {inviteLinkType, inviteLinkType2};
        $VALUES = inviteLinkTypeArr;
        $ENTRIES = kotlin.enums.a.a(inviteLinkTypeArr);
    }

    public static InviteLinkType valueOf(String str) {
        return (InviteLinkType) Enum.valueOf(InviteLinkType.class, str);
    }

    public static InviteLinkType[] values() {
        return (InviteLinkType[]) $VALUES.clone();
    }
}
