package com.yandex.messaging.internal.calls.feedback;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.auth.LegacyAccountType;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nh7;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\t\n\u0002\bD\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u0001]B\u0087\u0002\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010 J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010 J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010 J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010 J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010 J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010 J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010 J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010 J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010 J\u0012\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010 J\u0090\u0002\u0010;\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\f\u001a\u00020\u000b2\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0013\u001a\u00020\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b=\u0010 J\u0010\u0010>\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b>\u0010)J\u001a\u0010@\u001a\u00020\b2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010B\u001a\u0004\bD\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bE\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\bF\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bG\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010H\u001a\u0004\b\t\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bI\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bK\u0010)R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010L\u001a\u0004\bM\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bN\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bO\u0010 R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bP\u0010 R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010B\u001a\u0004\bQ\u0010 R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bR\u0010 R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010B\u001a\u0004\bS\u0010 R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010B\u001a\u0004\bT\u0010 R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010B\u001a\u0004\bU\u0010 R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010B\u001a\u0004\bV\u0010 R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\bW\u0010 R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010X\u001a\u0004\b\u0019\u00107R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010Y\u001a\u0004\bZ\u00109R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010B\u001a\u0004\b[\u0010 ¨\u0006^"}, d2 = {"Lcom/yandex/messaging/internal/calls/feedback/CallFeedbackTelemostEntity;", "", "", "eventType", "meetingId", "userGuid", "platform", "version", "", "isUserB2B", "organizationId", "", "rating", "", IssuingDistributionPointExtension.REASONS, "comment", LegacyAccountType.STRING_LOGIN, "os", "device", "client", "callGuid", "uuid", "deviceId", "email", "callEndReason", "isInitiator", "", ClidProvider.TIMESTAMP, "chatId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Z", "component7", "component8", "()I", "component9", "()Ljava/util/List;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "()Ljava/lang/Boolean;", "component21", "()Ljava/lang/Long;", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;)Lcom/yandex/messaging/internal/calls/feedback/CallFeedbackTelemostEntity;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventType", "getMeetingId", "getUserGuid", "getPlatform", "getVersion", "Z", "getOrganizationId", CA20Status.STATUS_USER_I, "getRating", "Ljava/util/List;", "getReasons", "getComment", "getLogin", "getOs", "getDevice", "getClient", "getCallGuid", "getUuid", "getDeviceId", "getEmail", "getCallEndReason", "Ljava/lang/Boolean;", "Ljava/lang/Long;", "getTimestamp", "getChatId", "Companion", "nh7", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CallFeedbackTelemostEntity {
    public static final int $stable = 0;
    public static final String CLIENT_ANDROID = "Android";
    public static final nh7 Companion = new nh7();
    public static final String EVENT_TYPE = "user_review_submit_mssngr";
    public static final String PLATFORM = "and";
    private final String callEndReason;
    private final String callGuid;
    private final String chatId;
    private final String client;
    private final String comment;
    private final String device;
    private final String deviceId;
    private final String email;
    private final String eventType;
    private final Boolean isInitiator;
    private final boolean isUserB2B;
    private final String login;
    private final String meetingId;
    private final String organizationId;
    private final String os;
    private final String platform;
    private final int rating;
    private final List<String> reasons;
    private final Long timestamp;
    private final String userGuid;
    private final String uuid;
    private final String version;

    public /* synthetic */ CallFeedbackTelemostEntity(String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, List list, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, Long l, String str17, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? EVENT_TYPE : str, str2, str3, (i2 & 8) != 0 ? PLATFORM : str4, str5, z, str6, i, list, str7, str8, str9, str10, (i2 & 8192) != 0 ? "Android" : str11, str12, str13, str14, str15, str16, bool, l, str17);
    }

    public static /* synthetic */ CallFeedbackTelemostEntity copy$default(CallFeedbackTelemostEntity callFeedbackTelemostEntity, String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, List list, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, Long l, String str17, int i2, Object obj) {
        String str18;
        Long l2;
        String str19 = (i2 & 1) != 0 ? callFeedbackTelemostEntity.eventType : str;
        String str20 = (i2 & 2) != 0 ? callFeedbackTelemostEntity.meetingId : str2;
        String str21 = (i2 & 4) != 0 ? callFeedbackTelemostEntity.userGuid : str3;
        String str22 = (i2 & 8) != 0 ? callFeedbackTelemostEntity.platform : str4;
        String str23 = (i2 & 16) != 0 ? callFeedbackTelemostEntity.version : str5;
        boolean z2 = (i2 & 32) != 0 ? callFeedbackTelemostEntity.isUserB2B : z;
        String str24 = (i2 & 64) != 0 ? callFeedbackTelemostEntity.organizationId : str6;
        int i3 = (i2 & 128) != 0 ? callFeedbackTelemostEntity.rating : i;
        List list2 = (i2 & 256) != 0 ? callFeedbackTelemostEntity.reasons : list;
        String str25 = (i2 & 512) != 0 ? callFeedbackTelemostEntity.comment : str7;
        String str26 = (i2 & 1024) != 0 ? callFeedbackTelemostEntity.login : str8;
        String str27 = (i2 & 2048) != 0 ? callFeedbackTelemostEntity.os : str9;
        String str28 = (i2 & 4096) != 0 ? callFeedbackTelemostEntity.device : str10;
        String str29 = (i2 & 8192) != 0 ? callFeedbackTelemostEntity.client : str11;
        String str30 = str19;
        String str31 = (i2 & 16384) != 0 ? callFeedbackTelemostEntity.callGuid : str12;
        String str32 = (i2 & 32768) != 0 ? callFeedbackTelemostEntity.uuid : str13;
        String str33 = (i2 & 65536) != 0 ? callFeedbackTelemostEntity.deviceId : str14;
        String str34 = (i2 & 131072) != 0 ? callFeedbackTelemostEntity.email : str15;
        String str35 = (i2 & 262144) != 0 ? callFeedbackTelemostEntity.callEndReason : str16;
        Boolean bool2 = (i2 & 524288) != 0 ? callFeedbackTelemostEntity.isInitiator : bool;
        Long l3 = (i2 & 1048576) != 0 ? callFeedbackTelemostEntity.timestamp : l;
        if ((i2 & 2097152) != 0) {
            l2 = l3;
            str18 = callFeedbackTelemostEntity.chatId;
        } else {
            str18 = str17;
            l2 = l3;
        }
        return callFeedbackTelemostEntity.copy(str30, str20, str21, str22, str23, z2, str24, i3, list2, str25, str26, str27, str28, str29, str31, str32, str33, str34, str35, bool2, l2, str18);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* renamed from: component10, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* renamed from: component11, reason: from getter */
    public final String getLogin() {
        return this.login;
    }

    /* renamed from: component12, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* renamed from: component13, reason: from getter */
    public final String getDevice() {
        return this.device;
    }

    /* renamed from: component14, reason: from getter */
    public final String getClient() {
        return this.client;
    }

    /* renamed from: component15, reason: from getter */
    public final String getCallGuid() {
        return this.callGuid;
    }

    /* renamed from: component16, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component17, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component18, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component19, reason: from getter */
    public final String getCallEndReason() {
        return this.callEndReason;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMeetingId() {
        return this.meetingId;
    }

    /* renamed from: component20, reason: from getter */
    public final Boolean getIsInitiator() {
        return this.isInitiator;
    }

    /* renamed from: component21, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component22, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserGuid() {
        return this.userGuid;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component5, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsUserB2B() {
        return this.isUserB2B;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOrganizationId() {
        return this.organizationId;
    }

    /* renamed from: component8, reason: from getter */
    public final int getRating() {
        return this.rating;
    }

    public final List<String> component9() {
        return this.reasons;
    }

    public final CallFeedbackTelemostEntity copy(@Json(name = "event_type") String eventType, @Json(name = "meeting_id") String meetingId, @Json(name = "user_guid") String userGuid, @Json(name = "platform") String platform, @Json(name = "version") String version, @Json(name = "is_user_b2b") boolean isUserB2B, @Json(name = "organization_id") String organizationId, @Json(name = "rating") int rating, @Json(name = "reasons") List<String> reasons, @Json(name = "comment") String comment, @Json(name = "login") String login, @Json(name = "os") String os, @Json(name = "device") String device, @Json(name = "client") String client, @Json(name = "call_guid") String callGuid, @Json(name = "uuid") String uuid, @Json(name = "device_id") String deviceId, @Json(name = "email") String email, @Json(name = "call_end_reason") String callEndReason, @Json(name = "is_initiator") Boolean isInitiator, @Json(name = "timestamp") Long timestamp, @Json(name = "chat_id") String chatId) {
        return new CallFeedbackTelemostEntity(eventType, meetingId, userGuid, platform, version, isUserB2B, organizationId, rating, reasons, comment, login, os, device, client, callGuid, uuid, deviceId, email, callEndReason, isInitiator, timestamp, chatId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallFeedbackTelemostEntity)) {
            return false;
        }
        CallFeedbackTelemostEntity callFeedbackTelemostEntity = (CallFeedbackTelemostEntity) other;
        return jl40.l(this.eventType, callFeedbackTelemostEntity.eventType) && jl40.l(this.meetingId, callFeedbackTelemostEntity.meetingId) && jl40.l(this.userGuid, callFeedbackTelemostEntity.userGuid) && jl40.l(this.platform, callFeedbackTelemostEntity.platform) && jl40.l(this.version, callFeedbackTelemostEntity.version) && this.isUserB2B == callFeedbackTelemostEntity.isUserB2B && jl40.l(this.organizationId, callFeedbackTelemostEntity.organizationId) && this.rating == callFeedbackTelemostEntity.rating && jl40.l(this.reasons, callFeedbackTelemostEntity.reasons) && jl40.l(this.comment, callFeedbackTelemostEntity.comment) && jl40.l(this.login, callFeedbackTelemostEntity.login) && jl40.l(this.os, callFeedbackTelemostEntity.os) && jl40.l(this.device, callFeedbackTelemostEntity.device) && jl40.l(this.client, callFeedbackTelemostEntity.client) && jl40.l(this.callGuid, callFeedbackTelemostEntity.callGuid) && jl40.l(this.uuid, callFeedbackTelemostEntity.uuid) && jl40.l(this.deviceId, callFeedbackTelemostEntity.deviceId) && jl40.l(this.email, callFeedbackTelemostEntity.email) && jl40.l(this.callEndReason, callFeedbackTelemostEntity.callEndReason) && jl40.l(this.isInitiator, callFeedbackTelemostEntity.isInitiator) && jl40.l(this.timestamp, callFeedbackTelemostEntity.timestamp) && jl40.l(this.chatId, callFeedbackTelemostEntity.chatId);
    }

    public final String getCallEndReason() {
        return this.callEndReason;
    }

    public final String getCallGuid() {
        return this.callGuid;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getClient() {
        return this.client;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getDevice() {
        return this.device;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final String getLogin() {
        return this.login;
    }

    public final String getMeetingId() {
        return this.meetingId;
    }

    public final String getOrganizationId() {
        return this.organizationId;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final int getRating() {
        return this.rating;
    }

    public final List<String> getReasons() {
        return this.reasons;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final String getUserGuid() {
        return this.userGuid;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        String str = this.meetingId;
        int b = unr0.b(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.userGuid), 31, this.platform);
        String str2 = this.version;
        int e = unr0.e((b + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isUserB2B);
        String str3 = this.organizationId;
        int c = unr0.c(oyr.b(this.rating, (e + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.reasons);
        String str4 = this.comment;
        int hashCode2 = (c + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.login;
        int hashCode3 = (hashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.os;
        int hashCode4 = (hashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.device;
        int b2 = unr0.b((hashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.client);
        String str8 = this.callGuid;
        int hashCode5 = (b2 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.uuid;
        int hashCode6 = (hashCode5 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.deviceId;
        int hashCode7 = (hashCode6 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.email;
        int hashCode8 = (hashCode7 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.callEndReason;
        int hashCode9 = (hashCode8 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool = this.isInitiator;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.timestamp;
        int hashCode11 = (hashCode10 + (l == null ? 0 : l.hashCode())) * 31;
        String str13 = this.chatId;
        return hashCode11 + (str13 != null ? str13.hashCode() : 0);
    }

    public final Boolean isInitiator() {
        return this.isInitiator;
    }

    public final boolean isUserB2B() {
        return this.isUserB2B;
    }

    public String toString() {
        String str = this.eventType;
        String str2 = this.meetingId;
        String str3 = this.userGuid;
        String str4 = this.platform;
        String str5 = this.version;
        boolean z = this.isUserB2B;
        String str6 = this.organizationId;
        int i = this.rating;
        List<String> list = this.reasons;
        String str7 = this.comment;
        String str8 = this.login;
        String str9 = this.os;
        String str10 = this.device;
        String str11 = this.client;
        String str12 = this.callGuid;
        String str13 = this.uuid;
        String str14 = this.deviceId;
        String str15 = this.email;
        String str16 = this.callEndReason;
        Boolean bool = this.isInitiator;
        Long l = this.timestamp;
        String str17 = this.chatId;
        StringBuilder v = b64.v("CallFeedbackTelemostEntity(eventType=", str, ", meetingId=", str2, ", userGuid=");
        g8e.D(v, str3, ", platform=", str4, ", version=");
        tse0.y(str5, ", isUserB2B=", ", organizationId=", v, z);
        b64.A(i, str6, ", rating=", ", reasons=", v);
        oyr.D(", comment=", str7, ", login=", v, list);
        g8e.D(v, str8, ", os=", str9, ", device=");
        g8e.D(v, str10, ", client=", str11, ", callGuid=");
        g8e.D(v, str12, ", uuid=", str13, ", deviceId=");
        g8e.D(v, str14, ", email=", str15, ", callEndReason=");
        tse0.A(v, str16, ", isInitiator=", bool, ", timestamp=");
        v.append(l);
        v.append(", chatId=");
        v.append(str17);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public CallFeedbackTelemostEntity(@Json(name = "event_type") String str, @Json(name = "meeting_id") String str2, @Json(name = "user_guid") String str3, @Json(name = "platform") String str4, @Json(name = "version") String str5, @Json(name = "is_user_b2b") boolean z, @Json(name = "organization_id") String str6, @Json(name = "rating") int i, @Json(name = "reasons") List<String> list, @Json(name = "comment") String str7, @Json(name = "login") String str8, @Json(name = "os") String str9, @Json(name = "device") String str10, @Json(name = "client") String str11, @Json(name = "call_guid") String str12, @Json(name = "uuid") String str13, @Json(name = "device_id") String str14, @Json(name = "email") String str15, @Json(name = "call_end_reason") String str16, @Json(name = "is_initiator") Boolean bool, @Json(name = "timestamp") Long l, @Json(name = "chat_id") String str17) {
        this.eventType = str;
        this.meetingId = str2;
        this.userGuid = str3;
        this.platform = str4;
        this.version = str5;
        this.isUserB2B = z;
        this.organizationId = str6;
        this.rating = i;
        this.reasons = list;
        this.comment = str7;
        this.login = str8;
        this.os = str9;
        this.device = str10;
        this.client = str11;
        this.callGuid = str12;
        this.uuid = str13;
        this.deviceId = str14;
        this.email = str15;
        this.callEndReason = str16;
        this.isInitiator = bool;
        this.timestamp = l;
        this.chatId = str17;
    }
}
