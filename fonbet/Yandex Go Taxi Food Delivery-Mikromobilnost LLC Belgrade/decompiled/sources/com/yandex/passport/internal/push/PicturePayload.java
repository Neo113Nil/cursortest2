package com.yandex.passport.internal.push;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.vfc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\f¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010'J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010'J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010%J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010%J\u0012\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u0010'J\u0012\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b2\u0010'J\u0012\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b3\u0010'J\u0012\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b4\u0010'J\u0012\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b5\u0010'J\u0010\u00106\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u0010%J\u0010\u00109\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b9\u0010#J\u0010\u0010:\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b:\u0010'Jæ\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b=\u0010'J\u0010\u0010>\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b>\u0010#J\u001a\u0010A\u001a\u00020\u00152\b\u0010@\u001a\u0004\u0018\u00010?HÖ\u0003¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010'R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010E\u001a\u0004\bG\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bH\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bI\u0010'R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bJ\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bK\u0010'R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bM\u0010.R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bN\u0010%R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bO\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bP\u0010'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bQ\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bR\u0010'R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bS\u0010'R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bT\u0010'R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010U\u001a\u0004\b\u0016\u00107R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\bV\u0010%R\u0017\u0010\u0018\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010W\u001a\u0004\bX\u0010#R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010E\u001a\u0004\bY\u0010'¨\u0006Z"}, d2 = {"Lcom/yandex/passport/internal/push/PicturePayload;", "Landroid/os/Parcelable;", "", "uid", "", "trackId", "pushId", "platform", "eventName", "pushService", "title", "", "", "pictures", "expireAt", "timeToLive", "country", "city", ClidProvider.APPLICATION, "operatingSystem", "userIp", "", "isSilent", ClidProvider.TIMESTAMP, "notificationId", "webviewUrl", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Z", "component17", "component18", "component19", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;)Lcom/yandex/passport/internal/push/PicturePayload;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getUid", "Ljava/lang/String;", "getTrackId", "getPushId", "getPlatform", "getEventName", "getPushService", "getTitle", "Ljava/util/List;", "getPictures", "getExpireAt", "getTimeToLive", "getCountry", "getCity", "getApplication", "getOperatingSystem", "getUserIp", "Z", "getTimestamp", CA20Status.STATUS_USER_I, "getNotificationId", "getWebviewUrl", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PicturePayload implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PicturePayload> CREATOR = new Creator();
    private final String application;
    private final String city;
    private final String country;
    private final String eventName;
    private final long expireAt;
    private final boolean isSilent;
    private final int notificationId;
    private final String operatingSystem;
    private final List<Integer> pictures;
    private final String platform;
    private final String pushId;
    private final String pushService;
    private final long timeToLive;
    private final long timestamp;
    private final String title;
    private final String trackId;
    private final long uid;
    private final String userIp;
    private final String webviewUrl;

    public PicturePayload(long j, String str, String str2, String str3, String str4, String str5, String str6, List<Integer> list, long j2, long j3, String str7, String str8, String str9, String str10, String str11, boolean z, long j4, int i, String str12) {
        this.uid = j;
        this.trackId = str;
        this.pushId = str2;
        this.platform = str3;
        this.eventName = str4;
        this.pushService = str5;
        this.title = str6;
        this.pictures = list;
        this.expireAt = j2;
        this.timeToLive = j3;
        this.country = str7;
        this.city = str8;
        this.application = str9;
        this.operatingSystem = str10;
        this.userIp = str11;
        this.isSilent = z;
        this.timestamp = j4;
        this.notificationId = i;
        this.webviewUrl = str12;
    }

    public static /* synthetic */ PicturePayload copy$default(PicturePayload picturePayload, long j, String str, String str2, String str3, String str4, String str5, String str6, List list, long j2, long j3, String str7, String str8, String str9, String str10, String str11, boolean z, long j4, int i, String str12, int i2, Object obj) {
        long j5 = (i2 & 1) != 0 ? picturePayload.uid : j;
        String str13 = (i2 & 2) != 0 ? picturePayload.trackId : str;
        String str14 = (i2 & 4) != 0 ? picturePayload.pushId : str2;
        String str15 = (i2 & 8) != 0 ? picturePayload.platform : str3;
        String str16 = (i2 & 16) != 0 ? picturePayload.eventName : str4;
        String str17 = (i2 & 32) != 0 ? picturePayload.pushService : str5;
        String str18 = (i2 & 64) != 0 ? picturePayload.title : str6;
        List list2 = (i2 & 128) != 0 ? picturePayload.pictures : list;
        long j6 = (i2 & 256) != 0 ? picturePayload.expireAt : j2;
        long j7 = (i2 & 512) != 0 ? picturePayload.timeToLive : j3;
        String str19 = (i2 & 1024) != 0 ? picturePayload.country : str7;
        long j8 = j5;
        String str20 = (i2 & 2048) != 0 ? picturePayload.city : str8;
        return picturePayload.copy(j8, str13, str14, str15, str16, str17, str18, list2, j6, j7, str19, str20, (i2 & 4096) != 0 ? picturePayload.application : str9, (i2 & 8192) != 0 ? picturePayload.operatingSystem : str10, (i2 & 16384) != 0 ? picturePayload.userIp : str11, (i2 & 32768) != 0 ? picturePayload.isSilent : z, (i2 & 65536) != 0 ? picturePayload.timestamp : j4, (i2 & 131072) != 0 ? picturePayload.notificationId : i, (i2 & 262144) != 0 ? picturePayload.webviewUrl : str12);
    }

    /* renamed from: component1, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* renamed from: component10, reason: from getter */
    public final long getTimeToLive() {
        return this.timeToLive;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: component12, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: component13, reason: from getter */
    public final String getApplication() {
        return this.application;
    }

    /* renamed from: component14, reason: from getter */
    public final String getOperatingSystem() {
        return this.operatingSystem;
    }

    /* renamed from: component15, reason: from getter */
    public final String getUserIp() {
        return this.userIp;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsSilent() {
        return this.isSilent;
    }

    /* renamed from: component17, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component18, reason: from getter */
    public final int getNotificationId() {
        return this.notificationId;
    }

    /* renamed from: component19, reason: from getter */
    public final String getWebviewUrl() {
        return this.webviewUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPushId() {
        return this.pushId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPushService() {
        return this.pushService;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<Integer> component8() {
        return this.pictures;
    }

    /* renamed from: component9, reason: from getter */
    public final long getExpireAt() {
        return this.expireAt;
    }

    public final PicturePayload copy(long uid, String trackId, String pushId, String platform, String eventName, String pushService, String title, List<Integer> pictures, long expireAt, long timeToLive, String country, String city, String application, String operatingSystem, String userIp, boolean isSilent, long timestamp, int notificationId, String webviewUrl) {
        return new PicturePayload(uid, trackId, pushId, platform, eventName, pushService, title, pictures, expireAt, timeToLive, country, city, application, operatingSystem, userIp, isSilent, timestamp, notificationId, webviewUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicturePayload)) {
            return false;
        }
        PicturePayload picturePayload = (PicturePayload) other;
        return this.uid == picturePayload.uid && jl40.l(this.trackId, picturePayload.trackId) && jl40.l(this.pushId, picturePayload.pushId) && jl40.l(this.platform, picturePayload.platform) && jl40.l(this.eventName, picturePayload.eventName) && jl40.l(this.pushService, picturePayload.pushService) && jl40.l(this.title, picturePayload.title) && jl40.l(this.pictures, picturePayload.pictures) && this.expireAt == picturePayload.expireAt && this.timeToLive == picturePayload.timeToLive && jl40.l(this.country, picturePayload.country) && jl40.l(this.city, picturePayload.city) && jl40.l(this.application, picturePayload.application) && jl40.l(this.operatingSystem, picturePayload.operatingSystem) && jl40.l(this.userIp, picturePayload.userIp) && this.isSilent == picturePayload.isSilent && this.timestamp == picturePayload.timestamp && this.notificationId == picturePayload.notificationId && jl40.l(this.webviewUrl, picturePayload.webviewUrl);
    }

    public final String getApplication() {
        return this.application;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final long getExpireAt() {
        return this.expireAt;
    }

    public final int getNotificationId() {
        return this.notificationId;
    }

    public final String getOperatingSystem() {
        return this.operatingSystem;
    }

    public final List<Integer> getPictures() {
        return this.pictures;
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

    public final long getTimeToLive() {
        return this.timeToLive;
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

    public final String getUserIp() {
        return this.userIp;
    }

    public final String getWebviewUrl() {
        return this.webviewUrl;
    }

    public int hashCode() {
        int b = unr0.b(Long.hashCode(this.uid) * 31, 31, this.trackId);
        String str = this.pushId;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.platform;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.eventName;
        int b2 = unr0.b((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.pushService);
        String str4 = this.title;
        int c = qv10.c(qv10.c(unr0.c((b2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.pictures), 31, this.expireAt), 31, this.timeToLive);
        String str5 = this.country;
        int hashCode3 = (c + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.city;
        int hashCode4 = (hashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.application;
        int hashCode5 = (hashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.operatingSystem;
        int hashCode6 = (hashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.userIp;
        return this.webviewUrl.hashCode() + oyr.b(this.notificationId, qv10.c(unr0.e((hashCode6 + (str9 != null ? str9.hashCode() : 0)) * 31, 31, this.isSilent), 31, this.timestamp), 31);
    }

    public final boolean isSilent() {
        return this.isSilent;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PicturePayload(uid=");
        sb.append(this.uid);
        sb.append(", trackId=");
        sb.append(this.trackId);
        sb.append(", pushId=");
        sb.append(this.pushId);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", eventName=");
        sb.append(this.eventName);
        sb.append(", pushService=");
        sb.append(this.pushService);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", pictures=");
        sb.append(this.pictures);
        sb.append(", expireAt=");
        sb.append(this.expireAt);
        sb.append(", timeToLive=");
        sb.append(this.timeToLive);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", application=");
        sb.append(this.application);
        sb.append(", operatingSystem=");
        sb.append(this.operatingSystem);
        sb.append(", userIp=");
        sb.append(this.userIp);
        sb.append(", isSilent=");
        sb.append(this.isSilent);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", notificationId=");
        sb.append(this.notificationId);
        sb.append(", webviewUrl=");
        return b64.p(sb, this.webviewUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.uid);
        dest.writeString(this.trackId);
        dest.writeString(this.pushId);
        dest.writeString(this.platform);
        dest.writeString(this.eventName);
        dest.writeString(this.pushService);
        dest.writeString(this.title);
        Iterator t = vfc.t(dest, this.pictures);
        while (t.hasNext()) {
            dest.writeInt(((Number) t.next()).intValue());
        }
        dest.writeLong(this.expireAt);
        dest.writeLong(this.timeToLive);
        dest.writeString(this.country);
        dest.writeString(this.city);
        dest.writeString(this.application);
        dest.writeString(this.operatingSystem);
        dest.writeString(this.userIp);
        dest.writeInt(this.isSilent ? 1 : 0);
        dest.writeLong(this.timestamp);
        dest.writeInt(this.notificationId);
        dest.writeString(this.webviewUrl);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PicturePayload> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PicturePayload createFromParcel(Parcel parcel) {
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new PicturePayload(readLong, readString, readString2, readString3, readString4, readString5, readString6, arrayList, parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readLong(), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PicturePayload[] newArray(int i) {
            return new PicturePayload[i];
        }
    }
}
