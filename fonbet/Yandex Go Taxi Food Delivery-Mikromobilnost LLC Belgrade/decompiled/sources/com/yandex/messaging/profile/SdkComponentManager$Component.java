package com.yandex.messaging.profile;

import android.content.ComponentName;
import android.content.Context;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/yandex/messaging/profile/SdkComponentManager$Component", "", "Lcom/yandex/messaging/profile/SdkComponentManager$Component;", "", "aliasName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "CHAT_OPEN", "SHARE", "INVITE_LINK_PROD_TEAM", "INVITE_LINK_PROD", "INVITE_LINK_ALPHA", "PRODLEGAL", "DEEPLINK", "CALLS", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final class SdkComponentManager$Component {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SdkComponentManager$Component[] $VALUES;
    public static final SdkComponentManager$Component CALLS;
    public static final SdkComponentManager$Component CHAT_OPEN;
    public static final SdkComponentManager$Component DEEPLINK;
    public static final SdkComponentManager$Component INVITE_LINK_ALPHA;
    public static final SdkComponentManager$Component INVITE_LINK_PROD;
    public static final SdkComponentManager$Component INVITE_LINK_PROD_TEAM;
    public static final SdkComponentManager$Component PRODLEGAL;
    public static final SdkComponentManager$Component SHARE;
    private final String aliasName;

    static {
        SdkComponentManager$Component sdkComponentManager$Component = new SdkComponentManager$Component("CHAT_OPEN", 0, "com.yandex.messaging.ChatOpenAlias");
        CHAT_OPEN = sdkComponentManager$Component;
        SdkComponentManager$Component sdkComponentManager$Component2 = new SdkComponentManager$Component("SHARE", 1, "com.yandex.messaging.ShareAlias");
        SHARE = sdkComponentManager$Component2;
        SdkComponentManager$Component sdkComponentManager$Component3 = new SdkComponentManager$Component("INVITE_LINK_PROD_TEAM", 2, "com.yandex.messaging.InviteLinkProdTeamActivityAlias");
        INVITE_LINK_PROD_TEAM = sdkComponentManager$Component3;
        SdkComponentManager$Component sdkComponentManager$Component4 = new SdkComponentManager$Component("INVITE_LINK_PROD", 3, "com.yandex.messaging.InviteLinkProdActivityAlias");
        INVITE_LINK_PROD = sdkComponentManager$Component4;
        SdkComponentManager$Component sdkComponentManager$Component5 = new SdkComponentManager$Component("INVITE_LINK_ALPHA", 4, "com.yandex.messaging.InviteLinkAlphaActivityAlias");
        INVITE_LINK_ALPHA = sdkComponentManager$Component5;
        SdkComponentManager$Component sdkComponentManager$Component6 = new SdkComponentManager$Component("PRODLEGAL", 5, "com.yandex.messaging.InviteLinkProdLegalActivityAlias");
        PRODLEGAL = sdkComponentManager$Component6;
        SdkComponentManager$Component sdkComponentManager$Component7 = new SdkComponentManager$Component("DEEPLINK", 6, "com.yandex.messaging.DeepLinkActivityAlias");
        DEEPLINK = sdkComponentManager$Component7;
        SdkComponentManager$Component sdkComponentManager$Component8 = new SdkComponentManager$Component("CALLS", 7, "com.yandex.messaging.CallActivityAlias");
        CALLS = sdkComponentManager$Component8;
        SdkComponentManager$Component[] sdkComponentManager$ComponentArr = {sdkComponentManager$Component, sdkComponentManager$Component2, sdkComponentManager$Component3, sdkComponentManager$Component4, sdkComponentManager$Component5, sdkComponentManager$Component6, sdkComponentManager$Component7, sdkComponentManager$Component8};
        $VALUES = sdkComponentManager$ComponentArr;
        $ENTRIES = kotlin.enums.a.a(sdkComponentManager$ComponentArr);
    }

    public SdkComponentManager$Component(String str, int i, String str2) {
        this.aliasName = str2;
    }

    public static SdkComponentManager$Component valueOf(String str) {
        return (SdkComponentManager$Component) Enum.valueOf(SdkComponentManager$Component.class, str);
    }

    public static SdkComponentManager$Component[] values() {
        return (SdkComponentManager$Component[]) $VALUES.clone();
    }

    public final ComponentName a(Context context) {
        return new ComponentName(context, this.aliasName);
    }

    /* renamed from: b, reason: from getter */
    public final String getAliasName() {
        return this.aliasName;
    }
}
