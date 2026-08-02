package com.yandex.passport.internal.link_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJV\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b.\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b/\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b0\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010 R\u001a\u0010\f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b3\u0010\u001b¨\u00064"}, d2 = {"Lcom/yandex/passport/internal/link_auth/QrLink;", "", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", WebViewActivity.KEY_ENVIRONMENT, "", "url", "trackId", "crsfToken", "userCode", "", "userCodeExpiresIn", "codeUrl", "<init>", "(Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()J", "component7", "copy", "(Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lcom/yandex/passport/internal/link_auth/QrLink;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "getEnvironment", "Ljava/lang/String;", "getUrl", "getTrackId", "getCrsfToken", "getUserCode", "J", "getUserCodeExpiresIn", "getCodeUrl", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class QrLink implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<QrLink> CREATOR = new Creator();
    private final String codeUrl;
    private final String crsfToken;
    private final PassportEnvironmentImpl environment;
    private final String trackId;
    private final String url;
    private final String userCode;
    private final long userCodeExpiresIn;

    public QrLink(PassportEnvironmentImpl passportEnvironmentImpl, String str, String str2, String str3, String str4, long j, String str5) {
        this.environment = passportEnvironmentImpl;
        this.url = str;
        this.trackId = str2;
        this.crsfToken = str3;
        this.userCode = str4;
        this.userCodeExpiresIn = j;
        this.codeUrl = str5;
    }

    public static /* synthetic */ QrLink copy$default(QrLink qrLink, PassportEnvironmentImpl passportEnvironmentImpl, String str, String str2, String str3, String str4, long j, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            passportEnvironmentImpl = qrLink.environment;
        }
        if ((i & 2) != 0) {
            str = qrLink.url;
        }
        if ((i & 4) != 0) {
            str2 = qrLink.trackId;
        }
        if ((i & 8) != 0) {
            str3 = qrLink.crsfToken;
        }
        if ((i & 16) != 0) {
            str4 = qrLink.userCode;
        }
        if ((i & 32) != 0) {
            j = qrLink.userCodeExpiresIn;
        }
        if ((i & 64) != 0) {
            str5 = qrLink.codeUrl;
        }
        String str6 = str5;
        long j2 = j;
        String str7 = str4;
        String str8 = str2;
        return qrLink.copy(passportEnvironmentImpl, str, str8, str3, str7, j2, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final PassportEnvironmentImpl getEnvironment() {
        return this.environment;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCrsfToken() {
        return this.crsfToken;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUserCode() {
        return this.userCode;
    }

    /* renamed from: component6, reason: from getter */
    public final long getUserCodeExpiresIn() {
        return this.userCodeExpiresIn;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCodeUrl() {
        return this.codeUrl;
    }

    public final QrLink copy(PassportEnvironmentImpl environment, String url, String trackId, String crsfToken, String userCode, long userCodeExpiresIn, String codeUrl) {
        return new QrLink(environment, url, trackId, crsfToken, userCode, userCodeExpiresIn, codeUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrLink)) {
            return false;
        }
        QrLink qrLink = (QrLink) other;
        return jl40.l(this.environment, qrLink.environment) && jl40.l(this.url, qrLink.url) && jl40.l(this.trackId, qrLink.trackId) && jl40.l(this.crsfToken, qrLink.crsfToken) && jl40.l(this.userCode, qrLink.userCode) && this.userCodeExpiresIn == qrLink.userCodeExpiresIn && jl40.l(this.codeUrl, qrLink.codeUrl);
    }

    public String getCodeUrl() {
        return this.codeUrl;
    }

    public String getCrsfToken() {
        return this.crsfToken;
    }

    public String getTrackId() {
        return this.trackId;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUserCode() {
        return this.userCode;
    }

    public long getUserCodeExpiresIn() {
        return this.userCodeExpiresIn;
    }

    public int hashCode() {
        return this.codeUrl.hashCode() + qv10.c(unr0.b(unr0.b(unr0.b(unr0.b(this.environment.hashCode() * 31, 31, this.url), 31, this.trackId), 31, this.crsfToken), 31, this.userCode), 31, this.userCodeExpiresIn);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("QrLink(environment=");
        sb.append(this.environment);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", trackId=");
        sb.append(this.trackId);
        sb.append(", crsfToken=");
        sb.append(this.crsfToken);
        sb.append(", userCode=");
        sb.append(this.userCode);
        sb.append(", userCodeExpiresIn=");
        sb.append(this.userCodeExpiresIn);
        sb.append(", codeUrl=");
        return b64.p(sb, this.codeUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.environment, flags);
        dest.writeString(this.url);
        dest.writeString(this.trackId);
        dest.writeString(this.crsfToken);
        dest.writeString(this.userCode);
        dest.writeLong(this.userCodeExpiresIn);
        dest.writeString(this.codeUrl);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QrLink> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QrLink createFromParcel(Parcel parcel) {
            return new QrLink((PassportEnvironmentImpl) parcel.readParcelable(QrLink.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QrLink[] newArray(int i) {
            return new QrLink[i];
        }
    }

    /* renamed from: getEnvironment, reason: merged with bridge method [inline-methods] */
    public PassportEnvironmentImpl m305getEnvironment() {
        return this.environment;
    }
}
