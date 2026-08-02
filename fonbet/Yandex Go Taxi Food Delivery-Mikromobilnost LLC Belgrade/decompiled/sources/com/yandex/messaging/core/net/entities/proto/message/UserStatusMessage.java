package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.xuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/UserStatusMessage;", "", "availability", "", "notificationMode", "duration", "customStatus", "Lcom/yandex/messaging/core/net/entities/proto/message/CustomStatusMessage;", "<init>", "(IIILcom/yandex/messaging/core/net/entities/proto/message/CustomStatusMessage;)V", "getAvailability", "()I", "getNotificationMode", "getDuration", "getCustomStatus", "()Lcom/yandex/messaging/core/net/entities/proto/message/CustomStatusMessage;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UserStatusMessage {

    @xuf0(tag = 1)
    private final int availability;

    @xuf0(tag = 4)
    private final CustomStatusMessage customStatus;

    @xuf0(tag = 3)
    private final int duration;

    @xuf0(tag = 2)
    private final int notificationMode;

    public /* synthetic */ UserStatusMessage(int i, int i2, int i3, CustomStatusMessage customStatusMessage, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? null : customStatusMessage);
    }

    public static /* synthetic */ UserStatusMessage copy$default(UserStatusMessage userStatusMessage, int i, int i2, int i3, CustomStatusMessage customStatusMessage, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = userStatusMessage.availability;
        }
        if ((i4 & 2) != 0) {
            i2 = userStatusMessage.notificationMode;
        }
        if ((i4 & 4) != 0) {
            i3 = userStatusMessage.duration;
        }
        if ((i4 & 8) != 0) {
            customStatusMessage = userStatusMessage.customStatus;
        }
        return userStatusMessage.copy(i, i2, i3, customStatusMessage);
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
    public final int getDuration() {
        return this.duration;
    }

    /* renamed from: component4, reason: from getter */
    public final CustomStatusMessage getCustomStatus() {
        return this.customStatus;
    }

    public final UserStatusMessage copy(@Json(name = "Availability") int availability, @Json(name = "NotificationMode") int notificationMode, @Json(name = "Duration") int duration, @Json(name = "CustomStatus") CustomStatusMessage customStatus) {
        return new UserStatusMessage(availability, notificationMode, duration, customStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserStatusMessage)) {
            return false;
        }
        UserStatusMessage userStatusMessage = (UserStatusMessage) other;
        return this.availability == userStatusMessage.availability && this.notificationMode == userStatusMessage.notificationMode && this.duration == userStatusMessage.duration && jl40.l(this.customStatus, userStatusMessage.customStatus);
    }

    public final int getAvailability() {
        return this.availability;
    }

    public final CustomStatusMessage getCustomStatus() {
        return this.customStatus;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getNotificationMode() {
        return this.notificationMode;
    }

    public int hashCode() {
        int b = oyr.b(this.duration, oyr.b(this.notificationMode, Integer.hashCode(this.availability) * 31, 31), 31);
        CustomStatusMessage customStatusMessage = this.customStatus;
        return b + (customStatusMessage == null ? 0 : customStatusMessage.hashCode());
    }

    public String toString() {
        int i = this.availability;
        int i2 = this.notificationMode;
        int i3 = this.duration;
        CustomStatusMessage customStatusMessage = this.customStatus;
        StringBuilder s = b64.s(i, i2, "UserStatusMessage(availability=", ", notificationMode=", ", duration=");
        s.append(i3);
        s.append(", customStatus=");
        s.append(customStatusMessage);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }

    public UserStatusMessage(@Json(name = "Availability") int i, @Json(name = "NotificationMode") int i2, @Json(name = "Duration") int i3, @Json(name = "CustomStatus") CustomStatusMessage customStatusMessage) {
        this.availability = i;
        this.notificationMode = i2;
        this.duration = i3;
        this.customStatus = customStatusMessage;
    }
}
