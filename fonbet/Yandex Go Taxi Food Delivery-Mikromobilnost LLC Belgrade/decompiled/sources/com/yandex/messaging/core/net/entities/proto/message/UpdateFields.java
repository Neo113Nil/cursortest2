package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.proto.BoolFlag;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.x4e;
import defpackage.xuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0013\u001a\u00020\u0014J\r\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010¨\u0006!"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/UpdateFields;", "", "chatId", "", "messageTimestamp", "", "starredStatus", "", "urlPreviewDisabledFlag", "<init>", "(Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/Integer;)V", "getChatId", "()Ljava/lang/String;", "getMessageTimestamp", "()J", "getStarredStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrlPreviewDisabledFlag", "isStarred", "", "urlPreviewDisabled", "()Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/Integer;)Lcom/yandex/messaging/core/net/entities/proto/message/UpdateFields;", "equals", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UpdateFields {

    @Json(name = "ChatId")
    @xuf0(tag = 1)
    private final String chatId;

    @Json(name = "Timestamp")
    @xuf0(tag = 2)
    private final long messageTimestamp;

    @Json(name = "ImportanceFlag")
    @xuf0(tag = 3)
    private final Integer starredStatus;

    @Json(name = "UrlPreviewDisabledFlag")
    @xuf0(tag = 4)
    private final Integer urlPreviewDisabledFlag;

    public /* synthetic */ UpdateFields(String str, long j, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2);
    }

    public static /* synthetic */ UpdateFields copy$default(UpdateFields updateFields, String str, long j, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateFields.chatId;
        }
        if ((i & 2) != 0) {
            j = updateFields.messageTimestamp;
        }
        if ((i & 4) != 0) {
            num = updateFields.starredStatus;
        }
        if ((i & 8) != 0) {
            num2 = updateFields.urlPreviewDisabledFlag;
        }
        return updateFields.copy(str, j, num, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMessageTimestamp() {
        return this.messageTimestamp;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getStarredStatus() {
        return this.starredStatus;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getUrlPreviewDisabledFlag() {
        return this.urlPreviewDisabledFlag;
    }

    public final UpdateFields copy(String chatId, long messageTimestamp, Integer starredStatus, Integer urlPreviewDisabledFlag) {
        return new UpdateFields(chatId, messageTimestamp, starredStatus, urlPreviewDisabledFlag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateFields)) {
            return false;
        }
        UpdateFields updateFields = (UpdateFields) other;
        return jl40.l(this.chatId, updateFields.chatId) && this.messageTimestamp == updateFields.messageTimestamp && jl40.l(this.starredStatus, updateFields.starredStatus) && jl40.l(this.urlPreviewDisabledFlag, updateFields.urlPreviewDisabledFlag);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final long getMessageTimestamp() {
        return this.messageTimestamp;
    }

    public final Integer getStarredStatus() {
        return this.starredStatus;
    }

    public final Integer getUrlPreviewDisabledFlag() {
        return this.urlPreviewDisabledFlag;
    }

    public int hashCode() {
        int c = qv10.c(this.chatId.hashCode() * 31, 31, this.messageTimestamp);
        Integer num = this.starredStatus;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.urlPreviewDisabledFlag;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final boolean isStarred() {
        Integer num = this.starredStatus;
        return num != null && num.intValue() == BoolFlag.SET.getValue();
    }

    public String toString() {
        String str = this.chatId;
        long j = this.messageTimestamp;
        Integer num = this.starredStatus;
        Integer num2 = this.urlPreviewDisabledFlag;
        StringBuilder l = x4e.l("UpdateFields(chatId=", str, ", messageTimestamp=", j);
        l.append(", starredStatus=");
        l.append(num);
        l.append(", urlPreviewDisabledFlag=");
        l.append(num2);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public final Boolean urlPreviewDisabled() {
        Integer num = this.urlPreviewDisabledFlag;
        if (num != null) {
            return Boolean.valueOf(num.intValue() == BoolFlag.SET.getValue());
        }
        return null;
    }

    public UpdateFields(String str, long j, Integer num, Integer num2) {
        this.chatId = str;
        this.messageTimestamp = j;
        this.starredStatus = num;
        this.urlPreviewDisabledFlag = num2;
    }
}
