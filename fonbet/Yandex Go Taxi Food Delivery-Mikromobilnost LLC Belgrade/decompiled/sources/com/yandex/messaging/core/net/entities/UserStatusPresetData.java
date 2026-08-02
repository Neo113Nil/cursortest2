package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UserStatusPresetData;", "", "availability", "", "notificationMode", "emoji", "", "iconName", "text", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvailability", "()I", "getNotificationMode", "getEmoji", "()Ljava/lang/String;", "getIconName", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UserStatusPresetData {
    private final int availability;
    private final String emoji;
    private final String iconName;
    private final int notificationMode;
    private final String text;

    public /* synthetic */ UserStatusPresetData(int i, int i2, String str, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, (i3 & 8) != 0 ? null : str2, str3);
    }

    public static /* synthetic */ UserStatusPresetData copy$default(UserStatusPresetData userStatusPresetData, int i, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = userStatusPresetData.availability;
        }
        if ((i3 & 2) != 0) {
            i2 = userStatusPresetData.notificationMode;
        }
        if ((i3 & 4) != 0) {
            str = userStatusPresetData.emoji;
        }
        if ((i3 & 8) != 0) {
            str2 = userStatusPresetData.iconName;
        }
        if ((i3 & 16) != 0) {
            str3 = userStatusPresetData.text;
        }
        String str4 = str3;
        String str5 = str;
        return userStatusPresetData.copy(i, i2, str5, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAvailability() {
        return this.availability;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNotificationMode() {
        return this.notificationMode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEmoji() {
        return this.emoji;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final UserStatusPresetData copy(@Json(name = "availability") int availability, @Json(name = "notification_mode") int notificationMode, @Json(name = "emoji") String emoji, @Json(name = "icon_name") String iconName, @Json(name = "text") String text) {
        return new UserStatusPresetData(availability, notificationMode, emoji, iconName, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserStatusPresetData)) {
            return false;
        }
        UserStatusPresetData userStatusPresetData = (UserStatusPresetData) other;
        return this.availability == userStatusPresetData.availability && this.notificationMode == userStatusPresetData.notificationMode && jl40.l(this.emoji, userStatusPresetData.emoji) && jl40.l(this.iconName, userStatusPresetData.iconName) && jl40.l(this.text, userStatusPresetData.text);
    }

    public final int getAvailability() {
        return this.availability;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final String getIconName() {
        return this.iconName;
    }

    public final int getNotificationMode() {
        return this.notificationMode;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int b = unr0.b(oyr.b(this.notificationMode, Integer.hashCode(this.availability) * 31, 31), 31, this.emoji);
        String str = this.iconName;
        return this.text.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        int i = this.availability;
        int i2 = this.notificationMode;
        String str = this.emoji;
        String str2 = this.iconName;
        String str3 = this.text;
        StringBuilder s = b64.s(i, i2, "UserStatusPresetData(availability=", ", notificationMode=", ", emoji=");
        g8e.D(s, str, ", iconName=", str2, ", text=");
        return oyr.t(s, str3, Extension.C_BRAKE);
    }

    public UserStatusPresetData(@Json(name = "availability") int i, @Json(name = "notification_mode") int i2, @Json(name = "emoji") String str, @Json(name = "icon_name") String str2, @Json(name = "text") String str3) {
        this.availability = i;
        this.notificationMode = i2;
        this.emoji = str;
        this.iconName = str2;
        this.text = str3;
    }
}
