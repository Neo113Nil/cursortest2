package ru.ok.android.externcalls.sdk.conversation;

import xsna.zcl;

/* compiled from: StartCallApiParams.kt */
/* loaded from: classes9.dex */
public final class StartCallApiParams {
    private final Long chatId;
    private final String clientType;
    private final String domainId;
    private final String hexCapability;
    private final boolean isMultipleDevicesEnabled;
    private final boolean isVideo;
    private final boolean isWaitForAdminEnabled;
    private final boolean isWatchTogetherEnabledForAll;
    private final String payload;

    public StartCallApiParams(String str, String str2, boolean z, boolean z2, String str3, boolean z3, Long l, boolean z4, String str4) {
        this.domainId = str;
        this.payload = str2;
        this.isWatchTogetherEnabledForAll = z;
        this.isVideo = z2;
        this.clientType = str3;
        this.isMultipleDevicesEnabled = z3;
        this.chatId = l;
        this.isWaitForAdminEnabled = z4;
        this.hexCapability = str4;
    }

    public final Long getChatId() {
        return this.chatId;
    }

    public final String getClientType() {
        return this.clientType;
    }

    public final String getDomainId() {
        return this.domainId;
    }

    public final String getHexCapability() {
        return this.hexCapability;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final boolean isMultipleDevicesEnabled() {
        return this.isMultipleDevicesEnabled;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public final boolean isWaitForAdminEnabled() {
        return this.isWaitForAdminEnabled;
    }

    public final boolean isWatchTogetherEnabledForAll() {
        return this.isWatchTogetherEnabledForAll;
    }

    public /* synthetic */ StartCallApiParams(String str, String str2, boolean z, boolean z2, String str3, boolean z3, Long l, boolean z4, String str4, int i, zcl zclVar) {
        this(str, str2, z, z2, str3, z3, (i & 64) != 0 ? null : l, z4, str4);
    }
}
