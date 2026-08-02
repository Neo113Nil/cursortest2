package com.yandex.passport.internal.push;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.sloth.data.PushType;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.oo31;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.xvz;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020 ¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010(J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010(J\u0010\u0010-\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b/\u0010.J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010(J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010(J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010(J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010(J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010(J\u0012\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u0010(J\u0012\u00108\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b8\u00106J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010(J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010(J\u0012\u0010;\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b;\u00106J\u0012\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b@\u00106J\u0012\u0010A\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bA\u00106J\u0082\u0002\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bD\u0010(J\u0010\u0010E\u001a\u00020 HÖ\u0001¢\u0006\u0004\bE\u0010&J\u001a\u0010H\u001a\u00020\u00102\b\u0010G\u001a\u0004\u0018\u00010FHÖ\u0003¢\u0006\u0004\bH\u0010IR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010L\u001a\u0004\bM\u0010*R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010J\u001a\u0004\bN\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010J\u001a\u0004\bO\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010P\u001a\u0004\bQ\u0010.R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010P\u001a\u0004\bR\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010J\u001a\u0004\bS\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bT\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010J\u001a\u0004\bU\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bV\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010J\u001a\u0004\bW\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010X\u001a\u0004\b\u0011\u00106R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bY\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010X\u001a\u0004\bZ\u00106R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010J\u001a\u0004\b[\u0010(R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010J\u001a\u0004\b\\\u0010(R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010X\u001a\u0004\b]\u00106R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010^\u001a\u0004\b_\u0010=R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010`\u001a\u0004\ba\u0010?R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001a\u0010X\u001a\u0004\bb\u00106R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001b\u0010X\u001a\u0004\bc\u00106¨\u0006d"}, d2 = {"Lcom/yandex/passport/internal/push/PushPayload;", "Landroid/os/Parcelable;", "", "platform", "", "passpAmProto", "pushService", "eventName", "", ClidProvider.TIMESTAMP, "uid", "pushId", "title", "body", "subtitle", "minAmVersion", "", "isSilent", "webviewUrl", "requireWebAuth", "bodyIncludeCode", "trackId", "showCodeInNotification", "expireAt", "Lcom/yandex/passport/sloth/data/PushType;", "pushType", "openInBrowser", "requireWebAuthWithUid", "<init>", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/yandex/passport/sloth/data/PushType;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()F", "component3", "component4", "component5", "()J", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/lang/Boolean;", "component13", "component14", "component15", "component16", "component17", "component18", "()Ljava/lang/Long;", "component19", "()Lcom/yandex/passport/sloth/data/PushType;", "component20", "component21", "copy", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/yandex/passport/sloth/data/PushType;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/yandex/passport/internal/push/PushPayload;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlatform", "F", "getPasspAmProto", "getPushService", "getEventName", "J", "getTimestamp", "getUid", "getPushId", "getTitle", "getBody", "getSubtitle", "getMinAmVersion", "Ljava/lang/Boolean;", "getWebviewUrl", "getRequireWebAuth", "getBodyIncludeCode", "getTrackId", "getShowCodeInNotification", "Ljava/lang/Long;", "getExpireAt", "Lcom/yandex/passport/sloth/data/PushType;", "getPushType", "getOpenInBrowser", "getRequireWebAuthWithUid", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PushPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PushPayload> CREATOR = new Creator();
    private final String body;
    private final String bodyIncludeCode;
    private final String eventName;
    private final Long expireAt;
    private final Boolean isSilent;
    private final String minAmVersion;
    private final Boolean openInBrowser;
    private final float passpAmProto;
    private final String platform;
    private final String pushId;
    private final String pushService;
    private final PushType pushType;
    private final Boolean requireWebAuth;
    private final Boolean requireWebAuthWithUid;
    private final Boolean showCodeInNotification;
    private final String subtitle;
    private final long timestamp;
    private final String title;
    private final String trackId;
    private final long uid;
    private final String webviewUrl;

    public PushPayload(String str, float f, String str2, String str3, long j, long j2, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, Boolean bool2, String str10, String str11, Boolean bool3, Long l, PushType pushType, Boolean bool4, Boolean bool5) {
        this.platform = str;
        this.passpAmProto = f;
        this.pushService = str2;
        this.eventName = str3;
        this.timestamp = j;
        this.uid = j2;
        this.pushId = str4;
        this.title = str5;
        this.body = str6;
        this.subtitle = str7;
        this.minAmVersion = str8;
        this.isSilent = bool;
        this.webviewUrl = str9;
        this.requireWebAuth = bool2;
        this.bodyIncludeCode = str10;
        this.trackId = str11;
        this.showCodeInNotification = bool3;
        this.expireAt = l;
        this.pushType = pushType;
        this.openInBrowser = bool4;
        this.requireWebAuthWithUid = bool5;
    }

    public static /* synthetic */ PushPayload copy$default(PushPayload pushPayload, String str, float f, String str2, String str3, long j, long j2, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, Boolean bool2, String str10, String str11, Boolean bool3, Long l, PushType pushType, Boolean bool4, Boolean bool5, int i, Object obj) {
        Boolean bool6;
        Boolean bool7;
        String str12 = (i & 1) != 0 ? pushPayload.platform : str;
        float f2 = (i & 2) != 0 ? pushPayload.passpAmProto : f;
        String str13 = (i & 4) != 0 ? pushPayload.pushService : str2;
        String str14 = (i & 8) != 0 ? pushPayload.eventName : str3;
        long j3 = (i & 16) != 0 ? pushPayload.timestamp : j;
        long j4 = (i & 32) != 0 ? pushPayload.uid : j2;
        String str15 = (i & 64) != 0 ? pushPayload.pushId : str4;
        String str16 = (i & 128) != 0 ? pushPayload.title : str5;
        String str17 = (i & 256) != 0 ? pushPayload.body : str6;
        String str18 = (i & 512) != 0 ? pushPayload.subtitle : str7;
        String str19 = (i & 1024) != 0 ? pushPayload.minAmVersion : str8;
        Boolean bool8 = (i & 2048) != 0 ? pushPayload.isSilent : bool;
        String str20 = str12;
        String str21 = (i & 4096) != 0 ? pushPayload.webviewUrl : str9;
        Boolean bool9 = (i & 8192) != 0 ? pushPayload.requireWebAuth : bool2;
        String str22 = (i & 16384) != 0 ? pushPayload.bodyIncludeCode : str10;
        String str23 = (i & 32768) != 0 ? pushPayload.trackId : str11;
        Boolean bool10 = (i & 65536) != 0 ? pushPayload.showCodeInNotification : bool3;
        Long l2 = (i & 131072) != 0 ? pushPayload.expireAt : l;
        PushType pushType2 = (i & 262144) != 0 ? pushPayload.pushType : pushType;
        Boolean bool11 = (i & 524288) != 0 ? pushPayload.openInBrowser : bool4;
        if ((i & 1048576) != 0) {
            bool7 = bool11;
            bool6 = pushPayload.requireWebAuthWithUid;
        } else {
            bool6 = bool5;
            bool7 = bool11;
        }
        return pushPayload.copy(str20, f2, str13, str14, j3, j4, str15, str16, str17, str18, str19, bool8, str21, bool9, str22, str23, bool10, l2, pushType2, bool7, bool6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component11, reason: from getter */
    public final String getMinAmVersion() {
        return this.minAmVersion;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getIsSilent() {
        return this.isSilent;
    }

    /* renamed from: component13, reason: from getter */
    public final String getWebviewUrl() {
        return this.webviewUrl;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getRequireWebAuth() {
        return this.requireWebAuth;
    }

    /* renamed from: component15, reason: from getter */
    public final String getBodyIncludeCode() {
        return this.bodyIncludeCode;
    }

    /* renamed from: component16, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    /* renamed from: component17, reason: from getter */
    public final Boolean getShowCodeInNotification() {
        return this.showCodeInNotification;
    }

    /* renamed from: component18, reason: from getter */
    public final Long getExpireAt() {
        return this.expireAt;
    }

    /* renamed from: component19, reason: from getter */
    public final PushType getPushType() {
        return this.pushType;
    }

    /* renamed from: component2, reason: from getter */
    public final float getPasspAmProto() {
        return this.passpAmProto;
    }

    /* renamed from: component20, reason: from getter */
    public final Boolean getOpenInBrowser() {
        return this.openInBrowser;
    }

    /* renamed from: component21, reason: from getter */
    public final Boolean getRequireWebAuthWithUid() {
        return this.requireWebAuthWithUid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPushService() {
        return this.pushService;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component6, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPushId() {
        return this.pushId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final PushPayload copy(String platform, float passpAmProto, String pushService, String eventName, long timestamp, long uid, String pushId, String title, String body, String subtitle, String minAmVersion, Boolean isSilent, String webviewUrl, Boolean requireWebAuth, String bodyIncludeCode, String trackId, Boolean showCodeInNotification, Long expireAt, PushType pushType, Boolean openInBrowser, Boolean requireWebAuthWithUid) {
        return new PushPayload(platform, passpAmProto, pushService, eventName, timestamp, uid, pushId, title, body, subtitle, minAmVersion, isSilent, webviewUrl, requireWebAuth, bodyIncludeCode, trackId, showCodeInNotification, expireAt, pushType, openInBrowser, requireWebAuthWithUid);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushPayload)) {
            return false;
        }
        PushPayload pushPayload = (PushPayload) other;
        return jl40.l(this.platform, pushPayload.platform) && Float.compare(this.passpAmProto, pushPayload.passpAmProto) == 0 && jl40.l(this.pushService, pushPayload.pushService) && jl40.l(this.eventName, pushPayload.eventName) && this.timestamp == pushPayload.timestamp && this.uid == pushPayload.uid && jl40.l(this.pushId, pushPayload.pushId) && jl40.l(this.title, pushPayload.title) && jl40.l(this.body, pushPayload.body) && jl40.l(this.subtitle, pushPayload.subtitle) && jl40.l(this.minAmVersion, pushPayload.minAmVersion) && jl40.l(this.isSilent, pushPayload.isSilent) && jl40.l(this.webviewUrl, pushPayload.webviewUrl) && jl40.l(this.requireWebAuth, pushPayload.requireWebAuth) && jl40.l(this.bodyIncludeCode, pushPayload.bodyIncludeCode) && jl40.l(this.trackId, pushPayload.trackId) && jl40.l(this.showCodeInNotification, pushPayload.showCodeInNotification) && jl40.l(this.expireAt, pushPayload.expireAt) && this.pushType == pushPayload.pushType && jl40.l(this.openInBrowser, pushPayload.openInBrowser) && jl40.l(this.requireWebAuthWithUid, pushPayload.requireWebAuthWithUid);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getBodyIncludeCode() {
        return this.bodyIncludeCode;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final Long getExpireAt() {
        return this.expireAt;
    }

    public final String getMinAmVersion() {
        return this.minAmVersion;
    }

    public final Boolean getOpenInBrowser() {
        return this.openInBrowser;
    }

    public final float getPasspAmProto() {
        return this.passpAmProto;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getPushId() {
        return this.pushId;
    }

    public final String getPushService() {
        return this.pushService;
    }

    public final PushType getPushType() {
        return this.pushType;
    }

    public final Boolean getRequireWebAuth() {
        return this.requireWebAuth;
    }

    public final Boolean getRequireWebAuthWithUid() {
        return this.requireWebAuthWithUid;
    }

    public final Boolean getShowCodeInNotification() {
        return this.showCodeInNotification;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public final long getUid() {
        return this.uid;
    }

    public final String getWebviewUrl() {
        return this.webviewUrl;
    }

    public int hashCode() {
        String str = this.platform;
        int c = g8e.c(this.passpAmProto, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.pushService;
        int hashCode = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.eventName;
        int c2 = qv10.c(qv10.c((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.timestamp), 31, this.uid);
        String str4 = this.pushId;
        int hashCode2 = (c2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int hashCode3 = (hashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.body;
        int hashCode4 = (hashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.subtitle;
        int hashCode5 = (hashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.minAmVersion;
        int hashCode6 = (hashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.isSilent;
        int b = unr0.b((hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.webviewUrl);
        Boolean bool2 = this.requireWebAuth;
        int hashCode7 = (b + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str9 = this.bodyIncludeCode;
        int hashCode8 = (hashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.trackId;
        int hashCode9 = (hashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool3 = this.showCodeInNotification;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l = this.expireAt;
        int hashCode11 = (this.pushType.hashCode() + ((hashCode10 + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        Boolean bool4 = this.openInBrowser;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.requireWebAuthWithUid;
        return hashCode12 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final Boolean isSilent() {
        return this.isSilent;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushPayload(platform=");
        sb.append(this.platform);
        sb.append(", passpAmProto=");
        sb.append(this.passpAmProto);
        sb.append(", pushService=");
        sb.append(this.pushService);
        sb.append(", eventName=");
        sb.append(this.eventName);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", pushId=");
        sb.append(this.pushId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", minAmVersion=");
        sb.append(this.minAmVersion);
        sb.append(", isSilent=");
        sb.append(this.isSilent);
        sb.append(", webviewUrl=");
        sb.append(this.webviewUrl);
        sb.append(", requireWebAuth=");
        sb.append(this.requireWebAuth);
        sb.append(", bodyIncludeCode=");
        sb.append(this.bodyIncludeCode);
        sb.append(", trackId=");
        sb.append(this.trackId);
        sb.append(", showCodeInNotification=");
        sb.append(this.showCodeInNotification);
        sb.append(", expireAt=");
        sb.append(this.expireAt);
        sb.append(", pushType=");
        sb.append(this.pushType);
        sb.append(", openInBrowser=");
        sb.append(this.openInBrowser);
        sb.append(", requireWebAuthWithUid=");
        return oo31.i(sb, this.requireWebAuthWithUid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.platform);
        dest.writeFloat(this.passpAmProto);
        dest.writeString(this.pushService);
        dest.writeString(this.eventName);
        dest.writeLong(this.timestamp);
        dest.writeLong(this.uid);
        dest.writeString(this.pushId);
        dest.writeString(this.title);
        dest.writeString(this.body);
        dest.writeString(this.subtitle);
        dest.writeString(this.minAmVersion);
        Boolean bool = this.isSilent;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
        dest.writeString(this.webviewUrl);
        Boolean bool2 = this.requireWebAuth;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool2);
        }
        dest.writeString(this.bodyIncludeCode);
        dest.writeString(this.trackId);
        Boolean bool3 = this.showCodeInNotification;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool3);
        }
        Long l = this.expireAt;
        if (l == null) {
            dest.writeInt(0);
        } else {
            xvz.z(dest, 1, l);
        }
        dest.writeString(this.pushType.name());
        Boolean bool4 = this.openInBrowser;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool4);
        }
        Boolean bool5 = this.requireWebAuthWithUid;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool5);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PushPayload> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final PushPayload createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean bool;
            Boolean valueOf3;
            Boolean valueOf4;
            Long l;
            Boolean valueOf5;
            PushType pushType;
            Boolean bool2;
            Boolean bool3;
            String readString = parcel.readString();
            float readFloat = parcel.readFloat();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString9 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
                bool = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                bool = null;
            }
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf3 = bool;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object valueOf6 = parcel.readInt() == 0 ? bool : Long.valueOf(parcel.readLong());
            PushType valueOf7 = PushType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf4 = bool;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                Object obj = valueOf6;
                valueOf5 = bool;
                l = obj;
                bool2 = valueOf2;
                bool3 = valueOf3;
                pushType = valueOf7;
            } else {
                l = valueOf6;
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
                pushType = valueOf7;
                bool2 = valueOf2;
                bool3 = valueOf3;
            }
            return new PushPayload(readString, readFloat, readString2, readString3, readLong, readLong2, readString4, readString5, readString6, readString7, readString8, valueOf, readString9, bool2, readString10, readString11, bool3, l, pushType, valueOf4, valueOf5);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PushPayload[] newArray(int i) {
            return new PushPayload[i];
        }
    }
}
