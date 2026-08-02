package com.yandex.passport.internal.entities;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.b64;
import defpackage.dac;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.unr0;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00019B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\fJ\r\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u000eJ\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u000eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u000eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u000eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u000eJH\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010\u000eJ\u0010\u0010%\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u000eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u000eR\u0014\u00107\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/yandex/passport/internal/entities/Cookie;", "", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", WebViewActivity.KEY_ENVIRONMENT, "", "sessionId", "sslSessionId", "returnUrl", "cookies", "<init>", "(Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "makeCookies", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "component2", "component3", "component4", "component5", "copy", "(Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/passport/internal/entities/Cookie;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "getEnvironment", "Ljava/lang/String;", "getSessionId", "getSessionId$annotations", "()V", "getSslSessionId", "getSslSessionId$annotations", "getReturnUrl", "getCookies", "Ljava/net/URL;", "get_returnUrl", "()Ljava/net/URL;", "_returnUrl", "Companion", "com/yandex/passport/internal/entities/d", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Cookie implements Parcelable {
    public static final int $stable = 8;
    private static final String KEY_COOKIE = "passport-cookie";
    private final String cookies;
    private final PassportEnvironmentImpl environment;
    private final String returnUrl;
    private final String sessionId;
    private final String sslSessionId;
    public static final d Companion = new d();
    public static final Parcelable.Creator<Cookie> CREATOR = new Creator();

    public /* synthetic */ Cookie(PassportEnvironmentImpl passportEnvironmentImpl, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(passportEnvironmentImpl, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, str3, (i & 16) != 0 ? null : str4);
    }

    public static /* synthetic */ Cookie copy$default(Cookie cookie, PassportEnvironmentImpl passportEnvironmentImpl, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            passportEnvironmentImpl = cookie.environment;
        }
        if ((i & 2) != 0) {
            str = cookie.sessionId;
        }
        if ((i & 4) != 0) {
            str2 = cookie.sslSessionId;
        }
        if ((i & 8) != 0) {
            str3 = cookie.returnUrl;
        }
        if ((i & 16) != 0) {
            str4 = cookie.cookies;
        }
        String str5 = str4;
        String str6 = str2;
        return cookie.copy(passportEnvironmentImpl, str, str6, str3, str5);
    }

    @jxi
    public static /* synthetic */ void getSessionId$annotations() {
    }

    @jxi
    public static /* synthetic */ void getSslSessionId$annotations() {
    }

    private final URL get_returnUrl() {
        return new URL(getReturnUrl());
    }

    /* renamed from: component1, reason: from getter */
    public final PassportEnvironmentImpl getEnvironment() {
        return this.environment;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSslSessionId() {
        return this.sslSessionId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCookies() {
        return this.cookies;
    }

    public final Cookie copy(PassportEnvironmentImpl environment, String sessionId, String sslSessionId, String returnUrl, String cookies) {
        return new Cookie(environment, sessionId, sslSessionId, returnUrl, cookies);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) other;
        return jl40.l(this.environment, cookie.environment) && jl40.l(this.sessionId, cookie.sessionId) && jl40.l(this.sslSessionId, cookie.sslSessionId) && jl40.l(this.returnUrl, cookie.returnUrl) && jl40.l(this.cookies, cookie.cookies);
    }

    public String getCookies() {
        return this.cookies;
    }

    public final String getHost() {
        String host = get_returnUrl().getHost();
        if (host != null) {
            return host;
        }
        dac.f(getReturnUrl(), "No host in return url ");
        return null;
    }

    public String getReturnUrl() {
        return this.returnUrl;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getSslSessionId() {
        return this.sslSessionId;
    }

    public int hashCode() {
        int hashCode = this.environment.hashCode() * 31;
        String str = this.sessionId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sslSessionId;
        int b = unr0.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.returnUrl);
        String str3 = this.cookies;
        return b + (str3 != null ? str3.hashCode() : 0);
    }

    public final String makeCookies() {
        String cookies = getCookies();
        if (cookies != null) {
            return cookies;
        }
        if (getSessionId() == null) {
            return null;
        }
        return "Session_id=" + getSessionId() + "; sessionid2=" + getSslSessionId();
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY_COOKIE, this);
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Cookie(environment=");
        sb.append(this.environment);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", sslSessionId=");
        sb.append(this.sslSessionId);
        sb.append(", returnUrl=");
        sb.append(this.returnUrl);
        sb.append(", cookies=");
        return b64.p(sb, this.cookies, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.environment, flags);
        dest.writeString(this.sessionId);
        dest.writeString(this.sslSessionId);
        dest.writeString(this.returnUrl);
        dest.writeString(this.cookies);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Cookie> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Cookie createFromParcel(Parcel parcel) {
            return new Cookie((PassportEnvironmentImpl) parcel.readParcelable(Cookie.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Cookie[] newArray(int i) {
            return new Cookie[i];
        }
    }

    /* renamed from: getEnvironment, reason: merged with bridge method [inline-methods] */
    public PassportEnvironmentImpl m303getEnvironment() {
        return this.environment;
    }

    public Cookie(PassportEnvironmentImpl passportEnvironmentImpl, String str, String str2, String str3, String str4) {
        this.environment = passportEnvironmentImpl;
        this.sessionId = str;
        this.sslSessionId = str2;
        this.returnUrl = str3;
        this.cookies = str4;
        get_returnUrl();
    }

    public Cookie(PassportEnvironmentImpl passportEnvironmentImpl, String str, String str2) {
        this(passportEnvironmentImpl, str, null, str2, null);
    }
}
