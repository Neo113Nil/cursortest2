package com.yandex.messaging.ui.settings.privacy;

import defpackage.k4o;
import defpackage.oyh0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/messaging/ui/settings/privacy/PrivacyType;", "", "", "titleRes", CA20Status.STATUS_USER_I, "telemessengerTitleRes", "Write", "Invites", "Calls", "OnlineStatus", "Search", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PrivacyType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PrivacyType[] $VALUES;
    public static final PrivacyType Calls;
    public static final PrivacyType Invites;
    public static final PrivacyType OnlineStatus;
    public static final PrivacyType Search;
    public static final PrivacyType Write;
    private final int telemessengerTitleRes;
    private final int titleRes;

    static {
        PrivacyType privacyType = new PrivacyType("Write", 0, oyh0.profile_privacy_private_chats, oyh0.profile_privacy_private_chats_telemessenger);
        Write = privacyType;
        PrivacyType privacyType2 = new PrivacyType("Invites", 1, oyh0.profile_privacy_invites, oyh0.profile_privacy_invites_telemessenger);
        Invites = privacyType2;
        PrivacyType privacyType3 = new PrivacyType("Calls", 2, oyh0.profile_privacy_calls, oyh0.profile_privacy_calls_telemessenger);
        Calls = privacyType3;
        int i = oyh0.profile_privacy_online_status;
        PrivacyType privacyType4 = new PrivacyType("OnlineStatus", 3, i, i);
        OnlineStatus = privacyType4;
        PrivacyType privacyType5 = new PrivacyType("Search", 4, oyh0.profile_privacy_search, oyh0.profile_privacy_search_telemessenger);
        Search = privacyType5;
        PrivacyType[] privacyTypeArr = {privacyType, privacyType2, privacyType3, privacyType4, privacyType5};
        $VALUES = privacyTypeArr;
        $ENTRIES = kotlin.enums.a.a(privacyTypeArr);
    }

    public PrivacyType(String str, int i, int i2, int i3) {
        this.titleRes = i2;
        this.telemessengerTitleRes = i3;
    }

    public static PrivacyType valueOf(String str) {
        return (PrivacyType) Enum.valueOf(PrivacyType.class, str);
    }

    public static PrivacyType[] values() {
        return (PrivacyType[]) $VALUES.clone();
    }
}
