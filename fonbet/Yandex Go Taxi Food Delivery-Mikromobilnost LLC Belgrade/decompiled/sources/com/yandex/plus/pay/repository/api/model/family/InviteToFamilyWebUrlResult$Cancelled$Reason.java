package com.yandex.plus.pay.repository.api.model.family;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/plus/pay/repository/api/model/family/InviteToFamilyWebUrlResult$Cancelled$Reason", "", "Lcom/yandex/plus/pay/repository/api/model/family/InviteToFamilyWebUrlResult$Cancelled$Reason;", "MAX_FAMILY_MEMBERS", "USER_HAS_NO_FAMILY", "USER_IS_A_FAMILY_CHILD", "USER_REGION_IS_NOT_SUPPORTED", "UNKNOWN_REASON", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InviteToFamilyWebUrlResult$Cancelled$Reason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InviteToFamilyWebUrlResult$Cancelled$Reason[] $VALUES;
    public static final InviteToFamilyWebUrlResult$Cancelled$Reason MAX_FAMILY_MEMBERS;
    public static final InviteToFamilyWebUrlResult$Cancelled$Reason UNKNOWN_REASON;
    public static final InviteToFamilyWebUrlResult$Cancelled$Reason USER_HAS_NO_FAMILY;
    public static final InviteToFamilyWebUrlResult$Cancelled$Reason USER_IS_A_FAMILY_CHILD;
    public static final InviteToFamilyWebUrlResult$Cancelled$Reason USER_REGION_IS_NOT_SUPPORTED;

    static {
        InviteToFamilyWebUrlResult$Cancelled$Reason inviteToFamilyWebUrlResult$Cancelled$Reason = new InviteToFamilyWebUrlResult$Cancelled$Reason("MAX_FAMILY_MEMBERS", 0);
        MAX_FAMILY_MEMBERS = inviteToFamilyWebUrlResult$Cancelled$Reason;
        InviteToFamilyWebUrlResult$Cancelled$Reason inviteToFamilyWebUrlResult$Cancelled$Reason2 = new InviteToFamilyWebUrlResult$Cancelled$Reason("USER_HAS_NO_FAMILY", 1);
        USER_HAS_NO_FAMILY = inviteToFamilyWebUrlResult$Cancelled$Reason2;
        InviteToFamilyWebUrlResult$Cancelled$Reason inviteToFamilyWebUrlResult$Cancelled$Reason3 = new InviteToFamilyWebUrlResult$Cancelled$Reason("USER_IS_A_FAMILY_CHILD", 2);
        USER_IS_A_FAMILY_CHILD = inviteToFamilyWebUrlResult$Cancelled$Reason3;
        InviteToFamilyWebUrlResult$Cancelled$Reason inviteToFamilyWebUrlResult$Cancelled$Reason4 = new InviteToFamilyWebUrlResult$Cancelled$Reason("USER_REGION_IS_NOT_SUPPORTED", 3);
        USER_REGION_IS_NOT_SUPPORTED = inviteToFamilyWebUrlResult$Cancelled$Reason4;
        InviteToFamilyWebUrlResult$Cancelled$Reason inviteToFamilyWebUrlResult$Cancelled$Reason5 = new InviteToFamilyWebUrlResult$Cancelled$Reason("UNKNOWN_REASON", 4);
        UNKNOWN_REASON = inviteToFamilyWebUrlResult$Cancelled$Reason5;
        InviteToFamilyWebUrlResult$Cancelled$Reason[] inviteToFamilyWebUrlResult$Cancelled$ReasonArr = {inviteToFamilyWebUrlResult$Cancelled$Reason, inviteToFamilyWebUrlResult$Cancelled$Reason2, inviteToFamilyWebUrlResult$Cancelled$Reason3, inviteToFamilyWebUrlResult$Cancelled$Reason4, inviteToFamilyWebUrlResult$Cancelled$Reason5};
        $VALUES = inviteToFamilyWebUrlResult$Cancelled$ReasonArr;
        $ENTRIES = a.a(inviteToFamilyWebUrlResult$Cancelled$ReasonArr);
    }

    public static InviteToFamilyWebUrlResult$Cancelled$Reason valueOf(String str) {
        return (InviteToFamilyWebUrlResult$Cancelled$Reason) Enum.valueOf(InviteToFamilyWebUrlResult$Cancelled$Reason.class, str);
    }

    public static InviteToFamilyWebUrlResult$Cancelled$Reason[] values() {
        return (InviteToFamilyWebUrlResult$Cancelled$Reason[]) $VALUES.clone();
    }
}
