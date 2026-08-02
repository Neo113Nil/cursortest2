package com.ybsdk.feature.redirect.url.internal.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.redirect.url.api.RedirectUrlAuth;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lcom/ybsdk/feature/redirect/url/internal/presentation/RedirectUrlParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", LaunchBrowserActivity.KEY_URI, "Lcom/ybsdk/feature/redirect/url/api/RedirectUrlAuth;", "auth", "Lcom/ybsdk/feature/deeplink/api/Deeplink;", "fallback", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/redirect/url/api/RedirectUrlAuth;Lcom/ybsdk/feature/deeplink/api/Deeplink;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/feature/redirect/url/api/RedirectUrlAuth;", "component3", "()Lcom/ybsdk/feature/deeplink/api/Deeplink;", "copy", "(Ljava/lang/String;Lcom/ybsdk/feature/redirect/url/api/RedirectUrlAuth;Lcom/ybsdk/feature/deeplink/api/Deeplink;)Lcom/ybsdk/feature/redirect/url/internal/presentation/RedirectUrlParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUri", "Lcom/ybsdk/feature/redirect/url/api/RedirectUrlAuth;", "getAuth", "Lcom/ybsdk/feature/deeplink/api/Deeplink;", "getFallback", "feature-redirect-url_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RedirectUrlParams implements ScreenParams {
    public static final Parcelable.Creator<RedirectUrlParams> CREATOR = new Creator();
    private final RedirectUrlAuth auth;
    private final Deeplink fallback;
    private final String uri;

    public RedirectUrlParams(String str, RedirectUrlAuth redirectUrlAuth, Deeplink deeplink) {
        this.uri = str;
        this.auth = redirectUrlAuth;
        this.fallback = deeplink;
    }

    public static /* synthetic */ RedirectUrlParams copy$default(RedirectUrlParams redirectUrlParams, String str, RedirectUrlAuth redirectUrlAuth, Deeplink deeplink, int i, Object obj) {
        if ((i & 1) != 0) {
            str = redirectUrlParams.uri;
        }
        if ((i & 2) != 0) {
            redirectUrlAuth = redirectUrlParams.auth;
        }
        if ((i & 4) != 0) {
            deeplink = redirectUrlParams.fallback;
        }
        return redirectUrlParams.copy(str, redirectUrlAuth, deeplink);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* renamed from: component2, reason: from getter */
    public final RedirectUrlAuth getAuth() {
        return this.auth;
    }

    /* renamed from: component3, reason: from getter */
    public final Deeplink getFallback() {
        return this.fallback;
    }

    public final RedirectUrlParams copy(String uri, RedirectUrlAuth auth, Deeplink fallback) {
        return new RedirectUrlParams(uri, auth, fallback);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedirectUrlParams)) {
            return false;
        }
        RedirectUrlParams redirectUrlParams = (RedirectUrlParams) other;
        return jl40.l(this.uri, redirectUrlParams.uri) && this.auth == redirectUrlParams.auth && jl40.l(this.fallback, redirectUrlParams.fallback);
    }

    public final RedirectUrlAuth getAuth() {
        return this.auth;
    }

    public final Deeplink getFallback() {
        return this.fallback;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int hashCode = (this.auth.hashCode() + (this.uri.hashCode() * 31)) * 31;
        Deeplink deeplink = this.fallback;
        return hashCode + (deeplink == null ? 0 : deeplink.hashCode());
    }

    public String toString() {
        return "RedirectUrlParams(uri=" + this.uri + ", auth=" + this.auth + ", fallback=" + this.fallback + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.uri);
        dest.writeString(this.auth.name());
        dest.writeParcelable(this.fallback, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RedirectUrlParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedirectUrlParams createFromParcel(Parcel parcel) {
            return new RedirectUrlParams(parcel.readString(), RedirectUrlAuth.valueOf(parcel.readString()), (Deeplink) parcel.readParcelable(RedirectUrlParams.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedirectUrlParams[] newArray(int i) {
            return new RedirectUrlParams[i];
        }
    }
}
